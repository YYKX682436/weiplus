package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes15.dex */
public class r0 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 f241152d;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 activityC17301x38c077a3) {
        this.f241152d = activityC17301x38c077a3;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 activityC17301x38c077a3 = this.f241152d;
        if (!z17) {
            if (!activityC17301x38c077a3.K && !com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 activityC17301x38c077a32 = this.f241152d;
                activityC17301x38c077a32.K = true;
                db5.e1.C(activityC17301x38c077a32, activityC17301x38c077a32.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fs_), activityC17301x38c077a3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC17301x38c077a3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), activityC17301x38c077a3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.j0(this), null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.scanner.ProductUI", "getLocation fail");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.scanner.ProductUI", "getLocation suc");
        if (activityC17301x38c077a3.f240852q != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.scanner.ProductUI", "do getActionInfoScene, lng=" + f17 + ", lat=" + f18);
            gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.c0(activityC17301x38c077a3.C, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.n0.a(activityC17301x38c077a3.f240852q.f327565a), activityC17301x38c077a3.f240857v, activityC17301x38c077a3.D, (double) f17, (double) f18));
        }
        i11.e eVar = activityC17301x38c077a3.I;
        if (eVar != null) {
            ((i11.h) eVar).m(activityC17301x38c077a3.L);
        }
        if (!activityC17301x38c077a3.f240841J) {
            activityC17301x38c077a3.f240841J = true;
            ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46349x3142bb26, f17, f18, (int) d18);
        }
        return false;
    }
}
