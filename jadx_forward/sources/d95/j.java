package d95;

/* loaded from: classes11.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f309219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f309220e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f309221f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f309222g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f309223h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d95.k f309224i;

    public j(d95.k kVar, long j17, long j18, long j19, long j27, long j28) {
        this.f309224i = kVar;
        this.f309219d = j17;
        this.f309220e = j18;
        this.f309221f = j19;
        this.f309222g = j27;
        this.f309223h = j28;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.p314xaae8f345.mm.app.w.INSTANCE.f135422n) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMDataBase", "vacuum too slow, kill self");
        this.f309224i.f309226e.f309227d.c();
        jx3.f fVar = jx3.f.INSTANCE;
        d95.k kVar = this.f309224i;
        fVar.d(25824, kVar.f309225d, kVar.f309226e.f309227d.k(), java.lang.Long.valueOf(this.f309219d), java.lang.Long.valueOf(java.lang.Math.min(this.f309220e, this.f309221f)), java.lang.Long.valueOf(this.f309222g), "slow-kill", 0, java.lang.Long.valueOf(this.f309223h), 0, 0, 0, 0, 0);
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
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/storagebase/MMDataBase$4$1$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/storagebase/MMDataBase$4$1$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }
}
