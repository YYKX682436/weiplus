package q7;

/* loaded from: classes4.dex */
public class g implements java.util.concurrent.Executor {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f441830d = new android.os.Handler(android.os.Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.f441830d.post(runnable);
    }
}
