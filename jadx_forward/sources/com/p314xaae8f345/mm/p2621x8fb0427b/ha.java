package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes12.dex */
public class ha {

    /* renamed from: c, reason: collision with root package name */
    public static final bm5.p1 f276546c = new com.p314xaae8f345.mm.p2621x8fb0427b.ga();

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f276547d = lp0.b.X() + "MicroMsg/regioncode/";

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f276548a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f276549b = "";

    public static com.p314xaae8f345.mm.p2621x8fb0427b.ha k() {
        bm5.p1 p1Var = f276546c;
        com.p314xaae8f345.mm.p2621x8fb0427b.ha haVar = (com.p314xaae8f345.mm.p2621x8fb0427b.ha) p1Var.b();
        haVar.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals(haVar.f276548a)) {
            haVar.a();
        }
        return (com.p314xaae8f345.mm.p2621x8fb0427b.ha) p1Var.b();
    }

    public static java.lang.String q(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(16);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            sb6.append(str);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                sb6.append('_');
                sb6.append(str2);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    sb6.append('_');
                    sb6.append(str3);
                }
            }
        }
        return sb6.toString();
    }

    public static boolean r(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        return str.equalsIgnoreCase("cn");
    }

    public static void s() {
        bm5.p1 p1Var = f276546c;
        if (p1Var.c()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.C21049x42abc242.m77918x41012807();
            p1Var.m10823x6761d4f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01da, code lost:
    
        if ((com.p314xaae8f345.mm.vfs.w6.d("assets:///regioncode/mmregioncode_en.txt", r5.o(), false) > 0) == false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.ha.a():void");
    }

    public final synchronized void b(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        java.lang.String[] D = r6Var.m() ? r6Var.D() : null;
        if (!r6Var.m() || D == null || D.length == 0) {
            try {
                for (java.lang.String str : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().list("regioncode")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RegionCodeDecoder", "from:%s,  to:%s", "regioncode/" + str, r6Var.u() + "/" + str);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(r6Var.u());
                    sb6.append("/");
                    sb6.append(str);
                    java.lang.String sb7 = sb6.toString();
                    com.p314xaae8f345.mm.vfs.w6.c("assets:///regioncode/" + str, sb7);
                    d(new com.p314xaae8f345.mm.vfs.r6(sb7), r6Var);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RegionCodeDecoder", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public final java.lang.String c(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        return f276547d + "mmregioncode_" + str + ".txt";
    }

    public void d(com.p314xaae8f345.mm.vfs.r6 r6Var, com.p314xaae8f345.mm.vfs.r6 r6Var2) {
        com.p314xaae8f345.mm.vfs.a7 a7Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RegionCodeDecoder", "Generating hash file for: %s", r6Var.m82467xfb82e301());
        com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(r6Var2, r6Var.m82467xfb82e301() + ".hash");
        java.lang.String o17 = o(r6Var);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o17)) {
            return;
        }
        if (!r6Var3.m()) {
            r6Var3.s().J();
        }
        com.p314xaae8f345.mm.vfs.a7 a7Var2 = null;
        try {
            try {
                a7Var = new com.p314xaae8f345.mm.vfs.a7(r6Var3);
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
            try {
                a7Var.write(o17);
                a7Var.close();
            } catch (java.lang.Throwable th7) {
                th = th7;
                a7Var2 = a7Var;
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RegionCodeDecoder", th, "Failed to save hash file of %s", r6Var.m82467xfb82e301());
                    if (a7Var2 != null) {
                        a7Var2.close();
                    }
                } catch (java.lang.Throwable th8) {
                    if (a7Var2 != null) {
                        try {
                            a7Var2.close();
                        } catch (java.lang.Throwable unused) {
                        }
                    }
                    throw th8;
                }
            }
        } catch (java.lang.Throwable unused2) {
        }
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5[] e(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f276549b) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return null;
        }
        return com.p314xaae8f345.mm.p2621x8fb0427b.C21049x42abc242.m77914x1404de3f(this.f276549b, str, str2);
    }

    public java.lang.String f(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            return null;
        }
        return l(q(str, str2, str3));
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5[] g() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f276549b)) {
            return null;
        }
        return com.p314xaae8f345.mm.p2621x8fb0427b.C21049x42abc242.m77915x500d0bfe(this.f276549b);
    }

    public java.lang.String h(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String f17 = f(str, str2, str3);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17)) {
            return f17;
        }
        if (str3 == null) {
            str3 = "";
        }
        return str3;
    }

    public java.lang.String i(java.lang.String str) {
        java.lang.String l17 = l(str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17)) {
            return l17;
        }
        if (str == null) {
            str = "";
        }
        return str;
    }

    public java.lang.String j(java.lang.String str, java.lang.String str2) {
        java.lang.String m17 = m(str, str2);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m17)) {
            return m17;
        }
        if (str2 == null) {
            str2 = "";
        }
        return str2;
    }

    public final java.lang.String l(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        return com.p314xaae8f345.mm.p2621x8fb0427b.C21049x42abc242.m77916x51f02db5(str);
    }

    public java.lang.String m(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return null;
        }
        return l(q(str, str2, null));
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5[] n(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f276549b) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        return com.p314xaae8f345.mm.p2621x8fb0427b.C21049x42abc242.m77917xdeceac8d(this.f276549b, str);
    }

    public final java.lang.String o(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(r6Var.u());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RegionCodeDecoder", "Failed to calculate hash for file %s", r6Var.m82467xfb82e301());
            return null;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(p17 + "#" + r6Var.B() + "#" + wo.w0.g(true));
    }

    public final java.lang.String p() {
        java.lang.String str = "mmregioncode_" + this.f276548a + ".txt";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mmregioncode_");
        sb6.append(this.f276548a.equalsIgnoreCase("zh_HK") ? "zh_TW" : this.f276548a);
        sb6.append(".txt");
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = f276547d;
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str2);
        java.lang.String str3 = a17.f294812f;
        if (str3 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17);
            if (m18.a()) {
                m18.f294799a.r(m18.f294800b);
            }
            return null;
        }
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str2 + str);
        java.lang.String str4 = a18.f294812f;
        if (str4 != null) {
            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l18)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m19 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
        if (!m19.a() ? false : m19.f294799a.F(m19.f294800b)) {
            return str;
        }
        if (this.f276548a.equalsIgnoreCase("zh_HK")) {
            com.p314xaae8f345.mm.vfs.z7 a19 = com.p314xaae8f345.mm.vfs.z7.a(str2 + sb7);
            java.lang.String str5 = a19.f294812f;
            if (str5 != null) {
                java.lang.String l19 = com.p314xaae8f345.mm.vfs.e8.l(str5, false, false);
                if (!str5.equals(l19)) {
                    a19 = new com.p314xaae8f345.mm.vfs.z7(a19.f294810d, a19.f294811e, l19, a19.f294813g, a19.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m27 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a19, null);
            if (!m27.a() ? false : m27.f294799a.F(m27.f294800b)) {
                return sb7;
            }
        }
        com.p314xaae8f345.mm.vfs.z7 a27 = com.p314xaae8f345.mm.vfs.z7.a(str2 + "mmregioncode_en.txt");
        java.lang.String str6 = a27.f294812f;
        if (str6 != null) {
            java.lang.String l27 = com.p314xaae8f345.mm.vfs.e8.l(str6, false, false);
            if (!str6.equals(l27)) {
                a27 = new com.p314xaae8f345.mm.vfs.z7(a27.f294810d, a27.f294811e, l27, a27.f294813g, a27.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m28 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a27, null);
        if (m28.a() ? m28.f294799a.F(m28.f294800b) : false) {
            return "mmregioncode_en.txt";
        }
        return null;
    }
}
