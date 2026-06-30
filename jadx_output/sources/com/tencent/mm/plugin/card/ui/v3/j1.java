package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class j1 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.VipCardListUI f95337a;

    public j1(com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI) {
        this.f95337a = vipCardListUI;
    }

    @Override // ym5.q3
    public void b(int i17) {
        com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI = this.f95337a;
        java.lang.String str = vipCardListUI.f95269i;
        pm0.v.X(new com.tencent.mm.plugin.card.ui.v3.i1(vipCardListUI));
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI = this.f95337a;
        java.lang.String str = vipCardListUI.f95269i;
        vipCardListUI.getClass();
        if (vipCardListUI.f95282y) {
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = vipCardListUI.f95271n;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.H(null);
            } else {
                kotlin.jvm.internal.o.o("mRefreshLayout");
                throw null;
            }
        }
    }
}
