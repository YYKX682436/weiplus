package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.impl.utils.executor.MainThreadExecutor */
/* loaded from: classes14.dex */
public final class C0809xf6e05736 {

    /* renamed from: sInstance */
    private static volatile java.util.concurrent.ScheduledExecutorService f2004xbfaed628;

    private C0809xf6e05736() {
    }

    /* renamed from: getInstance */
    public static java.util.concurrent.ScheduledExecutorService m5992x9cf0d20b() {
        if (f2004xbfaed628 != null) {
            return f2004xbfaed628;
        }
        synchronized (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0809xf6e05736.class) {
            if (f2004xbfaed628 == null) {
                f2004xbfaed628 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ScheduledExecutorServiceC0806x660aff3f(new android.os.Handler(android.os.Looper.getMainLooper()));
            }
        }
        return f2004xbfaed628;
    }
}
