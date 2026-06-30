package lw1;

/* loaded from: classes13.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iw1.a f403083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.HandlerThread f403084e;

    public e(iw1.a aVar, android.os.HandlerThread handlerThread) {
        this.f403083d = aVar;
        this.f403084e = handlerThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("runGlEnvironmentRunnable ");
        iw1.a aVar = this.f403083d;
        sb6.append(aVar.f376729m);
        sb6.append(" enter loop");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.GLDispatcher", sb6.toString());
        aVar.run();
        this.f403084e.quitSafely();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.GLDispatcher", "runGlEnvironmentRunnable " + aVar.f376729m + " quit loop");
    }
}
