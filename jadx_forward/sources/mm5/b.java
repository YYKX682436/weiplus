package mm5;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final mm5.b f411231b = new mm5.b();

    /* renamed from: a, reason: collision with root package name */
    public final android.os.HandlerThread f411232a;

    public b() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("Vending-LogicThread");
        this.f411232a = handlerThread;
        handlerThread.start();
        new android.os.Handler(handlerThread.getLooper());
    }
}
