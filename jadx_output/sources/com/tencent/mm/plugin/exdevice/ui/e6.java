package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class e6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.f6 f99446d;

    public e6(com.tencent.mm.plugin.exdevice.ui.f6 f6Var) {
        this.f99446d = f6Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        ve4.g.a(11);
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI = this.f99446d.f99457d.f99570a;
        int i17 = com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.V;
        exdeviceRankInfoUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) exdeviceRankInfoUI.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.exdevice.ui.p6(exdeviceRankInfoUI);
        k0Var.f211881s = new com.tencent.mm.plugin.exdevice.ui.q6(exdeviceRankInfoUI);
        k0Var.v();
        return true;
    }
}
