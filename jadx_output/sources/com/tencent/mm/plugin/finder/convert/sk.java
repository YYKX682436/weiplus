package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class sk extends in5.r {

    /* renamed from: i, reason: collision with root package name */
    public static int f104559i = -2;

    /* renamed from: e, reason: collision with root package name */
    public final fs2.b f104560e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f104561f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderTagView f104562g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.rk f104563h;

    public sk(fs2.b viewCallBackTag) {
        kotlin.jvm.internal.o.g(viewCallBackTag, "viewCallBackTag");
        this.f104560e = viewCallBackTag;
        this.f104563h = new com.tencent.mm.plugin.finder.convert.rk(this);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b9x;
    }

    @Override // in5.r
    public void g(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
        com.tencent.mm.plugin.finder.convert.rk rkVar = this.f104563h;
        recyclerView.V0(rkVar);
        recyclerView.i(rkVar);
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.v item = (so2.v) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        f104559i = i17;
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) {
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = true;
        }
        if (item.f410643d.getList(0).isEmpty()) {
            return;
        }
        android.view.View p17 = holder.p(com.tencent.mm.R.id.nwt);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) p17;
        android.view.View a17 = this.f104560e.a();
        com.tencent.mm.plugin.finder.view.FinderTagView.f131494w.a();
        android.view.View findViewById = a17.findViewById(com.tencent.mm.R.id.egh);
        if (findViewById != null) {
            frameLayout.getLayoutParams().height = findViewById.getLayoutParams().height;
            return;
        }
        if (frameLayout.getChildCount() != 0) {
            return;
        }
        com.tencent.mm.plugin.finder.view.FinderTagView finderTagView = new com.tencent.mm.plugin.finder.view.FinderTagView(holder.f293121e);
        r45.xn5 xn5Var = item.f410643d;
        if (xn5Var != null) {
            java.util.LinkedList list2 = xn5Var.getList(0);
            if (list2 != null) {
                r45.r03 r03Var = new r45.r03();
                r03Var.set(0, finderTagView.getContext().getResources().getString(com.tencent.mm.R.string.f6k));
                r03Var.set(1, -1L);
                finderTagView.tagClickMap.put(java.lang.Long.valueOf(r03Var.getLong(1)), 1);
                list2.addFirst(r03Var);
            }
            finderTagView.setTagData(xn5Var);
            finderTagView.getTagLayout().removeAllViews();
            ((java.util.ArrayList) finderTagView.getTagLayout().f131488d).clear();
            int size = finderTagView.getTagData().getList(0).size();
            for (int i19 = 0; i19 < size; i19++) {
                java.lang.Object obj = finderTagView.getTagData().getList(0).get(i19);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                r45.r03 r03Var2 = (r45.r03) obj;
                android.view.View inflate = com.tencent.mm.ui.id.b(finderTagView.getRoot().getContext()).inflate(com.tencent.mm.R.layout.b2e, (android.view.ViewGroup) null);
                android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.frv);
                kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
                ((android.widget.TextView) findViewById2).setText(r03Var2.getString(0));
                if (r03Var2.getLong(1) == -1) {
                    finderTagView.c(true, inflate, i19);
                } else {
                    finderTagView.c(false, inflate, i19);
                }
                inflate.setOnClickListener(new com.tencent.mm.plugin.finder.view.wl(finderTagView));
                finderTagView.allAddViews.add(inflate);
                finderTagView.getTagLayout().addView(inflate);
            }
            finderTagView.b();
        }
        finderTagView.getTagLayout().post(new com.tencent.mm.plugin.finder.view.ul(finderTagView));
        com.tencent.mm.plugin.finder.view.FinderTagView.f131494w.a();
        finderTagView.setId(com.tencent.mm.R.id.egh);
        finderTagView.setVisibility(4);
        frameLayout.addView(finderTagView);
        this.f104562g = finderTagView;
        finderTagView.setVisibility(0);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // in5.r
    public void j(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
    }

    public final void n(android.view.ViewGroup parent, in5.s0 holder, androidx.recyclerview.widget.RecyclerView recylerView) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(recylerView, "recylerView");
        if (this.f104561f) {
            this.f104561f = false;
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            h0Var.f310123d = holder.p(com.tencent.mm.R.id.nwt);
            kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
            com.tencent.mm.plugin.finder.view.FinderTagView.f131494w.a();
            android.view.View findViewById = parent.findViewById(com.tencent.mm.R.id.egh);
            h0Var2.f310123d = findViewById;
            if (findViewById == null || (obj = h0Var.f310123d) == null || ((android.widget.FrameLayout) obj).getChildCount() != 0) {
                return;
            }
            recylerView.post(new com.tencent.mm.plugin.finder.convert.qk(parent, h0Var2, h0Var));
        }
    }
}
