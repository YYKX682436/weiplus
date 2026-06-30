package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class zk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader f111274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f111275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f111276f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xj f111277g;

    public zk(com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager, com.tencent.mm.plugin.finder.feed.tl tlVar, com.tencent.mm.plugin.finder.feed.xj xjVar) {
        this.f111274d = finderFeedShareRelativeListLoader;
        this.f111275e = linearLayoutManager;
        this.f111276f = tlVar;
        this.f111277g = xjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Integer rawInitPos = this.f111274d.getRawInitPos();
        int intValue = rawInitPos != null ? rawInitPos.intValue() : -1;
        if (intValue >= 0) {
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f111275e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$onAttach$3$2$1$call$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$onAttach$3$2$1$call$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            this.f111276f.f109083u = intValue;
            this.f111277g.f(intValue);
        }
    }
}
