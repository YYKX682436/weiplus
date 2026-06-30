package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class mh implements com.tencent.mm.plugin.finder.feed.w20, in5.x, in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f107376d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f107377e;

    /* renamed from: f, reason: collision with root package name */
    public yw2.n f107378f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f107379g;

    /* renamed from: h, reason: collision with root package name */
    public int f107380h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.FinderItem f107381i;

    /* renamed from: m, reason: collision with root package name */
    public final so2.m6 f107382m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f107383n;

    public mh(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f107376d = context;
        this.f107377e = new java.util.ArrayList();
        this.f107382m = new so2.m6();
        this.f107383n = "";
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderLiveLikeDrawerPresenter$getItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mm.protocal.protobuf.FinderObject feedObject;
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem = com.tencent.mm.plugin.finder.feed.mh.this.f107381i;
                return new com.tencent.mm.plugin.finder.convert.yl((finderItem == null || (feedObject = finderItem.getFeedObject()) == null) ? 0L : feedObject.getId());
            }
        }, this.f107377e, true);
        wxRecyclerAdapter.setHasStableIds(false);
        wxRecyclerAdapter.f293105o = this;
        wxRecyclerAdapter.f293104n = this;
        return wxRecyclerAdapter;
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public androidx.recyclerview.widget.p2 b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new com.tencent.mm.plugin.finder.feed.lh();
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public void e(android.content.Context context, android.widget.FrameLayout headerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(headerLayout, "headerLayout");
        android.view.View findViewById = headerLayout.findViewById(com.tencent.mm.R.id.d4y);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLiveLikeDrawerPresenter", "doExtraTitleChange", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderLiveLikeDrawerPresenter", "doExtraTitleChange", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        headerLayout.findViewById(com.tencent.mm.R.id.d4y).setOnClickListener(new com.tencent.mm.plugin.finder.feed.kh(context));
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public int f() {
        return this.f107377e.size();
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public void g(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public int getScene() {
        com.tencent.mm.plugin.finder.view.vc vcVar = com.tencent.mm.plugin.finder.view.FinderLikeDrawer.D;
        return 4;
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public void h(yw2.n builder, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, com.tencent.mm.protobuf.g gVar, java.util.LinkedList linkedList) {
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        kotlin.jvm.internal.o.g(builder, "builder");
        this.f107378f = builder;
        this.f107381i = finderItem;
        if (finderItem != null) {
            nv2.h1 h1Var = nv2.n1.f340550g;
            nv2.n1 n1Var = nv2.n1.f340551h;
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> h17 = n1Var.h(finderItem.getFeedObject());
            this.f107380h = n1Var.g(finderItem.getFeedObject());
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveLikeDrawerPresenter", "onAttach " + finderItem.getId());
            java.util.ArrayList arrayList = this.f107377e;
            arrayList.clear();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(h17, 10));
            for (com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo : h17) {
                r45.h60 h60Var = new r45.h60();
                h60Var.set(0, finderCommentInfo.getUsername());
                so2.h0 h0Var = new so2.h0(h60Var);
                h0Var.f410375e = kotlin.jvm.internal.o.b(this.f107383n, h0Var.f410374d.getString(0));
                arrayList2.add(h0Var);
            }
            arrayList.addAll(arrayList2);
        }
        yw2.n nVar = this.f107378f;
        if (nVar != null) {
            android.widget.TextView h18 = nVar.h();
            zy2.s6 s6Var = (zy2.s6) i95.n0.c(zy2.s6.class);
            zy2.l6 l6Var = new zy2.l6();
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = this.f107381i;
            l6Var.f477451b = finderItem2 != null ? finderItem2.getFeedObject() : null;
            l6Var.f477452c = this.f107380h;
            l6Var.f477454e = this.f107382m;
            l6Var.f477453d = false;
            cu2.f0 f0Var = cu2.f0.f222391a;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem3 = this.f107381i;
            l6Var.f477450a = f0Var.e((finderItem3 == null || (feedObject = finderItem3.getFeedObject()) == null) ? 0 : feedObject.getObjectType());
            ((ht2.y0) s6Var).Ni(h18, l6Var);
        }
        builder.g(false);
        yw2.n nVar2 = this.f107378f;
        if (nVar2 != null) {
            nVar2.k().l(true);
        }
        builder.o().getRecyclerView().setLayoutFrozen(false);
        yw2.n nVar3 = this.f107378f;
        if (nVar3 != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout.I(nVar3.o(), null, 1, null);
        }
        androidx.recyclerview.widget.f2 adapter = builder.o().getRecyclerView().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        this.f107379g = true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public androidx.recyclerview.widget.RecyclerView.LayoutManager i(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new androidx.recyclerview.widget.LinearLayoutManager(context, 1, false);
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public void onDetach() {
        if (!this.f107379g) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveLikeDrawerPresenter", "onDetach: cannot detach when have not attached");
            return;
        }
        this.f107379g = false;
        yw2.n nVar = this.f107378f;
        androidx.recyclerview.widget.RecyclerView recyclerView = nVar != null ? nVar.o().getRecyclerView() : null;
        if (recyclerView != null) {
            recyclerView.setLayoutFrozen(true);
        }
        this.f107378f = null;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f107377e.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        so2.h0 h0Var = (so2.h0) obj;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Nickname", ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(h0Var.f410374d.getString(0), true).P0());
        intent.putExtra("showInteraction", true);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.assist.i0.sl((com.tencent.mm.plugin.finder.assist.i0) c17, this.f107376d, h0Var.f410374d.getString(0), intent, 0, null, 16, null);
    }
}
