package hx1;

/* loaded from: classes12.dex */
public class g {

    /* renamed from: q, reason: collision with root package name */
    public static hx1.g f367155q;

    /* renamed from: a, reason: collision with root package name */
    public boolean f367156a;

    /* renamed from: b, reason: collision with root package name */
    public long f367157b;

    /* renamed from: c, reason: collision with root package name */
    public long f367158c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f367159d;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Toast f367161f;

    /* renamed from: h, reason: collision with root package name */
    public cv.b1 f367163h;

    /* renamed from: i, reason: collision with root package name */
    public cv.d1 f367164i;

    /* renamed from: l, reason: collision with root package name */
    public jx1.a f367167l;

    /* renamed from: e, reason: collision with root package name */
    public long f367160e = -1;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f367165j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f367166k = "";

    /* renamed from: m, reason: collision with root package name */
    public ix1.n f367168m = null;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f367169n = new hx1.d(this);

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f367170o = new hx1.e(this);

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f367171p = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new hx1.f(this), true);

    /* renamed from: g, reason: collision with root package name */
    public final fp.e f367162g = new fp.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);

    public static hx1.g a() {
        if (f367155q == null) {
            f367155q = new hx1.g();
        }
        return f367155q;
    }

    public final void b() {
        if (this.f367156a) {
            this.f367170o.mo50303x856b99f0(4096);
            if (this.f367165j.equals("speex")) {
                ((w21.k0) this.f367164i).mo166726xad07d6f3();
            } else {
                ((tl.y0) this.f367163h).b();
            }
            fp.e eVar = this.f367162g;
            if (eVar != null) {
                eVar.a();
            }
            long j17 = this.f367157b;
            long j18 = 0;
            if (j17 != 0) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                j18 = android.os.SystemClock.elapsedRealtime() - j17;
            }
            this.f367158c = j18;
            boolean z18 = j18 < 800;
            this.f367171p.d();
            if (z18) {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(this.f367166k);
                if (r6Var.m()) {
                    r6Var.l();
                }
                this.f367169n.mo50307xb9e94560(0, 500L);
            } else {
                long j19 = this.f367158c / 1000;
            }
            this.f367156a = false;
        }
    }
}
