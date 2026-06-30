package rt4;

/* loaded from: classes9.dex */
public class f extends com.p314xaae8f345.mm.p2802xd031a825.h {
    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public com.p314xaae8f345.mm.p2802xd031a825.h A(android.app.Activity activity, android.os.Bundle bundle) {
        B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.pwd.ui.ActivityC19190xafb26b6f.class, bundle);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void c(android.app.Activity activity, int i17) {
        m(activity);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public java.lang.String e() {
        return "PayUBindProcess";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        if (this.f295334c.getInt("key_errcode_payu", -1) == 0) {
            db5.t7.m123882x26a183b(activity, com.p314xaae8f345.mm.R.C30867xcad56011.kst, 0).show();
            i(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.ui.ActivityC19180x33185aab.class, -1, false);
        } else {
            db5.t7.m123882x26a183b(activity, com.p314xaae8f345.mm.R.C30867xcad56011.klj, 0).show();
            i(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.ui.ActivityC19180x33185aab.class, 0, false);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.pwd.ui.ActivityC19190xafb26b6f) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.ui.ActivityC19181xc87129a.class, bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public np5.g p(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.pwd.ui.ActivityC19190xafb26b6f) {
            return new rt4.d(this, abstractActivityC21394xb3d2c0cf, b0Var, this.f295334c);
        }
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.ui.ActivityC19181xc87129a) {
            return new rt4.e(this, abstractActivityC21394xb3d2c0cf, b0Var);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }
}
