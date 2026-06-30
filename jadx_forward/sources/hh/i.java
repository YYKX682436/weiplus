package hh;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final android.os.Handler f362976a = new android.os.Handler(android.os.Looper.getMainLooper());

    public static final boolean a() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread());
    }

    public static final void b(java.lang.Runnable run) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(run, "run");
        if (a()) {
            run.run();
        } else {
            f362976a.post(run);
        }
    }
}
