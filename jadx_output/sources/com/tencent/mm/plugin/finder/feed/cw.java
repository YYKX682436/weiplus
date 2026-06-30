package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class cw implements com.tencent.mm.plugin.finder.feed.jv {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f106505d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.iv f106506e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f106507f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.fragment.app.Fragment f106508g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f106509h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.vj0 f106510i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f106511m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f106512n;

    public cw(com.tencent.mm.ui.MMActivity baseContext, com.tencent.mm.plugin.finder.feed.iv presenter, android.view.View parent, androidx.fragment.app.Fragment fragment) {
        kotlin.jvm.internal.o.g(baseContext, "baseContext");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f106505d = baseContext;
        this.f106506e = presenter;
        this.f106507f = parent;
        this.f106508g = fragment;
        this.f106509h = "FinderTimelineMachineContract.ViewCallback";
        this.f106510i = new com.tencent.mm.plugin.finder.storage.jj0(0, null, 3, null);
        this.f106512n = jz5.h.b(new com.tencent.mm.plugin.finder.feed.bw(this));
    }

    @Override // fs2.b
    public android.view.View a() {
        return this.f106507f;
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerAdapter g() {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f106511m;
        if (wxRecyclerAdapter != null) {
            return wxRecyclerAdapter;
        }
        kotlin.jvm.internal.o.o("adapter");
        throw null;
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f106505d;
    }

    public androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return j().getRecyclerView();
    }

    public final com.tencent.mm.view.RefreshLoadMoreLayout j() {
        java.lang.Object value = ((jz5.n) this.f106512n).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.view.RefreshLoadMoreLayout) value;
    }
}
