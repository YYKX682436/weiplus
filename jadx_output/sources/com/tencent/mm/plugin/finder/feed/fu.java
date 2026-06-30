package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class fu implements com.tencent.mm.plugin.finder.feed.ft {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f106776d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.et f106777e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f106778f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.m90 f106779g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f106780h;

    public fu(com.tencent.mm.ui.MMActivity baseContext, com.tencent.mm.plugin.finder.feed.et presenter, android.view.View parent) {
        kotlin.jvm.internal.o.g(baseContext, "baseContext");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f106776d = baseContext;
        this.f106777e = presenter;
        this.f106778f = parent;
        this.f106779g = new com.tencent.mm.plugin.finder.storage.m90(null, null, baseContext, 3, null);
        this.f106780h = jz5.h.b(new com.tencent.mm.plugin.finder.feed.eu(this));
    }

    public final com.tencent.mm.view.RefreshLoadMoreLayout a() {
        java.lang.Object value = ((jz5.n) this.f106780h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.view.RefreshLoadMoreLayout) value;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ft
    public com.tencent.mm.view.RefreshLoadMoreLayout f() {
        return a();
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f106776d;
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
        android.view.View view = this.f106778f;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        final com.tencent.mm.plugin.finder.storage.m90 m90Var = this.f106779g;
        m90Var.getClass();
        recyclerView.setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(context));
        android.content.Context context2 = view.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        m90Var.getClass();
        recyclerView.N(new dx2.b(new android.graphics.drawable.ColorDrawable(context2.getResources().getColor(com.tencent.mm.R.color.BW_93)), (int) context2.getResources().getDimension(com.tencent.mm.R.dimen.f480415xa)));
        final com.tencent.mm.plugin.finder.feed.du duVar = new com.tencent.mm.plugin.finder.feed.du(this);
        m90Var.getClass();
        final com.tencent.mm.plugin.finder.feed.et presenter = this.f106777e;
        kotlin.jvm.internal.o.g(presenter, "presenter");
        recyclerView.setAdapter(new com.tencent.mm.plugin.finder.feed.au(data, new in5.s() { // from class: com.tencent.mm.plugin.finder.storage.FinderLbsConfig$getItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                in5.r rVar;
                if (type == -5) {
                    return new com.tencent.mm.plugin.finder.convert.xh();
                }
                if (type == 1001) {
                    return new com.tencent.mm.plugin.finder.convert.yo(com.tencent.mm.plugin.finder.feed.et.this);
                }
                if (type == 1002) {
                    return new com.tencent.mm.plugin.finder.convert.vo();
                }
                yz5.l lVar = duVar;
                if (lVar != null && (rVar = (in5.r) lVar.invoke(java.lang.Integer.valueOf(type))) != null) {
                    return rVar;
                }
                m90Var.getClass();
                hc2.l.a("FinderLbsConfig", type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        }));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(4);
        a().setActionCallback(new com.tencent.mm.plugin.finder.feed.zt(this));
    }
}
