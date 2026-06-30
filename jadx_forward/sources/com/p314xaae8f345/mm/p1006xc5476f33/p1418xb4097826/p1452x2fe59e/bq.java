package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes.dex */
public final class bq implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f187940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f187941e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f187942f;

    public bq(android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f187940d = view;
        this.f187941e = i17;
        this.f187942f = c1163xf1deaba4;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f187940d.getViewTreeObserver().removeOnPreDrawListener(this);
        int i17 = this.f187941e;
        if (i17 > 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f187942f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17 - 1));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelinePresenter$getTimelineFeedLoader$1$1$invoke$lambda$1$$inlined$doOnPreDraw$1", "onPreDraw", "()Z", "Undefined", "smoothScrollToPosition", "(I)V");
            c1163xf1deaba4.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelinePresenter$getTimelineFeedLoader$1$1$invoke$lambda$1$$inlined$doOnPreDraw$1", "onPreDraw", "()Z", "Undefined", "smoothScrollToPosition", "(I)V");
        }
        return true;
    }
}
