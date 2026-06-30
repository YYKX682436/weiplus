package com.tencent.map.tools.json;

/* loaded from: classes13.dex */
public class JsonUtils {
    public static <T> java.lang.String collectionToJson(java.util.Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (T t17 : collection) {
            if (t17 instanceof com.tencent.map.tools.json.JsonEncoder) {
                jSONArray.put(((com.tencent.map.tools.json.JsonEncoder) t17).toJson());
            } else {
                jSONArray.put((java.lang.Object) null);
            }
        }
        return jSONArray.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        r2[r5] = true;
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean jsonArrayEqualsIgnoreOrder(org.json.JSONArray r7, org.json.JSONArray r8) {
        /*
            r0 = 1
            if (r7 != 0) goto L6
            if (r8 != 0) goto L6
            return r0
        L6:
            r1 = 0
            if (r7 == 0) goto L47
            if (r8 != 0) goto Lc
            goto L47
        Lc:
            int r2 = r7.length()
            int r3 = r8.length()
            if (r2 == r3) goto L17
            return r1
        L17:
            int r2 = r8.length()
            boolean[] r2 = new boolean[r2]
            r3 = r1
        L1e:
            int r4 = r7.length()
            if (r3 >= r4) goto L46
            java.lang.Object r4 = r7.get(r3)
            r5 = r1
        L29:
            int r6 = r8.length()
            if (r5 >= r6) goto L45
            boolean r6 = r2[r5]
            if (r6 != 0) goto L42
            java.lang.Object r6 = r8.get(r5)
            boolean r6 = jsonElementEquals(r4, r6)
            if (r6 == 0) goto L42
            r2[r5] = r0
            int r3 = r3 + 1
            goto L1e
        L42:
            int r5 = r5 + 1
            goto L29
        L45:
            return r1
        L46:
            return r0
        L47:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.map.tools.json.JsonUtils.jsonArrayEqualsIgnoreOrder(org.json.JSONArray, org.json.JSONArray):boolean");
    }

    private static boolean jsonElementEquals(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return ((obj instanceof org.json.JSONObject) && (obj2 instanceof org.json.JSONObject)) ? jsonObjectEquals((org.json.JSONObject) obj, (org.json.JSONObject) obj2) : ((obj instanceof org.json.JSONArray) && (obj2 instanceof org.json.JSONArray)) ? jsonArrayEqualsIgnoreOrder((org.json.JSONArray) obj, (org.json.JSONArray) obj2) : obj.equals(obj2);
    }

    public static boolean jsonObjectEquals(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null || jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            if (!jSONObject2.has(next) || !jsonElementEquals(jSONObject.get(next), jSONObject2.get(next))) {
                return false;
            }
        }
        return true;
    }

    public static <T> org.json.JSONObject modelToJson(T t17) {
        if (t17 instanceof com.tencent.map.tools.json.JsonEncoder) {
            return ((com.tencent.map.tools.json.JsonEncoder) t17).toJson();
        }
        return null;
    }

    public static <T> java.lang.String modelToJsonString(T t17) {
        org.json.JSONObject modelToJson = modelToJson(t17);
        if (modelToJson != null) {
            return modelToJson.toString();
        }
        return null;
    }

    public static <C extends java.util.Collection> C parseTo(java.lang.Class<C> cls, org.json.JSONArray jSONArray, java.lang.Class cls2, java.lang.Object... objArr) {
        C c17 = (C) com.tencent.map.tools.Util.newInstance(cls, new java.lang.Object[0]);
        if (jSONArray != null) {
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                java.lang.Object opt = jSONArray.opt(i17);
                if (opt instanceof org.json.JSONArray) {
                    c17.add(parseTo(cls, (org.json.JSONArray) opt, cls2, objArr));
                } else if (opt instanceof org.json.JSONObject) {
                    c17.add(parseToModel((org.json.JSONObject) opt, cls2, objArr));
                } else if (opt.getClass() == cls2) {
                    c17.add(opt);
                } else if (opt instanceof java.lang.Integer) {
                    if (cls2 == java.lang.Double.class) {
                        c17.add(java.lang.Double.valueOf(((java.lang.Integer) opt).doubleValue()));
                    } else if (cls2 == java.lang.Long.class) {
                        c17.add(java.lang.Long.valueOf(((java.lang.Integer) opt).longValue()));
                    } else if (cls2 == java.lang.Float.class) {
                        c17.add(java.lang.Float.valueOf(((java.lang.Integer) opt).floatValue()));
                    } else if (cls2 == java.lang.String.class) {
                        c17.add(opt.toString());
                    }
                } else if (opt instanceof java.lang.Double) {
                    if (cls2 == java.lang.Integer.class) {
                        c17.add(java.lang.Integer.valueOf(((java.lang.Double) opt).intValue()));
                    } else if (cls2 == java.lang.Long.class) {
                        c17.add(java.lang.Long.valueOf(((java.lang.Double) opt).longValue()));
                    } else if (cls2 == java.lang.Float.class) {
                        c17.add(java.lang.Float.valueOf(((java.lang.Double) opt).floatValue()));
                    } else if (cls2 == java.lang.String.class) {
                        c17.add(opt.toString());
                    }
                } else if (opt instanceof java.lang.Long) {
                    if (cls2 == java.lang.Integer.class) {
                        c17.add(java.lang.Integer.valueOf(((java.lang.Long) opt).intValue()));
                    } else if (cls2 == java.lang.Double.class) {
                        c17.add(java.lang.Double.valueOf(((java.lang.Long) opt).doubleValue()));
                    } else if (cls2 == java.lang.Float.class) {
                        c17.add(java.lang.Float.valueOf(((java.lang.Long) opt).floatValue()));
                    } else if (cls2 == java.lang.String.class) {
                        c17.add(opt.toString());
                    }
                }
            }
        }
        return c17;
    }

    public static java.lang.Object parseToArray(org.json.JSONArray jSONArray, java.lang.Class cls) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        java.lang.Object newInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, length);
        for (int i17 = 0; i17 < length; i17++) {
            try {
                java.lang.reflect.Array.set(newInstance, i17, jSONArray.get(i17));
            } catch (org.json.JSONException unused) {
            }
        }
        return newInstance;
    }

    public static org.json.JSONArray parseToJsonArray(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new org.json.JSONArray(str);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public static <T> java.util.List<T> parseToList(org.json.JSONArray jSONArray, java.lang.Class<T> cls, java.lang.Object... objArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray != null) {
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                arrayList.add(parseToModel(jSONArray.optJSONObject(i17), cls, objArr));
            }
        }
        return arrayList;
    }

    public static <T> T parseToModel(org.json.JSONObject jSONObject, java.lang.Class<T> cls, java.lang.Object... objArr) {
        java.lang.Class<? extends com.tencent.map.tools.json.JsonParser.Deserializer> deserializer;
        com.tencent.map.tools.json.annotation.JsonType jsonType = (com.tencent.map.tools.json.annotation.JsonType) cls.getAnnotation(com.tencent.map.tools.json.annotation.JsonType.class);
        com.tencent.map.tools.json.JsonParser jsonParser = null;
        if (jsonType != null && (deserializer = jsonType.deserializer()) != com.tencent.map.tools.json.JsonParser.Deserializer.class) {
            try {
                java.lang.Object deserialize = ((com.tencent.map.tools.json.JsonParser.Deserializer) com.tencent.map.tools.Util.newInstance(deserializer, new java.lang.Object[0])).deserialize(null, "", jSONObject);
                if (deserialize != null) {
                    if (cls.isAssignableFrom(deserialize.getClass())) {
                        jsonParser = (T) deserialize;
                    }
                }
            } catch (org.json.JSONException unused) {
            }
        }
        if (jsonParser == null) {
            jsonParser = (T) com.tencent.map.tools.Util.newInstance(cls, objArr);
        }
        if (jsonParser instanceof com.tencent.map.tools.json.JsonParser) {
            jsonParser.parse(jSONObject);
        }
        return (T) jsonParser;
    }

    public static org.json.JSONArray parseToJsonArray(java.lang.String str, org.json.JSONArray jSONArray) {
        if (android.text.TextUtils.isEmpty(str)) {
            return jSONArray;
        }
        try {
            return new org.json.JSONArray(str);
        } catch (org.json.JSONException unused) {
            return jSONArray;
        }
    }

    public static <T> T parseToModel(java.lang.String str, java.lang.Class<T> cls, java.lang.Object... objArr) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (T) parseToModel(new org.json.JSONObject(str), cls, objArr);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }
}
