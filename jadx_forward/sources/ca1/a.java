package ca1;

/* loaded from: classes7.dex */
public class a implements java.util.concurrent.Executor {

    /* renamed from: f, reason: collision with root package name */
    public static ca1.a f121301f;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f121303e = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public final p56.q f121302d = rx.p3379xd70c5718.C30149x4dde3338.m163347x3017aa(this);

    public static p56.q a() {
        if (f121301f == null) {
            synchronized (ca1.a.class) {
                if (f121301f == null) {
                    f121301f = new ca1.a();
                }
            }
        }
        return f121301f.f121302d;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.f121303e.post(runnable);
    }
}
