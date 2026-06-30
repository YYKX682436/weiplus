package z52;

/* loaded from: classes15.dex */
public abstract class b {
    public static void a(java.lang.Object obj, r45.b45 b45Var, r45.jw3 jw3Var, boolean z17, boolean z18) {
        r45.a44 a44Var;
        if (obj == null || android.text.TextUtils.isEmpty(b45Var.f452052d) || android.text.TextUtils.isEmpty(b45Var.f452053e)) {
            return;
        }
        if ("0".equals(b45Var.f452054f)) {
            if (!z18) {
                return;
            }
        } else if ("2".equals(b45Var.f452054f) && z18) {
            return;
        }
        r45.a44 a44Var2 = b45Var.f452056h;
        r45.kw3 b17 = b(obj, b45Var.f452055g, a44Var2 == null ? b45Var.f452053e : a44Var2.f451250f, b45Var.f452053e);
        if (b17 == null) {
            if (!z17 && (a44Var = b45Var.f452056h) != null && !android.text.TextUtils.isEmpty(a44Var.f451250f)) {
                a62.k.a(158L);
            }
            java.lang.String str = b45Var.f452052d;
            java.lang.String str2 = b45Var.f452053e;
            b17 = b(obj, str, str2, str2);
            if (b17 == null) {
                return;
            }
        }
        if (z17) {
            jw3Var.f459698m.add(b17);
        } else {
            jw3Var.f459696h.add(b17);
            a62.k.a(135L);
        }
    }

    public static r45.kw3 b(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.ArrayList<m3.d> arrayList = new java.util.ArrayList();
        try {
            for (java.lang.String str4 : str2.split(",")) {
                java.lang.String[] split = str4.split("\\|");
                arrayList.add(new m3.d(split[0], split[1]));
            }
        } catch (java.lang.Exception unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(str);
            java.lang.Class<?> cls2 = cls;
            java.lang.Object obj2 = obj;
            for (m3.d dVar : arrayList) {
                if (dVar != null) {
                    java.lang.String str5 = (java.lang.String) dVar.f404625a;
                    java.lang.String str6 = (java.lang.String) dVar.f404626b;
                    if (str5 != null && !str5.isEmpty() && str6 != null && !str6.isEmpty()) {
                        java.lang.reflect.Field declaredField = cls2.getDeclaredField(str5);
                        declaredField.setAccessible(true);
                        obj2 = declaredField.get(obj2);
                        if (str6.startsWith("[")) {
                            nm5.b c17 = c(str6);
                            if (c17 != null) {
                                int intValue = ((java.lang.Integer) c17.a(1)).intValue();
                                java.lang.Object[] objArr = (java.lang.Object[]) obj2;
                                if (objArr != null && objArr.length > 0 && intValue < objArr.length) {
                                    obj2 = objArr[intValue];
                                    cls2 = java.lang.Class.forName((java.lang.String) c17.a(0));
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.HellSessionParamUtil", "array == null || array.length <= 0");
                                return null;
                            }
                        } else if (str6.startsWith("Ljava/util/List;")) {
                            nm5.b d17 = d(str6, "Ljava/util/List;");
                            if (d17 != null) {
                                java.util.List list = (java.util.List) obj2;
                                try {
                                    int parseInt = java.lang.Integer.parseInt((java.lang.String) d17.a(1));
                                    if (list != null && !list.isEmpty() && parseInt < list.size()) {
                                        obj2 = list.get(parseInt);
                                        cls2 = java.lang.Class.forName((java.lang.String) d17.a(0));
                                    }
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.HellSessionParamUtil", "list.isEmpty");
                                    return null;
                                } catch (java.lang.NumberFormatException e17) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellSessionParamUtil", e17, "SessionParam, Ljava/util/List;, crash", new java.lang.Object[0]);
                                    return null;
                                }
                            }
                        } else if (str6.startsWith("Ljava/util/ArrayList;")) {
                            nm5.b d18 = d(str6, "Ljava/util/ArrayList;");
                            if (d18 != null) {
                                java.util.ArrayList arrayList2 = (java.util.ArrayList) obj2;
                                try {
                                    int parseInt2 = java.lang.Integer.parseInt((java.lang.String) d18.a(1));
                                    if (arrayList2 != null && !arrayList2.isEmpty() && parseInt2 < arrayList2.size()) {
                                        obj2 = arrayList2.get(parseInt2);
                                        cls2 = java.lang.Class.forName((java.lang.String) d18.a(0));
                                    }
                                    return null;
                                } catch (java.lang.NumberFormatException e18) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellSessionParamUtil", e18, "SessionParam, Ljava/util/ArrayList;, crash", new java.lang.Object[0]);
                                    return null;
                                }
                            }
                        } else if (str6.startsWith("Ljava/util/LinkedList;")) {
                            nm5.b d19 = d(str6, "Ljava/util/LinkedList;");
                            if (d19 != null) {
                                java.util.LinkedList linkedList = (java.util.LinkedList) obj2;
                                try {
                                    int parseInt3 = java.lang.Integer.parseInt((java.lang.String) d19.a(1));
                                    if (linkedList != null && !linkedList.isEmpty() && parseInt3 < linkedList.size()) {
                                        obj2 = linkedList.get(parseInt3);
                                        cls2 = java.lang.Class.forName((java.lang.String) d19.a(0));
                                    }
                                    return null;
                                } catch (java.lang.NumberFormatException e19) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellSessionParamUtil", e19, "_doParse, Ljava/util/LinkedList;, crash", new java.lang.Object[0]);
                                    return null;
                                }
                            }
                        } else if (str6.startsWith("Ljava/util/Map;")) {
                            nm5.b d27 = d(str6, "Ljava/util/Map;");
                            if (d27 != null) {
                                java.util.Map map = (java.util.Map) obj2;
                                if (map == null || map.isEmpty() || (obj2 = map.get(d27.a(1))) == null) {
                                    return null;
                                }
                                cls2 = java.lang.Class.forName((java.lang.String) d27.a(0));
                            }
                        } else if (str6.startsWith("Ljava/util/HashMap;")) {
                            nm5.b d28 = d(str6, "Ljava/util/HashMap;");
                            if (d28 != null) {
                                java.util.HashMap hashMap = (java.util.HashMap) obj2;
                                if (hashMap == null || hashMap.isEmpty() || (obj2 = hashMap.get(d28.a(1))) == null) {
                                    return null;
                                }
                                cls2 = java.lang.Class.forName((java.lang.String) d28.a(0));
                            }
                        } else {
                            cls2 = java.lang.Class.forName(str6);
                        }
                    }
                }
            }
            if (obj2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.HellSessionParamUtil", "SessionParams, object == NULL !!");
                return null;
            }
            r45.kw3 kw3Var = new r45.kw3();
            java.lang.String valueOf = java.lang.String.valueOf(obj2);
            if (obj2 instanceof java.lang.Long) {
                valueOf = b52.b.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(valueOf, 0L));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionParamUtil", "SessionParams, value: %s, %s", valueOf, str3);
            kw3Var.f460531d = valueOf;
            kw3Var.f460532e = str3;
            return kw3Var;
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    public static nm5.b c(java.lang.String str) {
        nm5.b e17 = e(str);
        if (e17 == null) {
            return null;
        }
        try {
            return nm5.j.c(str.substring(str.indexOf("[") + 1, ((java.lang.Integer) e17.a(1)).intValue()), java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) e17.a(0))));
        } catch (java.lang.NumberFormatException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellSessionParamUtil", e18, "HellPageParamsCatcher, getClassNameAndIndexOfArray", new java.lang.Object[0]);
            return null;
        }
    }

    public static nm5.b d(java.lang.String str, java.lang.String str2) {
        nm5.b e17 = e(str);
        if (e17 == null) {
            return null;
        }
        return nm5.j.c(str.substring(str2.length(), ((java.lang.Integer) e17.a(1)).intValue()), (java.lang.String) e17.a(0));
    }

    public static nm5.b e(java.lang.String str) {
        int lastIndexOf = str.lastIndexOf("@");
        if (lastIndexOf <= 0 || lastIndexOf >= str.length() - 1) {
            return null;
        }
        return nm5.j.c(str.substring(lastIndexOf + 1), java.lang.Integer.valueOf(lastIndexOf));
    }
}
