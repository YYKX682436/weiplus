package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes4.dex */
public class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f283102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283103e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f283104f;

    public y1(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, t21.v2 v2Var) {
        this.f283102d = f9Var;
        this.f283103e = str;
        this.f283104f = v2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.app.t0 t0Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f283102d;
        try {
            boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0());
            com.p314xaae8f345.mm.app.s0 s0Var = com.p314xaae8f345.mm.app.s0.VIDEO;
            if (R4) {
                t0Var = new com.p314xaae8f345.mm.app.t0(2, s0Var, null);
                if (f9Var.A0() == 1) {
                    t0Var.f135312b = c01.z1.r();
                    t0Var.f135313c = f9Var.Q0();
                } else {
                    t0Var.f135312b = c01.w9.s(f9Var.j());
                    t0Var.f135313c = f9Var.Q0();
                }
            } else {
                t0Var = new com.p314xaae8f345.mm.app.t0(1, s0Var, null);
                if (f9Var.A0() == 1) {
                    t0Var.f135312b = c01.z1.r();
                    t0Var.f135313c = f9Var.Q0();
                } else {
                    t0Var.f135312b = f9Var.Q0();
                    t0Var.f135313c = c01.z1.r();
                }
            }
            qc0.d1 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p2015x36f002.C17096x4dad80a5.f237984a.b(this.f283103e);
            if (b17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryAdapter", "[-] Fail to get video data info, skip reporting. msgId:%s, msgSvrId:%s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Long.valueOf(f9Var.I0()));
                return;
            }
            t21.v2 v2Var = this.f283104f;
            java.util.Map d17 = v2Var != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(v2Var.g(), "msg", null) : java.util.Collections.emptyMap();
            if (d17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryAdapter", "[-] Fail to parse recv xml. msgId:%s, msgSvrId:%s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Long.valueOf(f9Var.I0()));
                return;
            }
            t0Var.f135314d = f9Var.I0();
            java.lang.String str = (java.lang.String) d17.get(".msg.videomsg.$cdnvideourl");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            t0Var.f135316f = str;
            t0Var.f135317g = b17.f442896a;
            t0Var.f135318h = b17.f442897b;
            java.lang.String str3 = (java.lang.String) d17.get(".msg.videomsg.$cdnthumburl");
            if (str3 == null) {
                str3 = "";
            }
            t0Var.f135319i = str3;
            t0Var.f135320j = (int) b17.f442899d;
            java.lang.String str4 = (java.lang.String) d17.get(".msg.videomsg.$cdnvideourl");
            if (str4 == null) {
                str4 = "";
            }
            t0Var.f135321k = str4;
            java.lang.String str5 = (java.lang.String) d17.get(".msg.videomsg.$aeskey");
            if (str5 == null) {
                str5 = "";
            }
            t0Var.f135322l = str5;
            java.lang.String str6 = (java.lang.String) d17.get(".msg.videomsg.$md5");
            if (str6 != null) {
                str2 = str6;
            }
            t0Var.f135323m = str2;
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0())) {
                java.util.List L0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().L0(f9Var.Q0());
                t0Var.f135325o = L0 != null ? ((java.util.LinkedList) L0).size() : 0;
            }
            com.p314xaae8f345.mm.app.u0.a(t0Var);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ImageGalleryAdapter", th6, "[-] Exception was thrown when report.", new java.lang.Object[0]);
        }
    }
}
