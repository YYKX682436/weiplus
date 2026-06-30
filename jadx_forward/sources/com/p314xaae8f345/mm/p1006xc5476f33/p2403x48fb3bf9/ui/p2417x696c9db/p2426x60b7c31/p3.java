package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class p3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.q3 f266866d;

    public p3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.q3 q3Var) {
        this.f266866d = q3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.q3 q3Var = this.f266866d;
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.a(q3Var.f266889f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "after parse to json data : %s", a17);
        android.app.ProgressDialog progressDialog = q3Var.f266891h.f266512h;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "after parse to json data : %s", a17);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("type", 1);
        hashMap.put("localIds", a17);
        hashMap.put("appId", q3Var.f266890g.getStringExtra("key_game_video_appid"));
        hashMap.put("appName", q3Var.f266890g.getStringExtra("key_game_video_appname"));
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = q3Var.f266891h;
        c1Var.i5(c1Var.f266509e, "chooseHaowanMedia:ok", hashMap);
    }
}
