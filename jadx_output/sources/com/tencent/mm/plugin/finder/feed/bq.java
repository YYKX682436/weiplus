package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes.dex */
public final class bq implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f106407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f106408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f106409f;

    public bq(android.view.View view, int i17, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f106407d = view;
        this.f106408e = i17;
        this.f106409f = recyclerView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f106407d.getViewTreeObserver().removeOnPreDrawListener(this);
        int i17 = this.f106408e;
        if (i17 > 0) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f106409f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17 - 1));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelinePresenter$getTimelineFeedLoader$1$1$invoke$lambda$1$$inlined$doOnPreDraw$1", "onPreDraw", "()Z", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelinePresenter$getTimelineFeedLoader$1$1$invoke$lambda$1$$inlined$doOnPreDraw$1", "onPreDraw", "()Z", "Undefined", "smoothScrollToPosition", "(I)V");
        }
        return true;
    }
}
