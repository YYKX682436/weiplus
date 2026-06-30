package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class ja implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f162867a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f162868b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f162869c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ka f162870d;

    public ja(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ka kaVar, android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17) {
        this.f162870d = kaVar;
        this.f162867a = activity;
        this.f162868b = d0Var;
        this.f162869c = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ka kaVar = this.f162870d;
        if (i17 != kaVar.f162885g) {
            return false;
        }
        int i19 = this.f162869c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = this.f162868b;
        if (i18 == -1) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_mode", 1);
            j45.l.j(this.f162867a, "wallet", ".balance.ui.lqt.WalletLqtPlanAddUI", intent2, null);
            d0Var.a(i19, kaVar.o("ok"));
        } else {
            d0Var.a(i19, kaVar.o("fail"));
            if (!h45.y.c()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14954, h45.y.f360501a, "openWCPayLQTDepositPlanAdd:fail");
            }
        }
        if (!h45.y.c()) {
            h45.y.f360501a = null;
        }
        return true;
    }
}
