package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class s4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI f99659d;

    public s4(com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI) {
        this.f99659d = exdeviceProfileUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI = this.f99659d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) exdeviceProfileUI.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.exdevice.ui.r4(this);
        k0Var.f211881s = exdeviceProfileUI.F;
        k0Var.v();
        return true;
    }
}
