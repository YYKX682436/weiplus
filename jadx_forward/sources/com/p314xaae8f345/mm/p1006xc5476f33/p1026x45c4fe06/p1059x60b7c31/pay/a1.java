package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes.dex */
public class a1 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f164110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f164111b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.b1 f164112c;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.b1 b1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17) {
        this.f164112c = b1Var;
        this.f164110a = c0Var;
        this.f164111b = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.JsApiRequestBizSplitBillPayment", "mmOnActivityResult, resultCode = " + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.b1 b1Var = this.f164112c;
        int i19 = this.f164111b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f164110a;
        if (i18 != -1) {
            c0Var.a(i19, b1Var.o("fail"));
            return false;
        }
        if (intent == null || !intent.getBooleanExtra("cancel", false)) {
            c0Var.a(i19, b1Var.o("ok"));
            return true;
        }
        c0Var.a(i19, b1Var.o("cancel"));
        return true;
    }
}
