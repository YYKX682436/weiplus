package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class pm extends com.tencent.mapsdk.internal.po<com.tencent.mapsdk.internal.ah> implements com.tencent.mapsdk.internal.ah, com.tencent.mapsdk.internal.or {

    /* renamed from: b, reason: collision with root package name */
    private static final int f50646b = 128;

    /* renamed from: d, reason: collision with root package name */
    private com.tencent.map.lib.models.GeoPoint f50647d;

    /* renamed from: p, reason: collision with root package name */
    private double f50648p;

    /* renamed from: q, reason: collision with root package name */
    private float f50649q;

    /* renamed from: r, reason: collision with root package name */
    private int f50650r;

    /* renamed from: s, reason: collision with root package name */
    private final java.util.ArrayList<java.lang.Integer> f50651s;

    /* renamed from: t, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.CircleOptions f50652t;

    /* renamed from: u, reason: collision with root package name */
    private final com.tencent.map.lib.models.CircleInfo f50653u;

    /* renamed from: v, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.ne f50654v;

    public pm(com.tencent.mapsdk.internal.az azVar) {
        super(azVar);
        this.f50647d = new com.tencent.map.lib.models.GeoPoint(39909230, 116397428);
        this.f50648p = 0.0d;
        this.f50649q = 1000.0f;
        this.f50650r = 0;
        this.f50651s = new java.util.ArrayList<>();
        this.f50653u = new com.tencent.map.lib.models.CircleInfo();
        this.f50654v = azVar.b();
    }

    private double d() {
        return this.f50649q;
    }

    private void e() {
        if (a() == -1) {
            com.tencent.mapsdk.internal.tk tkVar = this.f50654v.f50506f;
            this.f50679m = ((java.lang.Integer) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass68>) new com.tencent.mapsdk.internal.tk.AnonymousClass68(this.f50653u), (com.tencent.mapsdk.internal.tk.AnonymousClass68) (-1))).intValue();
        } else if (v()) {
            com.tencent.mapsdk.internal.tk tkVar2 = this.f50654v.f50506f;
            int a17 = a();
            com.tencent.map.lib.models.CircleInfo circleInfo = this.f50653u;
            if (tkVar2.f51661e != 0 && circleInfo != null) {
                tkVar2.a(new com.tencent.mapsdk.internal.tk.AnonymousClass79(a17, circleInfo));
            }
            this.f50654v.f50522v = true;
        }
    }

    private com.tencent.mapsdk.internal.ah f() {
        return this;
    }

    public final void a(com.tencent.tencentmap.mapsdk.maps.model.CircleOptions circleOptions) {
        if (circleOptions == null) {
            return;
        }
        this.f50652t = circleOptions;
        com.tencent.tencentmap.mapsdk.maps.model.LatLng center = circleOptions.getCenter();
        if (center != null) {
            a(com.tencent.map.lib.models.GeoPoint.from(center));
        }
        setRadius(circleOptions.getRadius());
        setStrokeWidth(circleOptions.getStrokeWidth());
        setStrokeColor(circleOptions.getStrokeColor());
        setFillColor(circleOptions.getFillColor());
        setZIndex(circleOptions.getZIndex());
        setVisible(circleOptions.isVisible());
        setLevel(circleOptions.getLevel());
        a(circleOptions.getBorderType().ordinal());
        a(circleOptions.getPattern());
        this.f50652t = circleOptions;
        w();
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: b */
    public final android.graphics.Rect getBound(com.tencent.mapsdk.internal.ey eyVar) {
        double a17 = a(this.f50648p, this.f50647d.getLatitudeE6() / 1000000.0d);
        com.tencent.mapsdk.internal.gc a18 = a(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(this.f50647d.getLatitudeE6() / 1000000.0d, this.f50647d.getLongitudeE6() / 1000000.0d));
        com.tencent.mapsdk.internal.gc gcVar = new com.tencent.mapsdk.internal.gc(a18.f49565c - a17, a18.f49564b + a17);
        com.tencent.mapsdk.internal.gc gcVar2 = new com.tencent.mapsdk.internal.gc(a18.f49565c + a17, a18.f49564b - a17);
        com.tencent.tencentmap.mapsdk.maps.model.LatLng a19 = a(gcVar);
        com.tencent.tencentmap.mapsdk.maps.model.LatLng a27 = a(gcVar2);
        android.graphics.Rect rect = new android.graphics.Rect();
        rect.left = (int) (a19.longitude * 1000000.0d);
        rect.top = (int) (a19.latitude * 1000000.0d);
        rect.right = (int) (a27.longitude * 1000000.0d);
        rect.bottom = (int) (a27.latitude * 1000000.0d);
        return rect;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Circle
    public final boolean contains(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        return com.tencent.mapsdk.internal.kq.a(getCenter(), latLng) < getRadius();
    }

    @Override // com.tencent.mapsdk.internal.au
    public final /* bridge */ /* synthetic */ com.tencent.mapsdk.internal.ao f_() {
        return this;
    }

    @Override // com.tencent.mapsdk.internal.or
    public final boolean g_() {
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Circle
    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng getCenter() {
        com.tencent.map.lib.models.GeoPoint geoPoint = this.f50647d;
        if (geoPoint != null) {
            return geoPoint.toLatLng();
        }
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Circle
    public final double getRadius() {
        return this.f50648p;
    }

    @Override // com.tencent.mapsdk.internal.po
    public final void h_() {
        com.tencent.mapsdk.internal.ne neVar;
        if (a() == -1 || (neVar = this.f50654v) == null) {
            return;
        }
        com.tencent.mapsdk.internal.tk tkVar = neVar.f50506f;
        int a17 = a();
        if (tkVar.f51661e != 0 && a17 >= 0 && tkVar.f51666j != null) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass90(a17));
        }
        this.f50679m = -1;
    }

    @Override // com.tencent.mapsdk.internal.po
    public final void j_() {
        if (this.f50654v == null) {
            return;
        }
        p();
        if (a() == -1) {
            com.tencent.mapsdk.internal.tk tkVar = this.f50654v.f50506f;
            this.f50679m = ((java.lang.Integer) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass68>) new com.tencent.mapsdk.internal.tk.AnonymousClass68(this.f50653u), (com.tencent.mapsdk.internal.tk.AnonymousClass68) (-1))).intValue();
        } else if (v()) {
            com.tencent.mapsdk.internal.tk tkVar2 = this.f50654v.f50506f;
            int a17 = a();
            com.tencent.map.lib.models.CircleInfo circleInfo = this.f50653u;
            if (tkVar2.f51661e != 0 && circleInfo != null) {
                tkVar2.a(new com.tencent.mapsdk.internal.tk.AnonymousClass79(a17, circleInfo));
            }
            this.f50654v.f50522v = true;
        }
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public final boolean onTap(float f17, float f18) {
        com.tencent.mapsdk.internal.ne neVar;
        if (this.f50647d != null && (neVar = this.f50654v) != null) {
            com.tencent.map.lib.models.GeoPoint a17 = neVar.f50513m.a(new com.tencent.mapsdk.internal.fu(f17, f18));
            if (java.lang.Math.hypot(a17.getLatitudeE6() - this.f50647d.getLatitudeE6(), a17.getLongitudeE6() - this.f50647d.getLongitudeE6()) <= this.f50649q) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.ev
    public final void p() {
        com.tencent.map.lib.models.GeoPoint geoPoint;
        if ((a() > 0 && !v()) || this.f50654v == null || (geoPoint = this.f50647d) == null) {
            return;
        }
        double d17 = this.f50648p;
        if (d17 <= 0.0d) {
            return;
        }
        com.tencent.map.lib.models.CircleInfo circleInfo = this.f50653u;
        circleInfo.zIndex = (int) this.f50674h;
        circleInfo.borderColor = this.f50673g;
        circleInfo.borderWidth = this.f50671e;
        circleInfo.fillColor = this.f50672f;
        circleInfo.radius = (float) d17;
        circleInfo.centerX = geoPoint.getLongitudeE6();
        this.f50653u.centerY = this.f50647d.getLatitudeE6();
        com.tencent.map.lib.models.CircleInfo circleInfo2 = this.f50653u;
        circleInfo2.isVisible = this.f50675i;
        circleInfo2.level = this.f50678l;
        circleInfo2.borderType = this.f50650r;
        circleInfo2.patterns = new int[this.f50651s.size()];
        for (int i17 = 0; i17 < this.f50651s.size(); i17++) {
            this.f50653u.patterns[i17] = this.f50651s.get(i17).intValue();
        }
        w();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Circle
    public final void setCenter(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        a(com.tencent.map.lib.models.GeoPoint.from(latLng));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Circle
    public final void setOptions(com.tencent.tencentmap.mapsdk.maps.model.CircleOptions circleOptions) {
        a(circleOptions);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Circle
    public final void setRadius(double d17) {
        if (d17 < 0.0d) {
            return;
        }
        if (d17 == 0.0d) {
            d17 = 1.0E-10d;
        }
        com.tencent.tencentmap.mapsdk.maps.model.CircleOptions circleOptions = this.f50652t;
        if (circleOptions == null || circleOptions.getCenter() == null) {
            return;
        }
        this.f50648p = d17;
        this.f50649q = (float) com.tencent.mapsdk.internal.hn.a(d17, this.f50652t.getCenter().latitude);
        w();
    }

    private void a(com.tencent.map.lib.models.GeoPoint geoPoint) {
        if (geoPoint == null) {
            return;
        }
        com.tencent.map.lib.models.GeoPoint geoPoint2 = this.f50647d;
        if (geoPoint2 == null) {
            this.f50647d = new com.tencent.map.lib.models.GeoPoint(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6());
        } else {
            geoPoint2.setLatitudeE6(geoPoint.getLatitudeE6());
            this.f50647d.setLongitudeE6(geoPoint.getLongitudeE6());
        }
        w();
    }

    private void a(int i17) {
        this.f50650r = i17;
        w();
    }

    private void a(java.util.List<java.lang.Integer> list) {
        if (list == null || list.size() != 2) {
            return;
        }
        this.f50651s.clear();
        this.f50651s.addAll(list);
        w();
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: a */
    public final android.graphics.Rect getScreenBound(com.tencent.mapsdk.internal.ey eyVar) {
        android.graphics.Rect bound = getBound(eyVar);
        int i17 = bound.left;
        int i18 = bound.right;
        int i19 = bound.top;
        int i27 = bound.bottom;
        com.tencent.map.lib.models.GeoPoint geoPoint = new com.tencent.map.lib.models.GeoPoint(i19, i17);
        com.tencent.map.lib.models.GeoPoint geoPoint2 = new com.tencent.map.lib.models.GeoPoint(i27, i17);
        com.tencent.map.lib.models.GeoPoint geoPoint3 = new com.tencent.map.lib.models.GeoPoint(i27, i18);
        com.tencent.map.lib.models.GeoPoint geoPoint4 = new com.tencent.map.lib.models.GeoPoint(i19, i18);
        com.tencent.mapsdk.internal.fu a17 = eyVar.a(geoPoint);
        com.tencent.mapsdk.internal.fu a18 = eyVar.a(geoPoint2);
        com.tencent.mapsdk.internal.fu a19 = eyVar.a(geoPoint3);
        com.tencent.mapsdk.internal.fu a27 = eyVar.a(geoPoint4);
        return new android.graphics.Rect((int) java.lang.Math.min(java.lang.Math.min(a17.f49467a, a18.f49467a), java.lang.Math.min(a19.f49467a, a27.f49467a)), (int) java.lang.Math.min(java.lang.Math.min(a17.f49468b, a18.f49468b), java.lang.Math.min(a19.f49468b, a27.f49468b)), (int) java.lang.Math.max(java.lang.Math.max(a17.f49467a, a18.f49467a), java.lang.Math.max(a19.f49467a, a27.f49467a)), (int) java.lang.Math.max(java.lang.Math.max(a17.f49468b, a18.f49468b), java.lang.Math.max(a19.f49468b, a27.f49468b)));
    }

    private static double a(double d17, double d18) {
        return d17 / java.lang.Math.cos((d18 * 3.141592653589793d) / 180.0d);
    }

    private static com.tencent.mapsdk.internal.gc a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        return new com.tencent.mapsdk.internal.gc((latLng.longitude * 2.003750834E7d) / 180.0d, ((java.lang.Math.log(java.lang.Math.tan(((latLng.latitude + 90.0d) * 3.141592653589793d) / 360.0d)) / 0.017453292519943295d) * 2.003750834E7d) / 180.0d);
    }

    private static com.tencent.tencentmap.mapsdk.maps.model.LatLng a(com.tencent.mapsdk.internal.gc gcVar) {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng((float) (((java.lang.Math.atan(java.lang.Math.exp((((float) ((gcVar.f49564b * 180.0d) / 2.003750834E7d)) * 3.141592653589793d) / 180.0d)) * 2.0d) - 1.5707963267948966d) * 57.29577951308232d), (float) ((gcVar.f49565c * 180.0d) / 2.003750834E7d));
    }
}
