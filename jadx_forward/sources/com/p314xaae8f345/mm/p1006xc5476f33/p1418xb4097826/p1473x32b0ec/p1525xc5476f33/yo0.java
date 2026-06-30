package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes2.dex */
public final class yo0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f196755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 f196756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f196757f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f196758g;

    public yo0(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var, android.view.View view2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar) {
        this.f196755d = view;
        this.f196756e = ep0Var;
        this.f196757f = view2;
        this.f196758g = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.View view = this.f196755d;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.u49);
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.hhb);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var = this.f196756e;
        android.view.View view2 = this.f196757f;
        android.graphics.Rect p17 = ep0Var.p(view2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem$runShopBubbleAnimateV2$2$1", "onGlobalLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem$runShopBubbleAnimateV2$2$1", "onGlobalLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = this.f196757f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem$runShopBubbleAnimateV2$2$1", "onGlobalLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem$runShopBubbleAnimateV2$2$1", "onGlobalLayout", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setPivotX(0.0f);
        view2.setPivotY(0.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f196758g;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(lVar, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xo0(this.f196756e, this.f196757f, p17, findViewById, findViewById2, null), 2, null);
    }
}
