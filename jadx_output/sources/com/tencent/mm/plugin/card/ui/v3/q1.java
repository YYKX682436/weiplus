package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class q1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.VipCardListUI f95362d;

    public q1(com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI) {
        this.f95362d = vipCardListUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI = this.f95362d;
        if (itemId == 1) {
            vipCardListUI.A = true;
            r45.iu iuVar = vipCardListUI.F;
            kotlin.jvm.internal.o.d(iuVar);
            java.lang.String str = iuVar.f377328d;
            r45.iu iuVar2 = vipCardListUI.F;
            kotlin.jvm.internal.o.d(iuVar2);
            java.lang.String str2 = iuVar2.f377329e;
            r45.iu iuVar3 = vipCardListUI.F;
            kotlin.jvm.internal.o.d(iuVar3);
            lu1.d.f(str, str2, iuVar3.f377330f);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19747, 1, 7);
            return;
        }
        if (menuItem.getItemId() == 2) {
            r45.iu iuVar4 = vipCardListUI.C;
            kotlin.jvm.internal.o.d(iuVar4);
            java.lang.String str3 = iuVar4.f377328d;
            r45.iu iuVar5 = vipCardListUI.C;
            kotlin.jvm.internal.o.d(iuVar5);
            java.lang.String str4 = iuVar5.f377329e;
            r45.iu iuVar6 = vipCardListUI.C;
            kotlin.jvm.internal.o.d(iuVar6);
            lu1.d.f(str3, str4, iuVar6.f377330f);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19747, 1, 2);
        }
    }
}
