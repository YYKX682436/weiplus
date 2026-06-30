package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class t2 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266945d;

    public t2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var) {
        this.f266945d = c1Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266945d;
        android.app.ProgressDialog progressDialog = c1Var.f266512h;
        if (progressDialog != null && progressDialog.isShowing()) {
            c1Var.f266512h.dismiss();
            c1Var.f266512h = null;
        }
        gm0.j1.d().q(1177, this);
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Biz_Jsapi_Getuseropendid fail");
            c1Var.i5(c1Var.f266509e, "selectSingleContact:fail", null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Biz_Jsapi_Getuseropendid success");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m1 m1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m1) m1Var;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("package", m1Var2.f264541f);
        hashMap.put("sign", m1Var2.f264542g);
        hashMap.put("headImgUrl", m1Var2.f264543h);
        hashMap.put("nickName", m1Var2.f264544i);
        hashMap.put("friendRelation", java.lang.Integer.valueOf(m1Var2.f264545m));
        c1Var.i5(c1Var.f266509e, "selectSingleContact:ok", hashMap);
    }
}
