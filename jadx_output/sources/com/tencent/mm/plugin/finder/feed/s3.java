package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class s3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f108970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fp0.r f108971b;

    public s3(com.tencent.mm.plugin.finder.feed.a7 a7Var, fp0.r rVar) {
        this.f108970a = a7Var;
        this.f108971b = rVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        java.util.List list = ((com.tencent.mm.plugin.finder.feed.m2) obj).f107344b;
        boolean z17 = true;
        boolean z18 = list == null || list.isEmpty();
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f108970a;
        if (z18) {
            com.tencent.mars.xlog.Log.w("Finder.DrawerPresenter", "[loadMoreData] empty!");
        } else {
            int h17 = a7Var.f106210g.h();
            com.tencent.mm.plugin.finder.feed.model.y yVar = a7Var.f106210g;
            yVar.b(list, false, true);
            yw2.a0 a0Var = a7Var.f106216o;
            if (a0Var != null && (recyclerView = a0Var.s().getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyItemRangeInserted(h17, yVar.h() - h17);
            }
        }
        ym5.s3 s3Var = new ym5.s3(0);
        s3Var.f463521f = a7Var.f106224u;
        int size = list != null ? list.size() : 0;
        s3Var.f463523h = size;
        if (size > 0) {
            s3Var.f463522g = false;
        }
        yw2.a0 a0Var2 = a7Var.f106216o;
        if (a0Var2 != null) {
            a0Var2.s().onPreFinishLoadMoreSmooth(s3Var);
        }
        this.f108971b.b(fp0.u.f265290f);
        if (list != null && !list.isEmpty()) {
            z17 = false;
        }
        if (!z17) {
            com.tencent.mm.plugin.finder.feed.a7.B(a7Var, list);
        }
        return jz5.f0.f302826a;
    }
}
