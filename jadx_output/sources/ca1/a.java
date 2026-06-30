package ca1;

/* loaded from: classes7.dex */
public class a implements java.util.concurrent.Executor {

    /* renamed from: f, reason: collision with root package name */
    public static ca1.a f39768f;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f39770e = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public final p56.q f39769d = rx.schedulers.Schedulers.from(this);

    public static p56.q a() {
        if (f39768f == null) {
            synchronized (ca1.a.class) {
                if (f39768f == null) {
                    f39768f = new ca1.a();
                }
            }
        }
        return f39768f.f39769d;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.f39770e.post(runnable);
    }
}
