package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class sr extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xr f109003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f109004e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr(com.tencent.mm.plugin.finder.feed.xr xrVar, int i17) {
        super(0);
        this.f109003d = xrVar;
        this.f109004e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.xr xrVar = this.f109003d;
        com.tencent.mm.plugin.finder.feed.kr krVar = xrVar.f111097f;
        if (krVar.f107235i) {
            xrVar.g(krVar.f107236m);
        } else {
            androidx.recyclerview.widget.RecyclerView recyclerView = xrVar.f111099h;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            int i17 = this.f109004e;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(finderLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelineViewCallback$initView$2$1$call$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            finderLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelineViewCallback$initView$2$1$call$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            recyclerView.post(new com.tencent.mm.plugin.finder.feed.rr(xrVar, i17));
        }
        return jz5.f0.f302826a;
    }
}
