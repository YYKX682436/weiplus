package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class bg implements com.tencent.mapsdk.internal.ai, com.tencent.mapsdk.internal.aj, com.tencent.mapsdk.internal.al, com.tencent.mapsdk.internal.fn {
    private long A;
    private com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback B;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bu> f48904a;

    /* renamed from: b, reason: collision with root package name */
    public volatile com.tencent.mapsdk.internal.tr f48905b;

    /* renamed from: c, reason: collision with root package name */
    public android.content.Context f48906c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mapsdk.internal.bk f48907d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mapsdk.internal.rr f48908e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mapsdk.internal.qh f48909f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mapsdk.internal.qu f48910g;

    /* renamed from: h, reason: collision with root package name */
    com.tencent.tencentmap.mapsdk.maps.model.CameraPosition f48911h;

    /* renamed from: l, reason: collision with root package name */
    private java.lang.String f48915l;

    /* renamed from: n, reason: collision with root package name */
    private com.tencent.mapsdk.internal.re f48917n;

    /* renamed from: w, reason: collision with root package name */
    private float f48926w;

    /* renamed from: x, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.ey f48927x;

    /* renamed from: y, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.CameraUpdate f48928y;

    /* renamed from: z, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.CameraUpdate f48929z;

    /* renamed from: m, reason: collision with root package name */
    private com.tencent.mapsdk.internal.qa f48916m = null;

    /* renamed from: o, reason: collision with root package name */
    private final com.tencent.map.lib.models.GeoPoint f48918o = null;

    /* renamed from: p, reason: collision with root package name */
    private final com.tencent.map.lib.models.GeoPoint f48919p = null;

    /* renamed from: q, reason: collision with root package name */
    private int f48920q = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f48921r = 0;

    /* renamed from: s, reason: collision with root package name */
    private int f48922s = 0;

    /* renamed from: t, reason: collision with root package name */
    private int f48923t = 0;

    /* renamed from: i, reason: collision with root package name */
    final byte[] f48912i = new byte[0];

    /* renamed from: u, reason: collision with root package name */
    private int f48924u = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f48925v = 1000;
    private com.tencent.mapsdk.internal.ad.a C = new com.tencent.mapsdk.internal.ad.a() { // from class: com.tencent.mapsdk.internal.bg.1
        @Override // com.tencent.mapsdk.internal.ad.a
        public final void a(com.tencent.mapsdk.internal.jm jmVar) {
            com.tencent.mapsdk.internal.tr trVar;
            com.tencent.mapsdk.vector.VectorMap vectorMap;
            if (jmVar.f50040z == 10000 && (jmVar instanceof com.tencent.mapsdk.internal.th) && (trVar = com.tencent.mapsdk.internal.bg.this.f48905b) != null && (vectorMap = (com.tencent.mapsdk.vector.VectorMap) trVar.e_) != null) {
                com.tencent.mapsdk.internal.th thVar = (com.tencent.mapsdk.internal.th) jmVar;
                if (thVar.Q) {
                    vectorMap.b((trVar.Z / 2) - thVar.R, (trVar.f52180aa / 2) - thVar.S);
                }
                if (thVar.f51634h) {
                    vectorMap.b(thVar.K, thVar.L);
                }
                if (thVar.N || thVar.M || thVar.O) {
                    vectorMap.f52512o.f50508h.a((float) thVar.P);
                }
                if (thVar.T) {
                    int i17 = thVar.f51604aa;
                    int i18 = thVar.f51605ab;
                    vectorMap.a(i17, i18);
                    if (thVar.f51633g) {
                        trVar.b(i17, i18);
                    }
                }
                if (thVar.f51606ac) {
                    vectorMap.b(thVar.f51610ag);
                }
                if (thVar.f51611ah) {
                    vectorMap.a(thVar.f51615al);
                }
                if (thVar.Q) {
                    vectorMap.b(thVar.R - (trVar.Z / 2), thVar.S - (trVar.f52180aa / 2));
                }
            }
        }
    };

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.th.a f48913j = new com.tencent.mapsdk.internal.th.a() { // from class: com.tencent.mapsdk.internal.bg.2
        @Override // com.tencent.mapsdk.internal.th.a
        public final float a() {
            if (com.tencent.mapsdk.internal.bg.this.f48905b == null) {
                return 0.0f;
            }
            return ((com.tencent.mapsdk.vector.VectorMap) com.tencent.mapsdk.internal.bg.this.f48905b.e_).t();
        }

        @Override // com.tencent.mapsdk.internal.th.a
        public final int b() {
            if (com.tencent.mapsdk.internal.bg.this.f48905b == null) {
                return 0;
            }
            return ((com.tencent.mapsdk.vector.VectorMap) com.tencent.mapsdk.internal.bg.this.f48905b.e_).q();
        }

        @Override // com.tencent.mapsdk.internal.th.a
        public final com.tencent.map.lib.models.GeoPoint c() {
            if (com.tencent.mapsdk.internal.bg.this.f48905b == null) {
                return null;
            }
            return ((com.tencent.mapsdk.vector.VectorMap) com.tencent.mapsdk.internal.bg.this.f48905b.e_).r();
        }

        @Override // com.tencent.mapsdk.internal.th.a
        public final float d() {
            if (com.tencent.mapsdk.internal.bg.this.f48905b == null) {
                return 0.0f;
            }
            return ((com.tencent.mapsdk.vector.VectorMap) com.tencent.mapsdk.internal.bg.this.f48905b.e_).v();
        }

        @Override // com.tencent.mapsdk.internal.th.a
        public final float e() {
            if (com.tencent.mapsdk.internal.bg.this.f48905b == null) {
                return 0.0f;
            }
            return ((com.tencent.mapsdk.vector.VectorMap) com.tencent.mapsdk.internal.bg.this.f48905b.e_).w();
        }

        @Override // com.tencent.mapsdk.internal.th.a
        public final float f() {
            if (com.tencent.mapsdk.internal.bg.this.f48905b == null) {
                return 0.0f;
            }
            return com.tencent.mapsdk.internal.bg.this.D();
        }

        @Override // com.tencent.mapsdk.internal.th.a
        public final com.tencent.map.lib.models.GeoPoint g() {
            if (com.tencent.mapsdk.internal.bg.this.f48905b == null) {
                return null;
            }
            return com.tencent.mapsdk.internal.bg.this.f48905b.t();
        }

        @Override // com.tencent.mapsdk.internal.th.a
        public final boolean h() {
            if (com.tencent.mapsdk.internal.bg.this.f48905b == null) {
                return false;
            }
            return com.tencent.mapsdk.internal.bg.this.f48905b.f52199n.f48778f;
        }

        @Override // com.tencent.mapsdk.internal.th.a
        public final void a(java.lang.Runnable runnable) {
            if (runnable == null || com.tencent.mapsdk.internal.bg.this.f48905b == null) {
                return;
            }
            com.tencent.mapsdk.internal.ko.a(runnable, 100L);
        }
    };

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mapsdk.internal.fq f48914k = new com.tencent.mapsdk.internal.fq() { // from class: com.tencent.mapsdk.internal.bg.6
        @Override // com.tencent.mapsdk.internal.fq
        public final void u() {
            com.tencent.mapsdk.internal.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.bg.6.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (com.tencent.mapsdk.internal.bg.this.f48905b == null) {
                        return;
                    }
                    com.tencent.mapsdk.internal.bg.this.f48905b.a(((com.tencent.mapsdk.vector.VectorMap) com.tencent.mapsdk.internal.bg.this.f48905b.e_).f52512o.f50520t.a());
                }
            });
        }
    };

    public bg(com.tencent.mapsdk.internal.bd bdVar, java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bu> weakReference, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        this.f48905b = null;
        this.f48906c = null;
        this.f48915l = null;
        this.f48907d = null;
        this.f48917n = null;
        this.f48908e = null;
        this.f48926w = 1.0f;
        android.content.Context applicationContext = bdVar.getContext().getApplicationContext();
        this.f48906c = applicationContext;
        this.f48926w = com.tencent.mapsdk.internal.hs.a(applicationContext);
        this.f48904a = weakReference;
        this.f48905b = (com.tencent.mapsdk.internal.tr) bdVar.d();
        if (com.tencent.mapsdk.internal.hl.f49771b == null || com.tencent.mapsdk.internal.hl.a.b() == 0) {
            com.tencent.mapsdk.internal.hl.f49771b = new com.tencent.mapsdk.internal.hl.a(this.f48906c, this.f48905b.f49018f, java.lang.Math.max(10, tencentMapOptions.getMaxIconMemoryCacheSize()) * 1048576);
        } else {
            com.tencent.mapsdk.internal.hl.a.a();
        }
        this.f48905b.a(this);
        this.f48927x = ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).getProjection();
        ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).f52512o.f50508h.D = this.C;
        ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a(this.f48914k);
        if (tencentMapOptions != null && !com.tencent.mapsdk.internal.hr.a(tencentMapOptions.getSubKey())) {
            this.f48915l = tencentMapOptions.getSubKey();
        }
        com.tencent.mapsdk.internal.re reVar = this.f48905b.f52273as.H;
        this.f48917n = reVar;
        this.f48909f = new com.tencent.mapsdk.internal.qh(this.f48906c, reVar, this.f48905b.ad());
        this.f48908e = new com.tencent.mapsdk.internal.rr(this.f48906c, this.f48915l);
        this.f48910g = new com.tencent.mapsdk.internal.qu(this.f48906c, bdVar, this.f48915l);
        if (this.f48907d == null) {
            this.f48907d = new com.tencent.mapsdk.internal.bk(bdVar, this.f48905b.ac(), weakReference);
        }
    }

    private com.tencent.mapsdk.internal.bk E() {
        return this.f48907d;
    }

    private com.tencent.mapsdk.internal.rr F() {
        return this.f48908e;
    }

    private com.tencent.mapsdk.internal.qu G() {
        return this.f48910g;
    }

    private com.tencent.mapsdk.internal.qh H() {
        return this.f48909f;
    }

    private void I() {
        if (this.f48905b != null) {
            ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).b(this.f48914k);
            this.f48905b.l();
            this.f48905b = null;
        }
        if (this.f48906c != null) {
            this.f48906c = null;
        }
        com.tencent.mapsdk.internal.hl.a aVar = com.tencent.mapsdk.internal.hl.f49771b;
        if (aVar != null) {
            aVar.c();
        }
    }

    private com.tencent.mapsdk.internal.tr J() {
        return this.f48905b;
    }

    private android.content.Context K() {
        return this.f48906c;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final int A() {
        return this.f48925v;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion B() {
        android.graphics.Point point = new android.graphics.Point(0, this.f48905b.f52180aa);
        android.graphics.Point point2 = new android.graphics.Point(this.f48905b.Z, this.f48905b.f52180aa);
        android.graphics.Point point3 = new android.graphics.Point(0, 0);
        android.graphics.Point point4 = new android.graphics.Point(this.f48905b.Z, 0);
        com.tencent.tencentmap.mapsdk.maps.model.LatLng a17 = a(point);
        com.tencent.tencentmap.mapsdk.maps.model.LatLng a18 = a(point2);
        com.tencent.tencentmap.mapsdk.maps.model.LatLng a19 = a(point3);
        com.tencent.tencentmap.mapsdk.maps.model.LatLng a27 = a(point4);
        return new com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion(a17, a18, a19, a27, com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.builder().include(a17).include(a18).include(a19).include(a27).build());
    }

    @Override // com.tencent.mapsdk.internal.al
    public final java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bu> C() {
        return this.f48904a;
    }

    public final float D() {
        return ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).f52512o.f50520t.a();
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void e() {
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final int f() {
        int m17 = ((com.tencent.mapsdk.internal.ne) this.f48905b.d_).f50508h.m();
        com.tencent.mapsdk.internal.rr rrVar = this.f48908e;
        if (rrVar != null) {
            return rrVar.b(m17);
        }
        return 0;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final int g() {
        return -1;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final boolean h() {
        return ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).f52512o.f50517q;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void i() {
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void j() {
        com.tencent.mapsdk.internal.bu buVar = this.f48904a.get();
        if (buVar != null) {
            buVar.a();
        }
        com.tencent.mapsdk.internal.bk bkVar = this.f48907d;
        if (bkVar != null) {
            bkVar.j();
        }
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void k() {
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void l() {
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void m() {
        com.tencent.mapsdk.internal.bu buVar = this.f48904a.get();
        if (buVar != null) {
            buVar.c();
        }
        com.tencent.mapsdk.internal.qa qaVar = this.f48916m;
        if (qaVar != null) {
            qaVar.a();
            this.f48916m = null;
        }
        com.tencent.mapsdk.internal.bk bkVar = this.f48907d;
        if (bkVar != null) {
            com.tencent.mapsdk.internal.tr trVar = bkVar.f48977b;
            if (trVar != null) {
                android.os.Handler handler = bkVar.f48984i;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                ((com.tencent.mapsdk.vector.VectorMap) trVar.e_).f52512o.f50508h.b(bkVar);
                trVar.f52188ai.remove(bkVar);
                trVar.b((com.tencent.mapsdk.internal.fh) bkVar);
                android.view.ViewGroup ac6 = trVar.ac();
                if (ac6 != null) {
                    ac6.removeAllViews();
                }
                java.util.Iterator<com.tencent.mapsdk.internal.eu> it = bkVar.f48983h.iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
                bkVar.f48983h.clear();
            }
            this.f48907d = null;
        }
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void n() {
        com.tencent.mapsdk.internal.bu buVar = this.f48904a.get();
        if (buVar != null) {
            buVar.b();
        }
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final java.lang.String o() {
        return com.tencent.mapsdk.internal.hn.i();
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final com.tencent.tencentmap.mapsdk.maps.model.Language p() {
        com.tencent.mapsdk.vector.VectorMap vectorMap;
        if (this.f48905b != null && (vectorMap = (com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_) != null) {
            return vectorMap.getLanguage();
        }
        return com.tencent.tencentmap.mapsdk.maps.model.Language.zh;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void q() {
        com.tencent.mapsdk.vector.VectorMap vectorMap;
        if (this.f48905b == null || (vectorMap = (com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_) == null) {
            return;
        }
        vectorMap.clearRouteNameSegments();
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final int r() {
        com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding;
        if (this.f48905b == null || this.f48905b.f52199n == null || (indoorBuilding = this.f48905b.f52199n.f48779g) == null) {
            return -1;
        }
        return indoorBuilding.getActiveLevelIndex();
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final java.lang.String[] s() {
        com.tencent.mapsdk.internal.ac acVar;
        com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding;
        java.lang.String[] strArr = null;
        if (this.f48905b != null && this.f48905b.f52199n != null && (indoorBuilding = (acVar = this.f48905b.f52199n).f48779g) != null && indoorBuilding.getLevels() != null && !acVar.f48779g.getLevels().isEmpty()) {
            java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel> levels = acVar.f48779g.getLevels();
            strArr = new java.lang.String[levels.size()];
            for (int i17 = 0; i17 < levels.size(); i17++) {
                strArr[i17] = levels.get(i17).getName();
            }
        }
        return strArr;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final java.lang.String t() {
        if (this.f48905b == null || this.f48905b.f52199n == null) {
            return null;
        }
        com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding = this.f48905b.f52199n.f48779g;
        return indoorBuilding == null ? "" : indoorBuilding.getBuildingName();
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding u() {
        if (this.f48905b == null || this.f48905b.f52199n == null) {
            return null;
        }
        return this.f48905b.f52199n.f48779g;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final java.lang.String v() {
        com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding;
        if (this.f48905b == null || this.f48905b.f52199n == null || (indoorBuilding = this.f48905b.f52199n.f48779g) == null) {
            return null;
        }
        return indoorBuilding.getBuidlingId();
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final boolean w() {
        if (this.f48905b == null) {
            return false;
        }
        return this.f48905b.C();
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final boolean x() {
        if (this.f48905b == null) {
            return false;
        }
        return this.f48905b.f52184ae;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final java.util.ArrayList<com.tencent.tencentmap.mapsdk.maps.model.MapPoi> y() {
        if (this.f48905b == null) {
            return null;
        }
        return this.f48905b.f52273as.Q();
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final java.lang.String z() {
        com.tencent.mapsdk.internal.tk tkVar;
        java.lang.String str;
        com.tencent.mapsdk.internal.ne neVar;
        com.tencent.mapsdk.internal.tk tkVar2;
        java.lang.String a17;
        if (this.f48906c != null && this.f48905b != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.tencent.mapsdk.internal.mv a18 = !com.tencent.mapsdk.internal.hr.a(this.f48915l) ? com.tencent.mapsdk.internal.mx.a(this.f48906c, this.f48915l) : com.tencent.mapsdk.internal.my.a(this.f48906c);
                jSONObject.put("cfgVer", java.lang.String.format("%s-%s-%s,%s-%s-%s,%s-%s-%s", com.tencent.mapsdk.internal.ep.f49364i, java.lang.Integer.valueOf(a18.b(com.tencent.mapsdk.internal.er.f49382a)), a18.a(com.tencent.mapsdk.internal.er.f49401t), com.tencent.mapsdk.internal.ep.f49367l, java.lang.Integer.valueOf(a18.b("indoormap_style_version")), a18.a("indoormap_style_md5"), com.tencent.mapsdk.internal.ep.f49368m, java.lang.Integer.valueOf(a18.b("indoormap_style_night_version")), a18.a("indoormap_style_night_md5")));
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_RESOLUTION, "{" + com.tencent.mapsdk.internal.hs.b(this.f48906c) + "," + com.tencent.mapsdk.internal.hs.c(this.f48906c) + "}");
                jSONObject.put("density", (double) this.f48926w);
                com.tencent.mapsdk.internal.ne neVar2 = ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).f52512o;
                if (neVar2 != null && (tkVar = neVar2.f50506f) != null) {
                    str = (java.lang.String) tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass51(), (com.tencent.mapsdk.internal.tk.AnonymousClass51) null);
                    jSONObject.put("renderStatus", str);
                    neVar = ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).f52512o;
                    if (neVar != null && (tkVar2 = neVar.f50506f) != null) {
                        a17 = tkVar2.a();
                        jSONObject.put("renderError", a17);
                        jSONObject.put("sdkver", "5.10.0.2023");
                        return jSONObject.toString();
                    }
                    a17 = null;
                    jSONObject.put("renderError", a17);
                    jSONObject.put("sdkver", "5.10.0.2023");
                    return jSONObject.toString();
                }
                str = null;
                jSONObject.put("renderStatus", str);
                neVar = ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).f52512o;
                if (neVar != null) {
                    a17 = tkVar2.a();
                    jSONObject.put("renderError", a17);
                    jSONObject.put("sdkver", "5.10.0.2023");
                    return jSONObject.toString();
                }
                a17 = null;
                jSONObject.put("renderError", a17);
                jSONObject.put("sdkver", "5.10.0.2023");
                return jSONObject.toString();
            } catch (org.json.JSONException unused) {
            }
        }
        return null;
    }

    private float c(float f17) {
        if (this.f48905b == null || this.f48905b.f52273as == null || this.f48905b.e_ == 0 || this.f48905b.f52273as.f50520t == null) {
            return f17;
        }
        float a17 = this.f48905b.f52273as.f50520t.a();
        int p17 = ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).p();
        int q17 = ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).q();
        float f18 = p17;
        return (a17 < f18 || a17 > ((float) q17)) ? java.lang.Math.min(q17, java.lang.Math.max(f18, f17)) : f17;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final android.graphics.Point b(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        com.tencent.mapsdk.internal.tr trVar;
        M m17;
        com.tencent.mapsdk.internal.fu a17;
        if (latLng == null || (trVar = this.f48905b) == null || (m17 = trVar.e_) == 0 || ((com.tencent.mapsdk.vector.VectorMap) m17).getProjection() == null || (a17 = ((com.tencent.mapsdk.vector.VectorMap) trVar.e_).getProjection().a(com.tencent.map.lib.models.GeoPoint.from(latLng))) == null) {
            return null;
        }
        android.graphics.Point point = new android.graphics.Point();
        point.x = (int) java.lang.Math.round(a17.f49467a);
        point.y = (int) java.lang.Math.round(a17.f49468b);
        return point;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void d() {
        ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).y();
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void e(int i17) {
        com.tencent.mapsdk.internal.ne neVar;
        if (this.f48905b == null || (neVar = this.f48905b.f52273as) == null) {
            return;
        }
        neVar.e(i17);
        neVar.f50522v = true;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void g(boolean z17) {
        if (this.f48905b != null) {
            this.f48905b.f52194i = z17;
        }
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void i(boolean z17) {
        if (this.f48905b == null || this.f48905b.e_ == 0) {
            return;
        }
        com.tencent.mapsdk.vector.VectorMap vectorMap = (com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_;
        vectorMap.f52513p = z17;
        vectorMap.f52512o.j(z17);
    }

    private void a(com.tencent.mapsdk.internal.bk.a aVar) {
        com.tencent.mapsdk.internal.sl slVar = this.f48907d.f48978c;
        if (slVar != null) {
            slVar.f51455d = aVar;
        }
    }

    private void j(boolean z17) {
        com.tencent.mapsdk.internal.bu buVar = this.f48904a.get();
        if (buVar != null) {
            buVar.setZOrderMediaOverlay(z17);
        }
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void d(boolean z17) {
        com.tencent.mapsdk.vector.VectorMap vectorMap;
        com.tencent.mapsdk.internal.tk tkVar;
        if (this.f48905b == null || this.f48905b.f52199n == null || (vectorMap = this.f48905b.f52199n.f48776d) == null || (tkVar = vectorMap.f52512o.f50506f) == null || tkVar.f51661e == 0) {
            return;
        }
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass173(z17));
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void h(boolean z17) {
        if (this.f48905b == null) {
            return;
        }
        this.f48905b.f52184ae = z17;
    }

    private void a(com.tencent.mapsdk.internal.sj.c cVar, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        com.tencent.mapsdk.internal.sj sjVar;
        com.tencent.mapsdk.internal.bk bkVar = this.f48907d;
        if (tencentMapOptions == null || tencentMapOptions.getExtSurface() == null || (sjVar = bkVar.f48979d) == null) {
            return;
        }
        java.util.List<com.tencent.mapsdk.internal.sj.c> list = sjVar.f51417r;
        if (list != null && cVar != null) {
            list.add(cVar);
        }
        int extSurfaceWidth = tencentMapOptions.getExtSurfaceWidth();
        int extSurfaceHeight = tencentMapOptions.getExtSurfaceHeight();
        android.view.ViewGroup ac6 = bkVar.f48977b.ac();
        if (ac6 != null) {
            ac6.measure(android.view.View.MeasureSpec.makeMeasureSpec(extSurfaceWidth, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(extSurfaceHeight, 1073741824));
        }
        bkVar.b(extSurfaceWidth, extSurfaceHeight);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void e(boolean z17) {
        if (this.f48905b == null) {
            return;
        }
        if (z17) {
            this.f48905b.A();
            return;
        }
        com.tencent.mapsdk.internal.rn rnVar = this.f48905b.f52196k;
        if (rnVar != null) {
            rnVar.d();
        }
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void f(boolean z17) {
        if (this.f48905b != null) {
            this.f48905b.f52182ac = z17;
        }
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void f(int i17) {
        com.tencent.mapsdk.internal.rq a17;
        com.tencent.mapsdk.internal.hg hgVar;
        if (i17 == 1000 || i17 == 1011 || i17 == 1008) {
            if (i17 == 1008 && (hgVar = this.f48905b.f52273as.f49000c) != null) {
                hgVar.e().f49689a++;
            }
            this.f48925v = i17;
            if (i17 == 1000) {
                i17 = this.f48924u;
            }
            com.tencent.mapsdk.internal.rr rrVar = this.f48908e;
            if (rrVar != null && (a17 = rrVar.a(i17)) != null) {
                i17 = a17.f51249a;
            }
            this.f48905b.f52273as.f(i17);
        }
    }

    private void b(boolean z17, long j17, com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback cancelableCallback) {
        if (!z17) {
            ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).c(a(((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).t() / 2.0f));
            return;
        }
        com.tencent.mapsdk.internal.th thVar = new com.tencent.mapsdk.internal.th();
        thVar.b(b(-1.0f));
        thVar.f51603a = this.f48913j;
        thVar.f51632f = cancelableCallback;
        thVar.a(j17);
        ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a(thVar);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void d(int i17) {
        com.tencent.mapsdk.internal.ne neVar;
        if (this.f48905b == null || (neVar = this.f48905b.f52273as) == null) {
            return;
        }
        neVar.d(i17);
        neVar.f50522v = true;
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng a(android.graphics.Point point) {
        M m17;
        com.tencent.mapsdk.internal.tr trVar = this.f48905b;
        if (trVar == null || (m17 = trVar.e_) == 0 || ((com.tencent.mapsdk.vector.VectorMap) m17).getProjection() == null) {
            return null;
        }
        return com.tencent.mapsdk.internal.kr.a(((com.tencent.mapsdk.vector.VectorMap) trVar.e_).getProjection().a(new com.tencent.mapsdk.internal.fu(point.x, point.y)));
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final float c() {
        return ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).p();
    }

    private void c(float f17, float f18) {
        com.tencent.mapsdk.internal.ne neVar = ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).f52512o;
        if (neVar != null) {
            com.tencent.mapsdk.internal.ad adVar = neVar.f50508h;
            adVar.E = f17;
            adVar.F = f18;
        }
    }

    @Override // com.tencent.mapsdk.internal.aj
    public final double a(double d17) {
        return ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).getProjection().metersPerPixel(d17);
    }

    private float b(float f17) {
        if (this.f48905b == null || this.f48905b.f52273as == null || this.f48905b.e_ == 0 || this.f48905b.f52273as.f50520t == null) {
            return f17;
        }
        float a17 = this.f48905b.f52273as.f50520t.a();
        return c(f17 + a17) - a17;
    }

    private void a(boolean z17, long j17, com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback cancelableCallback) {
        if (!z17) {
            ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).c(a(((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).t() * 2.0f));
            return;
        }
        com.tencent.mapsdk.internal.th thVar = new com.tencent.mapsdk.internal.th();
        thVar.b(b(1.0f));
        thVar.f51603a = this.f48913j;
        thVar.f51632f = cancelableCallback;
        thVar.a(j17);
        ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a(thVar);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void c(boolean z17) {
        if (this.f48905b == null || this.f48905b.f52199n == null) {
            return;
        }
        com.tencent.mapsdk.internal.ac acVar = this.f48905b.f52199n;
        int i17 = z17 ? com.tencent.mapsdk.internal.ac.a.f48797b : com.tencent.mapsdk.internal.ac.a.f48798c;
        acVar.f48775c = i17;
        acVar.a(i17);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void c(int i17) {
        com.tencent.mapsdk.internal.ac acVar;
        com.tencent.mapsdk.internal.ne neVar;
        if (this.f48905b == null || this.f48905b.f52199n == null || (neVar = (acVar = this.f48905b.f52199n).f48777e) == null) {
            return;
        }
        com.tencent.mapsdk.internal.hg hgVar = neVar.f49000c;
        com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding = acVar.f48779g;
        if (indoorBuilding != null) {
            java.lang.String buidlingId = indoorBuilding.getBuidlingId();
            if (hgVar != null && !android.text.TextUtils.isEmpty(buidlingId)) {
                hgVar.d().a(buidlingId).b();
            }
        }
        com.tencent.mapsdk.internal.tk tkVar = acVar.f48777e.f50506f;
        if (tkVar != null) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass164(i17));
        }
        acVar.e();
    }

    private void b(float f17, boolean z17, long j17, com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback cancelableCallback) {
        double pow;
        if (this.f48905b == null) {
            return;
        }
        float b17 = b(f17);
        if (b17 == 0.0f) {
            return;
        }
        if (!z17) {
            if (b17 < 0.0f) {
                pow = java.lang.Math.pow(2.0d, java.lang.Math.abs(b17));
            } else {
                pow = java.lang.Math.pow(0.5d, java.lang.Math.abs(b17));
            }
            ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a(((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).t() * ((float) (1.0d / pow)));
            return;
        }
        com.tencent.mapsdk.internal.th thVar = new com.tencent.mapsdk.internal.th();
        thVar.b(b17);
        thVar.f51603a = this.f48913j;
        thVar.f51632f = cancelableCallback;
        thVar.a(j17);
        ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a(thVar);
    }

    private void a(float f17, float f18, boolean z17, long j17, com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback cancelableCallback) {
        if (this.f48905b == null) {
            return;
        }
        if (f17 == 0.0f && f18 == 0.0f) {
            return;
        }
        if (!z17) {
            ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).b((int) f17, (int) f18);
            return;
        }
        com.tencent.mapsdk.internal.th thVar = new com.tencent.mapsdk.internal.th();
        int i17 = (int) f17;
        int i18 = (int) f18;
        if (i17 == 0 && i18 == 0) {
            thVar.f51634h = false;
        }
        thVar.I = i17;
        thVar.f51602J = i18;
        thVar.f51634h = true;
        thVar.f51603a = this.f48913j;
        thVar.f51632f = cancelableCallback;
        thVar.a(j17);
        ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a(thVar);
    }

    private void a(float f17, boolean z17, long j17, com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback cancelableCallback) {
        if (this.f48905b == null) {
            return;
        }
        float c17 = c(f17);
        if (!z17) {
            ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a((float) (1.0d / java.lang.Math.pow(2.0d, 20.0f - java.lang.Math.min(c17, java.lang.Math.min(((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).q(), 22)))));
            return;
        }
        com.tencent.mapsdk.internal.th thVar = new com.tencent.mapsdk.internal.th();
        thVar.a(c17);
        thVar.f51603a = this.f48913j;
        thVar.f51632f = cancelableCallback;
        thVar.a(j17);
        ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a(thVar);
    }

    private void b(float f17, float f18, boolean z17, long j17, com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback cancelableCallback) {
        if (z17) {
            com.tencent.mapsdk.internal.th thVar = new com.tencent.mapsdk.internal.th();
            thVar.c(f17);
            if (f18 >= 0.0f) {
                thVar.d(f18);
            }
            thVar.f51603a = this.f48913j;
            thVar.f51632f = cancelableCallback;
            thVar.a(j17);
            ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a(thVar);
            return;
        }
        ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).b(f17);
        if (f18 >= 0.0f) {
            ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a(f18);
        }
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final float b() {
        return ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).q();
    }

    public final float a(float f17) {
        if (this.f48905b == null || this.f48905b.f52273as == null || this.f48905b.e_ == 0 || this.f48905b.f52273as.f50520t == null) {
            return f17;
        }
        float f18 = this.f48905b.f52273as.f50520t.f52409b.f52443l;
        float a17 = com.tencent.mapsdk.internal.v.b.a(((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).p());
        float a18 = com.tencent.mapsdk.internal.v.b.a(((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).q());
        return (f18 < a17 || f18 > a18) ? java.lang.Math.min(a18, java.lang.Math.max(a17, f17)) : f17;
    }

    private static java.util.List<com.tencent.mapsdk.internal.ez> b(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IOverlay> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.tencentmap.mapsdk.maps.model.IOverlay iOverlay : list) {
            if (iOverlay instanceof com.tencent.mapsdk.internal.ez) {
                arrayList.add((com.tencent.mapsdk.internal.ez) iOverlay);
            }
        }
        return arrayList;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void b(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener onCameraChangeListener) {
        if (this.f48905b == null) {
            return;
        }
        this.f48905b.C = onCameraChangeListener;
    }

    @Override // com.tencent.mapsdk.internal.fn
    public final void b(int i17, int i18) {
        if (i17 == 0 || i18 == 0) {
            return;
        }
        com.tencent.tencentmap.mapsdk.maps.CameraUpdate cameraUpdate = this.f48928y;
        if (cameraUpdate != null) {
            a(cameraUpdate);
        }
        com.tencent.tencentmap.mapsdk.maps.CameraUpdate cameraUpdate2 = this.f48929z;
        if (cameraUpdate2 != null) {
            a(cameraUpdate2, this.A, this.B);
        }
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void b(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener tencentMapGestureListener) {
        com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListenerList tencentMapGestureListenerList;
        if (this.f48905b == null || (tencentMapGestureListenerList = this.f48905b.f52265ak) == null) {
            return;
        }
        tencentMapGestureListenerList.removeListener(tencentMapGestureListener);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void b(boolean z17) {
        if (this.f48905b == null) {
            return;
        }
        this.f48905b.P = z17;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void b(int i17) {
        if (this.f48905b == null) {
            return;
        }
        this.f48905b.a(i17);
    }

    private void a(float f17, float f18, float f19, boolean z17, long j17, com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback cancelableCallback) {
        double pow;
        if (this.f48905b == null || f17 == 0.0f) {
            return;
        }
        float b17 = b(f17);
        if (!z17) {
            if (b17 < 0.0f) {
                pow = java.lang.Math.pow(2.0d, java.lang.Math.abs(b17));
            } else {
                pow = java.lang.Math.pow(0.5d, java.lang.Math.abs(b17));
            }
            double d17 = f18;
            double d18 = f19;
            ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).f52512o.f50508h.a((float) (1.0d / pow), d17, d18, d17, d18, false, null);
            return;
        }
        com.tencent.mapsdk.internal.th thVar = new com.tencent.mapsdk.internal.th();
        thVar.a((int) f18, (int) f19);
        thVar.b(b17);
        thVar.f51603a = this.f48913j;
        thVar.f51632f = cancelableCallback;
        thVar.a(j17);
        ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a(thVar);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void b(float f17, float f18) {
        if (this.f48905b == null) {
            return;
        }
        if (f17 < 0.0f) {
            f17 = 0.0f;
        } else if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        if (f18 < 0.0f) {
            f18 = 0.0f;
        } else if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        this.f48905b.d((int) (this.f48905b.Z * f17), (int) (this.f48905b.f52180aa * f18));
        this.f48905b.M = f17;
        this.f48905b.N = f18;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void b(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        this.f48905b.f52264aj.remove(onMapLoadedCallback);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void b(com.tencent.mapsdk.internal.fi fiVar) {
        com.tencent.mapsdk.vector.VectorMap vectorMap;
        if (this.f48905b == null || (vectorMap = (com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_) == null) {
            return;
        }
        vectorMap.f52512o.b(fiVar);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void b(com.tencent.tencentmap.mapsdk.maps.model.Language language) {
        if (this.f48905b == null || this.f48905b.f52195j == null) {
            return;
        }
        com.tencent.mapsdk.internal.sp spVar = this.f48905b.f52195j;
        if (language != null) {
            com.tencent.mapsdk.internal.so soVar = spVar.f51514b;
            if (soVar.f51503j != language) {
                soVar.f51503j = language;
                com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider overSeaTileProvider = spVar.f51515c;
                if (overSeaTileProvider != null) {
                    overSeaTileProvider.onLanguageChange(language);
                }
                spVar.a();
            }
        }
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition, boolean z17, long j17, com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback cancelableCallback) {
        if (this.f48905b == null || cameraPosition == null) {
            return;
        }
        com.tencent.map.lib.models.GeoPoint from = com.tencent.map.lib.models.GeoPoint.from(cameraPosition.target);
        float f17 = cameraPosition.zoom;
        float p17 = ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).p();
        if (f17 < p17) {
            f17 = p17;
        }
        if (f17 > 20.0f) {
            f17 = 20.0f;
        }
        if (!z17) {
            double pow = 1.0d / java.lang.Math.pow(2.0d, 20.0f - f17);
            if (from != null) {
                ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a(from.getLatitudeE6(), from.getLongitudeE6());
            }
            ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a((float) pow);
            ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).b(cameraPosition.bearing);
            if (cameraPosition.tilt >= 0.0f) {
                ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a(cameraPosition.tilt);
                return;
            }
            return;
        }
        com.tencent.mapsdk.internal.th thVar = new com.tencent.mapsdk.internal.th();
        if (from != null) {
            thVar.b(from.getLatitudeE6(), from.getLongitudeE6());
        }
        thVar.a(f17);
        thVar.c(cameraPosition.bearing);
        float f18 = cameraPosition.tilt;
        if (f18 >= 0.0f) {
            thVar.d(f18);
        }
        thVar.f51603a = this.f48913j;
        thVar.a(j17);
        thVar.f51632f = cancelableCallback;
        ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a(thVar);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final int b(java.lang.String str) {
        com.tencent.mapsdk.vector.VectorMap vectorMap;
        com.tencent.mapsdk.internal.ne neVar;
        com.tencent.mapsdk.internal.tk tkVar;
        if (this.f48905b == null || this.f48905b.f52199n == null || (vectorMap = this.f48905b.f52199n.f48776d) == null || (neVar = vectorMap.f52512o) == null || (tkVar = neVar.f50506f) == null) {
            return -1;
        }
        return ((java.lang.Integer) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass50>) new com.tencent.mapsdk.internal.tk.AnonymousClass50(str), (com.tencent.mapsdk.internal.tk.AnonymousClass50) (-1))).intValue();
    }

    private void a(double d17, double d18, float f17, boolean z17, long j17, com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback cancelableCallback) {
        if (this.f48905b == null) {
            return;
        }
        int i17 = (int) (d17 * 1000000.0d);
        int i18 = (int) (d18 * 1000000.0d);
        float p17 = ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).p();
        if (f17 < p17) {
            f17 = p17;
        }
        if (f17 > 20.0f) {
            f17 = 20.0f;
        }
        float c17 = c(f17);
        double pow = 1.0d / java.lang.Math.pow(2.0d, 20.0f - c17);
        if (!z17) {
            ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a(i17, i18);
            ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a((float) pow);
            return;
        }
        com.tencent.mapsdk.internal.th thVar = new com.tencent.mapsdk.internal.th();
        thVar.b(i17, i18);
        thVar.a(c17);
        thVar.f51603a = this.f48913j;
        thVar.f51632f = cancelableCallback;
        thVar.a(j17);
        ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a(thVar);
    }

    private void a(double d17, double d18, boolean z17, long j17, com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback cancelableCallback) {
        if (this.f48905b == null) {
            return;
        }
        int i17 = (int) (d17 * 1000000.0d);
        int i18 = (int) (d18 * 1000000.0d);
        if (!z17) {
            ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a(i17, i18);
            return;
        }
        com.tencent.mapsdk.internal.th thVar = new com.tencent.mapsdk.internal.th();
        thVar.b(i17, i18);
        thVar.f51603a = this.f48913j;
        thVar.f51632f = cancelableCallback;
        thVar.a(j17);
        ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a(thVar);
    }

    private int a(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds, int i17, boolean z17, long j17, com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback cancelableCallback) {
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng;
        float f17;
        if (latLngBounds != null && latLngBounds.northeast != null && latLngBounds.southwest != null) {
            int mapWidth = ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).getMapWidth();
            int mapHeight = ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).getMapHeight();
            com.tencent.mapsdk.core.utils.log.LogUtil.b("newLatLngBounds : " + mapWidth + "x" + mapHeight);
            int i18 = i17 * 2;
            if (this.f48920q + i18 + this.f48922s < mapWidth && i18 + this.f48921r + this.f48923t < mapHeight) {
                com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition = ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).getCameraPosition();
                com.tencent.tencentmap.mapsdk.maps.model.CameraPosition calculateMapOverLook = ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).calculateMapOverLook(latLngBounds, new android.graphics.RectF(0.0f, 0.0f, mapWidth, mapHeight), cameraPosition.tilt, cameraPosition.bearing, i17, i17, i17, i17);
                com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(0.0d, 0.0d);
                if (calculateMapOverLook != null) {
                    f17 = calculateMapOverLook.zoom;
                    latLng = calculateMapOverLook.target;
                } else {
                    latLng = latLng2;
                    f17 = 0.0f;
                }
                if (f17 < 0.0f) {
                    return (int) f17;
                }
                float c17 = c(f17);
                if (!z17) {
                    ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
                    a(c17, false, j17, (com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback) null);
                    return 0;
                }
                com.tencent.mapsdk.internal.th thVar = new com.tencent.mapsdk.internal.th();
                thVar.b((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
                thVar.a(c17);
                thVar.f51603a = this.f48913j;
                thVar.f51632f = cancelableCallback;
                thVar.a(j17);
                ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a(thVar);
                return 0;
            }
        }
        return -1;
    }

    private int a(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds, int i17, int i18, int i19, int i27, boolean z17, long j17, com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback cancelableCallback) {
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng;
        float f17;
        if (latLngBounds == null || latLngBounds.northeast == null || latLngBounds.southwest == null) {
            return -1;
        }
        int aj6 = this.f48905b.aj();
        int ak6 = this.f48905b.ak();
        com.tencent.mapsdk.core.utils.log.LogUtil.b("newLatLngBoundsRects : " + aj6 + "x" + ak6);
        if (i17 + i18 + this.f48920q + this.f48922s >= aj6 || i19 + i27 + this.f48921r + this.f48923t >= ak6) {
            return -1;
        }
        com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition = ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).getCameraPosition();
        com.tencent.tencentmap.mapsdk.maps.model.CameraPosition calculateMapOverLook = ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).calculateMapOverLook(latLngBounds, new android.graphics.RectF(0.0f, 0.0f, aj6, ak6), cameraPosition.tilt, cameraPosition.bearing, i17, i19, i18, i27);
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(0.0d, 0.0d);
        if (calculateMapOverLook != null) {
            f17 = calculateMapOverLook.zoom;
            latLng = calculateMapOverLook.target;
        } else {
            latLng = latLng2;
            f17 = 0.0f;
        }
        if (f17 < 0.0f) {
            return (int) f17;
        }
        float c17 = c(f17);
        if (!z17) {
            ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
            a(c17, false, j17, (com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback) null);
        } else {
            com.tencent.mapsdk.internal.th thVar = new com.tencent.mapsdk.internal.th();
            thVar.b((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
            thVar.a(c17);
            thVar.f51603a = this.f48913j;
            thVar.f51632f = cancelableCallback;
            thVar.a(j17);
            ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a(thVar);
        }
        return 0;
    }

    private int a(java.util.List<com.tencent.mapsdk.internal.ez> list, int i17, int i18, int i19, int i27, final boolean z17, final long j17, final com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback cancelableCallback) {
        com.tencent.mapsdk.internal.ey projection = ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).getProjection();
        if (projection == null) {
            return Integer.MIN_VALUE;
        }
        if (list != null && !list.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.tencent.mapsdk.internal.ez ezVar : list) {
                if (ezVar != null && ezVar.getGroupBounds() != null) {
                    arrayList.addAll(ezVar.getGroupBounds());
                }
            }
            if (i17 + i18 <= this.f48905b.Z && i19 + i27 <= this.f48905b.f52180aa) {
                projection.a(arrayList, null, new android.graphics.Rect(i17, i19, i18, i27), new com.tencent.mapsdk.internal.ey.a() { // from class: com.tencent.mapsdk.internal.bg.3
                    @Override // com.tencent.mapsdk.internal.ey.a
                    public final void a(final float f17, final com.tencent.map.lib.models.GeoPoint geoPoint) {
                        if (com.tencent.mapsdk.internal.bg.this.f48905b == null) {
                            return;
                        }
                        com.tencent.mapsdk.internal.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.bg.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (com.tencent.mapsdk.internal.bg.this.f48905b == null) {
                                    return;
                                }
                                com.tencent.mapsdk.internal.bg.AnonymousClass3 anonymousClass3 = com.tencent.mapsdk.internal.bg.AnonymousClass3.this;
                                if (!z17) {
                                    com.tencent.mapsdk.vector.VectorMap vectorMap = (com.tencent.mapsdk.vector.VectorMap) com.tencent.mapsdk.internal.bg.this.f48905b.e_;
                                    com.tencent.map.lib.models.GeoPoint geoPoint2 = geoPoint;
                                    vectorMap.f52512o.f50508h.a(geoPoint2.getLatitudeE6(), geoPoint2.getLongitudeE6(), 1);
                                    ((com.tencent.mapsdk.vector.VectorMap) com.tencent.mapsdk.internal.bg.this.f48905b.e_).a(com.tencent.mapsdk.internal.bg.this.a(f17));
                                    return;
                                }
                                double b17 = (((int) com.tencent.mapsdk.internal.bg.this.b()) - (java.lang.Math.log(1.0f / com.tencent.mapsdk.internal.bg.this.a(f17)) / java.lang.Math.log(2.0d))) - 2.0d;
                                if (b17 < 0.0d) {
                                    b17 = 0.0d;
                                }
                                com.tencent.mapsdk.internal.th thVar = new com.tencent.mapsdk.internal.th();
                                thVar.b(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6());
                                thVar.a((float) b17);
                                com.tencent.mapsdk.internal.bg.AnonymousClass3 anonymousClass32 = com.tencent.mapsdk.internal.bg.AnonymousClass3.this;
                                thVar.f51603a = com.tencent.mapsdk.internal.bg.this.f48913j;
                                thVar.f51632f = cancelableCallback;
                                thVar.a(j17);
                                ((com.tencent.mapsdk.vector.VectorMap) com.tencent.mapsdk.internal.bg.this.f48905b.e_).a(thVar);
                            }
                        });
                    }
                });
                return 0;
            }
        }
        return -1;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final com.tencent.tencentmap.mapsdk.maps.model.CameraPosition a() {
        com.tencent.tencentmap.mapsdk.maps.model.LatLng a17 = com.tencent.mapsdk.internal.kr.a(((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).r());
        float v17 = ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).v();
        if (v17 < 0.0f) {
            v17 = (v17 % 360.0f) + 360.0f;
        }
        return com.tencent.tencentmap.mapsdk.maps.model.CameraPosition.builder().zoom(D()).target(a17).bearing(v17).tilt(((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).w()).build();
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final int a(com.tencent.tencentmap.mapsdk.maps.CameraUpdate cameraUpdate) {
        com.tencent.tencentmap.mapsdk.maps.model.CamerParameter params;
        if (cameraUpdate == null || (params = cameraUpdate.getParams()) == null) {
            return -1;
        }
        this.f48928y = cameraUpdate;
        int i17 = 0;
        switch (params.iCamerType) {
            case 0:
                a(false, 0L, (com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback) null);
                break;
            case 1:
                b(false, 0L, null);
                break;
            case 2:
                a(params.scrollBy_xPixel, params.scrollBy_yPixel, false, 0L, (com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback) null);
                break;
            case 3:
                a(params.zoomTo_zoom, false, 0L, (com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback) null);
                break;
            case 4:
                b(params.zoomBy_amount, false, 0L, null);
                break;
            case 5:
                float f17 = params.zoomBy_Point_amount;
                android.graphics.Point point = params.zoomBy_Point_focus;
                a(f17, point.x, point.y, false, 0L, (com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback) null);
                break;
            case 6:
                a(params.newCameraPosition_cameraPosition, false, 0L, (com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback) null);
                break;
            case 7:
                com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = params.newLatLng_latLng;
                if (latLng != null) {
                    a(latLng.latitude, latLng.longitude, false, 0L, (com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback) null);
                    break;
                }
                break;
            case 8:
                com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2 = params.newLatLngZoom_latLng;
                if (latLng2 != null) {
                    a(latLng2.latitude, latLng2.longitude, params.newLatLngZoom_zoom, false, 0L, (com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback) null);
                    break;
                }
                break;
            case 9:
                i17 = a(params.newLatLngBounds_bounds, params.newLatLngBounds_padding, false, 0L, (com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback) null);
                break;
            case 10:
                com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds = params.newLatLngBounds_dimension_bounds;
                int i18 = params.newLatLngBounds_dimension_padding;
                i17 = a(latLngBounds, i18, i18, i18, i18, false, 0L, (com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback) null);
                break;
            case 11:
                i17 = a(params.newLatLngBounds_dimension_bounds, params.newLatLngBoundsRects_padLeft, params.newLatLngBoundsRects_padRight, params.newLatLngBoundsRects_padTop, params.newLatLngBoundsRects_padBom, false, 0L, (com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback) null);
                break;
            case 12:
                b(params.rotateto_rotate, params.rotateto_skew, false, 0L, null);
                break;
            case 13:
                return a(b(params.elements), params.newLatLngBoundsRects_padLeft, params.newLatLngBoundsRects_padRight, params.newLatLngBoundsRects_padTop, params.newLatLngBoundsRects_padBom, false, 0L, (com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback) null);
        }
        if (i17 == 0) {
            this.f48928y = null;
        }
        return i17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0023. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fa  */
    @Override // com.tencent.mapsdk.internal.ai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.tencent.tencentmap.mapsdk.maps.CameraUpdate r16, long r17, com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback r19) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.bg.a(com.tencent.tencentmap.mapsdk.maps.CameraUpdate, long, com.tencent.tencentmap.mapsdk.maps.TencentMap$CancelableCallback):int");
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(int i17) {
        int f17 = f();
        this.f48924u = i17;
        if (i17 == f17 || f17 == 1011 || f17 == 1008) {
            return;
        }
        com.tencent.mapsdk.internal.rr rrVar = this.f48908e;
        if (rrVar != null) {
            com.tencent.mapsdk.internal.rq a17 = rrVar.a(i17);
            if (a17 != null) {
                i17 = a17.f51249a;
                com.tencent.mapsdk.internal.hg hgVar = this.f48905b.f52273as.f49000c;
                if (hgVar != null) {
                    hgVar.q().a(a17.f51250b);
                }
            } else if (i17 >= 1000) {
                i17 -= 1000;
            } else if (i17 > 8 && i17 < 989) {
                i17 += 11;
            }
        }
        this.f48905b.f52273as.f(i17);
        com.tencent.mapsdk.internal.hn.q();
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(boolean z17) {
        com.tencent.mapsdk.vector.VectorMap vectorMap = (com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_;
        if (z17) {
            vectorMap.b(true);
        } else {
            vectorMap.b(false);
        }
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapClickListener onMapClickListener) {
        this.f48905b.f52202q = onMapClickListener;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLongClickListener onMapLongClickListener) {
        this.f48905b.f52205t = onMapLongClickListener;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener onCameraChangeListener) {
        if (this.f48905b == null) {
            return;
        }
        this.f48905b.B = onCameraChangeListener;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnScaleViewChangedListener onScaleViewChangedListener) {
        if (this.f48905b == null) {
            return;
        }
        this.f48905b.A = onScaleViewChangedListener;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnDismissCallback onDismissCallback) {
        this.f48905b.f52206u = onDismissCallback;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, float f17, float f18) {
        a(latLng, f17, f18, 0.0f, true);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, float f17, float f18, float f19, boolean z17) {
        com.tencent.mapsdk.internal.th thVar = new com.tencent.mapsdk.internal.th();
        thVar.b((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
        thVar.a(f19);
        thVar.c(f17);
        thVar.d(f18);
        thVar.f51603a = this.f48913j;
        thVar.f51633g = true;
        thVar.a(1000L);
        if (z17) {
            thVar.a(this.f48905b.G, this.f48905b.H);
        } else {
            thVar.a(this.f48905b.I, this.f48905b.f52179J);
        }
        ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).y();
        ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a(thVar);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final float a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2) {
        return a(0, 0, 0, 0, latLng, latLng2, (com.tencent.tencentmap.mapsdk.maps.model.LatLng) null);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(android.os.Handler handler, android.graphics.Bitmap.Config config, int i17) {
        com.tencent.mapsdk.internal.tr trVar = this.f48905b;
        trVar.D = handler;
        trVar.F = config;
        if (i17 >= 0) {
            trVar.E = android.os.SystemClock.elapsedRealtime() + i17;
        } else {
            trVar.E = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        }
        trVar.J();
        trVar.H();
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final java.lang.String a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).f52512o.a(com.tencent.map.lib.models.GeoPoint.from(latLng));
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener tencentMapGestureListener) {
        if (this.f48905b == null) {
            return;
        }
        com.tencent.mapsdk.internal.tr trVar = this.f48905b;
        if (trVar.f52265ak == null) {
            trVar.f52265ak = new com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListenerList();
        }
        trVar.f52265ak.addListener(tencentMapGestureListener);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(float f17, float f18) {
        if (this.f48905b == null) {
            return;
        }
        if (f17 < 0.0f) {
            f17 = 0.0f;
        } else if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        if (f18 < 0.0f) {
            f18 = 0.0f;
        } else if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        this.f48905b.c((int) (this.f48905b.Z * f17), (int) (this.f48905b.f52180aa * f18));
        this.f48905b.K = f17;
        this.f48905b.L = f18;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(int i17, int i18) {
        if (this.f48905b == null) {
            return;
        }
        this.f48905b.a(i17, i18);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCompassClickedListener onCompassClickedListener) {
        if (this.f48905b != null) {
            this.f48905b.f52211z = onCompassClickedListener;
        }
    }

    public final float a(float f17, int i17, int i18, int i19, int i27, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2) {
        int i28 = this.f48905b.Z;
        int i29 = this.f48905b.f52180aa;
        if (i28 == 0 || i29 == 0 || latLng == null || latLng2 == null) {
            return 0.0f;
        }
        com.tencent.mapsdk.internal.fu a17 = this.f48927x.a(this.f48906c, latLng);
        com.tencent.mapsdk.internal.fu a18 = this.f48927x.a(this.f48906c, latLng2);
        double d17 = a18.f49467a - a17.f49467a;
        if (d17 < 0.0d) {
            d17 = java.lang.Math.abs(d17);
        }
        double d18 = a18.f49468b - a17.f49468b;
        if (d18 < 0.0d) {
            d18 = java.lang.Math.abs(d18);
        }
        double d19 = d17 * 1.0d;
        double d27 = d18 * 1.0d;
        int i37 = (i28 - i17) - i18;
        int i38 = (i29 - i19) - i27;
        if (f17 == 90.0f) {
            f17 = 89.0f;
        }
        int cos = (int) (i38 / java.lang.Math.cos((f17 * 3.141592653589793d) / 180.0d));
        if (i37 <= 0) {
            i37 = 1;
        }
        if (cos <= 0) {
            cos = 1;
        }
        double log = java.lang.Math.log(d19 / i37) / java.lang.Math.log(2.0d);
        double log2 = java.lang.Math.log(d27 / cos) / java.lang.Math.log(2.0d);
        if (log < 0.0d) {
            log = 0.0d;
        }
        return (float) (20.0d - java.lang.Math.max(log, log2 >= 0.0d ? log2 : 0.0d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if ((r7 + r9) <= com.tencent.mapsdk.internal.hs.c(r10)) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(int r6, int r7, int r8, int r9, boolean r10) {
        /*
            r5 = this;
            com.tencent.mapsdk.internal.tr r0 = r5.f48905b
            M extends com.tencent.mapsdk.internal.bl r0 = r0.e_
            com.tencent.mapsdk.vector.VectorMap r0 = (com.tencent.mapsdk.vector.VectorMap) r0
            com.tencent.mapsdk.internal.ne r0 = r0.f52512o
            com.tencent.mapsdk.internal.ad r0 = r0.f50508h
            r0.H = r6
            r0.I = r7
            r0.f48814J = r8
            r0.K = r9
            android.graphics.Rect r1 = r0.C
            r2 = 0
            r3 = -1
            if (r1 == 0) goto L47
            int r1 = r1.width()
            if (r1 <= 0) goto L47
            android.graphics.Rect r1 = r0.C
            int r1 = r1.height()
            if (r1 <= 0) goto L47
            int r1 = r6 + r8
            android.graphics.Rect r4 = r0.C
            int r4 = r4.width()
            if (r1 > r4) goto L6b
            int r1 = r7 + r9
            android.graphics.Rect r4 = r0.C
            int r4 = r4.height()
            if (r1 <= r4) goto L3b
            goto L6b
        L3b:
            android.graphics.PointF r1 = r0.a()
            float r3 = r1.x
            float r1 = r1.y
            r0.a(r3, r1, r10)
            goto L6e
        L47:
            com.tencent.mapsdk.internal.ad$1 r1 = new com.tencent.mapsdk.internal.ad$1
            r1.<init>(r10)
            r0.a(r1)
            com.tencent.mapsdk.internal.bd r10 = r0.f48829z
            boolean r0 = r10 instanceof com.tencent.mapsdk.internal.ne
            if (r0 == 0) goto L6d
            com.tencent.mapsdk.internal.ne r10 = (com.tencent.mapsdk.internal.ne) r10
            android.content.Context r10 = r10.getContext()
            int r0 = r6 + r8
            int r1 = com.tencent.mapsdk.internal.hs.b(r10)
            if (r0 > r1) goto L6b
            int r0 = r7 + r9
            int r10 = com.tencent.mapsdk.internal.hs.c(r10)
            if (r0 <= r10) goto L6e
        L6b:
            r2 = r3
            goto L6e
        L6d:
            r2 = -2
        L6e:
            if (r2 != 0) goto L78
            r5.f48920q = r6
            r5.f48921r = r7
            r5.f48922s = r8
            r5.f48923t = r9
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.bg.a(int, int, int, int, boolean):int");
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final float a(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds, float f17, int i17, boolean z17) {
        int i18;
        if (latLngBounds == null) {
            return 0.0f;
        }
        if (z17) {
            i18 = this.f48905b.H;
        } else {
            i18 = this.f48905b.f52179J;
        }
        float f18 = !z17 ? 0.0f : f17;
        if (i18 < 0) {
            i18 = this.f48905b.Z / 2;
        }
        return a(f18, 0, 0, i17, this.f48905b.f52180aa - i18, latLngBounds.southwest, latLngBounds.northeast);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final float a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2, float f17, int i17, boolean z17) {
        if (latLng == null || latLng2 == null) {
            return 0.0f;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.Builder builder = new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.Builder();
        builder.include(latLng);
        builder.include(latLng2);
        return a(!z17 ? 0.0f : f17, 0, 0, i17, 0, builder.build().southwest, builder.build().northeast);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final float a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2, float f17, int i17, int i18, int i19, int i27, boolean z17) {
        if (latLng == null || latLng2 == null) {
            return 0.0f;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.Builder builder = new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.Builder();
        builder.include(latLng);
        builder.include(latLng2);
        return a(!z17 ? 0.0f : f17, i17, i18, i19, i27, builder.build().southwest, builder.build().northeast);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final float a(int i17, int i18, int i19, int i27, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng3) {
        return this.f48927x.a(latLng, latLng2, i17, i18, i19, i27, latLng3);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final com.tencent.tencentmap.mapsdk.maps.model.CameraPosition a(java.util.List<com.tencent.mapsdk.internal.ez> list, java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list2, int i17, int i18, int i19, int i27) {
        if (this.f48905b.Z != 0 && this.f48905b.f52180aa != 0) {
            if (i17 + i18 > this.f48905b.Z || i19 + i27 > this.f48905b.f52180aa) {
                return null;
            }
        } else {
            int b17 = com.tencent.mapsdk.internal.hs.b(this.f48906c);
            int c17 = com.tencent.mapsdk.internal.hs.c(this.f48906c);
            if (i17 + i18 > b17 || i19 + i27 > c17) {
                return null;
            }
        }
        com.tencent.mapsdk.internal.ey projection = ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).getProjection();
        if (projection == null) {
            return null;
        }
        if (list != null && !list.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.tencent.mapsdk.internal.ez ezVar : list) {
                if (ezVar != null && ezVar.getGroupBounds() != null) {
                    arrayList.addAll(ezVar.getGroupBounds());
                }
            }
            android.graphics.Rect rect = new android.graphics.Rect(i17, i19, i18, i27);
            this.f48911h = null;
            projection.a(arrayList, com.tencent.map.lib.models.GeoPoint.from(list2), rect, new com.tencent.mapsdk.internal.ey.a() { // from class: com.tencent.mapsdk.internal.bg.4
                @Override // com.tencent.mapsdk.internal.ey.a
                public final void a(float f17, com.tencent.map.lib.models.GeoPoint geoPoint) {
                    com.tencent.tencentmap.mapsdk.maps.model.LatLng a17 = com.tencent.mapsdk.internal.kr.a(geoPoint);
                    double log = 20.0d - (java.lang.Math.log(1.0f / f17) / java.lang.Math.log(2.0d));
                    if (log < 0.0d) {
                        log = 0.0d;
                    }
                    com.tencent.mapsdk.internal.bg bgVar = com.tencent.mapsdk.internal.bg.this;
                    bgVar.f48911h = new com.tencent.tencentmap.mapsdk.maps.model.CameraPosition(a17, (float) log, ((com.tencent.mapsdk.vector.VectorMap) bgVar.f48905b.e_).w(), ((com.tencent.mapsdk.vector.VectorMap) com.tencent.mapsdk.internal.bg.this.f48905b.e_).v());
                    synchronized (com.tencent.mapsdk.internal.bg.this.f48912i) {
                        com.tencent.mapsdk.internal.bg.this.f48912i.notifyAll();
                    }
                }
            });
            synchronized (this.f48912i) {
                try {
                    this.f48912i.wait(1000L);
                } catch (java.lang.InterruptedException e17) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.d(android.util.Log.getStackTraceString(e17));
                    java.lang.Thread.currentThread().interrupt();
                }
            }
            return this.f48911h;
        }
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        if (list2.size() == 1) {
            return new com.tencent.tencentmap.mapsdk.maps.model.CameraPosition(list2.get(0), ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).f52512o.f50520t.a(), ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).w(), ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).v());
        }
        double d17 = 0.0d;
        double d18 = 0.0d;
        double d19 = 0.0d;
        double d27 = 0.0d;
        double d28 = 0.0d;
        for (com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng : list2) {
            if (latLng != null) {
                if (d18 == d17) {
                    d18 = latLng.latitude;
                }
                if (d19 == d17) {
                    d19 = latLng.longitude;
                }
                double d29 = d18;
                double d37 = d27;
                if (d37 == d17) {
                    d37 = latLng.latitude;
                }
                double d38 = d28;
                if (d38 == d17) {
                    d38 = latLng.longitude;
                }
                d28 = d38;
                double d39 = latLng.latitude;
                double d47 = d29;
                if (d39 < d47) {
                    d47 = d39;
                }
                if (d39 > d37) {
                    d37 = d39;
                }
                double d48 = latLng.longitude;
                if (d48 < d19) {
                    d19 = d48;
                }
                if (d48 > d28) {
                    d28 = d48;
                }
                d27 = d37;
                d18 = d47;
            } else {
                d18 = d18;
                d17 = 0.0d;
            }
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(d18, d19);
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng3 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(d27, d28);
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng4 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(0.0d, 0.0d);
        float a17 = a(i17, i18, i19, i27, latLng2, latLng3, latLng4);
        if (a17 < 0.0f) {
            return null;
        }
        return new com.tencent.tencentmap.mapsdk.maps.model.CameraPosition(latLng4, a17, ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).w(), ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).v());
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final com.tencent.tencentmap.mapsdk.maps.model.CameraPosition a(java.util.List<com.tencent.mapsdk.internal.ez> list, java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list2, int i17, int i18, int i19, int i27, final com.tencent.tencentmap.mapsdk.maps.TencentMap.AsyncOperateCallback<com.tencent.tencentmap.mapsdk.maps.model.CameraPosition> asyncOperateCallback) {
        if (this.f48905b.Z != 0 && this.f48905b.f52180aa != 0) {
            if (i17 + i18 > this.f48905b.Z || i19 + i27 > this.f48905b.f52180aa) {
                if (asyncOperateCallback != null) {
                    asyncOperateCallback.onOperateFinished(null);
                }
                return null;
            }
        } else {
            com.tencent.mapsdk.internal.hs.b(this.f48906c);
            com.tencent.mapsdk.internal.hs.c(this.f48906c);
        }
        com.tencent.mapsdk.internal.ey projection = ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).getProjection();
        if (projection == null) {
            return null;
        }
        if (list.isEmpty()) {
            if (list2 == null || list2.isEmpty()) {
                if (asyncOperateCallback != null) {
                    asyncOperateCallback.onOperateFinished(null);
                }
                return null;
            }
            if (list2.size() == 1) {
                com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition = new com.tencent.tencentmap.mapsdk.maps.model.CameraPosition(list2.get(0), ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).t(), ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).w(), ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).v());
                if (asyncOperateCallback != null) {
                    asyncOperateCallback.onOperateFinished(cameraPosition);
                }
                return cameraPosition;
            }
            java.util.Iterator<com.tencent.tencentmap.mapsdk.maps.model.LatLng> it = list2.iterator();
            double d17 = 0.0d;
            double d18 = 0.0d;
            double d19 = 0.0d;
            double d27 = 0.0d;
            double d28 = 0.0d;
            while (it.hasNext()) {
                com.tencent.tencentmap.mapsdk.maps.model.LatLng next = it.next();
                if (next != null) {
                    if (d18 == d17) {
                        d18 = next.latitude;
                    }
                    if (d19 == d17) {
                        d19 = next.longitude;
                    }
                    double d29 = d18;
                    double d37 = d27;
                    if (d37 == d17) {
                        d37 = next.latitude;
                    }
                    java.util.Iterator<com.tencent.tencentmap.mapsdk.maps.model.LatLng> it6 = it;
                    double d38 = d28;
                    if (d38 == d17) {
                        d38 = next.longitude;
                    }
                    d28 = d38;
                    double d39 = next.latitude;
                    double d47 = d29;
                    if (d39 < d47) {
                        d47 = d39;
                    }
                    if (d39 > d37) {
                        d37 = d39;
                    }
                    double d48 = next.longitude;
                    if (d48 < d19) {
                        d19 = d48;
                    }
                    if (d48 > d28) {
                        d28 = d48;
                    }
                    d27 = d37;
                    it = it6;
                    d18 = d47;
                } else {
                    it = it;
                    d18 = d18;
                    d17 = 0.0d;
                }
            }
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(d18, d19);
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(d27, d28);
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng3 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(0.0d, 0.0d);
            float a17 = a(i17, i18, i19, i27, latLng, latLng2, latLng3);
            if (a17 < 0.0f) {
                if (asyncOperateCallback != null) {
                    asyncOperateCallback.onOperateFinished(null);
                }
                return null;
            }
            com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition2 = new com.tencent.tencentmap.mapsdk.maps.model.CameraPosition(latLng3, a17, ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).w(), ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).v());
            if (asyncOperateCallback != null) {
                asyncOperateCallback.onOperateFinished(cameraPosition2);
            }
            return cameraPosition2;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mapsdk.internal.ez ezVar : list) {
            if (ezVar != null && ezVar.getGroupBounds() != null) {
                arrayList.addAll(ezVar.getGroupBounds());
            }
        }
        android.graphics.Rect rect = new android.graphics.Rect(i17, i19, i18, i27);
        this.f48911h = null;
        projection.a(arrayList, com.tencent.map.lib.models.GeoPoint.from(list2), rect, new com.tencent.mapsdk.internal.ey.a() { // from class: com.tencent.mapsdk.internal.bg.5
            @Override // com.tencent.mapsdk.internal.ey.a
            public final void a(float f17, com.tencent.map.lib.models.GeoPoint geoPoint) {
                com.tencent.tencentmap.mapsdk.maps.model.LatLng a18 = com.tencent.mapsdk.internal.kr.a(geoPoint);
                double log = 20.0d - (java.lang.Math.log(1.0f / f17) / java.lang.Math.log(2.0d));
                if (log < 0.0d) {
                    log = 0.0d;
                }
                com.tencent.mapsdk.internal.bg bgVar = com.tencent.mapsdk.internal.bg.this;
                bgVar.f48911h = new com.tencent.tencentmap.mapsdk.maps.model.CameraPosition(a18, (float) log, ((com.tencent.mapsdk.vector.VectorMap) bgVar.f48905b.e_).w(), ((com.tencent.mapsdk.vector.VectorMap) com.tencent.mapsdk.internal.bg.this.f48905b.e_).v());
                com.tencent.tencentmap.mapsdk.maps.TencentMap.AsyncOperateCallback asyncOperateCallback2 = asyncOperateCallback;
                if (asyncOperateCallback2 != null) {
                    asyncOperateCallback2.onOperateFinished(com.tencent.mapsdk.internal.bg.this.f48911h);
                }
            }
        });
        return null;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(float f17, float f18, boolean z17) {
        if (this.f48905b == null) {
            return;
        }
        com.tencent.mapsdk.internal.ad adVar = ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).f52512o.f50508h;
        adVar.N = true;
        adVar.a(f17, f18, z17);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, float f17, float f18, float f19) {
        com.tencent.mapsdk.internal.th thVar = new com.tencent.mapsdk.internal.th();
        thVar.b((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
        thVar.a(f19);
        thVar.c(f17);
        thVar.d(f18);
        thVar.f51603a = this.f48913j;
        thVar.f51633g = true;
        thVar.a(1000L);
        ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).y();
        ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).a(thVar);
    }

    private void a(int i17, int i18, int i19, int i27) {
        com.tencent.mapsdk.internal.tk tkVar;
        com.tencent.mapsdk.internal.ne neVar = ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).f52512o;
        if (neVar == null || (tkVar = neVar.f50506f) == null) {
            return;
        }
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass27(i18, i17, i19, i27));
    }

    private void a(float f17, float f18, float f19) {
        com.tencent.mapsdk.internal.tr trVar = this.f48905b;
        com.tencent.mapsdk.internal.ne neVar = trVar.f52273as;
        if (neVar != null) {
            float f27 = neVar.f50508h.A.f52409b.f52443l;
            float c17 = com.tencent.mapsdk.internal.tz.c(f19);
            boolean z17 = ((double) java.lang.Math.abs(f27 - c17)) > 1.0E-4d;
            trVar.f52275au = 0;
            com.tencent.mapsdk.internal.ko.a(new com.tencent.mapsdk.internal.tz.AnonymousClass1((f18 - trVar.f52274at) / 10.0f, f17, f18, f19, z17, c17));
        }
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        this.f48905b.f52264aj.add(onMapLoadedCallback);
    }

    private float a(double d17, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        com.tencent.mapsdk.internal.ey eyVar;
        if (latLng == null) {
            return 0.0f;
        }
        com.tencent.map.lib.models.GeoPoint geoPoint = new com.tencent.map.lib.models.GeoPoint((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
        com.tencent.mapsdk.internal.ne neVar = ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).f52512o;
        if (neVar.f50520t != null && (eyVar = neVar.f50513m) != null) {
            double metersPerPixel = eyVar.metersPerPixel(geoPoint.getLatitudeE6() / 1000000.0d);
            if (metersPerPixel != 0.0d) {
                return (float) (d17 / metersPerPixel);
            }
        }
        return 0.0f;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final java.util.List<android.graphics.Rect> a(java.util.List<java.lang.String> list) {
        com.tencent.mapsdk.internal.qv qvVar;
        java.util.ArrayList arrayList = null;
        if (list != null && !list.isEmpty()) {
            if (this.f48905b == null) {
                return null;
            }
            arrayList = new java.util.ArrayList(list.size());
            com.tencent.mapsdk.internal.ey projection = ((com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_).getProjection();
            java.util.Iterator<java.lang.String> it = list.iterator();
            while (it.hasNext()) {
                com.tencent.mapsdk.internal.po c17 = this.f48905b.c(it.next());
                if (c17 != null) {
                    if (c17 instanceof com.tencent.mapsdk.internal.pp) {
                        arrayList.add(((com.tencent.mapsdk.internal.pp) c17).getScreenBound(projection));
                    } else if ((c17 instanceof com.tencent.mapsdk.internal.pr) && (qvVar = ((com.tencent.mapsdk.internal.pr) c17).f50736b) != null) {
                        arrayList.add(qvVar.getScreenBound(projection));
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(com.tencent.tencentmap.mapsdk.maps.model.Language language) {
        com.tencent.mapsdk.vector.VectorMap vectorMap;
        if (this.f48905b == null || (vectorMap = (com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_) == null) {
            return;
        }
        vectorMap.setLanguage(language);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(com.tencent.mapsdk.internal.fi fiVar) {
        com.tencent.mapsdk.vector.VectorMap vectorMap;
        if (this.f48905b == null || (vectorMap = (com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_) == null) {
            return;
        }
        vectorMap.f52512o.a(fiVar);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection> list, java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list2) {
        com.tencent.mapsdk.vector.VectorMap vectorMap;
        if (this.f48905b == null || (vectorMap = (com.tencent.mapsdk.vector.VectorMap) this.f48905b.e_) == null) {
            return;
        }
        java.util.List<com.tencent.map.lib.models.GeoPoint> from = com.tencent.map.lib.models.GeoPoint.from(list2);
        com.tencent.mapsdk.internal.ne neVar = vectorMap.f52512o;
        if (neVar.f50526z == null) {
            neVar.f50526z = new com.tencent.mapsdk.internal.ne.d();
        }
        com.tencent.mapsdk.internal.ne.d dVar = neVar.f50526z;
        dVar.f50538a = list;
        dVar.f50539b = from;
        com.tencent.mapsdk.internal.ne.this.f50506f.a(list, from);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        this.f48905b.a(onIndoorStateChangeListener);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(java.lang.String str) {
        com.tencent.mapsdk.internal.ne neVar;
        if (this.f48905b == null || (neVar = this.f48905b.f52273as) == null) {
            return;
        }
        com.tencent.mapsdk.internal.tk tkVar = neVar.f50506f;
        if (tkVar != null) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass36(str));
        }
        neVar.f50522v = true;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final com.tencent.tencentmap.mapsdk.maps.model.TileOverlay a(com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions) {
        com.tencent.mapsdk.internal.re reVar = this.f48917n;
        if (reVar == null) {
            return null;
        }
        return reVar.b(tileOverlayOptions);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final com.tencent.tencentmap.mapsdk.maps.model.CustomLayer a(com.tencent.tencentmap.mapsdk.maps.model.CustomLayerOptions customLayerOptions) {
        int i17;
        com.tencent.mapsdk.internal.qh qhVar = this.f48909f;
        if (qhVar != null && this.f48917n != null && qhVar.f50933a != null) {
            customLayerOptions.getLayerId();
            com.tencent.mapsdk.internal.lb.b(com.tencent.mapsdk.internal.kx.f50200a, qhVar.f50935c);
            com.tencent.mapsdk.internal.re reVar = qhVar.f50933a;
            com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions = new com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions();
            java.lang.String str = "custom_layer_" + com.tencent.mapsdk.internal.li.a(customLayerOptions.getLayerId());
            tileOverlayOptions.diskCacheDir(str);
            tileOverlayOptions.reuseTile(true);
            tileOverlayOptions.levelOffset(0);
            com.tencent.mapsdk.internal.qi a17 = qhVar.a(customLayerOptions.getLayerId());
            com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50200a, "cache_dir", (java.lang.Object) str, qhVar.f50935c);
            if (a17 != null) {
                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50200a, "version", (java.lang.Object) a17.f50947b, qhVar.f50935c);
                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50200a, "minZoom", java.lang.Integer.valueOf(a17.f50949d), qhVar.f50935c);
                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50200a, "maxZoom", java.lang.Integer.valueOf(a17.f50948c), qhVar.f50935c);
                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50200a, "layerId", (java.lang.Object) a17.f50946a, qhVar.f50935c);
                tileOverlayOptions.tileProvider(new com.tencent.mapsdk.internal.qh.AnonymousClass1(a17));
                tileOverlayOptions.versionInfo(a17.f50947b);
            }
            com.tencent.mapsdk.internal.qz a18 = reVar.a(tileOverlayOptions);
            com.tencent.mapsdk.internal.qi a19 = qhVar.a(customLayerOptions.getLayerId());
            if (a18 != null && a19 != null) {
                if (a19.f50950e) {
                    a18.a(true);
                    a19.f50950e = false;
                }
                int i18 = a19.f50949d;
                int i19 = a19.f50948c;
                com.tencent.mapsdk.internal.re reVar2 = a18.f51133q;
                if (reVar2 != null && (i17 = a18.f51132p) >= 0) {
                    reVar2.a(i17, i18, i19);
                }
                a18.a(a19.f50949d, a19.f50948c);
                com.tencent.mapsdk.internal.hg hgVar = qhVar.f50933a.f51155h.f49000c;
                if (hgVar != null) {
                    hgVar.c().f49768a++;
                }
                com.tencent.mapsdk.internal.lb.d(com.tencent.mapsdk.internal.kx.f50200a, qhVar.f50935c);
                return new com.tencent.mapsdk.internal.at(a18);
            }
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mapsdk.internal.ne neVar;
        if (this.f48905b == null || this.f48905b.e_ == 0 || (neVar = this.f48905b.f52273as) == null) {
            return;
        }
        com.tencent.mapsdk.internal.hg hgVar = neVar.f49000c;
        if (hgVar != null && !android.text.TextUtils.isEmpty(str)) {
            hgVar.d().a(str).b();
        }
        neVar.a(str, str2);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds, int i17) {
        if (this.f48905b == null || this.f48905b.e_ == 0) {
            return;
        }
        this.f48905b.f52273as.a(latLngBounds, i17);
    }

    @Override // com.tencent.mapsdk.internal.ai
    public final void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnTrafficEventClickListener onTrafficEventClickListener) {
        if (this.f48905b == null || this.f48905b.e_ == 0) {
            return;
        }
        this.f48905b.f52186ag = onTrafficEventClickListener;
    }
}
