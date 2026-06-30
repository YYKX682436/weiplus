package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class nj extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xj f108579d;

    public nj(com.tencent.mm.plugin.finder.feed.xj xjVar) {
        this.f108579d = xjVar;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        com.tencent.mm.plugin.finder.feed.xj xjVar = this.f108579d;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = xjVar.f111076e;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        if (kz5.n0.a0(xjVar.f111073b.e().getDataListJustForAdapter(), u07 - wxRecyclerAdapter.a0()) instanceof so2.u1) {
            int dimension = (int) view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
            int dimension2 = (int) view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
            outRect.left = dimension;
            outRect.right = dimension;
            outRect.bottom = dimension2;
            outRect.top = dimension2;
        }
    }
}
