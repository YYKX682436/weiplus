package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class x8 implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e9 f267075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267076e;

    public x8(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e9 e9Var, nw4.y2 y2Var) {
        this.f267075d = e9Var;
        this.f267076e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        nw4.y2 y2Var = this.f267076e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e9 e9Var = this.f267075d;
        if (i18 == -1) {
            e9Var.f266617a.i5(y2Var, "ok", kz5.b1.e(new jz5.l("err_msg", "ok")));
        } else {
            e9Var.f266617a.i5(y2Var, "cancel", kz5.b1.e(new jz5.l("err_msg", "cancel")));
        }
    }
}
