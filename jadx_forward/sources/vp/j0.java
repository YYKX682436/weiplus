package vp;

/* loaded from: classes15.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public android.os.Handler f520314a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.HandlerThread f520315b;

    /* renamed from: d, reason: collision with root package name */
    public final vp.i0 f520317d;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Boolean f520316c = java.lang.Boolean.FALSE;

    /* renamed from: e, reason: collision with root package name */
    public int f520318e = 1;

    public j0(vp.k kVar) {
        this.f520317d = new vp.i0(kVar, null);
    }

    public final boolean a() {
        if (this.f520318e == 1) {
            return this.f520314a != null;
        }
        android.os.HandlerThread handlerThread = this.f520315b;
        return (handlerThread == null || !handlerThread.isAlive() || this.f520314a == null) ? false : true;
    }

    public void b(int i17) {
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = i17;
        if (a()) {
            this.f520314a.sendMessage(obtain);
        }
    }

    public void c(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuManager", "checkedThreadAlive mDrawingThreadType:%d", java.lang.Integer.valueOf(this.f520318e));
        boolean z17 = this.f520318e == 1;
        vp.i0 i0Var = this.f520317d;
        if (z17) {
            if (this.f520314a == null) {
                this.f520314a = new android.os.Handler(android.os.Looper.getMainLooper(), i0Var);
            }
        } else if (this.f520314a == null) {
            if (this.f520315b == null) {
                int i18 = pu5.i.f440006b;
                android.os.HandlerThread a17 = pu5.f.a("DanmakuManager", 5);
                this.f520315b = a17;
                a17.start();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuManager", "checkedThreadAlive mDrawThread start ", java.lang.Boolean.valueOf(this.f520315b.isAlive()));
            this.f520314a = new android.os.Handler(this.f520315b.getLooper(), i0Var);
        }
    }
}
