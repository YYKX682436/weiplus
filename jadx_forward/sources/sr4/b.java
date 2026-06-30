package sr4;

/* loaded from: classes9.dex */
public class b extends com.p314xaae8f345.mm.p2802xd031a825.h {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f493399d = "";

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public com.p314xaae8f345.mm.p2802xd031a825.h A(android.app.Activity activity, android.os.Bundle bundle) {
        if (bundle.getBoolean("key_is_show_detail", true)) {
            F(activity, bundle);
        } else {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362.class, bundle);
        }
        return this;
    }

    public void F(android.app.Activity activity, android.os.Bundle bundle) {
        B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19023x5fcee04a.class, bundle);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void c(android.app.Activity activity, int i17) {
        m(activity);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public java.lang.String e() {
        return "UnbindProcess";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        if (this.f295334c.getInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, -1) != 1) {
            if (this.f295334c.getInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, -1) == 2) {
                j(activity, "wallet", ".balance.ui.WalletBalanceManagerUI");
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessManager", " walletMallV2 switch is ：%s", java.lang.Boolean.TRUE);
                j(activity, "mall", ".ui.MallIndexUIv2");
                return;
            }
        }
        int i17 = bundle.getInt("key_process_result_code", 0);
        k(activity, "wallet", ".bind.ui.WalletUnbindBankCardProxyUI", i17, null, false);
        if (i17 == -1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5778x426a2e60 c5778x426a2e60 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5778x426a2e60();
            am.dm dmVar = c5778x426a2e60.f136091g;
            dmVar.f88010a = 2;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f493399d)) {
                dmVar.f88011b = this.f493399d;
            }
            c5778x426a2e60.e();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19023x5fcee04a) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362.class, bundle);
        } else if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362) {
            f(activity, bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public np5.g p(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362) {
            return new sr4.a(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362;
    }
}
