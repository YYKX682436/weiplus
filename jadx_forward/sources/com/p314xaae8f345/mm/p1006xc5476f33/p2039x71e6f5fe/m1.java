package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

@j95.b
/* loaded from: classes5.dex */
public class m1 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f240289d;

    /* renamed from: e, reason: collision with root package name */
    public zz3.a f240290e;

    public m1() {
        new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s();
    }

    public static synchronized com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m1 Ai() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m1 m1Var;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m1.class) {
            m1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m1.class);
        }
        return m1Var;
    }

    public zz3.a Bi() {
        gm0.j1.b().c();
        if (this.f240290e == null) {
            this.f240290e = new zz3.a(gm0.j1.u().f354686f);
        }
        return this.f240290e;
    }

    public java.lang.String Di(java.lang.String str, java.lang.String str2) {
        if (!gm0.j1.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        return java.lang.String.format("%s/scanbook%s_%s", this.f240289d + "image/scan/img", str2, kk.k.g(str.getBytes()));
    }

    public java.lang.String Ni() {
        return wi() + "scan_camera/";
    }

    public void Ri() {
        if (this.f240289d != null) {
            java.lang.String d17 = gm0.j1.u().d();
            this.f240289d = d17;
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(d17);
            java.lang.String str = a17.f294812f;
            if (str != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
            com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                if (m18.a()) {
                    m18.f294799a.r(m18.f294800b);
                }
            }
            com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(d17.concat("image/scan/img"));
            java.lang.String str2 = a18.f294812f;
            if (str2 != null) {
                java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l18)) {
                    a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m19 = b3Var.m(a18, null);
            if (!(!m19.a() ? false : m19.f294799a.F(m19.f294800b))) {
                com.p314xaae8f345.mm.vfs.z2 m27 = b3Var.m(a18, m19);
                if (m27.a()) {
                    m27.f294799a.r(m27.f294800b);
                }
            }
            com.p314xaae8f345.mm.vfs.z7 a19 = com.p314xaae8f345.mm.vfs.z7.a(d17.concat("image/scan/music"));
            java.lang.String str3 = a19.f294812f;
            if (str3 != null) {
                java.lang.String l19 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l19)) {
                    a19 = new com.p314xaae8f345.mm.vfs.z7(a19.f294810d, a19.f294811e, l19, a19.f294813g, a19.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m28 = b3Var.m(a19, null);
            if (!(!m28.a() ? false : m28.f294799a.F(m28.f294800b))) {
                com.p314xaae8f345.mm.vfs.z2 m29 = b3Var.m(a19, m28);
                if (m29.a()) {
                    m29.f294799a.r(m29.f294800b);
                }
            }
            com.p314xaae8f345.mm.vfs.z7 a27 = com.p314xaae8f345.mm.vfs.z7.a(wi());
            java.lang.String str4 = a27.f294812f;
            if (str4 != null) {
                java.lang.String l27 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
                if (!str4.equals(l27)) {
                    a27 = new com.p314xaae8f345.mm.vfs.z7(a27.f294810d, a27.f294811e, l27, a27.f294813g, a27.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m37 = b3Var.m(a27, null);
            if (!(!m37.a() ? false : m37.f294799a.F(m37.f294800b))) {
                com.p314xaae8f345.mm.vfs.z2 m38 = b3Var.m(a27, m37);
                if (m38.a()) {
                    m38.f294799a.r(m38.f294800b);
                }
            }
            com.p314xaae8f345.mm.vfs.z7 a28 = com.p314xaae8f345.mm.vfs.z7.a(Ai().Ni());
            java.lang.String str5 = a28.f294812f;
            if (str5 != null) {
                java.lang.String l28 = com.p314xaae8f345.mm.vfs.e8.l(str5, false, false);
                if (!str5.equals(l28)) {
                    a28 = new com.p314xaae8f345.mm.vfs.z7(a28.f294810d, a28.f294811e, l28, a28.f294813g, a28.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m39 = b3Var.m(a28, null);
            if (!(m39.a() ? m39.f294799a.F(m39.f294800b) : false)) {
                com.p314xaae8f345.mm.vfs.z2 m47 = b3Var.m(a28, m39);
                if (m47.a()) {
                    m47.f294799a.r(m47.f294800b);
                }
            }
            com.p314xaae8f345.mm.vfs.w6.t(Ai().Ni());
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        Ri();
        s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.l1(this), "MicroMsg.scanner.SubCoreScannerdeleteOutDateImg");
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s.b();
    }

    public java.lang.String wi() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().d());
        sb6.append("scanner/");
        return sb6.toString();
    }
}
