package ij3;

/* loaded from: classes13.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fj3.a f373235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.HandlerThread f373236e;

    public e(fj3.a aVar, android.os.HandlerThread handlerThread) {
        this.f373235d = aVar;
        this.f373236e = handlerThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("runGlEnvironmentRunnable ");
        fj3.a aVar = this.f373235d;
        sb6.append(aVar.f344724m);
        sb6.append(" enter loop");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.GLDispatcher", sb6.toString());
        aVar.run();
        this.f373236e.quitSafely();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.GLDispatcher", "runGlEnvironmentRunnable " + aVar.f344724m + " quit loop");
    }
}
