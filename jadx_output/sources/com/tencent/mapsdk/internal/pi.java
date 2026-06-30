package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class pi extends com.tencent.mapsdk.internal.pj implements com.tencent.mapsdk.internal.pj.a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f50596a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f50597b = 16;

    /* renamed from: c, reason: collision with root package name */
    public static final int f50598c = 256;

    /* renamed from: d, reason: collision with root package name */
    public static final int f50599d = 4096;

    /* renamed from: e, reason: collision with root package name */
    public static final int f50600e = 65536;
    public boolean A;
    public final java.util.concurrent.atomic.AtomicInteger B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public final com.tencent.mapsdk.internal.qx I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f50601J;
    private android.graphics.RectF Y;
    private int Z;

    /* renamed from: aa, reason: collision with root package name */
    private int f50602aa;

    /* renamed from: ab, reason: collision with root package name */
    private int f50603ab;

    /* renamed from: ac, reason: collision with root package name */
    private int f50604ac;

    /* renamed from: ad, reason: collision with root package name */
    private boolean f50605ad;

    /* renamed from: ae, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.MarkerType f50606ae;

    /* renamed from: af, reason: collision with root package name */
    private java.lang.String f50607af;

    /* renamed from: ag, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle f50608ag;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f50609f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f50610g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap[] f50611h;

    /* renamed from: i, reason: collision with root package name */
    public double f50612i;

    /* renamed from: j, reason: collision with root package name */
    public double f50613j;

    /* renamed from: k, reason: collision with root package name */
    public int f50614k;

    /* renamed from: l, reason: collision with root package name */
    public int f50615l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f50616m;

    /* renamed from: n, reason: collision with root package name */
    public float f50617n;

    /* renamed from: o, reason: collision with root package name */
    public float f50618o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f50619p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f50620q;

    /* renamed from: r, reason: collision with root package name */
    public float f50621r;

    /* renamed from: s, reason: collision with root package name */
    public float f50622s;

    /* renamed from: t, reason: collision with root package name */
    public float f50623t;

    /* renamed from: u, reason: collision with root package name */
    public float f50624u;

    /* renamed from: v, reason: collision with root package name */
    public float f50625v;

    /* renamed from: w, reason: collision with root package name */
    public float f50626w;

    /* renamed from: x, reason: collision with root package name */
    public float f50627x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f50628y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f50629z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pi(com.tencent.mapsdk.internal.qx r11, com.tencent.mapsdk.internal.qy r12) {
        /*
            r10 = this;
            java.lang.String r2 = r12.a()
            java.lang.Object r0 = r12.A
            if (r0 != 0) goto Lb
            java.lang.String r0 = ""
            goto Lf
        Lb:
            java.lang.String r0 = r0.toString()
        Lf:
            r3 = r0
            com.tencent.map.lib.models.GeoPoint r4 = r12.f51109i
            float r5 = r12.f51111k
            float r6 = r12.f51112l
            int r7 = r12.f51117q
            int r8 = r12.f51118r
            android.graphics.Bitmap[] r9 = r12.f51110j
            r0 = r10
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.pi.<init>(com.tencent.mapsdk.internal.qx, com.tencent.mapsdk.internal.qy):void");
    }

    private float A() {
        return this.f50621r;
    }

    private float B() {
        return this.f50622s;
    }

    private float C() {
        return this.f50623t;
    }

    private float D() {
        return this.f50624u;
    }

    private boolean E() {
        return this.f50605ad;
    }

    private int F() {
        return this.F;
    }

    private int G() {
        return this.G;
    }

    private boolean H() {
        return this.f50601J;
    }

    private com.tencent.tencentmap.mapsdk.maps.model.MarkerType I() {
        return this.f50606ae;
    }

    private java.lang.String J() {
        return this.f50607af;
    }

    private com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle K() {
        return this.f50608ag;
    }

    private void a(int i17, int i18) {
        if (this.Z == i17 && this.f50602aa == i18) {
            return;
        }
        this.Z = i17;
        this.f50602aa = i18;
        float f17 = this.f50614k / i17;
        float f18 = this.f50615l / i18;
        this.Y = new android.graphics.RectF(f17, -f18, 0.0f, -0.0f);
        float f19 = this.f50617n - f17;
        this.f50617n = f19;
        float f27 = this.f50618o - f18;
        this.f50618o = f27;
        int i19 = this.Z;
        float f28 = (-i19) * f19;
        this.f50621r = f28;
        this.f50622s = i19 + f28;
        int i27 = this.f50602aa;
        float f29 = i27 * f27;
        this.f50623t = f29;
        this.f50624u = f29 - i27;
    }

    private void c(int i17) {
        this.I.f50679m = i17;
    }

    private void e(boolean z17) {
        this.H = z17;
    }

    private void f(boolean z17) {
        this.f50628y = z17;
    }

    private double g() {
        return this.f50612i;
    }

    private double h() {
        return this.f50613j;
    }

    private boolean i() {
        return this.H;
    }

    private boolean j() {
        if (this.f50620q.get() > 0) {
            this.f50619p = true;
            this.f50620q.set(0);
        }
        return this.f50619p;
    }

    private boolean k() {
        if (this.B.get() > 0) {
            this.A = true;
            this.B.set(0);
        }
        return this.A;
    }

    private java.lang.String l() {
        return this.f50610g;
    }

    private int m() {
        return this.I.a();
    }

    private float n() {
        return this.f50617n;
    }

    private float o() {
        return this.f50618o;
    }

    private float p() {
        return this.f50625v;
    }

    private float q() {
        return this.f50626w;
    }

    private float r() {
        return this.f50627x;
    }

    private boolean s() {
        return this.f50628y;
    }

    private boolean t() {
        return this.C;
    }

    private boolean u() {
        return this.f50629z;
    }

    private boolean v() {
        return this.D;
    }

    private boolean w() {
        return this.E;
    }

    private android.graphics.RectF x() {
        return new android.graphics.RectF(this.Y);
    }

    private java.lang.String y() {
        return this.f50609f;
    }

    private java.lang.String z() {
        return this.f50616m;
    }

    @Override // com.tencent.mapsdk.internal.pj.a
    public final boolean b() {
        return true;
    }

    public final void d(boolean z17) {
        this.E = z17;
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50206g, "setAvoidMarker = ".concat(java.lang.String.valueOf(z17)));
        a(true);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.tencent.mapsdk.internal.pi) && this.I.a() == ((com.tencent.mapsdk.internal.pi) obj).I.a();
    }

    public final int hashCode() {
        return java.lang.String.valueOf(this.I.a()).hashCode() + com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX;
    }

    private void b(int i17, int i18) {
        this.f50614k = i17;
        this.f50615l = i18;
        a(true);
    }

    private void e(int i17) {
        this.F = i17;
    }

    private void f(int i17) {
        this.G = i17;
    }

    private void g(boolean z17) {
        this.C = z17;
    }

    private void h(boolean z17) {
        this.f50629z = z17;
        a(true);
    }

    private void i(boolean z17) {
        this.f50605ad = z17;
    }

    public final void c(boolean z17) {
        this.D = z17;
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50206g, "setAvoidPoi = ".concat(java.lang.String.valueOf(z17)));
        a(true);
    }

    public final boolean e() {
        return this.f50606ae == com.tencent.tencentmap.mapsdk.maps.model.MarkerType.TEXT_MARKER;
    }

    public final com.tencent.map.lib.models.MarkerInfo f() {
        int[] iArr;
        com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle markerTextStyle = this.f50608ag;
        if (markerTextStyle == null) {
            markerTextStyle = new com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle.Builder().build();
        }
        com.tencent.tencentmap.mapsdk.maps.model.MarkerTextPosition[] candidatePositions = markerTextStyle.getCandidatePositions();
        if (candidatePositions != null) {
            iArr = new int[candidatePositions.length];
            for (int i17 = 0; i17 < candidatePositions.length; i17++) {
                com.tencent.tencentmap.mapsdk.maps.model.MarkerTextPosition markerTextPosition = candidatePositions[i17];
                iArr[i17] = markerTextPosition != null ? markerTextPosition.getValue() : 0;
            }
        } else {
            iArr = new int[0];
        }
        com.tencent.tencentmap.mapsdk.maps.model.MarkerType markerType = this.f50606ae;
        return new com.tencent.map.lib.models.MarkerInfo(this.f50613j, this.f50612i, this.f50609f).anchor(this.f50617n, this.f50618o).rotation(this.f50604ac).alpha(this.f50625v).scale(this.f50626w, this.f50627x).interactive(true).avoidAnnotation(this.D).avoidOtherMarker(this.E).displayLevel(this.F).priority(this.G).forceLoad(this.C).visible(this.f50601J).markerType(markerType != null ? markerType.ordinal() : 0).text(this.f50607af).candidatePositions(iArr).textColor(markerTextStyle.getColor()).haloColor(markerTextStyle.getHaloColor()).fontSize(markerTextStyle.getFontSize()).haloSize(markerTextStyle.getHaloSize()).iconSpace(markerTextStyle.getIconSpace()).textEffect(markerTextStyle.getEffect()).hideWhenAvoidFailed(markerTextStyle.isHideWhenAvoidFailed());
    }

    private android.graphics.Bitmap d(int i17) {
        android.graphics.Bitmap[] bitmapArr = this.f50611h;
        if (bitmapArr == null) {
            return null;
        }
        if (i17 >= 0 && i17 < bitmapArr.length) {
            return bitmapArr[i17];
        }
        return bitmapArr[0];
    }

    private void j(boolean z17) {
        a(this.f50601J != z17);
        this.f50601J = z17;
    }

    public final void b(boolean z17) {
        if (z17) {
            this.B.incrementAndGet();
        }
        this.A = z17;
        if (z17) {
            return;
        }
        this.f50610g = this.f50609f;
    }

    @Override // com.tencent.mapsdk.internal.pj.a
    public final java.lang.String c() {
        return this.f50609f;
    }

    private void b(float f17, float f18) {
        this.f50626w = f17;
        this.f50627x = f18;
        a(true);
    }

    @Override // com.tencent.mapsdk.internal.pj.a
    public final synchronized android.graphics.Bitmap d() {
        return d(this.N);
    }

    private pi(com.tencent.mapsdk.internal.qx qxVar, java.lang.String str, java.lang.String str2, com.tencent.map.lib.models.GeoPoint geoPoint, float f17, float f18, int i17, int i18, android.graphics.Bitmap... bitmapArr) {
        this.f50603ab = 0;
        this.f50617n = 0.5f;
        this.f50618o = 0.5f;
        this.f50619p = false;
        this.f50620q = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f50621r = 0.0f;
        this.f50622s = 0.0f;
        this.f50623t = 0.0f;
        this.f50624u = 0.0f;
        this.f50625v = 1.0f;
        this.f50604ac = 0;
        this.f50626w = 1.0f;
        this.f50627x = 1.0f;
        this.f50628y = false;
        this.f50629z = true;
        this.A = false;
        this.B = new java.util.concurrent.atomic.AtomicInteger(0);
        this.C = true;
        this.D = false;
        this.E = false;
        this.f50605ad = true;
        this.H = false;
        this.f50606ae = com.tencent.tencentmap.mapsdk.maps.model.MarkerType.ICON_MARKER;
        this.I = qxVar;
        a(this);
        this.f50616m = str2;
        this.f50617n = f17;
        this.f50618o = f18;
        this.f50614k = i17;
        this.f50615l = i18;
        if (geoPoint != null) {
            this.f50612i = geoPoint.getLongitudeE6() / 1000000.0d;
            this.f50613j = geoPoint.getLatitudeE6() / 1000000.0d;
        }
        a(str, bitmapArr);
    }

    @Override // com.tencent.mapsdk.internal.pj
    public final synchronized void b(int i17) {
        this.f50603ab = i17;
        a(true);
        b(true);
        android.graphics.Bitmap d17 = d(i17);
        if (d17 != null) {
            int width = d17.getWidth();
            int height = d17.getHeight();
            if (this.Z != width || this.f50602aa != height) {
                a(width, height);
            }
        }
        super.b(i17);
    }

    private void a(com.tencent.map.lib.models.GeoPoint geoPoint) {
        if (geoPoint != null) {
            double d17 = this.f50628y ? 1.0d : 1000000.0d;
            this.f50612i = geoPoint.getLongitudeE6() / d17;
            this.f50613j = geoPoint.getLatitudeE6() / d17;
            a(true);
        }
    }

    public final void a(boolean z17) {
        if (z17) {
            this.f50620q.incrementAndGet();
        }
        this.f50619p = z17;
    }

    public final synchronized void a(java.lang.String str, android.graphics.Bitmap... bitmapArr) {
        if (bitmapArr == null) {
            return;
        }
        a(true);
        b(true);
        this.f50609f = str;
        this.f50611h = bitmapArr;
        int i17 = this.f50603ab;
        if (i17 < 0 || i17 >= bitmapArr.length) {
            this.f50603ab = 0;
        }
        android.graphics.Bitmap bitmap = bitmapArr[this.f50603ab];
        if (bitmap != null) {
            a(bitmap.getWidth(), bitmapArr[this.f50603ab].getHeight());
        }
    }

    public final void a(float f17, float f18) {
        this.f50617n = f17;
        this.f50618o = f18;
        a(this.Z, this.f50602aa);
        a(true);
    }

    public final void a(float f17) {
        this.f50625v = f17;
        a(true);
    }

    public final void a(int i17) {
        this.f50604ac = i17;
        a(true);
    }

    public final float a() {
        return this.f50605ad ? 360 - this.f50604ac : this.f50604ac;
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.MarkerType markerType) {
        if (markerType == null || this.f50606ae == markerType) {
            return;
        }
        this.f50606ae = markerType;
        a(true);
    }

    public final void a(java.lang.String str) {
        if (a(this.f50607af, str)) {
            return;
        }
        this.f50607af = str;
        a(true);
    }

    public final void a(com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle markerTextStyle) {
        if (this.f50608ag != markerTextStyle) {
            this.f50608ag = markerTextStyle;
            a(true);
        }
    }

    private static boolean a(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public final void a(com.tencent.mapsdk.internal.qy qyVar) {
        a(qyVar.f51113m);
        a(qyVar.f51111k, qyVar.f51112l);
        a(qyVar.f51115o);
        this.f50628y = qyVar.f51121u;
        this.C = qyVar.f51122v;
        c(qyVar.f51124x);
        d(qyVar.f51125y);
        this.f50605ad = qyVar.f51126z;
        this.f50629z = qyVar.f51114n;
        a(true);
        this.F = qyVar.f51120t;
        this.G = qyVar.f51119s;
        com.tencent.tencentmap.mapsdk.maps.model.MarkerType markerType = qyVar.B;
        if (markerType != null && this.f50606ae != markerType) {
            this.f50606ae = markerType;
            a(true);
        }
        a(qyVar.C);
        a(qyVar.D);
    }
}
