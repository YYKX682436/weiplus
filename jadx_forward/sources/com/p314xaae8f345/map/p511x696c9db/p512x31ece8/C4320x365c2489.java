package com.p314xaae8f345.map.p511x696c9db.p512x31ece8;

/* renamed from: com.tencent.map.tools.json.JsonUtils */
/* loaded from: classes13.dex */
public class C4320x365c2489 {
    /* renamed from: collectionToJson */
    public static <T> java.lang.String m35870x946a6641(java.util.Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (T t17 : collection) {
            if (t17 instanceof com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4318xb6f102f4) {
                jSONArray.put(((com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4318xb6f102f4) t17).mo35868xcc31ba03());
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
    /* renamed from: jsonArrayEqualsIgnoreOrder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m35871xd41ebd0c(org.json.JSONArray r7, org.json.JSONArray r8) {
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
            boolean r6 = m35872x9e4fd9d3(r4, r6)
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35871xd41ebd0c(org.json.JSONArray, org.json.JSONArray):boolean");
    }

    /* renamed from: jsonElementEquals */
    private static boolean m35872x9e4fd9d3(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return ((obj instanceof org.json.JSONObject) && (obj2 instanceof org.json.JSONObject)) ? m35873xd4c988e6((org.json.JSONObject) obj, (org.json.JSONObject) obj2) : ((obj instanceof org.json.JSONArray) && (obj2 instanceof org.json.JSONArray)) ? m35871xd41ebd0c((org.json.JSONArray) obj, (org.json.JSONArray) obj2) : obj.equals(obj2);
    }

    /* renamed from: jsonObjectEquals */
    public static boolean m35873xd4c988e6(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null || jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            if (!jSONObject2.has(next) || !m35872x9e4fd9d3(jSONObject.get(next), jSONObject2.get(next))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: modelToJson */
    public static <T> org.json.JSONObject m35874x1e81de8c(T t17) {
        if (t17 instanceof com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4318xb6f102f4) {
            return ((com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4318xb6f102f4) t17).mo35868xcc31ba03();
        }
        return null;
    }

    /* renamed from: modelToJsonString */
    public static <T> java.lang.String m35875xa34611bd(T t17) {
        org.json.JSONObject m35874x1e81de8c = m35874x1e81de8c(t17);
        if (m35874x1e81de8c != null) {
            return m35874x1e81de8c.toString();
        }
        return null;
    }

    /* renamed from: parseTo */
    public static <C extends java.util.Collection> C m35876xd0bc448e(java.lang.Class<C> cls, org.json.JSONArray jSONArray, java.lang.Class cls2, java.lang.Object... objArr) {
        C c17 = (C) com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35851x6bff0255(cls, new java.lang.Object[0]);
        if (jSONArray != null) {
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                java.lang.Object opt = jSONArray.opt(i17);
                if (opt instanceof org.json.JSONArray) {
                    c17.add(m35876xd0bc448e(cls, (org.json.JSONArray) opt, cls2, objArr));
                } else if (opt instanceof org.json.JSONObject) {
                    c17.add(m35882x450f6f3b((org.json.JSONObject) opt, cls2, objArr));
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

    /* renamed from: parseToArray */
    public static java.lang.Object m35877x4467e66b(org.json.JSONArray jSONArray, java.lang.Class cls) {
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

    /* renamed from: parseToJsonArray */
    public static org.json.JSONArray m35878x7ace8163(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new org.json.JSONArray(str);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    /* renamed from: parseToList */
    public static <T> java.util.List<T> m35880xd8ef724c(org.json.JSONArray jSONArray, java.lang.Class<T> cls, java.lang.Object... objArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONArray != null) {
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                arrayList.add(m35882x450f6f3b(jSONArray.optJSONObject(i17), cls, objArr));
            }
        }
        return arrayList;
    }

    /* renamed from: parseToModel */
    public static <T> T m35882x450f6f3b(org.json.JSONObject jSONObject, java.lang.Class<T> cls, java.lang.Object... objArr) {
        java.lang.Class<? extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer> m35887x9bfa94d3;
        com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4322x8e23a062 interfaceC4322x8e23a062 = (com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4322x8e23a062) cls.getAnnotation(com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4322x8e23a062.class);
        com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347 interfaceC4319x8b98a347 = null;
        if (interfaceC4322x8e23a062 != null && (m35887x9bfa94d3 = interfaceC4322x8e23a062.m35887x9bfa94d3()) != com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer.class) {
            try {
                java.lang.Object mo35869x6820db7f = ((com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347.Deserializer) com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35851x6bff0255(m35887x9bfa94d3, new java.lang.Object[0])).mo35869x6820db7f(null, "", jSONObject);
                if (mo35869x6820db7f != null) {
                    if (cls.isAssignableFrom(mo35869x6820db7f.getClass())) {
                        interfaceC4319x8b98a347 = (T) mo35869x6820db7f;
                    }
                }
            } catch (org.json.JSONException unused) {
            }
        }
        if (interfaceC4319x8b98a347 == null) {
            interfaceC4319x8b98a347 = (T) com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35851x6bff0255(cls, objArr);
        }
        if (interfaceC4319x8b98a347 instanceof com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347) {
            interfaceC4319x8b98a347.mo35867x6581ab3(jSONObject);
        }
        return (T) interfaceC4319x8b98a347;
    }

    /* renamed from: parseToJsonArray */
    public static org.json.JSONArray m35879x7ace8163(java.lang.String str, org.json.JSONArray jSONArray) {
        if (android.text.TextUtils.isEmpty(str)) {
            return jSONArray;
        }
        try {
            return new org.json.JSONArray(str);
        } catch (org.json.JSONException unused) {
            return jSONArray;
        }
    }

    /* renamed from: parseToModel */
    public static <T> T m35881x450f6f3b(java.lang.String str, java.lang.Class<T> cls, java.lang.Object... objArr) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (T) m35882x450f6f3b(new org.json.JSONObject(str), cls, objArr);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }
}
