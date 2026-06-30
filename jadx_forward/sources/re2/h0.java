package re2;

/* loaded from: classes3.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f475953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14183x9ab478f1 f475954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f475955f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f475956g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.j01 f475957h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475958i;

    public h0(az2.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14183x9ab478f1 activityC14183x9ab478f1, int i17, int i18, r45.j01 j01Var, java.lang.String str) {
        this.f475953d = fVar;
        this.f475954e = activityC14183x9ab478f1;
        this.f475955f = i17;
        this.f475956g = i18;
        this.f475957h = j01Var;
        this.f475958i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f475953d.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14183x9ab478f1 activityC14183x9ab478f1 = this.f475954e;
        activityC14183x9ab478f1.f193076s = false;
        int i17 = this.f475955f;
        int i18 = this.f475956g;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14183x9ab478f1.U6(activityC14183x9ab478f1, i18, this.f475958i, 0, null);
            return;
        }
        activityC14183x9ab478f1.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveInvitationConfirmUI", "gotoLivePrepare");
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).Kj(activityC14183x9ab478f1, this.f475957h, new android.content.Intent(), true);
        activityC14183x9ab478f1.finish();
    }
}
