package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public final class x1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.GateWayMobileUI f74311d;

    public x1(com.tencent.mm.plugin.account.ui.GateWayMobileUI gateWayMobileUI) {
        this.f74311d = gateWayMobileUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.account.ui.GateWayMobileUI gateWayMobileUI = this.f74311d;
        gateWayMobileUI.hideVKB();
        gateWayMobileUI.finish();
        return true;
    }
}
