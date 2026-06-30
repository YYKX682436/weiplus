package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class t6 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266951b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266952c;

    public t6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, java.lang.String str, nw4.y2 y2Var) {
        this.f266952c = c1Var;
        this.f266950a = str;
        this.f266951b = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0
    public void a(boolean z17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "doUploadVoice, on cdn finish,  is success : %s, mediaid : %s, local id is : %s", java.lang.Boolean.valueOf(z17), str2, str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.equals(this.f266950a)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj().i(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266952c;
        android.app.ProgressDialog progressDialog = c1Var.f266512h;
        if (progressDialog != null) {
            progressDialog.dismiss();
            c1Var.f266512h = null;
        }
        nw4.y2 y2Var = this.f266951b;
        if (!z17) {
            c1Var.i5(y2Var, "uploadVoice:fail", null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("serverId", str2);
        c1Var.i5(y2Var, "uploadVoice:ok", hashMap);
    }
}
