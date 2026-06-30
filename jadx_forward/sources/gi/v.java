package gi;

/* loaded from: classes12.dex */
public class v extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g {

    /* renamed from: d, reason: collision with root package name */
    public gi.q0 f353719d;

    /* renamed from: e, reason: collision with root package name */
    public gi.q0 f353720e;

    /* renamed from: f, reason: collision with root package name */
    public gi.q0 f353721f;

    /* renamed from: g, reason: collision with root package name */
    public gi.q0 f353722g;

    /* renamed from: h, reason: collision with root package name */
    public gi.q0 f353723h;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ph.u f353730o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f353731p;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f353717b = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public boolean f353718c = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f353724i = new gi.w(this);

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Runnable f353725j = new gi.x(this);

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Runnable f353726k = new gi.y(this);

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.Runnable f353727l = new gi.z(this);

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f353728m = new gi.a0(this);

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f353729n = new gi.b0(this);

    public v(ph.u uVar, boolean z17) {
        this.f353730o = uVar;
        this.f353731p = z17;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void a() {
        this.f353718c = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.LifeCycle", "AppExplicitBg = true");
        java.util.Map map = ri.a.f477369e;
        synchronized (map) {
            ph.u e17 = gi.d.e();
            if (e17 != null) {
                e17.f435829h.f444870f.removeCallbacks(ri.a.f477366b);
            }
            ((java.util.HashMap) map).clear();
        }
        if (this.f353731p) {
            synchronized (this.f353717b) {
                this.f353730o.f435829h.f444870f.removeCallbacks(this.f353725j);
                this.f353721f = null;
                this.f353730o.f435829h.f444870f.removeCallbacks(this.f353724i);
                this.f353730o.f435829h.f444870f.postDelayed(this.f353726k, 600000L);
                this.f353730o.f435829h.f444870f.postDelayed(this.f353727l, 600000L);
                this.f353730o.f435829h.f444870f.postDelayed(this.f353728m, 30000L);
                gi.q0 q0Var = this.f353719d;
                if (q0Var != null) {
                    q0Var.a();
                    this.f353719d = null;
                }
                ((lh.t) ((jz5.n) lh.t.f400164f).mo141623x754a37bb()).c(0);
            }
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void b() {
        this.f353718c = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.LifeCycle", "AppExplicitBg = false");
        synchronized (ri.a.f477369e) {
            ph.u e17 = gi.d.e();
            if (e17 != null) {
                e17.f435829h.f444870f.postDelayed(ri.a.f477366b, 5000L);
            }
        }
        if (this.f353731p) {
            synchronized (this.f353717b) {
                lh.t.f400163e = true;
                this.f353730o.f435829h.f444870f.removeCallbacks(this.f353728m);
                this.f353730o.f435829h.f444870f.removeCallbacks(this.f353729n);
                this.f353730o.f435829h.f444870f.removeCallbacks(this.f353727l);
                this.f353722g = null;
                this.f353730o.f435829h.f444870f.removeCallbacks(this.f353726k);
                this.f353730o.f435829h.f444870f.postDelayed(this.f353724i, 30000L);
                this.f353730o.f435829h.f444870f.postDelayed(this.f353725j, 30000L);
                gi.q0 q0Var = this.f353720e;
                if (q0Var != null) {
                    q0Var.a();
                    this.f353720e = null;
                }
                ((lh.t) ((jz5.n) lh.t.f400164f).mo141623x754a37bb()).a();
            }
        }
        ((ku5.t0) ku5.t0.f394148d).g(new gi.RunnableC28408x362fab());
    }
}
