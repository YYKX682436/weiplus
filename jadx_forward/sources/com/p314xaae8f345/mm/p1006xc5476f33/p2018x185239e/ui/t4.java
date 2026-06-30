package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class t4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f239484d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.zg5 f239485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.u4 f239486f;

    public t4(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.u4 u4Var, r45.zg5 zg5Var) {
        this.f239486f = u4Var;
        this.f239485e = zg5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailUI", "WalletGetUserInfoEvent callback() hasCallback:%s", java.lang.Boolean.valueOf(this.f239484d));
        if (!this.f239484d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.u4 u4Var = this.f239486f;
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883.X6(u4Var.f239507d, this.f239485e, u4Var.f239505b, u4Var.f239506c);
        }
        this.f239484d = true;
    }
}
