package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class t4 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f164987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f164988b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u4 f164989c;

    public t4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u4 u4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f164989c = u4Var;
        this.f164987a = e9Var;
        this.f164988b = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u4 u4Var = this.f164989c;
        if (i17 != (u4Var.hashCode() & 65535)) {
            return false;
        }
        int i19 = this.f164988b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f164987a;
        if (i18 != -1 || intent == null) {
            if (i18 == 0) {
                e9Var.a(i19, u4Var.o("cancel"));
                return true;
            }
            e9Var.a(i19, u4Var.o("fail"));
            return true;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String stringExtra = intent.getStringExtra("choose_invoice_title_info");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseInvoiceTitle", "choose_invoice_title_info is : ".concat(stringExtra));
        hashMap.put("invoiceTitleInfo", stringExtra);
        e9Var.a(i19, u4Var.p("ok", hashMap));
        return true;
    }
}
