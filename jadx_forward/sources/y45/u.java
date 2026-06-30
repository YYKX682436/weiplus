package y45;

/* loaded from: classes12.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final android.os.HandlerThread f540925a = new android.os.HandlerThread("RecoveryWorker");

    /* renamed from: b, reason: collision with root package name */
    public static boolean f540926b = false;

    /* renamed from: c, reason: collision with root package name */
    public static android.os.Handler f540927c;

    public static android.os.Handler a() {
        synchronized (y45.u.class) {
            if (!f540926b) {
                f540926b = true;
                android.os.HandlerThread handlerThread = f540925a;
                handlerThread.start();
                f540927c = new android.os.Handler(handlerThread.getLooper());
            }
        }
        return f540927c;
    }
}
