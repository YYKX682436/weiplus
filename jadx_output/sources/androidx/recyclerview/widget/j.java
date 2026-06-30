package androidx.recyclerview.widget;

/* loaded from: classes11.dex */
public class j implements java.util.concurrent.Executor {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f12082d = new android.os.Handler(android.os.Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.f12082d.post(runnable);
    }
}
