package ka2;

/* loaded from: classes10.dex */
public final class y implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 f387585d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 activityC13659x4f0951e4) {
        this.f387585d = activityC13659x4f0951e4;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 activityC13659x4f0951e4 = this.f387585d;
        if (activityC13659x4f0951e4.C || activityC13659x4f0951e4.D) {
            return false;
        }
        if (!z17) {
            if (!activityC13659x4f0951e4.E && !com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a()) {
                activityC13659x4f0951e4.E = true;
                db5.e1.C(activityC13659x4f0951e4, activityC13659x4f0951e4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fs_), activityC13659x4f0951e4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC13659x4f0951e4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), activityC13659x4f0951e4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new ka2.x(activityC13659x4f0951e4), null);
            }
            return true;
        }
        int i18 = (int) d18;
        ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(2003, f17, f18, i18);
        activityC13659x4f0951e4.D = true;
        i11.e eVar = activityC13659x4f0951e4.A;
        if (eVar != null) {
            ((i11.h) eVar).m(this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPoiNormalLbsListUI", "on get location %f %f " + java.lang.System.currentTimeMillis(), java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f17));
        r45.gd1 gd1Var = new r45.gd1();
        gd1Var.set(0, java.lang.Float.valueOf(f17));
        gd1Var.set(1, java.lang.Float.valueOf(f18));
        gd1Var.set(2, java.lang.Integer.valueOf(i18));
        gd1Var.set(3, "");
        gd1Var.set(4, "");
        activityC13659x4f0951e4.G = gd1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4.n7(activityC13659x4f0951e4, null, false, false, false, null, 0, 63, null);
        ((ey2.k0) ((jz5.n) activityC13659x4f0951e4.I).mo141623x754a37bb()).T6(f17, f18);
        return false;
    }
}
