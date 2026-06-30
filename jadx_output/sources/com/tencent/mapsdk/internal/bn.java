package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public abstract class bn implements com.tencent.tencentmap.mapsdk.maps.TencentMapContext {

    /* renamed from: f, reason: collision with root package name */
    private static final java.util.Map<java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component>, com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component> f48993f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    private static final java.util.Set<com.tencent.mapsdk.internal.bn.a> f48994g;

    /* renamed from: h, reason: collision with root package name */
    private static final java.lang.String f48995h = "map-context.cache";

    /* renamed from: i, reason: collision with root package name */
    private static final java.lang.String f48996i = "navi_marker_location.png";

    /* renamed from: j, reason: collision with root package name */
    private static final java.lang.String f48997j = "color_texture_flat_style.png";

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions f48998a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.bo f48999b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mapsdk.internal.hg f49000c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f49001d = false;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f49002e = true;

    /* renamed from: k, reason: collision with root package name */
    private final android.content.Context f49003k;

    /* renamed from: l, reason: collision with root package name */
    private com.tencent.mapsdk.internal.gn f49004l;

    /* renamed from: m, reason: collision with root package name */
    private com.tencent.mapsdk.internal.gm f49005m;

    /* renamed from: n, reason: collision with root package name */
    private com.tencent.mapsdk.internal.mz f49006n;

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component> f49007a;

        /* renamed from: b, reason: collision with root package name */
        java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component> f49008b;

        public a(java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component> cls, java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component> cls2) {
            this.f49007a = cls;
            this.f49008b = cls2;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && com.tencent.mapsdk.internal.bn.a.class == obj.getClass()) {
                com.tencent.mapsdk.internal.bn.a aVar = (com.tencent.mapsdk.internal.bn.a) obj;
                java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component> cls = this.f49007a;
                if (cls == null ? aVar.f49007a != null : !cls.equals(aVar.f49007a)) {
                    return false;
                }
                java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component> cls2 = this.f49008b;
                java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component> cls3 = aVar.f49008b;
                if (cls2 != null) {
                    return cls2.equals(cls3);
                }
                if (cls3 == null) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component> cls = this.f49007a;
            int hashCode = (cls != null ? cls.hashCode() : 0) * 31;
            java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component> cls2 = this.f49008b;
            return hashCode + (cls2 != null ? cls2.hashCode() : 0);
        }
    }

    /* loaded from: classes13.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.String f49009a;

        /* renamed from: c, reason: collision with root package name */
        public java.lang.String f49011c;

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f49012d;

        /* renamed from: f, reason: collision with root package name */
        java.lang.String f49014f;

        /* renamed from: b, reason: collision with root package name */
        public java.lang.String f49010b = com.tencent.mapsdk.internal.hn.m();

        /* renamed from: e, reason: collision with root package name */
        java.lang.String f49013e = com.tencent.mapsdk.internal.hn.n();

        public b(com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
            this.f49014f = "undefined";
            this.f49009a = com.tencent.mapsdk.internal.hn.a();
            if (tencentMapOptions != null) {
                if (!android.text.TextUtils.isEmpty(tencentMapOptions.getMapKey())) {
                    this.f49009a = tencentMapOptions.getMapKey();
                }
                if (!android.text.TextUtils.isEmpty(tencentMapOptions.getSubKey())) {
                    this.f49011c = tencentMapOptions.getSubKey();
                }
                if (!android.text.TextUtils.isEmpty(tencentMapOptions.getSubId())) {
                    this.f49012d = tencentMapOptions.getSubId();
                }
                this.f49014f = tencentMapOptions.getCustomUserId();
            }
        }

        private java.lang.String d() {
            return this.f49009a;
        }

        private java.lang.String e() {
            return this.f49010b;
        }

        private java.lang.String f() {
            return this.f49011c;
        }

        private java.lang.String g() {
            return this.f49012d;
        }

        private java.lang.String h() {
            return this.f49013e;
        }

        private java.lang.String i() {
            return this.f49014f;
        }

        private java.lang.String j() {
            return this.f49009a + "-" + this.f49010b + "-" + this.f49011c + "-" + this.f49012d;
        }

        private java.lang.String k() {
            return com.tencent.mapsdk.internal.li.a(a());
        }

        public final java.lang.String a() {
            return this.f49013e + "-" + this.f49009a + "-" + this.f49010b + "-" + this.f49011c + "-" + this.f49012d;
        }

        public final java.lang.String b() {
            return android.text.TextUtils.isEmpty(this.f49011c) ? this.f49009a : this.f49011c;
        }

        public final java.lang.String c() {
            return com.tencent.mapsdk.internal.li.a(this.f49009a + "-" + this.f49010b + "-" + this.f49011c + "-" + this.f49012d);
        }
    }

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f48994g = hashSet;
        hashSet.add(new com.tencent.mapsdk.internal.bn.a(com.tencent.tencentmap.mapsdk.maps.TencentMapProtocol.class, com.tencent.mapsdk.internal.cp.class));
        hashSet.add(new com.tencent.mapsdk.internal.bn.a(com.tencent.map.sdk.comps.offlinemap.OfflineMapComponent.class, com.tencent.mapsdk.internal.ca.class));
    }

    public bn(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions, com.tencent.mapsdk.internal.bo boVar) {
        this.f49003k = context.getApplicationContext();
        this.f48998a = tencentMapOptions;
        this.f48999b = boVar;
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.attachMapContext(this);
        com.tencent.mapsdk.internal.mw.a(tencentMapOptions);
    }

    public static android.os.Bundle C() {
        byte[] c17;
        java.io.File file = new java.io.File(com.tencent.mapsdk.internal.ks.f50186d, f48995h);
        if (!file.exists() || (c17 = com.tencent.mapsdk.internal.ks.c(file)) == null || c17.length <= 0) {
            return null;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.unmarshall(c17, 0, c17.length);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.readFromParcel(obtain);
        com.tencent.mapsdk.internal.ks.b(file);
        obtain.recycle();
        return bundle;
    }

    private void a() {
        com.tencent.mapsdk.internal.gn gnVar = new com.tencent.mapsdk.internal.gn(this);
        this.f49004l = gnVar;
        if (gnVar.f49616a == 0) {
            gnVar.a(new com.tencent.mapsdk.internal.gn.AnonymousClass1(new com.tencent.mapsdk.internal.gn.AnonymousClass2()));
        }
        gnVar.f49616a++;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mapsdk.internal.gn.e.a(com.tencent.mapsdk.internal.gn.c.CREATE).f49651e = java.lang.Long.valueOf(currentTimeMillis);
        this.f49000c = new com.tencent.mapsdk.internal.hg(currentTimeMillis);
        com.tencent.mapsdk.internal.gn gnVar2 = this.f49004l;
        java.lang.String str = gnVar2.f49618c;
        java.lang.String str2 = gnVar2.f49619d;
        java.lang.String m17 = com.tencent.mapsdk.internal.hn.m();
        java.lang.String str3 = gnVar2.f49620e;
        java.lang.String h17 = com.tencent.mapsdk.internal.hn.h();
        java.lang.String d17 = com.tencent.mapsdk.internal.hn.d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mapsdk.internal.hn.j());
        this.f49005m = new com.tencent.mapsdk.internal.gm(new com.tencent.mapsdk.internal.gl.b(str, str2, m17, str3, h17, d17, sb6.toString(), com.tencent.mapsdk.internal.hn.k(), com.tencent.mapsdk.internal.hn.n(), com.tencent.mapsdk.internal.hn.c(), com.tencent.mapsdk.internal.hn.g()));
    }

    private com.tencent.mapsdk.internal.hg b() {
        return this.f49000c;
    }

    private com.tencent.mapsdk.internal.gm c() {
        return this.f49005m;
    }

    private void e() {
        android.os.Bundle bundle = new android.os.Bundle();
        if (bundle.size() > 0) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            com.tencent.mapsdk.internal.ks.a(com.tencent.mapsdk.internal.ks.b(com.tencent.mapsdk.internal.ks.f50186d, f48995h), obtain.marshall());
            obtain.recycle();
        }
        D();
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.detachMapContext(this);
        com.tencent.mapsdk.internal.hn.r();
    }

    private boolean f() {
        return this.f49001d;
    }

    private boolean g() {
        return this.f49002e;
    }

    private void h() {
        android.os.Bundle bundle = new android.os.Bundle();
        if (bundle.size() > 0) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            com.tencent.mapsdk.internal.ks.a(com.tencent.mapsdk.internal.ks.b(com.tencent.mapsdk.internal.ks.f50186d, f48995h), obtain.marshall());
            obtain.recycle();
        }
        D();
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.detachMapContext(this);
        com.tencent.mapsdk.internal.hn.r();
    }

    private void i() {
        java.util.Map<java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component>, java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component>> B = B();
        if (B != null) {
            for (java.util.Map.Entry<java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component>, java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component>> entry : B.entrySet()) {
                f48994g.add(new com.tencent.mapsdk.internal.bn.a(entry.getKey(), entry.getValue()));
            }
        }
        for (com.tencent.mapsdk.internal.bn.a aVar : f48994g) {
            java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component> cls = aVar.f49007a;
            java.util.Map<java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component>, com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component> map = f48993f;
            com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component component = map.get(cls);
            java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component> cls2 = aVar.f49008b;
            if (component == null && cls2 != null && cls.isAssignableFrom(cls2)) {
                component = (com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component) com.tencent.mapsdk.internal.hp.a(cls2, new java.lang.Object[0]);
                if (component instanceof com.tencent.mapsdk.internal.bm) {
                    ((com.tencent.mapsdk.internal.bm) component).a(getContext());
                }
                map.put(cls, component);
            }
            if (component instanceof com.tencent.mapsdk.internal.bm) {
                ((com.tencent.mapsdk.internal.bm) component).a(this);
            }
        }
    }

    private void j() {
        java.util.Iterator<java.util.Map.Entry<java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component>, com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component>> it = f48993f.entrySet().iterator();
        while (it.hasNext()) {
            com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component value = it.next().getValue();
            if (value instanceof com.tencent.mapsdk.internal.bm) {
                ((com.tencent.mapsdk.internal.bm) value).b(this);
            }
        }
    }

    private void k() {
        java.util.Iterator<java.util.Map.Entry<java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component>, com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component>> it = f48993f.entrySet().iterator();
        while (it.hasNext()) {
            com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component value = it.next().getValue();
            if (value instanceof com.tencent.mapsdk.internal.bm) {
                ((com.tencent.mapsdk.internal.bm) value).c(this);
            }
        }
    }

    private com.tencent.tencentmap.mapsdk.maps.TencentMapProtocol l() {
        return (com.tencent.tencentmap.mapsdk.maps.TencentMapProtocol) getMapComponent(com.tencent.tencentmap.mapsdk.maps.TencentMapProtocol.class);
    }

    private com.tencent.tencentmap.mapsdk.maps.TencentMapOptions m() {
        return this.f48998a;
    }

    private java.io.File n() {
        return E().c();
    }

    private com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource p() {
        return this.f48998a.getOverSeaSource();
    }

    private com.tencent.tencentmap.mapsdk.maps.model.MapViewType q() {
        return this.f48998a.getMapViewType();
    }

    public final void A() {
        java.util.Iterator<java.util.Map.Entry<java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component>, com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component>> it = f48993f.entrySet().iterator();
        while (it.hasNext()) {
            com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component value = it.next().getValue();
            if (value instanceof com.tencent.mapsdk.internal.bm) {
                ((com.tencent.mapsdk.internal.bm) value).c(this);
            }
        }
    }

    public java.util.Map<java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component>, java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component>> B() {
        return null;
    }

    public final void D() {
        for (java.util.Map.Entry<java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component>, com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component> entry : f48993f.entrySet()) {
            com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component value = entry.getValue();
            if (value instanceof com.tencent.mapsdk.internal.bm) {
                com.tencent.mapsdk.internal.bm bmVar = (com.tencent.mapsdk.internal.bm) value;
                bmVar.d(this);
                if (bmVar.f48991a.size() == 0) {
                    f48993f.remove(entry.getKey());
                    bmVar.b_();
                }
            }
        }
    }

    public final com.tencent.mapsdk.internal.mz E() {
        if (this.f49006n == null) {
            this.f49006n = com.tencent.mapsdk.internal.mz.a(this.f49003k, this.f48998a);
        }
        return this.f49006n;
    }

    public final com.tencent.mapsdk.internal.bn.b F() {
        return new com.tencent.mapsdk.internal.bn.b(this.f48998a);
    }

    public abstract java.lang.String G();

    public abstract java.lang.String H();

    public abstract java.lang.String I();

    public abstract com.tencent.mapsdk.internal.bs J();

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapResource
    public com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor createBitmapDescriptor(int i17, int i18) {
        com.tencent.mapsdk.internal.fs fsVar = new com.tencent.mapsdk.internal.fs(getContext(), i18);
        fsVar.f49436a = i17;
        return new com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor(fsVar);
    }

    public final com.tencent.mapsdk.core.MapDelegate d() {
        return this.f48999b;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapContext
    public final android.content.Context getContext() {
        return this.f49003k;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapResource
    public com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle getDefaultMyLocationStyle() {
        com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle myLocationStyle = new com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle();
        myLocationStyle.icon(createBitmapDescriptor(f48996i, 2));
        return myLocationStyle;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapContext
    public com.tencent.tencentmap.mapsdk.maps.TencentMapComponent getMapComponent() {
        return this;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapContext
    public com.tencent.tencentmap.mapsdk.maps.TencentMapResource getMapResource() {
        return this;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapComponent
    public com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol getMapServiceProtocol() {
        return (com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol) getMapComponent(com.tencent.tencentmap.mapsdk.maps.TencentMapProtocol.class);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapResource
    public int getScreenPixels() {
        return com.tencent.mapsdk.internal.hn.f();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapResource
    public android.graphics.Typeface getTypeface() {
        return this.f48998a.getTypeface();
    }

    public abstract boolean o();

    public final void w() {
        com.tencent.mapsdk.internal.bn.b F = F();
        com.tencent.mapsdk.internal.hn.a(this.f49003k, F.f49009a, F.f49010b, F.f49014f);
        java.util.Map<java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component>, java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component>> B = B();
        if (B != null) {
            for (java.util.Map.Entry<java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component>, java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component>> entry : B.entrySet()) {
                f48994g.add(new com.tencent.mapsdk.internal.bn.a(entry.getKey(), entry.getValue()));
            }
        }
        for (com.tencent.mapsdk.internal.bn.a aVar : f48994g) {
            java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component> cls = aVar.f49007a;
            java.util.Map<java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component>, com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component> map = f48993f;
            com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component component = map.get(cls);
            java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component> cls2 = aVar.f49008b;
            if (component == null && cls2 != null && cls.isAssignableFrom(cls2)) {
                component = (com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component) com.tencent.mapsdk.internal.hp.a(cls2, new java.lang.Object[0]);
                if (component instanceof com.tencent.mapsdk.internal.bm) {
                    ((com.tencent.mapsdk.internal.bm) component).a(getContext());
                }
                map.put(cls, component);
            }
            if (component instanceof com.tencent.mapsdk.internal.bm) {
                ((com.tencent.mapsdk.internal.bm) component).a(this);
            }
        }
    }

    public final com.tencent.mapsdk.internal.cr x() {
        com.tencent.tencentmap.mapsdk.maps.TencentMapProtocol l17 = l();
        return l17 instanceof com.tencent.mapsdk.internal.cp ? ((com.tencent.mapsdk.internal.cp) l17).e().f49132b : com.tencent.mapsdk.internal.cp.f();
    }

    public abstract void y();

    public final void z() {
        java.util.Iterator<java.util.Map.Entry<java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component>, com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component>> it = f48993f.entrySet().iterator();
        while (it.hasNext()) {
            com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component value = it.next().getValue();
            if (value instanceof com.tencent.mapsdk.internal.bm) {
                ((com.tencent.mapsdk.internal.bm) value).b(this);
            }
        }
    }

    private void b(boolean z17) {
        this.f49002e = z17;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapComponent
    public <T extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component> T getMapComponent(java.lang.Class<T> cls) {
        T t17 = (T) f48993f.get(cls);
        if (t17 instanceof com.tencent.mapsdk.internal.bm) {
            ((com.tencent.mapsdk.internal.bm) t17).a(this, null);
        }
        return t17;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapResource
    public com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor createBitmapDescriptor(java.lang.String str, int i17) {
        com.tencent.mapsdk.internal.fs fsVar = new com.tencent.mapsdk.internal.fs(getContext(), i17);
        if (i17 == 2) {
            fsVar.f49437b = str;
            return new com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor(fsVar);
        }
        if (i17 == 3) {
            fsVar.f49438c = str;
            return new com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor(fsVar);
        }
        if (i17 == 4) {
            fsVar.f49439d = str;
            return new com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor(fsVar);
        }
        if (i17 != 8) {
            return null;
        }
        fsVar.f49441f = str;
        return new com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor(fsVar);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapResource
    public com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor createBitmapDescriptor(float f17, int i17) {
        com.tencent.mapsdk.internal.fs fsVar = new com.tencent.mapsdk.internal.fs(getContext(), i17);
        fsVar.f49440e = f17;
        return new com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor(fsVar);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapResource
    public com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor createBitmapDescriptor(android.os.Parcelable parcelable, int i17) {
        com.tencent.mapsdk.internal.fs fsVar = new com.tencent.mapsdk.internal.fs(getContext(), i17);
        if (i17 == 9) {
            if (!(parcelable instanceof com.tencent.mapsdk.internal.fs.a)) {
                return null;
            }
            fsVar.f49442g = (com.tencent.mapsdk.internal.fs.a) parcelable;
            return new com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor(fsVar);
        }
        if (i17 == 7 && (parcelable instanceof android.graphics.Bitmap)) {
            return new com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor(fsVar.a((android.graphics.Bitmap) parcelable));
        }
        return null;
    }

    private void a(boolean z17) {
        this.f49001d = z17;
    }

    private static void a(android.os.Bundle bundle) {
        if (bundle.size() > 0) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            com.tencent.mapsdk.internal.ks.a(com.tencent.mapsdk.internal.ks.b(com.tencent.mapsdk.internal.ks.f50186d, f48995h), obtain.marshall());
            obtain.recycle();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapResource
    public com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor createBitmapDescriptor(android.graphics.Bitmap bitmap, int i17) {
        return new com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor(new com.tencent.mapsdk.internal.fs(getContext(), i17).a(bitmap));
    }

    private <T extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component> T a(java.lang.Class<T> cls) {
        T t17 = (T) f48993f.get(cls);
        if (t17 instanceof com.tencent.mapsdk.internal.bm) {
            ((com.tencent.mapsdk.internal.bm) t17).a(this, null);
        }
        return t17;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapResource
    public com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor createBitmapDescriptor(android.graphics.Bitmap[] bitmapArr, int i17) {
        com.tencent.mapsdk.internal.fs fsVar = new com.tencent.mapsdk.internal.fs(getContext(), i17);
        fsVar.f49443h = bitmapArr;
        fsVar.getBitmap(fsVar.f49444i);
        return new com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor(fsVar);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapResource
    public com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor createBitmapDescriptor(int i17) {
        com.tencent.mapsdk.internal.fs fsVar = new com.tencent.mapsdk.internal.fs(getContext(), i17);
        if (i17 == 5) {
            return new com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor(fsVar);
        }
        return null;
    }
}
