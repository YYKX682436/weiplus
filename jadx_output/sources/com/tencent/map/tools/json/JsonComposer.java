package com.tencent.map.tools.json;

/* loaded from: classes13.dex */
public abstract class JsonComposer implements com.tencent.map.tools.json.JsonEncoder, com.tencent.map.tools.json.JsonParser {
    private static java.util.Map<java.lang.Class, java.util.Map<java.lang.reflect.Field, java.lang.String>> sClassJsonMap = new java.util.concurrent.ConcurrentHashMap();
    private java.lang.String mFieldNamePrefix;
    private java.util.Map<java.lang.reflect.Field, java.lang.String> mJsonFields;
    private com.tencent.map.tools.json.FieldNameStyle mFieldNameStyle = com.tencent.map.tools.json.FieldNameStyle.HUMP;
    private boolean mAllowEmpty = true;
    private java.util.Map<java.lang.reflect.Field, com.tencent.map.tools.json.JsonParser.Deserializer> mFieldDeserializer = new java.util.HashMap();
    private java.util.Map<java.lang.Class, com.tencent.map.tools.json.JsonParser.Deserializer> mClassDeserializer = new java.util.HashMap();

    private synchronized void checkJsonComposerElements() {
        java.util.Collection<java.lang.reflect.Field> collection;
        java.lang.Class<? extends com.tencent.map.tools.json.JsonParser.Deserializer> deserializer;
        com.tencent.map.tools.json.annotation.JsonType jsonType = (com.tencent.map.tools.json.annotation.JsonType) getClass().getAnnotation(com.tencent.map.tools.json.annotation.JsonType.class);
        if (jsonType != null) {
            this.mAllowEmpty = jsonType.allowEmpty();
            this.mFieldNameStyle = jsonType.fieldNameStyle();
            this.mFieldNamePrefix = jsonType.fieldNamePrefix();
            java.lang.Class<? extends com.tencent.map.tools.json.JsonParser.Deserializer> deserializer2 = jsonType.deserializer();
            if (deserializer2 != com.tencent.map.tools.json.JsonParser.Deserializer.class) {
                this.mClassDeserializer.put(getClass(), (com.tencent.map.tools.json.JsonParser.Deserializer) com.tencent.map.tools.Util.newInstance(deserializer2, new java.lang.Object[0]));
            }
        }
        this.mJsonFields = sClassJsonMap.get(getClass());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Map<java.lang.reflect.Field, java.lang.String> map = this.mJsonFields;
        if (map == null) {
            this.mJsonFields = new java.util.concurrent.ConcurrentHashMap();
            for (java.lang.Class<?> cls = getClass(); cls != com.tencent.map.tools.json.JsonComposer.class; cls = cls.getSuperclass()) {
                arrayList.addAll(java.util.Arrays.asList(cls.getDeclaredFields()));
            }
            sClassJsonMap.put(getClass(), this.mJsonFields);
            collection = arrayList;
        } else {
            collection = map.keySet();
        }
        for (java.lang.reflect.Field field : collection) {
            if (!java.lang.reflect.Modifier.isStatic(field.getModifiers()) && !java.lang.reflect.Modifier.isTransient(field.getModifiers()) && !java.lang.reflect.Modifier.isFinal(field.getModifiers())) {
                com.tencent.map.tools.json.annotation.JsonType jsonType2 = (com.tencent.map.tools.json.annotation.JsonType) field.getType().getAnnotation(com.tencent.map.tools.json.annotation.JsonType.class);
                if (jsonType2 != null && (deserializer = jsonType2.deserializer()) != com.tencent.map.tools.json.JsonParser.Deserializer.class) {
                    this.mFieldDeserializer.put(field, (com.tencent.map.tools.json.JsonParser.Deserializer) com.tencent.map.tools.Util.newInstance(deserializer, new java.lang.Object[0]));
                }
                com.tencent.map.tools.json.annotation.Json json = (com.tencent.map.tools.json.annotation.Json) field.getAnnotation(com.tencent.map.tools.json.annotation.Json.class);
                if (json != null) {
                    if (!json.ignore()) {
                        if (android.text.TextUtils.isEmpty(json.name())) {
                            this.mJsonFields.put(field, translateFieldName(field.getName()));
                        } else {
                            this.mJsonFields.put(field, json.name());
                        }
                    }
                    java.lang.Class<? extends com.tencent.map.tools.json.JsonParser.Deserializer> deserializer3 = json.deserializer();
                    if (deserializer3 != com.tencent.map.tools.json.JsonParser.Deserializer.class) {
                        this.mFieldDeserializer.put(field, (com.tencent.map.tools.json.JsonParser.Deserializer) com.tencent.map.tools.Util.newInstance(deserializer3, new java.lang.Object[0]));
                    }
                } else if (!field.getName().contains("this")) {
                    this.mJsonFields.put(field, translateFieldName(field.getName()));
                }
            }
        }
    }

    private java.lang.String pickString(java.lang.String str) {
        while (!android.text.TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf("<");
            int lastIndexOf = str.lastIndexOf(">");
            if (indexOf < 0) {
                indexOf = 0;
            }
            if (lastIndexOf < 0) {
                lastIndexOf = str.length();
            }
            if (lastIndexOf > indexOf) {
                str = str.substring(indexOf + 1, lastIndexOf);
                if (str.contains("<") && str.contains(">")) {
                }
            }
            return str;
        }
        return str;
    }

    private java.lang.String translateFieldName(java.lang.String str) {
        java.lang.String str2 = this.mFieldNamePrefix;
        if (str2 != null && str.startsWith(str2)) {
            java.lang.String substring = str.substring(this.mFieldNamePrefix.length(), this.mFieldNamePrefix.length() + 1);
            str = substring.toLowerCase() + str.substring(this.mFieldNamePrefix.length() + 1);
        }
        if (this.mFieldNameStyle != com.tencent.map.tools.json.FieldNameStyle.UNDERLINE) {
            return str;
        }
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("[A-Z]").matcher(str);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, "_" + matcher.group(0).toLowerCase());
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public java.lang.Object getFieldValueByJsonName(java.lang.String str) {
        java.util.Map<java.lang.reflect.Field, java.lang.String> map = this.mJsonFields;
        if (map == null) {
            return null;
        }
        for (java.util.Map.Entry<java.lang.reflect.Field, java.lang.String> entry : map.entrySet()) {
            if (entry.getValue().equals(str)) {
                return entry.getKey().get(this);
            }
        }
        return null;
    }

    public boolean onEachItemParse(java.lang.String str, java.lang.Object obj) {
        return false;
    }

    public boolean onEachItemToJson(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Object obj) {
        return false;
    }

    @Override // com.tencent.map.tools.json.JsonParser
    public void parse(org.json.JSONObject jSONObject) {
        java.lang.Class findClass;
        checkJsonComposerElements();
        com.tencent.map.tools.json.JsonParser.Deserializer deserializer = this.mClassDeserializer.get(getClass());
        if (deserializer != null) {
            try {
                deserializer.deserialize(this, getClass().getName(), jSONObject);
                return;
            } catch (org.json.JSONException unused) {
            }
        }
        for (java.util.Map.Entry<java.lang.reflect.Field, java.lang.String> entry : this.mJsonFields.entrySet()) {
            java.lang.reflect.Field key = entry.getKey();
            key.setAccessible(true);
            java.lang.Class<?> type = key.getType();
            java.lang.Object opt = jSONObject.opt(entry.getValue());
            com.tencent.map.tools.json.JsonParser.Deserializer deserializer2 = this.mFieldDeserializer.get(key);
            if (deserializer2 != null) {
                try {
                    key.set(this, deserializer2.deserialize(this, entry.getValue(), opt));
                } catch (java.lang.Exception unused2) {
                }
            }
            if (!onEachItemParse(entry.getValue(), opt)) {
                if (opt instanceof org.json.JSONArray) {
                    java.lang.reflect.Type genericType = key.getGenericType();
                    if (genericType instanceof java.lang.reflect.ParameterizedType) {
                        java.lang.String pickString = pickString(genericType.toString());
                        try {
                            if (!android.text.TextUtils.isEmpty(pickString) && (findClass = com.tencent.map.tools.Util.findClass(pickString, getClass().getClassLoader())) != null) {
                                key.set(this, java.util.Set.class.isAssignableFrom(key.getType()) ? com.tencent.map.tools.json.JsonUtils.parseTo(java.util.HashSet.class, (org.json.JSONArray) opt, findClass, new java.lang.Object[0]) : java.util.List.class.isAssignableFrom(key.getType()) ? com.tencent.map.tools.json.JsonUtils.parseTo(java.util.ArrayList.class, (org.json.JSONArray) opt, findClass, new java.lang.Object[0]) : null);
                            }
                        } catch (java.lang.IllegalAccessException | java.lang.NumberFormatException | java.lang.Exception unused3) {
                        }
                    } else {
                        java.lang.Class cls = (java.lang.Class) genericType;
                        if (cls.isArray()) {
                            key.set(this, com.tencent.map.tools.json.JsonUtils.parseToArray((org.json.JSONArray) opt, cls.getComponentType()));
                        }
                    }
                } else if (opt instanceof org.json.JSONObject) {
                    key.set(this, com.tencent.map.tools.json.JsonUtils.parseToModel((org.json.JSONObject) opt, key.getType(), new java.lang.Object[0]));
                } else if (type == java.lang.String.class) {
                    key.set(this, java.lang.String.valueOf(opt));
                } else if (type == java.lang.Boolean.TYPE) {
                    if (opt instanceof java.lang.Boolean) {
                        key.setBoolean(this, ((java.lang.Boolean) opt).booleanValue());
                    } else if (opt instanceof java.lang.String) {
                        if (opt.equals("false")) {
                            key.setBoolean(this, false);
                        } else if (opt.equals("true")) {
                            key.setBoolean(this, true);
                        }
                    }
                } else if (type == java.lang.Byte.TYPE) {
                    if (opt instanceof java.lang.Byte) {
                        key.setByte(this, ((java.lang.Byte) opt).byteValue());
                    } else if (opt instanceof java.lang.Number) {
                        key.setByte(this, ((java.lang.Number) opt).byteValue());
                    }
                } else if (type == java.lang.Character.TYPE) {
                    if (opt instanceof java.lang.Character) {
                        key.setChar(this, ((java.lang.Character) opt).charValue());
                    } else if (opt instanceof java.lang.Integer) {
                        if (java.lang.Character.isLetter(((java.lang.Integer) opt).intValue())) {
                            key.setChar(this, java.lang.Character.toChars(((java.lang.Integer) opt).intValue())[0]);
                        } else if (10 > ((java.lang.Integer) opt).intValue() && ((java.lang.Integer) opt).intValue() >= 0) {
                            key.setChar(this, java.lang.Character.forDigit(((java.lang.Integer) opt).intValue(), 10));
                        }
                    }
                } else if (type == java.lang.Double.TYPE) {
                    if (opt instanceof java.lang.Number) {
                        key.setDouble(this, ((java.lang.Number) opt).doubleValue());
                    } else if (opt instanceof java.lang.String) {
                        key.setDouble(this, java.lang.Double.parseDouble((java.lang.String) opt));
                    }
                } else if (type == java.lang.Float.TYPE) {
                    if (opt instanceof java.lang.Number) {
                        key.setFloat(this, ((java.lang.Number) opt).floatValue());
                    } else if (opt instanceof java.lang.String) {
                        key.setFloat(this, java.lang.Float.parseFloat((java.lang.String) opt));
                    }
                } else if (type == java.lang.Integer.TYPE) {
                    if (opt instanceof java.lang.Number) {
                        key.setInt(this, ((java.lang.Number) opt).intValue());
                    } else if (opt instanceof java.lang.String) {
                        key.setInt(this, java.lang.Integer.parseInt((java.lang.String) opt));
                    }
                } else if (type == java.lang.Long.TYPE) {
                    if (opt instanceof java.lang.Number) {
                        key.setLong(this, ((java.lang.Number) opt).longValue());
                    } else if (opt instanceof java.lang.String) {
                        key.setLong(this, java.lang.Long.parseLong((java.lang.String) opt));
                    }
                } else if (type == java.lang.Short.TYPE) {
                    if (opt instanceof java.lang.Number) {
                        key.setShort(this, ((java.lang.Number) opt).shortValue());
                    } else if (opt instanceof java.lang.String) {
                        key.setShort(this, java.lang.Short.parseShort((java.lang.String) opt));
                    }
                } else if (opt != null) {
                    key.set(this, opt);
                }
            }
        }
    }

    @Override // com.tencent.map.tools.json.JsonEncoder
    public org.json.JSONObject toJson() {
        java.lang.Object obj;
        checkJsonComposerElements();
        java.util.Set<java.util.Map.Entry<java.lang.reflect.Field, java.lang.String>> entrySet = this.mJsonFields.entrySet();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry<java.lang.reflect.Field, java.lang.String> entry : entrySet) {
            java.lang.reflect.Field key = entry.getKey();
            key.setAccessible(true);
            java.lang.Class<?> type = key.getType();
            org.json.JSONArray jSONArray = null;
            try {
                obj = key.get(this);
            } catch (java.lang.IllegalAccessException unused) {
                obj = null;
            }
            if (!onEachItemToJson(jSONObject, entry.getValue(), obj)) {
                if (java.util.Collection.class.isAssignableFrom(type)) {
                    try {
                        java.util.Collection collection = (java.util.Collection) key.get(this);
                        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                        if (collection != null && !collection.isEmpty()) {
                            for (java.lang.Object obj2 : collection) {
                                if (obj2 instanceof com.tencent.map.tools.json.JsonEncoder) {
                                    jSONArray2.put(com.tencent.map.tools.json.JsonUtils.modelToJson(obj2));
                                }
                            }
                        }
                        java.lang.String value = entry.getValue();
                        if (this.mAllowEmpty || (collection != null && !collection.isEmpty())) {
                            jSONArray = jSONArray2;
                        }
                        jSONObject.put(value, jSONArray);
                    } catch (java.lang.IllegalAccessException | org.json.JSONException unused2) {
                    }
                } else {
                    java.lang.Object obj3 = key.get(this);
                    if (obj3 instanceof java.lang.Double) {
                        jSONObject.put(entry.getValue(), ((java.lang.Double) obj3).doubleValue());
                    } else if (obj3 instanceof java.lang.Long) {
                        jSONObject.put(entry.getValue(), ((java.lang.Long) obj3).longValue());
                    } else if (obj3 instanceof java.lang.Integer) {
                        jSONObject.put(entry.getValue(), ((java.lang.Integer) obj3).intValue());
                    } else if (obj3 instanceof java.lang.Boolean) {
                        jSONObject.put(entry.getValue(), ((java.lang.Boolean) obj3).booleanValue());
                    } else if (obj3 instanceof com.tencent.map.tools.json.JsonEncoder) {
                        jSONObject.put(entry.getValue(), com.tencent.map.tools.json.JsonUtils.modelToJson(obj3));
                    } else if (obj3 == null || !obj3.getClass().isArray()) {
                        java.lang.String value2 = entry.getValue();
                        if (obj3 == null && this.mAllowEmpty) {
                            obj3 = new org.json.JSONObject();
                        }
                        jSONObject.put(value2, obj3);
                    } else {
                        jSONObject.put(entry.getValue(), new org.json.JSONArray(obj3));
                    }
                }
            }
        }
        return jSONObject;
    }
}
