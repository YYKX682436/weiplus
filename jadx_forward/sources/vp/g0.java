package vp;

/* loaded from: classes15.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    public android.os.Handler f520306a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.HandlerThread f520307b;

    /* renamed from: d, reason: collision with root package name */
    public final vp.f0 f520309d;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Boolean f520308c = java.lang.Boolean.FALSE;

    /* renamed from: e, reason: collision with root package name */
    public int f520310e = 1;

    public g0(vp.d dVar) {
        this.f520309d = new vp.f0(dVar, null);
    }

    public final boolean a() {
        if (this.f520310e == 1) {
            return this.f520306a != null;
        }
        android.os.HandlerThread handlerThread = this.f520307b;
        return (handlerThread == null || !handlerThread.isAlive() || this.f520306a == null) ? false : true;
    }

    public void b(int i17) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = i17;
        if (a()) {
            this.f520306a.sendMessage(obtain);
        }
    }

    public void c(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuManager", "checkedThreadAlive mDrawingThreadType:%d", java.lang.Integer.valueOf(this.f520310e));
        boolean z17 = this.f520310e == 1;
        vp.f0 f0Var = this.f520309d;
        if (z17) {
            if (this.f520306a == null) {
                this.f520306a = new android.os.Handler(android.os.Looper.getMainLooper(), f0Var);
            }
        } else if (this.f520306a == null) {
            if (this.f520307b == null) {
                int i18 = pu5.i.f440006b;
                android.os.HandlerThread a17 = pu5.f.a("DanmakuManager", 5);
                this.f520307b = a17;
                a17.start();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuManager", "checkedThreadAlive mDrawThread start ", java.lang.Boolean.valueOf(this.f520307b.isAlive()));
            this.f520306a = new android.os.Handler(this.f520307b.getLooper(), f0Var);
        }
    }
}
