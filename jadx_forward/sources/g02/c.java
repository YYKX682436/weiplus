package g02;

/* loaded from: classes8.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f348953a;

    /* renamed from: b, reason: collision with root package name */
    public int f348954b;

    /* renamed from: c, reason: collision with root package name */
    public long f348955c;

    /* renamed from: d, reason: collision with root package name */
    public long f348956d;

    /* renamed from: e, reason: collision with root package name */
    public long f348957e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f348958f;

    /* renamed from: g, reason: collision with root package name */
    public int f348959g;

    /* renamed from: h, reason: collision with root package name */
    public int f348960h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f348961i;

    /* renamed from: j, reason: collision with root package name */
    public long f348962j;

    /* renamed from: k, reason: collision with root package name */
    public int f348963k;

    /* renamed from: l, reason: collision with root package name */
    public long f348964l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f348965m;

    /* renamed from: n, reason: collision with root package name */
    public int f348966n;

    /* renamed from: o, reason: collision with root package name */
    public int f348967o;

    /* renamed from: p, reason: collision with root package name */
    public int f348968p;

    /* renamed from: q, reason: collision with root package name */
    public int f348969q;

    /* renamed from: r, reason: collision with root package name */
    public int f348970r;

    /* renamed from: s, reason: collision with root package name */
    public int f348971s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f348972t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f348973u;

    public c() {
        this.f348971s = 1;
        this.f348972t = "";
        this.f348973u = "";
    }

    public void a(dm.t3 t3Var) {
        this.f348953a = t3Var.f68404x28d45f97;
        this.f348954b = t3Var.f68432x29cbf907;
        long j17 = t3Var.f68438x1bb3427e;
        this.f348955c = j17;
        long j18 = t3Var.f68413xf432b5ad - j17;
        this.f348956d = j18;
        if (j18 < 0) {
            j18 = 0;
        }
        this.f348956d = j18;
        this.f348957e = t3Var.f68443x78351860;
        this.f348958f = t3Var.f68411x238eb002;
        this.f348959g = t3Var.f68416x1c571ead;
        this.f348960h = t3Var.f68414xf4f8adf4;
        this.f348961i = t3Var.f68407xf1be7c79;
        long j19 = t3Var.f68422xfdca0665;
        if (j19 <= 0) {
            j19 = java.lang.System.currentTimeMillis();
        }
        long j27 = t3Var.f68440x1bb3b54a;
        if (j27 == 0) {
            this.f348962j = 0L;
        } else {
            this.f348962j = (j19 - j27) / 1000;
        }
        if (this.f348962j < 0) {
            this.f348962j = 0L;
        }
        this.f348963k = t3Var.f68439x5ab9b1b4;
        this.f348964l = t3Var.f68408x32b20428;
        this.f348965m = t3Var.f68417x26b3182a;
        this.f348966n = t3Var.f68431x4651c731 ? 1 : 0;
        this.f348967o = t3Var.f68437x5ab205af;
        this.f348968p = t3Var.f68444x136fa406;
        this.f348969q = t3Var.f68427x7c4053b8;
        this.f348970r = t3Var.f68436x2261a7a0;
        this.f348971s = t3Var.f68410x4e46f707;
        this.f348972t = t3Var.f68446x1294bc41;
    }

    public c(java.lang.String str, int i17, long j17, java.lang.String str2, java.lang.String str3, int i18) {
        this.f348971s = 1;
        this.f348972t = "";
        this.f348973u = "";
        this.f348953a = str;
        this.f348954b = i17;
        this.f348964l = j17;
        this.f348961i = str2;
        this.f348965m = str3;
        this.f348966n = i18;
    }

    public c(java.lang.String str, long j17, java.lang.String str2, long j18, int i17) {
        this.f348971s = 1;
        this.f348972t = "";
        this.f348973u = "";
        this.f348953a = str;
        this.f348964l = j17;
        this.f348961i = str2;
        this.f348962j = j18;
        this.f348966n = i17;
    }

    public c(java.lang.String str, int i17, java.lang.String str2, int i18, int i19, int i27, int i28) {
        this.f348972t = "";
        this.f348973u = "";
        this.f348953a = str;
        this.f348954b = i17;
        this.f348967o = i17;
        this.f348965m = str2;
        this.f348966n = this.f348966n;
        this.f348968p = i18;
        this.f348969q = i27;
        this.f348970r = i19;
        this.f348971s = i28;
    }
}
