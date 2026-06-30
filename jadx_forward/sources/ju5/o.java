package ju5;

/* loaded from: classes15.dex */
public class o {

    /* renamed from: d, reason: collision with root package name */
    public static volatile ju5.o f383667d;

    /* renamed from: a, reason: collision with root package name */
    public android.os.HandlerThread f383668a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.Handler f383669b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f383670c;

    public o() {
        this.f383669b = null;
        this.f383670c = null;
        if (this.f383668a == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("SoterGenKeyHandlerThreadName");
            this.f383668a = handlerThread;
            handlerThread.start();
            if (this.f383668a.getLooper() != null) {
                this.f383669b = new android.os.Handler(this.f383668a.getLooper());
            } else {
                zt5.h.b("Soter.SoterTaskThread", "soter: task looper is null! use main looper as the task looper", new java.lang.Object[0]);
                this.f383669b = new android.os.Handler(android.os.Looper.getMainLooper());
            }
        }
        this.f383670c = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public static ju5.o a() {
        ju5.o oVar;
        if (f383667d != null) {
            return f383667d;
        }
        synchronized (ju5.o.class) {
            if (f383667d == null) {
                f383667d = new ju5.o();
            }
            oVar = f383667d;
        }
        return oVar;
    }

    public void b(java.lang.Runnable runnable) {
        this.f383670c.post(runnable);
    }

    public void c(java.lang.Runnable runnable) {
        this.f383669b.post(runnable);
    }
}
