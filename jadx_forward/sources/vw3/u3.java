package vw3;

/* loaded from: classes.dex */
public final class u3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerMsgResendUI f522675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f522676e;

    public u3(com.tencent.mm.plugin.repairer.ui.RepairerMsgResendUI repairerMsgResendUI, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f522675d = repairerMsgResendUI;
        this.f522676e = f9Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.tencent.mm.plugin.repairer.ui.RepairerMsgResendUI repairerMsgResendUI = this.f522675d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) repairerMsgResendUI.mo55332x76847179(), 0, false);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f522676e;
        k0Var.f293405n = new vw3.o3(repairerMsgResendUI, f9Var);
        k0Var.f293414s = new vw3.t3(repairerMsgResendUI, f9Var);
        k0Var.v();
        return true;
    }
}
