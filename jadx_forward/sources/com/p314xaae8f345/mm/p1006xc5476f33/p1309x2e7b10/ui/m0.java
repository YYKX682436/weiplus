package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class m0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 f176607d;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 b0Var) {
        this.f176607d = b0Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0 b0Var = this.f176607d;
        if (b0Var.E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDetailUIContoller", "mCardInfo is null, err");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11582, "CardDetailUiMenu", 1, java.lang.Integer.valueOf(b0Var.E.s0().f470083i), b0Var.E.f(), b0Var.E.g(), b0Var.U.f176639d);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) b0Var.f176469e, 1, false);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.i0(this);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.l0(this);
        k0Var.v();
        return true;
    }
}
