package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class qy {

    /* renamed from: a, reason: collision with root package name */
    public static final int f51101a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f51102b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f51103c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f51104d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f51105e = 16;

    /* renamed from: f, reason: collision with root package name */
    public static final int f51106f = 256;

    /* renamed from: g, reason: collision with root package name */
    public static final int f51107g = 4096;

    /* renamed from: h, reason: collision with root package name */
    public static final int f51108h = 65536;
    public java.lang.String C;
    public com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle D;
    private android.graphics.Rect E;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.map.lib.models.GeoPoint f51109i;

    /* renamed from: j, reason: collision with root package name */
    public android.graphics.Bitmap[] f51110j;

    /* renamed from: o, reason: collision with root package name */
    public int f51115o;

    /* renamed from: p, reason: collision with root package name */
    boolean f51116p;

    /* renamed from: q, reason: collision with root package name */
    public int f51117q;

    /* renamed from: r, reason: collision with root package name */
    public int f51118r;

    /* renamed from: s, reason: collision with root package name */
    public int f51119s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f51121u;

    /* renamed from: w, reason: collision with root package name */
    protected java.lang.String f51123w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f51124x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f51125y;

    /* renamed from: k, reason: collision with root package name */
    public float f51111k = 0.5f;

    /* renamed from: l, reason: collision with root package name */
    public float f51112l = 0.5f;

    /* renamed from: m, reason: collision with root package name */
    public float f51113m = 1.0f;

    /* renamed from: n, reason: collision with root package name */
    public boolean f51114n = false;

    /* renamed from: t, reason: collision with root package name */
    public int f51120t = 2;

    /* renamed from: v, reason: collision with root package name */
    public boolean f51122v = true;

    /* renamed from: z, reason: collision with root package name */
    public boolean f51126z = true;
    public java.lang.Object A = "";
    public com.tencent.tencentmap.mapsdk.maps.model.MarkerType B = com.tencent.tencentmap.mapsdk.maps.model.MarkerType.ICON_MARKER;

    private com.tencent.mapsdk.internal.qy a(com.tencent.map.lib.models.GeoPoint geoPoint) {
        this.f51109i = geoPoint;
        return this;
    }

    private com.tencent.map.lib.models.GeoPoint b() {
        return this.f51109i;
    }

    private android.graphics.Rect c() {
        return this.E;
    }

    private android.graphics.Bitmap[] d() {
        return this.f51110j;
    }

    private boolean e() {
        return this.f51114n;
    }

    private float f() {
        return this.f51113m;
    }

    private int[] g() {
        float f17 = this.f51111k;
        int i17 = 1;
        int i18 = f17 == 0.0f ? 4096 : f17 == 1.0f ? 65536 : 1;
        float f18 = this.f51112l;
        if (f18 == 0.0f) {
            i17 = 256;
        } else if (f18 == 1.0f) {
            i17 = 16;
        }
        return new int[]{i18 | i17};
    }

    private int h() {
        float f17 = this.f51111k;
        int i17 = 1;
        int i18 = f17 == 0.0f ? 4096 : f17 == 1.0f ? 65536 : 1;
        float f18 = this.f51112l;
        if (f18 == 0.0f) {
            i17 = 256;
        } else if (f18 == 1.0f) {
            i17 = 16;
        }
        return new int[]{i18 | i17}[0];
    }

    private float i() {
        return this.f51111k;
    }

    private float j() {
        return this.f51112l;
    }

    private int k() {
        return this.f51115o;
    }

    private boolean l() {
        return this.f51116p;
    }

    private boolean m() {
        return this.f51124x;
    }

    private boolean n() {
        return this.f51125y;
    }

    private int o() {
        return this.f51117q;
    }

    private int p() {
        return this.f51118r;
    }

    private int q() {
        return this.f51119s;
    }

    private int r() {
        return this.f51120t;
    }

    private boolean s() {
        return this.f51121u;
    }

    private boolean t() {
        return this.f51122v;
    }

    private boolean u() {
        return this.f51126z;
    }

    private java.lang.Object v() {
        return this.A;
    }

    private java.lang.String w() {
        java.lang.Object obj = this.A;
        return obj == null ? "" : obj.toString();
    }

    private com.tencent.tencentmap.mapsdk.maps.model.MarkerType x() {
        return this.B;
    }

    private java.lang.String y() {
        return this.C;
    }

    private com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle z() {
        return this.D;
    }

    private com.tencent.mapsdk.internal.qy b(boolean z17) {
        this.f51114n = z17;
        return this;
    }

    private com.tencent.mapsdk.internal.qy c(boolean z17) {
        this.f51116p = z17;
        return this;
    }

    private com.tencent.mapsdk.internal.qy d(boolean z17) {
        this.f51124x = z17;
        return this;
    }

    private com.tencent.mapsdk.internal.qy e(boolean z17) {
        this.f51125y = z17;
        return this;
    }

    private com.tencent.mapsdk.internal.qy f(boolean z17) {
        this.f51121u = z17;
        return this;
    }

    public final com.tencent.mapsdk.internal.qy a(java.lang.String str, android.graphics.Bitmap... bitmapArr) {
        this.f51123w = str;
        this.f51110j = bitmapArr;
        return this;
    }

    private com.tencent.mapsdk.internal.qy b(int i17) {
        this.f51119s = i17;
        return this;
    }

    private com.tencent.mapsdk.internal.qy c(int i17) {
        this.f51120t = i17;
        return this;
    }

    private com.tencent.mapsdk.internal.qy a(int i17, int i18) {
        this.f51117q = i17;
        this.f51118r = i18;
        return this;
    }

    private com.tencent.mapsdk.internal.qy g(boolean z17) {
        this.f51126z = z17;
        return this;
    }

    private com.tencent.mapsdk.internal.qy a(boolean z17) {
        this.f51122v = z17;
        return this;
    }

    private com.tencent.mapsdk.internal.qy a(int i17, int i18, int i19, int i27) {
        this.E = new android.graphics.Rect(i17, i18, i19, i27);
        return this;
    }

    public final java.lang.String a() {
        return this.f51123w;
    }

    private com.tencent.mapsdk.internal.qy a(float f17) {
        this.f51113m = f17;
        return this;
    }

    private com.tencent.mapsdk.internal.qy a(int... iArr) {
        if (iArr == null) {
            this.f51111k = 0.5f;
            this.f51112l = 1.0f;
            return this;
        }
        this.f51111k = 0.5f;
        this.f51112l = 0.5f;
        if (iArr.length != 1) {
            return this;
        }
        int i17 = iArr[0];
        if ((i17 & 256) == 256) {
            this.f51112l = 0.0f;
        } else if ((i17 & 16) == 16) {
            this.f51112l = 1.0f;
        }
        if ((i17 & 4096) == 4096) {
            this.f51111k = 0.0f;
        } else if ((i17 & 65536) == 65536) {
            this.f51111k = 1.0f;
        }
        return this;
    }

    public final com.tencent.mapsdk.internal.qy a(float f17, float f18) {
        this.f51111k = f17;
        this.f51112l = f18;
        return this;
    }

    private com.tencent.mapsdk.internal.qy a(int i17) {
        this.f51115o = i17;
        return this;
    }

    private com.tencent.mapsdk.internal.qy a(java.lang.Object obj) {
        this.A = obj;
        return this;
    }

    private com.tencent.mapsdk.internal.qy a(com.tencent.tencentmap.mapsdk.maps.model.MarkerType markerType) {
        if (markerType != null) {
            this.B = markerType;
        }
        return this;
    }

    private com.tencent.mapsdk.internal.qy a(java.lang.String str) {
        this.C = str;
        return this;
    }

    private com.tencent.mapsdk.internal.qy a(com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle markerTextStyle) {
        this.D = markerTextStyle;
        return this;
    }
}
