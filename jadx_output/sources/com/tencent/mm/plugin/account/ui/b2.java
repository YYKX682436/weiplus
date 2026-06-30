package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public final class b2 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.GateWayMobileUI f73737a;

    public b2(com.tencent.mm.plugin.account.ui.GateWayMobileUI gateWayMobileUI) {
        this.f73737a = gateWayMobileUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        android.view.View view;
        android.widget.TextView textView;
        com.tencent.mm.plugin.account.ui.GateWayMobileUI gateWayMobileUI = this.f73737a;
        if (gateWayMobileUI.f73284m && gateWayMobileUI.f73285n) {
            gateWayMobileUI.U6();
            return;
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var = gateWayMobileUI.f73286o;
        if (z2Var == null || (view = z2Var.f212058g) == null || (textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.rqc)) == null) {
            return;
        }
        textView.setTextColor(gateWayMobileUI.getColor(com.tencent.mm.R.color.Red_100));
    }
}
