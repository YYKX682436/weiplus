package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class e7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266615a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.h7 f266616b;

    public e7(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.h7 h7Var, java.lang.String str) {
        this.f266616b = h7Var;
        this.f266615a = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.h7 h7Var = this.f266616b;
        android.app.ProgressDialog progressDialog = h7Var.f266707g.f266512h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = h7Var.f266707g;
        if (progressDialog != null) {
            progressDialog.dismiss();
            c1Var.f266513i = false;
        }
        android.content.Context context = c1Var.f266508d;
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "recent forward context is Finishing");
            return null;
        }
        ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).aj(h7Var.f266701a);
        java.lang.String str = (java.lang.String) h7Var.f266702b.f422323a.get("appid");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var2 = h7Var.f266707g;
        if (str == null) {
            str = "";
        }
        c1Var2.R5(null, str, h7Var.f266703c, h7Var.f266701a, h7Var.f266704d, h7Var.f266705e, this.f266615a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d7(this));
        return null;
    }
}
