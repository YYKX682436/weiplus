package l6;

/* loaded from: classes16.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public int f398265a;

    /* renamed from: b, reason: collision with root package name */
    public int f398266b;

    /* renamed from: c, reason: collision with root package name */
    public int f398267c = 255;

    /* renamed from: d, reason: collision with root package name */
    public int f398268d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.HandlerThread f398269e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.Handler f398270f;

    /* renamed from: g, reason: collision with root package name */
    public l6.k f398271g;

    public synchronized void a(int i17, int i18, int i19, l6.k kVar) {
        if (i17 < 1 || i19 < 0 || kVar == null) {
            return;
        }
        try {
            this.f398266b = i17;
            this.f398265a = i18;
            this.f398268d = i19;
            this.f398271g = kVar;
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("RepeatExecutor");
            this.f398269e = handlerThread;
            handlerThread.start();
            l6.j jVar = new l6.j(this, this.f398269e.getLooper());
            this.f398270f = jVar;
            jVar.sendEmptyMessage(101);
        } catch (java.lang.Throwable unused) {
        }
    }
}
