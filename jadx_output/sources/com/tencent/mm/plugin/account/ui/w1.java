package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public final class w1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.GateWayMobileUI f74281d;

    public w1(com.tencent.mm.plugin.account.ui.GateWayMobileUI gateWayMobileUI) {
        this.f74281d = gateWayMobileUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/GateWayMobileUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.r1 r1Var = com.tencent.mm.plugin.account.ui.GateWayMobileUI.f73277p;
        this.f74281d.V6("");
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/GateWayMobileUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
