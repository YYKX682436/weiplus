package di3;

/* loaded from: classes10.dex */
public class b {

    /* renamed from: J, reason: collision with root package name */
    public static di3.b f314184J;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public long F;
    public long G;
    public int H;

    /* renamed from: c, reason: collision with root package name */
    public int f314187c;

    /* renamed from: d, reason: collision with root package name */
    public int f314188d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f314189e;

    /* renamed from: f, reason: collision with root package name */
    public int f314190f;

    /* renamed from: g, reason: collision with root package name */
    public int f314191g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f314192h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f314193i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f314194j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f314195k;

    /* renamed from: l, reason: collision with root package name */
    public int f314196l;

    /* renamed from: m, reason: collision with root package name */
    public int f314197m;

    /* renamed from: n, reason: collision with root package name */
    public int f314198n;

    /* renamed from: o, reason: collision with root package name */
    public int f314199o;

    /* renamed from: p, reason: collision with root package name */
    public int f314200p;

    /* renamed from: q, reason: collision with root package name */
    public int f314201q;

    /* renamed from: s, reason: collision with root package name */
    public int f314203s;

    /* renamed from: t, reason: collision with root package name */
    public int f314204t;

    /* renamed from: u, reason: collision with root package name */
    public int f314205u;

    /* renamed from: v, reason: collision with root package name */
    public int f314206v;

    /* renamed from: w, reason: collision with root package name */
    public int f314207w;

    /* renamed from: x, reason: collision with root package name */
    public int f314208x;

    /* renamed from: y, reason: collision with root package name */
    public int f314209y;

    /* renamed from: z, reason: collision with root package name */
    public int f314210z;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f314185a = wo.w0.m();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f314186b = android.os.Build.VERSION.SDK_INT + "";

    /* renamed from: r, reason: collision with root package name */
    public int f314202r = 0;
    public org.json.JSONObject I = null;

    public static di3.b b() {
        if (f314184J == null) {
            c();
        }
        return f314184J;
    }

    public static void c() {
        di3.b bVar = new di3.b();
        f314184J = bVar;
        bVar.f314187c = ((android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getLargeMemoryClass();
        f314184J.f314188d = ai3.d.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        f314184J.f314189e = wo.r.e();
        android.graphics.Point f17 = ai3.d.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        di3.b bVar2 = f314184J;
        bVar2.f314190f = f17.x;
        bVar2.f314191g = f17.y;
    }

    public void a(java.lang.String str, int i17) {
        di3.f0 f0Var = di3.w.f314303d;
        this.f314205u = f0Var.f314233a;
        this.f314206v = f0Var.f314236d;
        this.f314207w = f0Var.f314237e ? 1 : 0;
        this.f314208x = f0Var.f314238f ? 1 : 0;
        this.f314209y = f0Var.f314239g;
        this.f314210z = i17;
        this.F = com.p314xaae8f345.mm.vfs.w6.k(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true);
        if (d17 != null) {
            this.C = d17.f243917c;
            this.D = d17.f243918d;
            this.E = d17.f243916b;
            this.A = d17.f243915a;
        }
    }

    public void d(android.graphics.Point point, android.graphics.Point point2, android.graphics.Point point3) {
        this.f314201q = -1;
        this.f314200p = -1;
        this.f314197m = -1;
        this.f314196l = -1;
        this.f314199o = -1;
        this.f314198n = -1;
        if (point != null) {
            this.f314198n = point.x;
            this.f314199o = point.y;
        }
        if (point2 != null) {
            this.f314196l = point2.x;
            this.f314197m = point2.y;
        }
        if (point3 != null) {
            this.f314200p = point3.x;
            this.f314201q = point3.y;
        }
    }

    public void e(java.util.List list, java.util.List list2, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f314192h)) {
            this.f314192h = ai3.d.v(list);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f314193i)) {
            this.f314193i = ai3.d.v(list2);
        }
        this.f314202r = i17;
        this.H = 1;
    }

    public void f(java.util.List list, java.util.List list2, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f314194j)) {
            this.f314194j = ai3.d.v(list);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f314195k)) {
            this.f314195k = ai3.d.v(list2);
        }
        this.f314202r = i17;
        this.H = 2;
    }
}
