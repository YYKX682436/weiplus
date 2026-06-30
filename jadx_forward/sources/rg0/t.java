package rg0;

/* loaded from: classes7.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f476725b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f476726c = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f476728e = false;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f476729f = "";

    /* renamed from: a, reason: collision with root package name */
    public static final rg0.t f476724a = new rg0.t();

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Object f476727d = new java.lang.Object();

    public final int a(java.lang.String str, java.lang.String str2) {
        java.lang.Integer h17;
        java.lang.Integer h18;
        try {
            if (!(str.length() == 0)) {
                if (!(str2.length() == 0)) {
                    java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{"."}, false, 0, 6, null);
                    java.util.List f08 = r26.n0.f0(str2, new java.lang.String[]{"."}, false, 0, 6, null);
                    int max = java.lang.Math.max(f07.size(), f08.size());
                    for (int i17 = 0; i17 < max; i17++) {
                        java.lang.String str3 = (java.lang.String) kz5.n0.a0(f07, i17);
                        int intValue = (str3 == null || (h18 = r26.h0.h(str3)) == null) ? 0 : h18.intValue();
                        java.lang.String str4 = (java.lang.String) kz5.n0.a0(f08, i17);
                        int intValue2 = (str4 == null || (h17 = r26.h0.h(str4)) == null) ? 0 : h17.intValue();
                        if (intValue != intValue2) {
                            return intValue - intValue2;
                        }
                    }
                    return 0;
                }
            }
            if (str.length() == 0) {
                if (str2.length() == 0) {
                    return 0;
                }
            }
            return str.length() == 0 ? -1 : 1;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TLModuleManager", "compareVersion failed: %s", e17.getLocalizedMessage());
            return -1;
        }
    }

    public final void b(java.lang.String str, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        synchronized (f476727d) {
            if (f476728e) {
                return;
            }
            f476728e = true;
            try {
                com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(str, r6Var.m82467xfb82e301());
                com.p314xaae8f345.mm.vfs.u6 u6Var = new com.p314xaae8f345.mm.vfs.u6(r6Var);
                try {
                    com.p314xaae8f345.mm.vfs.y6 y6Var = new com.p314xaae8f345.mm.vfs.y6(r6Var2);
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read = u6Var.read(bArr);
                            if (read <= 0) {
                                break;
                            } else {
                                y6Var.write(bArr, 0, read);
                            }
                        }
                        vz5.b.a(y6Var, null);
                        vz5.b.a(u6Var, null);
                        java.lang.String m82467xfb82e301 = r6Var.m82467xfb82e301();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82467xfb82e301, "getName(...)");
                        if (r26.i0.n(m82467xfb82e301, "comm.img", false)) {
                            f476726c = true;
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TLModuleManager", "copy failed %s", e17.getLocalizedMessage());
            }
            f476728e = false;
        }
    }

    public final java.lang.String c(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str2 == null || str2.length() == 0) {
            return "";
        }
        synchronized (f476727d) {
            if (f476728e) {
                return "";
            }
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
            if (!r6Var.m()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TLModuleManager", "enc file not exist");
                return "";
            }
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                com.p314xaae8f345.mm.vfs.u6 u6Var = new com.p314xaae8f345.mm.vfs.u6(r6Var);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = u6Var.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    vz5.b.a(u6Var, null);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (byteArray == null) {
                        byteArray = "".getBytes(r26.c.f450398a);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(byteArray, "getBytes(...)");
                    }
                    if (byteArray.length < 16) {
                        return "";
                    }
                    byte[] q17 = kz5.v.q(byteArray, 0, 16);
                    byte[] q18 = kz5.v.q(byteArray, 16, byteArray.length);
                    rg0.t tVar = f476724a;
                    byte[] q19 = kz5.v.q(q17, 0, 16);
                    byte[] bArr2 = new byte[16];
                    if (tVar.a(f476729f, "2.0.0") >= 0) {
                        for (int i17 = 0; i17 < 16; i17++) {
                            bArr2[i17] = (byte) (q19[i17] ^ 18);
                        }
                        q19 = bArr2;
                    }
                    javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
                    cipher.init(2, new javax.crypto.spec.SecretKeySpec(q17, "AES"), new javax.crypto.spec.IvParameterSpec(q19));
                    byte[] doFinal = cipher.doFinal(q18);
                    com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str2));
                    com.p314xaae8f345.mm.vfs.y6 y6Var = new com.p314xaae8f345.mm.vfs.y6(r6Var2);
                    try {
                        y6Var.write(doFinal);
                        vz5.b.a(y6Var, null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TLModuleManager", "dec suc");
                        java.lang.String o17 = r6Var2.o();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                        return o17;
                    } catch (java.lang.Throwable th6) {
                        try {
                            throw th6;
                        } catch (java.lang.Throwable th7) {
                            vz5.b.a(y6Var, th6);
                            throw th7;
                        }
                    }
                } catch (java.lang.Throwable th8) {
                    try {
                        throw th8;
                    } catch (java.lang.Throwable th9) {
                        vz5.b.a(u6Var, th8);
                        throw th9;
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TLModuleManager", "dec failed: %s", e17.getLocalizedMessage());
                return "";
            }
        }
    }

    public final void d(java.lang.String str) {
        if (str.length() == 0) {
            return;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a()) {
            m17.f294799a.d(m17.f294800b);
        }
    }

    public final void e(int i17, java.lang.String str, org.json.JSONObject jsonSecreport) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonSecreport, "jsonSecreport");
        java.lang.String str2 = str == null ? "" : str;
        int i19 = 0;
        if (f476729f.length() == 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
            f476729f = java.lang.String.valueOf(L != null ? L.getString("WXANOPSLAVR", "NotExist") : null);
        }
        jsonSecreport.put("Ver", f476729f);
        if (!f476725b) {
            java.lang.String str3 = com.p314xaae8f345.mm.vfs.q7.c("PublicResource") + "/anops";
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str3);
            java.lang.String str4 = a17.f294812f;
            if (str4 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
                if (!str4.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str3);
                sb6.append('/');
                java.util.ArrayList arrayList = new java.util.ArrayList(15);
                for (int i27 = 0; i27 < 15; i27++) {
                    arrayList.add(java.lang.Character.valueOf((char) ("OJAWS@P\u000eOJWF\rPL".charAt(i27) ^ '#')));
                }
                sb6.append(kz5.n0.g0(arrayList, "", null, null, 0, null, null, 62, null));
                java.lang.String sb7 = sb6.toString();
                java.lang.String concat = str3.concat("/anopro.dat");
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(concat);
                if (r6Var.m()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TLModuleManager", "probe file exist, something wrong!");
                    i18 = -10;
                } else {
                    r6Var.k();
                    java.lang.String c17 = c(f(str3), sb7);
                    if (c17.length() == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TLModuleManager", "so dec failed");
                        d(concat);
                        i18 = -9;
                    } else {
                        try {
                            com.p314xaae8f345.cso.C2941xefde02d2.h(c17);
                            com.p314xaae8f345.mm.p689xc5a27af6.p766xd031a825.p767xdb7d1c3f.C10693x85432fd9.f28936x4fbc8495.m45317x316510(0, str2);
                            f476725b = true;
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TLModuleManager", "load failed: %s", e17.getLocalizedMessage());
                            i19 = -4;
                        }
                        d(concat);
                        i18 = i19;
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TLModuleManager", "DIR not exist!");
                i18 = -7;
            }
            if (i18 != 0) {
                jsonSecreport.put("Error", i18);
                return;
            }
        }
        try {
            java.lang.String m45316x2d64eb13 = com.p314xaae8f345.mm.p689xc5a27af6.p766xd031a825.p767xdb7d1c3f.C10693x85432fd9.f28936x4fbc8495.m45316x2d64eb13(i17, str2);
            if (m45316x2d64eb13 == null) {
                m45316x2d64eb13 = "{}";
            }
            jsonSecreport.put("Result", new org.json.JSONObject(m45316x2d64eb13));
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TLModuleManager", "json error: %s", e18.getLocalizedMessage());
        }
    }

    public final java.lang.String f(java.lang.String str) {
        return str + '/' + (wo.w0.q() ? "anops.en64.img" : "anops.en32.img");
    }

    public final boolean g() {
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(f(com.p314xaae8f345.mm.vfs.q7.c("PublicResource") + "/anops"));
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a()) {
            return m17.f294799a.F(m17.f294800b);
        }
        return false;
    }

    public final boolean h() {
        if (f476729f.length() == 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
            f476729f = java.lang.String.valueOf(L != null ? L.getString("WXANOPSLAVR", "") : null);
        }
        return a(f476729f, "0.0.7") >= 0;
    }

    public final void i(java.lang.String str, com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append('/');
        java.lang.String m82467xfb82e301 = r6Var.m82467xfb82e301();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82467xfb82e301, "getName(...)");
        sb6.append(r26.i0.t(m82467xfb82e301, "up.img", ".so", false));
        java.lang.String c17 = c(r6Var.o(), sb6.toString());
        java.lang.String o17 = r6Var.o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        d(o17);
        if (c17.length() == 0) {
            j(str2 + " load fail");
            return;
        }
        com.p314xaae8f345.cso.C2941xefde02d2 c2941xefde02d2 = com.p314xaae8f345.cso.C2941xefde02d2.f127467a;
        com.p314xaae8f345.cso.C2941xefde02d2.h(c17);
        d(c17);
        java.lang.String error = str2 + " load success";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("TPInfo", error);
        new vs4.a("MicroMsg.TLModuleManager", jSONObject.toString()).l().K(rg0.s.f476723a);
    }

    public final void j(java.lang.String error) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("TPError", error);
        new vs4.a("MicroMsg.TLModuleManager", jSONObject.toString()).l().K(rg0.r.f476722a);
    }
}
