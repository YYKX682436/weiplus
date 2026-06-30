package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class r4 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f164425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f164426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s4 f164427c;

    public r4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s4 s4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f164427c = s4Var;
        this.f164425a = e9Var;
        this.f164426b = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s4 s4Var = this.f164427c;
        int i19 = s4Var.f164456g;
        int i27 = this.f164426b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f164425a;
        if (i19 != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseInvoice", "onActivityResult mismatch requestCode, with appId:%s, callbackId:%d", e9Var.mo48798x74292566(), java.lang.Integer.valueOf(i27));
            e9Var.a(i27, s4Var.o("fail:internal error"));
            return false;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (i18 != -1) {
            if (i18 == 0) {
                e9Var.a(i27, s4Var.o("cancel"));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseInvoice", "callback cancel");
                return true;
            }
            e9Var.a(i27, s4Var.o("fail"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseInvoice", "callback fail");
            return true;
        }
        if (intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("choose_invoice_info");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (stringExtra == null) {
                stringExtra = "";
            }
            hashMap.put("invoiceInfo", stringExtra);
        }
        e9Var.a(i27, s4Var.p("ok", hashMap));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseInvoice", "callback ok values = " + hashMap);
        return true;
    }
}
