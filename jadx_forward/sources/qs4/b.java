package qs4;

/* loaded from: classes9.dex */
public abstract class b extends com.p314xaae8f345.mm.p2802xd031a825.h {
    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public com.p314xaae8f345.mm.p2802xd031a825.h A(android.app.Activity activity, android.os.Bundle bundle) {
        a("start", activity, bundle);
        if (bundle != null) {
            bundle.putBoolean("key_is_bind_reg_process", true);
        }
        B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514.class, bundle);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void c(android.app.Activity activity, int i17) {
        a("back", activity, java.lang.Integer.valueOf(i17));
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950) {
            d(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8.class, null, i17);
        } else {
            m(activity);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        a("forward", activity, java.lang.Integer.valueOf(i17), bundle);
        if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514) || (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19113xc67f5986)) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7.class, bundle);
            return;
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8.class, bundle);
        } else if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19122xf67b30d8) {
            B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950.class, bundle);
        } else if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19118x5d81cad7) {
            f(activity, bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public int q(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i17) {
        return com.p314xaae8f345.mm.R.C30867xcad56011.kn6;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19118x5d81cad7;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public boolean w(com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e, int i17, java.lang.String str) {
        if (i17 != 404) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessManager", "404 bind error, cancel bind!");
        db5.e1.E(abstractActivityC22902xe37969e, str, null, abstractActivityC22902xe37969e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kgx), false, new qs4.a(this, abstractActivityC22902xe37969e));
        return true;
    }
}
