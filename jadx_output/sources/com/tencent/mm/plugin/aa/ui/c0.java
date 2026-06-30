package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class c0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AAQueryListUI f72587d;

    public c0(com.tencent.mm.plugin.aa.ui.AAQueryListUI aAQueryListUI) {
        this.f72587d = aAQueryListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f72587d, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.aa.ui.a0(this);
        k0Var.f211881s = new com.tencent.mm.plugin.aa.ui.b0(this);
        k0Var.v();
        return true;
    }
}
