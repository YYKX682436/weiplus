package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class y extends com.tencent.mapsdk.internal.gg implements com.tencent.mapsdk.internal.ey {

    /* renamed from: a, reason: collision with root package name */
    public static final int f52462a = 268435456;

    /* renamed from: e, reason: collision with root package name */
    private static final int f52463e = 19;

    /* renamed from: f, reason: collision with root package name */
    private static final int f52464f = 14;

    /* renamed from: b, reason: collision with root package name */
    protected com.tencent.mapsdk.internal.v f52465b;

    /* renamed from: c, reason: collision with root package name */
    protected com.tencent.mapsdk.internal.ne f52466c;

    /* renamed from: g, reason: collision with root package name */
    private com.tencent.mapsdk.internal.tk f52467g;

    public y(com.tencent.mapsdk.internal.bd bdVar) {
        super(4.007501668E7d);
        this.f52467g = bdVar.i();
        this.f52465b = bdVar.h();
        this.f52466c = (com.tencent.mapsdk.internal.ne) bdVar;
    }

    private void a(com.tencent.mapsdk.internal.v vVar) {
        this.f52465b = vVar;
    }

    private com.tencent.mapsdk.internal.v b() {
        return this.f52465b;
    }

    private com.tencent.mapsdk.internal.fu c(com.tencent.mapsdk.internal.fu fuVar) {
        if (fuVar == null) {
            return null;
        }
        com.tencent.mapsdk.internal.fu fuVar2 = this.f52465b.f52424q;
        return new com.tencent.mapsdk.internal.fu((r0.f52421n.width() / 2) + (fuVar.f49467a - fuVar2.f49467a), (this.f52465b.f52421n.height() / 2) - (fuVar.f49468b - fuVar2.f49468b));
    }

    private boolean d() {
        com.tencent.mapsdk.internal.v.d dVar = this.f52465b.f52425r;
        if (dVar == null) {
            return false;
        }
        return ((double) java.lang.Math.abs(dVar.f52448a)) > 0.25d || ((double) java.lang.Math.abs(dVar.f52449b)) > 0.25d;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng fromScreenLocation(android.graphics.Point point) {
        return a(new com.tencent.mapsdk.internal.fu(point.x, point.y)).toLatLng();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion getVisibleRegion() {
        com.tencent.mapsdk.internal.ne neVar = this.f52466c;
        com.tencent.mapsdk.internal.tr trVar = (com.tencent.mapsdk.internal.tr) neVar.f48999b;
        float t17 = neVar.f50506f.t();
        int height = this.f52465b.f52421n.height();
        android.graphics.Point point = new android.graphics.Point(0, trVar.f52180aa);
        android.graphics.Point point2 = new android.graphics.Point(trVar.Z, trVar.f52180aa);
        double d17 = height - t17;
        com.tencent.mapsdk.internal.fu fuVar = new com.tencent.mapsdk.internal.fu(0.0d, d17);
        com.tencent.mapsdk.internal.fu fuVar2 = new com.tencent.mapsdk.internal.fu(trVar.Z, d17);
        com.tencent.tencentmap.mapsdk.maps.model.LatLng fromScreenLocation = fromScreenLocation(point);
        com.tencent.tencentmap.mapsdk.maps.model.LatLng fromScreenLocation2 = fromScreenLocation(point2);
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = a(fuVar).toLatLng();
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2 = a(fuVar2).toLatLng();
        return new com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion(fromScreenLocation, fromScreenLocation2, latLng, latLng2, com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.builder().include(fromScreenLocation).include(fromScreenLocation2).include(latLng).include(latLng2).build());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final float[] glModelMatrix(android.graphics.PointF pointF, float f17) {
        if (pointF == null) {
            return null;
        }
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        float[] nativeGLProjectMatrix = this.f52467g.f51660d.nativeGLProjectMatrix();
        float[] z17 = this.f52467g.z();
        com.tencent.map.lib.models.GeoPoint o17 = this.f52467g.o();
        android.opengl.Matrix.multiplyMM(fArr, 0, nativeGLProjectMatrix, 0, z17, 0);
        android.graphics.PointF a17 = a(com.tencent.mapsdk.internal.kr.a(o17));
        android.opengl.Matrix.translateM(fArr, 0, pointF.x - a17.x, a17.y - pointF.y, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, f17, f17, f17);
        return fArr;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final float glPixelRatio() {
        return this.f52467g.f51660d.nativeGLViewScaleRatio();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final float[] glProjectionMatrix() {
        return this.f52467g.f51660d.nativeGLProjectMatrix();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final android.graphics.PointF glVertexForCoordinate(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        return a(latLng);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final float[] glViewMatrix() {
        return this.f52467g.z();
    }

    @Override // com.tencent.mapsdk.internal.ey, com.tencent.tencentmap.mapsdk.maps.Projection
    public final double metersPerPixel(double d17) {
        return metersPerPixel(d17, this.f52465b.a());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final android.graphics.Point toScreenLocation(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        android.graphics.Rect rect;
        android.graphics.PointF a17 = this.f52467g.a(latLng.latitude, latLng.longitude);
        float f17 = a17.x;
        float f18 = a17.y;
        com.tencent.mapsdk.internal.ne neVar = this.f52466c;
        if (neVar != null && (rect = neVar.C) != null) {
            f17 += rect.left;
            f18 += rect.top;
        }
        com.tencent.mapsdk.internal.fu fuVar = new com.tencent.mapsdk.internal.fu(f17, f18);
        android.graphics.Point point = new android.graphics.Point();
        point.x = (int) java.lang.Math.round(fuVar.f49467a);
        point.y = (int) java.lang.Math.round(fuVar.f49468b);
        return point;
    }

    public static com.tencent.mapsdk.internal.gc b(com.tencent.map.lib.models.GeoPoint geoPoint) {
        if (geoPoint == null) {
            return null;
        }
        return new com.tencent.mapsdk.internal.gc(((geoPoint.getLongitudeE6() / 1000000.0d) * 2.003750834E7d) / 180.0d, ((java.lang.Math.log(java.lang.Math.tan((((geoPoint.getLatitudeE6() / 1000000.0d) + 90.0d) * 3.141592653589793d) / 360.0d)) / 0.017453292519943295d) * 2.003750834E7d) / 180.0d);
    }

    @Override // com.tencent.mapsdk.internal.ey
    public final com.tencent.map.lib.models.GeoPoint a(com.tencent.mapsdk.internal.fu fuVar) {
        android.graphics.Rect rect;
        if (fuVar == null) {
            return null;
        }
        android.graphics.Rect rect2 = this.f52465b.f52421n;
        int height = rect2.height();
        float t17 = this.f52467g.t();
        if (java.lang.String.valueOf(t17).equals("960.0")) {
            t17 = height;
        }
        double d17 = fuVar.f49468b;
        if (d17 >= rect2.top && d17 < (r1 + height) - t17) {
            d17 = (r1 + height) - t17;
        }
        float f17 = (float) fuVar.f49467a;
        float f18 = (float) d17;
        com.tencent.mapsdk.internal.ne neVar = this.f52466c;
        if (neVar != null && (rect = neVar.C) != null) {
            f17 -= rect.left;
            f18 -= rect.top;
        }
        com.tencent.mapsdk.internal.tk tkVar = this.f52467g;
        return (com.tencent.map.lib.models.GeoPoint) tkVar.b((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass114>) new com.tencent.mapsdk.internal.tk.AnonymousClass114(null, f17, f18), (com.tencent.mapsdk.internal.tk.AnonymousClass114) new com.tencent.map.lib.models.GeoPoint());
    }

    @Override // com.tencent.mapsdk.internal.ey, com.tencent.tencentmap.mapsdk.maps.Projection
    public final double metersPerPixel(double d17, double d18) {
        if (d18 >= 0.0d) {
            return (4.0076E7d / ((java.lang.Math.pow(2.0d, d18) * 256.0d) * com.tencent.mapsdk.internal.hn.o())) * java.lang.Math.cos((d17 * 3.141592653589793d) / 180.0d);
        }
        return 0.0d;
    }

    private static com.tencent.tencentmap.mapsdk.maps.model.LatLng b(com.tencent.mapsdk.internal.gc gcVar) {
        if (gcVar == null) {
            return null;
        }
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(((java.lang.Math.atan(java.lang.Math.exp((((gcVar.y() / 2.003750834E7d) * 180.0d) * 3.141592653589793d) / 180.0d)) * 2.0d) - 1.5707963267948966d) * 57.29577951308232d, (gcVar.x() / 2.003750834E7d) * 180.0d);
    }

    private void b(float f17) {
        this.f52465b.a(f17);
    }

    public static com.tencent.mapsdk.internal.v.c c(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        com.tencent.mapsdk.internal.gc b17 = b(new com.tencent.map.lib.models.GeoPoint(latLng));
        com.tencent.mapsdk.internal.v.c cVar = new com.tencent.mapsdk.internal.v.c();
        cVar.f52445a = java.lang.Math.round(java.lang.Math.floor(b17.x() / 9783.939619140625d));
        cVar.f52446b = java.lang.Math.round(java.lang.Math.floor(b17.y() / 9783.939619140625d));
        cVar.f52447c = 12L;
        return cVar;
    }

    @Override // com.tencent.mapsdk.internal.ey
    public final com.tencent.mapsdk.internal.gc b(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return b(com.tencent.map.lib.models.GeoPoint.from(latLng));
    }

    public static /* synthetic */ boolean b(com.tencent.mapsdk.internal.y yVar) {
        com.tencent.mapsdk.internal.v.d dVar = yVar.f52465b.f52425r;
        if (dVar != null) {
            return ((double) java.lang.Math.abs(dVar.f52448a)) > 0.25d || ((double) java.lang.Math.abs(dVar.f52449b)) > 0.25d;
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.ey
    public final com.tencent.mapsdk.internal.fu a(com.tencent.map.lib.models.GeoPoint geoPoint) {
        android.graphics.Rect rect;
        if (geoPoint == null) {
            return null;
        }
        android.graphics.PointF a17 = this.f52467g.a(geoPoint.getLatitudeE6() / 1000000.0d, geoPoint.getLongitudeE6() / 1000000.0d);
        float f17 = a17.x;
        float f18 = a17.y;
        com.tencent.mapsdk.internal.ne neVar = this.f52466c;
        if (neVar != null && (rect = neVar.C) != null) {
            f17 += rect.left;
            f18 += rect.top;
        }
        return new com.tencent.mapsdk.internal.fu(f17, f18);
    }

    public final void c(com.tencent.map.lib.models.GeoPoint geoPoint) {
        int i17;
        int i18;
        com.tencent.mapsdk.internal.v vVar = this.f52465b;
        int latitudeE6 = geoPoint.getLatitudeE6();
        int longitudeE6 = geoPoint.getLongitudeE6();
        int i19 = 1 << (20 - vVar.f52409b.f52444m);
        if (131072 > i19) {
            i17 = ((vVar.f52421n.width() * 131072) - (vVar.f52421n.width() * i19)) / 2;
            i18 = ((vVar.f52421n.height() * 131072) - (vVar.f52421n.height() * i19)) / 2;
        } else {
            i17 = 0;
            i18 = 0;
        }
        android.graphics.Rect rect = vVar.f52410c;
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
        com.tencent.mapsdk.internal.tk tkVar = vVar.f52423p;
        tkVar.f51666j.a(new com.tencent.mapsdk.internal.tk.AnonymousClass190(geoPoint2));
    }

    @Override // com.tencent.mapsdk.internal.ey
    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng a(android.graphics.PointF pointF) {
        android.graphics.PointF pointF2;
        float s17 = this.f52466c.f50520t.f52423p.s();
        android.graphics.Rect rect = this.f52465b.f52421n;
        float width = rect.width();
        float height = rect.height();
        com.tencent.map.lib.models.GeoPoint geoPoint = this.f52465b.f52420m;
        if (geoPoint == null) {
            return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(0.0d, 0.0d);
        }
        com.tencent.mapsdk.internal.fu d17 = d(com.tencent.mapsdk.internal.kr.a(geoPoint));
        com.tencent.mapsdk.internal.v.d dVar = this.f52465b.f52425r;
        if (dVar == null) {
            pointF2 = new android.graphics.PointF(width / 2.0f, height / 2.0f);
        } else {
            pointF2 = new android.graphics.PointF((dVar.f52448a + 0.5f) * width, (dVar.f52449b + 0.5f) * height);
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRotate(-s17);
        if (dVar == null) {
            matrix.preTranslate(width * (-0.5f), (-0.5f) * height);
            matrix.postTranslate(width * 0.5f, height * 0.5f);
        } else {
            matrix.preTranslate(((-0.5f) - dVar.f52448a) * width, ((-0.5f) - dVar.f52449b) * height);
            matrix.postTranslate((dVar.f52448a + 0.5f) * width, (dVar.f52449b + 0.5f) * height);
        }
        matrix.mapPoints(new float[2], new float[]{pointF.x, pointF.y});
        double o17 = (2.003750834E7d / ((1 << this.f52465b.f52409b.f52444m) * 256)) * com.tencent.mapsdk.internal.hn.o();
        return b(new com.tencent.mapsdk.internal.fu(d17.f49467a + ((r1[0] - pointF2.x) * o17), d17.f49468b + ((r1[1] - pointF2.y) * o17)));
    }

    private boolean c() {
        com.tencent.mapsdk.internal.v.d dVar = this.f52465b.f52425r;
        if (dVar == null) {
            return false;
        }
        return (dVar.f52448a == 0.0f && dVar.f52449b == 0.0f) ? false : true;
    }

    @Override // com.tencent.mapsdk.internal.ey
    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng[] a() {
        android.graphics.Rect rect = this.f52466c.f50515o;
        float width = rect.width();
        float height = rect.height();
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng[]{this.f52466c.f50513m.a(new android.graphics.PointF(0.0f, 0.0f)), this.f52466c.f50513m.a(new android.graphics.PointF(width, 0.0f)), this.f52466c.f50513m.a(new android.graphics.PointF(width, height)), this.f52466c.f50513m.a(new android.graphics.PointF(0.0f, height))};
    }

    @Override // com.tencent.mapsdk.internal.ey
    public final double a(android.graphics.Point point, android.graphics.Point point2) {
        com.tencent.map.lib.models.GeoPoint a17 = a(new com.tencent.mapsdk.internal.fu(point.x, point.y));
        com.tencent.map.lib.models.GeoPoint a18 = a(new com.tencent.mapsdk.internal.fu(point2.x, point2.y));
        android.location.Location.distanceBetween(a17.getLatitudeE6() / 1000000.0d, a17.getLongitudeE6() / 1000000.0d, a18.getLatitudeE6() / 1000000.0d, a18.getLongitudeE6() / 1000000.0d, new float[1]);
        return r2[0] / ((int) java.lang.Math.sqrt(java.lang.Math.pow(point.x - point2.x, 2.0d) + java.lang.Math.pow(point.y - point2.y, 2.0d)));
    }

    @Override // com.tencent.mapsdk.internal.ey
    public final android.graphics.PointF a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        double d17 = (latLng.longitude / 360.0d) + 0.5d;
        double sin = java.lang.Math.sin(java.lang.Math.toRadians(latLng.latitude));
        return new android.graphics.PointF((float) (d17 * 2.68435456E8d), (float) ((((java.lang.Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d) * 2.68435456E8d));
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.LatLng[] a(com.tencent.mapsdk.internal.v.c cVar) {
        double d17 = 4.007501668E7d / (1 << ((int) cVar.f52447c));
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng[]{b(new com.tencent.mapsdk.internal.gc(cVar.f52445a * d17, cVar.f52446b * d17)), b(new com.tencent.mapsdk.internal.gc((cVar.f52445a + 1) * d17, cVar.f52446b * d17)), b(new com.tencent.mapsdk.internal.gc((cVar.f52445a + 1) * d17, (cVar.f52446b + 1) * d17)), b(new com.tencent.mapsdk.internal.gc(cVar.f52445a * d17, d17 * (cVar.f52446b + 1)))};
    }

    private void a(int i17) {
        this.f52465b.c(i17);
    }

    public final void a(float f17) {
        com.tencent.mapsdk.internal.v vVar = this.f52465b;
        com.tencent.mapsdk.internal.tk tkVar = vVar.f52423p;
        if (tkVar != null) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass195(f17));
        }
        vVar.f52409b.f52443l = f17;
        int i17 = com.tencent.mapsdk.internal.gf.f49575a;
    }

    @Override // com.tencent.mapsdk.internal.ey
    public final void a(final java.util.List<? extends com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable> list, final java.util.List<com.tencent.map.lib.models.GeoPoint> list2, final android.graphics.Rect rect, final com.tencent.mapsdk.internal.ey.a aVar) {
        if (list.isEmpty() && (list2 == null || list2.isEmpty())) {
            return;
        }
        android.graphics.Rect rect2 = new android.graphics.Rect(this.f52466c.f50515o);
        rect2.left += rect.left;
        rect2.right -= rect.right;
        rect2.top += rect.top;
        rect2.bottom -= rect.bottom;
        final int width = rect2.width();
        final int height = rect2.height();
        com.tencent.mapsdk.internal.ne neVar = this.f52466c;
        final com.tencent.mapsdk.internal.aa aaVar = neVar.f50508h.f48818o;
        final int i17 = aaVar.f48757e;
        neVar.a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.y.1
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                com.tencent.mapsdk.internal.v vVar = com.tencent.mapsdk.internal.y.this.f52465b;
                com.tencent.map.lib.models.GeoPoint geoPoint = vVar.f52420m;
                com.tencent.mapsdk.internal.v.b bVar = vVar.f52409b;
                float f17 = bVar.f52443l;
                float f18 = bVar.f52439h;
                com.tencent.map.lib.models.GeoPoint geoPoint2 = null;
                float f19 = 4.0f;
                while (true) {
                    if (f19 < f18) {
                        break;
                    }
                    com.tencent.mapsdk.internal.y.this.a(f19);
                    android.graphics.Rect a17 = com.tencent.mapsdk.internal.y.a(com.tencent.mapsdk.internal.y.this, list, list2);
                    com.tencent.map.lib.models.GeoPoint geoPoint3 = new com.tencent.map.lib.models.GeoPoint(a17.centerY(), a17.centerX());
                    com.tencent.mapsdk.internal.y.this.c(geoPoint3);
                    com.tencent.map.lib.models.GeoPoint geoPoint4 = new com.tencent.map.lib.models.GeoPoint(a17.top, a17.left);
                    com.tencent.map.lib.models.GeoPoint geoPoint5 = new com.tencent.map.lib.models.GeoPoint(a17.bottom, a17.right);
                    com.tencent.mapsdk.internal.fu a18 = com.tencent.mapsdk.internal.y.this.a(geoPoint4);
                    com.tencent.mapsdk.internal.fu a19 = com.tencent.mapsdk.internal.y.this.a(geoPoint5);
                    android.graphics.Rect rect3 = new android.graphics.Rect();
                    rect3.left = (int) java.lang.Math.min(a18.f49467a, a19.f49467a);
                    rect3.right = (int) java.lang.Math.max(a18.f49467a, a19.f49467a);
                    rect3.top = (int) java.lang.Math.min(a18.f49468b, a19.f49468b);
                    rect3.bottom = (int) java.lang.Math.max(a18.f49468b, a19.f49468b);
                    if (width < rect3.width() || height < rect3.height()) {
                        f19 /= 1.01f;
                        geoPoint2 = geoPoint3;
                    } else if (com.tencent.mapsdk.internal.y.a(com.tencent.mapsdk.internal.y.this)) {
                        if (com.tencent.mapsdk.internal.y.b(com.tencent.mapsdk.internal.y.this)) {
                            com.tencent.mapsdk.internal.y yVar = com.tencent.mapsdk.internal.y.this;
                            com.tencent.mapsdk.internal.v.d dVar = yVar.f52465b.f52425r;
                            if (dVar != null) {
                                geoPoint2 = com.tencent.mapsdk.internal.y.a(yVar, geoPoint3, dVar);
                            }
                        }
                        geoPoint2 = geoPoint3;
                    } else {
                        geoPoint2 = com.tencent.mapsdk.internal.y.a(com.tencent.mapsdk.internal.y.this, geoPoint3, rect);
                    }
                }
                float max = java.lang.Math.max(f18, f19);
                int i18 = i17;
                if (i18 != 60) {
                    aaVar.a(i18);
                }
                com.tencent.mapsdk.internal.y.this.c(geoPoint);
                com.tencent.mapsdk.internal.y.this.a(f17);
                com.tencent.mapsdk.internal.ey.a aVar2 = aVar;
                if (aVar2 != null) {
                    try {
                        aVar2.a(max, geoPoint2);
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
        });
        if (i17 != 60) {
            aaVar.f48757e = 60;
        }
    }

    private android.graphics.Rect a(java.util.List<? extends com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable> list, java.util.List<com.tencent.map.lib.models.GeoPoint> list2) {
        int i17;
        int i18;
        int i19;
        android.graphics.Rect bound;
        int i27 = 0;
        if (list != null) {
            i17 = 0;
            i18 = 0;
            i19 = 0;
            for (com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable boundable : list) {
                if (boundable != null && (bound = boundable.getBound(this)) != null) {
                    if (i27 == 0) {
                        i27 = bound.left;
                    }
                    if (i17 == 0) {
                        i17 = bound.right;
                    }
                    if (i18 == 0) {
                        i18 = bound.top;
                    }
                    if (i19 == 0) {
                        i19 = bound.bottom;
                    }
                    int i28 = bound.left;
                    if (i28 < i27) {
                        i27 = i28;
                    }
                    int i29 = bound.right;
                    if (i29 > i17) {
                        i17 = i29;
                    }
                    int i37 = bound.top;
                    if (i37 > i18) {
                        i18 = i37;
                    }
                    int i38 = bound.bottom;
                    if (i38 < i19) {
                        i19 = i38;
                    }
                }
            }
        } else {
            i17 = 0;
            i18 = 0;
            i19 = 0;
        }
        if (list2 != null) {
            for (com.tencent.map.lib.models.GeoPoint geoPoint : list2) {
                if (geoPoint != null) {
                    if (i27 == 0) {
                        i27 = geoPoint.getLongitudeE6();
                    }
                    if (i17 == 0) {
                        i17 = geoPoint.getLongitudeE6();
                    }
                    if (i18 == 0) {
                        i18 = geoPoint.getLatitudeE6();
                    }
                    if (i19 == 0) {
                        i19 = geoPoint.getLatitudeE6();
                    }
                    if (geoPoint.getLongitudeE6() < i27) {
                        i27 = geoPoint.getLongitudeE6();
                    }
                    if (geoPoint.getLongitudeE6() > i17) {
                        i17 = geoPoint.getLongitudeE6();
                    }
                    if (geoPoint.getLatitudeE6() > i18) {
                        i18 = geoPoint.getLatitudeE6();
                    }
                    if (geoPoint.getLatitudeE6() < i19) {
                        i19 = geoPoint.getLatitudeE6();
                    }
                }
            }
        }
        return new android.graphics.Rect(i27, i18, i17, i19);
    }

    private com.tencent.map.lib.models.GeoPoint a(com.tencent.map.lib.models.GeoPoint geoPoint, android.graphics.Rect rect) {
        com.tencent.mapsdk.internal.fu a17;
        if (geoPoint == null || (a17 = a(geoPoint)) == null || rect == null) {
            return null;
        }
        return a(new com.tencent.mapsdk.internal.fu(a17.f49467a - ((rect.left - rect.right) * 0.5d), a17.f49468b - ((rect.top - rect.bottom) * 0.5d)));
    }

    private com.tencent.map.lib.models.GeoPoint a(com.tencent.map.lib.models.GeoPoint geoPoint, com.tencent.mapsdk.internal.v.d dVar) {
        com.tencent.mapsdk.internal.fu a17;
        if (geoPoint == null || (a17 = a(geoPoint)) == null || dVar == null) {
            return null;
        }
        double d17 = a17.f49467a;
        double d18 = a17.f49468b;
        android.graphics.Rect rect = new android.graphics.Rect(this.f52466c.f50515o);
        int width = rect.width();
        int height = rect.height();
        float f17 = dVar.f52448a + 0.5f;
        float f18 = dVar.f52449b + 0.5f;
        double d19 = f17;
        if (d19 < 0.25d) {
            d17 += (0.25d - d19) * width;
        } else if (d19 > 0.75d) {
            d17 -= (d19 - 0.75d) * width;
        }
        double d27 = f18;
        if (d27 < 0.25d) {
            d18 += (0.25d - d27) * height;
        } else if (d27 > 0.75d) {
            d18 -= (d27 - 0.75d) * height;
        }
        return a(new com.tencent.mapsdk.internal.fu(d17, d18));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014e  */
    @Override // com.tencent.mapsdk.internal.ey
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(com.tencent.tencentmap.mapsdk.maps.model.LatLng r32, com.tencent.tencentmap.mapsdk.maps.model.LatLng r33, int r34, int r35, int r36, int r37, com.tencent.tencentmap.mapsdk.maps.model.LatLng r38) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.y.a(com.tencent.tencentmap.mapsdk.maps.model.LatLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng, int, int, int, int, com.tencent.tencentmap.mapsdk.maps.model.LatLng):float");
    }

    private static com.tencent.tencentmap.mapsdk.maps.model.LatLng a(android.content.Context context, com.tencent.mapsdk.internal.fu fuVar) {
        double a17 = com.tencent.mapsdk.internal.hs.a(context) * 2.6843546E8f;
        double d17 = a17 / 2.0d;
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng((java.lang.Math.asin(1.0d - (2.0d / (java.lang.Math.pow(2.718281828459045d, ((fuVar.f49468b - d17) / 0.5d) / (a17 / 6.283185307179586d)) + 1.0d))) * 180.0d) / 3.141592653589793d, (fuVar.f49467a - d17) / (a17 / 360.0d));
    }

    @Override // com.tencent.mapsdk.internal.ey
    public final com.tencent.mapsdk.internal.fu a(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        double a17 = com.tencent.mapsdk.internal.hs.a(context) * 2.6843546E8f;
        double d17 = a17 / 2.0d;
        double min = java.lang.Math.min(java.lang.Math.max(java.lang.Math.sin(latLng.latitude * 0.017453292519943295d), -0.9999d), 0.9999d);
        return new com.tencent.mapsdk.internal.fu((latLng.longitude * (a17 / 360.0d)) + d17, d17 + (java.lang.Math.log((min + 1.0d) / (1.0d - min)) * (a17 / 6.283185307179586d) * 0.5d));
    }

    @Override // com.tencent.mapsdk.internal.ey
    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng a(com.tencent.mapsdk.internal.gc gcVar) {
        return b(gcVar);
    }

    public static com.tencent.mapsdk.internal.fu a(com.tencent.mapsdk.internal.v vVar, com.tencent.map.lib.models.GeoPoint geoPoint) {
        if (geoPoint == null) {
            return null;
        }
        int i17 = vVar.f52411d >> 1;
        double d17 = vVar.f52412e;
        double d18 = vVar.f52413f;
        double min = java.lang.Math.min(java.lang.Math.max(java.lang.Math.sin((geoPoint.getLatitudeE6() / 1000000.0d) * 0.017453292519943295d), -0.9999d), 0.9999d);
        double d19 = i17;
        return new com.tencent.mapsdk.internal.fu(((geoPoint.getLongitudeE6() / 1000000.0d) * d17) + d19, d19 + (java.lang.Math.log((min + 1.0d) / (1.0d - min)) * d18 * 0.5d));
    }

    public static /* synthetic */ android.graphics.Rect a(com.tencent.mapsdk.internal.y yVar, java.util.List list, java.util.List list2) {
        int i17;
        int i18;
        int i19;
        android.graphics.Rect bound;
        int i27 = 0;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            i17 = 0;
            i18 = 0;
            i19 = 0;
            while (it.hasNext()) {
                com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable boundable = (com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable) it.next();
                if (boundable != null && (bound = boundable.getBound(yVar)) != null) {
                    if (i27 == 0) {
                        i27 = bound.left;
                    }
                    if (i17 == 0) {
                        i17 = bound.right;
                    }
                    if (i18 == 0) {
                        i18 = bound.top;
                    }
                    if (i19 == 0) {
                        i19 = bound.bottom;
                    }
                    int i28 = bound.left;
                    if (i28 < i27) {
                        i27 = i28;
                    }
                    int i29 = bound.right;
                    if (i29 > i17) {
                        i17 = i29;
                    }
                    int i37 = bound.top;
                    if (i37 > i18) {
                        i18 = i37;
                    }
                    int i38 = bound.bottom;
                    if (i38 < i19) {
                        i19 = i38;
                    }
                }
            }
        } else {
            i17 = 0;
            i18 = 0;
            i19 = 0;
        }
        if (list2 != null) {
            java.util.Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                com.tencent.map.lib.models.GeoPoint geoPoint = (com.tencent.map.lib.models.GeoPoint) it6.next();
                if (geoPoint != null) {
                    if (i27 == 0) {
                        i27 = geoPoint.getLongitudeE6();
                    }
                    if (i17 == 0) {
                        i17 = geoPoint.getLongitudeE6();
                    }
                    if (i18 == 0) {
                        i18 = geoPoint.getLatitudeE6();
                    }
                    if (i19 == 0) {
                        i19 = geoPoint.getLatitudeE6();
                    }
                    if (geoPoint.getLongitudeE6() < i27) {
                        i27 = geoPoint.getLongitudeE6();
                    }
                    if (geoPoint.getLongitudeE6() > i17) {
                        i17 = geoPoint.getLongitudeE6();
                    }
                    if (geoPoint.getLatitudeE6() > i18) {
                        i18 = geoPoint.getLatitudeE6();
                    }
                    if (geoPoint.getLatitudeE6() < i19) {
                        i19 = geoPoint.getLatitudeE6();
                    }
                }
            }
        }
        return new android.graphics.Rect(i27, i18, i17, i19);
    }

    public static /* synthetic */ boolean a(com.tencent.mapsdk.internal.y yVar) {
        com.tencent.mapsdk.internal.v.d dVar = yVar.f52465b.f52425r;
        if (dVar != null) {
            return (dVar.f52448a == 0.0f && dVar.f52449b == 0.0f) ? false : true;
        }
        return false;
    }

    public static /* synthetic */ com.tencent.map.lib.models.GeoPoint a(com.tencent.mapsdk.internal.y yVar, com.tencent.map.lib.models.GeoPoint geoPoint, android.graphics.Rect rect) {
        com.tencent.mapsdk.internal.fu a17 = yVar.a(geoPoint);
        if (a17 == null || rect == null) {
            return null;
        }
        return yVar.a(new com.tencent.mapsdk.internal.fu(a17.f49467a - ((rect.left - rect.right) * 0.5d), a17.f49468b - ((rect.top - rect.bottom) * 0.5d)));
    }

    public static /* synthetic */ com.tencent.map.lib.models.GeoPoint a(com.tencent.mapsdk.internal.y yVar, com.tencent.map.lib.models.GeoPoint geoPoint, com.tencent.mapsdk.internal.v.d dVar) {
        com.tencent.mapsdk.internal.fu a17 = yVar.a(geoPoint);
        if (a17 == null || dVar == null) {
            return null;
        }
        double d17 = a17.f49467a;
        double d18 = a17.f49468b;
        android.graphics.Rect rect = new android.graphics.Rect(yVar.f52466c.f50515o);
        int width = rect.width();
        int height = rect.height();
        float f17 = dVar.f52448a + 0.5f;
        float f18 = dVar.f52449b + 0.5f;
        double d19 = f17;
        if (d19 < 0.25d) {
            d17 += (0.25d - d19) * width;
        } else if (d19 > 0.75d) {
            d17 -= (d19 - 0.75d) * width;
        }
        double d27 = f18;
        if (d27 < 0.25d) {
            d18 += (0.25d - d27) * height;
        } else if (d27 > 0.75d) {
            d18 -= (d27 - 0.75d) * height;
        }
        return yVar.a(new com.tencent.mapsdk.internal.fu(d17, d18));
    }
}
