package lt5;

/* loaded from: classes8.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f402841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f402842e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f402843f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f402844g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f402845h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f402846i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ lt5.j f402847m;

    public i(lt5.j jVar, android.content.Context context, java.util.concurrent.atomic.AtomicReference atomicReference, java.util.concurrent.atomic.AtomicReference atomicReference2, java.util.concurrent.atomic.AtomicReference atomicReference3, java.util.concurrent.atomic.AtomicReference atomicReference4, java.lang.Object obj) {
        this.f402847m = jVar;
        this.f402841d = context;
        this.f402842e = atomicReference;
        this.f402843f = atomicReference2;
        this.f402844g = atomicReference3;
        this.f402845h = atomicReference4;
        this.f402846i = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = "";
        try {
            str = this.f402847m.b(this.f402841d, (android.os.IBinder) this.f402842e.get());
        } catch (java.lang.Throwable unused) {
            this.f402843f.set(-102);
        }
        this.f402844g.set(str);
        try {
            this.f402841d.unbindService((android.content.ServiceConnection) this.f402845h.get());
        } catch (java.lang.Throwable unused2) {
            this.f402843f.set(-103);
        }
        synchronized (this.f402846i) {
            try {
                this.f402846i.notifyAll();
            } catch (java.lang.Throwable unused3) {
            }
        }
    }
}
