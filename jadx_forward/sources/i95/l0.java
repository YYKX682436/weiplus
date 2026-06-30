package i95;

/* loaded from: classes12.dex */
public class l0 extends java.util.concurrent.ForkJoinWorkerThread {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ForkJoinPool f371344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i95.m0 f371345e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(i95.m0 m0Var, java.util.concurrent.ForkJoinPool forkJoinPool, java.util.concurrent.ForkJoinPool forkJoinPool2) {
        super(forkJoinPool);
        this.f371345e = m0Var;
        this.f371344d = forkJoinPool2;
    }

    @Override // java.util.concurrent.ForkJoinWorkerThread
    public void onStart() {
        super.onStart();
        i95.m0 m0Var = this.f371345e;
        if (m0Var.f371348d != null) {
            android.os.Looper h17 = i95.k0.INSTANCE.h();
            try {
                java.lang.ThreadLocal threadLocal = (java.lang.ThreadLocal) m0Var.f371348d.get(null);
                if (threadLocal == null) {
                    threadLocal = new java.lang.ThreadLocal();
                    m0Var.f371348d.set(null, threadLocal);
                }
                threadLocal.set(h17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ServiceManager", th6, "Fail to set Looper to init thread.", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ServiceManager", "[+] FJPThread, tid: %s, name: %s, java_tid: %s, priority: %s, alive_thread_count: %s", java.lang.Integer.valueOf(android.os.Process.myTid()), getName(), java.lang.Long.valueOf(getId()), java.lang.Integer.valueOf(getPriority()), java.lang.Integer.valueOf(this.f371344d.getActiveThreadCount()));
    }
}
