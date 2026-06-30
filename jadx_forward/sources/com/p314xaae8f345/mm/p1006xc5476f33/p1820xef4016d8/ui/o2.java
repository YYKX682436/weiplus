package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f228785d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.zg5 f228786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p2 f228787f;

    public o2(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p2 p2Var, r45.zg5 zg5Var) {
        this.f228787f = p2Var;
        this.f228786e = zg5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "WalletGetUserInfoEvent callback() hasCallback:%s", java.lang.Boolean.valueOf(this.f228785d));
        if (!this.f228785d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p2 p2Var = this.f228787f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d.Y6(p2Var.f228836d, this.f228786e, p2Var.f228834b, p2Var.f228835c);
        }
        this.f228785d = true;
    }
}
