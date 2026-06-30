package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad;

/* loaded from: classes4.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f252596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f252597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f252598f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f252599g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f252600h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f252601i;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18429x1cf5f998 c18429x1cf5f998, int i17, int i18, int i19, int i27, int i28, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        this.f252596d = i17;
        this.f252597e = i18;
        this.f252598f = i19;
        this.f252599g = i27;
        this.f252600h = i28;
        this.f252601i = c17933xe8d1b226;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f252601i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout$1");
        try {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6878xf95f781c c6878xf95f781c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6878xf95f781c();
            c6878xf95f781c.f141968d = this.f252596d;
            c6878xf95f781c.f141969e = this.f252597e;
            c6878xf95f781c.f141970f = this.f252598f;
            c6878xf95f781c.f141971g = this.f252599g;
            c6878xf95f781c.f141972h = this.f252600h;
            c6878xf95f781c.f141973i = c6878xf95f781c.b("SnsId", ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e), true);
            c6878xf95f781c.f141974j = c6878xf95f781c.b("Uxinfo", c17933xe8d1b226.m70375x338a8cc7(), true);
            c6878xf95f781c.f141975k = c6878xf95f781c.b("Extra1", "", true);
            c6878xf95f781c.f141976l = c6878xf95f781c.b("Extra2", "", true);
            c6878xf95f781c.k();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdRoundedCornerFrameLayout", "reportClickCoordinate, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout$1");
    }
}
