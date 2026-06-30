package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes.dex */
public class i2 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f164144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f164145e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.k2 f164146f;

    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.k2 k2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f164146f = k2Var;
        this.f164144d = e9Var;
        this.f164145e = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.k2 k2Var = this.f164146f;
        if (i17 != (k2Var.hashCode() & 65535)) {
            return;
        }
        k2Var.f164156g = false;
        int intExtra = intent != null ? intent.getIntExtra("key_err_code", 1) : 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestVirtualPayment", "resultCode:%d,result:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(intExtra));
        int i19 = this.f164145e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f164144d;
        if (i18 != -1) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", java.lang.Integer.valueOf(intExtra));
            e9Var.a(i19, k2Var.p("cancel", hashMap));
        } else {
            if (intExtra == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestVirtualPayment", "requestIAP ok");
                e9Var.a(i19, k2Var.o("ok"));
                return;
            }
            java.util.HashMap hashMap2 = new java.util.HashMap();
            java.lang.String stringExtra = intent.getStringExtra("key_err_msg");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (stringExtra == null) {
                stringExtra = "";
            }
            hashMap2.put("errCode", java.lang.Integer.valueOf(intExtra));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestVirtualPayment", "requestVirtualPayment errCode: %d, errMsg: %s", java.lang.Integer.valueOf(intExtra), stringExtra);
            e9Var.a(i19, k2Var.p("fail ".concat(stringExtra), hashMap2));
        }
    }
}
