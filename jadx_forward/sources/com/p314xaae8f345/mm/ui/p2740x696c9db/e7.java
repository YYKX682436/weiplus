package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public class e7 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22513x4a79ed20 f291909d;

    public e7(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22513x4a79ed20 activityC22513x4a79ed20) {
        this.f291909d = activityC22513x4a79ed20;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22513x4a79ed20 activityC22513x4a79ed20 = this.f291909d;
        if (activityC22513x4a79ed20.f291644y == null) {
            return false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiStageCitySelectUI", "lat:%f lng:%f accuracy:%f", java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f17), java.lang.Double.valueOf(d18));
            c01.d9.e().g(new va3.y(f18, f17));
        } else {
            com.p314xaae8f345.mm.ui.p2740x696c9db.C22561x90a7947 c22561x90a7947 = activityC22513x4a79ed20.f291643x;
            if (c22561x90a7947 != null) {
                c22561x90a7947.P = 2;
                c22561x90a7947.M();
            }
            if (!activityC22513x4a79ed20.f291641v && !com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a()) {
                activityC22513x4a79ed20.f291641v = true;
                db5.e1.C(activityC22513x4a79ed20, activityC22513x4a79ed20.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fs_), activityC22513x4a79ed20.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC22513x4a79ed20.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), activityC22513x4a79ed20.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.ui.p2740x696c9db.d7(this), null);
            }
        }
        i11.e eVar = activityC22513x4a79ed20.f291644y;
        if (eVar != null) {
            ((i11.h) eVar).m(activityC22513x4a79ed20.D);
            activityC22513x4a79ed20.f291644y = null;
        }
        return false;
    }
}
