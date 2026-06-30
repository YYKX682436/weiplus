package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class b1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.VipCardListUI f95294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95295e;

    public b1(com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI, java.lang.String str) {
        this.f95294d = vipCardListUI;
        this.f95295e = str;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            int i18 = com.tencent.mm.plugin.card.ui.v3.VipCardListUI.S;
            com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI = this.f95294d;
            vipCardListUI.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("do delete card: ");
            java.lang.String str = this.f95295e;
            sb6.append(str);
            com.tencent.mars.xlog.Log.i(vipCardListUI.f95269i, sb6.toString());
            vipCardListUI.a7(java.lang.Boolean.TRUE);
            new au1.j(str).l().h(new com.tencent.mm.plugin.card.ui.v3.g1(vipCardListUI, str));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19747, 1, 4);
        }
    }
}
