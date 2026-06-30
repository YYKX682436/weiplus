package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class zz implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.g00 f111310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.rz f111311b;

    public zz(com.tencent.mm.plugin.finder.feed.g00 g00Var, com.tencent.mm.plugin.finder.feed.rz rzVar) {
        this.f111310a = g00Var;
        this.f111311b = rzVar;
    }

    @Override // d85.k0
    public final void onOp(java.lang.Boolean bool) {
        kotlin.jvm.internal.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        com.tencent.mm.plugin.finder.feed.rz rzVar = this.f111311b;
        com.tencent.mm.plugin.finder.feed.g00 g00Var = this.f111310a;
        if (!booleanValue) {
            com.tencent.mars.xlog.Log.i(g00Var.f106801f, "checkAndShowBusinessPermissionDialog, no poi permission,loadType=" + rzVar);
            g00Var.l(-3, so2.g5.f410363e);
            return;
        }
        com.tencent.mm.plugin.finder.feed.g00.a(g00Var);
        g00Var.f106797b.i1(-3);
        com.tencent.mars.xlog.Log.i(g00Var.f106801f, "checkAndShowBusinessPermissionDialog grant permission,loadType=" + rzVar);
        int ordinal = rzVar.ordinal();
        com.tencent.mm.plugin.finder.feed.ct ctVar = g00Var.f106798c;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2 && ctVar != null) {
                    com.tencent.mm.view.RefreshLoadMoreLayout l17 = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l();
                    int i17 = com.tencent.mm.view.RefreshLoadMoreLayout.f213427y1;
                    l17.L(false);
                }
            } else if (ctVar != null) {
                com.tencent.mm.view.RefreshLoadMoreLayout.K(((com.tencent.mm.plugin.finder.feed.v00) ctVar).l(), false, 1, null);
            }
        } else if (ctVar != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout l18 = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l();
            int i18 = com.tencent.mm.view.RefreshLoadMoreLayout.f213427y1;
            l18.L(false);
        }
        if (ctVar != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout l19 = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l();
            if (l19.getEnableLoadMore()) {
                return;
            }
            l19.setEnableLoadMore(true);
            if (l19.getF213435x() == null) {
                android.view.View inflate = com.tencent.mm.ui.id.b(g00Var.f106796a).inflate(com.tencent.mm.R.layout.dxa, (android.view.ViewGroup) null);
                kotlin.jvm.internal.o.f(inflate, "inflate(...)");
                l19.setLoadMoreFooter(inflate);
            }
        }
    }
}
