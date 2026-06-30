package vw3;

/* loaded from: classes.dex */
public final class u0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFileListUI f522662d;

    public u0(com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI) {
        this.f522662d = repairerFileListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.f;
        com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI = this.f522662d;
        repairerFileListUI.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) repairerFileListUI.mo55332x76847179(), 0, false);
        k0Var.f293405n = new vw3.v0(repairerFileListUI);
        k0Var.f293407o = new vw3.w0(repairerFileListUI);
        k0Var.f293414s = new vw3.a1(repairerFileListUI);
        k0Var.f293417v = new vw3.h1(repairerFileListUI);
        k0Var.v();
        return false;
    }
}
