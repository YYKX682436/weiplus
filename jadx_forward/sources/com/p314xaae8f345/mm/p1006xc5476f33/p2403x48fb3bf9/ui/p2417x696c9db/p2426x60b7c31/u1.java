package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class u1 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266958a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266959b;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, nw4.y2 y2Var) {
        this.f266959b = c1Var;
        this.f266958a = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.s
    public void a(java.lang.String str) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.K1;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.M1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266959b;
        c1Var.k5(i17, i18);
        c1Var.i5(this.f266958a, "chooseIdCard:fail", null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.s
    public void b(java.lang.String str) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.K1;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.M1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266959b;
        c1Var.k5(i17, i18);
        c1Var.i5(this.f266958a, "chooseIdCard:cancel", null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.s
    public void c(java.lang.String str, org.json.JSONObject jSONObject, android.graphics.Bitmap bitmap) {
        nw4.y2 y2Var = this.f266958a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266959b;
        if (bitmap == null) {
            c1Var.i5(y2Var, "chooseIdCard:fail", null);
            return;
        }
        try {
            java.lang.String str2 = lp0.b.e() + "tmpScanLicense/";
            if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                com.p314xaae8f345.mm.vfs.w6.f(str2);
            }
            com.p314xaae8f345.mm.vfs.w6.u(str2);
            com.p314xaae8f345.mm.vfs.w6.t(str2);
            java.lang.String str3 = str2 + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str3, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.d(str3);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(d17);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("sourceType", "scan");
            hashMap.put(dm.i4.f66867x2a5c95c7, d17.f264269e);
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.K1;
            c1Var.k5(i17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.O1);
            c1Var.k5(i17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.N1);
            c1Var.i5(y2Var, "chooseIdCard:ok", hashMap);
        } catch (java.lang.Exception e17) {
            c1Var.k5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.K1, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.M1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "save scan license error: %s", e17.getMessage());
            c1Var.i5(y2Var, "chooseIdCard:fail", null);
        }
    }
}
