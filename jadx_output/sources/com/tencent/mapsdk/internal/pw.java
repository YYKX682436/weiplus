package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class pw implements com.tencent.tencentmap.mapsdk.maps.model.AoiLayer {

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String f50789c = "AoiLayer";

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mapsdk.internal.py f50790a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mapsdk.internal.px f50791b;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f50792d;

    /* renamed from: g, reason: collision with root package name */
    private boolean f50795g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f50796h;

    /* renamed from: j, reason: collision with root package name */
    private int[] f50798j;

    /* renamed from: k, reason: collision with root package name */
    private int[] f50799k;

    /* renamed from: l, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.AoiLayer.OnAoiLayerLoadListener f50800l;

    /* renamed from: e, reason: collision with root package name */
    private int f50793e = 20;

    /* renamed from: f, reason: collision with root package name */
    private int f50794f = -1;

    /* renamed from: i, reason: collision with root package name */
    private boolean f50797i = true;

    /* renamed from: com.tencent.mapsdk.internal.pw$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass3 extends com.tencent.mapsdk.internal.ko.a<java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.util.List f50803a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.util.List f50804b;

        public AnonymousClass3(java.util.List list, java.util.List list2) {
            this.f50803a = list;
            this.f50804b = list2;
        }

        @Override // com.tencent.mapsdk.internal.ko.a, com.tencent.map.tools.Callback
        public final void callback(java.lang.Object obj) {
            if (com.tencent.mapsdk.internal.pw.this.f50796h) {
                return;
            }
            int size = this.f50803a.size();
            int size2 = this.f50804b.size();
            if (size != size2) {
                com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.pw.f50789c, "PoiLayer的子点渲染缺失！！count:" + size2 + "/" + size);
            }
            com.tencent.mapsdk.internal.pw.a(com.tencent.mapsdk.internal.pw.this, this.f50804b);
            if (com.tencent.mapsdk.internal.pw.this.f50800l != null) {
                com.tencent.mapsdk.internal.pw.this.f50800l.onAoiLayerLoaded(true, com.tencent.mapsdk.internal.pw.this);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.pw$4, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass4 extends com.tencent.mapsdk.internal.ko.g<java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.util.List f50806a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.util.List f50807b;

        public AnonymousClass4(java.util.List list, java.util.List list2) {
            this.f50806a = list;
            this.f50807b = list2;
        }

        @Override // java.util.concurrent.Callable
        public final java.lang.Object call() {
            if (com.tencent.mapsdk.internal.pw.this.f50796h) {
                return null;
            }
            com.tencent.mapsdk.internal.pw.a(com.tencent.mapsdk.internal.pw.this, this.f50806a, new com.tencent.map.tools.Callback<com.tencent.mapsdk.internal.px.d>() { // from class: com.tencent.mapsdk.internal.pw.4.1
                private void a(com.tencent.mapsdk.internal.px.d dVar) {
                    if (dVar != null) {
                        com.tencent.mapsdk.internal.pw.AnonymousClass4.this.f50807b.add(dVar);
                    }
                }

                @Override // com.tencent.map.tools.Callback
                public final /* synthetic */ void callback(com.tencent.mapsdk.internal.px.d dVar) {
                    com.tencent.mapsdk.internal.px.d dVar2 = dVar;
                    if (dVar2 != null) {
                        com.tencent.mapsdk.internal.pw.AnonymousClass4.this.f50807b.add(dVar2);
                    }
                }
            });
            return null;
        }
    }

    public pw(com.tencent.mapsdk.internal.py pyVar, java.lang.String str, com.tencent.tencentmap.mapsdk.maps.model.AoiLayerOptions aoiLayerOptions, com.tencent.tencentmap.mapsdk.maps.model.AoiLayer.OnAoiLayerLoadListener onAoiLayerLoadListener) {
        this.f50790a = pyVar;
        this.f50792d = str;
        this.f50800l = onAoiLayerLoadListener;
        a(aoiLayerOptions);
    }

    public static /* synthetic */ boolean e(com.tencent.mapsdk.internal.pw pwVar) {
        pwVar.f50795g = false;
        return false;
    }

    public static /* synthetic */ com.tencent.mapsdk.internal.px f(com.tencent.mapsdk.internal.pw pwVar) {
        com.tencent.mapsdk.internal.ne neVar;
        java.lang.String str = f50789c;
        com.tencent.mapsdk.core.utils.log.LogUtil.c(str, "请求poiDetail[" + pwVar.f50792d + "]");
        com.tencent.mapsdk.internal.py pyVar = pwVar.f50790a;
        if (pyVar == null || (neVar = pyVar.f50842b) == null) {
            return null;
        }
        com.tencent.map.tools.net.NetResponse poiDetail = ((com.tencent.mapsdk.internal.db) ((com.tencent.mapsdk.internal.dq) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.dq.class)).i()).poiDetail(pwVar.f50792d, neVar.F().f49009a);
        poiDetail.charset = com.tencent.mapsdk.internal.rv.f51270c;
        com.tencent.mapsdk.internal.ec.a aVar = new com.tencent.mapsdk.internal.ec.a(poiDetail, com.tencent.mapsdk.internal.px.class);
        com.tencent.mapsdk.core.utils.log.LogUtil.c(str, "poiDetail[" + pwVar.f50792d + "] resp:" + aVar.available());
        if (aVar.available()) {
            return (com.tencent.mapsdk.internal.px) aVar.f49236b;
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mapsdk.internal.pw)) {
            return false;
        }
        java.lang.String str = this.f50792d;
        java.lang.String str2 = ((com.tencent.mapsdk.internal.pw) obj).f50792d;
        return str != null ? str.equals(str2) : str2 == null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.AoiLayer, com.tencent.tencentmap.mapsdk.maps.model.IOverlay
    public final java.lang.String getId() {
        return this.f50792d;
    }

    public final int hashCode() {
        java.lang.String str = this.f50792d;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.AoiLayer
    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng location() {
        com.tencent.mapsdk.internal.px.d dVar;
        com.tencent.mapsdk.internal.px pxVar = this.f50791b;
        if (pxVar == null || (dVar = pxVar.f50810a) == null) {
            return null;
        }
        return dVar.f50826h;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.AoiLayer
    public final java.lang.String name() {
        com.tencent.mapsdk.internal.px.d dVar;
        com.tencent.mapsdk.internal.px pxVar = this.f50791b;
        if (pxVar == null || (dVar = pxVar.f50810a) == null) {
            return null;
        }
        return dVar.f50821c;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.AoiLayer
    public final boolean remove() {
        com.tencent.mapsdk.internal.ne neVar;
        boolean z17;
        com.tencent.mapsdk.internal.ng a17;
        com.tencent.mapsdk.internal.py pyVar = this.f50790a;
        if (pyVar == null || this.f50796h || (neVar = pyVar.f50842b) == null) {
            return false;
        }
        int[] iArr = this.f50799k;
        if (iArr != null) {
            for (int i17 : iArr) {
                com.tencent.mapsdk.internal.bi biVar = neVar.f50510j;
                if (biVar != null && (a17 = biVar.a((java.lang.Class<com.tencent.mapsdk.internal.ng>) com.tencent.mapsdk.internal.oc.class, i17)) != null) {
                    a17.remove();
                }
            }
            this.f50799k = null;
            z17 = true;
        } else {
            z17 = false;
        }
        int[] iArr2 = this.f50798j;
        if (iArr2 != null) {
            for (int i18 : iArr2) {
                neVar.a(i18);
            }
            this.f50798j = null;
            z17 = true;
        }
        this.f50791b = null;
        this.f50790a.f50841a.remove(this);
        this.f50796h = true;
        com.tencent.mapsdk.core.utils.log.LogUtil.c(f50789c, "移除poiLayer[" + this.f50792d + "]");
        return z17;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.AoiLayer
    public final void showSubPois(boolean z17) {
        com.tencent.mapsdk.internal.px.d dVar;
        java.util.List<com.tencent.mapsdk.internal.px.d> list;
        com.tencent.mapsdk.internal.py pyVar;
        com.tencent.mapsdk.internal.ne neVar;
        if (this.f50797i == z17) {
            return;
        }
        this.f50797i = z17;
        com.tencent.mapsdk.internal.px pxVar = this.f50791b;
        if (pxVar == null || (dVar = pxVar.f50810a) == null || (list = dVar.f50828j) == null || (pyVar = this.f50790a) == null || (neVar = pyVar.f50842b) == null) {
            return;
        }
        for (com.tencent.mapsdk.internal.px.d dVar2 : list) {
            com.tencent.mapsdk.internal.fw a17 = a(d(dVar2.f50824f), dVar2);
            a17.f49473a = dVar2.f50819a;
            if (!this.f50797i) {
                a17.f49480h = "";
            }
            neVar.a(a17);
            com.tencent.mapsdk.internal.oc ocVar = (com.tencent.mapsdk.internal.oc) neVar.f50510j.a(com.tencent.mapsdk.internal.oc.class, a17.f49473a);
            if (ocVar != null) {
                com.tencent.mapsdk.internal.oe oeVar = (com.tencent.mapsdk.internal.oe) ocVar.f50567d;
                oeVar.visible(this.f50797i);
                ocVar.a((com.tencent.mapsdk.internal.oc) oeVar);
                com.tencent.mapsdk.core.utils.log.LogUtil.c(f50789c, "显示/隐藏子点成功！" + dVar2.a() + "显示状态: " + this.f50797i);
            }
        }
    }

    private com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds b() {
        com.tencent.mapsdk.internal.px pxVar = this.f50791b;
        if (pxVar != null) {
            return a(pxVar.f50810a);
        }
        return null;
    }

    private static android.graphics.Point[] c(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list) {
        if (list == null || list.isEmpty()) {
            return new android.graphics.Point[0];
        }
        int size = list.size();
        android.graphics.Point[] pointArr = new android.graphics.Point[size];
        for (int i17 = 0; i17 < size; i17++) {
            pointArr[i17] = com.tencent.map.lib.models.GeoPoint.from(list.get(i17)).toPoint();
        }
        return pointArr;
    }

    private com.tencent.mapsdk.internal.px.e d(java.util.List<com.tencent.mapsdk.internal.px.e> list) {
        com.tencent.mapsdk.internal.py pyVar;
        com.tencent.mapsdk.internal.ne neVar;
        com.tencent.mapsdk.internal.px.e eVar = new com.tencent.mapsdk.internal.px.e();
        if (list == null || (pyVar = this.f50790a) == null || (neVar = pyVar.f50842b) == null) {
            return eVar;
        }
        boolean o17 = neVar.o();
        for (com.tencent.mapsdk.internal.px.e eVar2 : list) {
            if ((o17 && eVar2.f50831c == 1) || (!o17 && eVar2.f50831c == 0)) {
                return eVar2;
            }
        }
        return eVar;
    }

    private com.tencent.mapsdk.internal.px.c e(java.util.List<com.tencent.mapsdk.internal.px.e> list) {
        return d(list).f50840l;
    }

    private void b(com.tencent.mapsdk.internal.px pxVar) {
        com.tencent.mapsdk.internal.px.d dVar;
        boolean z17;
        com.tencent.mapsdk.internal.px.b bVar;
        java.util.List<java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng>> list;
        if (pxVar == null || (dVar = pxVar.f50810a) == null) {
            return;
        }
        com.tencent.mapsdk.internal.px.c cVar = d(dVar.f50824f).f50840l;
        com.tencent.mapsdk.internal.px.a aVar = pxVar.f50810a.f50827i;
        java.lang.String str = f50789c;
        com.tencent.mapsdk.core.utils.log.LogUtil.c(str, "绘制PoiLayer的面，aoiStyle:" + cVar + "|poiArea:" + aVar);
        if (aVar != null && (bVar = aVar.f50813c) != null && "Polygon".equalsIgnoreCase(bVar.f50814a) && (list = aVar.f50813c.f50815b) != null) {
            a(cVar, list);
            z17 = true;
        } else {
            com.tencent.mapsdk.core.utils.log.LogUtil.d(str, "PoiLayer的面渲染失败！");
            z17 = false;
        }
        this.f50791b = pxVar;
        if (!z17) {
            com.tencent.tencentmap.mapsdk.maps.model.AoiLayer.OnAoiLayerLoadListener onAoiLayerLoadListener = this.f50800l;
            if (onAoiLayerLoadListener != null) {
                onAoiLayerLoadListener.onAoiLayerLoaded(false, this);
                return;
            }
            return;
        }
        java.util.List<com.tencent.mapsdk.internal.px.d> list2 = pxVar.f50810a.f50828j;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mapsdk.core.utils.log.LogUtil.c(str, "绘制PoiLayer的子点，remotePois:".concat(java.lang.String.valueOf(list2)));
        com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.pw.AnonymousClass4(list2, arrayList)).a((com.tencent.mapsdk.internal.ko.b.a) null, (com.tencent.mapsdk.internal.ko.a<com.tencent.mapsdk.internal.ko.b.a>) new com.tencent.mapsdk.internal.pw.AnonymousClass3(list2, arrayList));
    }

    public final void a(com.tencent.tencentmap.mapsdk.maps.model.AoiLayerOptions aoiLayerOptions) {
        if (aoiLayerOptions != null) {
            if (aoiLayerOptions.getMaxLevel() != -1) {
                this.f50793e = aoiLayerOptions.getMaxLevel();
            }
            if (aoiLayerOptions.getMinLevel() != -1) {
                this.f50794f = aoiLayerOptions.getMinLevel();
            }
        }
        if (this.f50795g) {
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c(f50789c, "开始更新POI[" + this.f50792d + "]的详情数据");
        this.f50795g = true;
        com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.ko.g<com.tencent.mapsdk.internal.px>() { // from class: com.tencent.mapsdk.internal.pw.2
            private com.tencent.mapsdk.internal.px a() {
                if (com.tencent.mapsdk.internal.pw.this.f50796h) {
                    return null;
                }
                return com.tencent.mapsdk.internal.pw.f(com.tencent.mapsdk.internal.pw.this);
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                if (com.tencent.mapsdk.internal.pw.this.f50796h) {
                    return null;
                }
                return com.tencent.mapsdk.internal.pw.f(com.tencent.mapsdk.internal.pw.this);
            }
        }).a((com.tencent.mapsdk.internal.ko.b.a) null, (com.tencent.mapsdk.internal.ko.a<com.tencent.mapsdk.internal.ko.b.a>) new com.tencent.mapsdk.internal.ko.a<com.tencent.mapsdk.internal.px>() { // from class: com.tencent.mapsdk.internal.pw.1
            private void a(com.tencent.mapsdk.internal.px pxVar) {
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.pw.f50789c, "POI[" + com.tencent.mapsdk.internal.pw.this.f50792d + "]的详情数据：" + pxVar);
                if (pxVar != null && !com.tencent.mapsdk.internal.pw.this.f50796h) {
                    if (com.tencent.mapsdk.internal.pw.this.f50794f < 0) {
                        com.tencent.mapsdk.internal.pw pwVar = com.tencent.mapsdk.internal.pw.this;
                        pwVar.f50794f = com.tencent.mapsdk.internal.pw.a(pwVar, pxVar);
                    }
                    com.tencent.mapsdk.internal.pw.b(com.tencent.mapsdk.internal.pw.this, pxVar);
                } else if (com.tencent.mapsdk.internal.pw.this.f50800l != null) {
                    com.tencent.mapsdk.internal.pw.this.f50800l.onAoiLayerLoaded(false, com.tencent.mapsdk.internal.pw.this);
                }
                com.tencent.mapsdk.internal.pw.e(com.tencent.mapsdk.internal.pw.this);
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.pw.f50789c, "结束POI[" + com.tencent.mapsdk.internal.pw.this.f50792d + "]详情数据的更新");
            }

            @Override // com.tencent.mapsdk.internal.ko.a, com.tencent.map.tools.Callback
            public final /* synthetic */ void callback(java.lang.Object obj) {
                com.tencent.mapsdk.internal.px pxVar = (com.tencent.mapsdk.internal.px) obj;
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.pw.f50789c, "POI[" + com.tencent.mapsdk.internal.pw.this.f50792d + "]的详情数据：" + pxVar);
                if (pxVar != null && !com.tencent.mapsdk.internal.pw.this.f50796h) {
                    if (com.tencent.mapsdk.internal.pw.this.f50794f < 0) {
                        com.tencent.mapsdk.internal.pw pwVar = com.tencent.mapsdk.internal.pw.this;
                        pwVar.f50794f = com.tencent.mapsdk.internal.pw.a(pwVar, pxVar);
                    }
                    com.tencent.mapsdk.internal.pw.b(com.tencent.mapsdk.internal.pw.this, pxVar);
                } else if (com.tencent.mapsdk.internal.pw.this.f50800l != null) {
                    com.tencent.mapsdk.internal.pw.this.f50800l.onAoiLayerLoaded(false, com.tencent.mapsdk.internal.pw.this);
                }
                com.tencent.mapsdk.internal.pw.e(com.tencent.mapsdk.internal.pw.this);
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.pw.f50789c, "结束POI[" + com.tencent.mapsdk.internal.pw.this.f50792d + "]详情数据的更新");
            }
        });
    }

    private com.tencent.mapsdk.internal.px c() {
        com.tencent.mapsdk.internal.ne neVar;
        java.lang.String str = f50789c;
        com.tencent.mapsdk.core.utils.log.LogUtil.c(str, "请求poiDetail[" + this.f50792d + "]");
        com.tencent.mapsdk.internal.py pyVar = this.f50790a;
        if (pyVar == null || (neVar = pyVar.f50842b) == null) {
            return null;
        }
        com.tencent.map.tools.net.NetResponse poiDetail = ((com.tencent.mapsdk.internal.db) ((com.tencent.mapsdk.internal.dq) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.dq.class)).i()).poiDetail(this.f50792d, neVar.F().f49009a);
        poiDetail.charset = com.tencent.mapsdk.internal.rv.f51270c;
        com.tencent.mapsdk.internal.ec.a aVar = new com.tencent.mapsdk.internal.ec.a(poiDetail, com.tencent.mapsdk.internal.px.class);
        com.tencent.mapsdk.core.utils.log.LogUtil.c(str, "poiDetail[" + this.f50792d + "] resp:" + aVar.available());
        if (aVar.available()) {
            return (com.tencent.mapsdk.internal.px) aVar.f49236b;
        }
        return null;
    }

    private int a(com.tencent.mapsdk.internal.px pxVar) {
        com.tencent.mapsdk.internal.ne neVar;
        com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds a17;
        com.tencent.mapsdk.internal.py pyVar = this.f50790a;
        if (pyVar == null || (neVar = pyVar.f50842b) == null || pxVar == null || (a17 = a(pxVar.f50810a)) == null) {
            return 0;
        }
        return ((int) neVar.f50513m.a(a17.getSouthWest(), a17.getNorthEast(), 0, 0, 0, 0, null)) - 2;
    }

    private void a(com.tencent.mapsdk.internal.px.c cVar, java.util.List<java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng>> list) {
        com.tencent.mapsdk.internal.ne neVar;
        com.tencent.mapsdk.internal.py pyVar = this.f50790a;
        if (pyVar == null || (neVar = pyVar.f50842b) == null) {
            return;
        }
        int i17 = 0;
        if (this.f50798j == null) {
            this.f50798j = new int[list.size()];
            java.util.Iterator<java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng>> it = list.iterator();
            while (it.hasNext()) {
                com.tencent.map.lib.models.PolygonInfo b17 = b(cVar, it.next());
                if (!this.f50796h) {
                    int i18 = i17 + 1;
                    this.f50798j[i17] = neVar.a(b17);
                    com.tencent.mapsdk.core.utils.log.LogUtil.c(f50789c, "添加PoiLayer成功,ID=" + this.f50798j[i18 - 1] + "|model:" + b17);
                    i17 = i18;
                }
            }
            return;
        }
        java.util.Iterator<java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng>> it6 = list.iterator();
        while (it6.hasNext()) {
            com.tencent.map.lib.models.PolygonInfo b18 = b(cVar, it6.next());
            int i19 = i17 + 1;
            b18.polygonId = this.f50798j[i17];
            if (!this.f50796h) {
                neVar.b(b18);
                com.tencent.mapsdk.core.utils.log.LogUtil.c(f50789c, "更新PoiLayer成功");
            }
            i17 = i19;
        }
    }

    private void b(java.util.List<com.tencent.mapsdk.internal.px.d> list) {
        com.tencent.mapsdk.internal.ne neVar;
        com.tencent.mapsdk.internal.py pyVar = this.f50790a;
        if (pyVar == null || (neVar = pyVar.f50842b) == null) {
            return;
        }
        for (com.tencent.mapsdk.internal.px.d dVar : list) {
            com.tencent.mapsdk.internal.fw a17 = a(d(dVar.f50824f), dVar);
            a17.f49473a = dVar.f50819a;
            if (!this.f50797i) {
                a17.f49480h = "";
            }
            neVar.a(a17);
            com.tencent.mapsdk.internal.oc ocVar = (com.tencent.mapsdk.internal.oc) neVar.f50510j.a(com.tencent.mapsdk.internal.oc.class, a17.f49473a);
            if (ocVar != null) {
                com.tencent.mapsdk.internal.oe oeVar = (com.tencent.mapsdk.internal.oe) ocVar.f50567d;
                oeVar.visible(this.f50797i);
                ocVar.a((com.tencent.mapsdk.internal.oc) oeVar);
                com.tencent.mapsdk.core.utils.log.LogUtil.c(f50789c, "显示/隐藏子点成功！" + dVar.a() + "显示状态: " + this.f50797i);
            }
        }
    }

    private void a(java.util.List<com.tencent.mapsdk.internal.px.d> list) {
        com.tencent.mapsdk.internal.ne neVar;
        int i17;
        com.tencent.mapsdk.internal.py pyVar = this.f50790a;
        if (pyVar == null || (neVar = pyVar.f50842b) == null) {
            return;
        }
        int size = list.size();
        int[] iArr = new int[size];
        int i18 = 0;
        for (com.tencent.mapsdk.internal.px.d dVar : list) {
            com.tencent.mapsdk.internal.fw a17 = a(d(dVar.f50824f), dVar);
            int i19 = dVar.f50819a;
            if (i19 < 0) {
                if (neVar.f50510j != null && a17.f49493u != null) {
                    com.tencent.mapsdk.internal.oc ocVar = (com.tencent.mapsdk.internal.oc) neVar.f50510j.a((com.tencent.mapsdk.internal.bi) com.tencent.mapsdk.internal.ne.b(a17));
                    if (ocVar != null) {
                        i17 = ocVar.b();
                        dVar.f50819a = i17;
                        int i27 = i18 + 1;
                        iArr[i18] = i17;
                        com.tencent.mapsdk.core.utils.log.LogUtil.c(f50789c, "添加子点成功！" + dVar.a() + "|id:" + a17.f49480h);
                        i18 = i27;
                    }
                }
                i17 = -1;
                dVar.f50819a = i17;
                int i272 = i18 + 1;
                iArr[i18] = i17;
                com.tencent.mapsdk.core.utils.log.LogUtil.c(f50789c, "添加子点成功！" + dVar.a() + "|id:" + a17.f49480h);
                i18 = i272;
            } else {
                a17.f49473a = i19;
                neVar.a(a17);
                com.tencent.mapsdk.core.utils.log.LogUtil.c(f50789c, "更新子点成功！" + dVar.a());
            }
        }
        int[] iArr2 = new int[size];
        this.f50799k = iArr2;
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, size);
    }

    private com.tencent.map.lib.models.PolygonInfo b(com.tencent.mapsdk.internal.px.c cVar, java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list) {
        com.tencent.mapsdk.internal.ne neVar;
        android.content.Context context;
        com.tencent.map.lib.models.PolygonInfo polygonInfo = new com.tencent.map.lib.models.PolygonInfo();
        com.tencent.mapsdk.internal.py pyVar = this.f50790a;
        if (pyVar == null || (neVar = pyVar.f50842b) == null || (context = neVar.getContext()) == null) {
            return polygonInfo;
        }
        com.tencent.mapsdk.internal.hs.a(context);
        polygonInfo.points = (com.tencent.tencentmap.mapsdk.maps.model.LatLng[]) list.toArray(new com.tencent.tencentmap.mapsdk.maps.model.LatLng[0]);
        if (cVar != null) {
            polygonInfo.borderWidth = cVar.f50818c;
            polygonInfo.borderColor = android.graphics.Color.parseColor(cVar.f50817b);
            polygonInfo.color = android.graphics.Color.parseColor(cVar.f50816a);
            polygonInfo.level = 1;
            polygonInfo.minScaleLevel = this.f50794f;
            polygonInfo.maxScaleLevel = this.f50793e;
        }
        return polygonInfo;
    }

    public static /* synthetic */ void b(com.tencent.mapsdk.internal.pw pwVar, com.tencent.mapsdk.internal.px pxVar) {
        com.tencent.mapsdk.internal.px.d dVar;
        boolean z17;
        com.tencent.mapsdk.internal.px.b bVar;
        java.util.List<java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng>> list;
        if (pxVar == null || (dVar = pxVar.f50810a) == null) {
            return;
        }
        com.tencent.mapsdk.internal.px.c cVar = pwVar.d(dVar.f50824f).f50840l;
        com.tencent.mapsdk.internal.px.a aVar = pxVar.f50810a.f50827i;
        java.lang.String str = f50789c;
        com.tencent.mapsdk.core.utils.log.LogUtil.c(str, "绘制PoiLayer的面，aoiStyle:" + cVar + "|poiArea:" + aVar);
        if (aVar != null && (bVar = aVar.f50813c) != null && "Polygon".equalsIgnoreCase(bVar.f50814a) && (list = aVar.f50813c.f50815b) != null) {
            pwVar.a(cVar, list);
            z17 = true;
        } else {
            com.tencent.mapsdk.core.utils.log.LogUtil.d(str, "PoiLayer的面渲染失败！");
            z17 = false;
        }
        pwVar.f50791b = pxVar;
        if (!z17) {
            com.tencent.tencentmap.mapsdk.maps.model.AoiLayer.OnAoiLayerLoadListener onAoiLayerLoadListener = pwVar.f50800l;
            if (onAoiLayerLoadListener != null) {
                onAoiLayerLoadListener.onAoiLayerLoaded(false, pwVar);
                return;
            }
            return;
        }
        java.util.List<com.tencent.mapsdk.internal.px.d> list2 = pxVar.f50810a.f50828j;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mapsdk.core.utils.log.LogUtil.c(str, "绘制PoiLayer的子点，remotePois:".concat(java.lang.String.valueOf(list2)));
        com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.pw.AnonymousClass4(list2, arrayList)).a((com.tencent.mapsdk.internal.ko.b.a) null, (com.tencent.mapsdk.internal.ko.a<com.tencent.mapsdk.internal.ko.b.a>) new com.tencent.mapsdk.internal.pw.AnonymousClass3(list2, arrayList));
    }

    private static com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds a(com.tencent.mapsdk.internal.px.d dVar) {
        com.tencent.mapsdk.internal.px.a aVar;
        com.tencent.mapsdk.internal.px.b bVar;
        java.util.List<java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng>> list;
        if (dVar != null && (aVar = dVar.f50827i) != null && (bVar = aVar.f50813c) != null && (list = bVar.f50815b) != null) {
            com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.Builder builder = new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.Builder();
            java.util.Iterator<java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng>> it = list.iterator();
            while (it.hasNext()) {
                builder.include(it.next());
            }
            try {
                return builder.build();
            } catch (java.lang.Exception e17) {
                com.tencent.mapsdk.core.utils.log.LogUtil.b(android.util.Log.getStackTraceString(e17));
            }
        }
        return null;
    }

    private void a(java.util.List<com.tencent.mapsdk.internal.px.d> list, com.tencent.map.tools.Callback<com.tencent.mapsdk.internal.px.d> callback) {
        com.tencent.mapsdk.internal.ne neVar;
        android.content.Context context;
        com.tencent.mapsdk.internal.ne neVar2;
        android.content.Context context2;
        com.tencent.mapsdk.internal.py pyVar = this.f50790a;
        if (pyVar == null || (neVar = pyVar.f50842b) == null || (context = neVar.getContext()) == null || list == null || list.isEmpty()) {
            return;
        }
        for (int i17 = 0; i17 < list.size() && !this.f50796h; i17++) {
            com.tencent.mapsdk.internal.px.d dVar = list.get(i17);
            com.tencent.mapsdk.internal.px.e d17 = d(dVar.f50824f);
            java.lang.String str = d17.f50832d;
            if (!android.text.TextUtils.isEmpty(str)) {
                new com.tencent.mapsdk.internal.fw();
                com.tencent.mapsdk.internal.py pyVar2 = this.f50790a;
                if (pyVar2 != null && (neVar2 = pyVar2.f50842b) != null && (context2 = neVar2.getContext()) != null) {
                    int a17 = (int) com.tencent.mapsdk.internal.hs.a(context2);
                    str = a17 <= 1 ? str.replace("{density}", "") : a17 <= 2 ? str.replace("{density}", "@2x") : str.replace("{density}", "@3x");
                }
            }
            java.lang.String str2 = f50789c;
            com.tencent.mapsdk.core.utils.log.LogUtil.c(str2, "请求子点[" + dVar.a() + "]icon url:" + str);
            if (!android.text.TextUtils.isEmpty(str)) {
                com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor createBitmapDescriptor = neVar.createBitmapDescriptor(str, 8);
                d17.f50829a = createBitmapDescriptor;
                createBitmapDescriptor.getFormater().setScale(2);
                if (d17.f50829a.getBitmap(context) != null) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.c(str2, "子点[" + dVar.a() + "]icon下载成功");
                    if (d17.f50833e == 1) {
                        com.tencent.mapsdk.internal.fs.a aVar = new com.tencent.mapsdk.internal.fs.a(dVar.a(), d17.f50835g, android.graphics.Color.parseColor(d17.f50834f));
                        aVar.f49459f = neVar.getTypeface() == null ? android.graphics.Typeface.DEFAULT : neVar.getTypeface();
                        aVar.f49458e = android.graphics.Color.parseColor(d17.f50836h);
                        aVar.f49457d = d17.f50837i;
                        aVar.f49460g = com.tencent.mapsdk.internal.hs.a(context) / 2.0f;
                        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor createBitmapDescriptor2 = neVar.createBitmapDescriptor(aVar, 9);
                        d17.f50830b = createBitmapDescriptor2;
                        if (createBitmapDescriptor2.getBitmap(context) != null) {
                            com.tencent.mapsdk.core.utils.log.LogUtil.c(str2, "子点[" + dVar.a() + "]文本图片创建成功");
                        } else {
                            com.tencent.mapsdk.core.utils.log.LogUtil.d(str2, "子点[" + dVar.a() + "]文本图片创建失败！");
                        }
                    }
                    if (callback != null) {
                        callback.callback(dVar);
                    }
                } else {
                    com.tencent.mapsdk.core.utils.log.LogUtil.d(str2, "子点[" + dVar.a() + "]icon下载失败！");
                }
            }
        }
    }

    private java.lang.String a(java.lang.String str) {
        com.tencent.mapsdk.internal.ne neVar;
        android.content.Context context;
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        new com.tencent.mapsdk.internal.fw();
        com.tencent.mapsdk.internal.py pyVar = this.f50790a;
        if (pyVar == null || (neVar = pyVar.f50842b) == null || (context = neVar.getContext()) == null) {
            return str;
        }
        int a17 = (int) com.tencent.mapsdk.internal.hs.a(context);
        if (a17 <= 1) {
            return str.replace("{density}", "");
        }
        if (a17 <= 2) {
            return str.replace("{density}", "@2x");
        }
        return str.replace("{density}", "@3x");
    }

    private com.tencent.mapsdk.internal.fw a(com.tencent.mapsdk.internal.px.e eVar, com.tencent.mapsdk.internal.px.d dVar) {
        com.tencent.mapsdk.internal.ne neVar;
        android.content.Context context;
        com.tencent.mapsdk.internal.fw fwVar = new com.tencent.mapsdk.internal.fw();
        com.tencent.mapsdk.internal.py pyVar = this.f50790a;
        if (pyVar == null || (neVar = pyVar.f50842b) == null || (context = neVar.getContext()) == null || eVar == null) {
            return fwVar;
        }
        int i17 = eVar.f50833e;
        if (i17 == 0) {
            fwVar.f49483k = "";
        } else if (i17 == 1) {
            fwVar.f49483k = dVar.a();
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor = eVar.f50830b;
            if (bitmapDescriptor != null) {
                fwVar.f49480h = bitmapDescriptor.getFormater().getBitmapId();
                android.graphics.Bitmap bitmap = bitmapDescriptor.getBitmap(context);
                if (bitmap != null) {
                    fwVar.f49481i = bitmap.getWidth();
                    fwVar.f49482j = bitmap.getHeight();
                }
            }
        }
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor2 = eVar.f50829a;
        if (bitmapDescriptor2 == null) {
            return fwVar;
        }
        fwVar.f49474b = bitmapDescriptor2.getFormater().getBitmapId();
        android.graphics.Bitmap bitmap2 = bitmapDescriptor2.getBitmap(context);
        if (bitmap2 != null) {
            fwVar.f49475c = bitmap2.getWidth();
            fwVar.f49476d = bitmap2.getHeight();
        }
        fwVar.f49488p = 2;
        int i18 = eVar.f50839k;
        fwVar.f49489q = i18;
        fwVar.f49490r = ((eVar.f50838j + 1) * 10000) + i18;
        fwVar.f49493u = dVar.f50826h;
        fwVar.f49491s = this.f50794f;
        fwVar.f49492t = this.f50793e;
        fwVar.f49479g = 1.0f;
        return fwVar;
    }

    private com.tencent.mapsdk.internal.px.d a(long j17) {
        com.tencent.mapsdk.internal.px.d dVar;
        java.util.List<com.tencent.mapsdk.internal.px.d> list;
        com.tencent.mapsdk.internal.px pxVar = this.f50791b;
        if (pxVar == null || (dVar = pxVar.f50810a) == null || (list = dVar.f50828j) == null) {
            return null;
        }
        for (com.tencent.mapsdk.internal.px.d dVar2 : list) {
            if (((com.tencent.mapsdk.internal.oc) this.f50790a.f50842b.f50510j.a(com.tencent.mapsdk.internal.oc.class, dVar2.f50819a)) != null && r2.a() == j17) {
                return dVar2;
            }
        }
        return null;
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.SubPoi a(java.lang.String str, com.tencent.mapsdk.internal.px.d dVar) {
        com.tencent.tencentmap.mapsdk.maps.model.SubPoi subPoi = new com.tencent.tencentmap.mapsdk.maps.model.SubPoi();
        subPoi.setParentId(str);
        subPoi.setId(dVar.f50820b);
        subPoi.setName(dVar.a());
        subPoi.setPosition(dVar.f50826h);
        return subPoi;
    }

    public static /* synthetic */ int a(com.tencent.mapsdk.internal.pw pwVar, com.tencent.mapsdk.internal.px pxVar) {
        com.tencent.mapsdk.internal.ne neVar;
        com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds a17;
        com.tencent.mapsdk.internal.py pyVar = pwVar.f50790a;
        if (pyVar == null || (neVar = pyVar.f50842b) == null || pxVar == null || (a17 = a(pxVar.f50810a)) == null) {
            return 0;
        }
        return ((int) neVar.f50513m.a(a17.getSouthWest(), a17.getNorthEast(), 0, 0, 0, 0, null)) - 2;
    }

    public static /* synthetic */ void a(com.tencent.mapsdk.internal.pw pwVar, java.util.List list) {
        com.tencent.mapsdk.internal.ne neVar;
        int i17;
        com.tencent.mapsdk.internal.py pyVar = pwVar.f50790a;
        if (pyVar == null || (neVar = pyVar.f50842b) == null) {
            return;
        }
        int size = list.size();
        int[] iArr = new int[size];
        java.util.Iterator it = list.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.px.d dVar = (com.tencent.mapsdk.internal.px.d) it.next();
            com.tencent.mapsdk.internal.fw a17 = pwVar.a(pwVar.d(dVar.f50824f), dVar);
            int i19 = dVar.f50819a;
            if (i19 < 0) {
                if (neVar.f50510j != null && a17.f49493u != null) {
                    com.tencent.mapsdk.internal.oc ocVar = (com.tencent.mapsdk.internal.oc) neVar.f50510j.a((com.tencent.mapsdk.internal.bi) com.tencent.mapsdk.internal.ne.b(a17));
                    if (ocVar != null) {
                        i17 = ocVar.b();
                        dVar.f50819a = i17;
                        int i27 = i18 + 1;
                        iArr[i18] = i17;
                        com.tencent.mapsdk.core.utils.log.LogUtil.c(f50789c, "添加子点成功！" + dVar.a() + "|id:" + a17.f49480h);
                        i18 = i27;
                    }
                }
                i17 = -1;
                dVar.f50819a = i17;
                int i272 = i18 + 1;
                iArr[i18] = i17;
                com.tencent.mapsdk.core.utils.log.LogUtil.c(f50789c, "添加子点成功！" + dVar.a() + "|id:" + a17.f49480h);
                i18 = i272;
            } else {
                a17.f49473a = i19;
                neVar.a(a17);
                com.tencent.mapsdk.core.utils.log.LogUtil.c(f50789c, "更新子点成功！" + dVar.a());
            }
        }
        int[] iArr2 = new int[size];
        pwVar.f50799k = iArr2;
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, size);
    }

    public static /* synthetic */ void a(com.tencent.mapsdk.internal.pw pwVar, java.util.List list, com.tencent.map.tools.Callback callback) {
        com.tencent.mapsdk.internal.ne neVar;
        android.content.Context context;
        com.tencent.mapsdk.internal.ne neVar2;
        android.content.Context context2;
        com.tencent.mapsdk.internal.py pyVar = pwVar.f50790a;
        if (pyVar == null || (neVar = pyVar.f50842b) == null || (context = neVar.getContext()) == null || list == null || list.isEmpty()) {
            return;
        }
        for (int i17 = 0; i17 < list.size() && !pwVar.f50796h; i17++) {
            com.tencent.mapsdk.internal.px.d dVar = (com.tencent.mapsdk.internal.px.d) list.get(i17);
            com.tencent.mapsdk.internal.px.e d17 = pwVar.d(dVar.f50824f);
            java.lang.String str = d17.f50832d;
            if (!android.text.TextUtils.isEmpty(str)) {
                new com.tencent.mapsdk.internal.fw();
                com.tencent.mapsdk.internal.py pyVar2 = pwVar.f50790a;
                if (pyVar2 != null && (neVar2 = pyVar2.f50842b) != null && (context2 = neVar2.getContext()) != null) {
                    int a17 = (int) com.tencent.mapsdk.internal.hs.a(context2);
                    str = a17 <= 1 ? str.replace("{density}", "") : a17 <= 2 ? str.replace("{density}", "@2x") : str.replace("{density}", "@3x");
                }
            }
            java.lang.String str2 = f50789c;
            com.tencent.mapsdk.core.utils.log.LogUtil.c(str2, "请求子点[" + dVar.a() + "]icon url:" + str);
            if (!android.text.TextUtils.isEmpty(str)) {
                com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor createBitmapDescriptor = neVar.createBitmapDescriptor(str, 8);
                d17.f50829a = createBitmapDescriptor;
                createBitmapDescriptor.getFormater().setScale(2);
                if (d17.f50829a.getBitmap(context) != null) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.c(str2, "子点[" + dVar.a() + "]icon下载成功");
                    if (d17.f50833e == 1) {
                        com.tencent.mapsdk.internal.fs.a aVar = new com.tencent.mapsdk.internal.fs.a(dVar.a(), d17.f50835g, android.graphics.Color.parseColor(d17.f50834f));
                        aVar.f49459f = neVar.getTypeface() == null ? android.graphics.Typeface.DEFAULT : neVar.getTypeface();
                        aVar.f49458e = android.graphics.Color.parseColor(d17.f50836h);
                        aVar.f49457d = d17.f50837i;
                        aVar.f49460g = com.tencent.mapsdk.internal.hs.a(context) / 2.0f;
                        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor createBitmapDescriptor2 = neVar.createBitmapDescriptor(aVar, 9);
                        d17.f50830b = createBitmapDescriptor2;
                        if (createBitmapDescriptor2.getBitmap(context) != null) {
                            com.tencent.mapsdk.core.utils.log.LogUtil.c(str2, "子点[" + dVar.a() + "]文本图片创建成功");
                        } else {
                            com.tencent.mapsdk.core.utils.log.LogUtil.d(str2, "子点[" + dVar.a() + "]文本图片创建失败！");
                        }
                    }
                    callback.callback(dVar);
                } else {
                    com.tencent.mapsdk.core.utils.log.LogUtil.d(str2, "子点[" + dVar.a() + "]icon下载失败！");
                }
            }
        }
    }
}
