package gl;

/* loaded from: classes14.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final gl.x f354316d = new gl.x();

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        ((android.media.AudioManager) systemService).clearCommunicationDevice();
    }
}
