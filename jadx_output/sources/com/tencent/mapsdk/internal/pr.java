package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class pr extends com.tencent.mapsdk.internal.po<com.tencent.mapsdk.internal.aq> implements com.tencent.mapsdk.internal.aq {
    private com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor A;
    private final int B;
    private com.tencent.mapsdk.internal.im C;
    private float D;
    private com.tencent.mapsdk.internal.pr.a E;
    private float F;
    private int G;
    private com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text H;
    private boolean I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f50734J;
    private float K;
    private boolean L;
    private boolean M;
    private int N;
    private com.tencent.map.lib.models.GeoPoint O;
    private java.lang.String P;
    private int Q;
    private java.util.List<java.lang.Integer> R;
    private final float S;
    private boolean T;
    private com.tencent.tencentmap.mapsdk.maps.model.Animation U;
    private com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions V;
    private java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> W;
    private final com.tencent.mapsdk.internal.az X;
    private java.lang.String Y;
    private boolean Z;

    /* renamed from: aa, reason: collision with root package name */
    private com.tencent.mapsdk.internal.im.b f50735aa;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mapsdk.internal.qv f50736b;

    /* renamed from: d, reason: collision with root package name */
    private com.tencent.mapsdk.internal.qw f50737d;

    /* renamed from: p, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.Polyline f50738p;

    /* renamed from: q, reason: collision with root package name */
    private final java.util.List<com.tencent.mapsdk.internal.pr.a> f50739q;

    /* renamed from: r, reason: collision with root package name */
    private final java.util.List<com.tencent.map.lib.models.GeoPoint> f50740r;

    /* renamed from: s, reason: collision with root package name */
    private float f50741s;

    /* renamed from: t, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.ne f50742t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f50743u;

    /* renamed from: v, reason: collision with root package name */
    private int[] f50744v;

    /* renamed from: w, reason: collision with root package name */
    private int[] f50745w;

    /* renamed from: x, reason: collision with root package name */
    private int[] f50746x;

    /* renamed from: y, reason: collision with root package name */
    private int f50747y;

    /* renamed from: z, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.ColorType f50748z;

    /* loaded from: classes13.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        int[] f50754a;

        /* renamed from: b, reason: collision with root package name */
        int[] f50755b;

        /* renamed from: c, reason: collision with root package name */
        int f50756c;

        /* renamed from: d, reason: collision with root package name */
        int f50757d;

        public b(int i17) {
            this.f50757d = i17;
            this.f50754a = new int[i17];
            this.f50755b = new int[i17];
        }

        public final void a(int i17, int i18) {
            int i19 = this.f50756c;
            if (i19 >= this.f50757d) {
                return;
            }
            this.f50754a[i19] = i17;
            this.f50755b[i19] = i18;
            this.f50756c = i19 + 1;
        }
    }

    public pr(com.tencent.mapsdk.internal.az azVar) {
        super(azVar);
        this.f50736b = null;
        this.f50737d = null;
        this.f50738p = null;
        this.f50743u = false;
        this.f50744v = null;
        this.f50745w = null;
        this.f50746x = null;
        this.f50747y = -7829368;
        this.A = null;
        this.B = 12;
        this.E = null;
        this.F = 1.0f;
        this.G = 0;
        this.I = false;
        this.f50734J = true;
        this.K = 0.0f;
        this.L = false;
        this.M = false;
        this.N = -1;
        this.O = null;
        this.Q = (int) (com.tencent.mapsdk.internal.hs.a(this.f50680n.I()) * 100.0f);
        this.Y = com.tencent.mapsdk.internal.ua.f52309a;
        this.f50735aa = new com.tencent.mapsdk.internal.im.b() { // from class: com.tencent.mapsdk.internal.pr.3
            @Override // com.tencent.mapsdk.internal.im.b
            public final void a(float f17, float f18) {
            }

            @Override // com.tencent.mapsdk.internal.im.b
            public final void b(float f17) {
                com.tencent.mapsdk.internal.pr.this.F = f17;
            }

            @Override // com.tencent.mapsdk.internal.im.b
            public final void a(float f17, float f18, float f19, float f27) {
            }

            @Override // com.tencent.mapsdk.internal.im.b
            public final void a(int i17, int i18) {
            }

            @Override // com.tencent.mapsdk.internal.im.b
            public final void a(float f17) {
                com.tencent.mapsdk.internal.pr.this.D = f17;
            }
        };
        this.X = azVar;
        com.tencent.mapsdk.internal.ne b17 = azVar.b();
        this.f50742t = b17;
        this.f50739q = new java.util.concurrent.CopyOnWriteArrayList();
        this.f50740r = new java.util.concurrent.CopyOnWriteArrayList();
        this.S = b17.getContext().getResources().getDisplayMetrics().density;
    }

    private static int b(int i17) {
        if (i17 == 0) {
            return 0;
        }
        if (i17 == 1) {
            return 1;
        }
        if (i17 == 2) {
            return 2;
        }
        if (i17 == 3) {
            return 3;
        }
        if (i17 != 4) {
            return (i17 == 6 || i17 != 33) ? 6 : 33;
        }
        return 4;
    }

    private static int c(int i17) {
        if (i17 >= 12) {
            i17 = 11;
        }
        if (i17 < 0) {
            return 0;
        }
        return i17;
    }

    private void d() {
        if (java.lang.Thread.currentThread().getName().contains(this.Y)) {
            e();
        } else {
            this.f50742t.a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.pr.1
                @Override // com.tencent.mapsdk.internal.ne.a
                public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                    com.tencent.mapsdk.internal.pr.this.e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f50742t == null || this.f50740r.size() < 2 || !isVisible()) {
            return;
        }
        com.tencent.mapsdk.internal.qv qvVar = this.f50736b;
        com.tencent.mapsdk.internal.fy g17 = g();
        if (g17.a()) {
            if (qvVar == null) {
                qvVar = new com.tencent.mapsdk.internal.qv(this, this.X, g17);
                qvVar.b_ = this.b_;
                this.f50742t.f50510j.a(qvVar);
                this.f50736b = qvVar;
            } else {
                qvVar.a(g17);
            }
            qvVar.a(this.N, this.O);
            this.f50742t.f50522v = true;
        }
    }

    private void f() {
        int i17;
        com.tencent.mapsdk.internal.qw qwVar;
        com.tencent.mapsdk.internal.ne neVar = this.f50742t;
        if (neVar == null || !this.T) {
            return;
        }
        this.T = false;
        com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text text = this.H;
        if (text == null && (qwVar = this.f50737d) != null) {
            qwVar.a();
            this.f50737d = null;
            return;
        }
        com.tencent.mapsdk.internal.tk tkVar = neVar.f50506f;
        if (text != null) {
            com.tencent.mapsdk.internal.qw qwVar2 = this.f50737d;
            if (qwVar2 != null) {
                com.tencent.mapsdk.internal.tk tkVar2 = qwVar2.f51087b;
                if (tkVar2 == null || (i17 = qwVar2.f51086a) <= 0) {
                    return;
                }
                tkVar2.a(new com.tencent.mapsdk.internal.tk.AnonymousClass58(i17, text));
                return;
            }
            java.util.List<com.tencent.map.lib.models.GeoPoint> list = this.f50740r;
            if (list == null || list.size() < 2) {
                return;
            }
            java.util.List<com.tencent.map.lib.models.GeoPoint> list2 = this.f50740r;
            this.f50737d = new com.tencent.mapsdk.internal.qw(tkVar, (com.tencent.map.lib.models.GeoPoint[]) list2.toArray(new com.tencent.map.lib.models.GeoPoint[list2.size()]), this.H);
        }
    }

    private com.tencent.mapsdk.internal.fy g() {
        com.tencent.mapsdk.internal.fy fyVar = new com.tencent.mapsdk.internal.fy();
        if (this.f50742t == null) {
            return fyVar;
        }
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor = this.A;
        if (bitmapDescriptor != null && bitmapDescriptor.getFormater() != null) {
            fyVar.f49525y = this.A.getFormater().getBitmapId();
        }
        com.tencent.mapsdk.internal.pr.b c17 = c(this.f50740r);
        fyVar.f49523w = this.f50743u;
        fyVar.I = this.Q;
        fyVar.a(this.f50740r);
        fyVar.N = this.f50747y;
        if (this.G == 0) {
            int a17 = a(this.f50742t.getContext(), this.A);
            if (a17 > 0) {
                float f17 = this.f50671e;
                float f18 = a17;
                if (f17 > f18) {
                    f17 = f18;
                }
                fyVar.f49524x = f17;
            } else {
                fyVar.f49524x = this.f50671e;
            }
        } else {
            fyVar.f49524x = this.f50671e;
        }
        if (this.f50748z == com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.ColorType.LINE_COLOR_ARGB) {
            fyVar.f49522v = true;
            float f19 = this.f50741s * 2.0f;
            float f27 = this.f50671e;
            if (f19 >= f27) {
                this.f50741s = f27 / 3.0f;
            }
            fyVar.f49521u = this.f50741s;
        }
        int[] iArr = this.f50746x;
        if (this.f50734J) {
            fyVar.a(c17.f50754a);
            if (this.f50741s <= 0.0f || iArr == null || iArr.length <= 0) {
                fyVar.b(c17.f50755b);
            } else {
                fyVar.a(c17.f50755b, iArr);
            }
        } else {
            fyVar.a(new int[]{0});
            if (this.f50741s <= 0.0f || iArr == null || iArr.length <= 0) {
                fyVar.b(new int[]{this.f50673g});
            } else {
                fyVar.a(new int[]{this.f50673g}, new int[]{iArr[0]});
            }
        }
        fyVar.A = this.D;
        fyVar.C = this.G;
        fyVar.G = (int) this.f50674h;
        fyVar.D = this.I;
        fyVar.E = this.L;
        fyVar.f49526z = this.M;
        fyVar.B = this.f50734J;
        fyVar.H = this.P;
        fyVar.b(this.R);
        fyVar.M = this.f50678l;
        fyVar.O = this.Z;
        return fyVar;
    }

    private boolean h() {
        boolean z17 = false;
        int i17 = 0;
        z17 = false;
        if (this.f50742t == null) {
            return false;
        }
        com.tencent.mapsdk.internal.im imVar = this.C;
        if (imVar != null && imVar.f49906d) {
            imVar.b();
            com.tencent.mapsdk.internal.im imVar2 = this.C;
            if (imVar2 instanceof com.tencent.mapsdk.internal.io) {
                this.f50740r.clear();
                java.util.List<com.tencent.map.lib.models.GeoPoint> list = this.f50740r;
                java.util.List<com.tencent.mapsdk.internal.pr.a> list2 = this.f50739q;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (list2 != null && list2.size() >= 2) {
                    float f17 = this.E.f50752a;
                    float f18 = this.K - f17;
                    float f19 = this.F;
                    float f27 = f18 * f19;
                    float f28 = f17 - (f17 * f19);
                    float f29 = f17 + f27;
                    com.tencent.mapsdk.internal.pr.a aVar = null;
                    while (true) {
                        if (i17 >= list2.size()) {
                            break;
                        }
                        com.tencent.mapsdk.internal.pr.a aVar2 = list2.get(i17);
                        float f37 = aVar2.f50752a;
                        if (f37 > f28 && f37 < f29) {
                            if (aVar != null) {
                                float f38 = aVar.f50752a;
                                if (f38 < f28) {
                                    com.tencent.mapsdk.internal.pr.a a17 = a(aVar, aVar2, (f28 - f38) / (f37 - f38));
                                    a17.f50753b = aVar.f50753b;
                                    arrayList.add(a17);
                                }
                            }
                            arrayList.add(aVar2);
                        } else if (f37 > f29) {
                            if (aVar != null) {
                                float f39 = aVar.f50752a;
                                if (f39 < f29) {
                                    com.tencent.mapsdk.internal.pr.a a18 = a(aVar, aVar2, (f29 - f39) / (f37 - f39));
                                    a18.f50753b = aVar2.f50753b;
                                    arrayList.add(a18);
                                }
                            }
                        } else if (java.lang.Float.compare(f37, f28) == 0 || java.lang.Float.compare(aVar2.f50752a, f29) == 0) {
                            arrayList.add(aVar2);
                        }
                        i17++;
                        aVar = aVar2;
                    }
                }
                list.addAll(arrayList);
                if (this.f50740r.size() >= 2) {
                    d();
                }
            } else if (imVar2 instanceof com.tencent.mapsdk.internal.il) {
                d();
            }
            z17 = true;
            z17 = true;
            this.f50742t.f50522v = true;
            com.tencent.mapsdk.internal.im imVar3 = this.C;
            if (imVar3.f49907e) {
                imVar3.a((com.tencent.mapsdk.internal.im.b) null);
                this.C = null;
            }
        }
        return z17;
    }

    private int[] i() {
        return this.f50746x;
    }

    private com.tencent.mapsdk.internal.aq j() {
        return this;
    }

    private com.tencent.tencentmap.mapsdk.maps.model.Polyline k() {
        return this.f50738p;
    }

    private float l() {
        return this.D;
    }

    private com.tencent.mapsdk.internal.qv m() {
        return this.f50736b;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void addTurnArrow(int i17, int i18) {
        com.tencent.mapsdk.internal.qv qvVar = this.f50736b;
        if (qvVar == null) {
            return;
        }
        qvVar.d();
        com.tencent.mapsdk.internal.qv qvVar2 = this.f50736b;
        com.tencent.mapsdk.internal.qv.a aVar = new com.tencent.mapsdk.internal.qv.a();
        qvVar2.f51077t = aVar;
        aVar.f51084a = i17;
        aVar.f51085b = i18;
        qvVar2.w();
        d();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void appendPoint(com.tencent.tencentmap.mapsdk.maps.model.LatLng... latLngArr) {
        if (this.W == null) {
            this.W = new java.util.ArrayList();
        }
        this.W.addAll(java.util.Arrays.asList(latLngArr));
        a(this.W);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void appendPoints(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list) {
        if (this.W == null) {
            this.W = new java.util.ArrayList();
        }
        this.W.addAll(list);
        a(this.W);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void arrowSpacing(int i17) {
        if (this.Q != i17) {
            this.Q = i17;
            com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions polylineOptions = this.V;
            if (polylineOptions != null) {
                polylineOptions.arrowSpacing(i17);
            }
            w();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void cleanTurnArrow() {
        com.tencent.mapsdk.internal.qv qvVar = this.f50736b;
        if (qvVar == null) {
            return;
        }
        qvVar.d();
        d();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.tencent.mapsdk.internal.pr)) {
            return android.text.TextUtils.equals(y(), ((com.tencent.mapsdk.internal.pr) obj).y());
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void eraseColor(int i17) {
        if (this.f50747y != i17) {
            this.f50747y = i17;
            com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions polylineOptions = this.V;
            if (polylineOptions != null) {
                polylineOptions.eraseColor(i17);
            }
            w();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void eraseTo(int i17, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        a(i17, latLng);
    }

    @Override // com.tencent.mapsdk.internal.au
    public final /* bridge */ /* synthetic */ com.tencent.mapsdk.internal.ao f_() {
        return this;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final int getColor() {
        return getStrokeColor();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final int[][] getColors() {
        int[] iArr;
        int[] iArr2 = this.f50744v;
        if (iArr2 == null || (iArr = this.f50745w) == null) {
            return null;
        }
        int[][] iArr3 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, 2, java.lang.Math.max(iArr2.length, iArr.length));
        iArr3[0] = this.f50744v;
        iArr3[1] = this.f50745w;
        return iArr3;
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    public final java.util.List<com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable<com.tencent.mapsdk.internal.ey>> getGroupBounds() {
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add(this.f50736b);
        return arrayList;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final java.util.List<java.lang.Integer> getPattern() {
        return this.R;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> getPoints() {
        return this.W;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions getPolylineOptions() {
        return this.V;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text getText() {
        return this.H;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final android.graphics.Rect getVisibleRect() {
        int i17;
        android.graphics.Rect rect;
        com.tencent.mapsdk.internal.qv qvVar = this.f50736b;
        java.util.ArrayList<com.tencent.map.lib.models.GeoPoint> arrayList = qvVar.f51071b.f49512l;
        if (arrayList != null && !arrayList.isEmpty() && (i17 = qvVar.f51074q) >= 0 && i17 < arrayList.size()) {
            java.util.List<com.tencent.map.lib.models.GeoPoint> subList = arrayList.subList(qvVar.f51074q, arrayList.size());
            if (subList == null || subList.isEmpty()) {
                rect = null;
            } else {
                com.tencent.map.lib.models.GeoPoint geoPoint = subList.get(0);
                int longitudeE6 = geoPoint.getLongitudeE6();
                int longitudeE62 = geoPoint.getLongitudeE6();
                int latitudeE6 = geoPoint.getLatitudeE6();
                int latitudeE62 = geoPoint.getLatitudeE6();
                int size = subList.size();
                for (int i18 = 0; i18 < size; i18++) {
                    com.tencent.map.lib.models.GeoPoint geoPoint2 = subList.get(i18);
                    if (geoPoint2 != null) {
                        int latitudeE63 = geoPoint2.getLatitudeE6();
                        int longitudeE63 = geoPoint2.getLongitudeE6();
                        if (longitudeE63 < longitudeE6) {
                            longitudeE6 = longitudeE63;
                        } else if (longitudeE63 > longitudeE62) {
                            longitudeE62 = longitudeE63;
                        }
                        if (latitudeE63 < latitudeE62) {
                            latitudeE62 = latitudeE63;
                        } else if (latitudeE63 > latitudeE6) {
                            latitudeE6 = latitudeE63;
                        }
                    }
                }
                rect = new android.graphics.Rect(longitudeE6, latitudeE6, longitudeE62, latitudeE62);
            }
            if (rect != null) {
                qvVar.f51071b.F = rect;
            }
        }
        return qvVar.f51071b.F;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final float getWidth() {
        return this.f50671e;
    }

    @Override // com.tencent.mapsdk.internal.po
    public final void h_() {
        com.tencent.mapsdk.internal.qv qvVar = this.f50736b;
        if (qvVar != null) {
            qvVar.remove();
            this.f50736b = null;
        }
        com.tencent.mapsdk.internal.qw qwVar = this.f50737d;
        if (qwVar != null) {
            qwVar.a();
            this.f50737d = null;
        }
        java.util.List<com.tencent.mapsdk.internal.pr.a> list = this.f50739q;
        if (list != null) {
            list.clear();
        }
        java.util.List<com.tencent.map.lib.models.GeoPoint> list2 = this.f50740r;
        if (list2 != null) {
            list2.clear();
        }
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public final boolean handleOnTap() {
        return true;
    }

    public final int hashCode() {
        return y().hashCode();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final boolean isAboveMaskLayer() {
        return this.I;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final boolean isGradientEnable() {
        return this.Z;
    }

    @Override // com.tencent.mapsdk.internal.po
    public final void j_() {
        int i17;
        com.tencent.mapsdk.internal.qw qwVar;
        com.tencent.mapsdk.internal.im imVar;
        this.Y = java.lang.Thread.currentThread().getName();
        if (this.f50742t != null && isVisible()) {
            if (v()) {
                if (this.f50739q.size() >= 2) {
                    this.f50740r.clear();
                    this.f50740r.addAll(this.f50739q);
                }
                d();
            }
            if (this.f50742t != null && (imVar = this.C) != null && imVar.f49906d) {
                imVar.b();
                com.tencent.mapsdk.internal.im imVar2 = this.C;
                if (imVar2 instanceof com.tencent.mapsdk.internal.io) {
                    this.f50740r.clear();
                    java.util.List<com.tencent.map.lib.models.GeoPoint> list = this.f50740r;
                    java.util.List<com.tencent.mapsdk.internal.pr.a> list2 = this.f50739q;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    if (list2 != null && list2.size() >= 2) {
                        float f17 = this.E.f50752a;
                        float f18 = this.K - f17;
                        float f19 = this.F;
                        float f27 = f18 * f19;
                        float f28 = f17 - (f17 * f19);
                        float f29 = f17 + f27;
                        int i18 = 0;
                        com.tencent.mapsdk.internal.pr.a aVar = null;
                        while (true) {
                            if (i18 >= list2.size()) {
                                break;
                            }
                            com.tencent.mapsdk.internal.pr.a aVar2 = list2.get(i18);
                            float f37 = aVar2.f50752a;
                            if (f37 > f28 && f37 < f29) {
                                if (aVar != null) {
                                    float f38 = aVar.f50752a;
                                    if (f38 < f28) {
                                        com.tencent.mapsdk.internal.pr.a a17 = a(aVar, aVar2, (f28 - f38) / (f37 - f38));
                                        a17.f50753b = aVar.f50753b;
                                        arrayList.add(a17);
                                    }
                                }
                                arrayList.add(aVar2);
                            } else if (f37 > f29) {
                                if (aVar != null) {
                                    float f39 = aVar.f50752a;
                                    if (f39 < f29) {
                                        com.tencent.mapsdk.internal.pr.a a18 = a(aVar, aVar2, (f29 - f39) / (f37 - f39));
                                        a18.f50753b = aVar2.f50753b;
                                        arrayList.add(a18);
                                    }
                                }
                            } else if (java.lang.Float.compare(f37, f28) == 0 || java.lang.Float.compare(aVar2.f50752a, f29) == 0) {
                                arrayList.add(aVar2);
                            }
                            i18++;
                            aVar = aVar2;
                        }
                    }
                    list.addAll(arrayList);
                    if (this.f50740r.size() >= 2) {
                        d();
                    }
                } else if (imVar2 instanceof com.tencent.mapsdk.internal.il) {
                    d();
                }
                this.f50742t.f50522v = true;
                com.tencent.mapsdk.internal.im imVar3 = this.C;
                if (imVar3.f49907e) {
                    imVar3.a((com.tencent.mapsdk.internal.im.b) null);
                    this.C = null;
                }
            }
            com.tencent.mapsdk.internal.ne neVar = this.f50742t;
            if (neVar == null || !this.T) {
                return;
            }
            this.T = false;
            com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text text = this.H;
            if (text == null && (qwVar = this.f50737d) != null) {
                qwVar.a();
                this.f50737d = null;
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = neVar.f50506f;
            if (text != null) {
                com.tencent.mapsdk.internal.qw qwVar2 = this.f50737d;
                if (qwVar2 != null) {
                    com.tencent.mapsdk.internal.tk tkVar2 = qwVar2.f51087b;
                    if (tkVar2 == null || (i17 = qwVar2.f51086a) <= 0) {
                        return;
                    }
                    tkVar2.a(new com.tencent.mapsdk.internal.tk.AnonymousClass58(i17, text));
                    return;
                }
                java.util.List<com.tencent.map.lib.models.GeoPoint> list3 = this.f50740r;
                if (list3 == null || list3.size() < 2) {
                    return;
                }
                java.util.List<com.tencent.map.lib.models.GeoPoint> list4 = this.f50740r;
                this.f50737d = new com.tencent.mapsdk.internal.qw(tkVar, (com.tencent.map.lib.models.GeoPoint[]) list4.toArray(new com.tencent.map.lib.models.GeoPoint[list4.size()]), this.H);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.aq
    public final android.graphics.Rect l_() {
        int i17;
        android.graphics.Rect rect;
        com.tencent.mapsdk.internal.qv qvVar = this.f50736b;
        java.util.ArrayList<com.tencent.map.lib.models.GeoPoint> arrayList = qvVar.f51071b.f49512l;
        if (arrayList != null && !arrayList.isEmpty() && (i17 = qvVar.f51074q) >= 0 && i17 < arrayList.size()) {
            java.util.List<com.tencent.map.lib.models.GeoPoint> subList = arrayList.subList(qvVar.f51074q, arrayList.size());
            if (subList == null || subList.isEmpty()) {
                rect = null;
            } else {
                com.tencent.map.lib.models.GeoPoint geoPoint = subList.get(0);
                int longitudeE6 = geoPoint.getLongitudeE6();
                int longitudeE62 = geoPoint.getLongitudeE6();
                int latitudeE6 = geoPoint.getLatitudeE6();
                int latitudeE62 = geoPoint.getLatitudeE6();
                int size = subList.size();
                for (int i18 = 0; i18 < size; i18++) {
                    com.tencent.map.lib.models.GeoPoint geoPoint2 = subList.get(i18);
                    if (geoPoint2 != null) {
                        int latitudeE63 = geoPoint2.getLatitudeE6();
                        int longitudeE63 = geoPoint2.getLongitudeE6();
                        if (longitudeE63 < longitudeE6) {
                            longitudeE6 = longitudeE63;
                        } else if (longitudeE63 > longitudeE62) {
                            longitudeE62 = longitudeE63;
                        }
                        if (latitudeE63 < latitudeE62) {
                            latitudeE62 = latitudeE63;
                        } else if (latitudeE63 > latitudeE6) {
                            latitudeE6 = latitudeE63;
                        }
                    }
                }
                rect = new android.graphics.Rect(longitudeE6, latitudeE6, longitudeE62, latitudeE62);
            }
            if (rect != null) {
                qvVar.f51071b.F = rect;
            }
        }
        return qvVar.f51071b.F;
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public final boolean onTap(float f17, float f18) {
        com.tencent.mapsdk.internal.qv qvVar;
        if (this.f50742t == null || !isVisible() || (qvVar = this.f50736b) == null) {
            return false;
        }
        return qvVar.onTap(f17, f18);
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.ev
    public final void p() {
        d();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void pattern(java.util.List<java.lang.Integer> list) {
        d(list);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setAboveMaskLayer(boolean z17) {
        if (this.I != z17) {
            this.I = z17;
            w();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    public final void setAnimation(com.tencent.tencentmap.mapsdk.maps.model.Animation animation) {
        if ((animation instanceof com.tencent.tencentmap.mapsdk.maps.model.AlphaAnimation) || (animation instanceof com.tencent.tencentmap.mapsdk.maps.model.EmergeAnimation) || (animation instanceof com.tencent.tencentmap.mapsdk.maps.model.IAlphaAnimation) || (animation instanceof com.tencent.tencentmap.mapsdk.maps.model.IEmergeAnimation)) {
            this.U = animation;
        } else {
            com.tencent.mapsdk.core.utils.log.LogUtil.c("Unsupported animation, only AlphaAnimation and EmergeAnimation allowed.");
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setArrow(boolean z17) {
        if (this.f50743u != z17) {
            this.f50743u = z17;
            com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions polylineOptions = this.V;
            if (polylineOptions != null) {
                polylineOptions.arrow(z17);
            }
            w();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setBorderColors(int[] iArr) {
        if (this.f50746x != iArr) {
            this.f50746x = iArr;
            com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions polylineOptions = this.V;
            if (polylineOptions != null) {
                polylineOptions.borderColors(iArr);
            }
            w();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setColor(int i17) {
        setStrokeColor(i17);
        com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions polylineOptions = this.V;
        if (polylineOptions != null) {
            polylineOptions.color(i17);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setColorTexture(java.lang.String str) {
        setColorTexture(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromAsset(str));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setColors(int[] iArr, int[] iArr2) {
        this.f50744v = iArr;
        this.f50745w = iArr2;
        this.f50748z = a(com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.ColorType.LINE_COLOR_NONE);
        this.f50734J = true;
        w();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setEraseable(boolean z17) {
        this.L = z17;
        com.tencent.mapsdk.internal.qv qvVar = this.f50736b;
        if (qvVar != null) {
            qvVar.f51071b.E = z17;
        }
        w();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setGradientEnable(boolean z17) {
        if (this.G == 0 && this.f50734J) {
            this.Z = z17;
            w();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setPoints(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list) {
        a(list);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setPolylineOptions(com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions polylineOptions) {
        if (this.f50742t == null || polylineOptions == null) {
            return;
        }
        this.f50681o = true;
        this.V = polylineOptions;
        if (polylineOptions.getWidth() == -1.0f) {
            setStrokeWidth(this.S * 9.0f);
        } else {
            setStrokeWidth(polylineOptions.getWidth());
        }
        setStrokeColor(polylineOptions.getColor());
        setZIndex(polylineOptions.getZIndex());
        setVisible(polylineOptions.isVisible());
        this.D = polylineOptions.getAlpha();
        w();
        setArrow(polylineOptions.isArrow());
        setColorTexture(polylineOptions.getColorTexture());
        c(polylineOptions.getLineCap());
        d(polylineOptions.getPattern());
        this.f50741s = polylineOptions.getBorderWidth();
        setClickable(polylineOptions.isClickable());
        this.f50746x = polylineOptions.getBorderColors();
        this.b_ = polylineOptions.getIndoorInfo();
        this.G = polylineOptions.getLineType();
        this.f50678l = polylineOptions.getLevel();
        this.f50747y = polylineOptions.getEraseColor();
        if (polylineOptions.isAbovePillar() && this.f50678l == 0) {
            this.f50678l = 2;
        }
        a(polylineOptions.getPoints());
        if (polylineOptions.getArrowTexture() != null) {
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor arrowTexture = polylineOptions.getArrowTexture();
            if (arrowTexture.getBitmap(this.X.I()) != null) {
                this.P = arrowTexture.getFormater().getBitmapId();
            }
        }
        this.Q = polylineOptions.getArrowSpacing();
        this.f50734J = polylineOptions.isRoad();
        com.tencent.tencentmap.mapsdk.maps.model.Animation animation = polylineOptions.getAnimation();
        if (animation != null) {
            a(((com.tencent.mapsdk.internal.hv) animation).f49861a);
        }
        int[][] colors = polylineOptions.getColors();
        if (colors != null && colors.length == 2) {
            int[] iArr = colors[0];
            int[] iArr2 = colors[1];
            if (iArr != null && iArr2 != null) {
                setColors(iArr, iArr2);
            }
        }
        this.f50748z = a(polylineOptions.getColorType());
        setText(polylineOptions.getText());
        setGradientEnable(polylineOptions.isGradientEnable());
        x();
        d();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setText(com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text text) {
        if (this.H != text) {
            this.H = text;
            this.T = true;
        }
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Visible
    public final void setVisible(boolean z17) {
        super.setVisible(z17);
        com.tencent.mapsdk.internal.qv qvVar = this.f50736b;
        if (qvVar != null) {
            qvVar.setVisible(z17);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setWidth(float f17) {
        if (f17 < 0.0f) {
            f17 = 1.0f;
        }
        if (f17 > 128.0f) {
            f17 = 128.0f;
        }
        setStrokeWidth(f17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    public final boolean startAnimation() {
        com.tencent.mapsdk.internal.hv a17;
        if (this.U == null || (a17 = com.tencent.mapsdk.internal.iu.a(this.f50742t.O(), this.U)) == null) {
            return false;
        }
        a(a17.f49861a);
        return false;
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.ex
    public final void u() {
        super.u();
        com.tencent.mapsdk.internal.qv qvVar = this.f50736b;
        if (qvVar != null) {
            qvVar.u();
        }
    }

    @Override // com.tencent.mapsdk.internal.po
    public final void w() {
        super.w();
        com.tencent.mapsdk.internal.qv qvVar = this.f50736b;
        if (qvVar != null) {
            qvVar.w();
        }
    }

    private com.tencent.mapsdk.internal.pr.b c(java.util.List<com.tencent.map.lib.models.GeoPoint> list) {
        int[] iArr;
        int[] iArr2 = this.f50744v;
        if (iArr2 != null && (iArr = this.f50745w) != null && list != null && iArr2.length != 0 && iArr.length != 0 && !list.isEmpty()) {
            java.util.TreeSet treeSet = new java.util.TreeSet(new java.util.Comparator<java.lang.Integer>() { // from class: com.tencent.mapsdk.internal.pr.2
                private static int a(java.lang.Integer num, java.lang.Integer num2) {
                    return num.compareTo(num2);
                }

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(java.lang.Integer num, java.lang.Integer num2) {
                    return num.compareTo(num2);
                }
            });
            for (int i17 : this.f50745w) {
                if (i17 >= 0 && i17 < list.size()) {
                    treeSet.add(java.lang.Integer.valueOf(i17));
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i18 : this.f50744v) {
                arrayList.add(java.lang.Integer.valueOf(i18));
            }
            if (treeSet.isEmpty()) {
                com.tencent.mapsdk.internal.pr.b bVar = new com.tencent.mapsdk.internal.pr.b(1);
                bVar.a(0, ((java.lang.Integer) arrayList.get(0)).intValue());
                return bVar;
            }
            java.lang.Integer[] numArr = (java.lang.Integer[]) treeSet.toArray(new java.lang.Integer[0]);
            if (numArr[0].intValue() != 0) {
                treeSet.add(0);
                arrayList.add(0, java.lang.Integer.valueOf(this.f50744v[0]));
            }
            if (numArr[numArr.length - 1].intValue() != list.size() - 1) {
                treeSet.add(java.lang.Integer.valueOf(list.size() - 1));
                if (numArr.length > this.f50744v.length) {
                    int size = arrayList.size() - 1;
                    int[] iArr3 = this.f50744v;
                    arrayList.add(size, java.lang.Integer.valueOf(iArr3[iArr3.length - 1]));
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(treeSet);
            int size2 = arrayList2.size();
            com.tencent.mapsdk.internal.pr.b bVar2 = new com.tencent.mapsdk.internal.pr.b(size2);
            for (int i19 = 0; i19 < size2; i19++) {
                if (i19 > arrayList.size() - 1) {
                    bVar2.a(((java.lang.Integer) arrayList2.get(i19)).intValue(), ((java.lang.Integer) arrayList.get(arrayList.size() - 1)).intValue());
                } else {
                    bVar2.a(((java.lang.Integer) arrayList2.get(i19)).intValue(), ((java.lang.Integer) arrayList.get(i19)).intValue());
                }
            }
            return bVar2;
        }
        int i27 = this.f50673g;
        if (this.f50748z == com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.ColorType.LINE_COLOR_TEXTURE) {
            i27 = c(i27);
        }
        com.tencent.mapsdk.internal.pr.b bVar3 = new com.tencent.mapsdk.internal.pr.b(1);
        bVar3.a(0, i27);
        return bVar3;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setColorTexture(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor) {
        if (this.f50742t == null || bitmapDescriptor == null || bitmapDescriptor.getFormater() == null) {
            return;
        }
        this.A = bitmapDescriptor;
        bitmapDescriptor.getBitmap(this.f50742t.getContext());
        this.f50748z = com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.ColorType.LINE_COLOR_TEXTURE;
        w();
    }

    /* loaded from: classes13.dex */
    public static class a extends com.tencent.map.lib.models.GeoPoint {

        /* renamed from: a, reason: collision with root package name */
        float f50752a;

        /* renamed from: b, reason: collision with root package name */
        int f50753b;

        public a() {
            this.f50752a = 0.0f;
            this.f50753b = 0;
        }

        @Override // com.tencent.map.lib.models.GeoPoint
        public final java.lang.String toString() {
            return super.toString() + "," + this.f50752a;
        }

        public a(com.tencent.map.lib.models.GeoPoint geoPoint) {
            super(geoPoint);
            this.f50752a = 0.0f;
            this.f50753b = 0;
        }
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor.getBitmap(this.X.I()) != null) {
            this.P = bitmapDescriptor.getFormater().getBitmapId();
        }
    }

    private java.util.ArrayList<com.tencent.map.lib.models.GeoPoint> b(java.util.List<com.tencent.mapsdk.internal.pr.a> list) {
        java.util.ArrayList<com.tencent.map.lib.models.GeoPoint> arrayList = new java.util.ArrayList<>();
        if (list != null && list.size() >= 2) {
            float f17 = this.E.f50752a;
            float f18 = this.K - f17;
            float f19 = this.F;
            float f27 = f18 * f19;
            float f28 = f17 - (f17 * f19);
            float f29 = f17 + f27;
            com.tencent.mapsdk.internal.pr.a aVar = null;
            int i17 = 0;
            while (true) {
                if (i17 >= list.size()) {
                    break;
                }
                com.tencent.mapsdk.internal.pr.a aVar2 = list.get(i17);
                float f37 = aVar2.f50752a;
                if (f37 > f28 && f37 < f29) {
                    if (aVar != null) {
                        float f38 = aVar.f50752a;
                        if (f38 < f28) {
                            com.tencent.mapsdk.internal.pr.a a17 = a(aVar, aVar2, (f28 - f38) / (f37 - f38));
                            a17.f50753b = aVar.f50753b;
                            arrayList.add(a17);
                        }
                    }
                    arrayList.add(aVar2);
                } else if (f37 > f29) {
                    if (aVar != null) {
                        float f39 = aVar.f50752a;
                        if (f39 < f29) {
                            com.tencent.mapsdk.internal.pr.a a18 = a(aVar, aVar2, (f29 - f39) / (f37 - f39));
                            a18.f50753b = aVar2.f50753b;
                            arrayList.add(a18);
                        }
                    }
                } else if (java.lang.Float.compare(f37, f28) == 0 || java.lang.Float.compare(aVar2.f50752a, f29) == 0) {
                    arrayList.add(aVar2);
                }
                i17++;
                aVar = aVar2;
            }
        }
        return arrayList;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline, com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    public final void startAnimation(com.tencent.tencentmap.mapsdk.maps.model.Animation animation) {
        setAnimation(animation);
        startAnimation();
    }

    private void a(int i17) {
        this.Q = i17;
    }

    private void d(java.util.List<java.lang.Integer> list) {
        this.R = list;
        w();
    }

    private void a(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list) {
        int size;
        this.W = list;
        if (list != null && (size = list.size()) > 0) {
            this.K = 0.0f;
            this.f50739q.clear();
            com.tencent.mapsdk.internal.pr.a aVar = null;
            for (int i17 = 0; i17 < size; i17++) {
                com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = list.get(i17);
                if (latLng != null) {
                    com.tencent.mapsdk.internal.pr.a aVar2 = new com.tencent.mapsdk.internal.pr.a(com.tencent.map.lib.models.GeoPoint.from(latLng));
                    if (aVar != null) {
                        float hypot = this.K + ((float) (java.lang.Math.hypot(aVar2.getLatitudeE6() - aVar.getLatitudeE6(), aVar2.getLongitudeE6() - aVar.getLongitudeE6()) + 0.0d));
                        this.K = hypot;
                        aVar2.f50752a = hypot;
                        aVar2.f50753b = aVar.f50753b + 1;
                    }
                    this.f50739q.add(aVar2);
                    aVar = aVar2;
                }
            }
            w();
        }
    }

    @Override // com.tencent.mapsdk.internal.aq
    public final void b(boolean z17) {
        this.L = z17;
        com.tencent.mapsdk.internal.qv qvVar = this.f50736b;
        if (qvVar != null) {
            qvVar.f51071b.E = z17;
        }
        w();
    }

    private com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.ColorType a(com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.ColorType colorType) {
        if (colorType != com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.ColorType.LINE_COLOR_NONE) {
            return colorType;
        }
        int[] iArr = this.f50744v;
        if (iArr != null && iArr.length > 0) {
            int length = iArr.length;
            for (int i17 = 0; i17 < length; i17++) {
                int i18 = this.f50744v[i17];
                if (i18 < 0 || i18 >= 12) {
                    return com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.ColorType.LINE_COLOR_ARGB;
                }
            }
            return com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.ColorType.LINE_COLOR_TEXTURE;
        }
        int i19 = this.f50673g;
        return (i19 < 0 || i19 >= 12) ? com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.ColorType.LINE_COLOR_ARGB : com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.ColorType.LINE_COLOR_TEXTURE;
    }

    private void b(float f17) {
        this.f50741s = f17;
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.ex
    public final void a(com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding) {
        super.a(indoorBuilding);
        com.tencent.mapsdk.internal.qv qvVar = this.f50736b;
        if (qvVar != null) {
            qvVar.a(indoorBuilding);
        }
    }

    private void c(boolean z17) {
        this.M = z17;
        w();
    }

    private static float a(com.tencent.map.lib.models.GeoPoint geoPoint, com.tencent.map.lib.models.GeoPoint geoPoint2) {
        if (geoPoint2 == null) {
            return 0.0f;
        }
        return (float) (java.lang.Math.hypot(geoPoint.getLatitudeE6() - geoPoint2.getLatitudeE6(), geoPoint.getLongitudeE6() - geoPoint2.getLongitudeE6()) + 0.0d);
    }

    private static com.tencent.mapsdk.internal.pr.a a(com.tencent.mapsdk.internal.pr.a aVar, com.tencent.mapsdk.internal.pr.a aVar2, float f17) {
        com.tencent.mapsdk.internal.pr.a aVar3 = new com.tencent.mapsdk.internal.pr.a();
        int longitudeE6 = aVar2.getLongitudeE6() - aVar.getLongitudeE6();
        aVar3.setLatitudeE6(aVar.getLatitudeE6() + java.lang.Math.round((aVar2.getLatitudeE6() - aVar.getLatitudeE6()) * f17));
        aVar3.setLongitudeE6(aVar.getLongitudeE6() + java.lang.Math.round(longitudeE6 * f17));
        float f18 = aVar.f50752a;
        aVar3.f50752a = f18 + ((aVar2.f50752a - f18) * f17);
        return aVar3;
    }

    private static float a(com.tencent.mapsdk.internal.pr.a aVar, com.tencent.mapsdk.internal.pr.a aVar2, com.tencent.map.lib.models.GeoPoint geoPoint, com.tencent.mapsdk.internal.pr.a aVar3) {
        double hypot;
        int longitudeE6 = aVar.getLongitudeE6();
        int latitudeE6 = aVar.getLatitudeE6();
        int longitudeE62 = aVar2.getLongitudeE6();
        int latitudeE62 = aVar2.getLatitudeE6();
        int longitudeE63 = geoPoint.getLongitudeE6();
        int i17 = longitudeE62 - longitudeE6;
        int i18 = longitudeE63 - longitudeE6;
        int i19 = latitudeE62 - latitudeE6;
        int latitudeE63 = geoPoint.getLatitudeE6() - latitudeE6;
        float f17 = (i17 * i18) + (i19 * latitudeE63);
        if (f17 <= 0.0f) {
            aVar3.setLatitudeE6(aVar.getLatitudeE6());
            aVar3.setLongitudeE6(aVar.getLongitudeE6());
            aVar3.f50752a = aVar.f50752a;
            hypot = java.lang.Math.hypot(i18, latitudeE63);
        } else {
            double d17 = (i17 * i17) + (i19 * i19);
            double d18 = f17;
            if (d18 >= d17) {
                aVar3.setLatitudeE6(aVar2.getLatitudeE6());
                aVar3.setLongitudeE6(aVar2.getLongitudeE6());
                aVar3.f50752a = aVar2.f50752a;
                hypot = java.lang.Math.hypot(longitudeE63 - longitudeE62, r14 - latitudeE62);
            } else {
                float f18 = (float) (d18 / d17);
                aVar3.setLongitudeE6(java.lang.Math.round(longitudeE6 + (i17 * f18)));
                aVar3.setLatitudeE6(java.lang.Math.round(latitudeE6 + (i19 * f18)));
                float f19 = aVar.f50752a;
                aVar3.f50752a = f19 + ((aVar2.f50752a - f19) * f18);
                hypot = java.lang.Math.hypot(longitudeE63 - r0, r14 - r1);
            }
        }
        return (float) hypot;
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.Polyline polyline) {
        this.f50738p = polyline;
    }

    @Override // com.tencent.mapsdk.internal.aq
    public final void a(float f17) {
        this.D = f17;
        w();
    }

    @Override // com.tencent.mapsdk.internal.aq
    public final void a(int i17, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        com.tencent.map.lib.models.GeoPoint from = com.tencent.map.lib.models.GeoPoint.from(latLng);
        if (i17 == -1 || from == null) {
            return;
        }
        this.N = i17;
        this.O = from;
        com.tencent.mapsdk.internal.qv qvVar = this.f50736b;
        if (qvVar != null) {
            qvVar.a(i17, from);
        }
        com.tencent.mapsdk.internal.ne neVar = this.f50742t;
        if (neVar != null) {
            neVar.f50522v = true;
        }
    }

    @Override // com.tencent.mapsdk.internal.aq
    public final void a(com.tencent.mapsdk.internal.im imVar) {
        com.tencent.mapsdk.internal.im imVar2 = this.C;
        if (imVar2 != null) {
            imVar2.f49904b = false;
            imVar2.a((com.tencent.mapsdk.internal.im.b) null);
        }
        if (imVar instanceof com.tencent.mapsdk.internal.io) {
            a((com.tencent.mapsdk.internal.io) imVar);
        } else if (imVar instanceof com.tencent.mapsdk.internal.il) {
            a((com.tencent.mapsdk.internal.il) imVar);
        } else {
            this.C = null;
        }
    }

    @Override // com.tencent.mapsdk.internal.aq
    public final void a(boolean z17) {
        c(z17);
    }

    private void a(com.tencent.mapsdk.internal.io ioVar) {
        if (this.f50742t == null) {
            return;
        }
        this.C = ioVar;
        com.tencent.map.lib.models.GeoPoint from = com.tencent.map.lib.models.GeoPoint.from(ioVar.f49913i);
        com.tencent.mapsdk.internal.pr.a a17 = a(from);
        this.E = a17;
        if (a17 == null) {
            com.tencent.mapsdk.core.utils.log.LogUtil.d("Error, start point not found. [p=" + from + "] [offsetGeoPoints=" + this.f50739q + "]");
            return;
        }
        ioVar.a(this.f50735aa);
        ioVar.a((com.tencent.map.lib.models.GeoPoint) null, (com.tencent.map.lib.models.GeoPoint) null);
        this.f50742t.f50522v = true;
    }

    private void a(com.tencent.mapsdk.internal.il ilVar) {
        this.C = ilVar;
        ilVar.a(this.f50735aa);
        this.C.a((com.tencent.map.lib.models.GeoPoint) null, (com.tencent.map.lib.models.GeoPoint) null);
        com.tencent.mapsdk.internal.ne neVar = this.f50742t;
        if (neVar != null) {
            neVar.f50522v = true;
        }
    }

    private com.tencent.mapsdk.internal.pr.a a(com.tencent.map.lib.models.GeoPoint geoPoint) {
        com.tencent.mapsdk.internal.pr.a aVar = new com.tencent.mapsdk.internal.pr.a();
        java.util.List<com.tencent.mapsdk.internal.pr.a> list = this.f50739q;
        com.tencent.mapsdk.internal.pr.a aVar2 = null;
        if (list != null && list.size() >= 2 && geoPoint != null) {
            com.tencent.mapsdk.internal.pr.a aVar3 = this.f50739q.get(0);
            int i17 = 1;
            float f17 = Float.MAX_VALUE;
            while (i17 < this.f50739q.size()) {
                com.tencent.mapsdk.internal.pr.a aVar4 = this.f50739q.get(i17);
                float a17 = a(aVar3, aVar4, geoPoint, aVar);
                if (a17 < f17) {
                    f17 = a17;
                    aVar2 = aVar;
                    aVar = new com.tencent.mapsdk.internal.pr.a();
                }
                i17++;
                aVar3 = aVar4;
            }
        }
        return aVar2;
    }

    private static int a(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor) {
        android.graphics.Bitmap bitmap;
        int height;
        if (context == null || bitmapDescriptor == null || (bitmap = bitmapDescriptor.getBitmap(context)) == null || (height = bitmap.getHeight()) <= 0) {
            return 0;
        }
        return (int) ((java.lang.Math.pow(2.0d, 25.0d) / java.lang.Math.pow(height, 2.0d)) / com.tencent.mapsdk.internal.hs.a(context));
    }
}
