package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class m0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.b0 f95074d;

    public m0(com.tencent.mm.plugin.card.ui.b0 b0Var) {
        this.f95074d = b0Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.card.ui.b0 b0Var = this.f95074d;
        if (b0Var.E == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUIContoller", "mCardInfo is null, err");
            return false;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11582, "CardDetailUiMenu", 1, java.lang.Integer.valueOf(b0Var.E.s0().f388550i), b0Var.E.f(), b0Var.E.g(), b0Var.U.f95106d);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) b0Var.f94936e, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.card.ui.i0(this);
        k0Var.f211881s = new com.tencent.mm.plugin.card.ui.l0(this);
        k0Var.v();
        return true;
    }
}
