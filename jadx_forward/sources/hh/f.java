package hh;

/* loaded from: classes7.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f362968a;

    /* renamed from: c, reason: collision with root package name */
    public long f362970c;

    /* renamed from: d, reason: collision with root package name */
    public long f362971d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f362972e;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f362969b = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f362973f = new hh.e(this);

    public f(long j17, java.lang.Object obj, boolean z17) {
        this.f362972e = false;
        this.f362968a = obj;
        this.f362972e = z17;
    }

    public abstract java.lang.Object a();

    public void b(java.lang.Object obj) {
        ah.i.b("MicroMsg.SDK.SyncTask", "setResultFinish ", new java.lang.Object[0]);
        this.f362968a = obj;
        synchronized (this.f362969b) {
            ah.i.b("MicroMsg.SDK.SyncTask", "setResultFinish synchronized", new java.lang.Object[0]);
            this.f362969b.notify();
        }
    }
}
