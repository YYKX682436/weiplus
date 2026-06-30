package kj;

/* loaded from: classes12.dex */
public class q extends kj.g0 {

    /* renamed from: e, reason: collision with root package name */
    public static ej.c f389793e;

    /* renamed from: f, reason: collision with root package name */
    public static android.os.HandlerThread f389794f;

    /* renamed from: g, reason: collision with root package name */
    public static android.os.Handler f389795g;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.Runnable f389796h;

    public q(ej.c cVar) {
        f389793e = cVar;
    }

    @Override // kj.g0
    public void d() {
        super.d();
        if (f389793e.f334791e) {
            f389794f = new android.os.HandlerThread("IdleHandlerLagThread");
            f389796h = new kj.n();
            try {
                android.os.MessageQueue queue = android.os.Looper.getMainLooper().getQueue();
                java.lang.reflect.Field declaredField = android.os.MessageQueue.class.getDeclaredField("mIdleHandlers");
                declaredField.setAccessible(true);
                declaredField.set(queue, new kj.o());
                f389794f.start();
                f389795g = new android.os.Handler(f389794f.getLooper());
            } catch (java.lang.Throwable th6) {
                oj.j.b("Matrix.IdleHandlerLagTracer", "reflect idle handler error = " + th6.getMessage(), new java.lang.Object[0]);
            }
        }
    }

    @Override // kj.g0
    public void f() {
        super.f();
        if (f389793e.f334791e) {
            f389795g.removeCallbacksAndMessages(null);
        }
    }
}
