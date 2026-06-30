package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes12.dex */
public class la extends l75.s0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.n3 f276629d;

    public la(com.p314xaae8f345.mm.p2621x8fb0427b.n3 n3Var) {
        this.f276629d = null;
        this.f276629d = n3Var;
    }

    public static java.lang.String m0() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("<deviceinfo><MANUFACTURER name=\"");
        stringBuffer.append(android.os.Build.MANUFACTURER);
        stringBuffer.append("\"><MODEL name=\"");
        stringBuffer.append(wo.w0.m());
        stringBuffer.append("\"><VERSION_RELEASE name=\"");
        stringBuffer.append(android.os.Build.VERSION.RELEASE);
        stringBuffer.append("\"><VERSION_INCREMENTAL name=\"");
        stringBuffer.append(android.os.Build.VERSION.INCREMENTAL);
        stringBuffer.append("\"><DISPLAY name=\"");
        stringBuffer.append(android.os.Build.DISPLAY);
        stringBuffer.append("\"></DISPLAY></VERSION_INCREMENTAL></VERSION_RELEASE></MODEL></MANUFACTURER></deviceinfo>");
        return stringBuffer.toString();
    }

    public static java.lang.String s0() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String str = android.os.Build.FINGERPRINT;
        if (str != null) {
            str = str.replace("/", ":");
        }
        linkedHashMap.put(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.f47003xb618721a, str);
        linkedHashMap.put("manufacturer", android.os.Build.MANUFACTURER);
        linkedHashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280, android.os.Build.DEVICE);
        linkedHashMap.put("model", wo.w0.m());
        linkedHashMap.put("product", android.os.Build.PRODUCT);
        linkedHashMap.put("board", android.os.Build.BOARD);
        linkedHashMap.put("release", android.os.Build.VERSION.RELEASE);
        linkedHashMap.put("codename", android.os.Build.VERSION.CODENAME);
        linkedHashMap.put("incremental", android.os.Build.VERSION.INCREMENTAL);
        linkedHashMap.put("display", android.os.Build.DISPLAY);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<key>");
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (key == null) {
                key = "unknow";
            }
            if (value == null) {
                value = "unknow";
            }
            sb6.append("<" + key + ">");
            sb6.append(value);
            sb6.append("</" + key + ">");
        }
        sb6.append("</key>");
        return sb6.toString();
    }

    public static boolean z0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "deviceinfoconfig", null) == null || !gm0.j1.a()) {
                return false;
            }
            gm0.j1.i();
            gm0.j1.u().j().y0(str);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ServerConfigInfoStorage", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return false;
        }
    }

    public java.lang.String n0(int i17) {
        return (java.lang.String) this.f276629d.l(i17, null);
    }

    public void u0() {
        java.lang.String str = (java.lang.String) this.f276629d.l(77825, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ServerConfigInfoStorage", "hy: readConfig xml " + str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            super.mo145247xf35bbb4(str);
        }
        int i17 = 0;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ServerConfigInfoStorage", "hy: got conf from db");
        } else {
            java.lang.String str2 = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a + "deviceconfig.cfg";
            if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str2, 0, -1);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(N)) {
                    i17 = -2;
                } else {
                    java.lang.String str3 = new java.lang.String(N, java.nio.charset.Charset.defaultCharset());
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        i17 = -3;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ServerConfigInfoStorage", "hy: read from file: %s", str3);
                        y0(str3);
                    }
                }
            } else {
                i17 = -1;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ServerConfigInfoStorage", "hy: read from local retcode: %d", java.lang.Integer.valueOf(i17));
    }

    public int y0(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.a7 a7Var;
        this.f276629d.w(77825, str);
        java.lang.String str2 = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a;
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str2);
        java.lang.String str3 = a17.f294812f;
        if (str3 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
        com.p314xaae8f345.mm.vfs.a7 a7Var2 = null;
        com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
            if (m18.a()) {
                m18.f294799a.r(m18.f294800b);
            }
        }
        try {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ServerConfigInfoStorage", "writeConfigToLocalFile, path: %s, info:%s", str2.concat("deviceconfig.cfg"), str);
                a7Var = new com.p314xaae8f345.mm.vfs.a7(str2.concat("deviceconfig.cfg"));
            } catch (java.lang.Exception e17) {
                e = e17;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            a7Var = a7Var2;
        }
        try {
            a7Var.write(str);
            a7Var.close();
            try {
                a7Var.close();
            } catch (java.lang.Exception e18) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ServerConfigInfoStorage", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
            }
        } catch (java.lang.Exception e19) {
            e = e19;
            a7Var2 = a7Var;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ServerConfigInfoStorage", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e));
            if (a7Var2 != null) {
                try {
                    a7Var2.close();
                } catch (java.lang.Exception e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ServerConfigInfoStorage", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e27));
                }
            }
            super.mo145247xf35bbb4(str);
            return 0;
        } catch (java.lang.Throwable th7) {
            th = th7;
            if (a7Var != null) {
                try {
                    a7Var.close();
                } catch (java.lang.Exception e28) {
                    boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ServerConfigInfoStorage", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e28));
                }
            }
            throw th;
        }
        super.mo145247xf35bbb4(str);
        return 0;
    }
}
