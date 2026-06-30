package vv4;

/* loaded from: classes12.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f522041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 f522042f;

    public u0(java.lang.String str, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 activityC19218x71796ad1) {
        this.f522040d = str;
        this.f522041e = j17;
        this.f522042f = activityC19218x71796ad1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(this.f522040d, this.f522041e);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 activityC19218x71796ad1 = this.f522042f;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1.f263186s;
        activityC19218x71796ad1.getClass();
        boolean z17 = n17.A0() == 1 ? !n17.z2() : !n17.z2();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f522042f.f263187d, "tryDownloadImage msgId: %s, msgSvrId: %s, talker: %s, canDownload: %b", java.lang.Long.valueOf(this.f522041e), java.lang.Long.valueOf(n17.I0()), n17.Q0(), java.lang.Boolean.valueOf(z17));
        if (z17) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            this.f522042f.f263193m = m11.b1.Di().b2(n17.Q0(), n17.I0()).f404166a;
            k70.x Di = ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di();
            long j17 = this.f522042f.f263193m;
            long j18 = this.f522041e;
            if (((m11.j) Di).b(j17, new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(j18, this.f522040d), 0, java.lang.Long.valueOf(j18), com.p314xaae8f345.mm.R.C30861xcebc809e.bzt, this.f522042f.f263197q, 0, true) == 0) {
                this.f522042f.f263194n = true;
                ((ku5.t0) ku5.t0.f394148d).B(new vv4.t0(this.f522042f));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 activityC19218x71796ad12 = this.f522042f;
                activityC19218x71796ad12.getClass();
                ((ku5.t0) ku5.t0.f394148d).B(new vv4.n0(activityC19218x71796ad12));
            }
        }
    }
}
