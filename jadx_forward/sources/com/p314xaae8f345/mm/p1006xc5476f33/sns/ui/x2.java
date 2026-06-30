package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17957x723314d2 f253012d;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17957x723314d2 abstractC17957x723314d2) {
        this.f253012d = abstractC17957x723314d2;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.jj4 mo70574x2d3ab571;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17957x723314d2 abstractC17957x723314d2 = this.f253012d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.FlipView$2");
        try {
            mo70574x2d3ab571 = abstractC17957x723314d2.mo70574x2d3ab571();
            W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(abstractC17957x723314d2.mo70581x7525eefd());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FlipView", th6, "[-] Exception was thrown when report.", new java.lang.Object[0]);
        }
        if (W0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlipView", "[-] Fail to get snsInfo. snsId:%s", java.lang.Long.valueOf(abstractC17957x723314d2.mo70581x7525eefd()));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.FlipView$2");
            return;
        }
        java.lang.String l17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.l(mo70574x2d3ab571);
        if (l17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlipView", "[-] Fail to get path of media obj. snsLocalId:%s, snsId:%s, username:%s", W0.m70363x51f8f990(), W0.m70367x7525eefd(), W0.m70374x6bf53a6c());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.FlipView$2");
            return;
        }
        android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(l17);
        if (n07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlipView", "[-] Fail to get bmp opts of media obj. snsLocalId:%s, snsId:%s, username:%s", W0.m70363x51f8f990(), W0.m70367x7525eefd(), W0.m70374x6bf53a6c());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.FlipView$2");
            return;
        }
        java.lang.String[] ej6 = fo3.s.INSTANCE.ej(l17);
        java.lang.String str = ej6 != null ? ej6[0] : "";
        com.p314xaae8f345.mm.app.t0 t0Var = new com.p314xaae8f345.mm.app.t0(3, com.p314xaae8f345.mm.app.s0.IMAGE, null);
        t0Var.f135312b = W0.m70374x6bf53a6c();
        t0Var.f135314d = W0.f68891x29d1292e;
        t0Var.f135316f = mo70574x2d3ab571.f459391g;
        t0Var.f135317g = n07.outWidth;
        t0Var.f135318h = n07.outHeight;
        t0Var.f135319i = mo70574x2d3ab571.f459393i;
        t0Var.f135323m = kk.k.e(l17);
        t0Var.f135324n = str;
        com.p314xaae8f345.mm.app.u0.a(t0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.FlipView$2");
    }
}
