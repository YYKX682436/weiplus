package dh4;

/* loaded from: classes15.dex */
public class v {
    public long A;
    public int B;
    public long C;
    public long D;
    public boolean E;
    public boolean F;

    /* renamed from: a, reason: collision with root package name */
    public int f314121a;

    /* renamed from: b, reason: collision with root package name */
    public long f314122b;

    /* renamed from: c, reason: collision with root package name */
    public long f314123c;

    /* renamed from: e, reason: collision with root package name */
    public int f314125e;

    /* renamed from: f, reason: collision with root package name */
    public long f314126f;

    /* renamed from: g, reason: collision with root package name */
    public int f314127g;

    /* renamed from: h, reason: collision with root package name */
    public int f314128h;

    /* renamed from: i, reason: collision with root package name */
    public int f314129i;

    /* renamed from: j, reason: collision with root package name */
    public int f314130j;

    /* renamed from: k, reason: collision with root package name */
    public int f314131k;

    /* renamed from: m, reason: collision with root package name */
    public int f314133m;

    /* renamed from: n, reason: collision with root package name */
    public int f314134n;

    /* renamed from: o, reason: collision with root package name */
    public int f314135o;

    /* renamed from: p, reason: collision with root package name */
    public int f314136p;

    /* renamed from: q, reason: collision with root package name */
    public int f314137q;

    /* renamed from: r, reason: collision with root package name */
    public int f314138r;

    /* renamed from: s, reason: collision with root package name */
    public int f314139s;

    /* renamed from: t, reason: collision with root package name */
    public int f314140t;

    /* renamed from: u, reason: collision with root package name */
    public int f314141u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f314142v;

    /* renamed from: w, reason: collision with root package name */
    public int f314143w;

    /* renamed from: x, reason: collision with root package name */
    public long f314144x;

    /* renamed from: y, reason: collision with root package name */
    public int f314145y;

    /* renamed from: z, reason: collision with root package name */
    public int f314146z;

    /* renamed from: d, reason: collision with root package name */
    public int f314124d = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f314132l = 0;

    public void a() {
        long j17 = this.D;
        if (j17 == 0) {
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = (android.os.SystemClock.elapsedRealtime() - j17) / 1000;
        if (elapsedRealtime < 2) {
            this.f314133m++;
        } else if (elapsedRealtime < 6) {
            this.f314134n++;
        } else if (elapsedRealtime < 11) {
            this.f314135o++;
        } else if (elapsedRealtime < 21) {
            this.f314136p++;
        } else if (elapsedRealtime < 31) {
            this.f314137q++;
        } else if (elapsedRealtime < 41) {
            this.f314138r++;
        } else if (elapsedRealtime < 51) {
            this.f314139s++;
        } else if (elapsedRealtime < 61) {
            this.f314140t++;
        } else {
            this.f314141u++;
        }
        this.D = 0L;
    }

    /* renamed from: toString */
    public java.lang.String m124420x9616526c() {
        return "" + this.f314121a + "," + this.f314122b + "," + this.f314123c + "," + this.f314124d + "," + this.f314125e + "," + this.f314126f + "," + this.f314127g + "," + this.f314128h + ",0,0," + this.f314129i + "," + this.f314130j + "," + this.f314131k + "," + this.f314132l + "," + this.f314133m + "," + this.f314134n + "," + this.f314135o + "," + this.f314136p + "," + this.f314137q + "," + this.f314138r + "," + this.f314139s + "," + this.f314140t + "," + this.f314141u + "," + this.f314142v + "," + this.f314143w + "," + this.f314144x + "," + this.f314145y + "," + this.f314146z;
    }
}
