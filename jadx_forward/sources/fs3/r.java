package fs3;

/* loaded from: classes15.dex */
public class r implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d f347849d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d activityC16925x87b5f55d) {
        this.f347849d = activityC16925x87b5f55d;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d activityC16925x87b5f55d = this.f347849d;
        if (z17) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.lbs.C19621x752a03d5 c19621x752a03d5 = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.lbs.C19621x752a03d5(f18, f17, (int) d18, i17, "", "");
            if (!(c19621x752a03d5.f270899d == -85.0f || c19621x752a03d5.f270900e == -1000.0f)) {
                activityC16925x87b5f55d.f236290i = c19621x752a03d5;
                activityC16925x87b5f55d.f236288g = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d.U6(activityC16925x87b5f55d);
            }
        } else {
            if (!activityC16925x87b5f55d.K && !com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a()) {
                activityC16925x87b5f55d.K = true;
                db5.e1.C(activityC16925x87b5f55d, activityC16925x87b5f55d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fs_), activityC16925x87b5f55d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16925x87b5f55d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), activityC16925x87b5f55d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new fs3.q(this), null);
            }
            activityC16925x87b5f55d.f236288g = false;
        }
        return false;
    }
}
