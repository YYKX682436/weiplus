package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes8.dex */
public class r0 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.z67 f230006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f230007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.s0 f230008c;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.s0 s0Var, r45.z67 z67Var, boolean z17) {
        this.f230008c = s0Var;
        this.f230006a = z67Var;
        this.f230007b = z17;
    }

    @Override // db5.c1
    public void e(int i17) {
        r45.z67 z67Var = this.f230006a;
        int size = z67Var.f473288d.size();
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.s0 s0Var = this.f230008c;
        if (i17 < size) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", x51.j1.b(((r45.a77) z67Var.f473288d.get(i17)).f451343e));
            intent.putExtra(com.p314xaae8f345.mm.ui.w2.f292738r, true);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(s0Var.f230014d.mo55332x76847179(), intent);
            return;
        }
        if (this.f230007b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16478x250c8472 activityC16478x250c8472 = s0Var.f230014d;
            activityC16478x250c8472.getClass();
            j45.l.m(activityC16478x250c8472, "wallet_core", ".ui.WalletSwitchWalletCurrencyUI", 1);
        }
    }
}
