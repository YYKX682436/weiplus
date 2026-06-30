package re2;

/* loaded from: classes3.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14183x9ab478f1 f475987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az2.f f475988e;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14183x9ab478f1 activityC14183x9ab478f1, az2.f fVar) {
        this.f475987d = activityC14183x9ab478f1;
        this.f475988e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14183x9ab478f1.f193063t;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14183x9ab478f1 activityC14183x9ab478f1 = this.f475987d;
        android.content.Context applicationContext = activityC14183x9ab478f1.getApplicationContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(applicationContext, "getApplicationContext(...)");
        java.lang.String e17 = xy2.c.e(applicationContext);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveInvitationConfirmUI", "doPrepareAndGotoLive: selfFinderUsername=" + e17);
        new ek2.c2(db2.t4.f309704a.a(5874), e17, null, 0L, 0L, 0, 0L, 0, new re2.i0(activityC14183x9ab478f1, this.f475988e), 248, null).l();
    }
}
