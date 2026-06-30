package f95;

/* loaded from: classes11.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.k0 f342087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f342089f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f342090g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f342091h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f342092i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f342093m;

    public g(l75.k0 k0Var, java.lang.String str, long j17, long j18, long j19, long j27, long j28) {
        this.f342087d = k0Var;
        this.f342088e = str;
        this.f342089f = j17;
        this.f342090g = j18;
        this.f342091h = j19;
        this.f342092i = j27;
        this.f342093m = j28;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.p314xaae8f345.mm.app.w.INSTANCE.f135422n) {
            return;
        }
        java.util.Set set = f95.j.f342097a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WCDBPerformance", "vacuum too slow, kill self");
        this.f342087d.mo70513x5a5ddf8();
        jx3.f.INSTANCE.d(f95.j.f342098b, this.f342088e, this.f342087d.mo70515xfb83cc9b(), java.lang.Long.valueOf(this.f342089f), java.lang.Long.valueOf(java.lang.Math.min(this.f342090g, this.f342091h)), java.lang.Long.valueOf(this.f342092i), "slow-kill", 0, java.lang.Long.valueOf(this.f342093m), 0, 0, 0, 0, 0);
        try {
            java.lang.Thread.sleep(1000L);
        } catch (java.lang.InterruptedException unused) {
        }
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/storagebase/trace/WCDBPerformance$dBVacuum$checkVacuumRunnable$1$vacuumRunnable$1$killSelfTask$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/storagebase/trace/WCDBPerformance$dBVacuum$checkVacuumRunnable$1$vacuumRunnable$1$killSelfTask$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }
}
