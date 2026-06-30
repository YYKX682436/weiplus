package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class qf extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.j7 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f217227d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f217228e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f217229f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f217230g;

    /* renamed from: h, reason: collision with root package name */
    public db5.d5 f217231h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217232i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f217233m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f217234n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f217235o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f217236p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f217230g = "";
        this.f217232i = new java.util.concurrent.ConcurrentHashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        this.f217233m = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209260h3).mo141623x754a37bb()).r()).intValue() == 1;
        this.f217234n = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.af.f215305d);
        this.f217236p = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.df(this));
    }

    public final void O6() {
        Q6(false);
        db5.d5 d5Var = this.f217231h;
        if (d5Var != null) {
            d5Var.dismiss();
        }
        this.f217231h = null;
        this.f217235o = false;
    }

    public final void P6(android.view.View view, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, str);
        aVar.ik(view, i17, 25496);
        aVar.gk(view, kz5.c1.k(new jz5.l("feed_id", str2), new jz5.l("comment_text", str3)));
        zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(m158354x19263085());
        aVar.Ai(view, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bf(Sj != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).V6() : null));
    }

    public final void Q6(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f217229f;
        if (c14994x9b99c079 != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217232i;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ze zeVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ze) concurrentHashMap.get(java.lang.Long.valueOf(c14994x9b99c079.m59251x5db1b11()));
            if (zeVar == null) {
                zeVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ze) concurrentHashMap.get(java.lang.Long.valueOf(c14994x9b99c079.m59260x51f8f5b0()));
            }
            if (zeVar != null) {
                android.view.View p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.w8) zeVar).f186386b.p(com.p314xaae8f345.mm.R.id.f566019ee3);
                if (z17) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Float.valueOf(0.3f));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$addShareSnsToCommentCallback$1", "onShowTips", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    p17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$addShareSnsToCommentCallback$1", "onShowTips", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    return;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$addShareSnsToCommentCallback$1", "onShowTips", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                p17.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$addShareSnsToCommentCallback$1", "onShowTips", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }

    public final void R6() {
        if (this.f217233m) {
            O6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        m80380x71e92c1d().removeCallbacks((java.lang.Runnable) ((jz5.n) this.f217236p).mo141623x754a37bb());
        this.f217232i.clear();
        db5.d5 d5Var = this.f217231h;
        if (d5Var != null) {
            d5Var.dismiss();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        this.f217228e = true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        this.f217228e = false;
        if (this.f217227d) {
            android.view.View m80380x71e92c1d = m80380x71e92c1d();
            jz5.n nVar = (jz5.n) this.f217236p;
            m80380x71e92c1d.removeCallbacks((java.lang.Runnable) nVar.mo141623x754a37bb());
            m80380x71e92c1d().postDelayed((java.lang.Runnable) nVar.mo141623x754a37bb(), 500L);
            this.f217227d = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f217230g = "";
        this.f217232i = new java.util.concurrent.ConcurrentHashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        this.f217233m = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209260h3).mo141623x754a37bb()).r()).intValue() == 1;
        this.f217234n = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.af.f215305d);
        this.f217236p = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.df(this));
    }
}
