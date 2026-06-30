package ra3;

/* loaded from: classes.dex */
public final class n {
    public n(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final ra3.o a(java.lang.String baseLibPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseLibPath, "baseLibPath");
        synchronized (this) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.Map map = ra3.p.f475059b;
            if (map.containsKey(baseLibPath)) {
                java.lang.Object obj = ((java.util.LinkedHashMap) map).get(baseLibPath);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                if (currentTimeMillis - ((java.lang.Number) obj).longValue() < 500) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppHelper", "baseLibPath:" + baseLibPath + " has recently check.");
                    return new ra3.o(true, "");
                }
            }
            map.put(baseLibPath, java.lang.Long.valueOf(currentTimeMillis));
            try {
                try {
                    try {
                        try {
                            com.p314xaae8f345.mm.vfs.x1 m17 = com.p314xaae8f345.mm.vfs.w6.m(baseLibPath);
                            java.util.Set set = null;
                            java.lang.String str = m17 != null ? m17.f294764a : null;
                            if (str == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppHelper", "packageRelPath == null");
                                ra3.o oVar = new ra3.o(false, baseLibPath);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppHelper", "check_package_integrity " + baseLibPath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                                return oVar;
                            }
                            int length = str.length() + 1;
                            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(baseLibPath.concat("/signatures.json"));
                            java.lang.String str2 = a17.f294812f;
                            if (str2 != null) {
                                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                                if (!a17.f294812f.equals(l17)) {
                                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                                }
                            }
                            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                            if (!(!m18.a() ? false : m18.f294799a.F(m18.f294800b))) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppHelper", "signatures not exist");
                                ra3.o oVar2 = new ra3.o(false, "signatures.json");
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppHelper", "check_package_integrity " + baseLibPath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                                return oVar2;
                            }
                            java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(baseLibPath, true);
                            if (s17 != null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(s17, 10));
                                java.util.Iterator it = s17.iterator();
                                while (it.hasNext()) {
                                    java.lang.String relPath = ((com.p314xaae8f345.mm.vfs.x1) it.next()).f294764a;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relPath, "relPath");
                                    java.lang.String substring = relPath.substring(length);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                                    arrayList.add(substring);
                                }
                                set = kz5.n0.X0(arrayList);
                            }
                            if (set == null) {
                                ra3.o oVar3 = new ra3.o(false, baseLibPath);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppHelper", "check_package_integrity " + baseLibPath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                                return oVar3;
                            }
                            org.json.JSONArray jSONArray = new org.json.JSONObject(com.p314xaae8f345.mm.vfs.w6.M(baseLibPath + "/signatures.json")).getJSONArray("signatures");
                            if (jSONArray == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppHelper", "signatures json array not found.");
                                ra3.o oVar4 = new ra3.o(false, "signatures.json");
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppHelper", "check_package_integrity " + baseLibPath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                                return oVar4;
                            }
                            int length2 = jSONArray.length();
                            for (int i17 = 0; i17 < length2; i17++) {
                                java.lang.String string = jSONArray.getJSONObject(i17).getString("file");
                                if (!set.contains(string)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppHelper", "File does not exist: " + string);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                                    ra3.o oVar5 = new ra3.o(false, string);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppHelper", "check_package_integrity " + baseLibPath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                                    return oVar5;
                                }
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppHelper", "all File exist");
                            ra3.o oVar6 = new ra3.o(true, "");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppHelper", "check_package_integrity " + baseLibPath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                            return oVar6;
                        } catch (java.io.IOException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppHelper", jz5.a.b(e17));
                            ra3.o oVar7 = new ra3.o(false, "IOException");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppHelper", "check_package_integrity " + baseLibPath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                            return oVar7;
                        }
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppHelper", jz5.a.b(e18));
                        ra3.o oVar8 = new ra3.o(false, "Exception");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppHelper", "check_package_integrity " + baseLibPath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                        return oVar8;
                    }
                } catch (org.json.JSONException e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppHelper", jz5.a.b(e19));
                    ra3.o oVar9 = new ra3.o(false, "JSONException");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppHelper", "check_package_integrity " + baseLibPath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                    return oVar9;
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppHelper", "check_package_integrity " + baseLibPath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                throw th6;
            }
        }
    }

    public final ra3.o b(java.lang.String packagePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packagePath, "packagePath");
        synchronized (this) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.Map map = ra3.p.f475059b;
            if (map.containsKey(packagePath)) {
                java.lang.Object obj = ((java.util.LinkedHashMap) map).get(packagePath);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                if (currentTimeMillis - ((java.lang.Number) obj).longValue() < 500) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppHelper", "packagePath:" + packagePath + " has recently check.");
                    return new ra3.o(true, "");
                }
            }
            map.put(packagePath, java.lang.Long.valueOf(currentTimeMillis));
            try {
                try {
                    try {
                        try {
                            com.p314xaae8f345.mm.vfs.x1 m17 = com.p314xaae8f345.mm.vfs.w6.m(packagePath);
                            java.util.Set set = null;
                            java.lang.String str = m17 != null ? m17.f294764a : null;
                            if (str == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppHelper", "packageRelPath == null");
                                ra3.o oVar = new ra3.o(false, packagePath);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppHelper", "check_package_integrity " + packagePath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                                return oVar;
                            }
                            int length = str.length() + 1;
                            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(packagePath.concat("/signatures.json"));
                            java.lang.String str2 = a17.f294812f;
                            if (str2 != null) {
                                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                                if (!a17.f294812f.equals(l17)) {
                                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                                }
                            }
                            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                            if (!(!m18.a() ? false : m18.f294799a.F(m18.f294800b))) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppHelper", "signatures not exist");
                                ra3.o oVar2 = new ra3.o(false, "signatures.json");
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppHelper", "check_package_integrity " + packagePath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                                return oVar2;
                            }
                            java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(packagePath, true);
                            if (s17 != null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(s17, 10));
                                java.util.Iterator it = s17.iterator();
                                while (it.hasNext()) {
                                    java.lang.String relPath = ((com.p314xaae8f345.mm.vfs.x1) it.next()).f294764a;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relPath, "relPath");
                                    java.lang.String substring = relPath.substring(length);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                                    arrayList.add(substring);
                                }
                                set = kz5.n0.X0(arrayList);
                            }
                            if (set == null) {
                                ra3.o oVar3 = new ra3.o(false, packagePath);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppHelper", "check_package_integrity " + packagePath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                                return oVar3;
                            }
                            org.json.JSONArray jSONArray = new org.json.JSONObject(com.p314xaae8f345.mm.vfs.w6.M(packagePath + "/signatures.json")).getJSONArray("signatures");
                            if (jSONArray == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppHelper", "signatures json array not found.");
                                ra3.o oVar4 = new ra3.o(false, "signatures.json");
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppHelper", "check_package_integrity " + packagePath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                                return oVar4;
                            }
                            int length2 = jSONArray.length();
                            for (int i17 = 0; i17 < length2; i17++) {
                                java.lang.String string = jSONArray.getJSONObject(i17).getString("file");
                                if (!set.contains(string)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppHelper", "File does not exist: " + string);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                                    ra3.o oVar5 = new ra3.o(false, string);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppHelper", "check_package_integrity " + packagePath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                                    return oVar5;
                                }
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppHelper", "all File exist");
                            ra3.o oVar6 = new ra3.o(true, "");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppHelper", "check_package_integrity " + packagePath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                            return oVar6;
                        } catch (java.io.IOException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppHelper", jz5.a.b(e17));
                            ra3.o oVar7 = new ra3.o(false, "IOException");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppHelper", "check_package_integrity " + packagePath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                            return oVar7;
                        }
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppHelper", jz5.a.b(e18));
                        ra3.o oVar8 = new ra3.o(false, "Exception");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppHelper", "check_package_integrity " + packagePath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                        return oVar8;
                    }
                } catch (org.json.JSONException e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppHelper", jz5.a.b(e19));
                    ra3.o oVar9 = new ra3.o(false, "JSONException");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppHelper", "check_package_integrity " + packagePath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                    return oVar9;
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppHelper", "check_package_integrity " + packagePath + " Execution time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                throw th6;
            }
        }
    }
}
