package c05;

/* loaded from: classes9.dex */
public class q extends com.p314xaae8f345.mm.p2802xd031a825.h {
    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public com.p314xaae8f345.mm.p2802xd031a825.h A(android.app.Activity activity, android.os.Bundle bundle) {
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().s()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenWXCreditProcess", "unknow wallet reg status!");
        } else if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362.class, bundle);
        } else {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19560xce083491.class, bundle);
        }
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void c(android.app.Activity activity, int i17) {
        m(activity);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public java.lang.String e() {
        return "WXCreditOpenProcess";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        j(activity, "wallet", ".bind.ui.WalletBankcardManageUI");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        boolean z17 = activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19560xce083491;
        if (z17) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19551x72ba7da1.class, bundle);
            return;
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362) {
            m(activity);
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19560xce083491.class, bundle);
            return;
        }
        if (z17) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19551x72ba7da1.class, bundle);
            return;
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19551x72ba7da1) {
            if (bundle.getBoolean("key_need_bind_deposit", true)) {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19550xb0b9025c.class, bundle);
                return;
            } else {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3.class, bundle);
                return;
            }
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19550xb0b9025c) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3.class, bundle);
            return;
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3) {
            if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19559x3ee49bce.class, bundle);
                return;
            } else {
                B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8.class, bundle);
                return;
            }
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950.class, bundle);
        } else if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19559x3ee49bce.class, bundle);
        } else if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19559x3ee49bce) {
            f(activity, bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public np5.g p(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362) {
            return new c05.i(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19551x72ba7da1) {
            return new c05.j(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3) {
            return new c05.k(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19550xb0b9025c) {
            return new c05.n(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950) {
            return new c05.o(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19559x3ee49bce) {
            return new c05.p(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }
}
