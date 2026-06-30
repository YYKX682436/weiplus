package wu3;

/* loaded from: classes15.dex */
public class q1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f531331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17047xc20d96b0 f531332e;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17047xc20d96b0 c17047xc20d96b0, long j17) {
        this.f531332e = c17047xc20d96b0;
        this.f531331d = j17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17047xc20d96b0 c17047xc20d96b0 = this.f531332e;
        if (c17047xc20d96b0.f237569d <= 0 || this.f531331d > 500 || c17047xc20d96b0.f237574i) {
            if (c17047xc20d96b0.f237574i) {
                c17047xc20d96b0.getClass();
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecordButton", "error action up");
                c17047xc20d96b0.getClass();
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecordButton", "on Simple Tap, isDispatchSimpleTap: %s, isDispatchLongPress: %s", java.lang.Boolean.valueOf(c17047xc20d96b0.f237573h), java.lang.Boolean.valueOf(c17047xc20d96b0.f237574i));
        c17047xc20d96b0.f237573h = true;
        if (c17047xc20d96b0.f237574i) {
            return;
        }
        c17047xc20d96b0.getClass();
    }
}
