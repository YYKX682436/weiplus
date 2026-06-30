package qp1;

/* loaded from: classes14.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f447250d;

    public e(long j17) {
        this.f447250d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qp1.d dVar = qp1.i.f447258a;
        boolean z17 = false;
        if (dVar != null && dVar.f447247a == this.f447250d) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallCollapseHelper", "checkAutoCollapseInner autoCollapseTask done.");
            qp1.i.f447258a = null;
        }
    }
}
