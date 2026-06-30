package g32;

/* loaded from: classes13.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f349680a;

    /* renamed from: b, reason: collision with root package name */
    public static int f349681b;

    /* renamed from: c, reason: collision with root package name */
    public static final android.os.Handler f349682c = new g32.a(android.os.Looper.getMainLooper());

    public static /* synthetic */ int a(int i17) {
        int i18 = i17 & f349681b;
        f349681b = i18;
        return i18;
    }

    public static /* synthetic */ int b(int i17) {
        int i18 = i17 | f349681b;
        f349681b = i18;
        return i18;
    }

    public static void c(g32.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExDeviceProcessBusyMonitor", "Operating %s", bVar);
        android.os.Handler handler = f349682c;
        handler.removeMessages(1);
        handler.sendMessage(android.os.Message.obtain(handler, 0, bVar));
    }
}
