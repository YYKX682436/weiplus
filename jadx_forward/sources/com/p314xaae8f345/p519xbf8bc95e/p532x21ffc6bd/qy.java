package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class qy {

    /* renamed from: a, reason: collision with root package name */
    public static final int f132634a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f132635b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f132636c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f132637d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f132638e = 16;

    /* renamed from: f, reason: collision with root package name */
    public static final int f132639f = 256;

    /* renamed from: g, reason: collision with root package name */
    public static final int f132640g = 4096;

    /* renamed from: h, reason: collision with root package name */
    public static final int f132641h = 65536;
    public java.lang.String C;
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26067xc981814a D;
    private android.graphics.Rect E;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df f132642i;

    /* renamed from: j, reason: collision with root package name */
    public android.graphics.Bitmap[] f132643j;

    /* renamed from: o, reason: collision with root package name */
    public int f132648o;

    /* renamed from: p, reason: collision with root package name */
    boolean f132649p;

    /* renamed from: q, reason: collision with root package name */
    public int f132650q;

    /* renamed from: r, reason: collision with root package name */
    public int f132651r;

    /* renamed from: s, reason: collision with root package name */
    public int f132652s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f132654u;

    /* renamed from: w, reason: collision with root package name */
    protected java.lang.String f132656w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f132657x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f132658y;

    /* renamed from: k, reason: collision with root package name */
    public float f132644k = 0.5f;

    /* renamed from: l, reason: collision with root package name */
    public float f132645l = 0.5f;

    /* renamed from: m, reason: collision with root package name */
    public float f132646m = 1.0f;

    /* renamed from: n, reason: collision with root package name */
    public boolean f132647n = false;

    /* renamed from: t, reason: collision with root package name */
    public int f132653t = 2;

    /* renamed from: v, reason: collision with root package name */
    public boolean f132655v = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f132659z = true;
    public java.lang.Object A = "";
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26068xb94dc6b4 B = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26068xb94dc6b4.ICON_MARKER;

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        this.f132642i = c4247x704e24df;
        return this;
    }

    private com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df b() {
        return this.f132642i;
    }

    private android.graphics.Rect c() {
        return this.E;
    }

    private android.graphics.Bitmap[] d() {
        return this.f132643j;
    }

    private boolean e() {
        return this.f132647n;
    }

    private float f() {
        return this.f132646m;
    }

    private int[] g() {
        float f17 = this.f132644k;
        int i17 = 1;
        int i18 = f17 == 0.0f ? 4096 : f17 == 1.0f ? 65536 : 1;
        float f18 = this.f132645l;
        if (f18 == 0.0f) {
            i17 = 256;
        } else if (f18 == 1.0f) {
            i17 = 16;
        }
        return new int[]{i18 | i17};
    }

    private int h() {
        float f17 = this.f132644k;
        int i17 = 1;
        int i18 = f17 == 0.0f ? 4096 : f17 == 1.0f ? 65536 : 1;
        float f18 = this.f132645l;
        if (f18 == 0.0f) {
            i17 = 256;
        } else if (f18 == 1.0f) {
            i17 = 16;
        }
        return new int[]{i18 | i17}[0];
    }

    private float i() {
        return this.f132644k;
    }

    private float j() {
        return this.f132645l;
    }

    private int k() {
        return this.f132648o;
    }

    private boolean l() {
        return this.f132649p;
    }

    private boolean m() {
        return this.f132657x;
    }

    private boolean n() {
        return this.f132658y;
    }

    private int o() {
        return this.f132650q;
    }

    private int p() {
        return this.f132651r;
    }

    private int q() {
        return this.f132652s;
    }

    private int r() {
        return this.f132653t;
    }

    private boolean s() {
        return this.f132654u;
    }

    private boolean t() {
        return this.f132655v;
    }

    private boolean u() {
        return this.f132659z;
    }

    private java.lang.Object v() {
        return this.A;
    }

    private java.lang.String w() {
        java.lang.Object obj = this.A;
        return obj == null ? "" : obj.toString();
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26068xb94dc6b4 x() {
        return this.B;
    }

    private java.lang.String y() {
        return this.C;
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26067xc981814a z() {
        return this.D;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy b(boolean z17) {
        this.f132647n = z17;
        return this;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy c(boolean z17) {
        this.f132649p = z17;
        return this;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy d(boolean z17) {
        this.f132657x = z17;
        return this;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy e(boolean z17) {
        this.f132658y = z17;
        return this;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy f(boolean z17) {
        this.f132654u = z17;
        return this;
    }

    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy a(java.lang.String str, android.graphics.Bitmap... bitmapArr) {
        this.f132656w = str;
        this.f132643j = bitmapArr;
        return this;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy b(int i17) {
        this.f132652s = i17;
        return this;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy c(int i17) {
        this.f132653t = i17;
        return this;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy a(int i17, int i18) {
        this.f132650q = i17;
        this.f132651r = i18;
        return this;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy g(boolean z17) {
        this.f132659z = z17;
        return this;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy a(boolean z17) {
        this.f132655v = z17;
        return this;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy a(int i17, int i18, int i19, int i27) {
        this.E = new android.graphics.Rect(i17, i18, i19, i27);
        return this;
    }

    public final java.lang.String a() {
        return this.f132656w;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy a(float f17) {
        this.f132646m = f17;
        return this;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy a(int... iArr) {
        if (iArr == null) {
            this.f132644k = 0.5f;
            this.f132645l = 1.0f;
            return this;
        }
        this.f132644k = 0.5f;
        this.f132645l = 0.5f;
        if (iArr.length != 1) {
            return this;
        }
        int i17 = iArr[0];
        if ((i17 & 256) == 256) {
            this.f132645l = 0.0f;
        } else if ((i17 & 16) == 16) {
            this.f132645l = 1.0f;
        }
        if ((i17 & 4096) == 4096) {
            this.f132644k = 0.0f;
        } else if ((i17 & 65536) == 65536) {
            this.f132644k = 1.0f;
        }
        return this;
    }

    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy a(float f17, float f18) {
        this.f132644k = f17;
        this.f132645l = f18;
        return this;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy a(int i17) {
        this.f132648o = i17;
        return this;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy a(java.lang.Object obj) {
        this.A = obj;
        return this;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26068xb94dc6b4 enumC26068xb94dc6b4) {
        if (enumC26068xb94dc6b4 != null) {
            this.B = enumC26068xb94dc6b4;
        }
        return this;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy a(java.lang.String str) {
        this.C = str;
        return this;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qy a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26067xc981814a c26067xc981814a) {
        this.D = c26067xc981814a;
        return this;
    }
}
