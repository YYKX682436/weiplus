package xx5;

/* loaded from: classes13.dex */
public class t {

    /* renamed from: y, reason: collision with root package name */
    public static boolean f539619y;

    /* renamed from: a, reason: collision with root package name */
    public boolean f539620a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f539621b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f539622c = false;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f539623d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f539624e = "others";

    /* renamed from: f, reason: collision with root package name */
    public long f539625f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f539626g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f539627h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f539628i = 1;

    /* renamed from: j, reason: collision with root package name */
    public long f539629j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f539630k = -1;

    /* renamed from: l, reason: collision with root package name */
    public long f539631l = -1;

    /* renamed from: m, reason: collision with root package name */
    public long f539632m = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f539633n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f539634o = 1;

    /* renamed from: p, reason: collision with root package name */
    public int f539635p = -1;

    /* renamed from: q, reason: collision with root package name */
    public long f539636q = -1;

    /* renamed from: r, reason: collision with root package name */
    public long f539637r = -1;

    /* renamed from: s, reason: collision with root package name */
    public long f539638s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f539639t = 1;

    /* renamed from: u, reason: collision with root package name */
    public int f539640u = -1;

    /* renamed from: v, reason: collision with root package name */
    public long f539641v = -1;

    /* renamed from: w, reason: collision with root package name */
    public long f539642w = -1;

    /* renamed from: x, reason: collision with root package name */
    public long f539643x = -1;

    public void a(int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f539626g = currentTimeMillis;
        this.f539627h = currentTimeMillis - this.f539625f;
        this.f539628i = i17;
        if (i17 == 1 && !f539619y) {
            f539619y = true;
            this.f539622c = true;
        }
        by5.c4.f("KVReportForWebView", "finishCreateWebView, isFirstCreatedWebView:" + this.f539622c);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("20260502,");
        sb6.append(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d());
        sb6.append(",");
        sb6.append(this.f539620a ? "1" : "0");
        sb6.append(",");
        sb6.append(this.f539621b ? "1" : "0");
        sb6.append(",");
        sb6.append(this.f539623d);
        sb6.append(",");
        sb6.append(this.f539625f);
        sb6.append(",");
        sb6.append(this.f539626g);
        sb6.append(",");
        sb6.append(this.f539627h);
        sb6.append(",");
        sb6.append(this.f539628i);
        sb6.append(",");
        sb6.append(this.f539629j);
        sb6.append(",");
        sb6.append(this.f539630k);
        sb6.append(",");
        sb6.append(this.f539631l);
        sb6.append(",");
        sb6.append(this.f539632m);
        sb6.append(",");
        sb6.append(this.f539633n);
        sb6.append(",");
        sb6.append(this.f539634o);
        sb6.append(",");
        sb6.append(this.f539635p);
        sb6.append(",");
        sb6.append(this.f539636q);
        sb6.append(",");
        sb6.append(this.f539637r);
        sb6.append(",");
        sb6.append(this.f539638s);
        sb6.append(",");
        sb6.append(this.f539639t);
        sb6.append(",");
        sb6.append(this.f539640u);
        sb6.append(",");
        sb6.append(this.f539641v);
        sb6.append(",");
        sb6.append(this.f539642w);
        sb6.append(",");
        sb6.append(this.f539643x);
        sb6.append(",");
        sb6.append(this.f539622c ? "1" : "0");
        sb6.append(",");
        sb6.append(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c.getPackageName());
        sb6.append(",");
        sb6.append(android.os.Looper.myLooper() != android.os.Looper.getMainLooper() ? 0 : 1);
        sb6.append(",");
        sb6.append(by5.a4.b());
        sb6.append(",");
        sb6.append(this.f539624e);
        sb6.append(",");
        com.p314xaae8f345.p3210x3857dc.b.m().getClass();
        sb6.append(com.p314xaae8f345.p3210x3857dc.b.f301741b);
        java.lang.String sb7 = sb6.toString();
        by5.c4.f("KVReportForWebView", "report:" + sb7);
        by5.s0.t(24340, sb7);
    }
}
