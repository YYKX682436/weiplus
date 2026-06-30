package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class la implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162901a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f162902b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f162903c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f162904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f162905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.na f162906f;

    public la(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.na naVar, int i17, int i18, android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i19) {
        this.f162906f = naVar;
        this.f162901a = i17;
        this.f162902b = i18;
        this.f162903c = activity;
        this.f162904d = d0Var;
        this.f162905e = i19;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.na naVar = this.f162906f;
        if (i17 != naVar.f163915g) {
            return false;
        }
        int i19 = this.f162905e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = this.f162904d;
        if (i18 == -1) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_account_type", 1);
            int i27 = this.f162901a;
            android.app.Activity activity = this.f162903c;
            if (i27 == 1) {
                intent2.putExtra("show_open_toast", this.f162902b);
                j45.l.j(activity, "wallet", ".balance.ui.lqt.WalletLqtBalanceAutoTransferUI", intent2, null);
            } else {
                if (!((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new android.os.Bundle(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ma.class)).f149933d) {
                    j45.l.j(activity, "wallet", ".balance.ui.lqt.WalletLqtDetailUI", intent2, null);
                }
            }
            d0Var.a(i19, naVar.o("ok"));
        } else {
            d0Var.a(i19, naVar.o("fail"));
            if (!h45.y.c()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14954, h45.y.f360501a, "JsApiOpenWCPayLQTDetail:fail");
            }
        }
        if (!h45.y.c()) {
            h45.y.f360501a = null;
        }
        return true;
    }
}
