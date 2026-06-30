package i32;

/* loaded from: classes13.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f369666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i32.s f369667e;

    public p(i32.s sVar, long j17) {
        this.f369667e = sVar;
        this.f369666d = -1L;
        iz5.a.g(null, j17 >= 0);
        this.f369666d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = this.f369666d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Time Out Sequnence(%d)", java.lang.Long.valueOf(j17));
        this.f369667e.f369674e.mo50292x733c63a2(0, java.lang.Long.valueOf(j17)).sendToTarget();
    }
}
