package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class pq extends com.tencent.mapsdk.internal.po<com.tencent.mapsdk.internal.ap> implements com.tencent.mapsdk.internal.ap, com.tencent.mapsdk.internal.fm {
    private static final double M = 1.0E-10d;

    /* renamed from: d, reason: collision with root package name */
    private static final int f50710d = 180;

    /* renamed from: p, reason: collision with root package name */
    private static final int f50711p = 1;
    private java.lang.String A;
    private com.tencent.map.lib.models.GeoPoint B;
    private android.graphics.Rect C;
    private com.tencent.map.lib.models.GeoPoint[] D;
    private boolean E;
    private boolean F;
    private java.util.ArrayList<com.tencent.mapsdk.internal.qx> G;
    private java.util.ArrayList<com.tencent.mapsdk.internal.qx> H;
    private com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions I;

    /* renamed from: J, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ne f50712J;
    private java.lang.String K;
    private com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor L;

    /* renamed from: b, reason: collision with root package name */
    final com.tencent.map.lib.models.PolygonInfo f50713b;

    /* renamed from: q, reason: collision with root package name */
    private java.util.List<com.tencent.map.lib.models.GeoPoint> f50714q;

    /* renamed from: r, reason: collision with root package name */
    private java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> f50715r;

    /* renamed from: s, reason: collision with root package name */
    private java.util.List<java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng>> f50716s;

    /* renamed from: t, reason: collision with root package name */
    private com.tencent.mapsdk.internal.gc[] f50717t;

    /* renamed from: u, reason: collision with root package name */
    private com.tencent.map.lib.models.GeoPoint f50718u;

    /* renamed from: v, reason: collision with root package name */
    private android.graphics.Rect f50719v;

    /* renamed from: w, reason: collision with root package name */
    private android.graphics.Rect f50720w;

    /* renamed from: x, reason: collision with root package name */
    private com.tencent.mapsdk.internal.qx f50721x;

    /* renamed from: y, reason: collision with root package name */
    private final byte[] f50722y;

    /* renamed from: z, reason: collision with root package name */
    private com.tencent.mapsdk.internal.pq.b f50723z;

    /* loaded from: classes13.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        com.tencent.tencentmap.mapsdk.maps.model.LatLng[] f50724a;

        public a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2) {
            this.f50724a = r2;
            com.tencent.tencentmap.mapsdk.maps.model.LatLng[] latLngArr = {latLng, latLng2};
        }

        public final java.lang.String toString() {
            return this.f50724a[0].toString() + "    " + this.f50724a[1].toString();
        }
    }

    public pq(com.tencent.mapsdk.internal.az azVar, com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions polygonOptions) {
        super(azVar);
        this.f50714q = new java.util.concurrent.CopyOnWriteArrayList();
        this.f50722y = new byte[0];
        this.f50723z = new com.tencent.mapsdk.internal.pq.b((byte) 0);
        this.B = new com.tencent.map.lib.models.GeoPoint();
        this.C = new android.graphics.Rect();
        this.E = false;
        this.F = false;
        com.tencent.map.lib.models.PolygonInfo polygonInfo = new com.tencent.map.lib.models.PolygonInfo();
        this.f50713b = polygonInfo;
        polygonInfo.polygonId = -1;
        this.I = polygonOptions;
        this.f50712J = azVar.b();
        if (polygonOptions != null && !com.tencent.mapsdk.internal.hr.a(this.K)) {
            this.f50712J.f50508h.a(this);
        }
        a(polygonOptions);
    }

    private static double a(double d17, double d18, double d19, double d27, double d28, double d29) {
        return ((d19 - d17) * (d29 - d18)) - ((d28 - d17) * (d27 - d18));
    }

    private void e() {
        com.tencent.map.lib.models.PolygonInfo polygonInfo = this.f50713b;
        if (-1 == polygonInfo.polygonId) {
            polygonInfo.polygonId = this.f50712J.a(polygonInfo);
        } else if (v()) {
            this.f50712J.b(this.f50713b);
        }
    }

    private android.graphics.Rect f() {
        android.graphics.Rect rect = this.f50719v;
        if (rect != null) {
            return rect;
        }
        java.util.List<com.tencent.map.lib.models.GeoPoint> list = this.f50714q;
        if (list == null || list.isEmpty() || this.f50714q.size() < 3) {
            return null;
        }
        com.tencent.map.lib.models.GeoPoint geoPoint = this.f50714q.get(0);
        int latitudeE6 = geoPoint.getLatitudeE6();
        int longitudeE6 = geoPoint.getLongitudeE6();
        int size = this.f50714q.size();
        int i17 = latitudeE6;
        int i18 = longitudeE6;
        int i19 = i17;
        for (int i27 = 1; i27 < size; i27++) {
            com.tencent.map.lib.models.GeoPoint geoPoint2 = this.f50714q.get(i27);
            int latitudeE62 = geoPoint2.getLatitudeE6();
            int longitudeE62 = geoPoint2.getLongitudeE6();
            longitudeE6 = java.lang.Math.min(longitudeE6, longitudeE62);
            i18 = java.lang.Math.max(i18, longitudeE62);
            i19 = java.lang.Math.max(i19, latitudeE62);
            i17 = java.lang.Math.min(i17, latitudeE62);
        }
        android.graphics.Rect rect2 = new android.graphics.Rect(longitudeE6, i19, i18, i17);
        this.f50719v = rect2;
        return rect2;
    }

    private android.graphics.Rect g() {
        android.graphics.Rect rect = this.f50720w;
        if (rect != null) {
            return rect;
        }
        java.util.List<com.tencent.map.lib.models.GeoPoint> list = this.f50714q;
        if (list == null || list.isEmpty() || this.f50714q.size() < 3) {
            return null;
        }
        com.tencent.mapsdk.internal.gc b17 = this.f50712J.f50513m.b(this.f50714q.get(0).toLatLng());
        int x17 = (int) b17.x();
        int x18 = (int) b17.x();
        int y17 = (int) b17.y();
        int y18 = (int) b17.y();
        int size = this.f50714q.size();
        for (int i17 = 1; i17 < size; i17++) {
            com.tencent.mapsdk.internal.gc b18 = this.f50712J.f50513m.b(this.f50714q.get(i17).toLatLng());
            x17 = (int) java.lang.Math.min(x17, b18.x());
            x18 = (int) java.lang.Math.max(x18, b18.x());
            y17 = (int) java.lang.Math.min(y17, b18.y());
            y18 = (int) java.lang.Math.max(y18, b18.y());
        }
        android.graphics.Rect rect2 = new android.graphics.Rect(x17, y17, x18, y18);
        this.f50720w = rect2;
        return rect2;
    }

    private com.tencent.mapsdk.internal.ap h() {
        return this;
    }

    private android.graphics.Rect i() {
        if (this.f50712J == null) {
            return null;
        }
        com.tencent.mapsdk.internal.gc b17 = this.f50712J.f50513m.b(this.f50712J.f50513m.a(new com.tencent.mapsdk.internal.fu(0.0d, 0.0d)).toLatLng());
        com.tencent.mapsdk.internal.gc b18 = this.f50712J.f50513m.b(this.f50712J.f50513m.a(new com.tencent.mapsdk.internal.fu(this.f50712J.f50515o.width(), this.f50712J.f50515o.height())).toLatLng());
        com.tencent.mapsdk.internal.gc b19 = this.f50712J.f50513m.b(this.f50712J.f50513m.a(new com.tencent.mapsdk.internal.fu(0.0d, this.f50712J.f50515o.height())).toLatLng());
        com.tencent.mapsdk.internal.gc b27 = this.f50712J.f50513m.b(this.f50712J.f50513m.a(new com.tencent.mapsdk.internal.fu(this.f50712J.f50515o.width(), 0.0d)).toLatLng());
        return new android.graphics.Rect((int) java.lang.Math.min(java.lang.Math.min(java.lang.Math.min(b17.x(), b19.x()), b18.x()), b27.x()), (int) java.lang.Math.min(java.lang.Math.min(java.lang.Math.min(b17.y(), b19.y()), b18.y()), b27.y()), (int) java.lang.Math.max(java.lang.Math.max(java.lang.Math.max(b17.x(), b19.x()), b18.x()), b27.x()), (int) java.lang.Math.max(java.lang.Math.max(java.lang.Math.max(b17.y(), b19.y()), b18.y()), b27.y()));
    }

    private static int j() {
        return 1;
    }

    private com.tencent.mapsdk.internal.pq.a[] k() {
        java.util.List<com.tencent.map.lib.models.GeoPoint> list = this.f50714q;
        java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> a17 = com.tencent.mapsdk.internal.kr.a(list);
        int size = list.size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            int i18 = size - 1;
            if (i17 >= i18) {
                arrayList.add(new com.tencent.mapsdk.internal.pq.a(a17.get(i18), a17.get(0)));
                return (com.tencent.mapsdk.internal.pq.a[]) arrayList.toArray(new com.tencent.mapsdk.internal.pq.a[arrayList.size()]);
            }
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = a17.get(i17);
            i17++;
            arrayList.add(new com.tencent.mapsdk.internal.pq.a(latLng, a17.get(i17)));
        }
    }

    @Override // com.tencent.mapsdk.internal.ap
    public final com.tencent.map.lib.models.PolygonInfo b() {
        return this.f50713b;
    }

    @Override // com.tencent.mapsdk.internal.ap
    public final java.util.List<com.tencent.map.lib.models.GeoPoint> c() {
        java.util.ArrayList arrayList = new java.util.ArrayList(49);
        android.graphics.Rect f17 = f();
        int i17 = f17.left;
        int i18 = f17.top;
        double d17 = i17;
        double abs = java.lang.Math.abs(f17.width());
        double d18 = d17 - (abs * 0.125d);
        double d19 = i18;
        double abs2 = java.lang.Math.abs(f17.height());
        double d27 = d19 - (0.125d * abs2);
        double d28 = d17 - (abs * 0.25d);
        double d29 = d19 - (0.25d * abs2);
        double d37 = d17 - (abs * 0.375d);
        double d38 = d19 - (0.375d * abs2);
        double d39 = d17 - (abs * 0.5d);
        double d47 = d19 - (0.5d * abs2);
        double d48 = d17 - (abs * 0.625d);
        double d49 = d19 - (0.625d * abs2);
        double d57 = d17 - (abs * 0.75d);
        double d58 = d19 - (0.75d * abs2);
        double d59 = d17 - (abs * 0.825d);
        double d66 = d19 - (abs2 * 0.825d);
        int i19 = (int) d27;
        int i27 = (int) d18;
        com.tencent.map.lib.models.GeoPoint geoPoint = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i19, i27));
        if (a(geoPoint)) {
            arrayList.add(geoPoint);
        }
        int i28 = (int) d29;
        com.tencent.map.lib.models.GeoPoint geoPoint2 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i28, i27));
        if (a(geoPoint2)) {
            arrayList.add(geoPoint2);
        }
        int i29 = (int) d38;
        com.tencent.map.lib.models.GeoPoint geoPoint3 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i29, i27));
        if (a(geoPoint3)) {
            arrayList.add(geoPoint3);
        }
        int i37 = (int) d47;
        com.tencent.map.lib.models.GeoPoint geoPoint4 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i37, i27));
        if (a(geoPoint4)) {
            arrayList.add(geoPoint4);
        }
        int i38 = (int) d49;
        com.tencent.map.lib.models.GeoPoint geoPoint5 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i38, i27));
        if (a(geoPoint5)) {
            arrayList.add(geoPoint5);
        }
        int i39 = (int) d58;
        com.tencent.map.lib.models.GeoPoint geoPoint6 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i39, i27));
        if (a(geoPoint6)) {
            arrayList.add(geoPoint6);
        }
        int i47 = (int) d66;
        com.tencent.map.lib.models.GeoPoint geoPoint7 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i47, i27));
        if (a(geoPoint7)) {
            arrayList.add(geoPoint7);
        }
        int i48 = (int) d28;
        com.tencent.map.lib.models.GeoPoint geoPoint8 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i19, i48));
        if (a(geoPoint8)) {
            arrayList.add(geoPoint8);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint9 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i28, i48));
        if (a(geoPoint9)) {
            arrayList.add(geoPoint9);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint10 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i29, i48));
        if (a(geoPoint10)) {
            arrayList.add(geoPoint10);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint11 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i37, i48));
        if (a(geoPoint11)) {
            arrayList.add(geoPoint11);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint12 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i38, i48));
        if (a(geoPoint12)) {
            arrayList.add(geoPoint12);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint13 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i39, i48));
        if (a(geoPoint13)) {
            arrayList.add(geoPoint13);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint14 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i47, i48));
        if (a(geoPoint14)) {
            arrayList.add(geoPoint14);
        }
        int i49 = (int) d37;
        com.tencent.map.lib.models.GeoPoint geoPoint15 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i19, i49));
        if (a(geoPoint15)) {
            arrayList.add(geoPoint15);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint16 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i28, i49));
        if (a(geoPoint16)) {
            arrayList.add(geoPoint16);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint17 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i29, i49));
        if (a(geoPoint17)) {
            arrayList.add(geoPoint17);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint18 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i37, i49));
        if (a(geoPoint18)) {
            arrayList.add(geoPoint18);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint19 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i38, i49));
        if (a(geoPoint19)) {
            arrayList.add(geoPoint19);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint20 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i39, i49));
        if (a(geoPoint20)) {
            arrayList.add(geoPoint20);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint21 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i47, i49));
        if (a(geoPoint21)) {
            arrayList.add(geoPoint21);
        }
        int i57 = (int) d39;
        com.tencent.map.lib.models.GeoPoint geoPoint22 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i19, i57));
        if (a(geoPoint22)) {
            arrayList.add(geoPoint22);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint23 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i28, i57));
        if (a(geoPoint23)) {
            arrayList.add(geoPoint23);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint24 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i29, i57));
        if (a(geoPoint24)) {
            arrayList.add(geoPoint24);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint25 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i37, i57));
        if (a(geoPoint25)) {
            arrayList.add(geoPoint25);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint26 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i38, i57));
        if (a(geoPoint26)) {
            arrayList.add(geoPoint26);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint27 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i39, i57));
        if (a(geoPoint27)) {
            arrayList.add(geoPoint27);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint28 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i47, i57));
        if (a(geoPoint28)) {
            arrayList.add(geoPoint28);
        }
        int i58 = (int) d48;
        com.tencent.map.lib.models.GeoPoint geoPoint29 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i19, i58));
        if (a(geoPoint29)) {
            arrayList.add(geoPoint29);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint30 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i28, i58));
        if (a(geoPoint30)) {
            arrayList.add(geoPoint30);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint31 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i29, i58));
        if (a(geoPoint31)) {
            arrayList.add(geoPoint31);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint32 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i37, i58));
        if (a(geoPoint32)) {
            arrayList.add(geoPoint32);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint33 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i38, i58));
        if (a(geoPoint33)) {
            arrayList.add(geoPoint33);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint34 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i39, i58));
        if (a(geoPoint34)) {
            arrayList.add(geoPoint34);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint35 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i47, i58));
        if (a(geoPoint35)) {
            arrayList.add(geoPoint35);
        }
        int i59 = (int) d57;
        com.tencent.map.lib.models.GeoPoint geoPoint36 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i19, i59));
        if (a(geoPoint36)) {
            arrayList.add(geoPoint36);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint37 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i28, i59));
        if (a(geoPoint37)) {
            arrayList.add(geoPoint37);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint38 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i29, i59));
        if (a(geoPoint38)) {
            arrayList.add(geoPoint38);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint39 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i37, i59));
        if (a(geoPoint39)) {
            arrayList.add(geoPoint39);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint40 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i38, i59));
        if (a(geoPoint40)) {
            arrayList.add(geoPoint40);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint41 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i39, i59));
        if (a(geoPoint41)) {
            arrayList.add(geoPoint41);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint42 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i47, i59));
        if (a(geoPoint42)) {
            arrayList.add(geoPoint42);
        }
        int i66 = (int) d59;
        com.tencent.map.lib.models.GeoPoint geoPoint43 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i19, i66));
        if (a(geoPoint43)) {
            arrayList.add(geoPoint43);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint44 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i28, i66));
        if (a(geoPoint44)) {
            arrayList.add(geoPoint44);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint45 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i29, i66));
        if (a(geoPoint45)) {
            arrayList.add(geoPoint45);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint46 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i37, i66));
        if (a(geoPoint46)) {
            arrayList.add(geoPoint46);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint47 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i38, i66));
        if (a(geoPoint47)) {
            arrayList.add(geoPoint47);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint48 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i39, i66));
        if (a(geoPoint48)) {
            arrayList.add(geoPoint48);
        }
        com.tencent.map.lib.models.GeoPoint geoPoint49 = new com.tencent.map.lib.models.GeoPoint(new com.tencent.map.lib.models.GeoPoint(i47, i66));
        if (a(geoPoint49)) {
            arrayList.add(geoPoint49);
        }
        return arrayList;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polygon
    public final boolean contains(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> points = getPoints();
        if (points == null || points.size() < 3 || latLng == null) {
            return false;
        }
        int size = points.size() - 1;
        for (int i17 = 0; i17 < points.size(); i17++) {
            if (points.get(i17).equals(latLng)) {
                return true;
            }
        }
        boolean z17 = false;
        int i18 = size;
        for (int i19 = 0; i19 < points.size(); i19++) {
            if (((points.get(i19).latitude < latLng.latitude && points.get(i18).latitude >= latLng.latitude) || (points.get(i18).latitude < latLng.latitude && points.get(i19).latitude >= latLng.latitude)) && (points.get(i19).longitude <= latLng.longitude || points.get(i18).longitude <= latLng.longitude)) {
                z17 ^= points.get(i19).longitude + (((latLng.latitude - points.get(i19).latitude) / (points.get(i18).latitude - points.get(i19).latitude)) * (points.get(i18).longitude - points.get(i19).longitude)) <= latLng.longitude;
            }
            i18 = i19;
        }
        return z17;
    }

    @Override // com.tencent.mapsdk.internal.ap
    public final com.tencent.map.lib.models.GeoPoint d() {
        android.graphics.Rect f17 = f();
        return new com.tencent.map.lib.models.GeoPoint(f17.centerY(), f17.centerX());
    }

    @Override // com.tencent.mapsdk.internal.au
    public final /* bridge */ /* synthetic */ com.tencent.mapsdk.internal.ao f_() {
        return this;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polygon
    public final java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> getPoints() {
        java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list = this.f50715r;
        return list != null ? list : com.tencent.mapsdk.internal.kr.a(this.f50714q);
    }

    @Override // com.tencent.mapsdk.internal.po
    public final void h_() {
        com.tencent.mapsdk.internal.ne neVar = this.f50712J;
        if (neVar == null) {
            return;
        }
        neVar.f50508h.b(this);
        com.tencent.map.lib.models.PolygonInfo polygonInfo = this.f50713b;
        if (polygonInfo != null) {
            this.f50712J.a(polygonInfo.polygonId);
        }
        java.util.List<com.tencent.map.lib.models.GeoPoint> list = this.f50714q;
        if (list != null) {
            list.clear();
        }
        synchronized (this.f50722y) {
            com.tencent.mapsdk.internal.pq.b bVar = this.f50723z;
            if (bVar != null) {
                android.graphics.Bitmap bitmap = bVar.f50728a;
                if (bitmap != null && !bitmap.isRecycled()) {
                    bVar.f50728a.recycle();
                    bVar.f50728a = null;
                }
                this.f50723z = null;
            }
        }
        com.tencent.mapsdk.internal.qx qxVar = this.f50721x;
        if (qxVar != null) {
            this.f50712J.f50510j.b(qxVar);
            this.f50712J.f50522v = true;
            this.f50721x = null;
        }
        this.E = false;
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public final boolean handleOnTap() {
        return true;
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public final boolean isSelected() {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.po
    public final void j_() {
        com.tencent.mapsdk.internal.ne neVar = this.f50712J;
        if (neVar == null) {
            return;
        }
        if (!isVisible()) {
            neVar.a(this.f50713b.polygonId);
            this.f50713b.polygonId = -1;
            return;
        }
        if (com.tencent.mapsdk.internal.hr.a(this.K)) {
            p();
        }
        com.tencent.map.lib.models.PolygonInfo polygonInfo = this.f50713b;
        if (-1 == polygonInfo.polygonId) {
            polygonInfo.polygonId = this.f50712J.a(polygonInfo);
        } else if (v()) {
            this.f50712J.b(this.f50713b);
        }
        com.tencent.mapsdk.internal.qx qxVar = this.f50721x;
        if (qxVar != null) {
            qxVar.j_();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(this.f50721x.a());
            this.A = sb6.toString();
            if (this.F) {
                return;
            }
            int a17 = this.f50721x.a();
            com.tencent.map.lib.models.PolygonInfo polygonInfo2 = this.f50713b;
            neVar.a(a17, polygonInfo2 != null ? polygonInfo2.polygonId : -1);
            this.F = true;
        }
    }

    @Override // com.tencent.mapsdk.internal.ap
    public final int k_() {
        com.tencent.map.lib.models.PolygonInfo polygonInfo = this.f50713b;
        if (polygonInfo == null) {
            return -1;
        }
        return polygonInfo.polygonId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x020d, code lost:
    
        if (r8 <= (r4 / 2.0d)) goto L33;
     */
    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTap(float r16, float r17) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.pq.onTap(float, float):boolean");
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.ev
    public final void p() {
        java.util.List<com.tencent.map.lib.models.GeoPoint> list;
        if (this.f50712J == null) {
            return;
        }
        if ((this.f50713b.polygonId < 0 || v()) && (list = this.f50714q) != null && list.size() > 2) {
            com.tencent.map.lib.models.PolygonInfo polygonInfo = this.f50713b;
            polygonInfo.color = this.f50672f;
            polygonInfo.borderColor = this.f50673g;
            polygonInfo.borderWidth = this.f50671e;
            polygonInfo.zIndex = getZIndex();
            this.f50713b.level = getLevel();
            int size = this.f50714q.size();
            this.f50713b.points = new com.tencent.tencentmap.mapsdk.maps.model.LatLng[size];
            for (int i17 = 0; i17 < size; i17++) {
                this.f50713b.points[i17] = this.f50714q.get(i17).toLatLng();
            }
            int size2 = this.f50716s.size();
            this.f50713b.holePoints = new com.tencent.tencentmap.mapsdk.maps.model.LatLng[size2];
            for (int i18 = 0; i18 < size2; i18++) {
                this.f50713b.holePoints[i18] = (com.tencent.tencentmap.mapsdk.maps.model.LatLng[]) this.f50716s.get(i18).toArray(new com.tencent.tencentmap.mapsdk.maps.model.LatLng[0]);
            }
            this.f50712J.f50522v = true;
            w();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polygon
    public final void setHolePoints(java.util.List<java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng>> list) {
        if (list != null && list.size() > 0) {
            com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions polygonOptions = this.I;
            if (polygonOptions != null) {
                polygonOptions.setHolePoints(list);
            }
            this.f50716s.clear();
            for (java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list2 : list) {
                if (list2 != null && list2.size() >= 3) {
                    this.f50716s.add(list2);
                }
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polygon
    public final void setOptions(com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions polygonOptions) {
        a(polygonOptions);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polygon
    public final void setPoints(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list) {
        int size;
        com.tencent.map.lib.models.GeoPoint from;
        this.f50715r = list;
        if (list != null && (size = list.size()) > 0) {
            com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions polygonOptions = this.I;
            if (polygonOptions != null) {
                polygonOptions.setPoints(new java.util.ArrayList(list));
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i17 = 0; i17 < size; i17++) {
                com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = list.get(i17);
                if (latLng != null && (from = com.tencent.map.lib.models.GeoPoint.from(latLng)) != null) {
                    arrayList.add(from);
                }
            }
            a(arrayList);
        }
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public final void setSelected(boolean z17) {
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public final void setSelectedListener(com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable.OnSelectedListener onSelectedListener) {
    }

    private static boolean a(double d17, double d18, double d19, double d27, double d28, double d29, double d37) {
        double d38 = d19 - d17;
        double d39 = d37 - d29;
        double d47 = d27 - d18;
        double d48 = 180.0d - d28;
        double d49 = (d38 * d39) - (d47 * d48);
        if (d49 != 0.0d) {
            double d57 = d18 - d29;
            double d58 = d17 - d28;
            double d59 = ((d48 * d57) - (d39 * d58)) / d49;
            double d66 = ((d57 * d38) - (d58 * d47)) / d49;
            if (d59 >= 0.0d && d59 <= 1.0d && d66 >= 0.0d && d66 <= 1.0d) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(double d17, double d18, double d19, double d27, double d28, double d29) {
        return java.lang.Math.abs(a(d17, d18, d19, d27, d28, d29)) < 1.0E-9d && (d17 - d19) * (d17 - d28) <= 0.0d && (d18 - d27) * (d18 - d29) <= 0.0d;
    }

    private void a(java.util.List<com.tencent.map.lib.models.GeoPoint> list) {
        if (list.isEmpty()) {
            return;
        }
        java.util.List<com.tencent.map.lib.models.GeoPoint> list2 = this.f50714q;
        if (list2 == null) {
            this.f50714q = new java.util.ArrayList();
        } else {
            list2.clear();
        }
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.tencent.map.lib.models.GeoPoint geoPoint = list.get(i17);
            if (geoPoint != null) {
                w();
                this.f50714q.add(geoPoint);
            }
        }
    }

    private void d(com.tencent.mapsdk.internal.ey eyVar) {
        if (this.f50712J == null || com.tencent.mapsdk.internal.hr.a(this.K)) {
            return;
        }
        synchronized (this.f50722y) {
            byte b17 = 0;
            if (this.f50723z == null) {
                this.f50723z = new com.tencent.mapsdk.internal.pq.b(b17);
            }
        }
        android.graphics.Rect rect = this.C;
        com.tencent.map.lib.models.GeoPoint geoPoint = new com.tencent.map.lib.models.GeoPoint(rect.top, rect.left);
        android.graphics.Rect rect2 = this.C;
        com.tencent.map.lib.models.GeoPoint geoPoint2 = new com.tencent.map.lib.models.GeoPoint(rect2.top, rect2.right);
        android.graphics.Rect rect3 = this.C;
        com.tencent.map.lib.models.GeoPoint geoPoint3 = new com.tencent.map.lib.models.GeoPoint(rect3.bottom, rect3.right);
        android.graphics.Rect rect4 = this.C;
        com.tencent.mapsdk.internal.fu[] a17 = a(new com.tencent.mapsdk.internal.fu[]{eyVar.a(geoPoint), eyVar.a(geoPoint2), eyVar.a(geoPoint3), eyVar.a(new com.tencent.map.lib.models.GeoPoint(rect4.bottom, rect4.left))});
        com.tencent.mapsdk.internal.fu fuVar = a17[0];
        int i17 = (int) fuVar.f49467a;
        int i18 = (int) fuVar.f49468b;
        com.tencent.mapsdk.internal.fu fuVar2 = a17[1];
        new android.graphics.Rect(i17, i18, (int) fuVar2.f49467a, (int) fuVar2.f49468b);
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: b */
    public final android.graphics.Rect getBound(com.tencent.mapsdk.internal.ey eyVar) {
        android.graphics.Rect rect = new android.graphics.Rect();
        new android.graphics.Rect();
        if (this.f50713b != null) {
            rect = f();
        }
        com.tencent.mapsdk.internal.qx qxVar = this.f50721x;
        if (qxVar != null) {
            android.graphics.Rect bound = qxVar.getBound(eyVar);
            rect.left = java.lang.Math.min(rect.left, bound.left);
            rect.top = java.lang.Math.min(rect.top, bound.top);
            rect.right = java.lang.Math.max(rect.right, bound.right);
            rect.bottom = java.lang.Math.max(rect.bottom, bound.bottom);
        }
        return rect;
    }

    private int e(com.tencent.mapsdk.internal.ey eyVar) {
        android.graphics.Rect rect = this.C;
        com.tencent.map.lib.models.GeoPoint geoPoint = new com.tencent.map.lib.models.GeoPoint(rect.top, rect.left);
        android.graphics.Rect rect2 = this.C;
        com.tencent.map.lib.models.GeoPoint geoPoint2 = new com.tencent.map.lib.models.GeoPoint(rect2.top, rect2.right);
        android.graphics.Rect rect3 = this.C;
        com.tencent.map.lib.models.GeoPoint geoPoint3 = new com.tencent.map.lib.models.GeoPoint(rect3.bottom, rect3.right);
        android.graphics.Rect rect4 = this.C;
        com.tencent.mapsdk.internal.fu[] a17 = a(new com.tencent.mapsdk.internal.fu[]{eyVar.a(geoPoint), eyVar.a(geoPoint2), eyVar.a(geoPoint3), eyVar.a(new com.tencent.map.lib.models.GeoPoint(rect4.bottom, rect4.left))});
        com.tencent.mapsdk.internal.fu fuVar = a17[0];
        int i17 = (int) fuVar.f49467a;
        int i18 = (int) fuVar.f49468b;
        com.tencent.mapsdk.internal.fu fuVar2 = a17[1];
        new android.graphics.Rect(i17, i18, (int) fuVar2.f49467a, (int) fuVar2.f49468b);
        return 1;
    }

    /* loaded from: classes10.dex */
    public static class b {

        /* renamed from: b, reason: collision with root package name */
        private static final int f50726b = 900;

        /* renamed from: c, reason: collision with root package name */
        private static final int f50727c = 180;

        /* renamed from: a, reason: collision with root package name */
        android.graphics.Bitmap f50728a;

        /* renamed from: d, reason: collision with root package name */
        private android.text.TextPaint f50729d;

        /* renamed from: e, reason: collision with root package name */
        private int f50730e;

        /* renamed from: f, reason: collision with root package name */
        private int f50731f;

        /* renamed from: g, reason: collision with root package name */
        private int f50732g;

        /* renamed from: h, reason: collision with root package name */
        private java.util.HashMap<java.lang.String, java.lang.Integer> f50733h;

        private b() {
            this.f50728a = null;
            this.f50729d = null;
            this.f50730e = f50726b;
            this.f50731f = 180;
            this.f50732g = -1;
            this.f50733h = new java.util.HashMap<>();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private int a(android.graphics.Rect r9, java.lang.String r10, int r11, android.graphics.Typeface r12, int r13, int r14) {
            /*
                r8 = this;
                if (r9 != 0) goto L3
                return r14
            L3:
                int r0 = r9.height()
                int r0 = java.lang.Math.abs(r0)
                int r9 = r9.width()
                int r9 = java.lang.Math.abs(r9)
                android.graphics.Rect r1 = new android.graphics.Rect
                r2 = 0
                r1.<init>(r2, r2, r2, r2)
                r8.a(r13, r11, r12)
                r11 = 1065353216(0x3f800000, float:1.0)
                float r12 = com.tencent.mapsdk.internal.hn.o()
                float r11 = r11 / r12
                double r11 = (double) r11
                double r11 = java.lang.Math.ceil(r11)
                int r11 = (int) r11
                int r12 = r13 / 2
                int[] r3 = r8.a(r10, r12, r1)
                r4 = r3[r2]
                r5 = 1
                r3 = r3[r5]
                if (r4 > r9) goto L4c
                if (r3 > r0) goto L4c
            L38:
                int r3 = r12 + r11
                r7 = r3
                r3 = r12
                r12 = r7
                if (r12 >= r13) goto L60
                int[] r4 = r8.a(r10, r12, r1)
                r6 = r4[r2]
                r4 = r4[r5]
                if (r6 > r9) goto L60
                if (r4 > r0) goto L60
                goto L38
            L4c:
                int r12 = r12 - r11
                r3 = r12
            L4e:
                if (r3 < r14) goto L5f
                int[] r12 = r8.a(r10, r3, r1)
                r4 = r12[r2]
                r12 = r12[r5]
                if (r4 > r9) goto L5d
                if (r12 > r0) goto L5d
                goto L60
            L5d:
                int r3 = r3 - r11
                goto L4e
            L5f:
                r3 = r14
            L60:
                if (r3 >= r14) goto L63
                goto L64
            L63:
                r14 = r3
            L64:
                if (r14 <= r13) goto L67
                goto L68
            L67:
                r13 = r14
            L68:
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.pq.b.a(android.graphics.Rect, java.lang.String, int, android.graphics.Typeface, int, int):int");
        }

        public /* synthetic */ b(byte b17) {
            this();
        }

        private int[] a(java.lang.String str, int i17, android.graphics.Rect rect) {
            a(i17);
            this.f50729d.getTextBounds(str, 0, str.length(), rect);
            return new int[]{java.lang.Math.abs(rect.width()), java.lang.Math.abs(rect.height())};
        }

        private void a() {
            android.graphics.Bitmap bitmap = this.f50728a;
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            this.f50728a.recycle();
            this.f50728a = null;
        }

        private void a(java.lang.String str, int i17, int i18, android.graphics.Typeface typeface) {
            if (this.f50728a == null) {
                try {
                    this.f50728a = android.graphics.Bitmap.createBitmap(this.f50730e, this.f50731f, android.graphics.Bitmap.Config.ARGB_8888);
                } catch (java.lang.OutOfMemoryError unused) {
                    return;
                }
            }
            a(i17, i18, typeface);
            android.graphics.Rect rect = new android.graphics.Rect();
            this.f50729d.getTextBounds(str, 0, str.length(), rect);
            int abs = java.lang.Math.abs(rect.width());
            int abs2 = java.lang.Math.abs(rect.height());
            int i19 = this.f50730e;
            if (abs > i19 || abs2 > this.f50731f) {
                this.f50730e = java.lang.Math.max(abs, i19);
                int max = java.lang.Math.max(abs2, this.f50731f);
                this.f50731f = max;
                this.f50728a = android.graphics.Bitmap.createBitmap(this.f50730e, max, android.graphics.Bitmap.Config.ARGB_8888);
            }
            this.f50728a.eraseColor(0);
            new android.graphics.Canvas(this.f50728a).drawText(str, this.f50730e / 2.0f, (this.f50731f / 2.0f) - ((this.f50729d.descent() + this.f50729d.ascent()) / 2.0f), this.f50729d);
        }

        private void a(int i17, int i18, android.graphics.Typeface typeface) {
            if (this.f50729d == null) {
                android.text.TextPaint textPaint = new android.text.TextPaint(65);
                this.f50729d = textPaint;
                textPaint.setStyle(android.graphics.Paint.Style.FILL);
                this.f50729d.setTextAlign(android.graphics.Paint.Align.CENTER);
            }
            this.f50729d.setColor(i18);
            this.f50729d.setTextSize(i17);
            this.f50729d.setTypeface(typeface);
        }

        private void a(int i17) {
            android.text.TextPaint textPaint = this.f50729d;
            if (textPaint != null) {
                textPaint.setTextSize(i17);
            }
        }

        private static java.lang.String a(java.lang.String str, java.lang.String str2, int i17) {
            return str + "_" + str2 + "_" + i17;
        }

        private java.lang.Object[] a(java.lang.String str, java.lang.String str2, int i17, int i18, android.graphics.Typeface typeface) {
            java.lang.String str3 = str + "_" + str2 + "_" + i17;
            if (i17 > 180) {
                i17 = 180;
            }
            if (i17 != this.f50732g) {
                if (this.f50728a == null) {
                    try {
                        this.f50728a = android.graphics.Bitmap.createBitmap(this.f50730e, this.f50731f, android.graphics.Bitmap.Config.ARGB_8888);
                    } catch (java.lang.OutOfMemoryError unused) {
                    }
                }
                a(i17, i18, typeface);
                android.graphics.Rect rect = new android.graphics.Rect();
                this.f50729d.getTextBounds(str2, 0, str2.length(), rect);
                int abs = java.lang.Math.abs(rect.width());
                int abs2 = java.lang.Math.abs(rect.height());
                int i19 = this.f50730e;
                if (abs > i19 || abs2 > this.f50731f) {
                    this.f50730e = java.lang.Math.max(abs, i19);
                    int max = java.lang.Math.max(abs2, this.f50731f);
                    this.f50731f = max;
                    this.f50728a = android.graphics.Bitmap.createBitmap(this.f50730e, max, android.graphics.Bitmap.Config.ARGB_8888);
                }
                this.f50728a.eraseColor(0);
                new android.graphics.Canvas(this.f50728a).drawText(str2, this.f50730e / 2.0f, (this.f50731f / 2.0f) - ((this.f50729d.descent() + this.f50729d.ascent()) / 2.0f), this.f50729d);
                this.f50732g = i17;
            }
            return new java.lang.Object[]{str3, this.f50728a};
        }
    }

    @Override // com.tencent.mapsdk.internal.ap
    public final void a(com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions polygonOptions) {
        if (polygonOptions == null) {
            return;
        }
        setFillColor(polygonOptions.getFillColor());
        setStrokeColor(polygonOptions.getStrokeColor());
        setStrokeWidth(polygonOptions.getStrokeWidth());
        setZIndex(polygonOptions.getZIndex());
        setVisible(polygonOptions.isVisible());
        setLevel(polygonOptions.getLevel());
        setClickable(polygonOptions.isClickable());
        setPoints(polygonOptions.getPoints());
        java.util.List<java.lang.Integer> pattern = polygonOptions.getPattern();
        if (pattern != null && !pattern.isEmpty()) {
            int[] iArr = new int[pattern.size()];
            for (int i17 = 0; i17 < pattern.size(); i17++) {
                iArr[i17] = pattern.get(i17).intValue();
            }
            this.f50713b.pattern = iArr;
        }
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor texture = polygonOptions.getTexture();
        if (this.L != texture) {
            this.L = texture;
            texture.getBitmap(this.f50712J.getContext());
            this.f50713b.textureName = this.L.getFormater().getBitmapId();
        }
        this.f50713b.textureSpacing = polygonOptions.getTextureSpacing();
        this.f50716s = polygonOptions.getHolePoints();
        w();
    }

    @Override // com.tencent.mapsdk.internal.fm
    public final void b(int i17) {
        com.tencent.mapsdk.internal.ne neVar;
        if (i17 == com.tencent.mapsdk.internal.gf.f49575a || (neVar = this.f50712J) == null) {
            return;
        }
        com.tencent.mapsdk.internal.ey eyVar = neVar.f50513m;
        if (neVar == null || com.tencent.mapsdk.internal.hr.a(this.K)) {
            return;
        }
        synchronized (this.f50722y) {
            byte b17 = 0;
            if (this.f50723z == null) {
                this.f50723z = new com.tencent.mapsdk.internal.pq.b(b17);
            }
        }
        android.graphics.Rect rect = this.C;
        com.tencent.map.lib.models.GeoPoint geoPoint = new com.tencent.map.lib.models.GeoPoint(rect.top, rect.left);
        android.graphics.Rect rect2 = this.C;
        com.tencent.map.lib.models.GeoPoint geoPoint2 = new com.tencent.map.lib.models.GeoPoint(rect2.top, rect2.right);
        android.graphics.Rect rect3 = this.C;
        com.tencent.map.lib.models.GeoPoint geoPoint3 = new com.tencent.map.lib.models.GeoPoint(rect3.bottom, rect3.right);
        android.graphics.Rect rect4 = this.C;
        com.tencent.mapsdk.internal.fu[] a17 = a(new com.tencent.mapsdk.internal.fu[]{eyVar.a(geoPoint), eyVar.a(geoPoint2), eyVar.a(geoPoint3), eyVar.a(new com.tencent.map.lib.models.GeoPoint(rect4.bottom, rect4.left))});
        com.tencent.mapsdk.internal.fu fuVar = a17[0];
        int i18 = (int) fuVar.f49467a;
        int i19 = (int) fuVar.f49468b;
        com.tencent.mapsdk.internal.fu fuVar2 = a17[1];
        new android.graphics.Rect(i18, i19, (int) fuVar2.f49467a, (int) fuVar2.f49468b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0138, code lost:
    
        r18 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(com.tencent.mapsdk.internal.gc r22) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.pq.a(com.tencent.mapsdk.internal.gc):boolean");
    }

    private boolean a(android.graphics.Rect rect) {
        android.graphics.Rect rect2 = this.f50720w;
        if (rect2 == null || rect == null) {
            return false;
        }
        double abs = java.lang.Math.abs(((rect2.left + rect2.right) / 2) - ((rect.left + rect.right) / 2));
        android.graphics.Rect rect3 = this.f50720w;
        double abs2 = java.lang.Math.abs(((rect3.top + rect3.bottom) / 2) - ((rect.top + rect.bottom) / 2));
        android.graphics.Rect rect4 = this.f50720w;
        double abs3 = java.lang.Math.abs(rect4.left - rect4.right) + java.lang.Math.abs(rect.left - rect.right);
        android.graphics.Rect rect5 = this.f50720w;
        return abs <= abs3 / 2.0d && abs2 <= ((double) (java.lang.Math.abs(rect5.top - rect5.bottom) + java.lang.Math.abs(rect.top - rect.bottom))) / 2.0d;
    }

    private boolean a(com.tencent.map.lib.models.GeoPoint geoPoint) {
        java.util.List<com.tencent.map.lib.models.GeoPoint> list = this.f50714q;
        if (list == null || list.size() <= 1) {
            return false;
        }
        double longitudeE6 = geoPoint.getLongitudeE6();
        double latitudeE6 = geoPoint.getLatitudeE6();
        int size = this.f50714q.size();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int i19 = size - 1;
            if (i17 < i19) {
                com.tencent.map.lib.models.GeoPoint geoPoint2 = this.f50714q.get(i17);
                int i27 = i17 + 1;
                com.tencent.map.lib.models.GeoPoint geoPoint3 = this.f50714q.get(i27);
                double longitudeE62 = geoPoint2.getLongitudeE6();
                double latitudeE62 = geoPoint2.getLatitudeE6();
                double longitudeE63 = geoPoint3.getLongitudeE6();
                double latitudeE63 = geoPoint3.getLatitudeE6();
                double d17 = latitudeE6;
                double d18 = longitudeE6;
                if (b(longitudeE6, latitudeE6, longitudeE62, latitudeE62, longitudeE63, latitudeE63)) {
                    return true;
                }
                if (java.lang.Math.abs(latitudeE63 - latitudeE62) >= 1.0E-9d) {
                    if (b(longitudeE62, latitudeE62, d18, d17, 180.0d, d17)) {
                        if (latitudeE62 <= latitudeE63) {
                        }
                        i18++;
                    } else if (b(longitudeE63, latitudeE63, d18, d17, 180.0d, d17)) {
                        if (latitudeE63 <= latitudeE62) {
                        }
                        i18++;
                    } else {
                        if (!a(longitudeE62, latitudeE62, longitudeE63, latitudeE63, d18, d17, d17)) {
                        }
                        i18++;
                    }
                }
                i17 = i27;
                latitudeE6 = d17;
                longitudeE6 = d18;
            } else {
                double d19 = latitudeE6;
                double d27 = longitudeE6;
                com.tencent.map.lib.models.GeoPoint geoPoint4 = this.f50714q.get(i19);
                com.tencent.map.lib.models.GeoPoint geoPoint5 = this.f50714q.get(0);
                double longitudeE64 = geoPoint4.getLongitudeE6();
                double latitudeE64 = geoPoint4.getLatitudeE6();
                double longitudeE65 = geoPoint5.getLongitudeE6();
                double latitudeE65 = geoPoint5.getLatitudeE6();
                if (b(d27, d19, longitudeE64, latitudeE64, longitudeE65, latitudeE65)) {
                    return true;
                }
                if (java.lang.Math.abs(latitudeE65 - latitudeE64) >= 1.0E-9d && (!b(longitudeE64, latitudeE64, d27, d19, 180.0d, d19) ? !(!b(longitudeE65, latitudeE65, d27, d19, 180.0d, d19) ? !a(longitudeE64, latitudeE64, longitudeE65, latitudeE65, d27, d19, d19) : latitudeE65 <= latitudeE64) : latitudeE64 > latitudeE65)) {
                    i18++;
                }
                return i18 % 2 == 1;
            }
        }
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

    private static com.tencent.mapsdk.internal.fu[] a(com.tencent.mapsdk.internal.fu[] fuVarArr) {
        com.tencent.mapsdk.internal.fu fuVar = fuVarArr[0];
        double d17 = fuVar.f49467a;
        double d18 = fuVar.f49468b;
        double d19 = d18;
        double d27 = d19;
        double d28 = d17;
        for (int i17 = 1; i17 < 4; i17++) {
            com.tencent.mapsdk.internal.fu fuVar2 = fuVarArr[i17];
            double d29 = fuVar2.f49467a;
            double d37 = fuVar2.f49468b;
            if (d29 < d17) {
                d17 = d29;
            }
            if (d29 > d28) {
                d28 = d29;
            }
            if (d37 < d19) {
                d19 = d37;
            }
            if (d37 > d27) {
                d27 = d37;
            }
        }
        return new com.tencent.mapsdk.internal.fu[]{new com.tencent.mapsdk.internal.fu(d17, d19), new com.tencent.mapsdk.internal.fu(d28, d27)};
    }

    private android.graphics.Rect a(com.tencent.mapsdk.internal.pq.a[] aVarArr) {
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(0.0d, 0.0d);
        double a17 = a(aVarArr, latLng);
        double d17 = latLng.longitude;
        double d18 = latLng.latitude;
        return new android.graphics.Rect((int) ((d17 + a17) * 1000000.0d), (int) ((d18 + a17) * 1000000.0d), (int) ((d17 - a17) * 1000000.0d), (int) ((d18 - a17) * 1000000.0d));
    }

    private double a(com.tencent.mapsdk.internal.pq.a[] aVarArr, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> a17;
        java.util.List<com.tencent.map.lib.models.GeoPoint> c17 = c();
        if (c17.isEmpty() || (a17 = com.tencent.mapsdk.internal.kr.a(c17)) == null || a17.isEmpty()) {
            return 0.0d;
        }
        int size = a17.size();
        com.tencent.tencentmap.mapsdk.maps.model.LatLng[] latLngArr = new com.tencent.tencentmap.mapsdk.maps.model.LatLng[size];
        double[] dArr = new double[size];
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            latLngArr[i18] = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(0.0d, 0.0d);
            double a18 = a(a17.get(i18), aVarArr, latLngArr[i18]);
            dArr[i18] = a18;
            if (java.lang.Double.isNaN(a18)) {
                dArr[i18] = 0.0d;
            }
        }
        double d17 = dArr[0];
        for (int i19 = 1; i19 < size; i19++) {
            double d18 = dArr[i19];
            if (d18 > d17) {
                i17 = i19;
                d17 = d18;
            }
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2 = latLngArr[i17];
        latLng.latitude = latLng2.latitude;
        latLng.longitude = latLng2.longitude;
        return dArr[i17];
    }

    private static double a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.mapsdk.internal.pq.a[] aVarArr, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2) {
        boolean z17;
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng3 = latLng;
        com.tencent.mapsdk.internal.pq.a[] aVarArr2 = aVarArr;
        int length = aVarArr2.length;
        double d17 = 0.0d;
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng4 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(0.0d, 0.0d);
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng5 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(0.0d, 0.0d);
        com.tencent.tencentmap.mapsdk.maps.model.LatLng[] latLngArr = aVarArr2[0].f50724a;
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng6 = latLngArr[0];
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng7 = latLngArr[1];
        double a17 = com.tencent.mapsdk.internal.li.a((com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate) latLng3, (com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate) latLng6, (com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate) latLng7);
        latLng4.latitude = latLng6.latitude;
        latLng4.longitude = latLng6.longitude;
        latLng5.latitude = latLng7.latitude;
        latLng5.longitude = latLng7.longitude;
        for (int i17 = 1; i17 < length; i17++) {
            com.tencent.tencentmap.mapsdk.maps.model.LatLng[] latLngArr2 = aVarArr2[i17].f50724a;
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng8 = latLngArr2[0];
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng9 = latLngArr2[1];
            double a18 = com.tencent.mapsdk.internal.li.a((com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate) latLng3, (com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate) latLng8, (com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate) latLng9);
            if (a18 < a17) {
                latLng4.latitude = latLng8.latitude;
                latLng4.longitude = latLng8.longitude;
                latLng5.latitude = latLng9.latitude;
                latLng5.longitude = latLng9.longitude;
                a17 = a18;
            }
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLng a19 = com.tencent.mapsdk.internal.li.a(latLng3, latLng4, latLng5);
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng10 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(0.0d, 0.0d);
        boolean z18 = false;
        int i18 = 0;
        int i19 = 0;
        while (!z18) {
            com.tencent.tencentmap.mapsdk.maps.model.LatLng a27 = com.tencent.mapsdk.internal.li.a(latLng3, a19, i18);
            double a28 = com.tencent.mapsdk.internal.li.a((com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate) a27, (com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate) a19);
            int i27 = 0;
            while (true) {
                if (i27 >= length) {
                    z17 = true;
                    break;
                }
                com.tencent.tencentmap.mapsdk.maps.model.LatLng[] latLngArr3 = aVarArr2[i27].f50724a;
                z17 = true;
                if (com.tencent.mapsdk.internal.li.a(a27, a28, latLngArr3[0], latLngArr3[1])) {
                    z18 = true;
                    break;
                }
                i27++;
                aVarArr2 = aVarArr;
            }
            if (!z18) {
                latLng10.latitude = a27.latitude;
                latLng10.longitude = a27.longitude;
                i18 += 5;
            } else if (i19 == 0) {
                latLng10.latitude = a27.latitude;
                latLng10.longitude = a27.longitude;
            } else {
                i19++;
                latLng3 = latLng;
                aVarArr2 = aVarArr;
            }
            d17 = a28;
            i19++;
            latLng3 = latLng;
            aVarArr2 = aVarArr;
        }
        latLng2.latitude = latLng10.latitude;
        latLng2.longitude = latLng10.longitude;
        return d17;
    }

    private boolean c(com.tencent.mapsdk.internal.ey eyVar) {
        com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions polygonOptions;
        android.graphics.Rect f17;
        if (this.f50713b == null || (polygonOptions = this.I) == null || !polygonOptions.isValid() || (f17 = f()) == null) {
            return false;
        }
        com.tencent.mapsdk.internal.fu[] a17 = a(new com.tencent.mapsdk.internal.fu[]{eyVar.a(new com.tencent.map.lib.models.GeoPoint(f17.top, f17.left)), eyVar.a(new com.tencent.map.lib.models.GeoPoint(f17.top, f17.right)), eyVar.a(new com.tencent.map.lib.models.GeoPoint(f17.bottom, f17.right)), eyVar.a(new com.tencent.map.lib.models.GeoPoint(f17.bottom, f17.left))});
        com.tencent.mapsdk.internal.fu fuVar = a17[0];
        int i17 = (int) fuVar.f49467a;
        int i18 = (int) fuVar.f49468b;
        com.tencent.mapsdk.internal.fu fuVar2 = a17[1];
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, (int) fuVar2.f49467a, (int) fuVar2.f49468b);
        return java.lang.Math.abs(rect.width()) > 5 && java.lang.Math.abs(rect.height()) > 5;
    }

    private int a(com.tencent.map.lib.models.GeoPoint geoPoint, com.tencent.mapsdk.internal.ey eyVar) {
        java.util.List<com.tencent.map.lib.models.GeoPoint> list = this.f50714q;
        java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> a17 = com.tencent.mapsdk.internal.kr.a(list);
        int size = list.size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            int i18 = size - 1;
            if (i17 < i18) {
                com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = a17.get(i17);
                i17++;
                arrayList.add(new com.tencent.mapsdk.internal.pq.a(latLng, a17.get(i17)));
            } else {
                arrayList.add(new com.tencent.mapsdk.internal.pq.a(a17.get(i18), a17.get(0)));
                com.tencent.mapsdk.internal.pq.a[] aVarArr = (com.tencent.mapsdk.internal.pq.a[]) arrayList.toArray(new com.tencent.mapsdk.internal.pq.a[arrayList.size()]);
                com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(0.0d, 0.0d);
                double a18 = a(aVarArr, latLng2);
                double d17 = latLng2.longitude;
                double d18 = latLng2.latitude;
                android.graphics.Rect rect = new android.graphics.Rect((int) ((d17 + a18) * 1000000.0d), (int) ((d18 + a18) * 1000000.0d), (int) ((d17 - a18) * 1000000.0d), (int) ((d18 - a18) * 1000000.0d));
                this.C = rect;
                geoPoint.setLatitudeE6(rect.centerY());
                geoPoint.setLongitudeE6(this.C.centerX());
                android.graphics.Rect rect2 = this.C;
                com.tencent.map.lib.models.GeoPoint geoPoint2 = new com.tencent.map.lib.models.GeoPoint(rect2.top, rect2.left);
                android.graphics.Rect rect3 = this.C;
                com.tencent.map.lib.models.GeoPoint geoPoint3 = new com.tencent.map.lib.models.GeoPoint(rect3.top, rect3.right);
                android.graphics.Rect rect4 = this.C;
                com.tencent.map.lib.models.GeoPoint geoPoint4 = new com.tencent.map.lib.models.GeoPoint(rect4.bottom, rect4.right);
                android.graphics.Rect rect5 = this.C;
                com.tencent.mapsdk.internal.fu[] a19 = a(new com.tencent.mapsdk.internal.fu[]{eyVar.a(geoPoint2), eyVar.a(geoPoint3), eyVar.a(geoPoint4), eyVar.a(new com.tencent.map.lib.models.GeoPoint(rect5.bottom, rect5.left))});
                com.tencent.mapsdk.internal.fu fuVar = a19[0];
                int i19 = (int) fuVar.f49467a;
                int i27 = (int) fuVar.f49468b;
                com.tencent.mapsdk.internal.fu fuVar2 = a19[1];
                new android.graphics.Rect(i19, i27, (int) fuVar2.f49467a, (int) fuVar2.f49468b);
                return 1;
            }
        }
    }
}
