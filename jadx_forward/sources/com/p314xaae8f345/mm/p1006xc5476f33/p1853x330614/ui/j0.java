package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes8.dex */
public class j0 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.z67 f229946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f229947b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.k0 f229948c;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.k0 k0Var, r45.z67 z67Var, boolean z17) {
        this.f229948c = k0Var;
        this.f229946a = z67Var;
        this.f229947b = z17;
    }

    @Override // db5.c1
    public void e(int i17) {
        r45.z67 z67Var = this.f229946a;
        int size = z67Var.f473288d.size();
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.k0 k0Var = this.f229948c;
        if (i17 < size) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", x51.j1.b(((r45.a77) z67Var.f473288d.get(i17)).f451343e));
            intent.putExtra(com.p314xaae8f345.mm.ui.w2.f292738r, true);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(k0Var.f229958d.mo55332x76847179(), intent);
            return;
        }
        if (this.f229947b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16477xce7d7b76 activityC16477xce7d7b76 = k0Var.f229958d;
            activityC16477xce7d7b76.getClass();
            j45.l.m(activityC16477xce7d7b76, "wallet_core", ".ui.WalletSwitchWalletCurrencyUI", 1);
        }
    }
}
