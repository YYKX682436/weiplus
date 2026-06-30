package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class ha implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f162817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f162818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f162819c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ia f162820d;

    public ha(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ia iaVar, android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17) {
        this.f162820d = iaVar;
        this.f162817a = activity;
        this.f162818b = d0Var;
        this.f162819c = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ia iaVar = this.f162820d;
        if (i17 != iaVar.f162845g) {
            return false;
        }
        int i19 = this.f162819c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = this.f162818b;
        if (i18 == -1) {
            new android.content.Intent().putExtra("key_mode", 1);
            j45.l.h(this.f162817a, "wallet", ".balance.ui.lqt.WalletLqtPlanBeforeHomeUI");
            d0Var.a(i19, iaVar.o("ok"));
        } else {
            d0Var.a(i19, iaVar.o("fail"));
            if (!h45.y.c()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14954, h45.y.f360501a, "openWCPayLQTDepositPlan:fail");
            }
        }
        if (!h45.y.c()) {
            h45.y.f360501a = null;
        }
        return true;
    }
}
