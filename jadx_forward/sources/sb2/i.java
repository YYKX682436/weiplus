package sb2;

/* loaded from: classes3.dex */
public final class i extends tc2.c {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f486947e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f486948f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f486949g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f486950h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    @Override // tc2.c
    public void P6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSlideEnterLiveTipController", "onBind");
        in5.s0 s0Var = this.f498674d.f498682i;
        java.lang.Object obj = s0Var != null ? s0Var.f374654e : null;
        final p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = obj instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f ? (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) obj : null;
        if (activityC1102x9ee2d9f != null) {
            this.f486950h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5483x5b38660c>(activityC1102x9ee2d9f) { // from class: com.tencent.mm.plugin.finder.convert.convertcontroller.FinderLiveSlideEnterLiveTipController$onBind$1$1
                {
                    this.f39173x3fe91575 = -441151460;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5483x5b38660c c5483x5b38660c) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5483x5b38660c event = c5483x5b38660c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSlideEnterLiveTipController", "onStopTimeListener");
                    sb2.i iVar = this;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = iVar.f486947e;
                    if (b4Var != null) {
                        b4Var.d();
                    }
                    pm0.v.X(new sb2.c(iVar));
                    return false;
                }
            };
        }
    }

    @Override // tc2.c
    public void Q6() {
        java.lang.Boolean bool;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15310x1d9feb31 c15310x1d9feb31;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSlideEnterLiveTipController", "onFocusFeedCenter");
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f486950h;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48813x58998cd();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSlideEnterLiveTipController", "tryToStartGuideTimer");
        tc2.g gVar = this.f498674d;
        in5.s0 s0Var = gVar.f498682i;
        if (s0Var == null || (c15310x1d9feb31 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15310x1d9feb31) s0Var.p(com.p314xaae8f345.mm.R.id.f566143ti1)) == null) {
            bool = null;
        } else {
            bool = java.lang.Boolean.valueOf(c15310x1d9feb31.M || c15310x1d9feb31.N);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSlideEnterLiveTipController", "in sliding");
            return;
        }
        in5.r rVar = gVar.f498683m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar = rVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf) rVar : null;
        if (!(zfVar != null && zfVar.f185893h == 4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveSlideEnterLiveTipController", "tabType is unSupport");
            return;
        }
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.T7).mo141623x754a37bb()).r()).intValue() != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveSlideEnterLiveTipController", "switch is off");
            return;
        }
        if (gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_FEED_SHOW_SLIDE_TO_ENTER_BOOLEAN_SYNC, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveSlideEnterLiveTipController", "already tip");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f486947e;
        if (b4Var != null) {
            b4Var.d();
        }
        sb2.h hVar = new sb2.h(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSlideEnterLiveTipController", "startShowGuideTimer delaySecond=5");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("ShownSlideToClose::Timer", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new sb2.g(hVar), false);
        long j17 = 5 * 1000;
        b4Var2.c(j17, j17);
        this.f486947e = b4Var2;
    }

    @Override // tc2.c
    public void U6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSlideEnterLiveTipController", "onUnFocusFeedCenter");
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f486950h;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f486947e;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = this.f486948f;
        if (b4Var2 != null) {
            b4Var2.d();
        }
    }

    @Override // tc2.c
    public void X6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSlideEnterLiveTipController", "onViewRecycled");
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f486950h;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f486947e;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = this.f486948f;
        if (b4Var2 != null) {
            b4Var2.d();
        }
    }

    public final void Y6() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSlideEnterLiveTipController", "clean");
            android.view.ViewGroup viewGroup = this.f486949g;
            if (viewGroup != null) {
                pm0.v.B(viewGroup);
            }
            android.view.ViewGroup viewGroup2 = this.f486949g;
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = viewGroup2 != null ? (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.v6p) : null;
            if (c22789xd23e9a9b != null) {
                c22789xd23e9a9b.h();
            }
            android.view.ViewGroup viewGroup3 = this.f486949g;
            if (viewGroup3 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(viewGroup3, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(viewGroup3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/convertcontroller/FinderLiveSlideEnterLiveTipController", "clean", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                viewGroup3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(viewGroup3, "com/tencent/mm/plugin/finder/convert/convertcontroller/FinderLiveSlideEnterLiveTipController", "clean", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(viewGroup3, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveSlideEnterLiveTipController", "clean fail " + e17);
        }
    }

    public final void Z6(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15288x851f5d51 c15288x851f5d51;
        in5.s0 s0Var = this.f498674d.f498682i;
        if (s0Var == null || (c15288x851f5d51 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15288x851f5d51) s0Var.p(com.p314xaae8f345.mm.R.id.efr)) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveRecommendView", "updateTouchTipVisible " + z17);
        if (z17) {
            android.view.View view = c15288x851f5d51.f212628e;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "updateTouchTipVisible", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "updateTouchTipVisible", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view2 = c15288x851f5d51.f212628e;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "updateTouchTipVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "updateTouchTipVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = c15288x851f5d51.f212628e;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "updateTouchTipVisible", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "updateTouchTipVisible", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view4 = c15288x851f5d51.f212628e;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(4);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "updateTouchTipVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/view/FinderFeedLiveRecommendView", "updateTouchTipVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
