package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class rk extends com.tencent.mapsdk.internal.bm implements com.tencent.mapsdk.internal.cd, com.tencent.mapsdk.internal.fr, com.tencent.mapsdk.internal.oz, com.tencent.mapsdk.internal.qa.b {

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String f51185c = "PromoteImage";

    /* renamed from: d, reason: collision with root package name */
    private static final java.lang.String f51186d = "promote-image-enable";

    /* renamed from: e, reason: collision with root package name */
    private static final java.lang.String f51187e = "promote-image-max-zoom";

    /* renamed from: f, reason: collision with root package name */
    private static final java.lang.String f51188f = "promote-image-min-zoom";

    /* renamed from: g, reason: collision with root package name */
    private static final int f51189g = 22;

    /* renamed from: h, reason: collision with root package name */
    private static final int f51190h = 15;

    /* renamed from: b, reason: collision with root package name */
    int f51191b = com.tencent.mapsdk.internal.rk.a.f51204a;

    /* renamed from: i, reason: collision with root package name */
    private boolean f51192i;

    /* renamed from: m, reason: collision with root package name */
    private int f51193m;

    /* renamed from: n, reason: collision with root package name */
    private int f51194n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f51195o;

    /* renamed from: p, reason: collision with root package name */
    private android.content.SharedPreferences f51196p;

    /* renamed from: q, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.CameraPosition f51197q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f51198r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f51199s;

    /* renamed from: t, reason: collision with root package name */
    private com.tencent.mapsdk.internal.cg f51200t;

    /* renamed from: u, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ce f51201u;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes13.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f51204a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f51205b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f51206c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f51207d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f51208e = 5;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ int[] f51209f = {1, 2, 3, 4, 5};

        private a(java.lang.String str, int i17) {
        }

        private static int[] a() {
            return (int[]) f51209f.clone();
        }
    }

    private int l() {
        return this.f51191b;
    }

    private void m() {
        if (this.f51201u == null) {
            this.f51201u = new com.tencent.mapsdk.internal.rj(this);
        }
    }

    private void n() {
        if (this.f51200t == null) {
            this.f51200t = new com.tencent.mapsdk.internal.rl(this);
        }
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final synchronized void c_() {
        super.c_();
        h();
        i();
        this.f51199s = true;
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51185c, "onDestroy...");
    }

    @Override // com.tencent.mapsdk.internal.cd
    public final void e() {
        if (this.f51192i) {
            int i17 = this.f51191b;
            if (i17 == com.tencent.mapsdk.internal.rk.a.f51204a || i17 == com.tencent.mapsdk.internal.rk.a.f51208e) {
                com.tencent.mapsdk.core.utils.log.LogUtil.b(f51185c, "startWatchingCamera");
                new com.tencent.mapsdk.internal.cg.b();
                n();
                new com.tencent.mapsdk.internal.ce.a();
                m();
                this.f51191b = com.tencent.mapsdk.internal.rk.a.f51205b;
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.cd
    public final void f() {
        com.tencent.mapsdk.internal.az azVar;
        int i17 = this.f51191b;
        if (i17 == com.tencent.mapsdk.internal.rk.a.f51205b || i17 == com.tencent.mapsdk.internal.rk.a.f51207d) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b(f51185c, "resumeWatchingCamera");
            com.tencent.mapsdk.internal.bn mapContext = getMapContext();
            if (mapContext == null || (azVar = (com.tencent.mapsdk.internal.az) mapContext.f48999b) == null) {
                return;
            }
            com.tencent.mapsdk.vector.VectorMap map = azVar.getMap();
            if (map == null) {
                com.tencent.mapsdk.core.utils.log.LogUtil.e(f51185c, "resumeWatchingCamera tencentMap null.");
            } else {
                if (map.getCameraPosition() == null) {
                    return;
                }
                a(this.f51200t, this.f51201u);
                ((com.tencent.mapsdk.internal.ne) mapContext).a(this);
                map.a((com.tencent.mapsdk.internal.fr) this);
                this.f51191b = com.tencent.mapsdk.internal.rk.a.f51206c;
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.cd
    public final void g() {
        com.tencent.mapsdk.internal.az azVar;
        if (this.f51191b == com.tencent.mapsdk.internal.rk.a.f51206c) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b(f51185c, "notifyUpdate");
            com.tencent.mapsdk.internal.bn mapContext = getMapContext();
            if (mapContext == null || (azVar = (com.tencent.mapsdk.internal.az) mapContext.f48999b) == null) {
                return;
            }
            com.tencent.mapsdk.vector.VectorMap map = azVar.getMap();
            if (map == null) {
                com.tencent.mapsdk.core.utils.log.LogUtil.e(f51185c, "notifyUpdate tencentMap null.");
                return;
            }
            com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition = map.getCameraPosition();
            if (cameraPosition == null) {
                return;
            }
            float f17 = cameraPosition.zoom;
            if (!(f17 >= ((float) this.f51194n) && f17 <= ((float) this.f51193m)) || (cameraPosition.equals(this.f51197q) && !this.f51198r)) {
                com.tencent.mapsdk.core.utils.log.LogUtil.b(f51185c, "the current position level[" + cameraPosition.zoom + "] is not in valid level range");
                return;
            }
            if (this.f51201u != null) {
                com.tencent.mapsdk.core.utils.log.LogUtil.b(f51185c, "notifyUpdate to Layer");
                this.f51201u.a(cameraPosition, this.f51195o);
            }
            if (this.f51200t != null) {
                com.tencent.mapsdk.core.utils.log.LogUtil.b(f51185c, "notifyUpdate to TileCache");
                this.f51200t.a(cameraPosition, this.f51195o, this.f51194n, this.f51193m);
            }
            this.f51197q = cameraPosition;
        }
    }

    @Override // com.tencent.mapsdk.internal.cd
    public final void h() {
        int i17 = this.f51191b;
        if (i17 == com.tencent.mapsdk.internal.rk.a.f51205b || i17 == com.tencent.mapsdk.internal.rk.a.f51206c) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b(f51185c, "pauseWatchingCamera");
            com.tencent.mapsdk.internal.ne neVar = (com.tencent.mapsdk.internal.ne) getMapContext();
            if (neVar != null) {
                neVar.b(this);
            }
            this.f51191b = com.tencent.mapsdk.internal.rk.a.f51207d;
        }
    }

    @Override // com.tencent.mapsdk.internal.cd
    public final void i() {
        int i17 = this.f51191b;
        if (i17 == com.tencent.mapsdk.internal.rk.a.f51205b || i17 == com.tencent.mapsdk.internal.rk.a.f51206c || i17 == com.tencent.mapsdk.internal.rk.a.f51207d) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b(f51185c, "stopWatchingCamera");
            this.f51191b = com.tencent.mapsdk.internal.rk.a.f51208e;
            this.f51201u.c();
            this.f51200t.a();
        }
    }

    @Override // com.tencent.mapsdk.internal.oz
    public final void j() {
    }

    @Override // com.tencent.mapsdk.internal.oz
    public final void k() {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51185c, "onMapCameraChangeStopped");
        g();
    }

    @Override // com.tencent.mapsdk.internal.cd
    public final com.tencent.mapsdk.internal.ce m_() {
        return this.f51201u;
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final void a(android.content.Context context) {
        super.a(context);
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51185c, "onCreate");
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final void b(com.tencent.mapsdk.internal.bn bnVar) {
        super.b(bnVar);
        h();
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final void c(com.tencent.mapsdk.internal.bn bnVar) {
        super.c(bnVar);
        f();
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final synchronized void d(com.tencent.mapsdk.internal.bn bnVar) {
        super.d(bnVar);
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51185c, "onUnregistered");
        if (bnVar == null) {
            return;
        }
        com.tencent.mapsdk.internal.az azVar = (com.tencent.mapsdk.internal.az) bnVar.f48999b;
        if (azVar != null) {
            azVar.b(this);
        }
        ((com.tencent.mapsdk.internal.ne) bnVar).b(this);
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final synchronized void a(com.tencent.mapsdk.internal.bn bnVar) {
        super.a(bnVar);
        if (bnVar == null) {
            return;
        }
        this.f51199s = false;
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51185c, "onRegistered");
        android.content.SharedPreferences a17 = com.tencent.mapsdk.internal.ku.a(c(), bnVar.F().c());
        this.f51196p = a17;
        this.f51192i = a17.getBoolean(f51186d, false);
        this.f51193m = java.lang.Math.min(22, this.f51196p.getInt(f51187e, 22));
        this.f51194n = java.lang.Math.max(15, this.f51196p.getInt(f51188f, 15));
        com.tencent.mapsdk.internal.az azVar = (com.tencent.mapsdk.internal.az) bnVar.f48999b;
        if (azVar != null) {
            azVar.a(this);
        }
        if (this.f51192i) {
            e();
        }
    }

    @Override // com.tencent.mapsdk.internal.fr
    public final void i(int i17) {
        boolean o17;
        com.tencent.mapsdk.internal.bn mapContext = getMapContext();
        if (mapContext == null || this.f51195o == (o17 = mapContext.o())) {
            return;
        }
        this.f51195o = o17;
        this.f51198r = true;
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51185c, "onStyleChanged isDarkMode ? ".concat(java.lang.String.valueOf(o17)));
        g();
    }

    @Override // com.tencent.mapsdk.internal.cd
    public final com.tencent.mapsdk.internal.cg d() {
        return this.f51200t;
    }

    @Override // com.tencent.mapsdk.internal.cd
    public final boolean a() {
        return this.f51192i;
    }

    private static void a(com.tencent.mapsdk.internal.cg cgVar, com.tencent.mapsdk.internal.ce ceVar) {
        ceVar.a();
        cgVar.a(ceVar);
    }

    @Override // com.tencent.mapsdk.internal.cd
    public final java.util.List<com.tencent.mapsdk.internal.cc> a(java.lang.String str) {
        try {
            return com.tencent.mapsdk.internal.hq.a((java.lang.Iterable) com.tencent.map.tools.json.JsonUtils.parseToList(new org.json.JSONObject(str).optJSONArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA), com.tencent.mapsdk.internal.ri.class, new java.lang.Object[0]), (com.tencent.mapsdk.internal.hq.h) new com.tencent.mapsdk.internal.hq.h<com.tencent.mapsdk.internal.ri, com.tencent.mapsdk.internal.cc>() { // from class: com.tencent.mapsdk.internal.rk.1
                @Override // com.tencent.mapsdk.internal.hq.h
                public final /* synthetic */ com.tencent.mapsdk.internal.cc a(com.tencent.mapsdk.internal.ri riVar) {
                    int i17;
                    int i18;
                    int i19;
                    int i27;
                    com.tencent.mapsdk.internal.ri riVar2 = riVar;
                    if (riVar2.b().latitude != 0.0d && riVar2.b().longitude != 0.0d && java.lang.Integer.parseInt(riVar2.f51166g) >= java.lang.Integer.parseInt(riVar2.f51167h) && !com.tencent.mapsdk.internal.hr.a(riVar2.f51160a) && !com.tencent.mapsdk.internal.hr.a(riVar2.f51165f) && (i17 = riVar2.f51163d) > 0 && (i18 = riVar2.f51164e) > 0 && i17 <= 32 && i18 <= 32 && i17 % 4 == 0 && i18 % 4 == 0 && (i19 = riVar2.f51161b) <= (i27 = riVar2.f51162c) && i27 <= com.tencent.mapsdk.internal.rk.this.f51193m && i19 >= com.tencent.mapsdk.internal.rk.this.f51194n) {
                        return riVar2;
                    }
                    return null;
                }

                /* renamed from: a, reason: avoid collision after fix types in other method */
                private com.tencent.mapsdk.internal.cc a2(com.tencent.mapsdk.internal.ri riVar) {
                    int i17;
                    int i18;
                    int i19;
                    int i27;
                    if (riVar.b().latitude != 0.0d && riVar.b().longitude != 0.0d && java.lang.Integer.parseInt(riVar.f51166g) >= java.lang.Integer.parseInt(riVar.f51167h) && !com.tencent.mapsdk.internal.hr.a(riVar.f51160a) && !com.tencent.mapsdk.internal.hr.a(riVar.f51165f) && (i17 = riVar.f51163d) > 0 && (i18 = riVar.f51164e) > 0 && i17 <= 32 && i18 <= 32 && i17 % 4 == 0 && i18 % 4 == 0 && (i19 = riVar.f51161b) <= (i27 = riVar.f51162c) && i27 <= com.tencent.mapsdk.internal.rk.this.f51193m && i19 >= com.tencent.mapsdk.internal.rk.this.f51194n) {
                        return riVar;
                    }
                    return null;
                }
            });
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    @Override // com.tencent.mapsdk.internal.cd
    public final com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor a(com.tencent.mapsdk.internal.cc ccVar, byte[] bArr, boolean z17, boolean z18) {
        com.tencent.mapsdk.internal.ce ceVar = this.f51201u;
        if (ceVar != null) {
            return ceVar.a(ccVar, bArr, z17, z18);
        }
        return null;
    }

    private void a(int i17) {
        this.f51191b = i17;
    }

    private boolean a(com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition) {
        float f17 = cameraPosition.zoom;
        return f17 >= ((float) this.f51194n) && f17 <= ((float) this.f51193m);
    }

    @Override // com.tencent.mapsdk.internal.qa.b
    public final void a(com.tencent.mapsdk.internal.qb.b bVar) {
        org.json.JSONObject jSONObject;
        if (bVar == null || (jSONObject = bVar.f50894g) == null) {
            return;
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("wechat_logo");
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51185c, "onMapAuthoritySuccess... : ".concat(java.lang.String.valueOf(optJSONObject)));
        if (optJSONObject != null) {
            this.f51192i = optJSONObject.optInt("enable", 0) == 1;
            com.tencent.mapsdk.internal.ku.a a17 = com.tencent.mapsdk.internal.ku.a(this.f51196p);
            a17.f50191a.putBoolean(f51186d, this.f51192i);
            a17.f50191a.commit();
            this.f51193m = optJSONObject.optInt("zoom_max", 22);
            com.tencent.mapsdk.internal.ku.a(this.f51196p).a(f51187e, this.f51193m);
            this.f51194n = java.lang.Math.max(optJSONObject.optInt("zoom_min", 15), 15);
            com.tencent.mapsdk.internal.ku.a(this.f51196p).a(f51188f, this.f51194n);
            com.tencent.mapsdk.core.utils.log.LogUtil.b(f51185c, "thisFeatureZoom : [" + this.f51194n + "~" + this.f51193m + "]");
        }
        com.tencent.mapsdk.internal.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.rk.2
            @Override // java.lang.Runnable
            public final void run() {
                if (com.tencent.mapsdk.internal.rk.this.f51199s) {
                    return;
                }
                if (!com.tencent.mapsdk.internal.rk.this.f51192i) {
                    com.tencent.mapsdk.internal.rk.this.h();
                    com.tencent.mapsdk.internal.rk.this.i();
                } else {
                    com.tencent.mapsdk.internal.rk.this.e();
                    com.tencent.mapsdk.internal.rk.this.f();
                    com.tencent.mapsdk.internal.rk.this.g();
                }
            }
        });
    }

    @Override // com.tencent.mapsdk.internal.qa.b
    public final void a(int i17, java.lang.String str) {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(f51185c, "onMapAuthorityFail... code:" + i17 + " msg:" + str);
        i();
    }
}
