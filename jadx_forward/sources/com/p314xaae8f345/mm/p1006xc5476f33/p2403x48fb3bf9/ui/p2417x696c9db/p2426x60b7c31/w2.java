package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class w2 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f267023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267024e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f267025f;

    public w2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, android.content.Intent intent, java.lang.String str) {
        this.f267025f = c1Var;
        this.f267023d = intent;
        this.f267024e = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f267025f;
        android.app.ProgressDialog progressDialog = c1Var.f266512h;
        if (progressDialog != null && progressDialog.isShowing()) {
            c1Var.f266512h.dismiss();
            c1Var.f266512h = null;
        }
        gm0.j1.d().q(1177, this);
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Biz_Jsapi_Getuseropendid fail");
            c1Var.i5(c1Var.f266509e, "sendSingleAppMessage:fail", null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Biz_Jsapi_Getuseropendid success");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m1 m1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m1) m1Var;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5857xdf813330, m1Var2.f264541f);
        hashMap.put("headImgUrl", m1Var2.f264543h);
        hashMap.put("nickName", m1Var2.f264544i);
        java.lang.String str2 = (java.lang.String) c1Var.f266509e.f422323a.get("img_url");
        java.lang.String str3 = (java.lang.String) c1Var.f266509e.f422323a.get("src_username");
        java.lang.String str4 = (java.lang.String) c1Var.f266509e.f422323a.get("src_displayname");
        android.content.Intent intent = this.f267023d;
        this.f267025f.Q5(null, "", this.f267024e, str2, str3, str4, intent != null ? intent.getStringExtra("custom_send_text") : null, null);
        android.content.Context context = c1Var.f266508d;
        if (context != null) {
            db5.e1.T(context, j65.q.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi));
        }
        c1Var.i5(c1Var.f266509e, "sendSingleAppMessage:ok", hashMap);
    }
}
