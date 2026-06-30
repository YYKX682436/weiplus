package com.p314xaae8f345.map.p511x696c9db.p512x31ece8;

/* renamed from: com.tencent.map.tools.json.JsonComposer */
/* loaded from: classes13.dex */
public abstract class AbstractC4317x9d76fe48 implements com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4318xb6f102f4, com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347 {

    /* renamed from: sClassJsonMap */
    private static java.util.Map<java.lang.Class, java.util.Map<java.lang.reflect.Field, java.lang.String>> f16916xe2a84ecf = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: mFieldNamePrefix */
    private java.lang.String f16920x809016a;

    /* renamed from: mJsonFields */
    private java.util.Map<java.lang.reflect.Field, java.lang.String> f16922xe053020e;

    /* renamed from: mFieldNameStyle */
    private com.p314xaae8f345.map.p511x696c9db.p512x31ece8.EnumC4316x9cf9562c f16921xdf6593d9 = com.p314xaae8f345.map.p511x696c9db.p512x31ece8.EnumC4316x9cf9562c.HUMP;

    /* renamed from: mAllowEmpty */
    private boolean f16917x8ac78fd1 = true;

    /* renamed from: mFieldDeserializer */
    private java.util.Map<java.lang.reflect.Field, com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer> f16919xd37a6a00 = new java.util.HashMap();

    /* renamed from: mClassDeserializer */
    private java.util.Map<java.lang.Class, com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer> f16918x4582a57e = new java.util.HashMap();

    /* renamed from: checkJsonComposerElements */
    private synchronized void m35861x72ba6c67() {
        java.util.Collection<java.lang.reflect.Field> collection;
        java.lang.Class<? extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer> m35887x9bfa94d3;
        com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4322x8e23a062 interfaceC4322x8e23a062 = (com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4322x8e23a062) getClass().getAnnotation(com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4322x8e23a062.class);
        if (interfaceC4322x8e23a062 != null) {
            this.f16917x8ac78fd1 = interfaceC4322x8e23a062.m35886xae959784();
            this.f16921xdf6593d9 = interfaceC4322x8e23a062.m35889xd8b28a0c();
            this.f16920x809016a = interfaceC4322x8e23a062.m35888x385ad197();
            java.lang.Class<? extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer> m35887x9bfa94d32 = interfaceC4322x8e23a062.m35887x9bfa94d3();
            if (m35887x9bfa94d32 != com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer.class) {
                this.f16918x4582a57e.put(getClass(), (com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer) com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35851x6bff0255(m35887x9bfa94d32, new java.lang.Object[0]));
            }
        }
        this.f16922xe053020e = f16916xe2a84ecf.get(getClass());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Map<java.lang.reflect.Field, java.lang.String> map = this.f16922xe053020e;
        if (map == null) {
            this.f16922xe053020e = new java.util.concurrent.ConcurrentHashMap();
            for (java.lang.Class<?> cls = getClass(); cls != com.p314xaae8f345.map.p511x696c9db.p512x31ece8.AbstractC4317x9d76fe48.class; cls = cls.getSuperclass()) {
                arrayList.addAll(java.util.Arrays.asList(cls.getDeclaredFields()));
            }
            f16916xe2a84ecf.put(getClass(), this.f16922xe053020e);
            collection = arrayList;
        } else {
            collection = map.keySet();
        }
        for (java.lang.reflect.Field field : collection) {
            if (!java.lang.reflect.Modifier.isStatic(field.getModifiers()) && !java.lang.reflect.Modifier.isTransient(field.getModifiers()) && !java.lang.reflect.Modifier.isFinal(field.getModifiers())) {
                com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4322x8e23a062 interfaceC4322x8e23a0622 = (com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4322x8e23a062) field.getType().getAnnotation(com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4322x8e23a062.class);
                if (interfaceC4322x8e23a0622 != null && (m35887x9bfa94d3 = interfaceC4322x8e23a0622.m35887x9bfa94d3()) != com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer.class) {
                    this.f16919xd37a6a00.put(field, (com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer) com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35851x6bff0255(m35887x9bfa94d3, new java.lang.Object[0]));
                }
                com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108 interfaceC4321x236108 = (com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108) field.getAnnotation(com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108.class);
                if (interfaceC4321x236108 != null) {
                    if (!interfaceC4321x236108.m35884xb90bfdd2()) {
                        if (android.text.TextUtils.isEmpty(interfaceC4321x236108.m35885x337a8b())) {
                            this.f16922xe053020e.put(field, m35863xadf748f7(field.getName()));
                        } else {
                            this.f16922xe053020e.put(field, interfaceC4321x236108.m35885x337a8b());
                        }
                    }
                    java.lang.Class<? extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer> m35883x9bfa94d3 = interfaceC4321x236108.m35883x9bfa94d3();
                    if (m35883x9bfa94d3 != com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer.class) {
                        this.f16919xd37a6a00.put(field, (com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer) com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35851x6bff0255(m35883x9bfa94d3, new java.lang.Object[0]));
                    }
                } else if (!field.getName().contains("this")) {
                    this.f16922xe053020e.put(field, m35863xadf748f7(field.getName()));
                }
            }
        }
    }

    /* renamed from: pickString */
    private java.lang.String m35862x8cbc6f92(java.lang.String str) {
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

    /* renamed from: translateFieldName */
    private java.lang.String m35863xadf748f7(java.lang.String str) {
        java.lang.String str2 = this.f16920x809016a;
        if (str2 != null && str.startsWith(str2)) {
            java.lang.String substring = str.substring(this.f16920x809016a.length(), this.f16920x809016a.length() + 1);
            str = substring.toLowerCase() + str.substring(this.f16920x809016a.length() + 1);
        }
        if (this.f16921xdf6593d9 != com.p314xaae8f345.map.p511x696c9db.p512x31ece8.EnumC4316x9cf9562c.UNDERLINE) {
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

    /* renamed from: getFieldValueByJsonName */
    public java.lang.Object m35864x4934e577(java.lang.String str) {
        java.util.Map<java.lang.reflect.Field, java.lang.String> map = this.f16922xe053020e;
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

    /* renamed from: onEachItemParse */
    public boolean m35865x4df6c0(java.lang.String str, java.lang.Object obj) {
        return false;
    }

    /* renamed from: onEachItemToJson */
    public boolean m35866x10f75f96(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Object obj) {
        return false;
    }

    @Override // com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347
    /* renamed from: parse */
    public void mo35867x6581ab3(org.json.JSONObject jSONObject) {
        java.lang.Class m35821x18146f3f;
        m35861x72ba6c67();
        com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer deserializer = this.f16918x4582a57e.get(getClass());
        if (deserializer != null) {
            try {
                deserializer.mo35869x6820db7f(this, getClass().getName(), jSONObject);
                return;
            } catch (org.json.JSONException unused) {
            }
        }
        for (java.util.Map.Entry<java.lang.reflect.Field, java.lang.String> entry : this.f16922xe053020e.entrySet()) {
            java.lang.reflect.Field key = entry.getKey();
            key.setAccessible(true);
            java.lang.Class<?> type = key.getType();
            java.lang.Object opt = jSONObject.opt(entry.getValue());
            com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer deserializer2 = this.f16919xd37a6a00.get(key);
            if (deserializer2 != null) {
                try {
                    key.set(this, deserializer2.mo35869x6820db7f(this, entry.getValue(), opt));
                } catch (java.lang.Exception unused2) {
                }
            }
            if (!m35865x4df6c0(entry.getValue(), opt)) {
                if (opt instanceof org.json.JSONArray) {
                    java.lang.reflect.Type genericType = key.getGenericType();
                    if (genericType instanceof java.lang.reflect.ParameterizedType) {
                        java.lang.String m35862x8cbc6f92 = m35862x8cbc6f92(genericType.toString());
                        try {
                            if (!android.text.TextUtils.isEmpty(m35862x8cbc6f92) && (m35821x18146f3f = com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35821x18146f3f(m35862x8cbc6f92, getClass().getClassLoader())) != null) {
                                key.set(this, java.util.Set.class.isAssignableFrom(key.getType()) ? com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35876xd0bc448e(java.util.HashSet.class, (org.json.JSONArray) opt, m35821x18146f3f, new java.lang.Object[0]) : java.util.List.class.isAssignableFrom(key.getType()) ? com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35876xd0bc448e(java.util.ArrayList.class, (org.json.JSONArray) opt, m35821x18146f3f, new java.lang.Object[0]) : null);
                            }
                        } catch (java.lang.IllegalAccessException | java.lang.NumberFormatException | java.lang.Exception unused3) {
                        }
                    } else {
                        java.lang.Class cls = (java.lang.Class) genericType;
                        if (cls.isArray()) {
                            key.set(this, com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35877x4467e66b((org.json.JSONArray) opt, cls.getComponentType()));
                        }
                    }
                } else if (opt instanceof org.json.JSONObject) {
                    key.set(this, com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35882x450f6f3b((org.json.JSONObject) opt, key.getType(), new java.lang.Object[0]));
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

    @Override // com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4318xb6f102f4
    /* renamed from: toJson */
    public org.json.JSONObject mo35868xcc31ba03() {
        java.lang.Object obj;
        m35861x72ba6c67();
        java.util.Set<java.util.Map.Entry<java.lang.reflect.Field, java.lang.String>> entrySet = this.f16922xe053020e.entrySet();
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
            if (!m35866x10f75f96(jSONObject, entry.getValue(), obj)) {
                if (java.util.Collection.class.isAssignableFrom(type)) {
                    try {
                        java.util.Collection collection = (java.util.Collection) key.get(this);
                        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                        if (collection != null && !collection.isEmpty()) {
                            for (java.lang.Object obj2 : collection) {
                                if (obj2 instanceof com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4318xb6f102f4) {
                                    jSONArray2.put(com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35874x1e81de8c(obj2));
                                }
                            }
                        }
                        java.lang.String value = entry.getValue();
                        if (this.f16917x8ac78fd1 || (collection != null && !collection.isEmpty())) {
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
                    } else if (obj3 instanceof com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4318xb6f102f4) {
                        jSONObject.put(entry.getValue(), com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35874x1e81de8c(obj3));
                    } else if (obj3 == null || !obj3.getClass().isArray()) {
                        java.lang.String value2 = entry.getValue();
                        if (obj3 == null && this.f16917x8ac78fd1) {
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
