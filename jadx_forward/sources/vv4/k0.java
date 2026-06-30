package vv4;

/* loaded from: classes12.dex */
public final class k0 implements k70.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 f522007d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 activityC19218x71796ad1) {
        this.f522007d = activityC19218x71796ad1;
    }

    @Override // k70.w
    public void f(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, java.lang.String str2, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 activityC19218x71796ad1 = this.f522007d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC19218x71796ad1.f263187d, "onImgTaskEnd msgId: %d, imgLocalId: %d, compressType: %d, errType %d, errCode: %d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        activityC19218x71796ad1.f263194n = false;
        activityC19218x71796ad1.W6(false);
    }

    @Override // k70.w
    public void l(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 activityC19218x71796ad1 = this.f522007d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC19218x71796ad1.f263187d, "onImgTaskCanceled msgId: %d, imgLocalId: %d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
        activityC19218x71796ad1.f263194n = false;
    }

    @Override // k70.w
    public void o(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2 = this.f522007d.f263187d;
    }
}
