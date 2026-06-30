package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f246282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f246283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.s7 f246284f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f246285g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 f246286h;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 i1Var, r45.jj4 jj4Var, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var, java.lang.String str) {
        this.f246286h = i1Var;
        this.f246282d = jj4Var;
        this.f246283e = i17;
        this.f246284f = s7Var;
        this.f246285g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$8");
        r45.jj4 jj4Var = this.f246282d;
        java.lang.String str = jj4Var.f459388d;
        int i17 = this.f246283e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "[%s][media:%s] run pushToImageLoaderUi decodeType:%d", "[image-flow]", str, java.lang.Integer.valueOf(i17));
        if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.c(this.f246286h, i17, jj4Var, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LazyerImageLoader2", "[%s][media:%s] run pushToImageLoaderUi false,do net request", "[image-flow]", jj4Var.f459388d);
            ca4.s0 s0Var = new ca4.s0(jj4Var);
            s0Var.d(i17);
            s0Var.e(jj4Var.f459388d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 Cj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj();
            r45.jj4 jj4Var2 = this.f246282d;
            Cj.e(jj4Var2, jj4Var2.f459389e == 6 ? 5 : 1, s0Var, this.f246284f, this.f246285g);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$8");
    }
}
