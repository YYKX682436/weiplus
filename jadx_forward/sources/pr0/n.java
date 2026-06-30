package pr0;

/* loaded from: classes14.dex */
public abstract class n extends pr0.g {

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.String f439429q = "";

    /* renamed from: m, reason: collision with root package name */
    public final android.os.HandlerThread f439430m;

    /* renamed from: n, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f439431n;

    /* renamed from: o, reason: collision with root package name */
    public final android.os.Handler f439432o;

    /* renamed from: p, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3332x361a9b.d f439433p = p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.a(false, 1, null);

    static {
        ((ku5.t0) ku5.t0.f394148d).g(pr0.h.f439374d);
    }

    public n() {
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("CameraKit-Use", 10);
        this.f439430m = a17;
        a17.start();
        android.os.Handler handler = new android.os.Handler(a17.getLooper());
        this.f439432o = handler;
        this.f439431n = p3325xe03a0797.p3326xc267989b.z0.a(t26.e.b(handler, null, 1, null));
        this.f439371i.registerDisplayListener(this, handler);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Coroutines", "[" + hashCode() + "]CameraKit new instance,camera thread id:" + a17.getThreadId());
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        l("execute", new pr0.m(runnable, null));
    }

    public p3325xe03a0797.p3326xc267989b.r2 l(java.lang.String str, yz5.p block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Coroutines", "Launch Start[" + str + ']');
        return p3325xe03a0797.p3326xc267989b.l.d(this.f439431n, null, null, new pr0.k(block, str, java.lang.System.currentTimeMillis(), this, null), 3, null);
    }

    public p3325xe03a0797.p3326xc267989b.r2 m(java.lang.String str, yz5.p block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Coroutines", "SyncLaunch Start[" + str + ']');
        return p3325xe03a0797.p3326xc267989b.l.d(this.f439431n, null, null, new pr0.l(str, this, java.lang.System.currentTimeMillis(), block, null), 3, null);
    }

    public final void n(java.lang.String str, long j17) {
        if (qr0.a.f447590c) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6357x4121d0db c6357x4121d0db = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6357x4121d0db();
            c6357x4121d0db.f137085i = c6357x4121d0db.b("SessionId", java.lang.String.valueOf(this.f439366d), true);
            if (str == null) {
                str = "";
            }
            c6357x4121d0db.f137080d = c6357x4121d0db.b("MethodName", str, true);
            c6357x4121d0db.f137081e = (int) j17;
            c6357x4121d0db.f137084h = c6357x4121d0db.b("CpuInfo", f439429q, true);
            c6357x4121d0db.k();
        }
    }
}
