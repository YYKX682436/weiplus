package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class y0 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f264051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.z0 f264052e;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.z0 z0Var, sd.b bVar) {
        this.f264052e = z0Var;
        this.f264051d = bVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 != (this.f264052e.hashCode() & 65535)) {
            return;
        }
        sd.b bVar = this.f264051d;
        if (i18 == -1) {
            bVar.a();
            return;
        }
        if (i18 != 5) {
            bVar.c("cancel", null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        int intExtra = intent.getIntExtra("key_jsapi_pay_err_code", 0);
        java.lang.String stringExtra = intent.getStringExtra("key_jsapi_pay_err_msg");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        hashMap.put("err_code", java.lang.Integer.valueOf(intExtra));
        hashMap.put("err_desc", stringExtra);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetBrandWCPayRequest", "errCode: %d, errMsg: %s", java.lang.Integer.valueOf(intExtra), stringExtra);
        bVar.b("fail", hashMap);
    }
}
