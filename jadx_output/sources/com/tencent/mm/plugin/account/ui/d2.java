package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public final class d2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.GateWayMobileUI f73792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f73793e;

    public d2(com.tencent.mm.plugin.account.ui.GateWayMobileUI gateWayMobileUI, android.widget.CheckBox checkBox) {
        this.f73792d = gateWayMobileUI;
        this.f73793e = checkBox;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/GateWayMobileUI$showConfirmSheet$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.GateWayMobileUI gateWayMobileUI = this.f73792d;
        boolean z17 = !gateWayMobileUI.f73285n;
        gateWayMobileUI.f73285n = z17;
        this.f73793e.setChecked(z17);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/GateWayMobileUI$showConfirmSheet$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
