package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class r2 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266911d;

    public r2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var) {
        this.f266911d = c1Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266911d;
        android.app.ProgressDialog progressDialog = c1Var.f266512h;
        if (progressDialog != null && progressDialog.isShowing()) {
            c1Var.f266512h.dismiss();
            c1Var.f266512h = null;
        }
        gm0.j1.d().q(1566, this);
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Cgi_PayIBGGetUserOpenId fail");
            c1Var.i5(c1Var.f266509e, "selectSingleContact:fail", null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Cgi_PayIBGGetUserOpenId success");
        com.p314xaae8f345.mm.p944x882e457a.o oVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.g1) m1Var).f264420e;
        r45.t14 t14Var = oVar == null ? null : (r45.t14) oVar.f152244b.f152233a;
        if (t14Var == null) {
            c1Var.i5(c1Var.f266509e, "selectSingleContact:fail", null);
            return;
        }
        java.lang.Object obj = c1Var.f266509e.f422323a.get("result_sign_type");
        int P = obj != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) obj, 0) : 0;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("package", t14Var.f467594g);
        hashMap.put("sign", t14Var.f467595h);
        if (P == 1) {
            hashMap.put("signType", t14Var.f467596i);
        }
        hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, t14Var.f467593f);
        hashMap.put("noncestr", t14Var.f467592e);
        c1Var.i5(c1Var.f266509e, "selectSingleContact:ok", hashMap);
    }
}
