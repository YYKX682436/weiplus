package yt4;

/* loaded from: classes9.dex */
public abstract class f extends com.p314xaae8f345.mm.p2802xd031a825.h {
    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void c(android.app.Activity activity, int i17) {
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.pwd.ui.ActivityC19192xe32b521d) {
            d(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.pwd.ui.ActivityC19193x2c6531ab.class, null, i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        if (this.f295334c.getInt("key_errcode_payu", -1) == 0) {
            db5.t7.m123882x26a183b(activity, com.p314xaae8f345.mm.R.C30867xcad56011.kst, 0).show();
        } else {
            db5.t7.m123882x26a183b(activity, com.p314xaae8f345.mm.R.C30867xcad56011.klj, 0).show();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayUBaseChangePwdProcess", " walletMallV2 switch is ：%s", java.lang.Boolean.TRUE);
        j(activity, "mall", ".ui.MallIndexUIv2");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.pwd.ui.ActivityC19193x2c6531ab) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.pwd.ui.ActivityC19192xe32b521d.class, bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public np5.g p(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.pwd.ui.ActivityC19192xe32b521d) {
            return new yt4.e(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }
}
