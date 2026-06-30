package hl0;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f363586a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f363587b;

    /* renamed from: d, reason: collision with root package name */
    public long f363589d;

    /* renamed from: e, reason: collision with root package name */
    public long f363590e;

    /* renamed from: f, reason: collision with root package name */
    public long f363591f;

    /* renamed from: g, reason: collision with root package name */
    public long f363592g;

    /* renamed from: h, reason: collision with root package name */
    public long f363593h;

    /* renamed from: i, reason: collision with root package name */
    public float f363594i;

    /* renamed from: k, reason: collision with root package name */
    public long f363596k;

    /* renamed from: l, reason: collision with root package name */
    public long f363597l;

    /* renamed from: m, reason: collision with root package name */
    public long f363598m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f363599n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f363600o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f363601p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f363602q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f363603r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f363604s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f363605t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f363606u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f363607v;

    /* renamed from: j, reason: collision with root package name */
    public int f363595j = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f363608w = -1;

    /* renamed from: c, reason: collision with root package name */
    public final int f363588c = java.lang.Integer.parseInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g.replace("0x", ""), 16);

    public e(java.lang.String str, java.lang.String str2) {
        this.f363586a = str;
        this.f363587b = str2;
    }

    public void a() {
        nl0.d a17 = nl0.c.a();
        java.lang.String str = this.f363586a;
        java.lang.String str2 = this.f363587b;
        dm.u6 y07 = a17.y0(str, str2);
        if (y07 == null) {
            y07 = new dm.u6();
            y07.f68588x2262335f = str;
            y07.f68574xc8a07680 = str2;
            y07.f68589x8987ca93 = this.f363588c;
            nl0.c.a().mo880xb970c2b9(y07);
        }
        long j17 = this.f363589d;
        if (j17 != 0) {
            y07.f68573x68eb8605 = j17;
        }
        long j18 = this.f363590e;
        if (j18 != 0) {
            y07.f68580xdf382598 = j18;
        }
        long j19 = this.f363591f;
        if (j19 != 0) {
            y07.f68583x9348ba2a = j19;
        }
        long j27 = this.f363592g;
        if (j27 != 0) {
            y07.f68572x34f486f0 = j27;
        }
        long j28 = this.f363593h;
        if (j28 != 0) {
            y07.f68584xdc36ef76 = j28;
        }
        float f17 = this.f363594i;
        if (f17 != 0.0f) {
            y07.f68582xfe5e3cf4 = f17;
        }
        int i17 = this.f363595j;
        if (i17 != -1) {
            y07.f68579x4a55a39e = i17;
        }
        long j29 = this.f363596k;
        if (j29 != 0) {
            y07.f68587x9d850de6 = j29;
        }
        long j37 = this.f363597l;
        if (j37 != 0) {
            y07.f68585x62b7358e = j37;
        }
        long j38 = this.f363598m;
        if (j38 != 0) {
            y07.f68586xa8de1927 = j38;
        }
        if (!android.text.TextUtils.isEmpty(this.f363604s)) {
            y07.f68571x6d651db5 = this.f363604s;
        }
        if (!android.text.TextUtils.isEmpty(this.f363602q)) {
            y07.f68577x83c1d32 = this.f363602q;
        }
        if (!android.text.TextUtils.isEmpty(this.f363603r)) {
            y07.f68578xca46169a = this.f363603r;
        }
        if (!android.text.TextUtils.isEmpty(this.f363599n)) {
            y07.f68570x3211ea76 = this.f363599n;
        }
        if (!android.text.TextUtils.isEmpty(this.f363600o)) {
            y07.f68567x7c3ca06a = this.f363600o;
        }
        if (!android.text.TextUtils.isEmpty(this.f363601p)) {
            y07.f68568xfdb8f5d2 = this.f363601p;
        }
        if (!android.text.TextUtils.isEmpty(this.f363605t)) {
            y07.f68569x225aa2b6 = this.f363605t;
        }
        int i18 = this.f363608w;
        if (i18 != -1) {
            y07.f68581xdf386205 = i18;
        }
        boolean z17 = this.f363606u;
        if (z17) {
            y07.f68576x5c5523e2 = z17;
        }
        boolean z18 = this.f363607v;
        if (!z18) {
            y07.f68575x713bde13 = z18;
        }
        nl0.c.a().z0(y07);
    }
}
