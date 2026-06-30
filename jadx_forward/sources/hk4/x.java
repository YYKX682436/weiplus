package hk4;

/* loaded from: classes10.dex */
public final class x extends hk4.a {

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f363518k = "MicroMsg.MultiMediaVideoPlayer@" + hashCode();

    /* renamed from: l, reason: collision with root package name */
    public final kk4.v f363519l;

    /* renamed from: m, reason: collision with root package name */
    public long f363520m;

    /* renamed from: n, reason: collision with root package name */
    public long f363521n;

    /* renamed from: o, reason: collision with root package name */
    public int f363522o;

    /* renamed from: p, reason: collision with root package name */
    public int f363523p;

    /* renamed from: q, reason: collision with root package name */
    public int f363524q;

    /* renamed from: r, reason: collision with root package name */
    public long f363525r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f363526s;

    /* renamed from: t, reason: collision with root package name */
    public volatile boolean f363527t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f363528u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f363529v;

    /* renamed from: w, reason: collision with root package name */
    public long f363530w;

    public x() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        kk4.v vVar = new kk4.v(context);
        this.f363519l = vVar;
        this.f363530w = -1L;
        vVar.I(new hk4.p(this), 33L);
        vVar.f390128t = new hk4.q(this);
        vVar.F(new hk4.t(this));
    }

    public static final void p(hk4.x xVar) {
        synchronized (xVar) {
            if (!xVar.f363527t && xVar.f363522o > 0 && xVar.f363523p > 0) {
                pm0.v.X(new hk4.v(xVar));
                xVar.f363527t = true;
            }
        }
    }

    public static final void q(hk4.x xVar) {
        kk4.c cVar = xVar.f363519l.f390110b;
        if (cVar == null) {
            return;
        }
        kk4.f0 f0Var = (kk4.f0) cVar;
        int mo100924x2d67b867 = (int) f0Var.mo100924x2d67b867(205);
        xVar.f363524q = mo100924x2d67b867;
        boolean z17 = mo100924x2d67b867 == 90 || mo100924x2d67b867 == 270;
        xVar.f363522o = z17 ? f0Var.mo100928x463504c() : f0Var.mo100929x8d5c7601();
        xVar.f363523p = z17 ? f0Var.mo100929x8d5c7601() : f0Var.mo100928x463504c();
        long mo100924x2d67b8672 = f0Var.mo100924x2d67b867(206);
        if (f0Var.mo100917x37a7fa50() > 0) {
            xVar.f363525r = f0Var.mo100917x37a7fa50();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f363518k, "updateVideoSize, video size:[" + xVar.f363522o + ", " + xVar.f363523p + "], rotate:" + xVar.f363524q + ", videoFps:" + mo100924x2d67b8672 + ", duration:" + xVar.f363525r);
    }

    @Override // hk4.a
    public boolean a() {
        return this.f363519l.s();
    }

    @Override // hk4.a
    public boolean b() {
        return this.f363527t;
    }

    @Override // hk4.a
    public boolean c() {
        return this.f363528u;
    }

    @Override // hk4.a
    public hk4.b d() {
        return hk4.b.f363467f;
    }

    @Override // hk4.a
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363518k, "pause");
        kk4.b.i(this.f363519l, false, false, 3, null);
        this.f363528u = false;
    }

    @Override // hk4.a
    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363518k, "preloadMedia");
        kk4.v vVar = this.f363519l;
        vVar.f390118j = false;
        vVar.O();
    }

    @Override // hk4.a
    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363518k, "release");
        kk4.v vVar = this.f363519l;
        vVar.F(null);
        vVar.R();
        kk4.b.e(vVar, null, 1, null);
        vVar.P();
        vVar.mo143590x408b7293();
    }

    @Override // hk4.a
    public void h() {
        kk4.v vVar = this.f363519l;
        vVar.f390118j = true;
        vVar.O();
        this.f363528u = true;
    }

    @Override // hk4.a
    public void i(long j17, yz5.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363518k, "seek:" + j17);
        if (!this.f363527t) {
            this.f363530w = j17;
        }
        this.f363519l.z((int) j17, true, new hk4.w(this, j17, aVar));
    }

    @Override // hk4.a
    public void j(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363518k, "setLoop:" + z17);
        this.f363529v = z17;
        this.f363519l.A(z17);
    }

    @Override // hk4.a
    public void k(boolean z17) {
        this.f363519l.C(z17);
    }

    @Override // hk4.a
    public void l(long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363518k, "setPlayRange:[" + j17 + ',' + j18 + ']');
        this.f363520m = j17;
        this.f363521n = j18;
    }

    @Override // hk4.a
    public void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363518k, "start");
        kk4.v vVar = this.f363519l;
        vVar.f390118j = true;
        vVar.O();
        this.f363526s = false;
        this.f363527t = false;
        this.f363528u = true;
    }

    @Override // hk4.a
    public void o() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363518k, "stop");
        this.f363519l.mo143591x360802();
        this.f363528u = false;
    }
}
