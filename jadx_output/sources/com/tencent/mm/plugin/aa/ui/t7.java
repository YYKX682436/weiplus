package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class t7 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.d0 f72816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAAUI f72817e;

    public t7(com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI, r45.d0 d0Var) {
        this.f72817e = paylistAAUI;
        this.f72816d = d0Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f72817e, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.aa.ui.p7(this);
        k0Var.f211881s = new com.tencent.mm.plugin.aa.ui.s7(this);
        k0Var.v();
        return true;
    }
}
