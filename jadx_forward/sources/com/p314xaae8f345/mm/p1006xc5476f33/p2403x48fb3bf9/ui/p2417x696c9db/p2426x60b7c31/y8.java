package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class y8 implements js.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f267105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e9 f267106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267107c;

    public y8(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e9 e9Var, nw4.y2 y2Var) {
        this.f267105a = activityC21401x6ce6f73f;
        this.f267106b = e9Var;
        this.f267107c = y2Var;
    }

    @Override // js.v0
    /* renamed from: onActivityResult */
    public void mo48693x9d4787cb(int i17, int i18, android.content.Intent intent) {
        ((is.i0) ((js.w0) i95.n0.c(js.w0.class))).getClass();
        w45.b bVar = w45.b.f524432a;
        nw4.y2 y2Var = this.f267107c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e9 e9Var = this.f267106b;
        if (i18 != -1) {
            e9Var.f266617a.i5(y2Var, "cancel", kz5.b1.e(new jz5.l("err_msg", "cancel")));
            return;
        }
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("setpwd_ticket") : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PrivateCommonApiHandler", "get reset pwd ticket %s", stringExtra);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            e9Var.f266617a.i5(y2Var, "cancel", kz5.b1.e(new jz5.l("err_msg", "cancel")));
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.addFlags(603979776);
        intent2.putExtra("setpwd_ticket", stringExtra);
        j45.l.x(this.f267105a, ".plugin.account.ui.RegByMobileSetPwdUI", intent2, 1, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.x8(e9Var, y2Var));
    }

    @Override // js.v0
    /* renamed from: onCancel */
    public void mo74509x3d6f0539() {
        this.f267106b.f266617a.i5(this.f267107c, "cancel", kz5.b1.e(new jz5.l("err_msg", "cancel")));
    }
}
