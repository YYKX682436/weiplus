package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class hv implements com.tencent.mm.plugin.finder.feed.ft {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f106954d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.et f106955e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f106956f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f106957g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.vj0 f106958h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f106959i;

    public hv(com.tencent.mm.ui.MMActivity baseContext, com.tencent.mm.plugin.finder.feed.et presenter, android.view.View parent) {
        kotlin.jvm.internal.o.g(baseContext, "baseContext");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f106954d = baseContext;
        this.f106955e = presenter;
        this.f106956f = parent;
        this.f106957g = "FinderTimelineLbsContract";
        this.f106958h = new com.tencent.mm.plugin.finder.storage.s90(baseContext);
        this.f106959i = jz5.h.b(new com.tencent.mm.plugin.finder.feed.gv(this));
    }

    public final com.tencent.mm.view.RefreshLoadMoreLayout a() {
        java.lang.Object value = ((jz5.n) this.f106959i).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.view.RefreshLoadMoreLayout) value;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ft
    public com.tencent.mm.view.RefreshLoadMoreLayout f() {
        return a();
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f106954d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ft
    public androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return a().getRecyclerView();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ft
    public void r(java.util.ArrayList data) {
        kotlin.jvm.internal.o.g(data, "data");
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
        a().setLimitTopRequest(((int) resources.getDimension(com.tencent.mm.R.dimen.f480496zi)) - ((int) resources.getDimension(com.tencent.mm.R.dimen.f479657bu)));
        a().setRefreshTargetY(((int) resources.getDimension(com.tencent.mm.R.dimen.f479727dj)) - ((int) resources.getDimension(com.tencent.mm.R.dimen.f480496zi)));
        a().setDamping(1.85f);
        androidx.recyclerview.widget.RecyclerView recyclerView = a().getRecyclerView();
        com.tencent.mm.plugin.finder.storage.vj0 vj0Var = this.f106958h;
        android.content.Context context = this.f106956f.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        recyclerView.setLayoutManager(vj0Var.d(context));
        com.tencent.mm.plugin.finder.storage.s90 s90Var = (com.tencent.mm.plugin.finder.storage.s90) vj0Var;
        recyclerView.N(new com.tencent.mm.plugin.finder.storage.r90());
        com.tencent.mm.ui.MMActivity activity = this.f106954d;
        recyclerView.setRecycledViewPool(vj0Var.e(activity));
        androidx.recyclerview.widget.n2 itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f12171f = 0L;
        }
        com.tencent.mm.plugin.finder.feed.cv cvVar = new com.tencent.mm.plugin.finder.feed.cv(data, new com.tencent.mm.plugin.finder.storage.FinderLbsStaggeredConfig$getItemConvertFactory$1(s90Var, new com.tencent.mm.plugin.finder.feed.fv(this)));
        cvVar.f293105o = new com.tencent.mm.plugin.finder.feed.av(data, this);
        recyclerView.setAdapter(cvVar);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(4);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        ((com.tencent.mm.view.recyclerview.WxRecyclerView) recyclerView).setFlingSpeedFactor(((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127798l1).getValue()).r()).intValue());
        a().setActionCallback(new com.tencent.mm.plugin.finder.feed.bv(this));
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        fc2.o Z6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) a17).Z6(-1);
        if (Z6 != null) {
            Z6.d(recyclerView);
        }
    }
}
