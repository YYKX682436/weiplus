package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class w1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.VipCardListUI f95396d;

    public w1(com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI) {
        this.f95396d = vipCardListUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/VipCardListUI$updateTopHeaderLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI = this.f95396d;
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
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19747, 1, 8);
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v3/VipCardListUI$updateTopHeaderLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
