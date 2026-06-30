package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class pl extends com.tencent.mapsdk.internal.po<com.tencent.mapsdk.internal.ag> implements com.tencent.mapsdk.internal.ag {

    /* renamed from: b, reason: collision with root package name */
    com.tencent.mapsdk.internal.aq f50632b;

    /* renamed from: d, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.ne f50633d;

    /* renamed from: p, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.LatLng f50634p;

    /* renamed from: q, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.LatLng f50635q;

    /* renamed from: r, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.LatLng f50636r;

    /* renamed from: s, reason: collision with root package name */
    private float f50637s;

    /* renamed from: t, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.LatLng f50638t;

    /* renamed from: u, reason: collision with root package name */
    private double f50639u;

    /* renamed from: v, reason: collision with root package name */
    private double f50640v;

    /* renamed from: w, reason: collision with root package name */
    private int f50641w;

    /* renamed from: x, reason: collision with root package name */
    private float f50642x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f50643y;

    public pl(com.tencent.tencentmap.mapsdk.maps.model.ArcOptions arcOptions, com.tencent.mapsdk.internal.az azVar) {
        super(azVar);
        this.f50641w = -16776961;
        this.f50642x = 10.0f;
        com.tencent.mapsdk.internal.ne b17 = azVar.b();
        this.f50633d = b17;
        if (b17 == null || arcOptions == null) {
            return;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLng startLatLng = arcOptions.getStartLatLng();
        com.tencent.tencentmap.mapsdk.maps.model.LatLng passLatLng = arcOptions.getPassLatLng();
        com.tencent.tencentmap.mapsdk.maps.model.LatLng endLatLng = arcOptions.getEndLatLng();
        float angle = arcOptions.getAngle() >= 0.0f ? arcOptions.getAngle() % 360.0f : (arcOptions.getAngle() % 360.0f) + 360.0f;
        if (startLatLng == null || endLatLng == null || startLatLng.equals(endLatLng)) {
            return;
        }
        if (passLatLng == null && (angle == 0.0f || angle == 180.0f)) {
            return;
        }
        if (passLatLng == null || !(passLatLng.equals(startLatLng) || passLatLng.equals(endLatLng))) {
            if (this.f50634p != startLatLng) {
                this.f50634p = startLatLng;
                w();
            }
            if (this.f50635q != endLatLng) {
                this.f50635q = endLatLng;
                w();
            }
            if (this.f50636r != passLatLng) {
                this.f50636r = passLatLng;
                w();
            }
            if (this.f50637s != angle) {
                this.f50637s = angle;
                w();
            }
            setColor(arcOptions.getColor());
            setWidth(arcOptions.getWidth());
            setStrokeWidth(arcOptions.getStrokeWidth());
            setStrokeColor(arcOptions.getStrokeColor());
            this.f50643y = arcOptions.isShowArrow();
            if (v()) {
                e();
            }
        }
    }

    private void b(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        if (this.f50635q != latLng) {
            this.f50635q = latLng;
            w();
        }
    }

    private void c(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        if (this.f50636r != latLng) {
            this.f50636r = latLng;
            w();
        }
    }

    private com.tencent.mapsdk.internal.ag d() {
        return this;
    }

    private void e() {
        double a17;
        boolean z17;
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = this.f50634p;
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2 = this.f50636r;
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng3 = this.f50635q;
        float f17 = this.f50637s;
        com.tencent.mapsdk.internal.gc b17 = this.f50633d.f50513m.b(latLng);
        com.tencent.mapsdk.internal.gc b18 = this.f50633d.f50513m.b(latLng3);
        com.tencent.mapsdk.internal.gc gcVar = new com.tencent.mapsdk.internal.gc(0.0d, 0.0d);
        if (f17 == 0.0f) {
            com.tencent.mapsdk.internal.gc b19 = this.f50633d.f50513m.b(latLng2);
            double a18 = com.tencent.mapsdk.internal.li.a(b17, b19, b18, gcVar);
            z17 = com.tencent.mapsdk.internal.li.a(b17.x(), b17.y(), b18.x(), b18.y(), b19.x(), b19.y()) > 0.0d;
            a17 = a18;
        } else {
            boolean z18 = f17 < 180.0f;
            if (f17 > 180.0f) {
                f17 = 360.0f - f17;
            }
            a17 = com.tencent.mapsdk.internal.li.a(b17, b18, f17 * 2.0f, z18, gcVar);
            z17 = z18;
        }
        this.f50638t = this.f50633d.f50513m.a(gcVar);
        this.f50639u = com.tencent.mapsdk.internal.li.b(b17, b18, gcVar);
        this.f50640v = com.tencent.mapsdk.internal.li.a(b17, gcVar);
        final com.tencent.tencentmap.mapsdk.maps.model.LatLng[] latLngArr = new com.tencent.tencentmap.mapsdk.maps.model.LatLng[com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1];
        com.tencent.mapsdk.internal.li.a(gcVar, a17, b17, b18, z17, new com.tencent.map.tools.IndexCallback<android.util.Pair<java.lang.Double, java.lang.Double>>() { // from class: com.tencent.mapsdk.internal.pl.1
            private void a(int i17, android.util.Pair<java.lang.Double, java.lang.Double> pair) {
                latLngArr[i17] = com.tencent.mapsdk.internal.pl.this.f50633d.f50513m.a(new com.tencent.mapsdk.internal.gc(((java.lang.Double) pair.first).doubleValue(), ((java.lang.Double) pair.second).doubleValue()));
            }

            @Override // com.tencent.map.tools.IndexCallback
            public final /* synthetic */ void callback(int i17, android.util.Pair<java.lang.Double, java.lang.Double> pair) {
                android.util.Pair<java.lang.Double, java.lang.Double> pair2 = pair;
                latLngArr[i17] = com.tencent.mapsdk.internal.pl.this.f50633d.f50513m.a(new com.tencent.mapsdk.internal.gc(((java.lang.Double) pair2.first).doubleValue(), ((java.lang.Double) pair2.second).doubleValue()));
            }
        });
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.f50634p);
        for (int i17 = 0; i17 < 360; i17++) {
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng4 = latLngArr[i17];
            if (latLng4 != null) {
                arrayList.add(latLng4);
            }
        }
        arrayList.add(this.f50635q);
        com.tencent.mapsdk.internal.aq aqVar = this.f50632b;
        if (aqVar != null) {
            aqVar.remove();
        }
        com.tencent.tencentmap.mapsdk.maps.model.Polyline a19 = this.f50633d.a(new com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions().addAll(arrayList).color(this.f50641w).width(this.f50642x).borderWidth(getStrokeWidth()).borderColor(getStrokeColor()).zIndex(getZIndex()).level(getLevel()).arrow(this.f50643y).lineCap(true));
        if (a19 instanceof com.tencent.mapsdk.internal.ax) {
            this.f50632b = ((com.tencent.mapsdk.internal.ax) a19).f48874j;
        }
        this.f50633d.f50522v = true;
    }

    @Override // com.tencent.mapsdk.internal.au
    public final /* bridge */ /* synthetic */ com.tencent.mapsdk.internal.ao f_() {
        return this;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Arc
    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng getCenter() {
        return this.f50638t;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Colorable
    public final int getColor() {
        return this.f50641w;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Arc
    public final double getLength() {
        return this.f50639u;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Arc
    public final double getRadius() {
        return this.f50640v;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Widthable
    public final float getWidth() {
        return this.f50642x;
    }

    @Override // com.tencent.mapsdk.internal.po
    public final void h_() {
        super.h_();
        com.tencent.mapsdk.internal.aq aqVar = this.f50632b;
        if (aqVar != null) {
            aqVar.remove();
            this.f50632b = null;
        }
    }

    @Override // com.tencent.mapsdk.internal.po
    public final void j_() {
        if (this.f50633d == null || this.f50632b == null) {
            return;
        }
        if (!isVisible()) {
            this.f50632b.remove();
            return;
        }
        if (v()) {
            e();
            com.tencent.mapsdk.internal.aq aqVar = this.f50632b;
            if (aqVar instanceof com.tencent.mapsdk.internal.ev) {
                com.tencent.mapsdk.internal.ev evVar = (com.tencent.mapsdk.internal.ev) aqVar;
                if (a() == -1) {
                    this.f50679m = evVar.a();
                } else {
                    evVar.p();
                }
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Colorable
    public final void setColor(int i17) {
        if (this.f50641w != i17) {
            this.f50641w = i17;
            w();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Widthable
    public final void setWidth(float f17) {
        if (this.f50642x != f17) {
            this.f50642x = f17;
            w();
        }
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        if (this.f50634p != latLng) {
            this.f50634p = latLng;
            w();
        }
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: b */
    public final android.graphics.Rect getBound(com.tencent.mapsdk.internal.ey eyVar) {
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = this.f50638t;
        if (latLng != null) {
            com.tencent.mapsdk.internal.gc b17 = eyVar.b(latLng);
            double d17 = b17.f49565c;
            double d18 = this.f50640v;
            com.tencent.mapsdk.internal.gc gcVar = new com.tencent.mapsdk.internal.gc(d17 - d18, b17.f49564b - d18);
            double d19 = b17.f49565c;
            double d27 = this.f50640v;
            com.tencent.mapsdk.internal.gc gcVar2 = new com.tencent.mapsdk.internal.gc(d19 + d27, b17.f49564b + d27);
            com.tencent.tencentmap.mapsdk.maps.model.LatLng a17 = eyVar.a(gcVar);
            com.tencent.tencentmap.mapsdk.maps.model.LatLng a18 = eyVar.a(gcVar2);
            android.graphics.Rect rect = new android.graphics.Rect();
            rect.left = (int) (a17.longitude * 1000000.0d);
            rect.top = (int) (a17.latitude * 1000000.0d);
            rect.right = (int) (a18.longitude * 1000000.0d);
            rect.bottom = (int) (a18.latitude * 1000000.0d);
            return rect;
        }
        return super.getBound(eyVar);
    }

    private void a(float f17) {
        if (this.f50637s != f17) {
            this.f50637s = f17;
            w();
        }
    }

    @Override // com.tencent.mapsdk.internal.ag
    public final void a(com.tencent.tencentmap.mapsdk.maps.model.ArcOptions arcOptions) {
        if (this.f50633d == null || arcOptions == null) {
            return;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLng startLatLng = arcOptions.getStartLatLng();
        com.tencent.tencentmap.mapsdk.maps.model.LatLng passLatLng = arcOptions.getPassLatLng();
        com.tencent.tencentmap.mapsdk.maps.model.LatLng endLatLng = arcOptions.getEndLatLng();
        float angle = arcOptions.getAngle() >= 0.0f ? arcOptions.getAngle() % 360.0f : (arcOptions.getAngle() % 360.0f) + 360.0f;
        if (startLatLng == null || endLatLng == null || startLatLng.equals(endLatLng)) {
            return;
        }
        if (passLatLng == null && (angle == 0.0f || angle == 180.0f)) {
            return;
        }
        if (passLatLng == null || !(passLatLng.equals(startLatLng) || passLatLng.equals(endLatLng))) {
            if (this.f50634p != startLatLng) {
                this.f50634p = startLatLng;
                w();
            }
            if (this.f50635q != endLatLng) {
                this.f50635q = endLatLng;
                w();
            }
            if (this.f50636r != passLatLng) {
                this.f50636r = passLatLng;
                w();
            }
            if (this.f50637s != angle) {
                this.f50637s = angle;
                w();
            }
            setColor(arcOptions.getColor());
            setWidth(arcOptions.getWidth());
            setStrokeWidth(arcOptions.getStrokeWidth());
            setStrokeColor(arcOptions.getStrokeColor());
            this.f50643y = arcOptions.isShowArrow();
            if (v()) {
                e();
            }
        }
    }

    private void a(boolean z17) {
        this.f50643y = z17;
    }
}
