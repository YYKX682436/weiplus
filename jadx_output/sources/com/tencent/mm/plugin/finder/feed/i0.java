package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public abstract class i0 implements fs2.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f106968d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.c0 f106969e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f106970f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderLikeDrawer f106971g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderLikeDrawer f106972h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderFavDrawer f106973i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderLikeDrawer f106974m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f106975n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.ui.o6 f106976o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f106977p;

    public i0(com.tencent.mm.ui.MMActivity context, com.tencent.mm.plugin.finder.feed.c0 presenter, int i17, int i18, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f106968d = context;
        this.f106969e = presenter;
        this.f106970f = jz5.h.b(new com.tencent.mm.plugin.finder.feed.g0(this));
        this.f106977p = true;
    }

    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter a() {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f106975n;
        if (wxRecyclerAdapter != null) {
            return wxRecyclerAdapter;
        }
        kotlin.jvm.internal.o.o("adapter");
        throw null;
    }

    public com.tencent.mm.plugin.finder.view.f5 g() {
        com.tencent.mm.ui.MMActivity activity = this.f106968d;
        kotlin.jvm.internal.o.g(activity, "activity");
        return ((com.tencent.mm.plugin.finder.viewmodel.component.u6) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.u6.class)).P6();
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f106968d;
    }

    public androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return o().getRecyclerView();
    }

    public abstract android.view.View j();

    public com.tencent.mm.plugin.finder.view.FinderLikeDrawer l() {
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer = this.f106971g;
        if (finderLikeDrawer != null) {
            return finderLikeDrawer;
        }
        kotlin.jvm.internal.o.o("likeDrawer");
        throw null;
    }

    public final com.tencent.mm.view.RefreshLoadMoreLayout o() {
        return (com.tencent.mm.view.RefreshLoadMoreLayout) ((jz5.n) this.f106970f).getValue();
    }

    public void q(java.util.ArrayList data) {
        kotlin.jvm.internal.o.g(data, "data");
        final androidx.recyclerview.widget.RecyclerView recyclerView = o().getRecyclerView();
        com.tencent.mm.ui.MMActivity activity = this.f106968d;
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(activity);
        finderLinearLayoutManager.f132639x = 25.0f;
        ((cq.k) i95.n0.c(cq.k.class)).getClass();
        finderLinearLayoutManager.f132640y = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.R1().r()).intValue();
        finderLinearLayoutManager.f132641z = 100;
        recyclerView.setLayoutManager(finderLinearLayoutManager);
        com.tencent.mm.plugin.finder.ui.o6 o6Var = null;
        if (recyclerView instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) {
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = finderRecyclerView.getLayoutManager();
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView.i1(finderRecyclerView, layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null, null, 2, null);
        }
        in5.s convertFactory = this.f106969e.h();
        boolean s17 = s();
        kotlin.jvm.internal.o.g(convertFactory, "convertFactory");
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(convertFactory, data, s17);
        this.f106975n = wxRecyclerAdapter;
        recyclerView.setAdapter(wxRecyclerAdapter);
        if (this.f106977p) {
            com.tencent.mm.plugin.finder.ui.o6 o6Var2 = this.f106976o;
            if (o6Var2 == null) {
                o6Var2 = new com.tencent.mm.plugin.finder.ui.o6();
            }
            o6Var = o6Var2;
            this.f106976o = o6Var;
        }
        if (o6Var != null) {
            o6Var.b(recyclerView);
        }
        o().setActionCallback(new com.tencent.mm.plugin.finder.feed.f0(this, recyclerView));
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        fc2.o Z6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) a17).Z6(-1);
        if (Z6 != null) {
            Z6.d(recyclerView);
        }
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Dd).getValue()).r()).booleanValue()) {
            activity.mo133getLifecycle().a(new androidx.lifecycle.f() { // from class: com.tencent.mm.plugin.finder.feed.FinderBaseFeedUIContract$ViewCallback$initRecyclerView$4
                @Override // androidx.lifecycle.f, androidx.lifecycle.h
                public void onDestroy(androidx.lifecycle.y owner) {
                    kotlin.jvm.internal.o.g(owner, "owner");
                    androidx.recyclerview.widget.RecyclerView.this.setAdapter(null);
                    this.f106968d.mo133getLifecycle().c(this);
                }
            });
        }
        u();
    }

    public void r(java.util.ArrayList data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.finder.view.vc vcVar = com.tencent.mm.plugin.finder.view.FinderLikeDrawer.D;
        com.tencent.mm.ui.MMActivity mMActivity = this.f106968d;
        android.view.Window window = mMActivity.getWindow();
        kotlin.jvm.internal.o.f(window, "getWindow(...)");
        this.f106971g = com.tencent.mm.plugin.finder.view.vc.a(vcVar, mMActivity, window, 2, false, false, 24, null);
        android.view.Window window2 = mMActivity.getWindow();
        kotlin.jvm.internal.o.f(window2, "getWindow(...)");
        this.f106972h = com.tencent.mm.plugin.finder.view.vc.a(vcVar, mMActivity, window2, 1, false, false, 24, null);
        com.tencent.mm.plugin.finder.view.p9 p9Var = com.tencent.mm.plugin.finder.view.FinderFavDrawer.B;
        android.view.Window window3 = mMActivity.getWindow();
        kotlin.jvm.internal.o.f(window3, "getWindow(...)");
        this.f106973i = p9Var.a(mMActivity, window3, 0);
        android.view.Window window4 = mMActivity.getWindow();
        kotlin.jvm.internal.o.f(window4, "getWindow(...)");
        this.f106974m = com.tencent.mm.plugin.finder.view.vc.a(vcVar, mMActivity, window4, 4, false, false, 24, null);
        q(data);
    }

    public boolean s() {
        return this instanceof com.tencent.mm.plugin.finder.feed.ps;
    }

    public void t(int i17) {
    }

    public abstract void u();

    public void v(boolean z17) {
        androidx.recyclerview.widget.RecyclerView recyclerView = getRecyclerView();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
        if (finderLinearLayoutManager == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FinderBaseFeedUIContract", "can not cast layoutManager to FinderLinearLayoutManager: " + recyclerView.getLayoutManager());
        } else {
            int w17 = z17 ? finderLinearLayoutManager.w() + 1 : finderLinearLayoutManager.w() - 1;
            if (w17 >= 0 && w17 < a().getData().size()) {
                recyclerView.post(new com.tencent.mm.plugin.finder.feed.h0(recyclerView, w17));
            }
        }
    }
}
