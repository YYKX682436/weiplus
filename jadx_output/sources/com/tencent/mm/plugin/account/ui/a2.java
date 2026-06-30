package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public final class a2 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.GateWayMobileUI f73705a;

    public a2(com.tencent.mm.plugin.account.ui.GateWayMobileUI gateWayMobileUI) {
        this.f73705a = gateWayMobileUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mm.plugin.account.ui.GateWayMobileUI gateWayMobileUI = this.f73705a;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = gateWayMobileUI.f73286o;
        if (z2Var != null) {
            z2Var.B();
        }
        gateWayMobileUI.f73286o = null;
    }
}
