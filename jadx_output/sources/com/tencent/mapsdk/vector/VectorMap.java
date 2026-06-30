package com.tencent.mapsdk.vector;

/* loaded from: classes13.dex */
public class VectorMap extends com.tencent.mapsdk.internal.bl {
    private static final int A = 2;
    private static final int B = 3;

    /* renamed from: a, reason: collision with root package name */
    public static final int f52492a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f52493b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f52494c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f52495d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f52496e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f52497f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final int f52498g = 11;

    /* renamed from: h, reason: collision with root package name */
    public static final int f52499h = 15;

    /* renamed from: i, reason: collision with root package name */
    public static final int f52500i = 18;

    /* renamed from: j, reason: collision with root package name */
    public static final float f52501j = com.tencent.tencentmap.mapsdk.maps.MapParamConstants.MAX_SKEW_ANGLE;

    /* renamed from: k, reason: collision with root package name */
    public static final int f52502k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f52503l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f52504m = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final int f52505v = 0;

    /* renamed from: w, reason: collision with root package name */
    public static final int f52506w = 1;

    /* renamed from: x, reason: collision with root package name */
    public static final int f52507x = 2;

    /* renamed from: y, reason: collision with root package name */
    public static final int f52508y = 3;

    /* renamed from: z, reason: collision with root package name */
    private static final int f52509z = 1;
    private com.tencent.mapsdk.internal.ab F;

    /* renamed from: J, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.UiSettings f52510J;
    private boolean K;
    private com.tencent.tencentmap.mapsdk.maps.internal.TencentMapPro L;
    private final com.tencent.mapsdk.internal.tz M;
    private float N;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.ne f52512o;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mapsdk.internal.bg f52514q;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mapsdk.internal.py f52517t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f52511n = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f52513p = true;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mapsdk.internal.qa f52515r = null;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mapsdk.internal.bf f52516s = null;
    private com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig C = null;
    private com.tencent.mapsdk.internal.af D = null;
    private com.tencent.tencentmap.mapsdk.maps.Projection E = null;
    private com.tencent.mapsdk.internal.ae G = null;
    private boolean H = false;
    private boolean I = false;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.Map<com.tencent.mapsdk.internal.qa.b, java.lang.Boolean> f52518u = new java.util.concurrent.ConcurrentHashMap();
    private com.tencent.map.lib.models.GeoPoint O = new com.tencent.map.lib.models.GeoPoint();
    private int P = 0;

    public VectorMap(com.tencent.mapsdk.internal.ne neVar) {
        this.f52512o = neVar;
        this.M = (com.tencent.mapsdk.internal.tz) neVar.f48999b;
    }

    private static int A() {
        return 20;
    }

    private java.lang.String B() {
        return this.f52512o.M();
    }

    private java.lang.String[] C() {
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        android.graphics.Rect q17 = neVar.f50508h.q();
        android.graphics.Point[] pointArr = {new android.graphics.Point(q17.centerX(), q17.centerY()), new android.graphics.Point(q17.left, q17.top), new android.graphics.Point(q17.left, q17.bottom), new android.graphics.Point(q17.right, q17.top), new android.graphics.Point(q17.right, q17.bottom)};
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i17 = 0; i17 < 5; i17++) {
            android.graphics.Point point = pointArr[i17];
            java.lang.String a17 = neVar.a(new com.tencent.map.lib.models.GeoPoint(point.y, point.x));
            if (!com.tencent.mapsdk.internal.hr.a(a17)) {
                hashSet.add(a17);
            }
        }
        return (java.lang.String[]) hashSet.toArray(new java.lang.String[0]);
    }

    private android.graphics.Rect D() {
        return this.f52512o.f50508h.q();
    }

    private android.graphics.Rect E() {
        return this.f52512o.f50508h.r();
    }

    private int F() {
        return this.f52512o.f50508h.A.f52409b.f52444m;
    }

    private com.tencent.map.lib.models.GeoPoint G() {
        return this.f52512o.f50508h.s();
    }

    private com.tencent.map.lib.models.GeoPoint H() {
        return this.f52512o.f50508h.t();
    }

    private boolean I() {
        return this.f52512o.f50516p;
    }

    private static void J() {
    }

    private boolean K() {
        return this.f52512o.f50517q;
    }

    private boolean L() {
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        com.tencent.mapsdk.internal.tk tkVar = neVar.f50506f;
        return tkVar != null && ((java.lang.Integer) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass163>) new com.tencent.mapsdk.internal.tk.AnonymousClass163(neVar.M()), (com.tencent.mapsdk.internal.tk.AnonymousClass163) 0)).intValue() == 1;
    }

    private static boolean M() {
        return true;
    }

    private float N() {
        return this.f52512o.f50508h.A.f52409b.a();
    }

    private void O() {
        this.f52512o.f50508h.a((java.lang.Runnable) null);
    }

    private void P() {
        this.f52512o.f50508h.b((java.lang.Runnable) null);
    }

    private void Q() {
        this.f52512o.f50508h.p();
    }

    private boolean R() {
        return this.f52512o.f50508h.k();
    }

    private void S() {
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        adVar.o();
        adVar.j();
    }

    private void T() {
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        adVar.o();
        adVar.a(adVar.h(), com.tencent.tencentmap.mapsdk.maps.MapParamConstants.MAX_SKEW_ANGLE, true);
    }

    private void U() {
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        adVar.o();
        adVar.f48818o.e();
        adVar.a(0.0d, 0.0d);
    }

    private void V() {
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        adVar.o();
        adVar.f48818o.e();
        adVar.a(adVar.h(), com.tencent.tencentmap.mapsdk.maps.MapParamConstants.MAX_SKEW_ANGLE);
    }

    private void W() {
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (tkVar != null) {
            tkVar.c();
        }
    }

    private void X() {
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (tkVar != null) {
            tkVar.f();
        }
    }

    private void Y() {
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (tkVar != null) {
            tkVar.d();
        }
    }

    private void Z() {
        this.f52512o.f50519s.a();
    }

    private void aA() {
        this.f52511n = true;
    }

    private java.util.ArrayList<com.tencent.tencentmap.mapsdk.maps.model.MapPoi> aB() {
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar == null) {
            return null;
        }
        return neVar.Q();
    }

    private java.lang.String aC() {
        com.tencent.mapsdk.internal.tk tkVar;
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar == null || (tkVar = neVar.f50506f) == null) {
            return null;
        }
        return (java.lang.String) tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass51(), (com.tencent.mapsdk.internal.tk.AnonymousClass51) null);
    }

    private java.lang.String aD() {
        com.tencent.mapsdk.internal.tk tkVar;
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar == null || (tkVar = neVar.f50506f) == null) {
            return null;
        }
        return tkVar.a();
    }

    private com.tencent.mapsdk.internal.ne aE() {
        return this.f52512o;
    }

    private com.tencent.mapsdk.internal.bg aF() {
        return this.f52514q;
    }

    private void aG() {
        com.tencent.mapsdk.internal.bf bfVar = this.f52516s;
        if (bfVar != null) {
            bfVar.f48886d = false;
            bfVar.a();
            com.tencent.tencentmap.mapsdk.maps.model.Circle circle = bfVar.f48887e;
            if (circle != null) {
                circle.remove();
                bfVar.f48887e = null;
            }
            com.tencent.tencentmap.mapsdk.maps.LocationSource locationSource = bfVar.f48884b;
            if (locationSource != null) {
                locationSource.deactivate();
                bfVar.f48884b = null;
            }
            com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.LocationRegionChangedListener regionChangedListener = com.tencent.map.tools.net.NetManager.getInstance().getRegionChangedListener();
            if (regionChangedListener != null) {
                java.util.Iterator<java.lang.ref.WeakReference<com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.LocationRegionChangedListener>> it = bfVar.f48890h.iterator();
                while (it.hasNext()) {
                    if (it.next().get() != regionChangedListener) {
                        it.remove();
                    }
                }
            }
            this.f52516s = null;
        }
        com.tencent.mapsdk.internal.bg bgVar = this.f52514q;
        if (bgVar != null) {
            if (bgVar.f48905b != null) {
                ((com.tencent.mapsdk.vector.VectorMap) bgVar.f48905b.e_).b(bgVar.f48914k);
                bgVar.f48905b.l();
                bgVar.f48905b = null;
            }
            if (bgVar.f48906c != null) {
                bgVar.f48906c = null;
            }
            com.tencent.mapsdk.internal.hl.a aVar = com.tencent.mapsdk.internal.hl.f49771b;
            if (aVar != null) {
                aVar.c();
            }
            this.f52514q = null;
        }
    }

    private void aH() {
        com.tencent.mapsdk.internal.ae aeVar = this.G;
        if (aeVar != null) {
            if (aeVar.f48857a != null) {
                aeVar.f48857a = null;
            }
            this.G = null;
        }
        com.tencent.mapsdk.internal.ab abVar = this.F;
        if (abVar != null) {
            if (abVar.f48769b != null) {
                abVar.f48769b = null;
            }
            this.F = null;
        }
        if (this.E != null) {
            this.E = null;
        }
        com.tencent.mapsdk.internal.af afVar = this.D;
        if (afVar != null) {
            if (afVar.f48858a != null) {
                afVar.f48858a = null;
            }
            this.D = null;
        }
    }

    private long aa() {
        return this.f52512o.f50508h.f48818o.c();
    }

    private void ab() {
        this.f52512o.f50508h.f48818o.a();
    }

    private void ac() {
        this.f52512o.f50508h.f48818o.b();
    }

    private java.lang.String ad() {
        return this.f52512o.toString();
    }

    private boolean ae() {
        return this.f52512o.f50508h.f48818o.f();
    }

    private void af() {
        this.f52512o.f50508h.f48818o.f48757e = 60;
    }

    private int ag() {
        return this.f52512o.f50508h.A.f52411d;
    }

    private android.graphics.Rect ah() {
        return this.f52512o.f50515o;
    }

    private void ai() {
        this.f52512o.f50508h.e();
    }

    private void aj() {
        this.f52512o.f50508h.f();
    }

    private void ak() {
        com.tencent.mapsdk.internal.rw rwVar;
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (!neVar.f50517q || (rwVar = neVar.f50509i) == null) {
            return;
        }
        rwVar.a();
    }

    private void al() {
        this.f52512o.K();
    }

    private int am() {
        return this.P;
    }

    private com.tencent.mapsdk.internal.bf an() {
        return this.f52516s;
    }

    private java.lang.String[] ao() {
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (tkVar != null) {
            return (java.lang.String[]) tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass166(), (com.tencent.mapsdk.internal.tk.AnonymousClass166) null);
        }
        return null;
    }

    private java.lang.String ap() {
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (tkVar != null) {
            return (java.lang.String) tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass169(), (com.tencent.mapsdk.internal.tk.AnonymousClass169) null);
        }
        return null;
    }

    private android.graphics.Rect aq() {
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (tkVar != null) {
            return (android.graphics.Rect) tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass168(), (com.tencent.mapsdk.internal.tk.AnonymousClass168) null);
        }
        return null;
    }

    private com.tencent.mapsdk.internal.v ar() {
        return this.f52512o.f50508h.g();
    }

    private void as() {
        this.f52512o.f50508h.j();
    }

    private com.tencent.mapsdk.internal.nd at() {
        return this.f52512o.f50511k;
    }

    private com.tencent.mapsdk.internal.v au() {
        return this.f52512o.f50520t;
    }

    private boolean av() {
        return this.f52512o.H.f51153f.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aw() {
        if (this.f52516s == null) {
            this.f52516s = new com.tencent.mapsdk.internal.bf(this.f52512o, this.F);
        }
        if (this.C == null) {
            this.C = com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig.newBuilder().build();
        }
    }

    private boolean ax() {
        return this.f52513p;
    }

    private java.lang.String ay() {
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar != null) {
            return neVar.G();
        }
        return null;
    }

    private boolean az() {
        return this.f52511n;
    }

    private static boolean d(int i17, int i18) {
        return com.tencent.tencentmap.mapsdk.maps.model.GeometryConstants.BOUNDARY_WORLD.contains(i18, i17);
    }

    private void f(com.tencent.mapsdk.internal.ez ezVar) {
        this.f52512o.f50510j.b(ezVar);
        this.f52512o.f50522v = true;
    }

    private void g(int i17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (tkVar != null) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass113(i17));
        }
    }

    private void i(int i17) {
        this.f52512o.f50508h.f48818o.a(i17);
    }

    private void j(int i17) {
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar == null) {
            return;
        }
        if (i17 != 0) {
            if (i17 == 1) {
                neVar.a(false, false);
                int i18 = (getMapStyle() != 11 ? 18 : 17) - 1;
                if (this.P == 2) {
                    com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
                    adVar.a(i18, (java.lang.Runnable) new com.tencent.mapsdk.internal.ad.AnonymousClass4());
                } else {
                    int s17 = s();
                    if (s17 > i18) {
                        i18 = s17;
                    }
                    a(this.O, i18);
                }
            } else if (i17 == 2) {
                int i19 = getMapStyle() != 11 ? 18 : 17;
                int s18 = s();
                if (s18 > i19) {
                    i19 = s18;
                }
                if (this.O.getLatitudeE6() != 0) {
                    this.f52512o.f50508h.a(this.O.getLatitudeE6(), this.O.getLongitudeE6(), 2);
                }
                float f17 = this.N;
                com.tencent.mapsdk.internal.ad adVar2 = this.f52512o.f50508h;
                adVar2.a(i19, (java.lang.Runnable) new com.tencent.mapsdk.internal.ad.AnonymousClass5(f17));
                new android.os.Handler().postDelayed(new java.lang.Runnable() { // from class: com.tencent.mapsdk.vector.VectorMap.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mapsdk.vector.VectorMap.this.f52512o.a(true, false);
                    }
                }, 1000L);
            } else if (i17 == 3) {
                neVar.a(false, true);
            }
        } else {
            neVar.a(false, false);
        }
        this.P = i17;
    }

    private static int k(int i17) {
        if (i17 < 3) {
            i17 = 3;
        }
        if (i17 > 22) {
            return 22;
        }
        return i17;
    }

    private void l(int i17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (tkVar == null || 0 == tkVar.f51661e) {
            return;
        }
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass179(i17));
    }

    @java.lang.Deprecated
    private void m(int i17) {
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        com.tencent.mapsdk.internal.tk tkVar = neVar.f50506f;
        if (tkVar != null) {
            tkVar.f(i17);
            neVar.f50522v = true;
        }
    }

    @java.lang.Deprecated
    private void n(int i17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (tkVar != null) {
            tkVar.g(i17);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.AoiLayer addAoiLayer(java.lang.String str, com.tencent.tencentmap.mapsdk.maps.model.AoiLayerOptions aoiLayerOptions, com.tencent.tencentmap.mapsdk.maps.model.AoiLayer.OnAoiLayerLoadListener onAoiLayerLoadListener) {
        com.tencent.mapsdk.internal.py pyVar;
        super.addAoiLayer(str, aoiLayerOptions, onAoiLayerLoadListener);
        com.tencent.mapsdk.internal.pw pwVar = null;
        if (!this.H && (pyVar = this.f52517t) != null) {
            java.util.Iterator<com.tencent.mapsdk.internal.pw> it = pyVar.f50841a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.mapsdk.internal.pw next = it.next();
                if (next.getId() != null && next.getId().equals(str)) {
                    pwVar = next;
                    break;
                }
            }
            if (pwVar == null) {
                pwVar = new com.tencent.mapsdk.internal.pw(pyVar, str, aoiLayerOptions, pyVar);
                pyVar.f50841a.add(pwVar);
                if (onAoiLayerLoadListener != null) {
                    pyVar.f50844d.put(str, onAoiLayerLoadListener);
                }
            }
            pwVar.a(aoiLayerOptions);
            o();
        }
        return pwVar;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.Arc addArc(com.tencent.tencentmap.mapsdk.maps.model.ArcOptions arcOptions) {
        com.tencent.mapsdk.internal.ne neVar;
        if (this.H || (neVar = this.f52512o) == null || arcOptions == null) {
            return null;
        }
        com.tencent.mapsdk.internal.bh bhVar = neVar.f50497J;
        com.tencent.mapsdk.internal.pl plVar = new com.tencent.mapsdk.internal.pl(arcOptions, bhVar.f48954i);
        com.tencent.mapsdk.internal.ar arVar = new com.tencent.mapsdk.internal.ar(plVar);
        bhVar.f48946a.put(plVar.getId(), arVar);
        bhVar.f48949d.add(arVar);
        bhVar.a((com.tencent.mapsdk.internal.ev) plVar);
        return arVar;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.Circle addCircle(com.tencent.tencentmap.mapsdk.maps.model.CircleOptions circleOptions) {
        com.tencent.mapsdk.internal.ne neVar;
        if (this.H || circleOptions == null || (neVar = this.f52512o) == null) {
            return null;
        }
        return neVar.f50497J.a(circleOptions);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.CustomLayer addCustomLayer(com.tencent.tencentmap.mapsdk.maps.model.CustomLayerOptions customLayerOptions) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.addCustomLayer(customLayerOptions);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return null;
        }
        return aiVar.a(customLayerOptions);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay addGroundOverlay(com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions groundOverlayOptions) {
        com.tencent.mapsdk.internal.ne neVar;
        super.addGroundOverlay(groundOverlayOptions);
        com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay groundOverlay = null;
        if (!this.H && (neVar = this.f52512o) != null && groundOverlayOptions != null) {
            if (neVar.f50506f != null) {
                com.tencent.mapsdk.internal.hg hgVar = neVar.f49000c;
                if (hgVar != null) {
                    hgVar.o().f49692a++;
                }
                groundOverlay = (com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay) neVar.f50510j.a((com.tencent.mapsdk.internal.bi) new com.tencent.mapsdk.internal.nv(neVar.f50506f.A(), groundOverlayOptions));
            }
            o();
        }
        return groundOverlay;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.Marker addMarker(com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions) {
        com.tencent.mapsdk.internal.ne neVar;
        if (this.H || (neVar = this.f52512o) == null || markerOptions == null) {
            return null;
        }
        return neVar.f50497J.a(markerOptions);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void addOnMapLoadedCallback(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.addOnMapLoadedCallback(onMapLoadedCallback);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return;
        }
        aiVar.a(onMapLoadedCallback);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.Polygon addPolygon(com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions polygonOptions) {
        com.tencent.mapsdk.internal.ne neVar;
        if (this.H || (neVar = this.f52512o) == null || polygonOptions == null) {
            return null;
        }
        com.tencent.mapsdk.internal.bh bhVar = neVar.f50497J;
        com.tencent.mapsdk.internal.pq pqVar = new com.tencent.mapsdk.internal.pq(bhVar.f48954i, polygonOptions);
        com.tencent.mapsdk.internal.aw awVar = new com.tencent.mapsdk.internal.aw(pqVar);
        bhVar.f48946a.put(pqVar.getId(), awVar);
        bhVar.f48951f.add(awVar);
        bhVar.a((com.tencent.mapsdk.internal.ev) pqVar);
        return awVar;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.Polyline addPolyline(com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions polylineOptions) {
        com.tencent.mapsdk.internal.ne neVar;
        if (this.H || (neVar = this.f52512o) == null || polylineOptions == null) {
            return null;
        }
        return neVar.f50497J.a(polylineOptions);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void addTencentMapGestureListener(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener tencentMapGestureListener) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.addTencentMapGestureListener(tencentMapGestureListener);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return;
        }
        aiVar.a(tencentMapGestureListener);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.TileOverlay addTileOverlay(com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.addTileOverlay(tileOverlayOptions);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return null;
        }
        return aiVar.a(tileOverlayOptions);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay addVectorHeatOverlay(com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions vectorHeatOverlayOptions) {
        com.tencent.mapsdk.internal.ne neVar;
        super.addVectorHeatOverlay(vectorHeatOverlayOptions);
        com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay vectorHeatOverlay = null;
        if (!this.H && (neVar = this.f52512o) != null) {
            if (neVar.f50506f != null) {
                com.tencent.mapsdk.internal.hg hgVar = neVar.f49000c;
                if (hgVar != null) {
                    hgVar.h().a();
                }
                vectorHeatOverlay = (com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay) neVar.f50510j.a((com.tencent.mapsdk.internal.bi) new com.tencent.mapsdk.internal.nl(vectorHeatOverlayOptions));
            }
            o();
        }
        return vectorHeatOverlay;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public <L extends com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay> L addVectorOverlay(com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider vectorOverlayProvider) {
        com.tencent.mapsdk.internal.ne neVar;
        super.addVectorOverlay(vectorOverlayProvider);
        if (this.H || (neVar = this.f52512o) == null) {
            return null;
        }
        L l17 = (L) neVar.a(vectorOverlayProvider);
        o();
        return l17;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.map.sdk.comps.vis.VisualLayer addVisualLayer(com.tencent.map.sdk.comps.vis.VisualLayerOptions visualLayerOptions) {
        super.addVisualLayer(visualLayerOptions);
        com.tencent.mapsdk.internal.ee eeVar = (com.tencent.mapsdk.internal.ee) getMapComponent(com.tencent.mapsdk.internal.ee.class);
        if (eeVar != null) {
            return eeVar.a(visualLayerOptions);
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void animateCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdate cameraUpdate) {
        com.tencent.mapsdk.internal.ab abVar;
        super.animateCamera(cameraUpdate);
        if (this.H || (abVar = this.F) == null || abVar.b()) {
            return;
        }
        this.F.a(cameraUpdate, 500L, (com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback) null);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.CameraPosition calculateMapOverLook(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds, android.graphics.RectF rectF, float f17, float f18, int i17, int i18, int i19, int i27) {
        if (this.H || latLngBounds == null || rectF == null) {
            return null;
        }
        android.graphics.RectF rectF2 = new android.graphics.RectF();
        rectF2.left = (float) latLngBounds.getLonWest();
        rectF2.top = (float) latLngBounds.getLatNorth();
        rectF2.right = (float) latLngBounds.getLonEast();
        rectF2.bottom = (float) latLngBounds.getLatSouth();
        rectF.set(rectF.left + i17, rectF.top + i18, rectF.right - i19, rectF.bottom - i27);
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (tkVar.f51661e == 0) {
            return null;
        }
        return tkVar.f51660d.nativeCalcMapOverLook(tkVar.f51661e, rectF2, rectF, f17, f18);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.CameraPosition calculateZoomToSpanLevel(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IOverlay> list, java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list2, int i17, int i18, int i19, int i27) {
        java.util.ArrayList arrayList;
        super.calculateZoomToSpanLevel(list, list2, i17, i18, i19, i27);
        if (this.H || this.F == null) {
            return null;
        }
        int abs = java.lang.Math.abs(i17);
        int abs2 = java.lang.Math.abs(i18);
        int abs3 = java.lang.Math.abs(i19);
        int abs4 = java.lang.Math.abs(i27);
        if (list != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.tencent.tencentmap.mapsdk.maps.model.IOverlay iOverlay : list) {
                if (iOverlay instanceof com.tencent.mapsdk.internal.ez) {
                    arrayList2.add((com.tencent.mapsdk.internal.ez) iOverlay);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        com.tencent.mapsdk.internal.ai aiVar = this.F.f48769b;
        if (aiVar == null) {
            return null;
        }
        return aiVar.a(arrayList, list2, abs, abs2, abs3, abs4);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void clear() {
        super.clear();
        clearAllOverlays();
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void clearAllOverlays() {
        com.tencent.mapsdk.internal.tz tzVar;
        super.clearAllOverlays();
        if (this.H || (tzVar = this.M) == null) {
            return;
        }
        tzVar.m();
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void clearCache() {
        super.clearCache();
        com.tencent.mapsdk.internal.ks.f(com.tencent.mapsdk.internal.mz.a(getMapContext().getContext(), (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).c());
    }

    public void clearRouteNameSegments() {
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar.f50526z == null) {
            neVar.f50526z = new com.tencent.mapsdk.internal.ne.d();
        }
        com.tencent.mapsdk.internal.ne.d dVar = neVar.f50526z;
        com.tencent.mapsdk.internal.ne.this.f50506f.w();
        dVar.f50538a = null;
        dVar.f50539b = null;
    }

    @Override // com.tencent.mapsdk.internal.bl
    public final void e() {
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void enableAutoMaxSkew(boolean z17) {
        com.tencent.mapsdk.internal.ne neVar;
        super.enableAutoMaxSkew(z17);
        if (this.H || (neVar = this.f52512o) == null) {
            return;
        }
        neVar.f50520t.f52426s = z17;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void enableMultipleInfowindow(boolean z17) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.enableMultipleInfowindow(z17);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return;
        }
        aiVar.f(z17);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public java.lang.String executeVisualLayerCommand(com.tencent.map.sdk.comps.vis.VisualLayer visualLayer, java.lang.String str) {
        super.executeVisualLayerCommand(visualLayer, str);
        com.tencent.mapsdk.internal.ee eeVar = (com.tencent.mapsdk.internal.ee) getMapComponent(com.tencent.mapsdk.internal.ee.class);
        if (eeVar != null) {
            return eeVar.a(visualLayer, str);
        }
        return null;
    }

    @Override // com.tencent.map.sdk.comps.indoor.IIndoor
    public java.lang.String getActivedIndoorBuilding(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding u17;
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null || (u17 = aiVar.u()) == null) {
            return null;
        }
        if (u17.getBuildingLatLng() != null && latLng != null) {
            latLng.latitude = u17.getBuildingLatLng().latitude;
            latLng.longitude = u17.getBuildingLatLng().longitude;
        }
        return u17.getBuildingName();
    }

    @Override // com.tencent.map.sdk.comps.indoor.IIndoor
    public java.lang.String[] getActivedIndoorFloorNames() {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return null;
        }
        return aiVar.s();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> getBounderPoints(com.tencent.tencentmap.mapsdk.maps.model.Marker marker) {
        com.tencent.mapsdk.internal.ne neVar;
        com.tencent.mapsdk.internal.av avVar;
        if (marker == null || (neVar = this.f52512o) == null || (avVar = (com.tencent.mapsdk.internal.av) neVar.f50497J.a(marker.getId(), com.tencent.mapsdk.internal.av.class)) == null) {
            return null;
        }
        return avVar.f48864b.e();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.CameraPosition getCameraPosition() {
        com.tencent.mapsdk.internal.ab abVar;
        if (this.H || (abVar = this.F) == null) {
            return null;
        }
        return abVar.a();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public java.lang.String getCityName(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        com.tencent.mapsdk.internal.ab abVar;
        if (this.H || (abVar = this.F) == null) {
            return "";
        }
        com.tencent.mapsdk.internal.ai aiVar = abVar.f48769b;
        if (aiVar == null) {
            return null;
        }
        return aiVar.a(latLng);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public java.lang.String getDebugError() {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return null;
        }
        return aiVar.z();
    }

    @Override // com.tencent.map.sdk.comps.indoor.IIndoor
    public int getIndoorFloorId() {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return -1;
        }
        return aiVar.r();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.model.Language getLanguage() {
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar.f50525y == null) {
            neVar.f50525y = new com.tencent.mapsdk.internal.ne.c();
        }
        com.tencent.mapsdk.internal.ne.c cVar = neVar.f50525y;
        if (com.tencent.mapsdk.internal.ne.this.f50506f == null) {
            return com.tencent.tencentmap.mapsdk.maps.model.Language.zh;
        }
        com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.ne.this.f50506f;
        return com.tencent.tencentmap.mapsdk.maps.model.Language.wrap(tkVar.f51660d.nativeGetLanguage(tkVar.f51661e));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.TencentMapContext getMapContext() {
        return this.f52512o;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public int getMapHeight() {
        com.tencent.mapsdk.internal.bu buVar;
        com.tencent.mapsdk.internal.tz tzVar = this.M;
        if (tzVar == null || tzVar.getMapRenderView() == null || (buVar = this.M.getMapRenderView().get()) == null) {
            return 0;
        }
        return buVar.getMapHeight();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public android.graphics.Rect getMapPadding() {
        return this.f52512o.f50508h.b();
    }

    public com.tencent.tencentmap.mapsdk.maps.internal.TencentMapPro getMapPro() {
        return this.L;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public int getMapStyle() {
        com.tencent.mapsdk.internal.ab abVar;
        if (this.H || (abVar = this.F) == null) {
            return 0;
        }
        com.tencent.mapsdk.internal.ai aiVar = abVar.f48769b;
        if (aiVar == null) {
            return -1;
        }
        return aiVar.f();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public int getMapType() {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return 1000;
        }
        return aiVar.A();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public int getMapWidth() {
        com.tencent.mapsdk.internal.bu buVar;
        com.tencent.mapsdk.internal.tz tzVar = this.M;
        if (tzVar == null || tzVar.getMapRenderView() == null || (buVar = this.M.getMapRenderView().get()) == null) {
            return 0;
        }
        return buVar.getMapWidth();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public float getMaxZoomLevel() {
        com.tencent.mapsdk.internal.ab abVar;
        if (this.H || (abVar = this.F) == null) {
            return 0.0f;
        }
        com.tencent.mapsdk.internal.ai aiVar = abVar.f48769b;
        if (aiVar == null) {
            return -1.0f;
        }
        return aiVar.b();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public float getMinZoomLevel() {
        com.tencent.mapsdk.internal.ab abVar;
        if (this.H || (abVar = this.F) == null) {
            return 0.0f;
        }
        com.tencent.mapsdk.internal.ai aiVar = abVar.f48769b;
        if (aiVar == null) {
            return -1.0f;
        }
        return aiVar.c();
    }

    @Override // com.tencent.map.sdk.comps.mylocation.IMyLocation
    public android.location.Location getMyLocation() {
        if (this.H) {
            return null;
        }
        aw();
        com.tencent.mapsdk.internal.bf bfVar = this.f52516s;
        if (bfVar.f48892j == null) {
            return null;
        }
        return new android.location.Location(bfVar.f48892j);
    }

    @Override // com.tencent.map.sdk.comps.mylocation.IMyLocation
    public com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig getMyLocationConfig() {
        aw();
        return this.C;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public java.util.List<com.tencent.tencentmap.mapsdk.maps.model.Marker> getScreenMarkers() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.tencent.mapsdk.internal.an> it = ((com.tencent.mapsdk.internal.tr) this.f52512o.f48999b).ai().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.UiSettings getUiSettings() {
        if (this.H) {
            return null;
        }
        if (this.f52510J == null) {
            this.f52510J = new com.tencent.mapsdk.internal.ty(this.G);
        }
        return this.f52510J;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public java.lang.String getVersion() {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        return (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) ? "" : aiVar.o();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public com.tencent.tencentmap.mapsdk.maps.VisualSettings getVisualSettings() {
        com.tencent.mapsdk.internal.ne neVar;
        if (this.H || (neVar = this.f52512o) == null) {
            return null;
        }
        return neVar.f50514n;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public float getZoomToSpanLevel(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        if (this.H || (abVar = this.F) == null) {
            return 0.0f;
        }
        if (latLng == null || latLng2 == null || (aiVar = abVar.f48769b) == null) {
            return -1.0f;
        }
        return aiVar.a(latLng, latLng2);
    }

    @Override // com.tencent.mapsdk.internal.bl
    public final int h() {
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar == null) {
            return -1;
        }
        return neVar.K;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public boolean isBlockRouteEnabled() {
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public boolean isDestroyed() {
        return this.H;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public boolean isHandDrawMapEnable() {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return false;
        }
        return aiVar.w();
    }

    @Override // com.tencent.map.sdk.comps.mylocation.IMyLocation
    public boolean isMyLocationEnabled() {
        if (this.H) {
            return false;
        }
        aw();
        return this.C.isMyLocationEnabled();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public boolean isSateLiteEnable() {
        return getMapType() == 1011;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    public boolean isTrafficEnabled() {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return false;
        }
        return aiVar.h();
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void loadKMLFile(java.lang.String str) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.loadKMLFile(str);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return;
        }
        aiVar.a(str);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void moveCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdate cameraUpdate) {
        com.tencent.mapsdk.internal.ab abVar;
        super.moveCamera(cameraUpdate);
        if (this.H || (abVar = this.F) == null || abVar.b()) {
            return;
        }
        this.F.a(cameraUpdate);
    }

    public final void o() {
        this.f52512o.f50522v = true;
    }

    public final int p() {
        com.tencent.mapsdk.internal.tz tzVar = this.M;
        if (tzVar == null) {
            return 3;
        }
        com.tencent.tencentmap.mapsdk.maps.TencentMapOptions.MapUserSetting d17 = tzVar.d();
        int pendingMinScaleLevel = d17.getPendingMinScaleLevel() != -1 ? d17.getPendingMinScaleLevel() : d17.getMinScaleLevel();
        if (pendingMinScaleLevel != -1) {
            return pendingMinScaleLevel;
        }
        return 3;
    }

    public final int q() {
        com.tencent.mapsdk.internal.tz tzVar = this.M;
        if (tzVar == null) {
            return 20;
        }
        com.tencent.tencentmap.mapsdk.maps.TencentMapOptions.MapUserSetting d17 = tzVar.d();
        int pendingMaxScaleLevel = d17.getPendingMaxScaleLevel() != -1 ? d17.getPendingMaxScaleLevel() : d17.getMaxScaleLevel();
        return pendingMaxScaleLevel != -1 ? pendingMaxScaleLevel : this.M.C() ? 19 : 20;
    }

    public final com.tencent.map.lib.models.GeoPoint r() {
        return this.f52512o.f50508h.A.f52420m;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void removeOnMapLoadedCallback(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.removeOnMapLoadedCallback(onMapLoadedCallback);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return;
        }
        aiVar.b(onMapLoadedCallback);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void removeTencentMapGestureListener(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener tencentMapGestureListener) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.removeTencentMapGestureListener(tencentMapGestureListener);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return;
        }
        aiVar.b(tencentMapGestureListener);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.map.sdk.comps.indoor.IIndoor
    public void resetIndoorCellInfo() {
        com.tencent.mapsdk.internal.tk tkVar;
        super.resetIndoorCellInfo();
        if (this.H || this.F == null || (tkVar = this.f52512o.f50506f) == null) {
            return;
        }
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass104());
    }

    public final int s() {
        return this.f52512o.f50508h.A.f52409b.f52444m;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setBaseMapEnabled(boolean z17) {
        com.tencent.mapsdk.internal.ne neVar;
        super.setBaseMapEnabled(z17);
        if (this.H || (neVar = this.f52512o) == null) {
            return;
        }
        neVar.k(z17);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setBuilding3dEffectEnable(boolean z17) {
        com.tencent.mapsdk.internal.ne neVar;
        super.setBuilding3dEffectEnable(z17);
        if (this.H || (neVar = this.f52512o) == null) {
            return;
        }
        neVar.c(z17);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setBuildingBlackList(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds> list) {
        super.setBuildingBlackList(list);
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (tkVar != null) {
            tkVar.a(list);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setBuildingEnable(boolean z17) {
        super.setBuildingEnable(z17);
        setBuilding3dEffectEnable(z17);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setCameraCenterProportion(float f17, float f18) {
        super.setCameraCenterProportion(f17, f18);
        setCameraCenterProportion(f17, f18, true);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setCustomRender(com.tencent.tencentmap.mapsdk.maps.CustomRender customRender) {
        com.tencent.mapsdk.internal.ne neVar;
        super.setCustomRender(customRender);
        if (this.H || (neVar = this.f52512o) == null) {
            return;
        }
        neVar.F = customRender;
        neVar.f50522v = true;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setDrawPillarWith2DStyle(boolean z17) {
        com.tencent.mapsdk.internal.ne neVar;
        super.setDrawPillarWith2DStyle(z17);
        if (this.H || (neVar = this.f52512o) == null) {
            return;
        }
        neVar.c(!z17);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setForeignLanguage(com.tencent.tencentmap.mapsdk.maps.model.Language language) {
        com.tencent.mapsdk.internal.ab abVar;
        super.setForeignLanguage(language);
        if (this.H || (abVar = this.F) == null) {
            return;
        }
        abVar.a(language);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setHandDrawMapEnable(boolean z17) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.setHandDrawMapEnable(z17);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return;
        }
        aiVar.e(z17);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.map.sdk.comps.indoor.IIndoor
    public void setIndoorCellInfo(java.util.List<com.tencent.map.lib.models.IndoorCellInfo> list) {
        com.tencent.mapsdk.internal.tk tkVar;
        super.setIndoorCellInfo(list);
        if (this.H || this.F == null || (tkVar = this.f52512o.f50506f) == null) {
            return;
        }
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass103(list));
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.map.sdk.comps.indoor.IIndoor
    public void setIndoorEnabled(boolean z17) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.setIndoorEnabled(z17);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return;
        }
        aiVar.c(z17);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.map.sdk.comps.indoor.IIndoor
    public void setIndoorFloor(int i17) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.setIndoorFloor(i17);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return;
        }
        aiVar.c(i17);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.map.sdk.comps.indoor.IIndoor
    public void setIndoorMaskColor(int i17) {
        super.setIndoorMaskColor(i17);
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (0 != tkVar.f51661e) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass171(i17));
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setInfoWindowAdapter(com.tencent.tencentmap.mapsdk.maps.TencentMap.InfoWindowAdapter infoWindowAdapter) {
        com.tencent.mapsdk.internal.tz tzVar;
        super.setInfoWindowAdapter(infoWindowAdapter);
        if (this.H || (tzVar = this.M) == null) {
            return;
        }
        tzVar.f52280az = new java.lang.ref.WeakReference<>(infoWindowAdapter);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setLanguage(com.tencent.tencentmap.mapsdk.maps.model.Language language) {
        super.setLanguage(language);
        if (this.H || this.F == null || !"bmw".equals(com.tencent.mapsdk.internal.tf.f51581c)) {
            return;
        }
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar.f50525y == null) {
            neVar.f50525y = new com.tencent.mapsdk.internal.ne.c();
        }
        com.tencent.mapsdk.internal.ne.c cVar = neVar.f50525y;
        com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.ne.this.f50506f;
        if (tkVar != null) {
            int languageType = language.getLanguageType();
            if (tkVar.f51661e != 0) {
                tkVar.f51660d.nativeSetLanguage(tkVar.f51661e, languageType);
            }
            com.tencent.mapsdk.internal.ne.this.f50522v = true;
            com.tencent.mapsdk.internal.ne.this.f50522v = true;
            cVar.a(language);
        }
        this.F.a(language);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setLocationCompassHidden(boolean z17) {
        super.setLocationCompassHidden(z17);
        this.f52512o.f(z17);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setLocationNavigationGravityLineHidden(boolean z17) {
        super.setLocationNavigationGravityLineHidden(z17);
        this.f52512o.g(z17);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.map.sdk.comps.mylocation.IMyLocation
    public void setLocationSource(com.tencent.tencentmap.mapsdk.maps.LocationSource locationSource) {
        super.setLocationSource(locationSource);
        if (this.H) {
            return;
        }
        aw();
        com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig build = com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig.newBuilder(this.C).setLocationSource(locationSource).build();
        this.C = build;
        com.tencent.mapsdk.internal.bf bfVar = this.f52516s;
        com.tencent.tencentmap.mapsdk.maps.LocationSource locationSource2 = build.getLocationSource();
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50225z, "setLocationSource " + locationSource2 + " enable " + bfVar.f48885c);
        if (locationSource2 != null) {
            com.tencent.tencentmap.mapsdk.maps.LocationSource locationSource3 = bfVar.f48884b;
            if (locationSource3 != null) {
                locationSource3.deactivate();
            }
            bfVar.f48884b = locationSource2;
            locationSource2.activate(bfVar.f48899q);
            com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.LocationRegionChangedListener regionChangedListener = com.tencent.map.tools.net.NetManager.getInstance().getRegionChangedListener();
            if (regionChangedListener != null) {
                bfVar.f48890h.add(new java.lang.ref.WeakReference<>(regionChangedListener));
            }
            if (com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.getInstance().hasLocationSource()) {
                bfVar.f48886d = true;
                bfVar.f48900r.postDelayed(new com.tencent.mapsdk.internal.bf.AnonymousClass2(), 1000L);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMapCenterAndScale(float f17, float f18, float f19) {
        com.tencent.mapsdk.internal.bg bgVar;
        com.tencent.mapsdk.internal.tr trVar;
        com.tencent.mapsdk.internal.ne neVar;
        super.setMapCenterAndScale(f17, f18, f19);
        if (this.H || (bgVar = this.f52514q) == null || (neVar = (trVar = bgVar.f48905b).f52273as) == null) {
            return;
        }
        float f27 = neVar.f50508h.A.f52409b.f52443l;
        float c17 = com.tencent.mapsdk.internal.tz.c(f19);
        boolean z17 = ((double) java.lang.Math.abs(f27 - c17)) > 1.0E-4d;
        trVar.f52275au = 0;
        com.tencent.mapsdk.internal.ko.a(new com.tencent.mapsdk.internal.tz.AnonymousClass1((f18 - trVar.f52274at) / 10.0f, f17, f18, f19, z17, c17));
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMapFontSize(com.tencent.tencentmap.mapsdk.maps.model.MapFontSize mapFontSize) {
        if (this.H || this.F == null || mapFontSize == null) {
            return;
        }
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        int value = mapFontSize.getValue();
        com.tencent.mapsdk.internal.tk tkVar = neVar.f50506f;
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass65(value));
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMapFrameRate(float f17) {
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bu> weakReference;
        com.tencent.mapsdk.internal.bu buVar;
        super.setMapFrameRate(f17);
        com.tencent.mapsdk.internal.tz tzVar = this.M;
        if (tzVar == null || (weakReference = tzVar.f49015c) == null || (buVar = weakReference.get()) == null) {
            return;
        }
        buVar.a(f17);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMapStyle(int i17) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.setMapStyle(i17);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return;
        }
        aiVar.a(i17);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMapType(int i17) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.setMapType(i17);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return;
        }
        aiVar.f(i17);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMaxZoomLevel(int i17) {
        super.setMaxZoomLevel(i17);
        if (this.H || this.F == null || i17 < getMinZoomLevel()) {
            return;
        }
        int k17 = k(i17);
        int i18 = this.M.f52273as.f50520t.f52409b.f52444m;
        if (i18 > k17) {
            this.F.a(i18);
            this.M.d().setPendingMaxScaleLevel(k17);
        } else {
            this.F.a(k17);
            this.M.d().setMaxZoomLevel(k17);
            this.M.d().setPendingMaxScaleLevel(k17);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setMinZoomLevel(int i17) {
        super.setMinZoomLevel(i17);
        if (this.H || this.F == null || i17 > getMaxZoomLevel()) {
            return;
        }
        int k17 = k(i17);
        int i18 = this.M.f52273as.f50520t.f52409b.f52444m;
        if (i18 < k17) {
            this.F.b(i18);
            this.M.d().setPendingMinScaleLevel(k17);
        } else {
            this.F.b(k17);
            this.M.d().setMinZoomLevel(k17);
            this.M.d().setPendingMinScaleLevel(k17);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.map.sdk.comps.mylocation.IMyLocation
    public void setMyLocationClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationClickListener onMyLocationClickListener) {
        super.setMyLocationClickListener(onMyLocationClickListener);
        if (this.H) {
            return;
        }
        aw();
        com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig build = com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig.newBuilder(this.C).setMyLocationClickListener(onMyLocationClickListener).build();
        this.C = build;
        com.tencent.mapsdk.internal.bf bfVar = this.f52516s;
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationClickListener myLocationClickListener = build.getMyLocationClickListener();
        if (myLocationClickListener != null) {
            bfVar.f48889g = new java.lang.ref.WeakReference<>(myLocationClickListener);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.map.sdk.comps.mylocation.IMyLocation
    public void setMyLocationConfig(com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig myLocationConfig) {
        aw();
        if (myLocationConfig != null) {
            this.C = com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig.newBuilder(myLocationConfig).build();
        }
        setMyLocationEnabled(this.C.isMyLocationEnabled());
        com.tencent.tencentmap.mapsdk.maps.LocationSource locationSource = this.f52516s.f48884b;
        if (locationSource == null || locationSource != this.C.getLocationSource()) {
            setLocationSource(this.C.getLocationSource());
        }
        setMyLocationStyle(this.C.getMyLocationStyle());
        setMyLocationClickListener(this.C.getMyLocationClickListener());
        setOnMyLocationChangeListener(this.C.getMyLocationChangeListener());
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.map.sdk.comps.mylocation.IMyLocation
    public void setMyLocationEnabled(boolean z17) {
        super.setMyLocationEnabled(z17);
        if (this.H) {
            return;
        }
        aw();
        if (!z17) {
            this.f52516s.a();
            this.C = com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig.newBuilder(this.C).setMyLocationEnabled(false).build();
            return;
        }
        if (this.f52516s.f48885c) {
            return;
        }
        this.C = com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig.newBuilder(this.C).setMyLocationEnabled(true).build();
        com.tencent.mapsdk.internal.bf bfVar = this.f52516s;
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50225z, "enableMyLocation : " + bfVar.f48885c);
        if (bfVar.f48885c) {
            return;
        }
        bfVar.f48885c = true;
        bfVar.f48895m.e(false);
        bfVar.f48895m.f(false);
        bfVar.f48895m.g(false);
        com.tencent.tencentmap.mapsdk.maps.model.Circle circle = bfVar.f48887e;
        if (circle != null) {
            circle.setVisible(true);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap, com.tencent.map.sdk.comps.mylocation.IMyLocation
    public void setMyLocationStyle(com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle myLocationStyle) {
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor compassImage;
        android.graphics.Bitmap bitmap;
        super.setMyLocationStyle(myLocationStyle);
        aw();
        com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig build = com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig.newBuilder(this.C).setMyLocationStyle(myLocationStyle).build();
        this.C = build;
        com.tencent.mapsdk.internal.bf bfVar = this.f52516s;
        com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle myLocationStyle2 = build.getMyLocationStyle();
        if (myLocationStyle2 != null) {
            bfVar.f48891i = myLocationStyle2;
            com.tencent.tencentmap.mapsdk.maps.model.Circle circle = bfVar.f48887e;
            if (circle != null) {
                circle.setFillColor(myLocationStyle2.getFillColor());
                bfVar.f48887e.setStrokeColor(myLocationStyle2.getStrokeColor());
                bfVar.f48887e.setStrokeWidth(myLocationStyle2.getStrokeWidth());
                int circleLevel = myLocationStyle2.getCircleLevel();
                if (circleLevel != -1) {
                    bfVar.f48887e.setLevel(circleLevel);
                }
                bfVar.f48887e.setZIndex(myLocationStyle2.getCircleZIndex());
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50225z, "mMyLocationId: " + bfVar.f48896n + ", mIcon " + bfVar.f48893k + ", enableShowMyLocation: " + bfVar.f48885c);
            if (!bfVar.f48885c || bfVar.f48893k == null) {
                return;
            }
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor myLocationIcon = myLocationStyle2.getMyLocationIcon();
            if (myLocationIcon == null) {
                myLocationIcon = bfVar.b();
            }
            android.graphics.Bitmap bitmap2 = myLocationIcon.getBitmap(bfVar.f48895m.getContext());
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                java.lang.String bitmapId = myLocationIcon.getFormater().getBitmapId();
                if (!bfVar.f48893k.getFormater().getBitmapId().equals(bitmapId)) {
                    bfVar.f48893k = myLocationStyle2.getMyLocationIcon() == null ? bfVar.b() : myLocationStyle2.getMyLocationIcon();
                    bfVar.f48896n = bfVar.f48895m.a(bitmapId, myLocationStyle2.getAnchorU(), myLocationStyle2.getAnchorV());
                }
            }
            int myLocationLevel = myLocationStyle2.getMyLocationLevel();
            if (myLocationLevel != -1) {
                bfVar.f48895m.b(myLocationLevel);
            }
            bfVar.f48895m.c(myLocationStyle2.getMyLocationZIndex());
            com.tencent.tencentmap.mapsdk.maps.model.LocationCompass locationCompass = myLocationStyle2.getLocationCompass();
            if (locationCompass != null && locationCompass.getCompassImage() != null && (bitmap = (compassImage = locationCompass.getCompassImage()).getBitmap(bfVar.f48895m.getContext())) != null && !bitmap.isRecycled()) {
                java.lang.String bitmapId2 = compassImage.getFormater().getBitmapId();
                com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor = bfVar.f48894l;
                if (!(bitmapDescriptor != null ? bitmapDescriptor.getFormater().getBitmapId() : "").equals(bitmapId2)) {
                    bfVar.f48894l = compassImage;
                    bfVar.f48895m.c(bitmapId2);
                }
                com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor[] compassGroupImages = locationCompass.getCompassGroupImages();
                if (compassGroupImages != null && compassGroupImages.length == 4) {
                    java.lang.String[] strArr = new java.lang.String[compassGroupImages.length];
                    for (int i17 = 0; i17 < compassGroupImages.length; i17++) {
                        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor2 = compassGroupImages[i17];
                        if (bitmapDescriptor2 != null) {
                            bitmapDescriptor2.getBitmap(bfVar.f48895m.getContext());
                            strArr[i17] = compassGroupImages[i17].getFormater().getBitmapId();
                        } else {
                            strArr[i17] = "";
                        }
                    }
                    bfVar.f48895m.a(bitmapId2, strArr[0], strArr[1], strArr[2], strArr[3]);
                }
            }
            com.tencent.tencentmap.mapsdk.maps.model.LocationNavigationGravityline locationNavigationGravityline = myLocationStyle2.getLocationNavigationGravityline();
            if (locationNavigationGravityline != null) {
                bfVar.f48895m.a(locationNavigationGravityline.getWidth(), locationNavigationGravityline.getColor(), locationNavigationGravityline.getDestination());
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnCameraChangeListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener onCameraChangeListener) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.setOnCameraChangeListener(onCameraChangeListener);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return;
        }
        aiVar.a(onCameraChangeListener);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnCompassClickedListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCompassClickedListener onCompassClickedListener) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.setOnCompassClickedListener(onCompassClickedListener);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return;
        }
        aiVar.a(onCompassClickedListener);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.map.sdk.comps.indoor.IIndoor
    public void setOnIndoorStateChangeListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.setOnIndoorStateChangeListener(onIndoorStateChangeListener);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return;
        }
        aiVar.a(onIndoorStateChangeListener);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnInfoWindowClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        com.tencent.mapsdk.internal.tz tzVar;
        super.setOnInfoWindowClickListener(onInfoWindowClickListener);
        if (this.H || (tzVar = this.M) == null) {
            return;
        }
        tzVar.a(onInfoWindowClickListener);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMapClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapClickListener onMapClickListener) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.setOnMapClickListener(onMapClickListener);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return;
        }
        aiVar.a(onMapClickListener);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMapFrameFinished(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapFrameFinishCallback onMapFrameFinishCallback) {
        com.tencent.mapsdk.internal.tz tzVar;
        super.setOnMapFrameFinished(onMapFrameFinishCallback);
        if (this.H || (tzVar = this.M) == null) {
            return;
        }
        tzVar.a(onMapFrameFinishCallback);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMapLongClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLongClickListener onMapLongClickListener) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.setOnMapLongClickListener(onMapLongClickListener);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return;
        }
        aiVar.a(onMapLongClickListener);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMapPoiClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapPoiClickListener onMapPoiClickListener) {
        super.setOnMapPoiClickListener(onMapPoiClickListener);
        if (this.H || this.F == null) {
            return;
        }
        com.tencent.mapsdk.internal.py pyVar = this.f52517t;
        if (pyVar != null) {
            pyVar.f50843c = onMapPoiClickListener;
        }
        this.M.a(onMapPoiClickListener);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMarkerClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerClickListener onMarkerClickListener) {
        com.tencent.mapsdk.internal.tz tzVar;
        super.setOnMarkerClickListener(onMarkerClickListener);
        if (this.H || (tzVar = this.M) == null) {
            return;
        }
        tzVar.a(onMarkerClickListener);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMarkerCollisionStatusListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerCollisionStatusListener onMarkerCollisionStatusListener) {
        com.tencent.mapsdk.internal.tz tzVar;
        super.setOnMarkerCollisionStatusListener(onMarkerCollisionStatusListener);
        if (this.H || (tzVar = this.M) == null) {
            return;
        }
        tzVar.a(onMarkerCollisionStatusListener);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnMarkerDragListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerDragListener onMarkerDragListener) {
        com.tencent.mapsdk.internal.tz tzVar;
        super.setOnMarkerDragListener(onMarkerDragListener);
        if (this.H || (tzVar = this.M) == null) {
            return;
        }
        tzVar.a(onMarkerDragListener);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.map.sdk.comps.mylocation.IMyLocation
    public void setOnMyLocationChangeListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationChangeListener onMyLocationChangeListener) {
        super.setOnMyLocationChangeListener(onMyLocationChangeListener);
        if (this.H) {
            return;
        }
        aw();
        com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig build = com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig.newBuilder(this.C).setMyLocationChangeListener(onMyLocationChangeListener).build();
        this.C = build;
        com.tencent.mapsdk.internal.bf bfVar = this.f52516s;
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationChangeListener myLocationChangeListener = build.getMyLocationChangeListener();
        if (myLocationChangeListener != null) {
            bfVar.f48888f = new java.lang.ref.WeakReference<>(myLocationChangeListener);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnPolygonClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolygonClickListener onPolygonClickListener) {
        com.tencent.mapsdk.internal.tz tzVar;
        super.setOnPolygonClickListener(onPolygonClickListener);
        if (this.H || (tzVar = this.M) == null) {
            return;
        }
        tzVar.a(onPolygonClickListener);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnPolylineClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolylineClickListener onPolylineClickListener) {
        com.tencent.mapsdk.internal.tz tzVar;
        super.setOnPolylineClickListener(onPolylineClickListener);
        if (this.H || (tzVar = this.M) == null) {
            return;
        }
        tzVar.a(onPolylineClickListener);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnScaleViewChangedListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnScaleViewChangedListener onScaleViewChangedListener) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.setOnScaleViewChangedListener(onScaleViewChangedListener);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return;
        }
        aiVar.a(onScaleViewChangedListener);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnTapMapViewInfoWindowHidden(boolean z17) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.setOnTapMapViewInfoWindowHidden(z17);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return;
        }
        aiVar.g(z17);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnTrafficEventClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnTrafficEventClickListener onTrafficEventClickListener) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.setOnTrafficEventClickListener(onTrafficEventClickListener);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return;
        }
        aiVar.a(onTrafficEventClickListener);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOnVectorOverlayClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnVectorOverlayClickListener onVectorOverlayClickListener) {
        com.tencent.mapsdk.internal.tz tzVar;
        super.setOnVectorOverlayClickListener(onVectorOverlayClickListener);
        if (this.H || (tzVar = this.M) == null) {
            return;
        }
        tzVar.f52273as.L = onVectorOverlayClickListener;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOverSeaEnable(boolean z17) {
        super.setOverSeaEnable(z17);
        com.tencent.mapsdk.internal.tz tzVar = this.M;
        if (tzVar != null) {
            tzVar.m(z17);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setOverSeaTileProvider(com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider overSeaTileProvider) {
        com.tencent.mapsdk.internal.ne neVar;
        com.tencent.mapsdk.internal.az azVar;
        super.setOverSeaTileProvider(overSeaTileProvider);
        if (this.H || (neVar = this.f52512o) == null || (azVar = neVar.f50512l) == null) {
            return;
        }
        azVar.a(overSeaTileProvider);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setPadding(int i17, int i18, int i19, int i27) {
        super.setPadding(i17, i18, i19, i27);
        com.tencent.mapsdk.internal.bg bgVar = this.f52514q;
        if (bgVar != null) {
            bgVar.a(i17, i18, i19, i27, false);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setPointToCenter(int i17, int i18) {
        com.tencent.mapsdk.internal.ey projection;
        super.setPointToCenter(i17, i18);
        if (this.H || this.F == null || (projection = getProjection()) == null) {
            return;
        }
        this.F.a(com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.newLatLng(projection.fromScreenLocation(new android.graphics.Point(i17, i18))));
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setPoisEnabled(boolean z17) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.setPoisEnabled(z17);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return;
        }
        aiVar.i(z17);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setRestrictBounds(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds, com.tencent.tencentmap.mapsdk.maps.model.RestrictBoundsFitMode restrictBoundsFitMode) {
        com.tencent.mapsdk.internal.ab abVar;
        super.setRestrictBounds(latLngBounds, restrictBoundsFitMode);
        if (this.H || (abVar = this.F) == null) {
            return;
        }
        int ordinal = restrictBoundsFitMode == null ? 0 : restrictBoundsFitMode.ordinal();
        com.tencent.mapsdk.internal.ai aiVar = abVar.f48769b;
        if (aiVar != null) {
            aiVar.a(latLngBounds, ordinal);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setSatelliteEnabled(boolean z17) {
        super.setSatelliteEnabled(z17);
        if (z17) {
            setMapType(1011);
        } else {
            setMapType(1000);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setSceneByTag(java.lang.String str) {
        com.tencent.mapsdk.internal.ne neVar;
        com.tencent.mapsdk.internal.hg hgVar;
        super.setSceneByTag(str);
        if (this.H || (neVar = this.f52512o) == null || (hgVar = neVar.f49000c) == null) {
            return;
        }
        hgVar.f49744a = str;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setTencentMapGestureListener(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener tencentMapGestureListener) {
        super.setTencentMapGestureListener(tencentMapGestureListener);
        addTencentMapGestureListener(tencentMapGestureListener);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setTrafficEnabled(boolean z17) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.setTrafficEnabled(z17);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return;
        }
        aiVar.a(z17);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setTrafficMode(int i17, int i18) {
        super.setTrafficMode(i17, i18);
        if (this.H || this.F == null) {
            return;
        }
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        tkVar.b(new com.tencent.mapsdk.internal.tk.AnonymousClass2(i17, i18));
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void showBuilding(boolean z17) {
        super.showBuilding(z17);
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (tkVar != null) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass45(z17));
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void snapshot(com.tencent.tencentmap.mapsdk.maps.TencentMap.SnapshotReadyCallback snapshotReadyCallback, android.graphics.Bitmap.Config config, int i17) {
        com.tencent.mapsdk.internal.ai aiVar;
        super.snapshot(snapshotReadyCallback, config, i17);
        com.tencent.mapsdk.internal.ab abVar = this.F;
        if (abVar == null || (aiVar = abVar.f48769b) == null || snapshotReadyCallback == null) {
            return;
        }
        abVar.f48770c = snapshotReadyCallback;
        android.os.Handler handler = abVar.f48771d;
        if (aiVar != null) {
            aiVar.a(handler, config, i17);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void stopAnimation() {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.stopAnimation();
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return;
        }
        aiVar.d();
    }

    public final float t() {
        return this.f52512o.f50508h.A.f52409b.f52443l;
    }

    public final void u() {
        com.tencent.mapsdk.internal.w wVar = this.f52512o.f50518r;
        if (wVar == null) {
            return;
        }
        wVar.c();
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void updateVectorOverlay(com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay vectorOverlay, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider vectorOverlayProvider) {
        com.tencent.mapsdk.internal.ne neVar;
        super.updateVectorOverlay(vectorOverlay, vectorOverlayProvider);
        if (this.H || (neVar = this.f52512o) == null) {
            return;
        }
        if (neVar.f50506f != null) {
            if (vectorOverlayProvider instanceof com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider) {
                com.tencent.mapsdk.internal.nk nkVar = (com.tencent.mapsdk.internal.nk) neVar.f50510j.a(com.tencent.mapsdk.internal.nk.class, ((com.tencent.mapsdk.internal.nk) vectorOverlay).b());
                if (nkVar != null) {
                    nkVar.a((com.tencent.mapsdk.internal.nk) new com.tencent.mapsdk.internal.nl((com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider) vectorOverlayProvider));
                } else {
                    neVar.a(vectorOverlayProvider);
                }
            } else if (vectorOverlayProvider instanceof com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider) {
                com.tencent.mapsdk.internal.nw nwVar = (com.tencent.mapsdk.internal.nw) neVar.f50510j.a(com.tencent.mapsdk.internal.nw.class, ((com.tencent.mapsdk.internal.nw) vectorOverlay).b());
                if (nwVar != null) {
                    nwVar.a((com.tencent.mapsdk.internal.nw) new com.tencent.mapsdk.internal.ny((com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider) vectorOverlayProvider));
                } else {
                    neVar.a(vectorOverlayProvider);
                }
            } else if (vectorOverlayProvider instanceof com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider) {
                com.tencent.mapsdk.internal.nn nnVar = (com.tencent.mapsdk.internal.nn) neVar.f50510j.a(com.tencent.mapsdk.internal.nn.class, ((com.tencent.mapsdk.internal.nn) vectorOverlay).b());
                if (nnVar != null) {
                    nnVar.a((com.tencent.mapsdk.internal.nn) new com.tencent.mapsdk.internal.np((com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider) vectorOverlayProvider));
                } else {
                    neVar.a(vectorOverlayProvider);
                }
            } else if (vectorOverlayProvider instanceof com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider) {
                com.tencent.mapsdk.internal.of ofVar = (com.tencent.mapsdk.internal.of) neVar.f50510j.a(com.tencent.mapsdk.internal.of.class, ((com.tencent.mapsdk.internal.of) vectorOverlay).b());
                if (ofVar != null) {
                    ofVar.a((com.tencent.mapsdk.internal.of) new com.tencent.mapsdk.internal.oh(neVar.f50506f.A(), (com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider) vectorOverlayProvider));
                } else {
                    neVar.a(vectorOverlayProvider);
                }
            } else if (vectorOverlayProvider instanceof com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider) {
                com.tencent.mapsdk.internal.of ofVar2 = (com.tencent.mapsdk.internal.of) neVar.f50510j.a(com.tencent.mapsdk.internal.of.class, ((com.tencent.mapsdk.internal.of) vectorOverlay).b());
                if (ofVar2 != null) {
                    ofVar2.a((com.tencent.mapsdk.internal.of) new com.tencent.mapsdk.internal.oh(neVar.f50506f.A(), (com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider) vectorOverlayProvider));
                } else {
                    neVar.a(vectorOverlayProvider);
                }
            } else if (vectorOverlayProvider instanceof com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider) {
                com.tencent.mapsdk.internal.oi oiVar = (com.tencent.mapsdk.internal.oi) neVar.f50510j.a(com.tencent.mapsdk.internal.oi.class, ((com.tencent.mapsdk.internal.oi) vectorOverlay).b());
                if (oiVar != null) {
                    oiVar.a((com.tencent.mapsdk.internal.oi) new com.tencent.mapsdk.internal.ok((com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider) vectorOverlayProvider));
                } else {
                    neVar.a(vectorOverlayProvider);
                }
            } else if (vectorOverlayProvider instanceof com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider) {
                com.tencent.mapsdk.internal.ns nsVar = (com.tencent.mapsdk.internal.ns) neVar.f50510j.a(com.tencent.mapsdk.internal.ns.class, ((com.tencent.mapsdk.internal.ns) vectorOverlay).b());
                if (nsVar != null) {
                    nsVar.a((com.tencent.mapsdk.internal.ns) new com.tencent.mapsdk.internal.nr((com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider) vectorOverlayProvider));
                } else {
                    neVar.a(vectorOverlayProvider);
                }
            }
        }
        o();
    }

    public final float v() {
        return this.f52512o.f50508h.h();
    }

    public final float w() {
        return this.f52512o.f50508h.i();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final com.tencent.mapsdk.internal.ey getProjection() {
        com.tencent.mapsdk.internal.ne neVar;
        return (this.H || (neVar = this.f52512o) == null) ? new com.tencent.mapsdk.internal.x() : neVar.f50513m;
    }

    public final void y() {
        this.f52512o.f50508h.f48818o.e();
    }

    public final java.lang.String z() {
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar != null) {
            return neVar.H();
        }
        return null;
    }

    private static boolean b(com.tencent.map.lib.models.GeoPoint geoPoint) {
        return com.tencent.mapsdk.internal.eq.f49377a.contains(geoPoint.getLongitudeE6(), geoPoint.getLatitudeE6());
    }

    private java.lang.String c(com.tencent.map.lib.models.GeoPoint geoPoint) {
        return this.f52512o.a(geoPoint);
    }

    private synchronized void e(com.tencent.mapsdk.internal.ez ezVar) {
        this.f52512o.f50510j.a(ezVar);
        this.f52512o.f50522v = true;
    }

    private void k(boolean z17) {
        com.tencent.mapsdk.internal.ad adVar;
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar == null || (adVar = neVar.f50508h) == null) {
            return;
        }
        adVar.L = z17;
    }

    @Override // com.tencent.mapsdk.internal.bl
    public final void a(android.os.Bundle bundle) {
        com.tencent.mapsdk.internal.ne neVar;
        com.tencent.mapsdk.internal.hg hgVar;
        com.tencent.mapsdk.internal.sj sjVar;
        super.a(bundle);
        com.tencent.mapsdk.internal.sm.a().a(this.f52512o.getContext());
        com.tencent.mapsdk.internal.bj.a().a(this.f52512o.O());
        com.tencent.mapsdk.internal.bg bgVar = new com.tencent.mapsdk.internal.bg(this.f52512o, this.M.getMapRenderView(), this.f52512o.f48998a);
        this.f52514q = bgVar;
        this.D = new com.tencent.mapsdk.internal.af(bgVar);
        this.F = new com.tencent.mapsdk.internal.ab(this.f52514q);
        this.L = new com.tencent.tencentmap.mapsdk.maps.internal.TencentMapPro(this.f52514q, this.D);
        this.f52517t = new com.tencent.mapsdk.internal.py(this.f52512o);
        this.G = new com.tencent.mapsdk.internal.ae(this.f52514q.f48907d);
        com.tencent.mapsdk.internal.bk.a aVar = new com.tencent.mapsdk.internal.bk.a() { // from class: com.tencent.mapsdk.vector.VectorMap.1
            @Override // com.tencent.mapsdk.internal.bk.a
            public final void a() {
                com.tencent.mapsdk.vector.VectorMap.this.aw();
                if (com.tencent.mapsdk.vector.VectorMap.this.C.isMyLocationEnabled()) {
                    com.tencent.mapsdk.vector.VectorMap.this.setMyLocationEnabled(true);
                }
                android.location.Location myLocation = com.tencent.mapsdk.vector.VectorMap.this.getMyLocation();
                if (myLocation != null) {
                    com.tencent.mapsdk.vector.VectorMap.this.animateCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory.newLatLng(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(myLocation.getLatitude(), myLocation.getLongitude())));
                }
            }
        };
        com.tencent.mapsdk.internal.bk bkVar = this.f52514q.f48907d;
        com.tencent.mapsdk.internal.sl slVar = bkVar.f48978c;
        if (slVar != null) {
            slVar.f51455d = aVar;
        }
        com.tencent.mapsdk.internal.ne neVar2 = this.f52512o;
        com.tencent.mapsdk.internal.bi biVar = neVar2.f50510j;
        com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions = neVar2.f48998a;
        if (tencentMapOptions != null && tencentMapOptions.getExtSurface() != null && (sjVar = bkVar.f48979d) != null) {
            java.util.List<com.tencent.mapsdk.internal.sj.c> list = sjVar.f51417r;
            if (list != null && biVar != null) {
                list.add(biVar);
            }
            int extSurfaceWidth = tencentMapOptions.getExtSurfaceWidth();
            int extSurfaceHeight = tencentMapOptions.getExtSurfaceHeight();
            android.view.ViewGroup ac6 = bkVar.f48977b.ac();
            if (ac6 != null) {
                ac6.measure(android.view.View.MeasureSpec.makeMeasureSpec(extSurfaceWidth, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(extSurfaceHeight, 1073741824));
            }
            bkVar.b(extSurfaceWidth, extSurfaceHeight);
        }
        if (com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.getInstance().hasLocationSource()) {
            setLocationSource(com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.getInstance().getLocationSource());
            com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.getInstance().requestLatestLocation();
        }
        com.tencent.mapsdk.internal.qa qaVar = new com.tencent.mapsdk.internal.qa(this.f52514q);
        this.f52515r = qaVar;
        com.tencent.mapsdk.internal.ne neVar3 = this.f52512o;
        qaVar.f50855a.a((com.tencent.mapsdk.internal.qa.a) neVar3.f50510j, neVar3.f48998a);
        java.util.Iterator<com.tencent.mapsdk.internal.qa.b> it = this.f52518u.keySet().iterator();
        while (it.hasNext()) {
            this.f52515r.a(it.next());
        }
        this.f52518u.clear();
        com.tencent.mapsdk.internal.qa qaVar2 = this.f52515r;
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.Y, qaVar2.b());
        java.util.Iterator<android.os.AsyncTask> it6 = qaVar2.f50856b.iterator();
        while (it6.hasNext()) {
            it6.next().execute(new java.lang.Object[0]);
        }
        com.tencent.mapsdk.internal.tr trVar = qaVar2.f50857d;
        if (trVar != null && (neVar = trVar.f52273as) != null && (hgVar = neVar.f49000c) != null) {
            hgVar.s().a();
        }
        addOnMapLoadedCallback(this.f52512o.f48998a.getOnMapLoadedCallback());
        this.K = true;
    }

    private void c(boolean z17) {
        if (z17) {
            com.tencent.mapsdk.internal.ne neVar = this.f52512o;
            com.tencent.mapsdk.internal.tk tkVar = neVar.f50506f;
            if (tkVar != null) {
                tkVar.l();
                neVar.f50516p = true;
                return;
            }
            return;
        }
        com.tencent.mapsdk.internal.ne neVar2 = this.f52512o;
        com.tencent.mapsdk.internal.tk tkVar2 = neVar2.f50506f;
        if (tkVar2 != null) {
            tkVar2.m();
            neVar2.f50516p = false;
        }
    }

    private synchronized void d(com.tencent.mapsdk.internal.ez ezVar) {
        this.f52512o.f50510j.a(ezVar);
        this.f52512o.f50522v = true;
    }

    private void h(int i17) {
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        adVar.a(i17, (java.lang.Runnable) new com.tencent.mapsdk.internal.ad.AnonymousClass4());
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setCameraCenterProportion(float f17, float f18, boolean z17) {
        com.tencent.mapsdk.internal.ab abVar;
        com.tencent.mapsdk.internal.ai aiVar;
        super.setCameraCenterProportion(f17, f18, z17);
        if (this.H || (abVar = this.F) == null || (aiVar = abVar.f48769b) == null) {
            return;
        }
        aiVar.a(f17, f18, z17);
    }

    private void b(int i17) {
        this.f52512o.f50508h.a(i17);
    }

    private java.lang.String g(com.tencent.map.lib.models.GeoPoint geoPoint) {
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (tkVar != null) {
            return (java.lang.String) tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass170(geoPoint), (com.tencent.mapsdk.internal.tk.AnonymousClass170) null);
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void animateCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdate cameraUpdate, com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback cancelableCallback) {
        com.tencent.mapsdk.internal.ab abVar;
        super.animateCamera(cameraUpdate, cancelableCallback);
        if (this.H || (abVar = this.F) == null || abVar.b()) {
            return;
        }
        this.F.a(cameraUpdate, 500L, cancelableCallback);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void setPadding(int i17, int i18, int i19, int i27, boolean z17) {
        super.setPadding(i17, i18, i19, i27, z17);
        com.tencent.mapsdk.internal.bg bgVar = this.f52514q;
        if (bgVar != null) {
            bgVar.a(i17, i18, i19, i27, z17);
        }
    }

    private void i(int i17, int i18) {
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (tkVar != null) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass29(i17, i18));
        }
    }

    private void l(boolean z17) {
        com.tencent.mapsdk.internal.ad adVar;
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar == null || (adVar = neVar.f50508h) == null) {
            return;
        }
        adVar.M = z17;
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.map.sdk.comps.indoor.IIndoor
    public void setIndoorFloor(java.lang.String str, java.lang.String str2) {
        com.tencent.mapsdk.internal.ab abVar;
        super.setIndoorFloor(str, str2);
        if (this.H || (abVar = this.F) == null || android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        abVar.f48769b.a(str, str2);
    }

    private void f(int i17) {
        this.f52512o.a(i17);
    }

    private void b(float f17, float f18) {
        this.f52512o.f50508h.b(f17, f18, true);
    }

    private void f(com.tencent.map.lib.models.GeoPoint geoPoint) {
        a(geoPoint, s());
    }

    private void g(boolean z17) {
        this.f52512o.f50506f.g(z17);
    }

    private com.tencent.mapsdk.internal.qr h(com.tencent.map.lib.models.GeoPoint geoPoint) {
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (geoPoint == null) {
            geoPoint = new com.tencent.map.lib.models.GeoPoint();
        }
        return (com.tencent.mapsdk.internal.qr) tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass167(geoPoint), (com.tencent.mapsdk.internal.tk.AnonymousClass167) null);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void animateCamera(com.tencent.tencentmap.mapsdk.maps.CameraUpdate cameraUpdate, long j17, com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback cancelableCallback) {
        com.tencent.mapsdk.internal.ab abVar;
        super.animateCamera(cameraUpdate, j17, cancelableCallback);
        if (this.H || (abVar = this.F) == null || abVar.b()) {
            return;
        }
        this.F.a(cameraUpdate, j17, cancelableCallback);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void snapshot(com.tencent.tencentmap.mapsdk.maps.TencentMap.SnapshotReadyCallback snapshotReadyCallback, android.graphics.Bitmap.Config config) {
        super.snapshot(snapshotReadyCallback, config);
        snapshot(snapshotReadyCallback, config, 0);
    }

    private void e(int i17, int i18) {
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (tkVar != null) {
            if (i18 < 0) {
                i18 = 0;
            }
            if (i18 > 255) {
                i18 = 255;
            }
            int i19 = 255 - i18;
            if (i19 == 0) {
                i19 = 1;
            }
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass112(i17, i19));
        }
    }

    private void f(int i17, int i18) {
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar != null) {
            neVar.E = i17;
            neVar.D = i18;
        }
    }

    private void i(boolean z17) {
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        adVar.G = z17;
        adVar.f48829z.i().b(adVar.G);
    }

    private void d(com.tencent.map.lib.models.GeoPoint geoPoint) {
        this.f52512o.f50508h.a(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6(), 1);
    }

    @Override // com.tencent.mapsdk.internal.bl, com.tencent.tencentmap.mapsdk.maps.TencentMap
    public void snapshot(com.tencent.tencentmap.mapsdk.maps.TencentMap.SnapshotReadyCallback snapshotReadyCallback) {
        super.snapshot(snapshotReadyCallback);
        snapshot(snapshotReadyCallback, android.graphics.Bitmap.Config.ARGB_8888);
    }

    private void b(com.tencent.mapsdk.internal.ez ezVar) {
        this.f52512o.f50510j.a(ezVar);
        this.f52512o.f50522v = true;
    }

    @java.lang.Deprecated
    private void g(int i17, int i18) {
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (tkVar != null) {
            tkVar.b(i17, i18);
        }
    }

    private void c(com.tencent.mapsdk.internal.ez ezVar) {
        this.f52512o.f50510j.a(ezVar);
        this.f52512o.f50522v = true;
    }

    private void e(boolean z17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (0 != tkVar.f51661e) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass180(z17));
        }
    }

    private void f(boolean z17) {
        this.f52512o.e(z17);
    }

    private void h(boolean z17) {
        this.f52512o.H.f51153f.j(z17);
    }

    private int f(java.lang.String str) {
        com.tencent.mapsdk.internal.tk tkVar;
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar == null || (tkVar = neVar.f50506f) == null) {
            return -1;
        }
        return ((java.lang.Integer) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass50>) new com.tencent.mapsdk.internal.tk.AnonymousClass50(str), (com.tencent.mapsdk.internal.tk.AnonymousClass50) (-1))).intValue();
    }

    private boolean i(com.tencent.map.lib.models.GeoPoint geoPoint) {
        boolean z17;
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        if (geoPoint == null) {
            return true;
        }
        android.graphics.Rect r17 = adVar.r();
        boolean contains = r17 != null ? r17.contains(geoPoint.getLongitudeE6(), geoPoint.getLatitudeE6()) : false;
        com.tencent.mapsdk.internal.fu a17 = adVar.B.a(adVar.A.f52420m);
        com.tencent.mapsdk.internal.fu a18 = adVar.B.a(geoPoint);
        if (adVar.C != null) {
            double abs = java.lang.Math.abs(a17.f49467a - a18.f49467a);
            double abs2 = java.lang.Math.abs(a17.f49468b - a18.f49468b);
            if (abs > adVar.C.width() || abs2 > adVar.C.height()) {
                z17 = false;
                return contains && !z17;
            }
        }
        z17 = true;
        if (contains) {
        }
    }

    private void d(int i17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (tkVar != null) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass174(i17));
        }
    }

    @Override // com.tencent.mapsdk.internal.bl
    public final void g() {
        com.tencent.mapsdk.internal.ai aiVar;
        super.g();
        if (this.H) {
            return;
        }
        com.tencent.mapsdk.internal.ab abVar = this.F;
        if (abVar != null && (aiVar = abVar.f48769b) != null) {
            aiVar.m();
        }
        com.tencent.mapsdk.internal.qa qaVar = this.f52515r;
        if (qaVar != null) {
            qaVar.a();
        }
        com.tencent.mapsdk.internal.py pyVar = this.f52517t;
        if (pyVar != null) {
            pyVar.f50843c = null;
            pyVar.f50841a.clear();
            pyVar.f50844d.clear();
        }
        com.tencent.mapsdk.internal.sm.a();
        com.tencent.mapsdk.internal.ae aeVar = this.G;
        if (aeVar != null) {
            if (aeVar.f48857a != null) {
                aeVar.f48857a = null;
            }
            this.G = null;
        }
        com.tencent.mapsdk.internal.ab abVar2 = this.F;
        if (abVar2 != null) {
            if (abVar2.f48769b != null) {
                abVar2.f48769b = null;
            }
            this.F = null;
        }
        if (this.E != null) {
            this.E = null;
        }
        com.tencent.mapsdk.internal.af afVar = this.D;
        if (afVar != null) {
            if (afVar.f48858a != null) {
                afVar.f48858a = null;
            }
            this.D = null;
        }
        com.tencent.mapsdk.internal.bf bfVar = this.f52516s;
        if (bfVar != null) {
            bfVar.f48886d = false;
            bfVar.a();
            com.tencent.tencentmap.mapsdk.maps.model.Circle circle = bfVar.f48887e;
            if (circle != null) {
                circle.remove();
                bfVar.f48887e = null;
            }
            com.tencent.tencentmap.mapsdk.maps.LocationSource locationSource = bfVar.f48884b;
            if (locationSource != null) {
                locationSource.deactivate();
                bfVar.f48884b = null;
            }
            com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.LocationRegionChangedListener regionChangedListener = com.tencent.map.tools.net.NetManager.getInstance().getRegionChangedListener();
            if (regionChangedListener != null) {
                java.util.Iterator<java.lang.ref.WeakReference<com.tencent.tencentmap.mapsdk.maps.model.LocationRegion.LocationRegionChangedListener>> it = bfVar.f48890h.iterator();
                while (it.hasNext()) {
                    if (it.next().get() != regionChangedListener) {
                        it.remove();
                    }
                }
            }
            this.f52516s = null;
        }
        com.tencent.mapsdk.internal.bg bgVar = this.f52514q;
        if (bgVar != null) {
            if (bgVar.f48905b != null) {
                ((com.tencent.mapsdk.vector.VectorMap) bgVar.f48905b.e_).b(bgVar.f48914k);
                bgVar.f48905b.l();
                bgVar.f48905b = null;
            }
            if (bgVar.f48906c != null) {
                bgVar.f48906c = null;
            }
            com.tencent.mapsdk.internal.hl.a aVar = com.tencent.mapsdk.internal.hl.f49771b;
            if (aVar != null) {
                aVar.c();
            }
            this.f52514q = null;
        }
        this.f52518u.clear();
        this.H = true;
    }

    private void h(int i17, int i18) {
        this.f52512o.a(i17, i18);
    }

    private void b(com.tencent.mapsdk.internal.fj fjVar) {
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        synchronized (adVar.f48820q) {
            adVar.f48820q.remove(fjVar);
        }
    }

    private void e(java.lang.String str) {
        this.f52512o.b(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
    
        r4 = com.tencent.mapsdk.internal.pw.a(r3.getId(), r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean h(float r11, float r12) {
        /*
            r10 = this;
            com.tencent.mapsdk.engine.jni.models.TappedElement r11 = r10.a(r11, r12)
            r12 = 0
            if (r11 == 0) goto L74
            com.tencent.mapsdk.internal.py r0 = r10.f52517t
            if (r0 == 0) goto L74
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener r1 = r0.f50843c
            if (r1 == 0) goto L74
            int r1 = r11.type
            r2 = 4
            if (r1 != r2) goto L74
            long r1 = r11.itemId
            java.util.List<com.tencent.mapsdk.internal.pw> r11 = r0.f50841a
            java.util.Iterator r11 = r11.iterator()
        L1c:
            boolean r3 = r11.hasNext()
            r4 = 0
            if (r3 == 0) goto L6b
            java.lang.Object r3 = r11.next()
            com.tencent.mapsdk.internal.pw r3 = (com.tencent.mapsdk.internal.pw) r3
            com.tencent.mapsdk.internal.px r5 = r3.f50791b
            if (r5 == 0) goto L61
            com.tencent.mapsdk.internal.px$d r5 = r5.f50810a
            if (r5 == 0) goto L61
            java.util.List<com.tencent.mapsdk.internal.px$d> r5 = r5.f50828j
            if (r5 == 0) goto L61
            java.util.Iterator r5 = r5.iterator()
        L39:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L61
            java.lang.Object r6 = r5.next()
            com.tencent.mapsdk.internal.px$d r6 = (com.tencent.mapsdk.internal.px.d) r6
            com.tencent.mapsdk.internal.py r7 = r3.f50790a
            com.tencent.mapsdk.internal.ne r7 = r7.f50842b
            com.tencent.mapsdk.internal.bi r7 = r7.f50510j
            int r8 = r6.f50819a
            java.lang.Class<com.tencent.mapsdk.internal.oc> r9 = com.tencent.mapsdk.internal.oc.class
            com.tencent.mapsdk.internal.ng r7 = r7.a(r9, r8)
            com.tencent.mapsdk.internal.oc r7 = (com.tencent.mapsdk.internal.oc) r7
            if (r7 == 0) goto L39
            int r7 = r7.a()
            long r7 = (long) r7
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 != 0) goto L39
            r4 = r6
        L61:
            if (r4 == 0) goto L1c
            java.lang.String r11 = r3.getId()
            com.tencent.tencentmap.mapsdk.maps.model.SubPoi r4 = com.tencent.mapsdk.internal.pw.a(r11, r4)
        L6b:
            if (r4 == 0) goto L74
            com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener r11 = r0.f50843c
            r11.onClicked(r4)
            r11 = 1
            return r11
        L74:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.vector.VectorMap.h(float, float):boolean");
    }

    private void c(int i17) {
        this.f52512o.f50508h.a(i17);
    }

    private void d(float f17) {
        this.N = f17;
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar != null) {
            neVar.a(f17);
            if (this.P != 2 || ae()) {
                return;
            }
            b(this.N);
        }
    }

    private void e(com.tencent.map.lib.models.GeoPoint geoPoint) {
        boolean contains;
        if (geoPoint == null) {
            contains = false;
        } else {
            int latitudeE6 = geoPoint.getLatitudeE6();
            contains = com.tencent.tencentmap.mapsdk.maps.model.GeometryConstants.BOUNDARY_WORLD.contains(geoPoint.getLongitudeE6(), latitudeE6);
        }
        if (contains) {
            this.f52512o.f50508h.a(geoPoint, (java.lang.Runnable) null);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl
    public final void f() {
        com.tencent.mapsdk.internal.py pyVar;
        if (this.H || this.F == null || (pyVar = this.f52517t) == null) {
            return;
        }
        this.M.b(pyVar);
    }

    private void c(android.graphics.Rect rect, android.graphics.Rect rect2) {
        this.f52512o.f50508h.c(rect, rect2);
    }

    private void b(com.tencent.mapsdk.internal.fe feVar) {
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        synchronized (adVar.f48821r) {
            adVar.f48821r.remove(feVar);
        }
    }

    private boolean f(float f17, float f18) {
        com.tencent.mapsdk.internal.bi biVar = this.f52512o.f50510j;
        com.tencent.mapsdk.engine.jni.models.TappedElement a17 = biVar.f48961a.i().a(f17, f18);
        if (a17 == null || a17.type != 3) {
            return false;
        }
        com.tencent.mapsdk.internal.fa faVar = biVar.f48964d;
        if (faVar == null) {
            return true;
        }
        faVar.o_();
        return true;
    }

    private void d(boolean z17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (tkVar == null || tkVar.f51661e == 0) {
            return;
        }
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass173(z17));
    }

    private void c(float f17, float f18) {
        this.f52512o.f50508h.a(f17, f18, true);
    }

    private static float e(int i17) {
        return com.tencent.mapsdk.internal.v.b.a(i17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d9, code lost:
    
        r5 = com.tencent.mapsdk.internal.pw.a(r4.getId(), r5);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ee A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean e(float r12, float r13) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.vector.VectorMap.e(float, float):boolean");
    }

    private void d(float f17, float f18) {
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar != null) {
            com.tencent.mapsdk.internal.ad adVar = neVar.f50508h;
            adVar.E = f17;
            adVar.F = f18;
        }
    }

    public final void b(com.tencent.mapsdk.internal.fq fqVar) {
        this.f52512o.f50508h.b(fqVar);
    }

    public final void c(float f17) {
        this.f52512o.f50508h.a(f17);
    }

    private void j(boolean z17) {
        this.f52513p = z17;
        this.f52512o.j(z17);
    }

    private void b(com.tencent.mapsdk.internal.fg fgVar) {
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        if (adVar.f48822s != null) {
            synchronized (adVar.f48823t) {
                adVar.f48822s.remove(fgVar);
            }
        }
    }

    private void c(float f17, float f18, boolean z17) {
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        adVar.N = true;
        adVar.a(f17, f18, z17);
    }

    private void d(java.lang.String str) {
        this.f52512o.a(str);
    }

    @Override // com.tencent.mapsdk.internal.bl
    public final void d() {
        com.tencent.mapsdk.internal.ab abVar;
        if (this.H || (abVar = this.F) == null) {
            return;
        }
        com.tencent.mapsdk.internal.ai aiVar = abVar.f48769b;
        if (aiVar != null) {
            aiVar.n();
        }
        this.I = true;
    }

    private void c(double d17) {
        this.f52512o.f50508h.a((float) d17);
    }

    public final void b(float f17) {
        this.f52512o.f50508h.b(f17);
    }

    public final void c(int i17, int i18) {
        this.f52512o.b(i17, i18);
    }

    private void c(java.lang.String str) {
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (tkVar == null || 0 == tkVar.f51661e) {
            return;
        }
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass156(str));
    }

    public final void b(boolean z17) {
        this.f52512o.a(z17);
    }

    private boolean b(java.lang.String str, byte[] bArr) {
        com.tencent.mapsdk.internal.oq oqVar;
        com.tencent.mapsdk.internal.w wVar = this.f52512o.f50518r;
        if (wVar == null || (oqVar = wVar.f52455b) == null) {
            return false;
        }
        return com.tencent.mapsdk.internal.w.a(new java.io.File(oqVar.e()), str, bArr, wVar.f52458e);
    }

    @Override // com.tencent.mapsdk.internal.bl
    public final void c() {
        com.tencent.mapsdk.internal.ab abVar;
        if (this.H || (abVar = this.F) == null) {
            return;
        }
        com.tencent.mapsdk.internal.ai aiVar = abVar.f48769b;
        if (aiVar != null) {
            aiVar.j();
        }
        this.I = false;
    }

    private void b(com.tencent.mapsdk.internal.fk fkVar) {
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        synchronized (adVar.f48827x) {
            adVar.f48827x.remove(fkVar);
        }
    }

    private void b(com.tencent.mapsdk.internal.fo foVar) {
        this.f52512o.f50508h.b(foVar);
    }

    private void b(com.tencent.mapsdk.internal.fm fmVar) {
        this.f52512o.f50508h.b(fmVar);
    }

    private void b(com.tencent.mapsdk.internal.fl flVar) {
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        synchronized (adVar.f48824u) {
            adVar.f48824u.remove(flVar);
        }
    }

    @Override // com.tencent.mapsdk.internal.bl
    public final boolean a() {
        return (!this.K || this.I || this.H) ? false : true;
    }

    private static boolean a(com.tencent.map.lib.models.GeoPoint geoPoint) {
        if (geoPoint == null) {
            return false;
        }
        int latitudeE6 = geoPoint.getLatitudeE6();
        return com.tencent.tencentmap.mapsdk.maps.model.GeometryConstants.BOUNDARY_WORLD.contains(geoPoint.getLongitudeE6(), latitudeE6);
    }

    private void a(com.tencent.mapsdk.internal.oq oqVar) {
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar != null) {
            neVar.a(oqVar);
        }
    }

    private void b(com.tencent.mapsdk.internal.ph phVar) {
        this.f52512o.f50508h.b(phVar);
    }

    private void a(float f17, float f18, boolean z17) {
        this.f52512o.f50508h.b(f17, f18, z17);
    }

    private void b(com.tencent.mapsdk.internal.fr frVar) {
        this.f52512o.f50508h.b(frVar);
    }

    private boolean a(java.lang.String str) {
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (tkVar == null) {
            return false;
        }
        return ((java.lang.Boolean) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass117>) new com.tencent.mapsdk.internal.tk.AnonymousClass117(str), (com.tencent.mapsdk.internal.tk.AnonymousClass117) java.lang.Boolean.FALSE)).booleanValue();
    }

    private void b(com.tencent.mapsdk.internal.rt rtVar) {
        com.tencent.mapsdk.internal.rw rwVar = this.f52512o.f50509i;
        if (rwVar != null) {
            rwVar.f51287b.post(new com.tencent.mapsdk.internal.rw.AnonymousClass6(rtVar));
        }
    }

    private void a(com.tencent.mapsdk.internal.ez ezVar) {
        this.f52512o.f50510j.a(ezVar);
        this.f52512o.f50522v = true;
    }

    private void b(com.tencent.map.lib.models.PolygonInfo polygonInfo) {
        this.f52512o.b(polygonInfo);
    }

    private boolean g(float f17, float f18) {
        java.lang.ref.WeakReference<com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationClickListener> weakReference;
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationClickListener onMyLocationClickListener;
        com.tencent.mapsdk.internal.bf bfVar = this.f52516s;
        boolean z17 = false;
        if (bfVar != null) {
            com.tencent.mapsdk.engine.jni.models.TappedElement a17 = bfVar.f48895m.f50510j.f48961a.i().a(f17, f18);
            if (a17 != null && a17.type == 6) {
                z17 = true;
            }
            if (z17 && (weakReference = bfVar.f48889g) != null && (onMyLocationClickListener = weakReference.get()) != null) {
                com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = new com.tencent.tencentmap.mapsdk.maps.model.LatLng();
                android.location.Location location = bfVar.f48892j;
                if (location != null) {
                    latLng.setAltitude(location.getAltitude());
                    latLng.setLongitude(bfVar.f48892j.getLongitude());
                    latLng.setLatitude(bfVar.f48892j.getLatitude());
                }
                return onMyLocationClickListener.onMyLocationClicked(latLng);
            }
        }
        return z17;
    }

    private void b(android.graphics.Rect rect, android.graphics.Rect rect2) {
        this.f52512o.f50508h.b(rect, rect2);
    }

    private void a(com.tencent.mapsdk.internal.fj fjVar) {
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        if (fjVar != null) {
            synchronized (adVar.f48820q) {
                if (!adVar.f48820q.contains(fjVar)) {
                    adVar.f48820q.add(fjVar);
                }
            }
        }
    }

    private void b(com.tencent.map.lib.models.GeoPoint geoPoint, java.lang.Runnable runnable) {
        this.f52512o.f50508h.a(geoPoint, runnable);
    }

    private void b(float f17, float f18, boolean z17) {
        this.f52512o.f50508h.a(f17, f18, z17);
    }

    private void a(com.tencent.mapsdk.internal.fe feVar) {
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        if (feVar != null) {
            synchronized (adVar.f48821r) {
                if (!adVar.f48821r.contains(feVar)) {
                    adVar.f48821r.add(feVar);
                }
            }
        }
    }

    private void b(android.graphics.Rect rect) {
        this.f52512o.f50508h.b(rect);
    }

    private void b(double d17) {
        this.f52512o.f50508h.a((360.0d - d17) % 360.0d, r1.i(), true);
    }

    public final void a(com.tencent.mapsdk.internal.fq fqVar) {
        this.f52512o.f50508h.a(fqVar);
    }

    private void b(com.tencent.mapsdk.internal.fb fbVar) {
        com.tencent.mapsdk.internal.az azVar;
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar == null || (azVar = neVar.f50512l) == null) {
            return;
        }
        azVar.b(fbVar);
    }

    private void a(com.tencent.mapsdk.internal.fg fgVar) {
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        if (fgVar != null) {
            if (adVar.f48822s == null) {
                adVar.f48822s = new java.util.ArrayList();
            }
            synchronized (adVar.f48823t) {
                if (!adVar.f48822s.contains(fgVar)) {
                    adVar.f48822s.add(fgVar);
                }
            }
        }
    }

    private void b(java.lang.String str) {
        this.f52512o.f50506f.b(str);
    }

    public final void b(int i17, int i18) {
        this.f52512o.f50508h.a(i17, i18);
    }

    private void b(com.tencent.mapsdk.internal.ba baVar) {
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        if (adVar.f48825v != null) {
            synchronized (adVar.f48826w) {
                adVar.f48825v.remove(baVar);
            }
        }
    }

    public final void a(int i17, int i18) {
        this.f52512o.f50508h.a(i17, i18, 1);
    }

    public final void a(float f17) {
        this.f52512o.f50508h.a(f17);
    }

    private void b(int i17, float f17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (tkVar != null) {
            tkVar.a(i17, f17);
        }
    }

    public final void a(double d17) {
        this.f52512o.f50508h.c(d17);
    }

    private void b(com.tencent.mapsdk.internal.fi fiVar) {
        this.f52512o.b(fiVar);
    }

    private boolean a(java.lang.String str, byte[] bArr) {
        com.tencent.mapsdk.internal.oq oqVar;
        com.tencent.mapsdk.internal.w wVar = this.f52512o.f50518r;
        if (wVar == null || (oqVar = wVar.f52455b) == null) {
            return false;
        }
        return com.tencent.mapsdk.internal.w.a(new java.io.File(oqVar.c()), str, bArr, wVar.f52457d);
    }

    private void b(com.tencent.mapsdk.internal.oz ozVar) {
        this.f52512o.b(ozVar);
    }

    @Override // com.tencent.mapsdk.internal.bl
    public final void b() {
        com.tencent.mapsdk.internal.py pyVar;
        if (this.H || this.F == null || (pyVar = this.f52517t) == null) {
            return;
        }
        this.M.a(pyVar);
    }

    private void b(com.tencent.mapsdk.internal.qa.b bVar) {
        if (bVar == null) {
            return;
        }
        com.tencent.mapsdk.internal.qa qaVar = this.f52515r;
        if (qaVar != null) {
            qaVar.b(bVar);
        } else {
            this.f52518u.remove(bVar);
        }
    }

    private void a(com.tencent.mapsdk.internal.fk fkVar) {
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        if (fkVar != null) {
            synchronized (adVar.f48827x) {
                if (!adVar.f48827x.contains(fkVar)) {
                    adVar.f48827x.add(fkVar);
                }
            }
        }
    }

    private void a(com.tencent.mapsdk.internal.fo foVar) {
        this.f52512o.f50508h.a(foVar);
    }

    public final void a(com.tencent.mapsdk.internal.fm fmVar) {
        this.f52512o.f50508h.a(fmVar);
    }

    private void a(com.tencent.mapsdk.internal.fl flVar) {
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        if (flVar != null) {
            synchronized (adVar.f48824u) {
                if (!adVar.f48824u.contains(flVar)) {
                    adVar.f48824u.add(flVar);
                }
            }
        }
    }

    public final void a(com.tencent.mapsdk.internal.fr frVar) {
        this.f52512o.f50508h.a(frVar);
    }

    private void a(com.tencent.mapsdk.internal.ph phVar) {
        this.f52512o.f50508h.a(phVar);
    }

    public final void a(com.tencent.mapsdk.internal.fa faVar) {
        this.f52512o.f50510j.f48964d = faVar;
    }

    private void a(com.tencent.mapsdk.internal.ez ezVar, int i17, int i18, com.tencent.mapsdk.internal.fp fpVar) {
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        android.graphics.Rect bound = ezVar.getBound(neVar.f50513m);
        if (bound == null || i17 <= 0 || i18 <= 0 || fpVar == null) {
            return;
        }
        neVar.f50519s.a(ezVar, bound, fpVar, i17, i18);
    }

    private void a(android.graphics.Rect rect, int i17, int i18, com.tencent.mapsdk.internal.fp fpVar) {
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (rect == null) {
            rect = neVar.f50508h.q();
        }
        android.graphics.Rect rect2 = rect;
        if (rect2 == null || i17 <= 0 || i18 <= 0 || fpVar == null) {
            return;
        }
        neVar.f50519s.a(null, rect2, fpVar, i17, i18);
    }

    private com.tencent.mapsdk.internal.iw a(int i17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        if (i17 == 0) {
            return com.tencent.mapsdk.internal.jg.a((com.tencent.mapsdk.internal.it) adVar, 0, 1);
        }
        if (i17 == 1) {
            return com.tencent.mapsdk.internal.jg.a((com.tencent.mapsdk.internal.it) adVar, (com.tencent.mapsdk.internal.jk) new com.tencent.mapsdk.internal.ik(), new java.lang.Object[]{obj, obj2});
        }
        if (i17 == 2) {
            return com.tencent.mapsdk.internal.jg.a(adVar, 3, java.lang.Math.log10(((java.lang.Number) obj).doubleValue()) / java.lang.Math.log10(2.0d), java.lang.Math.log10(((java.lang.Number) obj2).doubleValue()) / java.lang.Math.log10(2.0d));
        }
        if (i17 == 3) {
            return com.tencent.mapsdk.internal.jg.a(adVar, 2, adVar.h(), (((java.lang.Number) obj2).doubleValue() - ((java.lang.Number) obj).doubleValue()) + adVar.h());
        }
        if (i17 != 4) {
            return null;
        }
        return com.tencent.mapsdk.internal.jg.a(adVar, 4, adVar.i(), (((java.lang.Number) obj2).doubleValue() - ((java.lang.Number) obj).doubleValue()) + adVar.i());
    }

    private double a(android.graphics.Rect rect, android.graphics.Rect rect2) {
        android.graphics.Rect rect3 = new android.graphics.Rect(this.f52512o.f50508h.f48829z.j());
        if (rect2 != null) {
            rect3.left += rect2.left;
            rect3.right -= rect2.right;
            rect3.top += rect2.top;
            rect3.bottom -= rect2.bottom;
        }
        return r0.a(rect, rect3);
    }

    private void a(com.tencent.mapsdk.internal.rt rtVar) {
        com.tencent.mapsdk.internal.rw rwVar = this.f52512o.f50509i;
        if (rwVar != null) {
            rwVar.f51287b.post(new com.tencent.mapsdk.internal.rw.AnonymousClass5(rtVar));
        }
    }

    private int a(com.tencent.map.lib.models.PolygonInfo polygonInfo) {
        return this.f52512o.a(polygonInfo);
    }

    private int a(int i17, int i18, int i19, int i27, int i28, float f17) {
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar.f50506f == null) {
            return -1;
        }
        if (i17 < 0) {
            i17 = 0;
        }
        if (i17 > 255) {
            i17 = 255;
        }
        if (i18 < 0) {
            i18 = 0;
        }
        if (i18 > 255) {
            i18 = 255;
        }
        if (i19 < 0) {
            i19 = 0;
        }
        if (i19 > 255) {
            i19 = 255;
        }
        if (i27 < 0) {
            i27 = 0;
        }
        if (i27 > 255) {
            i27 = 255;
        }
        com.tencent.map.lib.models.MaskLayer maskLayer = new com.tencent.map.lib.models.MaskLayer();
        maskLayer.color = new int[]{i17, i18, i19, 255 - i27};
        android.graphics.Rect rect = neVar.f50515o;
        if (rect != null) {
            maskLayer.width = rect.width();
            maskLayer.height = neVar.f50515o.height();
        }
        maskLayer.zIndex = f17;
        maskLayer.layer = i28;
        com.tencent.mapsdk.internal.tk tkVar = neVar.f50506f;
        return ((java.lang.Integer) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass111>) new com.tencent.mapsdk.internal.tk.AnonymousClass111(maskLayer), (com.tencent.mapsdk.internal.tk.AnonymousClass111) 0)).intValue();
    }

    private void a(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection> list, java.util.List<com.tencent.map.lib.models.GeoPoint> list2) {
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar.f50526z == null) {
            neVar.f50526z = new com.tencent.mapsdk.internal.ne.d();
        }
        com.tencent.mapsdk.internal.ne.d dVar = neVar.f50526z;
        dVar.f50538a = list;
        dVar.f50539b = list2;
        com.tencent.mapsdk.internal.ne.this.f50506f.a(list, list2);
    }

    private java.util.List<java.lang.Integer> a(android.graphics.Rect rect, int i17) {
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        return (java.util.List) tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass34(rect, i17), (com.tencent.mapsdk.internal.tk.AnonymousClass34) null);
    }

    private com.tencent.map.lib.models.AnnocationTextResult a(com.tencent.map.lib.models.AnnocationText annocationText) {
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        return (com.tencent.map.lib.models.AnnocationTextResult) tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass33(annocationText), (com.tencent.mapsdk.internal.tk.AnonymousClass33) null);
    }

    private void a(int i17, float f17) {
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        adVar.a(i17, (java.lang.Runnable) new com.tencent.mapsdk.internal.ad.AnonymousClass5(f17));
    }

    private void a(com.tencent.map.lib.models.GeoPoint geoPoint, java.lang.Runnable runnable) {
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        if (geoPoint != null) {
            adVar.a(geoPoint, adVar.A.f52409b.f52444m, runnable);
        }
    }

    private void a(com.tencent.map.lib.models.GeoPoint geoPoint, int i17) {
        this.f52512o.f50508h.a(geoPoint, i17, (java.lang.Runnable) null);
    }

    private void a(com.tencent.map.lib.models.GeoPoint geoPoint, int i17, java.lang.Runnable runnable) {
        this.f52512o.f50508h.a(geoPoint, i17, runnable);
    }

    private void a(com.tencent.map.lib.models.GeoPoint geoPoint, float f17, java.lang.Runnable runnable) {
        int i17;
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        if (geoPoint != null) {
            adVar.f48818o.e();
            double d17 = adVar.A.f52409b.f52443l;
            double d18 = f17;
            double d19 = d18 / d17;
            if (d19 > 1.0d) {
                i17 = (int) (d19 / 0.5d);
            } else {
                if (d19 >= 1.0d) {
                    adVar.b(geoPoint, runnable);
                    return;
                }
                i17 = d19 != 1.0d ? (int) (0.5d / d19) : 0;
            }
            int max = java.lang.Math.max(60, java.lang.Math.min(120, (i17 >> 1) << 1));
            double log10 = java.lang.Math.log10(d17) / java.lang.Math.log10(2.0d);
            double log102 = java.lang.Math.log10(d18) / java.lang.Math.log10(2.0d);
            com.tencent.map.lib.models.GeoPoint geoPoint2 = adVar.A.f52420m;
            int i18 = 0;
            while (i18 < max) {
                long j17 = max;
                int i19 = i18 + 1;
                long j18 = i19;
                double d27 = log10;
                double d28 = log102;
                double pow = java.lang.Math.pow(2.0d, com.tencent.mapsdk.internal.mo.a(log10, log102, j17, j18));
                double a17 = com.tencent.mapsdk.internal.mo.a(geoPoint2.getLatitudeE6(), geoPoint.getLatitudeE6(), j17, j18);
                double a18 = com.tencent.mapsdk.internal.mo.a(geoPoint2.getLongitudeE6(), geoPoint.getLongitudeE6(), j17, j18);
                com.tencent.mapsdk.core.utils.log.LogUtil.b("debug location anim zoomOut:" + a17 + "," + a18);
                adVar.b(new com.tencent.mapsdk.internal.jm(120, new double[]{pow, a17, a18}));
                log10 = d27;
                log102 = d28;
                i18 = i19;
            }
            if (runnable != null) {
                adVar.b(new com.tencent.mapsdk.internal.jm(runnable));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (r2 > r11) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.tencent.map.lib.models.GeoPoint r11, android.graphics.Rect r12) {
        /*
            r10 = this;
            com.tencent.mapsdk.internal.ne r0 = r10.f52512o
            com.tencent.mapsdk.internal.ad r0 = r0.f50508h
            com.tencent.mapsdk.internal.ey r1 = r0.B
            com.tencent.mapsdk.internal.fu r11 = r1.a(r11)
            double r2 = r11.f49467a
            int r2 = (int) r2
            double r3 = r11.f49468b
            int r3 = (int) r3
            boolean r2 = r12.contains(r2, r3)
            if (r2 != 0) goto L5c
            double r2 = r11.f49467a
            int r4 = r12.left
            double r5 = (double) r4
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            r6 = 0
            if (r5 >= 0) goto L24
        L21:
            double r4 = (double) r4
            double r4 = r4 - r2
            goto L2d
        L24:
            int r4 = r12.right
            double r8 = (double) r4
            int r5 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r5 <= 0) goto L2c
            goto L21
        L2c:
            r4 = r6
        L2d:
            double r2 = r11.f49468b
            int r11 = r12.top
            double r8 = (double) r11
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 >= 0) goto L3a
        L36:
            double r11 = (double) r11
            double r6 = r11 - r2
            goto L42
        L3a:
            int r11 = r12.bottom
            double r8 = (double) r11
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 <= 0) goto L42
            goto L36
        L42:
            com.tencent.mapsdk.internal.v r11 = r0.A
            com.tencent.map.lib.models.GeoPoint r11 = r11.f52420m
            com.tencent.mapsdk.internal.fu r11 = r1.a(r11)
            double r2 = r11.f49467a
            double r2 = r2 - r4
            r11.f49467a = r2
            double r2 = r11.f49468b
            double r2 = r2 - r6
            r11.f49468b = r2
            com.tencent.map.lib.models.GeoPoint r11 = r1.a(r11)
            r12 = 0
            r0.a(r11, r12)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.vector.VectorMap.a(com.tencent.map.lib.models.GeoPoint, android.graphics.Rect):void");
    }

    public final void a(com.tencent.mapsdk.internal.jm jmVar) {
        this.f52512o.f50508h.b(jmVar);
    }

    private void a(android.graphics.Rect rect) {
        this.f52512o.f50508h.a(rect);
    }

    private int a(int i17, int i18, int i19, int i27, boolean z17) {
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        adVar.H = i17;
        adVar.I = i18;
        adVar.f48814J = i19;
        adVar.K = i27;
        android.graphics.Rect rect = adVar.C;
        if (rect != null && rect.width() > 0 && adVar.C.height() > 0) {
            if (i17 + i19 > adVar.C.width() || i18 + i27 > adVar.C.height()) {
                return -1;
            }
            android.graphics.PointF a17 = adVar.a();
            adVar.a(a17.x, a17.y, z17);
            return 0;
        }
        adVar.a(new com.tencent.mapsdk.internal.ad.AnonymousClass1(z17));
        com.tencent.mapsdk.internal.bd bdVar = adVar.f48829z;
        if (!(bdVar instanceof com.tencent.mapsdk.internal.ne)) {
            return -2;
        }
        android.content.Context context = ((com.tencent.mapsdk.internal.ne) bdVar).getContext();
        return (i17 + i19 > com.tencent.mapsdk.internal.hs.b(context) || i18 + i27 > com.tencent.mapsdk.internal.hs.c(context)) ? -1 : 0;
    }

    private void a(double d17, double d18) {
        com.tencent.mapsdk.internal.aa aaVar = this.f52512o.f50508h.f48818o;
        synchronized (aaVar.f48755c) {
            while (!aaVar.f48754b.isEmpty()) {
                java.util.ArrayList<com.tencent.mapsdk.internal.jm> arrayList = aaVar.f48754b;
                if (arrayList.get(arrayList.size() - 1).f50040z != 3) {
                    break;
                }
                java.util.ArrayList<com.tencent.mapsdk.internal.jm> arrayList2 = aaVar.f48754b;
                double[] dArr = arrayList2.remove(arrayList2.size() - 1).A;
                d17 += dArr[0];
                d18 += dArr[1];
            }
            aaVar.a(new com.tencent.mapsdk.internal.jm(3, new double[]{d17, d18}));
        }
    }

    public final void a(com.tencent.mapsdk.internal.qm qmVar) {
        com.tencent.mapsdk.internal.ad adVar = this.f52512o.f50508h;
        if (adVar.f48819p == null) {
            adVar.f48819p = adVar.f48828y.N();
        }
        com.tencent.mapsdk.internal.qj qjVar = adVar.f48819p;
        qjVar.f50957b = qmVar;
        boolean a17 = qmVar.a();
        com.tencent.mapsdk.internal.az azVar = qjVar.f50959d;
        if (azVar != null) {
            if (a17) {
                azVar.b(qjVar);
            } else {
                azVar.a(qjVar);
            }
        }
    }

    private void a(com.tencent.mapsdk.internal.fb fbVar) {
        com.tencent.mapsdk.internal.az azVar;
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar == null || (azVar = neVar.f50512l) == null) {
            return;
        }
        azVar.a(fbVar);
    }

    private void a(com.tencent.map.lib.models.GeoPoint geoPoint, float f17, float f18, boolean z17) {
        this.N = f17;
        this.O.setLatitudeE6(geoPoint.getLatitudeE6());
        this.O.setLongitudeE6(geoPoint.getLongitudeE6());
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar != null) {
            neVar.a(this.O, this.N, f18, z17);
            int i17 = this.P;
            if (i17 == 1 || i17 == 2) {
                a(this.O, s());
            }
            if (this.P != 2 || ae()) {
                return;
            }
            b(this.N);
        }
    }

    private void a(com.tencent.map.lib.models.GeoPoint geoPoint, android.graphics.RectF rectF, boolean z17) {
        com.tencent.mapsdk.internal.ne neVar;
        android.graphics.Rect rect;
        com.tencent.mapsdk.internal.ne neVar2 = this.f52512o;
        if (neVar2 != null) {
            if (rectF != null && (rect = neVar2.C) != null) {
                rectF.left -= rect.left;
                rectF.top -= rect.top;
                rectF.right -= rect.right;
                rectF.bottom -= rect.bottom;
            }
            com.tencent.mapsdk.internal.tk tkVar = neVar2.f50506f;
            if (tkVar != null) {
                int i17 = neVar2.E;
                int i18 = neVar2.D;
                if (0 == tkVar.f51661e || (neVar = tkVar.f51666j) == null) {
                    return;
                }
                neVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass6(rectF, geoPoint, i17, i18, z17));
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.bl
    public final void a(int i17) {
        super.a(i17);
        if (this.H || this.f52512o == null) {
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50206g, "setIndoorConfigType:".concat(java.lang.String.valueOf(i17)));
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass162(i17));
    }

    private void a(float f17, float f18, float f19, float f27) {
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (0 != tkVar.f51661e) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass172(f17, f18, f19, f27));
        }
    }

    public final void a(java.lang.String[] strArr) {
        this.f52512o.a(strArr);
    }

    private void a(com.tencent.mapsdk.internal.ox oxVar) {
        this.f52512o.a(oxVar);
    }

    private void a(com.tencent.mapsdk.internal.ad.a aVar) {
        this.f52512o.f50508h.D = aVar;
    }

    private void a(int i17, int i18, int i19, int i27) {
        com.tencent.mapsdk.internal.tk tkVar;
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar == null || (tkVar = neVar.f50506f) == null) {
            return;
        }
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass27(i18, i17, i19, i27));
    }

    private void a(double d17, double d18, double d19, double d27, double d28) {
        this.f52512o.f50508h.a(d17, d18, d19, d27, d28, false, null);
    }

    public final void a(com.tencent.mapsdk.internal.ba baVar) {
        this.f52512o.f50508h.a(baVar);
    }

    @java.lang.Deprecated
    private void a(int i17, int i18, int i19) {
        com.tencent.mapsdk.internal.tk tkVar = this.f52512o.f50506f;
        if (tkVar != null) {
            tkVar.a(i17, i18, i19);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.tencent.map.lib.models.GeoPoint r18, com.tencent.mapsdk.internal.iv r19) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.vector.VectorMap.a(com.tencent.map.lib.models.GeoPoint, com.tencent.mapsdk.internal.iv):void");
    }

    private float a(double d17, com.tencent.map.lib.models.GeoPoint geoPoint) {
        com.tencent.mapsdk.internal.ey eyVar;
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (geoPoint != null && neVar.f50520t != null && (eyVar = neVar.f50513m) != null) {
            double metersPerPixel = eyVar.metersPerPixel(geoPoint.getLatitudeE6() / 1000000.0d);
            if (metersPerPixel != 0.0d) {
                return (float) (d17 / metersPerPixel);
            }
        }
        return 0.0f;
    }

    private void a(com.tencent.mapsdk.internal.fi fiVar) {
        this.f52512o.a(fiVar);
    }

    public final void a(com.tencent.mapsdk.internal.oz ozVar) {
        this.f52512o.a(ozVar);
    }

    public final com.tencent.mapsdk.engine.jni.models.TappedElement a(float f17, float f18) {
        return this.f52512o.b(f17, f18);
    }

    @Override // com.tencent.mapsdk.internal.bl
    public final void a(boolean z17) {
        com.tencent.mapsdk.internal.bg bgVar;
        com.tencent.mapsdk.internal.bu buVar;
        if (this.H || (bgVar = this.f52514q) == null || (buVar = bgVar.f48904a.get()) == null) {
            return;
        }
        buVar.setZOrderMediaOverlay(z17);
    }

    public final void a(com.tencent.mapsdk.internal.pb pbVar) {
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar == null) {
            return;
        }
        neVar.G = pbVar;
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds, int i17) {
        com.tencent.mapsdk.internal.ne neVar = this.f52512o;
        if (neVar == null) {
            return;
        }
        neVar.a(latLngBounds, i17);
    }

    public final void a(com.tencent.mapsdk.internal.qa.b bVar) {
        if (bVar == null) {
            return;
        }
        com.tencent.mapsdk.internal.qa qaVar = this.f52515r;
        if (qaVar != null) {
            qaVar.a(bVar);
        } else {
            this.f52518u.put(bVar, java.lang.Boolean.TRUE);
        }
    }
}
