package p5;

/* loaded from: classes11.dex */
public class b implements java.util.concurrent.Executor {
    public b(p5.a aVar) {
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(runnable);
    }
}
