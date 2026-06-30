package uh1;

/* loaded from: classes7.dex */
public class r {
    public final boolean A;
    public final boolean B;

    /* renamed from: a, reason: collision with root package name */
    public final int f509405a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f509406b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f509407c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f509408d;

    /* renamed from: e, reason: collision with root package name */
    public final uh1.n f509409e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f509410f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f509411g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f509413i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f509414j;

    /* renamed from: k, reason: collision with root package name */
    public java.net.HttpURLConnection f509415k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f509416l;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f509418n;

    /* renamed from: q, reason: collision with root package name */
    public boolean f509421q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f509422r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f509423s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f509425u;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f509427w;

    /* renamed from: x, reason: collision with root package name */
    public int f509428x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f509429y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f509430z;

    /* renamed from: h, reason: collision with root package name */
    public int f509412h = 15;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Runnable f509419o = null;

    /* renamed from: p, reason: collision with root package name */
    public boolean f509420p = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f509424t = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f509426v = false;

    /* renamed from: m, reason: collision with root package name */
    public final long f509417m = java.lang.System.currentTimeMillis();

    public r(java.lang.String str, byte[] bArr, int i17, uh1.n nVar, java.lang.String str2, boolean z17, boolean z18, boolean z19, boolean z27, java.lang.String str3, int i18, java.lang.String str4, boolean z28, boolean z29, boolean z37) {
        this.f509421q = false;
        this.f509422r = false;
        this.f509423s = false;
        this.f509425u = false;
        this.f509430z = false;
        this.B = false;
        this.f509407c = str;
        this.f509406b = bArr;
        this.f509409e = nVar;
        this.f509405a = i17;
        this.f509408d = str2;
        this.f509421q = z17;
        this.f509422r = z18;
        this.f509425u = z27;
        this.f509423s = z19;
        this.f509427w = str3;
        this.f509428x = i18;
        this.f509429y = str4;
        this.f509430z = z28;
        this.A = z29;
        this.B = z37;
    }

    public uh1.n a() {
        return this.f509409e;
    }

    public int b() {
        return this.f509412h;
    }

    public int c() {
        return (int) (java.lang.System.currentTimeMillis() - this.f509417m);
    }

    public long d() {
        if (this.f509406b != null) {
            return r0.length;
        }
        return 0L;
    }

    public java.util.ArrayList e() {
        return this.f509411g;
    }

    public java.lang.String f() {
        return this.f509418n;
    }

    public java.util.Map g() {
        return this.f509410f;
    }

    public java.lang.String h() {
        return this.f509408d;
    }

    public byte[] i() {
        return this.f509406b;
    }

    public java.lang.String j() {
        return this.f509413i;
    }

    public java.lang.String k() {
        return this.f509414j;
    }

    public int l() {
        return this.f509405a;
    }

    public java.lang.String m() {
        return this.f509407c;
    }

    public void n(int i17) {
        this.f509412h = i17;
    }

    public void o(java.net.HttpURLConnection httpURLConnection) {
        this.f509415k = httpURLConnection;
    }

    public void p(java.lang.String str) {
        this.f509407c = str;
    }
}
