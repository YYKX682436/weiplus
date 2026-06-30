package pe4;

/* loaded from: classes15.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final re4.c0 f435250a;

    /* renamed from: b, reason: collision with root package name */
    public final re4.d0 f435251b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f435252c;

    /* renamed from: d, reason: collision with root package name */
    public android.os.Handler f435253d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f435254e = false;

    /* renamed from: f, reason: collision with root package name */
    public iu5.e f435255f = null;

    /* renamed from: g, reason: collision with root package name */
    public iu5.e f435256g = null;

    /* renamed from: h, reason: collision with root package name */
    public int f435257h = -1;

    /* renamed from: i, reason: collision with root package name */
    public pe4.n f435258i = null;

    public o(java.lang.ref.WeakReference weakReference, re4.c0 c0Var, re4.d0 d0Var, android.os.Handler handler) {
        this.f435250a = null;
        this.f435251b = null;
        this.f435252c = null;
        this.f435250a = c0Var;
        this.f435251b = d0Var;
        this.f435252c = weakReference;
        this.f435253d = handler;
    }

    public void a() {
        android.os.Handler handler = this.f435253d;
        if (handler != null) {
            handler.obtainMessage(5).sendToTarget();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
        }
    }

    public void b() {
        if (this.f435253d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
            return;
        }
        a();
        boolean z17 = this.f435254e;
        re4.d0 d0Var = this.f435251b;
        d0Var.f476064f = z17;
        this.f435253d.obtainMessage(2, d0Var).sendToTarget();
    }

    public abstract void c(android.os.Bundle bundle);

    public abstract void d(android.os.Bundle bundle);

    public abstract void e(int i17, java.lang.String[] strArr, int[] iArr);

    public void f(java.lang.String[] strArr, int i17) {
        android.os.Handler handler = this.f435253d;
        if (handler == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
            return;
        }
        android.os.Message obtainMessage = handler.obtainMessage(3);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putStringArray("permissions", strArr);
        bundle.putInt("request_code", i17);
        obtainMessage.setData(bundle);
        obtainMessage.sendToTarget();
    }
}
