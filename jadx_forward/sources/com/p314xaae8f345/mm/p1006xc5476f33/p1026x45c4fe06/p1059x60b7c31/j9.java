package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class j9 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f162864a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f162865b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k9 f162866c;

    public j9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k9 k9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f162866c = k9Var;
        this.f162864a = e9Var;
        this.f162865b = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k9 k9Var = this.f162866c;
        if (i17 != k9Var.f162884g) {
            return false;
        }
        int i19 = this.f162865b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f162864a;
        if (i18 == -1) {
            e9Var.a(i19, k9Var.o("ok"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenCard", "view card result is ok!");
            return true;
        }
        if (i18 == 0) {
            e9Var.a(i19, k9Var.o("cancel"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenCard", "view card result is cancel!");
            return true;
        }
        e9Var.a(i19, k9Var.o("fail"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenCard", "view card result is fail!");
        return true;
    }
}
