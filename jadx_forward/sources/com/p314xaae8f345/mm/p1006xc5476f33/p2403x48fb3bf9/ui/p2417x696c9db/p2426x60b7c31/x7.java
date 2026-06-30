package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class x7 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f267073e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f267074f;

    public x7(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, nw4.y2 y2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var2) {
        this.f267074f = c1Var;
        this.f267072d = y2Var;
        this.f267073e = c1Var2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.ib3 ib3Var;
        r45.gi5 gi5Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f267074f;
        android.app.ProgressDialog progressDialog = c1Var.f266512h;
        if (progressDialog != null && progressDialog.isShowing()) {
            c1Var.f266512h.dismiss();
            c1Var.f266512h = null;
        }
        gm0.j1.d().q(1393, this);
        int i19 = -1;
        java.lang.String str2 = "selectEnterpriseContact:fail";
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p944x882e457a.o oVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.d1) m1Var).f264366e;
            ib3Var = (oVar == null || (fVar = oVar.f152244b.f152233a) == null) ? null : (r45.ib3) fVar;
            if (ib3Var != null && (gi5Var = ib3Var.f458432d) != null) {
                i19 = gi5Var.f456821d;
                java.lang.String str3 = gi5Var.f456822e;
                if (str3 != null && str3.length() > 0) {
                    str2 = ib3Var.f458432d.f456822e;
                }
            }
        } else {
            ib3Var = null;
        }
        if (i19 != 0) {
            c1Var.i5(this.f267072d, str2, null);
            return;
        }
        java.lang.String str4 = ib3Var.f458433e;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str4);
        intent.putExtra("useJs", true);
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) c1Var.f266508d).m78545xde66c1f2(this.f267073e);
        j45.l.n(c1Var.f266508d, "webview", ".ui.tools.WebViewUI", intent, 53);
    }
}
