package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class fm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView f106765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.LinearLayoutManager f106766e;

    public fm(com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager) {
        this.f106765d = finderRecyclerView;
        this.f106766e = linearLayoutManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = this.f106765d;
        int w17 = this.f106766e.w();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(w17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(finderRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderMemberTimelineUIContract$ViewCallback$initRecyclerView$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        finderRecyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(finderRecyclerView, "com/tencent/mm/plugin/finder/feed/FinderMemberTimelineUIContract$ViewCallback$initRecyclerView$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
