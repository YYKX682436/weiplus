package e04;

/* loaded from: classes15.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public long f327499a;

    /* renamed from: b, reason: collision with root package name */
    public long f327500b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f327501c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f327502d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f327503e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f327504f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Boolean f327506h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f327507i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f327509k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f327510l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f327511m;

    /* renamed from: n, reason: collision with root package name */
    public long f327512n;

    /* renamed from: o, reason: collision with root package name */
    public long f327513o;

    /* renamed from: p, reason: collision with root package name */
    public long f327514p;

    /* renamed from: q, reason: collision with root package name */
    public long f327515q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f327516r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f327517s;

    /* renamed from: t, reason: collision with root package name */
    public long f327518t;

    /* renamed from: g, reason: collision with root package name */
    public int f327505g = -1;

    /* renamed from: j, reason: collision with root package name */
    public e04.k2 f327508j = e04.k2.f327533e;

    /* renamed from: u, reason: collision with root package name */
    public e04.i1 f327519u = e04.i1.f327490e;

    public final int a(e04.g1 g1Var, e04.h1 h1Var, boolean z17) {
        if (!z17) {
            return 1;
        }
        java.lang.Boolean bool = g1Var.f327450a;
        if (bool == null) {
            return 11;
        }
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, bool2)) {
            return 12;
        }
        if (!g1Var.f327457h) {
            return 14;
        }
        if (g1Var.f327452c || !g1Var.f327476i) {
            return 13;
        }
        qt5.d dVar = g1Var.f327477j;
        if (dVar != null) {
            if (!(dVar != null && dVar.f448210a == 0)) {
                return 13;
            }
        }
        java.lang.Boolean bool3 = h1Var.f327450a;
        if (bool3 == null) {
            return 21;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool3, bool2)) {
            return 22;
        }
        if (!h1Var.f327457h) {
            return 24;
        }
        if (h1Var.f327452c || !h1Var.f327482i) {
            return 23;
        }
        qt5.d dVar2 = h1Var.f327483j;
        if (dVar2 != null) {
            if (!(dVar2 != null && dVar2.f448210a == 0)) {
                return 23;
            }
        }
        if (this.f327510l) {
            return !this.f327511m ? 32 : 0;
        }
        return 31;
    }

    public final void b() {
        this.f327501c = false;
        this.f327503e = false;
        this.f327504f = false;
        this.f327505g = -1;
        this.f327506h = null;
        this.f327507i = false;
        this.f327508j = e04.k2.f327533e;
        this.f327509k = false;
        this.f327512n = 0L;
        this.f327510l = false;
        this.f327511m = false;
        this.f327513o = 0L;
        this.f327514p = 0L;
        this.f327515q = 0L;
        this.f327516r = false;
        this.f327517s = false;
        this.f327518t = 0L;
        this.f327519u = e04.i1.f327490e;
    }

    public final void c(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCameraReporter", "setCameraFacing: " + i17 + ", isBackCamera: " + z17);
        this.f327505g = i17;
        this.f327506h = java.lang.Boolean.valueOf(z17);
    }

    public final void d(boolean z17, e04.k2 retryReason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(retryReason, "retryReason");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCameraReporter", "setRetryOpenCamera: " + z17 + ", " + retryReason);
        this.f327507i = z17;
        this.f327508j = retryReason;
    }
}
