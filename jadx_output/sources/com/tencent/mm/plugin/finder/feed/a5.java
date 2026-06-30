package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class a5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f106203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fp0.r f106204b;

    public a5(com.tencent.mm.plugin.finder.feed.a7 a7Var, fp0.r rVar) {
        this.f106203a = a7Var;
        this.f106204b = rVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f106203a;
        boolean z17 = true;
        a7Var.H = true;
        java.util.List list = ((com.tencent.mm.plugin.finder.feed.m2) obj).f107344b;
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.w("Finder.DrawerPresenter", "[preloadNextPage] empty!");
            a7Var.H = false;
        } else {
            com.tencent.mm.plugin.finder.feed.model.y yVar = a7Var.f106210g;
            int h17 = yVar.h();
            yVar.b(list, false, true);
            yw2.a0 a0Var = a7Var.f106216o;
            if (a0Var != null && (recyclerView = a0Var.s().getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyItemRangeInserted(h17, yVar.h() - h17);
            }
        }
        ym5.s3 s3Var = new ym5.s3(0);
        s3Var.f463521f = a7Var.f106224u;
        s3Var.f463523h = list != null ? list.size() : 0;
        s3Var.f463522g = false;
        yw2.a0 a0Var2 = a7Var.f106216o;
        if (a0Var2 != null) {
            a0Var2.s().onPreFinishLoadMoreSmooth(s3Var);
        }
        this.f106204b.b(fp0.u.f265290f);
        if (list != null && !list.isEmpty()) {
            z17 = false;
        }
        if (!z17) {
            com.tencent.mm.plugin.finder.feed.a7.B(a7Var, list);
        }
        return jz5.f0.f302826a;
    }
}
