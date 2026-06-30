package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class a6 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266452c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266453d;

    public a6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, java.lang.String str, java.lang.String str2, nw4.y2 y2Var) {
        this.f266453d = c1Var;
        this.f266450a = str;
        this.f266451b = str2;
        this.f266452c = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0
    public void a(boolean z17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str5 = this.f266450a;
        sb6.append(str5);
        sb6.append(" on cdn finish,  is success : %s, mediaid : %s, local id is : %s, mediaUrl : %s");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", sb6.toString(), java.lang.Boolean.valueOf(z17), str2, str, str3);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.equals(this.f266451b)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj().i(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266453d;
        android.app.ProgressDialog progressDialog = c1Var.f266512h;
        if (progressDialog != null) {
            progressDialog.dismiss();
            c1Var.f266512h = null;
        }
        nw4.y2 y2Var = this.f266452c;
        if (!z17) {
            c1Var.i5(y2Var, str5 + ":fail", null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("serverId", str2);
        hashMap.put("mediaUrl", str3);
        c1Var.i5(y2Var, str5 + ":ok", hashMap);
    }
}
