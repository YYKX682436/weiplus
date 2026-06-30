package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class oa implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f163994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f163995b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f163996c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pa f163997d;

    public oa(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pa paVar, android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17) {
        this.f163997d = paVar;
        this.f163994a = activity;
        this.f163995b = d0Var;
        this.f163996c = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pa paVar = this.f163997d;
        int hashCode = paVar.hashCode() & 65535;
        int i19 = this.f163996c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = this.f163995b;
        if (i17 != hashCode) {
            if (i17 == (paVar.hashCode() & 65534)) {
                return false;
            }
            if (i18 == -1) {
                d0Var.a(i19, paVar.o("ok"));
            } else {
                d0Var.a(i19, paVar.o("fail"));
            }
            return true;
        }
        if (i18 == -1) {
            j45.l.n(this.f163994a, "wallet", ".balance.ui.lqt.WalletLqtBeforeSaveUI", new android.content.Intent(), paVar.hashCode() & 65534);
            d0Var.a(i19, paVar.o("ok"));
        } else {
            d0Var.a(i19, paVar.o("fail"));
            if (!h45.y.c()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14954, h45.y.f360501a, "JsApiOpenWCPayLQTSave:fail");
            }
        }
        if (!h45.y.c()) {
            h45.y.f360501a = null;
        }
        return true;
    }
}
