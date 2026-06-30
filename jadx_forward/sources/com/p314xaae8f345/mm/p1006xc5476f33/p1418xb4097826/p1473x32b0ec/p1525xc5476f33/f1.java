package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes.dex */
public final class f1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: p, reason: collision with root package name */
    public final te2.p f194011p;

    /* renamed from: q, reason: collision with root package name */
    public final te2.q f194012q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        te2.r rVar = new te2.r(context, S0(), statusMonitor);
        this.f194011p = rVar;
        android.content.Context context2 = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        te2.t tVar = new te2.t(root, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2, rVar);
        rVar.mo56536x3b13c504(tVar);
        tVar.f499953i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.e1(tVar);
        this.f194012q = tVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        te2.q qVar;
        te2.q qVar2;
        te2.q qVar3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        te2.p pVar = this.f194011p;
        if (ordinal == 227) {
            if (pVar == null || (qVar = ((te2.r) pVar).f499898d) == null) {
                return;
            }
            te2.t tVar = (te2.t) qVar;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("MMKVFinderLiveAllowanceGiftCardViewCallbackAnchor", false)) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putBoolean("MMKVFinderLiveAllowanceGiftCardViewCallbackAnchor", true);
            android.view.View view = tVar.f499950f;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showVisitorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showVisitorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = tVar.f499951g;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showVisitorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showVisitorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = tVar.f499952h;
            if (view3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showVisitorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showVisitorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view4 = tVar.f499948d;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showVisitorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showVisitorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (ordinal == 229) {
            if (pVar == null || (qVar2 = ((te2.r) pVar).f499898d) == null) {
                return;
            }
            te2.t tVar2 = (te2.t) qVar2;
            android.view.View view5 = tVar2.f499950f;
            if (view5 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showFailedCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showFailedCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view6 = tVar2.f499951g;
            if (view6 != null) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showFailedCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showFailedCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view7 = tVar2.f499952h;
            if (view7 != null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showFailedCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showFailedCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view8 = tVar2.f499948d;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showFailedCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showFailedCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (ordinal != 230 || pVar == null || (qVar3 = ((te2.r) pVar).f499898d) == null) {
            return;
        }
        te2.t tVar3 = (te2.t) qVar3;
        android.view.View view9 = tVar3.f499950f;
        if (view9 != null) {
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal9 = zj0.c.f554818a;
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showAnchorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showAnchorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view10 = tVar3.f499951g;
        if (view10 != null) {
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal10 = zj0.c.f554818a;
            arrayList10.add(0);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showAnchorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showAnchorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view11 = tVar3.f499952h;
        if (view11 != null) {
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal11 = zj0.c.f554818a;
            arrayList11.add(8);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(view11, arrayList11.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showAnchorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(view11, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showAnchorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view12 = tVar3.f499948d;
        java.util.ArrayList arrayList12 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal12 = zj0.c.f554818a;
        arrayList12.add(0);
        java.util.Collections.reverse(arrayList12);
        yj0.a.d(view12, arrayList12.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showAnchorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view12.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
        yj0.a.f(view12, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showAnchorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        android.view.View view;
        super.O0();
        te2.q qVar = this.f194012q;
        if (qVar == null || (view = ((te2.t) qVar).f499952h) == null) {
            return;
        }
        view.setBackground(null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        android.view.View view;
        android.content.res.Resources resources;
        te2.q qVar = this.f194012q;
        if (qVar == null || (view = ((te2.t) qVar).f499952h) == null) {
            return;
        }
        android.content.Context context = view.getContext();
        view.setBackground((context == null || (resources = context.getResources()) == null) ? null : resources.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.c47));
    }
}
