package lr5;

/* loaded from: classes13.dex */
public class c implements lr5.f {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f402298d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f402299e = new java.util.concurrent.ConcurrentHashMap();

    public c(lr5.a aVar) {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("dns-main");
        handlerThread.start();
        this.f402298d = new android.os.Handler(handlerThread.getLooper());
    }

    public void a(java.lang.Runnable runnable) {
        java.lang.Runnable runnable2;
        if (runnable == null || (runnable2 = (java.lang.Runnable) ((java.util.concurrent.ConcurrentHashMap) this.f402299e).get(runnable)) == null) {
            return;
        }
        this.f402298d.removeCallbacks(runnable2);
    }

    public void b(java.lang.Runnable runnable, long j17) {
        if (runnable != null) {
            lr5.a aVar = new lr5.a(runnable);
            if (0 >= j17) {
                execute(aVar);
            } else {
                ((java.util.concurrent.ConcurrentHashMap) this.f402299e).put(runnable, aVar);
                this.f402298d.postDelayed(aVar, j17);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        if (runnable != null) {
            this.f402298d.post(new lr5.a(runnable));
        }
    }
}
