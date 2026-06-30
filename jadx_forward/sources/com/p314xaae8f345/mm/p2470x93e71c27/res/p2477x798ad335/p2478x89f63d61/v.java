package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61;

/* loaded from: classes12.dex */
public abstract class v {
    public static boolean a(java.lang.String str, java.util.Map map) {
        if (map.get(str) != null) {
            return false;
        }
        if (map.get(str + ".resType") != null) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(".subType");
        return map.get(sb6.toString()) == null;
    }

    public static boolean b(java.lang.String str, java.lang.String str2, java.util.Map map, boolean z17) {
        java.lang.String format = java.lang.String.format("%s.%s.%s", str, str2, "Resource");
        int a17 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.b0.a(str2);
        if (a(format, map)) {
            return true;
        }
        int i17 = 0;
        boolean d17 = d(a17, format, map, z17) | false;
        while (true) {
            i17++;
            java.lang.String format2 = java.lang.String.format(java.util.Locale.US, "%s.%s.%s%d", str, str2, "Resource", java.lang.Integer.valueOf(i17));
            if (a(format2, map)) {
                return d17;
            }
            d17 |= d(a17, format2, map, z17);
        }
    }

    public static void c(java.lang.String str, java.lang.String str2, java.util.Map map, boolean z17) {
        if (a(java.lang.String.format("%s.%s", str, str2), map)) {
            return;
        }
        boolean b17 = b(str, str2, map, z17) | false;
        int i17 = 0;
        while (true) {
            i17++;
            if (a(java.lang.String.format(java.util.Locale.US, "%s.%s%d", str, str2, java.lang.Integer.valueOf(i17)), map)) {
                break;
            } else {
                b17 |= b(str, str2, map, z17);
            }
        }
        int a17 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.b0.a(str2);
        if ((a17 & 1) > 0) {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(0L, 32L);
            if (b17) {
                return;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(0L, 33L);
            return;
        }
        if ((a17 & 2) > 0) {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(0L, 35L);
            if (b17) {
                return;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(0L, 36L);
            return;
        }
        if ((a17 & 4) > 0) {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(0L, 38L);
            if (b17) {
                return;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a(0L, 39L);
        }
    }

    public static boolean d(int i17, java.lang.String str, java.util.Map map, boolean z17) {
        if (map.get(str + ".resType") == null) {
            if (map.get(str + ".subType") == null) {
                return true;
            }
        }
        if ((i17 & 4) > 0) {
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".resType"), -1);
            int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".subType"), -1);
            if (-1 == P || -1 == P2) {
                return false;
            }
            r45.vr5 vr5Var = new r45.vr5();
            vr5Var.f470001d = P2;
            r45.bs5 bs5Var = new r45.bs5();
            vr5Var.f470002e = bs5Var;
            bs5Var.f452559e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".resVer"), 0);
            vr5Var.f470006i = (java.lang.String) map.get(str + ".sampleID");
            vr5Var.f470005h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".reportID"), 0);
            vr5Var.f470004g = 4;
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().g(P, vr5Var, true);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a((long) vr5Var.f470005h, 40L);
            return true;
        }
        if (!((i17 & 1) > 0)) {
            if (!((i17 & 2) > 0)) {
                return false;
            }
            int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".resType"), -1);
            int P4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".subType"), -1);
            if (-1 == P3 || -1 == P4) {
                return false;
            }
            r45.vr5 vr5Var2 = new r45.vr5();
            r45.as5 as5Var = new r45.as5();
            vr5Var2.f470003f = as5Var;
            vr5Var2.f470001d = P4;
            as5Var.f451777e = (java.lang.String) map.get(str + ".resKey");
            vr5Var2.f470003f.f451776d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".resKeyVersion"), 0);
            vr5Var2.f470006i = (java.lang.String) map.get(str + ".sampleID");
            vr5Var2.f470005h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".reportID"), 0);
            vr5Var2.f470004g = 2;
            r45.bs5 bs5Var2 = new r45.bs5();
            vr5Var2.f470002e = bs5Var2;
            bs5Var2.f452564m = (java.lang.String) map.get(str + ".originalmd5");
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().f(P3, vr5Var2, true, z17 ^ true);
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a((long) vr5Var2.f470005h, 37L);
            return true;
        }
        java.lang.String str2 = (java.lang.String) map.get(str + ".CDNUrl");
        int P5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".subType"), -1);
        int P6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".resType"), -1);
        java.lang.String str3 = (java.lang.String) map.get(str + ".md5");
        int P7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".priority"), 0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || -1 == P5 || -1 == P6 || P7 < 0) {
            return false;
        }
        r45.vr5 vr5Var3 = new r45.vr5();
        vr5Var3.f470002e = new r45.bs5();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(".fileEncrypt");
        int i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(sb6.toString()), 0) > 0 ? 1 : 0;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".fileCompress"), 0) > 0) {
            i18 |= 2;
        }
        vr5Var3.f470001d = P5;
        vr5Var3.f470010p = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".networkType"), 2);
        vr5Var3.f470007m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".expireTime"), 1);
        r45.bs5 bs5Var3 = vr5Var3.f470002e;
        bs5Var3.f452560f = str2;
        bs5Var3.f452559e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".resVer"), 0);
        r45.bs5 bs5Var4 = vr5Var3.f470002e;
        bs5Var4.f452558d = str3;
        bs5Var4.f452564m = (java.lang.String) map.get(str + ".originalmd5");
        r45.bs5 bs5Var5 = vr5Var3.f470002e;
        bs5Var5.f452561g = i18;
        bs5Var5.f452562h = null;
        bs5Var5.f452563i = null;
        vr5Var3.f470012r = P7;
        vr5Var3.f470004g = 1;
        vr5Var3.f470005h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".reportID"), 0);
        vr5Var3.f470006i = (java.lang.String) map.get(str + ".sampleID");
        vr5Var3.f470008n = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".retryTime"), 3);
        vr5Var3.f470011q = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".retryInterval"), 0);
        vr5Var3.f470009o = 0;
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().e(P6, vr5Var3, true);
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.e0.a((long) vr5Var3.f470005h, 34L);
        return true;
    }
}
