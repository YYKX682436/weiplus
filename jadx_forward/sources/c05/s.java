package c05;

/* loaded from: classes9.dex */
public class s extends com.p314xaae8f345.mm.p2802xd031a825.h {
    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public com.p314xaae8f345.mm.p2802xd031a825.h A(android.app.Activity activity, android.os.Bundle bundle) {
        if (bundle.getBoolean("key_is_show_detail", true)) {
            D(activity, "wallet", ".bind.ui.WalletBankcardDetailUI", bundle);
        } else {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362.class, bundle);
        }
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void c(android.app.Activity activity, int i17) {
        m(activity);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public java.lang.String e() {
        return "WXCreditUnbindProcess";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessManager", " walletMallV2 switch is ：%s", java.lang.Boolean.TRUE);
        j(activity, "mall", ".ui.MallIndexUIv2");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (activity.getClass().getSimpleName().equalsIgnoreCase("WalletBankcardDetailUI")) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362.class, bundle);
        } else if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362) {
            f(activity, bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public np5.g p(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362) {
            return new c05.r(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }
}
