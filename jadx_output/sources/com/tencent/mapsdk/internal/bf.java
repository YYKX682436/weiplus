package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class bf {

    /* renamed from: s, reason: collision with root package name */
    private static final int f48882s = 10;

    /* renamed from: a, reason: collision with root package name */
    final com.tencent.mapsdk.internal.ab f48883a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f48886d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference<com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationChangeListener> f48888f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference<com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationClickListener> f48889g;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor f48893k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor f48894l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.ne f48895m;

    /* renamed from: n, reason: collision with root package name */
    public int f48896n;

    /* renamed from: o, reason: collision with root package name */
    com.tencent.tencentmap.mapsdk.maps.model.LocationRegion f48897o;

    /* renamed from: t, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor f48901t;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.LocationSource f48884b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f48885c = false;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.model.Circle f48887e = null;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List<java.lang.ref.WeakReference<com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.LocationRegionChangedListener>> f48890h = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle f48891i = new com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle();

    /* renamed from: j, reason: collision with root package name */
    public android.location.Location f48892j = null;

    /* renamed from: p, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicInteger f48898p = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.maps.LocationSource.OnLocationChangedListener f48899q = new com.tencent.tencentmap.mapsdk.maps.LocationSource.OnLocationChangedListener() { // from class: com.tencent.mapsdk.internal.bf.1
        @Override // com.tencent.tencentmap.mapsdk.maps.LocationSource.OnLocationChangedListener
        public final void onLocationChanged(android.location.Location location) {
            com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationChangeListener onMyLocationChangeListener;
            if (location == null) {
                return;
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50225z, "new location changed : ".concat(java.lang.String.valueOf(location)));
            com.tencent.mapsdk.internal.bf bfVar = com.tencent.mapsdk.internal.bf.this;
            android.location.Location location2 = bfVar.f48892j;
            if (location2 == null) {
                bfVar.f48892j = new android.location.Location(location);
            } else {
                try {
                    location2.set(location);
                } catch (java.lang.Exception e17) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.e(com.tencent.mapsdk.internal.kx.f50203d, "location input format exception:" + e17.fillInStackTrace());
                }
            }
            boolean contains = location.getProvider().contains(com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.NAME);
            boolean z17 = com.tencent.mapsdk.internal.bf.this.f48898p.getAndIncrement() == 0 || com.tencent.mapsdk.internal.bf.this.f48898p.get() >= 10;
            if ((contains || z17) && !com.tencent.mapsdk.internal.bf.this.f48890h.isEmpty()) {
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50225z, "check location region change times:" + com.tencent.mapsdk.internal.bf.this.f48898p.get() + " fromCustomAuto:" + contains);
                com.tencent.mapsdk.internal.sm.a().a(com.tencent.mapsdk.internal.bf.this.f48895m.getContext());
                com.tencent.mapsdk.internal.sm.a();
                com.tencent.mapsdk.internal.gc[] c17 = com.tencent.mapsdk.internal.sm.c(com.tencent.mapsdk.internal.sm.f51475c);
                com.tencent.mapsdk.internal.gc b17 = com.tencent.mapsdk.internal.y.b(com.tencent.map.lib.models.GeoPoint.from(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(location.getLatitude(), location.getLongitude())));
                if (b17 == null || c17 == null) {
                    return;
                }
                if (com.tencent.mapsdk.internal.bf.this.f48898p.get() >= 10) {
                    com.tencent.mapsdk.internal.bf.this.f48898p.set(1);
                }
                boolean a17 = com.tencent.mapsdk.internal.sm.a(b17, c17);
                com.tencent.tencentmap.mapsdk.maps.model.LocationRegion locationRegion = new com.tencent.tencentmap.mapsdk.maps.model.LocationRegion();
                com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.RegionName regionName = a17 ? com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.RegionName.INLAND_WITHOUT_SAR_OF_CHINA : com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.RegionName.EARTH;
                locationRegion.regionName = regionName;
                locationRegion.target = location;
                com.tencent.tencentmap.mapsdk.maps.model.LocationRegion locationRegion2 = com.tencent.mapsdk.internal.bf.this.f48897o;
                if (locationRegion2 == null || locationRegion2.regionName != regionName) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50225z, "location region changed: isInlandWithoutSAROfChina = ".concat(java.lang.String.valueOf(a17)));
                    java.util.Iterator<java.lang.ref.WeakReference<com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.LocationRegionChangedListener>> it = com.tencent.mapsdk.internal.bf.this.f48890h.iterator();
                    while (it.hasNext()) {
                        com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.LocationRegionChangedListener locationRegionChangedListener = it.next().get();
                        if (locationRegionChangedListener != null) {
                            locationRegionChangedListener.onLocationRegionChanged(com.tencent.mapsdk.internal.bf.this.f48897o, locationRegion);
                        }
                    }
                }
                com.tencent.mapsdk.internal.bf.this.f48897o = locationRegion;
            }
            com.tencent.mapsdk.internal.bf bfVar2 = com.tencent.mapsdk.internal.bf.this;
            if (bfVar2.f48885c) {
                com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50225z, "updateMyLocation ".concat(java.lang.String.valueOf(location)));
                bfVar2.a(location);
                com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle myLocationStyle = bfVar2.f48891i;
                if (myLocationStyle != null) {
                    com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(location.getLatitude(), location.getLongitude());
                    com.tencent.tencentmap.mapsdk.maps.model.Circle circle = bfVar2.f48887e;
                    if (circle != null) {
                        circle.setCenter(latLng);
                        bfVar2.f48887e.setRadius(location.getAccuracy());
                    }
                    bfVar2.f48895m.a(com.tencent.map.lib.models.GeoPoint.from(latLng), 0.0f, 0.0f, false);
                    int myLocationType = myLocationStyle.getMyLocationType();
                    if (myLocationType == 1) {
                        bfVar2.f48895m.a(location.getBearing());
                    } else if (myLocationType != 2) {
                        if (myLocationType != 3) {
                            bfVar2.f48895m.a(location.getBearing());
                            com.tencent.mapsdk.internal.ab abVar = bfVar2.f48883a;
                            if (abVar != null) {
                                abVar.a(com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.newLatLng(latLng));
                            }
                        } else {
                            com.tencent.mapsdk.internal.ab abVar2 = bfVar2.f48883a;
                            if (abVar2 != null) {
                                bfVar2.f48883a.a(com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.rotateTo(location.getBearing(), abVar2.a().tilt));
                            }
                        }
                    }
                }
                java.lang.ref.WeakReference<com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationChangeListener> weakReference = bfVar2.f48888f;
                if (weakReference == null || (onMyLocationChangeListener = weakReference.get()) == null) {
                    return;
                }
                onMyLocationChangeListener.onMyLocationChange(location);
            }
        }
    };

    /* renamed from: r, reason: collision with root package name */
    public final android.os.Handler f48900r = new android.os.Handler(com.tencent.mapsdk.internal.ko.a("gesture"));

    /* renamed from: com.tencent.mapsdk.internal.bf$2, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass2 implements java.lang.Runnable {
        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.getInstance().requestLatestLocation();
            if (com.tencent.mapsdk.internal.bf.this.f48886d) {
                if (com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.getInstance().hasLocation()) {
                    com.tencent.mapsdk.internal.bf.this.f48900r.postDelayed(this, 300000L);
                } else {
                    com.tencent.mapsdk.internal.bf.this.f48900r.postDelayed(this, 60000L);
                }
            }
        }
    }

    public bf(com.tencent.mapsdk.internal.ne neVar, com.tencent.mapsdk.internal.ab abVar) {
        this.f48895m = neVar;
        this.f48883a = abVar;
    }

    private com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor h() {
        return this.f48893k;
    }

    private void b(android.location.Location location) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationChangeListener onMyLocationChangeListener;
        if (!this.f48885c || location == null) {
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50225z, "updateMyLocation ".concat(java.lang.String.valueOf(location)));
        a(location);
        com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle myLocationStyle = this.f48891i;
        if (myLocationStyle != null) {
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(location.getLatitude(), location.getLongitude());
            com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f48887e;
            if (circle != null) {
                circle.setCenter(latLng);
                this.f48887e.setRadius(location.getAccuracy());
            }
            this.f48895m.a(com.tencent.map.lib.models.GeoPoint.from(latLng), 0.0f, 0.0f, false);
            int myLocationType = myLocationStyle.getMyLocationType();
            if (myLocationType == 1) {
                this.f48895m.a(location.getBearing());
            } else if (myLocationType != 2) {
                if (myLocationType != 3) {
                    this.f48895m.a(location.getBearing());
                    com.tencent.mapsdk.internal.ab abVar = this.f48883a;
                    if (abVar != null) {
                        abVar.a(com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.newLatLng(latLng));
                    }
                } else {
                    com.tencent.mapsdk.internal.ab abVar2 = this.f48883a;
                    if (abVar2 != null) {
                        this.f48883a.a(com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.rotateTo(location.getBearing(), abVar2.a().tilt));
                    }
                }
            }
        }
        java.lang.ref.WeakReference<com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationChangeListener> weakReference = this.f48888f;
        if (weakReference == null || (onMyLocationChangeListener = weakReference.get()) == null) {
            return;
        }
        onMyLocationChangeListener.onMyLocationChange(location);
    }

    private void c() {
        this.f48886d = false;
        a();
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f48887e;
        if (circle != null) {
            circle.remove();
            this.f48887e = null;
        }
        com.tencent.tencentmap.mapsdk.maps.LocationSource locationSource = this.f48884b;
        if (locationSource != null) {
            locationSource.deactivate();
            this.f48884b = null;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.LocationRegionChangedListener regionChangedListener = com.tencent.map.tools.net.NetManager.getInstance().getRegionChangedListener();
        if (regionChangedListener != null) {
            java.util.Iterator<java.lang.ref.WeakReference<com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.LocationRegionChangedListener>> it = this.f48890h.iterator();
            while (it.hasNext()) {
                if (it.next().get() != regionChangedListener) {
                    it.remove();
                }
            }
        }
    }

    private void d() {
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50225z, "enableMyLocation : " + this.f48885c);
        if (this.f48885c) {
            return;
        }
        this.f48885c = true;
        this.f48895m.e(false);
        this.f48895m.f(false);
        this.f48895m.g(false);
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f48887e;
        if (circle != null) {
            circle.setVisible(true);
        }
    }

    private boolean e() {
        return this.f48885c;
    }

    private android.location.Location f() {
        if (this.f48892j == null) {
            return null;
        }
        return new android.location.Location(this.f48892j);
    }

    private com.tencent.tencentmap.mapsdk.maps.LocationSource g() {
        return this.f48884b;
    }

    public final void a() {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50225z, "disableMyLocation " + this.f48885c);
        if (this.f48885c) {
            this.f48885c = false;
            this.f48895m.e(true);
            this.f48895m.f(true);
            this.f48895m.g(true);
            this.f48896n = 0;
            com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f48887e;
            if (circle != null) {
                circle.setVisible(false);
            }
        }
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.LocationSource locationSource) {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50225z, "setLocationSource " + locationSource + " enable " + this.f48885c);
        if (locationSource == null) {
            return;
        }
        com.tencent.tencentmap.mapsdk.maps.LocationSource locationSource2 = this.f48884b;
        if (locationSource2 != null) {
            locationSource2.deactivate();
        }
        this.f48884b = locationSource;
        locationSource.activate(this.f48899q);
        com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.LocationRegionChangedListener regionChangedListener = com.tencent.map.tools.net.NetManager.getInstance().getRegionChangedListener();
        if (regionChangedListener != null) {
            this.f48890h.add(new java.lang.ref.WeakReference<>(regionChangedListener));
        }
        if (com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.getInstance().hasLocationSource()) {
            this.f48886d = true;
            this.f48900r.postDelayed(new com.tencent.mapsdk.internal.bf.AnonymousClass2(), 1000L);
        }
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor b() {
        if (this.f48901t == null) {
            this.f48901t = com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromAsset(this.f48895m, "navi_marker_location.png");
        }
        return this.f48901t;
    }

    public final void a(android.location.Location location) {
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor compassImage;
        android.graphics.Bitmap bitmap;
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(location.getLatitude(), location.getLongitude());
        if (this.f48887e == null) {
            com.tencent.tencentmap.mapsdk.maps.model.CircleOptions circleOptions = new com.tencent.tencentmap.mapsdk.maps.model.CircleOptions();
            circleOptions.radius(location.getAccuracy()).center(latLng).fillColor(this.f48891i.getFillColor()).strokeColor(this.f48891i.getStrokeColor()).strokeWidth(this.f48891i.getStrokeWidth());
            int circleLevel = this.f48891i.getCircleLevel();
            if (circleLevel != -1) {
                circleOptions.level(circleLevel);
            }
            circleOptions.zIndex(this.f48891i.getCircleZIndex());
            com.tencent.mapsdk.internal.bh bhVar = this.f48895m.f50497J;
            this.f48887e = bhVar == null ? null : bhVar.a(circleOptions);
        }
        if (this.f48896n == 0) {
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor myLocationIcon = this.f48891i.getMyLocationIcon();
            if (myLocationIcon == null) {
                myLocationIcon = b();
            }
            android.graphics.Bitmap bitmap2 = myLocationIcon.getBitmap(this.f48895m.getContext());
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                this.f48893k = myLocationIcon;
                this.f48896n = this.f48895m.a(myLocationIcon.getFormater().getBitmapId(), this.f48891i.getAnchorU(), this.f48891i.getAnchorV());
            }
            int myLocationLevel = this.f48891i.getMyLocationLevel();
            if (myLocationLevel != -1) {
                this.f48895m.b(myLocationLevel);
            }
            this.f48895m.c(this.f48891i.getMyLocationZIndex());
            com.tencent.tencentmap.mapsdk.maps.model.LocationCompass locationCompass = this.f48891i.getLocationCompass();
            if (locationCompass != null && locationCompass.getCompassImage() != null && (bitmap = (compassImage = locationCompass.getCompassImage()).getBitmap(this.f48895m.getContext())) != null && !bitmap.isRecycled()) {
                this.f48894l = compassImage;
                this.f48895m.c(compassImage.getFormater().getBitmapId());
                com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor[] compassGroupImages = locationCompass.getCompassGroupImages();
                if (compassGroupImages != null && compassGroupImages.length == 4) {
                    java.lang.String[] strArr = new java.lang.String[compassGroupImages.length];
                    for (int i17 = 0; i17 < compassGroupImages.length; i17++) {
                        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor = compassGroupImages[i17];
                        if (bitmapDescriptor != null) {
                            bitmapDescriptor.getBitmap(this.f48895m.getContext());
                            strArr[i17] = compassGroupImages[i17].getFormater().getBitmapId();
                        } else {
                            strArr[i17] = "";
                        }
                    }
                    this.f48895m.a(compassImage.getFormater().getBitmapId(), strArr[0], strArr[1], strArr[2], strArr[3]);
                }
            }
            com.tencent.tencentmap.mapsdk.maps.model.LocationNavigationGravityline locationNavigationGravityline = this.f48891i.getLocationNavigationGravityline();
            if (locationNavigationGravityline != null) {
                this.f48895m.a(locationNavigationGravityline.getWidth(), locationNavigationGravityline.getColor(), locationNavigationGravityline.getDestination());
            }
        }
    }

    private void b(com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.LocationRegionChangedListener locationRegionChangedListener) {
        if (locationRegionChangedListener != null) {
            java.util.Iterator<java.lang.ref.WeakReference<com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.LocationRegionChangedListener>> it = this.f48890h.iterator();
            while (it.hasNext()) {
                if (it.next().get() != locationRegionChangedListener) {
                    it.remove();
                }
            }
        }
    }

    private static /* synthetic */ void b(com.tencent.mapsdk.internal.bf bfVar, android.location.Location location) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationChangeListener onMyLocationChangeListener;
        if (!bfVar.f48885c || location == null) {
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50225z, "updateMyLocation ".concat(java.lang.String.valueOf(location)));
        bfVar.a(location);
        com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle myLocationStyle = bfVar.f48891i;
        if (myLocationStyle != null) {
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(location.getLatitude(), location.getLongitude());
            com.tencent.tencentmap.mapsdk.maps.model.Circle circle = bfVar.f48887e;
            if (circle != null) {
                circle.setCenter(latLng);
                bfVar.f48887e.setRadius(location.getAccuracy());
            }
            bfVar.f48895m.a(com.tencent.map.lib.models.GeoPoint.from(latLng), 0.0f, 0.0f, false);
            int myLocationType = myLocationStyle.getMyLocationType();
            if (myLocationType == 1) {
                bfVar.f48895m.a(location.getBearing());
            } else if (myLocationType != 2) {
                if (myLocationType != 3) {
                    bfVar.f48895m.a(location.getBearing());
                    com.tencent.mapsdk.internal.ab abVar = bfVar.f48883a;
                    if (abVar != null) {
                        abVar.a(com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.newLatLng(latLng));
                    }
                } else {
                    com.tencent.mapsdk.internal.ab abVar2 = bfVar.f48883a;
                    if (abVar2 != null) {
                        bfVar.f48883a.a(com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.rotateTo(location.getBearing(), abVar2.a().tilt));
                    }
                }
            }
        }
        java.lang.ref.WeakReference<com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationChangeListener> weakReference = bfVar.f48888f;
        if (weakReference == null || (onMyLocationChangeListener = weakReference.get()) == null) {
            return;
        }
        onMyLocationChangeListener.onMyLocationChange(location);
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle myLocationStyle, android.location.Location location) {
        if (location == null || myLocationStyle == null) {
            return;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(location.getLatitude(), location.getLongitude());
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f48887e;
        if (circle != null) {
            circle.setCenter(latLng);
            this.f48887e.setRadius(location.getAccuracy());
        }
        this.f48895m.a(com.tencent.map.lib.models.GeoPoint.from(latLng), 0.0f, 0.0f, false);
        int myLocationType = myLocationStyle.getMyLocationType();
        if (myLocationType == 1) {
            this.f48895m.a(location.getBearing());
            return;
        }
        if (myLocationType != 2) {
            if (myLocationType != 3) {
                this.f48895m.a(location.getBearing());
                com.tencent.mapsdk.internal.ab abVar = this.f48883a;
                if (abVar != null) {
                    abVar.a(com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.newLatLng(latLng));
                    return;
                }
                return;
            }
            com.tencent.mapsdk.internal.ab abVar2 = this.f48883a;
            if (abVar2 != null) {
                this.f48883a.a(com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.rotateTo(location.getBearing(), abVar2.a().tilt));
            }
        }
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle myLocationStyle) {
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor compassImage;
        android.graphics.Bitmap bitmap;
        if (myLocationStyle == null) {
            return;
        }
        this.f48891i = myLocationStyle;
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = this.f48887e;
        if (circle != null) {
            circle.setFillColor(myLocationStyle.getFillColor());
            this.f48887e.setStrokeColor(myLocationStyle.getStrokeColor());
            this.f48887e.setStrokeWidth(myLocationStyle.getStrokeWidth());
            int circleLevel = myLocationStyle.getCircleLevel();
            if (circleLevel != -1) {
                this.f48887e.setLevel(circleLevel);
            }
            this.f48887e.setZIndex(myLocationStyle.getCircleZIndex());
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50225z, "mMyLocationId: " + this.f48896n + ", mIcon " + this.f48893k + ", enableShowMyLocation: " + this.f48885c);
        if (!this.f48885c || this.f48893k == null) {
            return;
        }
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor myLocationIcon = myLocationStyle.getMyLocationIcon();
        if (myLocationIcon == null) {
            myLocationIcon = b();
        }
        android.graphics.Bitmap bitmap2 = myLocationIcon.getBitmap(this.f48895m.getContext());
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            java.lang.String bitmapId = myLocationIcon.getFormater().getBitmapId();
            if (!this.f48893k.getFormater().getBitmapId().equals(bitmapId)) {
                this.f48893k = myLocationStyle.getMyLocationIcon() == null ? b() : myLocationStyle.getMyLocationIcon();
                this.f48896n = this.f48895m.a(bitmapId, myLocationStyle.getAnchorU(), myLocationStyle.getAnchorV());
            }
        }
        int myLocationLevel = myLocationStyle.getMyLocationLevel();
        if (myLocationLevel != -1) {
            this.f48895m.b(myLocationLevel);
        }
        this.f48895m.c(myLocationStyle.getMyLocationZIndex());
        com.tencent.tencentmap.mapsdk.maps.model.LocationCompass locationCompass = myLocationStyle.getLocationCompass();
        if (locationCompass != null && locationCompass.getCompassImage() != null && (bitmap = (compassImage = locationCompass.getCompassImage()).getBitmap(this.f48895m.getContext())) != null && !bitmap.isRecycled()) {
            java.lang.String bitmapId2 = compassImage.getFormater().getBitmapId();
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor = this.f48894l;
            if (!(bitmapDescriptor != null ? bitmapDescriptor.getFormater().getBitmapId() : "").equals(bitmapId2)) {
                this.f48894l = compassImage;
                this.f48895m.c(bitmapId2);
            }
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor[] compassGroupImages = locationCompass.getCompassGroupImages();
            if (compassGroupImages != null && compassGroupImages.length == 4) {
                java.lang.String[] strArr = new java.lang.String[compassGroupImages.length];
                for (int i17 = 0; i17 < compassGroupImages.length; i17++) {
                    com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor2 = compassGroupImages[i17];
                    if (bitmapDescriptor2 != null) {
                        bitmapDescriptor2.getBitmap(this.f48895m.getContext());
                        strArr[i17] = compassGroupImages[i17].getFormater().getBitmapId();
                    } else {
                        strArr[i17] = "";
                    }
                }
                this.f48895m.a(bitmapId2, strArr[0], strArr[1], strArr[2], strArr[3]);
            }
        }
        com.tencent.tencentmap.mapsdk.maps.model.LocationNavigationGravityline locationNavigationGravityline = myLocationStyle.getLocationNavigationGravityline();
        if (locationNavigationGravityline != null) {
            this.f48895m.a(locationNavigationGravityline.getWidth(), locationNavigationGravityline.getColor(), locationNavigationGravityline.getDestination());
        }
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationChangeListener onMyLocationChangeListener) {
        if (onMyLocationChangeListener == null) {
            return;
        }
        this.f48888f = new java.lang.ref.WeakReference<>(onMyLocationChangeListener);
    }

    private boolean a(float f17, float f18) {
        java.lang.ref.WeakReference<com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationClickListener> weakReference;
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationClickListener onMyLocationClickListener;
        com.tencent.mapsdk.engine.jni.models.TappedElement a17 = this.f48895m.f50510j.f48961a.i().a(f17, f18);
        boolean z17 = a17 != null && a17.type == 6;
        if (!z17 || (weakReference = this.f48889g) == null || (onMyLocationClickListener = weakReference.get()) == null) {
            return z17;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = new com.tencent.tencentmap.mapsdk.maps.model.LatLng();
        android.location.Location location = this.f48892j;
        if (location != null) {
            latLng.setAltitude(location.getAltitude());
            latLng.setLongitude(this.f48892j.getLongitude());
            latLng.setLatitude(this.f48892j.getLatitude());
        }
        return onMyLocationClickListener.onMyLocationClicked(latLng);
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationClickListener onMyLocationClickListener) {
        if (onMyLocationClickListener == null) {
            return;
        }
        this.f48889g = new java.lang.ref.WeakReference<>(onMyLocationClickListener);
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.LocationRegionChangedListener locationRegionChangedListener) {
        if (locationRegionChangedListener != null) {
            this.f48890h.add(new java.lang.ref.WeakReference<>(locationRegionChangedListener));
        }
    }
}
