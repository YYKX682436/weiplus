package sb;

/* loaded from: classes13.dex */
public class d extends android.os.Handler {

    /* renamed from: b, reason: collision with root package name */
    public static sb.d f486926b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f486927c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f486928a = new java.util.HashMap();

    public static sb.d a() {
        synchronized (f486927c) {
            if (f486926b == null) {
                try {
                    if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread() && android.os.Looper.myLooper() == null) {
                        android.os.Looper.prepare();
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.i("APHttpHandle", e17.toString());
                }
                f486926b = new sb.d();
            }
        }
        return f486926b;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        try {
            int i17 = message.what;
            sb.a aVar = (sb.a) message.obj;
            java.lang.String str = aVar.f486909a;
            java.util.HashMap hashMap = this.f486928a;
            sb.j jVar = (sb.j) hashMap.get(str);
            if (jVar != null) {
                hashMap.remove(str);
                if (i17 == 3) {
                    jVar.mo41942x42fe6352(aVar);
                } else if (i17 == 4) {
                    jVar.mo41941xaf8aa769(aVar);
                } else if (i17 == 5) {
                    jVar.mo41943xc39f8281(aVar);
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
