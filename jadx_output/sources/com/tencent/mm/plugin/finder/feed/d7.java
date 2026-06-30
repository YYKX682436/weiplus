package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class d7 implements com.tencent.mm.plugin.finder.feed.w20, in5.x, in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f106549d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f106550e;

    /* renamed from: f, reason: collision with root package name */
    public yw2.n f106551f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f106552g;

    public d7(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f106549d = context;
        this.f106550e = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderCommentRecommendDrawerPresenter$getItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.plugin.finder.convert.y1();
            }
        }, this.f106550e, true);
        wxRecyclerAdapter.setHasStableIds(false);
        wxRecyclerAdapter.f293105o = this;
        wxRecyclerAdapter.f293104n = this;
        return wxRecyclerAdapter;
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public androidx.recyclerview.widget.p2 b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new com.tencent.mm.plugin.finder.feed.c7();
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
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCommentRecommendDrawerPresenter", "doExtraTitleChange", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderCommentRecommendDrawerPresenter", "doExtraTitleChange", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        headerLayout.findViewById(com.tencent.mm.R.id.d4y).setOnClickListener(new com.tencent.mm.plugin.finder.feed.b7(context));
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public int f() {
        return this.f106550e.size();
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public void g(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public int getScene() {
        com.tencent.mm.plugin.finder.view.vc vcVar = com.tencent.mm.plugin.finder.view.FinderLikeDrawer.D;
        return 3;
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public void h(yw2.n builder, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, com.tencent.mm.protobuf.g gVar, java.util.LinkedList linkedList) {
        kotlin.jvm.internal.o.g(builder, "builder");
        this.f106551f = builder;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAttach ");
        sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderCommentRecommendDrawerPresenter", sb6.toString());
        java.util.ArrayList arrayList = this.f106550e;
        arrayList.clear();
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(new so2.h0((r45.h60) it.next()));
            }
        }
        yw2.n nVar = this.f106551f;
        if (nVar != null) {
            android.widget.TextView h17 = nVar.h();
            int dimension = (int) h17.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
            if (arrayList.size() == 0) {
                java.lang.String string = h17.getResources().getString(com.tencent.mm.R.string.d1r);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                android.content.Context context = h17.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                h17.setText(hc2.x0.k(string, context, '#', com.tencent.mm.R.raw.icons_filled_channels_like_bold, com.tencent.mm.R.color.FG_0, dimension, dimension, 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null));
            } else {
                java.lang.String string2 = h17.getContext().getString(com.tencent.mm.R.string.f491425d20, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1(com.tencent.mm.plugin.finder.assist.w2.h(arrayList.size()), 0)));
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                android.content.Context context2 = h17.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                h17.setText(hc2.x0.k(string2, context2, '#', com.tencent.mm.R.raw.icons_filled_channels_like_bold, com.tencent.mm.R.color.FG_0, dimension, dimension, 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null));
            }
        }
        builder.g(false);
        yw2.n nVar2 = this.f106551f;
        if (nVar2 != null) {
            nVar2.k().l(true);
        }
        builder.o().getRecyclerView().setLayoutFrozen(false);
        yw2.n nVar3 = this.f106551f;
        if (nVar3 != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout.I(nVar3.o(), null, 1, null);
        }
        androidx.recyclerview.widget.f2 adapter = builder.o().getRecyclerView().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        this.f106552g = true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public androidx.recyclerview.widget.RecyclerView.LayoutManager i(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new androidx.recyclerview.widget.LinearLayoutManager(context, 1, false);
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public void onDetach() {
        if (!this.f106552g) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCommentRecommendDrawerPresenter", "onDetach: cannot detach when have not attached");
            return;
        }
        this.f106552g = false;
        yw2.n nVar = this.f106551f;
        androidx.recyclerview.widget.RecyclerView recyclerView = nVar != null ? nVar.o().getRecyclerView() : null;
        if (recyclerView != null) {
            recyclerView.setLayoutFrozen(true);
        }
        this.f106551f = null;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f106550e.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        so2.h0 h0Var = (so2.h0) obj;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Nickname", ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(h0Var.f410374d.getString(0), true).P0());
        intent.putExtra("showInteraction", true);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.assist.i0.sl((com.tencent.mm.plugin.finder.assist.i0) c17, this.f106549d, h0Var.f410374d.getString(0), intent, 0, null, 16, null);
    }
}
