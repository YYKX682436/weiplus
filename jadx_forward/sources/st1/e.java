package st1;

/* loaded from: classes7.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f493735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f493736e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f493737f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f493738g;

    public e(android.app.Activity activity, android.content.Intent intent, int i17, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f493735d = activity;
        this.f493736e = intent;
        this.f493737f = i17;
        this.f493738g = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Activity activity = this.f493735d;
        boolean z17 = activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf;
        int i17 = this.f493737f;
        android.content.Intent intent = this.f493736e;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f493738g;
        if (z17) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity).m78546x70d84175((com.p314xaae8f345.mm.ui.da) new st1.b(qVar), intent, i17);
            return;
        }
        if (activity instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity).m78743x70d84175(new st1.c(qVar), intent, i17);
            return;
        }
        if (activity instanceof nf.m) {
            nf.g.a(activity).j(intent, new st1.d(qVar));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CarLicensePlateViewUtils", "startForResultSuspended with invalid activity(" + activity + "), return CANCELED");
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new android.app.Instrumentation.ActivityResult(0, null)));
    }
}
