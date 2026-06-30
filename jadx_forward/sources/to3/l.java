package to3;

/* loaded from: classes9.dex */
public class l extends qs4.j {
    public static void H(to3.l lVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        lVar.getClass();
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = (com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf;
        java.lang.String string = abstractActivityC22902xe37969e.m83105x7498fe14().getString("key_pwd1");
        int i17 = abstractActivityC22902xe37969e.m83105x7498fe14().getInt("offline_add_fee", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c d17 = yo3.m.d(true);
        if (d17 != null) {
            abstractActivityC22902xe37969e.m83096xe7b1ccf7(new wo3.k(d17, string, i17));
        }
    }

    @Override // qs4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public void c(android.app.Activity activity, int i17) {
        super.c(activity, i17);
    }

    @Override // qs4.j, com.p314xaae8f345.mm.p2802xd031a825.h
    public java.lang.String e() {
        return "OfflineBindCardRegProcess";
    }

    @Override // qs4.j, com.p314xaae8f345.mm.p2802xd031a825.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5775xe7123c10().e();
        h(activity, com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16769x400fef4.class, -1, null, true);
        activity.finish();
    }

    @Override // qs4.j, com.p314xaae8f345.mm.p2802xd031a825.h
    public np5.g p(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        return abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3 ? new to3.j(this, abstractActivityC21394xb3d2c0cf, b0Var) : abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950 ? new to3.k(this, abstractActivityC21394xb3d2c0cf, b0Var) : super.p(abstractActivityC21394xb3d2c0cf, b0Var);
    }

    @Override // qs4.j, qs4.b, com.p314xaae8f345.mm.p2802xd031a825.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return super.t(activity, bundle);
    }
}
