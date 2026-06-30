package t74;

/* loaded from: classes4.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public t74.b2 f497657a;

    /* renamed from: b, reason: collision with root package name */
    public t74.w1 f497658b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f497659c;

    public final void a(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindAdFlipCardComponent", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindAdFlipCardComponent", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
            return;
        }
        if (this.f497657a == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindAdFlipCardComponent", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
            return;
        }
        if (this.f497658b == null && c17933xe8d1b226.m70395x9b8322ea()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            if (activity instanceof p012xc85e97e9.p093xedfae76a.y) {
                h0Var.f391656d = activity;
            }
            t74.b2 b2Var = this.f497657a;
            if (b2Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemRootView", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemRootView", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
                view = b2Var.f497642c;
            } else {
                view = null;
            }
            this.f497658b = new t74.c2(h0Var, view, this.f497657a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFlipCardLogic", "create ad flip card component");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh ad flip card component, oldSnsId is ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = this.f497659c;
        sb6.append(ca4.z0.t0(c17933xe8d1b2262 != null ? c17933xe8d1b2262.f68891x29d1292e : 0L));
        sb6.append(", newSnsId is ");
        sb6.append(ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFlipCardLogic", sb6.toString());
        this.f497659c = c17933xe8d1b226;
        t74.w1 w1Var = this.f497658b;
        if (w1Var != null) {
            w1Var.f(c17933xe8d1b226);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindAdFlipCardComponent", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
    }

    public final void b(int i17) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup b17;
        android.view.ViewGroup c17;
        android.view.ViewGroup.LayoutParams layoutParams2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcTouchClickArea", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        t74.b2 b2Var = this.f497657a;
        if (b2Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcTouchClickArea", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
            return;
        }
        if (b2Var != null && (c17 = b2Var.c()) != null && (layoutParams2 = c17.getLayoutParams()) != null) {
            layoutParams2.width = i17;
            layoutParams2.height = (int) (i17 * 0.75f);
        }
        t74.b2 b2Var2 = this.f497657a;
        android.view.View findViewById = (b2Var2 == null || (b17 = b2Var2.b()) == null) ? null : b17.findViewById(com.p314xaae8f345.mm.R.id.twz);
        if (findViewById != null && (layoutParams = findViewById.getLayoutParams()) != null) {
            layoutParams.width = i17;
            layoutParams.height = -2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcTouchClickArea", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        t74.w1 w1Var = this.f497658b;
        if (w1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w1Var.j(), "onAdRemoved");
            w1Var.f497805m0 = true;
            a84.t0.a(w1Var.f497824w0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        t74.w1 w1Var = this.f497658b;
        if (w1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            java.lang.String j17 = w1Var.j();
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w1Var.j(), "onUIDestroy");
                w1Var.m0(w1Var.f497794b0);
                w1Var.m0(w1Var.f497793a0);
            } catch (java.lang.Throwable th6) {
                ca4.q.c(j17, th6);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
    }

    public final void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlayByActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        t74.w1 w1Var = this.f497658b;
        if (w1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlayByActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            java.lang.String j17 = w1Var.j();
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w1Var.j(), "pausePlayByActivity");
                w1Var.f497830z0 = false;
                w1Var.K0();
            } catch (java.lang.Throwable th6) {
                ca4.q.c(j17, th6);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlayByActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlayByActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
    }

    public final void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        t74.w1 w1Var = this.f497658b;
        if (w1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            p3325xe03a0797.p3326xc267989b.y0 h17 = w1Var.h();
            if (h17 != null) {
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.l.d(h17, ((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h.mo7096x348d9a(w1Var.A0), null, new t74.v1(w1Var, null), 2, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
    }
}
