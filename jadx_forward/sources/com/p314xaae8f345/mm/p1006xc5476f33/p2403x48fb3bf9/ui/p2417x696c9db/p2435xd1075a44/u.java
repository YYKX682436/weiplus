package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class u implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 f269077d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var) {
        this.f269077d = r0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        nw4.n g07;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = this.f269077d;
        if (itemId != 1) {
            if (itemId == 2 && (g07 = r0Var.g0()) != null) {
                g07.j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.g1.f34800x24728b, true);
                g07.l0(0, null, 0);
                return;
            }
            return;
        }
        nw4.n g08 = r0Var.g0();
        if (g08 != null) {
            g08.j("sendAppMessage", true);
            g08.j0(null, 0);
        }
    }
}
