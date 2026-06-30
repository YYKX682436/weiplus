package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class w6 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267034b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f267035c;

    public w6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, java.lang.String str, nw4.y2 y2Var) {
        this.f267035c = c1Var;
        this.f267033a = str;
        this.f267034b = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0
    public void a(boolean z17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "doDownloadVoice, on cdn finish, is success : %b, local id : %s, media id is : %s", java.lang.Boolean.valueOf(z17), str, str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || !str2.equals(this.f267033a)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj().i(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f267035c;
        android.app.ProgressDialog progressDialog = c1Var.f266512h;
        if (progressDialog != null) {
            progressDialog.dismiss();
            c1Var.f266512h = null;
        }
        nw4.y2 y2Var = this.f267034b;
        if (!z17) {
            c1Var.i5(y2Var, "downloadVoice:fail", null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(dm.i4.f66867x2a5c95c7, str);
        c1Var.i5(y2Var, "downloadVoice:ok", hashMap);
    }
}
