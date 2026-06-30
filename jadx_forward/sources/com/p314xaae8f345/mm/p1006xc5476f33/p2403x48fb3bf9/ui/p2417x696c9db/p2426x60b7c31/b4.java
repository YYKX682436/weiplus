package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class b4 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266480a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266481b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266482c;

    public b4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, java.lang.String str, nw4.y2 y2Var) {
        this.f266482c = c1Var;
        this.f266480a = str;
        this.f266481b = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.s
    public void a(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((str == null ? "" : str).equals(this.f266480a)) {
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("cardType", str);
            this.f266482c.i5(this.f266481b, "scanLicence:fail", hashMap);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.s
    public void b(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((str == null ? "" : str).equals(this.f266480a)) {
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("cardType", str);
            this.f266482c.i5(this.f266481b, "scanLicence:cancel", hashMap);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.s
    public void c(java.lang.String str, org.json.JSONObject jSONObject, android.graphics.Bitmap bitmap) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = this.f266480a;
        if (!str2.equalsIgnoreCase(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "msg.params.cardType = %s, callback type = %s, mismatch!!!", str3, str);
            return;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "doScanLicence, type = %s, callback onSuccess but result is null", str);
            a(str);
        } else {
            java.util.HashMap hashMap = new java.util.HashMap(2);
            hashMap.put("cardType", str);
            hashMap.put("cardInfo", jSONObject);
            this.f266482c.i5(this.f266481b, "scanLicence:ok", hashMap);
        }
    }
}
