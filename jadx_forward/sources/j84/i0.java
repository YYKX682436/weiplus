package j84;

/* loaded from: classes4.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f379742a;

    /* renamed from: b, reason: collision with root package name */
    public j84.g0 f379743b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f379744c;

    public i0(int i17) {
        this.f379742a = i17;
    }

    public final void a(android.app.Activity activity, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, i64.b1 b1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindAdScratchCardComponent", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardLogic");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindAdScratchCardComponent", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardLogic");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdScratchCardLogic", "bindAdScratchCardComponent");
        if (c17933xe8d1b226.m70354x74235b3e().f38206x78154a55 != null) {
            s34.w0 w0Var = c17933xe8d1b226.m70354x74235b3e().f38206x78154a55;
            bm5.o1 o1Var = bm5.o1.f104252a;
            if (o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.ad.C19903xb3a33b57()) == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdScratchCardLogic", "RepairerConfigAdScratchCardNotSaveStatus==1");
            } else {
                s34.w0.f484335q.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScratchStatus", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo$Companion");
                r6 = o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.ad.C19903xb3a33b57()) != 1 ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b("true", p34.o.d(a84.d0.c(c17933xe8d1b226), "scratchStatus")) : false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScratchStatus", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo$Companion");
            }
            w0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setScratched", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
            w0Var.f484350n = r6;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScratched", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
        }
        if (this.f379743b == null && c17933xe8d1b226.m70354x74235b3e().f38206x78154a55 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            if (activity instanceof p012xc85e97e9.p093xedfae76a.y) {
                h0Var.f391656d = activity;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdScratchCardLogic", "create adScratchCardComponent");
            this.f379743b = new j84.h0(h0Var, view, b1Var, this.f379742a);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh ad AdScratchCard, oldSnsId is ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = this.f379744c;
        sb6.append(ca4.z0.t0(c17933xe8d1b2262 != null ? c17933xe8d1b2262.f68891x29d1292e : 0L));
        sb6.append(", newSnsId is ");
        sb6.append(ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdScratchCardLogic", sb6.toString());
        this.f379744c = c17933xe8d1b226;
        j84.g0 g0Var = this.f379743b;
        if (g0Var != null) {
            g0Var.f(c17933xe8d1b226);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindAdScratchCardComponent", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardLogic");
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdScratchCardLogic", "resetUI");
        j84.g0 g0Var = this.f379743b;
        if (g0Var != null) {
            g0Var.H();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardLogic");
    }
}
