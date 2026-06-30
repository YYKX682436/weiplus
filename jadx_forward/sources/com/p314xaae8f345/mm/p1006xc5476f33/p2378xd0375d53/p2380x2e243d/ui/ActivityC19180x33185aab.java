package com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUBankcardManageUI */
/* loaded from: classes9.dex */
public class ActivityC19180x33185aab extends com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19024x28e2705e {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19024x28e2705e
    public void U6(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p2802xd031a825.a.j(this, rt4.f.class, bundle, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19024x28e2705e
    public void V6(boolean z17) {
        if (z17) {
            m83099x5406100e(new us4.a(), false);
        } else {
            m83096xe7b1ccf7(new us4.a());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19024x28e2705e
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.c W6() {
        return new st4.a(this, this.f260082d);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19024x28e2705e
    public void Y6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("key_bankcard", c19091x9511676c);
        com.p314xaae8f345.mm.p2802xd031a825.a.j(this, rt4.h.class, bundle, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19024x28e2705e, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19024x28e2705e, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof us4.a)) {
            return false;
        }
        mo67598xf0aced2e(0);
        this.f260084f.i(this.f260082d, this.f260083e);
        a7();
        Z6();
        return true;
    }
}
