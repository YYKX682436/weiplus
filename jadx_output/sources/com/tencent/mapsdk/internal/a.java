package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static java.lang.ClassLoader f48750a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f48751b = true;

    private static void a(boolean z17, java.lang.ClassLoader classLoader) {
        f48751b = z17;
        f48750a = classLoader;
    }

    private static java.lang.Object b(java.lang.String str, boolean z17, java.lang.ClassLoader classLoader) {
        java.lang.Class<?> cls;
        if (str.equals("java.lang.Integer")) {
            return 0;
        }
        if (str.equals("java.lang.Boolean")) {
            return java.lang.Boolean.FALSE;
        }
        if (str.equals("java.lang.Byte")) {
            return (byte) 0;
        }
        if (str.equals("java.lang.Double")) {
            return java.lang.Double.valueOf(0.0d);
        }
        if (str.equals("java.lang.Float")) {
            return java.lang.Float.valueOf(0.0f);
        }
        if (str.equals("java.lang.Long")) {
            return 0L;
        }
        if (str.equals("java.lang.Short")) {
            return (short) 0;
        }
        if (!str.equals("java.lang.Character")) {
            if (str.equals("java.lang.String")) {
                return "";
            }
            if (str.equals("java.util.List")) {
                return new java.util.ArrayList();
            }
            if (str.equals("java.util.Map")) {
                return new java.util.HashMap();
            }
            if (str.equals("Array")) {
                return "Array";
            }
            if (str.equals("?")) {
                return str;
            }
            try {
                if (classLoader != null) {
                    cls = java.lang.Class.forName(str, z17, classLoader);
                } else {
                    java.lang.ClassLoader classLoader2 = f48750a;
                    if (classLoader2 != null) {
                        cls = java.lang.Class.forName(str, f48751b, classLoader2);
                    } else {
                        cls = java.lang.Class.forName(str);
                    }
                }
                return cls.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            } catch (java.lang.Exception e17) {
                throw new com.tencent.mapsdk.internal.b(e17);
            }
        }
        throw new java.lang.IllegalArgumentException("can not support java.lang.Character");
    }

    private static java.lang.String c(java.lang.String str) {
        return str.equals("int32") ? "java.lang.Integer" : str.equals("bool") ? "java.lang.Boolean" : str.equals("char") ? "java.lang.Byte" : str.equals("double") ? "java.lang.Double" : str.equals("float") ? "java.lang.Float" : str.equals("int64") ? "java.lang.Long" : str.equals("short") ? "java.lang.Short" : str.equals("string") ? "java.lang.String" : str.equals("list") ? "java.util.List" : str.equals("map") ? "java.util.Map" : str;
    }

    private static boolean d(java.lang.String str) {
        return str.equals("int") || str.equals(com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_BOOLEAN) || str.equals("byte") || str.equals("double") || str.equals("float") || str.equals("long") || str.equals("short") || str.equals("char") || str.equals(com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_INTEGER) || str.equals("Boolean") || str.equals("Byte") || str.equals("Double") || str.equals("Float") || str.equals("Long") || str.equals("Short") || str.equals("Char");
    }

    private static java.lang.String e(java.lang.String str) {
        return str.equals("int") ? com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_INTEGER : str.equals(com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_BOOLEAN) ? "Boolean" : str.equals("byte") ? "Byte" : str.equals("double") ? "Double" : str.equals("float") ? "Float" : str.equals("long") ? "Long" : str.equals("short") ? "Short" : str.equals("char") ? "Character" : str;
    }

    private static void a(java.util.ArrayList<java.lang.String> arrayList, java.lang.String str) {
        int length = str.length();
        while (str.charAt(length - 1) == '>' && length - 1 != 0) {
        }
        java.lang.String substring = str.substring(0, length);
        if (substring.equals("int32")) {
            substring = "java.lang.Integer";
        } else if (substring.equals("bool")) {
            substring = "java.lang.Boolean";
        } else if (substring.equals("char")) {
            substring = "java.lang.Byte";
        } else if (substring.equals("double")) {
            substring = "java.lang.Double";
        } else if (substring.equals("float")) {
            substring = "java.lang.Float";
        } else if (substring.equals("int64")) {
            substring = "java.lang.Long";
        } else if (substring.equals("short")) {
            substring = "java.lang.Short";
        } else if (substring.equals("string")) {
            substring = "java.lang.String";
        } else if (substring.equals("list")) {
            substring = "java.util.List";
        } else if (substring.equals("map")) {
            substring = "java.util.Map";
        }
        arrayList.add(0, substring);
    }

    private static java.util.ArrayList<java.lang.String> a(java.lang.String str) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        int indexOf = str.indexOf("<");
        int i17 = 0;
        while (i17 < indexOf) {
            a(arrayList, str.substring(i17, indexOf));
            i17 = indexOf + 1;
            indexOf = str.indexOf("<", i17);
            int indexOf2 = str.indexOf(",", i17);
            if (indexOf == -1) {
                indexOf = indexOf2;
            }
            if (indexOf2 != -1 && indexOf2 < indexOf) {
                indexOf = indexOf2;
            }
        }
        a(arrayList, str.substring(i17, str.length()));
        return arrayList;
    }

    public static java.lang.String a(java.util.ArrayList<java.lang.String> arrayList) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        int i17 = 0;
        while (true) {
            java.lang.String str = "map";
            if (i17 < arrayList.size()) {
                java.lang.String str2 = arrayList.get(i17);
                if (str2.equals("java.lang.Integer") || str2.equals("int")) {
                    str = "int32";
                } else if (str2.equals("java.lang.Boolean") || str2.equals(com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_BOOLEAN)) {
                    str = "bool";
                } else if (str2.equals("java.lang.Byte") || str2.equals("byte")) {
                    str = "char";
                } else {
                    java.lang.String str3 = "double";
                    if (!str2.equals("java.lang.Double") && !str2.equals("double")) {
                        str3 = "float";
                        if (!str2.equals("java.lang.Float") && !str2.equals("float")) {
                            if (str2.equals("java.lang.Long") || str2.equals("long")) {
                                str = "int64";
                            } else {
                                str3 = "short";
                                if (!str2.equals("java.lang.Short") && !str2.equals("short")) {
                                    if (!str2.equals("java.lang.Character")) {
                                        if (str2.equals("java.lang.String")) {
                                            str = "string";
                                        } else if (str2.equals("java.util.List")) {
                                            str = "list";
                                        } else if (!str2.equals("java.util.Map")) {
                                            str = str2;
                                        }
                                    } else {
                                        throw new java.lang.IllegalArgumentException("can not support java.lang.Character");
                                    }
                                }
                            }
                        }
                    }
                    str = str3;
                }
                arrayList.set(i17, str);
                i17++;
            } else {
                java.util.Collections.reverse(arrayList);
                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                    java.lang.String str4 = arrayList.get(i18);
                    if (str4.equals("list")) {
                        int i19 = i18 - 1;
                        arrayList.set(i19, "<" + arrayList.get(i19));
                        arrayList.set(0, arrayList.get(0) + ">");
                    } else if (str4.equals("map")) {
                        int i27 = i18 - 1;
                        arrayList.set(i27, "<" + arrayList.get(i27) + ",");
                        arrayList.set(0, arrayList.get(0) + ">");
                    } else if (str4.equals("Array")) {
                        int i28 = i18 - 1;
                        arrayList.set(i28, "<" + arrayList.get(i28));
                        arrayList.set(0, arrayList.get(0) + ">");
                    }
                }
                java.util.Collections.reverse(arrayList);
                java.util.Iterator<java.lang.String> it = arrayList.iterator();
                while (it.hasNext()) {
                    stringBuffer.append(it.next());
                }
                return stringBuffer.toString();
            }
        }
    }

    private static java.lang.String b(java.lang.String str) {
        if (str.equals("java.lang.Integer") || str.equals("int")) {
            return "int32";
        }
        if (str.equals("java.lang.Boolean") || str.equals(com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_BOOLEAN)) {
            return "bool";
        }
        if (str.equals("java.lang.Byte") || str.equals("byte")) {
            return "char";
        }
        java.lang.String str2 = "double";
        if (!str.equals("java.lang.Double") && !str.equals("double")) {
            str2 = "float";
            if (!str.equals("java.lang.Float") && !str.equals("float")) {
                if (str.equals("java.lang.Long") || str.equals("long")) {
                    return "int64";
                }
                if (str.equals("java.lang.Short") || str.equals("short")) {
                    return "short";
                }
                if (str.equals("java.lang.Character")) {
                    throw new java.lang.IllegalArgumentException("can not support java.lang.Character");
                }
                return str.equals("java.lang.String") ? "string" : str.equals("java.util.List") ? "list" : str.equals("java.util.Map") ? "map" : str;
            }
        }
        return str2;
    }

    private static java.lang.String a(java.lang.String str, java.lang.String str2) {
        if (str2.equals("int")) {
            return str2 + " " + str + "=0 ;\n";
        }
        if (str2.equals(com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_BOOLEAN)) {
            return str2 + " " + str + "=false ;\n";
        }
        if (str2.equals("byte")) {
            return str2 + " " + str + " ;\n";
        }
        if (str2.equals("double")) {
            return str2 + " " + str + "=0 ;\n";
        }
        if (str2.equals("float")) {
            return str2 + " " + str + "=0 ;\n";
        }
        if (str2.equals("long")) {
            return str2 + " " + str + "=0 ;\n";
        }
        if (str2.equals("short")) {
            return str2 + " " + str + "=0 ;\n";
        }
        if (str2.equals("char")) {
            return str2 + " " + str + " ;\n";
        }
        return str2 + " " + str + " = null ;\n";
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a9, code lost:
    
        if (r2 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0072, code lost:
    
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x006f, code lost:
    
        if (r2 == null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(java.lang.String r8, boolean r9, java.lang.ClassLoader r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "<"
            int r2 = r8.indexOf(r1)
            r3 = 0
            r4 = r3
        Ld:
            if (r4 >= r2) goto L2c
            java.lang.String r4 = r8.substring(r4, r2)
            a(r0, r4)
            int r4 = r2 + 1
            int r2 = r8.indexOf(r1, r4)
            java.lang.String r5 = ","
            int r5 = r8.indexOf(r5, r4)
            r6 = -1
            if (r2 != r6) goto L26
            r2 = r5
        L26:
            if (r5 == r6) goto Ld
            if (r5 >= r2) goto Ld
            r2 = r5
            goto Ld
        L2c:
            int r1 = r8.length()
            java.lang.String r8 = r8.substring(r4, r1)
            a(r0, r8)
            java.util.Iterator r8 = r0.iterator()
            r0 = 0
            r1 = r0
            r2 = r1
        L3e:
            r4 = r2
        L3f:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto Lad
            java.lang.Object r1 = r8.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = b(r1, r9, r10)
            boolean r5 = r1 instanceof java.lang.String
            java.lang.Class<java.lang.Byte> r6 = java.lang.Byte.class
            if (r5 == 0) goto L74
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r7 = "Array"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L67
            if (r2 != 0) goto L3f
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r6, r3)
            goto L3f
        L67:
            java.lang.String r6 = "?"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L3f
            if (r2 != 0) goto L72
            goto Lab
        L72:
            r4 = r2
            goto Lab
        L74:
            boolean r5 = r1 instanceof java.util.List
            r7 = 1
            if (r5 == 0) goto L91
            if (r2 == 0) goto L87
            boolean r5 = r2 instanceof java.lang.Byte
            if (r5 == 0) goto L87
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r6, r7)
            java.lang.reflect.Array.set(r1, r3, r2)
            goto L3f
        L87:
            if (r2 == 0) goto L8f
            r5 = r1
            java.util.List r5 = (java.util.List) r5
            r5.add(r2)
        L8f:
            r2 = r0
            goto L3f
        L91:
            boolean r5 = r1 instanceof java.util.Map
            if (r5 == 0) goto La9
            if (r2 == 0) goto L99
            r5 = r7
            goto L9a
        L99:
            r5 = r3
        L9a:
            if (r4 == 0) goto L9d
            goto L9e
        L9d:
            r7 = r3
        L9e:
            r5 = r5 & r7
            if (r5 == 0) goto La7
            r5 = r1
            java.util.Map r5 = (java.util.Map) r5
            r5.put(r2, r4)
        La7:
            r2 = r0
            goto L3e
        La9:
            if (r2 != 0) goto L72
        Lab:
            r2 = r1
            goto L3f
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.a.a(java.lang.String, boolean, java.lang.ClassLoader):java.lang.Object");
    }
}
