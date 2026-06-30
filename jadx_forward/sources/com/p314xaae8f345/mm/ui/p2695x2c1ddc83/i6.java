package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class i6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 f289279d;

    public i6(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 q5Var) {
        this.f289279d = q5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 q5Var = this.f289279d;
        q5Var.f289537g.a();
        w11.k0 k0Var = q5Var.f289540m;
        if (k0Var != null) {
            k0Var.hashCode();
        }
        android.app.ProgressDialog progressDialog = q5Var.f289541n;
        if (progressDialog != null && progressDialog.isShowing()) {
            q5Var.f289541n.dismiss();
        }
        l71.e eVar = (l71.e) ((js.z0) i95.n0.c(js.z0.class));
        java.util.Map map = eVar.f398362d;
        if (map != null) {
            eVar.f398362d = null;
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("login_loading_msg", "view_exp", map, 34575);
        }
        android.app.Activity activity = q5Var.f289542o;
        q5Var.f289541n = db5.e1.Q(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), q5Var.f289542o.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572002vy), true, false, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.h6(this));
        if (((java.lang.Boolean) ((jz5.n) q5Var.f289547t.f289477a).mo141623x754a37bb()).booleanValue()) {
            return;
        }
        gm0.j1.e().n();
    }
}
