package rt4;

/* loaded from: classes9.dex */
public class h extends sr4.b {
    @Override // sr4.b
    public void F(android.app.Activity activity, android.os.Bundle bundle) {
        B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.ui.ActivityC19179x6a04ca97.class, bundle);
    }

    @Override // sr4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        if (this.f295334c.getInt("key_errcode_payu", -1) == 0) {
            db5.t7.m123882x26a183b(activity, com.p314xaae8f345.mm.R.C30867xcad56011.kst, 0).show();
        } else {
            db5.t7.m123882x26a183b(activity, com.p314xaae8f345.mm.R.C30867xcad56011.klj, 0).show();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayUUnbindProcess", " walletMallV2 switch is ：%s", java.lang.Boolean.TRUE);
        j(activity, "mall", ".ui.MallIndexUIv2");
    }

    @Override // sr4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19023x5fcee04a) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.pwd.ui.ActivityC19190xafb26b6f.class, bundle);
        } else if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.pwd.ui.ActivityC19190xafb26b6f) {
            f(activity, bundle);
        }
    }

    @Override // sr4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public np5.g p(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        return abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.pwd.ui.ActivityC19190xafb26b6f ? new rt4.g(this, abstractActivityC21394xb3d2c0cf, b0Var) : super.p(abstractActivityC21394xb3d2c0cf, b0Var);
    }

    @Override // sr4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }
}
