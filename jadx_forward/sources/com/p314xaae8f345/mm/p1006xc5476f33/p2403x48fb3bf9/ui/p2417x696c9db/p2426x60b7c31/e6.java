package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class e6 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266611b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266612c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f266613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266614e;

    public e6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, java.lang.String str, java.lang.String str2, nw4.y2 y2Var, int i17) {
        this.f266614e = c1Var;
        this.f266610a = str;
        this.f266611b = str2;
        this.f266612c = y2Var;
        this.f266613d = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0
    public void a(boolean z17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str5 = this.f266610a;
        sb6.append(str5);
        sb6.append(", on cdn finish,  is success : %s, mediaId : %s, local id is : %s, mediaUrl : %s");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", sb6.toString(), java.lang.Boolean.valueOf(z17), str2, str, str3);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.lang.String str6 = this.f266611b;
        if (str.equals(str6)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266614e;
            ((java.util.HashMap) c1Var.X).remove(str6);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj().i(this);
            android.app.ProgressDialog progressDialog = c1Var.f266512h;
            if (progressDialog != null) {
                progressDialog.dismiss();
                c1Var.f266512h = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.F3(c1Var);
            nw4.y2 y2Var = this.f266612c;
            if (!z17) {
                c1Var.i5(y2Var, str5 + ":fail", null);
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().b(str);
            if (this.f266613d != 8 || b17 == null || b17.f264279r == null) {
                hashMap.put("serverId", str2);
                hashMap.put("mediaUrl", str3);
            } else {
                hashMap.put("serverId", str2);
                hashMap.put("fileId", b17.f264279r.f38730xf9dbbe9c);
                hashMap.put("aesKey", b17.f264279r.f38729xf11df5f5);
                hashMap.put("fileLength", java.lang.Integer.valueOf(b17.f264279r.f38731x17c343e7));
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k4 k4Var = b17.f264279r;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", str5 + "on cdn finish,  fileId : %s, aesKey is : %s, fileLength : %s", k4Var.f38730xf9dbbe9c, k4Var.f38729xf11df5f5, java.lang.Integer.valueOf(k4Var.f38731x17c343e7));
            }
            c1Var.i5(y2Var, str5 + ":ok", hashMap);
        }
    }
}
