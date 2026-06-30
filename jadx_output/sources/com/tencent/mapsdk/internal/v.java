package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class v implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public int f52411d;

    /* renamed from: e, reason: collision with root package name */
    public double f52412e;

    /* renamed from: f, reason: collision with root package name */
    public double f52413f;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Rect f52421n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.ne f52422o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.tk f52423p;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mapsdk.internal.v.d f52425r;

    /* renamed from: g, reason: collision with root package name */
    public double f52414g = 0.0d;

    /* renamed from: h, reason: collision with root package name */
    public double f52415h = 1.0d;

    /* renamed from: i, reason: collision with root package name */
    public double f52416i = 0.0d;

    /* renamed from: j, reason: collision with root package name */
    public double f52417j = 1.0d;

    /* renamed from: k, reason: collision with root package name */
    public double f52418k = 0.0d;

    /* renamed from: l, reason: collision with root package name */
    public double f52419l = 1.0d;

    /* renamed from: s, reason: collision with root package name */
    public boolean f52426s = false;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List<com.tencent.mapsdk.internal.v.a> f52427t = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: a, reason: collision with root package name */
    public int f52408a = 0;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mapsdk.internal.v.b f52409b = new com.tencent.mapsdk.internal.v.b();

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Rect f52410c = new android.graphics.Rect();

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.map.lib.models.GeoPoint f52420m = new com.tencent.map.lib.models.GeoPoint();

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mapsdk.internal.fu f52424q = new com.tencent.mapsdk.internal.fu();

    /* renamed from: com.tencent.mapsdk.internal.v$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f52428a;

        static {
            int[] iArr = new int[com.tencent.mapsdk.internal.gf.a().length];
            f52428a = iArr;
            try {
                iArr[com.tencent.mapsdk.internal.gf.f49577c - 1] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
        }
    }

    /* loaded from: classes13.dex */
    public interface a {
        boolean a();

        boolean a(float f17, float f18);

        boolean b();
    }

    /* loaded from: classes13.dex */
    public static class b implements java.lang.Cloneable {

        /* renamed from: a, reason: collision with root package name */
        public static final int f52429a = 22;

        /* renamed from: b, reason: collision with root package name */
        public static final int f52430b = 20;

        /* renamed from: c, reason: collision with root package name */
        public static final int f52431c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f52432d = 19;

        /* renamed from: e, reason: collision with root package name */
        public static final int f52433e = 16;

        /* renamed from: f, reason: collision with root package name */
        public static final float f52434f = 4.0f;

        /* renamed from: g, reason: collision with root package name */
        public static final float f52435g = 3.0517578E-5f;

        /* renamed from: n, reason: collision with root package name */
        public static final int f52436n = 20;

        /* renamed from: o, reason: collision with root package name */
        public static final int f52437o = 1;

        /* renamed from: p, reason: collision with root package name */
        public static final float f52438p = 1.9073486E-6f;

        /* renamed from: l, reason: collision with root package name */
        public float f52443l;

        /* renamed from: m, reason: collision with root package name */
        public int f52444m;

        /* renamed from: i, reason: collision with root package name */
        public float f52440i = 4.0f;

        /* renamed from: h, reason: collision with root package name */
        public float f52439h = 3.0517578E-5f;

        /* renamed from: k, reason: collision with root package name */
        public int f52442k = 20;

        /* renamed from: j, reason: collision with root package name */
        public int f52441j = 3;

        public static float a(int i17) {
            return (1 << (i17 - 1)) * 1.9073486E-6f;
        }

        private int c() {
            return this.f52444m;
        }

        private int d() {
            return this.f52441j;
        }

        private int e() {
            return this.f52442k;
        }

        private static int f() {
            return 20;
        }

        private float g() {
            return this.f52439h;
        }

        public final java.lang.Object clone() {
            return super.clone();
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.tencent.mapsdk.internal.v.b)) {
                return false;
            }
            com.tencent.mapsdk.internal.v.b bVar = (com.tencent.mapsdk.internal.v.b) obj;
            return this.f52443l == bVar.f52443l && this.f52444m == bVar.f52444m;
        }

        public final int hashCode() {
            return toString().hashCode();
        }

        public final java.lang.String toString() {
            return "scale:" + this.f52443l + ", scaleLevel:" + this.f52444m;
        }

        private void a(float f17) {
            this.f52443l = f17;
        }

        private void b(float f17) {
            com.tencent.mapsdk.internal.v.b bVar = new com.tencent.mapsdk.internal.v.b();
            this.f52441j = bVar.f52444m;
            this.f52439h = f17 / bVar.a();
        }

        private void c(int i17) {
            this.f52441j = i17;
        }

        public final void a(int i17, float f17) {
            this.f52443l = f17;
            this.f52444m = i17;
        }

        private void a(com.tencent.mapsdk.internal.v.b bVar) {
            this.f52439h = bVar.f52439h;
            this.f52440i = bVar.f52440i;
            this.f52441j = bVar.f52441j;
            this.f52442k = bVar.f52442k;
            this.f52443l = bVar.f52443l;
            this.f52444m = bVar.f52444m;
        }

        private float b() {
            return this.f52443l;
        }

        private void b(int i17) {
            this.f52442k = i17;
        }

        public final float a() {
            return this.f52443l / a(this.f52444m);
        }
    }

    /* loaded from: classes13.dex */
    public static class c implements java.lang.Comparable<com.tencent.mapsdk.internal.v.c> {

        /* renamed from: a, reason: collision with root package name */
        public long f52445a;

        /* renamed from: b, reason: collision with root package name */
        public long f52446b;

        /* renamed from: c, reason: collision with root package name */
        public long f52447c;

        public c() {
        }

        private int a(com.tencent.mapsdk.internal.v.c cVar) {
            return (this.f52445a + "," + this.f52446b + "," + this.f52447c).compareTo(cVar.f52445a + "," + cVar.f52446b + "," + cVar.f52447c);
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(com.tencent.mapsdk.internal.v.c cVar) {
            com.tencent.mapsdk.internal.v.c cVar2 = cVar;
            return (this.f52445a + "," + this.f52446b + "," + this.f52447c).compareTo(cVar2.f52445a + "," + cVar2.f52446b + "," + cVar2.f52447c);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && com.tencent.mapsdk.internal.v.c.class == obj.getClass()) {
                com.tencent.mapsdk.internal.v.c cVar = (com.tencent.mapsdk.internal.v.c) obj;
                if (this.f52445a == cVar.f52445a && this.f52446b == cVar.f52446b && this.f52447c == cVar.f52447c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return java.util.Objects.hash(java.lang.Long.valueOf(this.f52445a), java.lang.Long.valueOf(this.f52446b), java.lang.Long.valueOf(this.f52447c));
        }

        public final java.lang.String toString() {
            return "MapTile{x=" + this.f52445a + ", y=" + this.f52446b + ", z=" + this.f52447c + '}';
        }

        public c(long j17, long j18, long j19) {
            this.f52445a = j17;
            this.f52446b = j18;
            this.f52447c = j19;
        }
    }

    public v(com.tencent.mapsdk.internal.ne neVar) {
        this.f52422o = neVar;
        this.f52423p = neVar.f50506f;
    }

    private com.tencent.mapsdk.internal.v.d A() {
        return this.f52425r;
    }

    private static byte[] B() {
        return null;
    }

    private void a(com.tencent.mapsdk.internal.v vVar) {
        this.f52408a = vVar.f52408a;
        com.tencent.mapsdk.internal.v.b bVar = this.f52409b;
        com.tencent.mapsdk.internal.v.b bVar2 = vVar.f52409b;
        bVar.f52439h = bVar2.f52439h;
        bVar.f52440i = bVar2.f52440i;
        bVar.f52441j = bVar2.f52441j;
        bVar.f52442k = bVar2.f52442k;
        bVar.f52443l = bVar2.f52443l;
        bVar.f52444m = bVar2.f52444m;
        this.f52410c.set(vVar.f52410c);
        this.f52411d = vVar.f52411d;
        this.f52412e = vVar.f52412e;
        this.f52413f = vVar.f52413f;
        this.f52414g = vVar.f52414g;
        this.f52415h = vVar.f52415h;
        this.f52416i = vVar.f52416i;
        this.f52417j = vVar.f52417j;
        this.f52418k = vVar.f52418k;
        this.f52419l = vVar.f52419l;
        this.f52420m.setGeoPoint(vVar.f52420m);
        com.tencent.mapsdk.internal.fu fuVar = this.f52424q;
        com.tencent.mapsdk.internal.fu fuVar2 = vVar.f52424q;
        fuVar.a(fuVar2.f49467a, fuVar2.f49468b);
        this.f52421n = vVar.f52421n;
    }

    public static boolean b(int i17) {
        return i17 == 8 || i17 == 13 || i17 == 10;
    }

    private int c() {
        com.tencent.mapsdk.internal.tk tkVar = this.f52423p;
        if (tkVar == null) {
            return this.f52408a;
        }
        return tkVar.u();
    }

    private float d() {
        return this.f52423p.s();
    }

    private double e() {
        return this.f52414g;
    }

    public static float f(float f17) {
        if (f17 < 16.0f) {
            return 40.0f;
        }
        if (f17 >= 16.0f && f17 < 17.0f) {
            return ((f17 - 16.0f) * 10.0f) + 40.0f;
        }
        if (f17 >= 17.0f && f17 < 18.0f) {
            return ((f17 - 17.0f) * 10.0f) + 50.0f;
        }
        if (f17 < 18.0f || f17 >= 19.0f) {
            return 75.0f;
        }
        return ((f17 - 18.0f) * 15.0f) + 60.0f;
    }

    private double g() {
        return this.f52416i;
    }

    private double h() {
        return this.f52417j;
    }

    private double i() {
        return this.f52419l;
    }

    private double j() {
        return this.f52418k;
    }

    private float k() {
        return this.f52423p.r();
    }

    private java.util.List<com.tencent.mapsdk.internal.v.a> l() {
        return this.f52427t;
    }

    private void m() {
        this.f52427t.clear();
    }

    private int n() {
        return this.f52411d;
    }

    private double o() {
        return this.f52412e;
    }

    private double p() {
        return this.f52413f;
    }

    private float q() {
        return this.f52409b.f52443l;
    }

    private int r() {
        return this.f52409b.f52444m;
    }

    private float s() {
        return this.f52409b.a();
    }

    private int t() {
        return this.f52409b.f52441j;
    }

    private int u() {
        return this.f52409b.f52442k;
    }

    private static int v() {
        return 20;
    }

    private float w() {
        return this.f52409b.f52439h;
    }

    private com.tencent.map.lib.models.GeoPoint x() {
        return this.f52420m;
    }

    private android.graphics.Rect y() {
        return this.f52421n;
    }

    private com.tencent.mapsdk.internal.fu z() {
        return this.f52424q;
    }

    public final java.lang.Object clone() {
        com.tencent.mapsdk.internal.v vVar = (com.tencent.mapsdk.internal.v) super.clone();
        vVar.f52410c = new android.graphics.Rect(this.f52410c);
        vVar.f52409b = (com.tencent.mapsdk.internal.v.b) this.f52409b.clone();
        vVar.f52420m = new com.tencent.map.lib.models.GeoPoint(this.f52420m);
        com.tencent.mapsdk.internal.fu fuVar = this.f52424q;
        vVar.f52424q = new com.tencent.mapsdk.internal.fu(fuVar.f49467a, fuVar.f49468b);
        return vVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mapsdk.internal.v)) {
            return false;
        }
        com.tencent.mapsdk.internal.v vVar = (com.tencent.mapsdk.internal.v) obj;
        return vVar.f52420m.equals(this.f52420m) && vVar.f52409b.equals(this.f52409b) && vVar.f52408a == this.f52408a;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mapParam: ");
        sb6.append("center:" + this.f52420m.toString() + " ");
        sb6.append("mode:" + this.f52408a + " ");
        sb6.append("mapScale:" + this.f52409b.toString() + " ");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("screenRect:");
        android.graphics.Rect rect = this.f52421n;
        sb7.append(rect != null ? rect.toString() : "null");
        sb7.append(" ");
        sb6.append(sb7.toString());
        return sb6.toString();
    }

    /* loaded from: classes13.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public float f52448a;

        /* renamed from: b, reason: collision with root package name */
        public float f52449b;

        public d(float f17, float f18) {
            this.f52448a = f17;
            this.f52449b = f18;
        }

        private void a(float f17, float f18) {
            this.f52448a = f17;
            this.f52449b = f18;
        }

        private float b() {
            return this.f52449b;
        }

        private float a() {
            return this.f52448a;
        }
    }

    private void b() {
        if (this.f52422o == null) {
            return;
        }
        this.f52420m = this.f52423p.o();
        int q17 = this.f52423p.q();
        float p17 = this.f52423p.p();
        com.tencent.mapsdk.internal.v.b bVar = this.f52409b;
        if (q17 != bVar.f52444m) {
            this.f52422o.f50508h.c(com.tencent.mapsdk.internal.gf.f49577c);
        } else if (p17 != bVar.f52443l) {
            this.f52422o.f50508h.c(com.tencent.mapsdk.internal.gf.f49576b);
        }
        if (this.f52409b != null) {
            float d17 = d(p17);
            if (d17 < a()) {
                float f17 = f(d17);
                if (this.f52423p.r() > f17) {
                    b(f17);
                }
            }
            this.f52409b.a(q17, p17);
        }
    }

    public static float d(float f17) {
        return ((float) (java.lang.Math.log(f17) / java.lang.Math.log(2.0d))) + 20.0f;
    }

    private double f() {
        return this.f52415h;
    }

    private int g(float f17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f52423p;
        if (tkVar != null) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass195(f17));
        }
        this.f52409b.f52443l = f17;
        return com.tencent.mapsdk.internal.gf.f49577c;
    }

    private void h(float f17) {
        float d17 = d(f17);
        if (d17 >= a()) {
            return;
        }
        float f18 = f(d17);
        if (this.f52423p.r() <= f18) {
            return;
        }
        b(f18);
    }

    private void i(float f17) {
        if (this.f52426s) {
            com.tencent.tencentmap.mapsdk.maps.MapParamConstants.MAX_SKEW_ANGLE = f(f17);
        } else {
            com.tencent.tencentmap.mapsdk.maps.MapParamConstants.MAX_SKEW_ANGLE = 40.0f;
        }
    }

    public final void e(int i17) {
        this.f52409b.f52441j = i17;
    }

    private void f(int i17) {
        double d17 = (1 << i17) * 256;
        this.f52411d = (int) d17;
        this.f52412e = d17 / 360.0d;
        this.f52413f = d17 / 6.283185307179586d;
    }

    public final void d(int i17) {
        this.f52409b.f52442k = i17;
    }

    public final int c(float f17) {
        int i17;
        float f18;
        com.tencent.mapsdk.internal.ne neVar;
        int i18 = com.tencent.mapsdk.internal.gf.f49575a;
        com.tencent.mapsdk.internal.v.b bVar = this.f52409b;
        float f19 = bVar.f52443l;
        int i19 = bVar.f52444m;
        java.util.Iterator<com.tencent.mapsdk.internal.v.a> it = this.f52427t.iterator();
        while (it.hasNext()) {
            if (it.next().a(f17, f19)) {
                return i18;
            }
        }
        com.tencent.mapsdk.internal.tk tkVar = this.f52423p;
        if (tkVar != null) {
            double d17 = f17;
            if (0 != tkVar.f51661e && (neVar = tkVar.f51666j) != null) {
                neVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass193(d17));
            }
            f18 = this.f52423p.p();
            i17 = this.f52423p.q();
        } else {
            i17 = i19;
            f18 = f19;
        }
        this.f52409b.a(i17, f18);
        if (i17 != i19) {
            i18 = com.tencent.mapsdk.internal.gf.f49577c;
        } else if (f18 != f19) {
            i18 = com.tencent.mapsdk.internal.gf.f49576b;
        }
        if (com.tencent.mapsdk.internal.v.AnonymousClass1.f52428a[i18 - 1] == 1) {
            double d18 = (1 << this.f52409b.f52444m) * 256;
            this.f52411d = (int) d18;
            this.f52412e = d18 / 360.0d;
            this.f52413f = d18 / 6.283185307179586d;
        }
        com.tencent.mapsdk.internal.fu a17 = com.tencent.mapsdk.internal.y.a(this, this.f52420m);
        this.f52424q.a(a17.f49467a, a17.f49468b);
        return i18;
    }

    public final void e(float f17) {
        com.tencent.mapsdk.internal.v.b bVar = this.f52409b;
        com.tencent.mapsdk.internal.v.b bVar2 = new com.tencent.mapsdk.internal.v.b();
        bVar.f52441j = bVar2.f52444m;
        bVar.f52439h = f17 / bVar2.a();
    }

    private static float g(int i17) {
        return com.tencent.mapsdk.internal.v.b.a(i17);
    }

    private void a(android.graphics.Rect rect, int i17, int i18) {
        this.f52421n = rect;
        this.f52410c = com.tencent.tencentmap.mapsdk.maps.model.GeometryConstants.BOUNDARY_WORLD;
        c(13);
        a(0);
        a(i17, i18, false);
    }

    public final float b(float f17) {
        if (this.f52423p.r() == f17) {
            return f17;
        }
        i(a());
        float max = java.lang.Math.max(0.0f, java.lang.Math.min(com.tencent.tencentmap.mapsdk.maps.MapParamConstants.MAX_SKEW_ANGLE, f17));
        double radians = java.lang.Math.toRadians(f17);
        this.f52416i = java.lang.Math.sin(radians);
        this.f52417j = java.lang.Math.cos(radians);
        double d17 = 1.5707963267948966d - radians;
        this.f52419l = java.lang.Math.cos(d17);
        this.f52418k = java.lang.Math.sin(d17);
        this.f52423p.b(max);
        return max;
    }

    public final boolean a(int i17) {
        int u17;
        com.tencent.mapsdk.internal.tk tkVar = this.f52423p;
        if (tkVar == null || (u17 = tkVar.u()) == i17) {
            return false;
        }
        if (u17 == 11) {
            this.f52422o.b(false);
        }
        if (i17 == 11) {
            this.f52422o.b(true);
        }
        this.f52408a = i17;
        this.f52423p.e(i17);
        this.f52423p.e(b(i17));
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50206g, "setMapStyle : styleId[" + i17 + "]");
        com.tencent.mapsdk.internal.ne neVar = this.f52422o;
        if (neVar.f50517q) {
            neVar.K();
        }
        return true;
    }

    public final boolean c(int i17) {
        return c(com.tencent.mapsdk.internal.v.b.a(i17)) == com.tencent.mapsdk.internal.gf.f49577c;
    }

    private void b(com.tencent.mapsdk.internal.v.a aVar) {
        if (aVar != null) {
            this.f52427t.remove(aVar);
        }
    }

    private boolean b(com.tencent.map.lib.models.GeoPoint geoPoint) {
        int i17;
        int i18;
        int latitudeE6 = geoPoint.getLatitudeE6();
        int longitudeE6 = geoPoint.getLongitudeE6();
        int i19 = 1 << (20 - this.f52409b.f52444m);
        if (131072 > i19) {
            i17 = ((this.f52421n.width() * 131072) - (this.f52421n.width() * i19)) / 2;
            i18 = ((this.f52421n.height() * 131072) - (this.f52421n.height() * i19)) / 2;
        } else {
            i17 = 0;
            i18 = 0;
        }
        android.graphics.Rect rect = this.f52410c;
        int i27 = rect.left - i17;
        int i28 = rect.right + i17;
        int i29 = rect.top - i18;
        int i37 = rect.bottom + i18;
        if (latitudeE6 < i29) {
            latitudeE6 = i29;
        }
        if (latitudeE6 <= i37) {
            i37 = latitudeE6;
        }
        if (longitudeE6 < i27) {
            longitudeE6 = i27;
        }
        if (longitudeE6 <= i28) {
            i28 = longitudeE6;
        }
        com.tencent.map.lib.models.GeoPoint geoPoint2 = new com.tencent.map.lib.models.GeoPoint(i37, i28);
        com.tencent.mapsdk.internal.tk tkVar = this.f52423p;
        tkVar.f51666j.a(new com.tencent.mapsdk.internal.tk.AnonymousClass190(geoPoint2));
        return true;
    }

    public final float a(float f17) {
        if (this.f52423p.s() == f17) {
            return f17;
        }
        float f18 = f17 % 360.0f;
        double radians = java.lang.Math.toRadians(f17);
        this.f52414g = java.lang.Math.sin(radians);
        this.f52415h = java.lang.Math.cos(radians);
        com.tencent.mapsdk.internal.tk tkVar = this.f52423p;
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass15(f18));
        return f18;
    }

    public final void a(com.tencent.mapsdk.internal.v.a aVar) {
        if (this.f52427t.contains(aVar)) {
            return;
        }
        this.f52427t.add(aVar);
    }

    private boolean b(int i17, int i18) {
        int i19;
        int i27;
        int i28 = 1 << (20 - this.f52409b.f52444m);
        if (131072 > i28) {
            i19 = ((this.f52421n.width() * 131072) - (this.f52421n.width() * i28)) / 2;
            i27 = ((this.f52421n.height() * 131072) - (this.f52421n.height() * i28)) / 2;
        } else {
            i19 = 0;
            i27 = 0;
        }
        android.graphics.Rect rect = this.f52410c;
        int i29 = rect.left - i19;
        int i37 = rect.right + i19;
        int i38 = rect.top - i27;
        int i39 = rect.bottom + i27;
        if (i17 < i38) {
            i17 = i38;
        }
        if (i17 <= i39) {
            i39 = i17;
        }
        if (i18 < i29) {
            i18 = i29;
        }
        if (i18 <= i37) {
            i37 = i18;
        }
        com.tencent.map.lib.models.GeoPoint geoPoint = new com.tencent.map.lib.models.GeoPoint(i39, i37);
        com.tencent.mapsdk.internal.tk tkVar = this.f52423p;
        tkVar.f51666j.a(new com.tencent.mapsdk.internal.tk.AnonymousClass190(geoPoint));
        return true;
    }

    public final float a() {
        return d(this.f52409b.f52443l);
    }

    public final void a(android.graphics.Rect rect) {
        this.f52410c.set(rect);
    }

    private boolean a(com.tencent.map.lib.models.GeoPoint geoPoint) {
        return a(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6(), true);
    }

    private boolean a(int i17, int i18) {
        return a(i17, i18, false);
    }

    private void a(double d17, double d18) {
        this.f52424q.a(d17, d18);
    }

    public final boolean a(float f17, float f18, boolean z17) {
        com.tencent.mapsdk.internal.v.d dVar = this.f52425r;
        if (dVar == null) {
            this.f52425r = new com.tencent.mapsdk.internal.v.d(f17, f18);
        } else {
            dVar.f52448a = f17;
            dVar.f52449b = f18;
        }
        this.f52422o.a(f17, f18, z17);
        return true;
    }

    private void a(boolean z17) {
        this.f52426s = z17;
    }

    public final boolean a(int i17, int i18, boolean z17) {
        int i19;
        int i27;
        int i28 = this.f52409b.f52444m;
        boolean z18 = true;
        int i29 = (1 << (20 - i28)) < 0 ? 0 : 20 - i28;
        if (131072 > i29) {
            i19 = ((this.f52421n.width() * 131072) - (this.f52421n.width() * i29)) / 2;
            i27 = ((this.f52421n.height() * 131072) - (this.f52421n.height() * i29)) / 2;
        } else {
            i19 = 0;
            i27 = 0;
        }
        android.graphics.Rect rect = this.f52410c;
        int i37 = rect.left - i19;
        int i38 = rect.right + i19;
        int i39 = rect.top - i27;
        int i47 = rect.bottom + i27;
        if (i17 < i39) {
            i17 = i39;
        }
        if (i17 <= i47) {
            i47 = i17;
        }
        if (i18 < i37) {
            i18 = i37;
        }
        if (i18 <= i38) {
            i38 = i18;
        }
        if (i47 == this.f52420m.getLatitudeE6() && i38 == this.f52420m.getLongitudeE6()) {
            z18 = false;
        }
        this.f52420m.setLatitudeE6(i47);
        this.f52420m.setLongitudeE6(i38);
        com.tencent.mapsdk.internal.fu a17 = com.tencent.mapsdk.internal.y.a(this, this.f52420m);
        a(a17.f49467a, a17.f49468b);
        this.f52423p.a(this.f52420m, z17);
        return z18;
    }
}
