package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes4.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m11.b0 f282767f;

    public o1(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, m11.b0 b0Var) {
        this.f282765d = str;
        this.f282766e = f9Var;
        this.f282767f = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.app.t0 t0Var;
        java.lang.String str = this.f282765d;
        try {
            android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f282766e;
            if (n07 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryAdapter", "[-] Fail to get bmp opts. msgId:%s, msgSvrId:%s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Long.valueOf(f9Var.I0()));
                return;
            }
            boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0());
            com.p314xaae8f345.mm.app.s0 s0Var = com.p314xaae8f345.mm.app.s0.IMAGE;
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
            java.lang.String[] ej6 = fo3.s.INSTANCE.ej(str);
            java.lang.String str2 = "";
            java.lang.String str3 = ej6 != null ? ej6[0] : "";
            m11.b0 b0Var = this.f282767f;
            java.util.Map d17 = b0Var != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(b0Var.f404185t, "msg", null) : java.util.Collections.emptyMap();
            if (d17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryAdapter", "[-] Fail to parse cdn info. msgId:%s, msgSvrId:%s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Long.valueOf(f9Var.I0()));
                return;
            }
            java.lang.String str4 = b0Var.f404173h == 1 ? (java.lang.String) d17.get(".msg.img.$cdnbigimgurl") : (java.lang.String) d17.get(".msg.img.$cdnmidimgurl");
            t0Var.f135314d = f9Var.I0();
            t0Var.f135316f = str4 == null ? "" : str4;
            t0Var.f135317g = n07.outWidth;
            t0Var.f135318h = n07.outHeight;
            java.lang.String str5 = (java.lang.String) d17.get(".msg.img.$cdnthumburl");
            if (str5 == null) {
                str5 = "";
            }
            t0Var.f135319i = str5;
            if (str4 == null) {
                str4 = "";
            }
            t0Var.f135321k = str4;
            java.lang.String str6 = (java.lang.String) d17.get(".msg.img.$aeskey");
            if (str6 != null) {
                str2 = str6;
            }
            t0Var.f135322l = str2;
            t0Var.f135323m = kk.k.e(str);
            t0Var.f135324n = str3;
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
