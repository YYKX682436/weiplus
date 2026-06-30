package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ac implements com.tencent.mapsdk.internal.fm, com.tencent.mapsdk.internal.ox, com.tencent.mapsdk.internal.v.a {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mapsdk.internal.mv f48773a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mapsdk.internal.fx f48774b;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mapsdk.vector.VectorMap f48776d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mapsdk.internal.ne f48777e;

    /* renamed from: h, reason: collision with root package name */
    float f48780h;

    /* renamed from: i, reason: collision with root package name */
    float f48781i;

    /* renamed from: k, reason: collision with root package name */
    private boolean f48783k;

    /* renamed from: l, reason: collision with root package name */
    private com.tencent.mapsdk.internal.tr f48784l;

    /* renamed from: m, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener f48785m;

    /* renamed from: c, reason: collision with root package name */
    public int f48775c = com.tencent.mapsdk.internal.ac.a.f48796a;

    /* renamed from: f, reason: collision with root package name */
    public boolean f48778f = false;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding f48779g = null;

    /* renamed from: n, reason: collision with root package name */
    private boolean f48786n = false;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.TencentMap.OnScaleViewChangedListener f48782j = new com.tencent.tencentmap.mapsdk.maps.TencentMap.OnScaleViewChangedListener() { // from class: com.tencent.mapsdk.internal.ac.1
        @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnScaleViewChangedListener
        public final void onScaleViewChanged(float f17) {
            com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding;
            com.tencent.mapsdk.internal.ac acVar = com.tencent.mapsdk.internal.ac.this;
            float f18 = acVar.f48781i;
            acVar.f48780h = f18;
            acVar.f48781i = f17;
            if (f18 <= 20.0d || f17 > 20.0d || !acVar.f48778f || (indoorBuilding = acVar.f48779g) == null) {
                return;
            }
            java.lang.String buidlingId = indoorBuilding.getBuidlingId();
            com.tencent.mapsdk.internal.hg hgVar = com.tencent.mapsdk.internal.ac.this.f48777e.f49000c;
            if (hgVar == null || android.text.TextUtils.isEmpty(buidlingId)) {
                return;
            }
            hgVar.d().a(buidlingId).c();
        }
    };

    /* renamed from: com.tencent.mapsdk.internal.ac$2, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass2 implements java.lang.Runnable {
        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.tencent.mapsdk.internal.ac acVar = com.tencent.mapsdk.internal.ac.this;
            int i17 = acVar.f48775c;
            if (i17 == com.tencent.mapsdk.internal.ac.a.f48796a) {
                acVar.a(acVar.f48774b.a());
            } else {
                acVar.a(i17);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.ac$4, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f48795a;

        static {
            int[] iArr = new int[com.tencent.mapsdk.internal.ac.a.a().length];
            f48795a = iArr;
            try {
                iArr[com.tencent.mapsdk.internal.ac.a.f48797b - 1] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f48795a[com.tencent.mapsdk.internal.ac.a.f48796a - 1] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f48795a[com.tencent.mapsdk.internal.ac.a.f48798c - 1] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes13.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f48796a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f48797b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f48798c = 3;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ int[] f48799d = {1, 2, 3};

        private a(java.lang.String str, int i17) {
        }

        public static int[] a() {
            return (int[]) f48799d.clone();
        }
    }

    public ac(com.tencent.mapsdk.internal.tr trVar, java.lang.String str) {
        org.json.JSONArray jSONArray = null;
        this.f48785m = null;
        this.f48776d = null;
        this.f48784l = trVar;
        if (trVar != null) {
            if (str == null) {
                this.f48773a = com.tencent.mapsdk.internal.my.a(trVar.I());
            } else {
                this.f48773a = com.tencent.mapsdk.internal.mx.a(trVar.I(), str);
            }
            com.tencent.mapsdk.internal.tr trVar2 = this.f48784l;
            this.f48776d = (com.tencent.mapsdk.vector.VectorMap) trVar2.e_;
            com.tencent.mapsdk.internal.ne neVar = trVar2.f52273as;
            this.f48777e = neVar;
            com.tencent.mapsdk.internal.v vVar = neVar.f50520t;
            if (vVar != null) {
                vVar.a(this);
            }
            int b17 = this.f48773a.b(com.tencent.mapsdk.internal.er.B);
            int b18 = this.f48773a.b(com.tencent.mapsdk.internal.er.C);
            java.lang.String a17 = this.f48773a.a(com.tencent.mapsdk.internal.er.D);
            try {
                if (!android.text.TextUtils.isEmpty(a17)) {
                    jSONArray = new org.json.JSONArray(a17);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mapsdk.core.utils.log.LogUtil.a(com.tencent.mapsdk.internal.kx.f50214o, "indoor auth init failed", e17);
            }
            if (b17 != -1 && b18 != -1 && jSONArray != null) {
                this.f48774b = new com.tencent.mapsdk.internal.fx(b17, b18, jSONArray);
            }
            com.tencent.mapsdk.vector.VectorMap vectorMap = this.f48776d;
            if (vectorMap != null) {
                vectorMap.a(c());
                if (b18 == 1) {
                    this.f48776d.a(d());
                }
            }
            a(false);
        }
        com.tencent.mapsdk.vector.VectorMap vectorMap2 = this.f48776d;
        if (vectorMap2 != null) {
            vectorMap2.a((com.tencent.mapsdk.internal.fm) this);
            this.f48776d.f52512o.a(this);
            this.f48785m = new com.tencent.mapsdk.internal.to(this.f48784l);
        }
    }

    private void g() {
        int b17 = this.f48773a.b(com.tencent.mapsdk.internal.er.B);
        int b18 = this.f48773a.b(com.tencent.mapsdk.internal.er.C);
        java.lang.String a17 = this.f48773a.a(com.tencent.mapsdk.internal.er.D);
        org.json.JSONArray jSONArray = null;
        try {
            if (!android.text.TextUtils.isEmpty(a17)) {
                jSONArray = new org.json.JSONArray(a17);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mapsdk.core.utils.log.LogUtil.a(com.tencent.mapsdk.internal.kx.f50214o, "indoor auth init failed", e17);
        }
        if (b17 != -1 && b18 != -1 && jSONArray != null) {
            this.f48774b = new com.tencent.mapsdk.internal.fx(b17, b18, jSONArray);
        }
        com.tencent.mapsdk.vector.VectorMap vectorMap = this.f48776d;
        if (vectorMap != null) {
            vectorMap.a(c());
            if (b18 == 1) {
                this.f48776d.a(d());
            }
        }
    }

    private boolean h() {
        com.tencent.mapsdk.internal.fx fxVar = this.f48774b;
        return fxVar != null && fxVar.a();
    }

    private boolean i() {
        return this.f48778f;
    }

    private void j() {
        com.tencent.mapsdk.internal.ne neVar = this.f48777e;
        if (neVar == null) {
            return;
        }
        int i17 = neVar.N()[0];
        com.tencent.mapsdk.internal.ne neVar2 = this.f48777e;
        if (neVar2.f50520t.f52409b.f52444m >= i17) {
            this.f48786n = true;
        } else {
            neVar2.d(i17);
            this.f48786n = false;
        }
    }

    private void k() {
        com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding = this.f48779g;
        if (indoorBuilding != null) {
            java.lang.String buidlingId = indoorBuilding.getBuidlingId();
            int activeLevelIndex = this.f48779g.getActiveLevelIndex();
            java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel> levels = this.f48779g.getLevels();
            if (levels == null || activeLevelIndex >= levels.size()) {
                return;
            }
            java.lang.String name = levels.get(activeLevelIndex).getName();
            if (com.tencent.mapsdk.internal.hr.a(buidlingId) || com.tencent.mapsdk.internal.hr.a(name)) {
                return;
            }
            this.f48777e.a(buidlingId, name);
        }
    }

    private com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding l() {
        return this.f48779g;
    }

    private java.lang.String m() {
        com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding = this.f48779g;
        if (indoorBuilding == null) {
            return null;
        }
        return indoorBuilding.getBuidlingId();
    }

    private int n() {
        com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding = this.f48779g;
        if (indoorBuilding == null) {
            return -1;
        }
        return indoorBuilding.getActiveLevelIndex();
    }

    private java.lang.String[] o() {
        com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding = this.f48779g;
        if (indoorBuilding == null || indoorBuilding.getLevels() == null || this.f48779g.getLevels().isEmpty()) {
            return null;
        }
        java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel> levels = this.f48779g.getLevels();
        java.lang.String[] strArr = new java.lang.String[levels.size()];
        for (int i17 = 0; i17 < levels.size(); i17++) {
            strArr[i17] = levels.get(i17).getName();
        }
        return strArr;
    }

    private java.lang.String p() {
        com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding = this.f48779g;
        return indoorBuilding == null ? "" : indoorBuilding.getBuildingName();
    }

    private com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding q() {
        return this.f48779g;
    }

    private com.tencent.tencentmap.mapsdk.maps.TencentMap.OnScaleViewChangedListener f() {
        return this.f48782j;
    }

    public final int c() {
        com.tencent.mapsdk.internal.fx fxVar = this.f48774b;
        return (fxVar == null || !fxVar.b()) ? 0 : 1;
    }

    public final java.lang.String[] d() {
        com.tencent.mapsdk.internal.fx fxVar = this.f48774b;
        if (fxVar != null) {
            return fxVar.f49499f;
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.ox
    public final void e() {
        com.tencent.mapsdk.internal.tr trVar;
        M m17;
        if (!this.f48783k || (trVar = this.f48784l) == null || (m17 = trVar.e_) == 0) {
            return;
        }
        com.tencent.map.lib.models.GeoPoint geoPoint = new com.tencent.map.lib.models.GeoPoint();
        com.tencent.mapsdk.internal.tk tkVar = ((com.tencent.mapsdk.vector.VectorMap) m17).f52512o.f50506f;
        com.tencent.mapsdk.internal.qr qrVar = (com.tencent.mapsdk.internal.qr) tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass167(geoPoint), (com.tencent.mapsdk.internal.tk.AnonymousClass167) null);
        if (qrVar == null) {
            return;
        }
        final com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = new com.tencent.tencentmap.mapsdk.maps.model.LatLng((geoPoint.getLatitudeE6() * 1.0d) / 1000000.0d, (geoPoint.getLongitudeE6() * 1.0d) / 1000000.0d);
        final java.lang.String str = qrVar.f51027a;
        final java.lang.String str2 = qrVar.f51028b;
        final java.lang.String[] strArr = qrVar.f51030d;
        final int i17 = qrVar.f51029c;
        com.tencent.mapsdk.internal.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.ac.3
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mapsdk.internal.ac.this.a(str, str2, latLng, strArr, i17);
            }
        });
    }

    private void b(boolean z17) {
        int i17 = z17 ? com.tencent.mapsdk.internal.ac.a.f48797b : com.tencent.mapsdk.internal.ac.a.f48798c;
        this.f48775c = i17;
        a(i17);
    }

    private void c(int i17) {
        com.tencent.mapsdk.internal.ne neVar = this.f48777e;
        if (neVar == null) {
            return;
        }
        com.tencent.mapsdk.internal.hg hgVar = neVar.f49000c;
        com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding = this.f48779g;
        if (indoorBuilding != null) {
            java.lang.String buidlingId = indoorBuilding.getBuidlingId();
            if (hgVar != null && !android.text.TextUtils.isEmpty(buidlingId)) {
                hgVar.d().a(buidlingId).b();
            }
        }
        com.tencent.mapsdk.internal.tk tkVar = this.f48777e.f50506f;
        if (tkVar != null) {
            tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass164(i17));
        }
        e();
    }

    private void a(com.tencent.mapsdk.internal.fx fxVar) {
        if (fxVar != null) {
            this.f48774b = fxVar;
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50206g, "IndoorAuth:".concat(java.lang.String.valueOf(fxVar)));
            this.f48773a.a(com.tencent.mapsdk.internal.er.B, fxVar.f49496c);
            this.f48773a.a(com.tencent.mapsdk.internal.er.C, fxVar.f49497d);
            org.json.JSONArray jSONArray = fxVar.f49498e;
            if (jSONArray != null) {
                this.f48773a.a(com.tencent.mapsdk.internal.er.D, jSONArray.toString());
            }
            com.tencent.mapsdk.vector.VectorMap vectorMap = this.f48776d;
            if (vectorMap != null) {
                vectorMap.a(c());
                if (c() == 1) {
                    this.f48776d.a(d());
                }
            }
        } else {
            this.f48773a.a(new java.lang.String[]{com.tencent.mapsdk.internal.er.B, com.tencent.mapsdk.internal.er.C, com.tencent.mapsdk.internal.er.D});
        }
        if (this.f48774b == null) {
            this.f48774b = new com.tencent.mapsdk.internal.fx();
        }
        com.tencent.mapsdk.internal.ko.a(new com.tencent.mapsdk.internal.ac.AnonymousClass2());
    }

    @Override // com.tencent.mapsdk.internal.v.a
    public final boolean b() {
        int i17 = this.f48777e.N()[0];
        com.tencent.mapsdk.internal.ne neVar = this.f48777e;
        if (neVar.f50520t.f52409b.f52444m < i17 && this.f48786n) {
            this.f48786n = false;
            neVar.d(i17);
        }
        return false;
    }

    private void c(boolean z17) {
        com.tencent.mapsdk.internal.tk tkVar;
        com.tencent.mapsdk.vector.VectorMap vectorMap = this.f48776d;
        if (vectorMap == null || (tkVar = vectorMap.f52512o.f50506f) == null || tkVar.f51661e == 0) {
            return;
        }
        tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass173(z17));
    }

    @Override // com.tencent.mapsdk.internal.fm
    public final void b(int i17) {
        com.tencent.mapsdk.internal.tr trVar;
        if (!this.f48783k || (trVar = this.f48784l) == null || trVar.e_ == 0) {
            return;
        }
        com.tencent.mapsdk.internal.qs qsVar = trVar.f52198m;
    }

    public final void a(int i17) {
        int i18 = com.tencent.mapsdk.internal.ac.AnonymousClass4.f48795a[i17 - 1];
        if (i18 == 1) {
            a(true);
        } else if (i18 == 2 || i18 == 3) {
            a(false);
        }
    }

    public final void a(boolean z17) {
        this.f48783k = z17;
        if (this.f48777e == null) {
            return;
        }
        if (!h()) {
            this.f48777e.d(false);
            return;
        }
        this.f48777e.d(z17);
        if (z17 || !this.f48778f) {
            return;
        }
        a(null, null, null, null, -1);
    }

    public final void a(java.lang.String str, java.lang.String str2, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, java.lang.String[] strArr, int i17) {
        M m17;
        com.tencent.mapsdk.internal.qs qsVar;
        com.tencent.mapsdk.internal.hg hgVar;
        com.tencent.mapsdk.internal.qs qsVar2;
        com.tencent.mapsdk.internal.hg hgVar2;
        com.tencent.mapsdk.internal.tr trVar = this.f48784l;
        if (trVar == null || (m17 = trVar.e_) == 0) {
            return;
        }
        int q17 = ((com.tencent.mapsdk.vector.VectorMap) m17).q();
        if (str != null && strArr != null && strArr.length > 0 && i17 >= 0 && q17 >= 16) {
            if (!android.text.TextUtils.isEmpty(str) && this.f48781i <= 20.0d && !this.f48778f && (hgVar2 = this.f48777e.f49000c) != null) {
                hgVar2.d().a(str).c();
            }
            com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener = this.f48785m;
            if (onIndoorStateChangeListener != null && !this.f48778f) {
                this.f48778f = true;
                onIndoorStateChangeListener.onIndoorBuildingFocused();
            }
            j();
            if (this.f48785m != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.String str3 : strArr) {
                    arrayList.add(new com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel(str3));
                }
                try {
                    com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding = this.f48779g;
                    if (indoorBuilding != null && indoorBuilding.getBuidlingId().equals(str)) {
                        if (this.f48779g.getActiveLevelIndex() == i17) {
                            return;
                        }
                    }
                } catch (java.lang.Exception unused) {
                }
                com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding2 = this.f48779g;
                if ((indoorBuilding2 == null || !str.equals(indoorBuilding2.getBuidlingId())) && (hgVar = this.f48777e.f49000c) != null) {
                    hgVar.d().f49707a.a();
                    if (!android.text.TextUtils.isEmpty(str)) {
                        hgVar.d().a(str).a();
                    }
                }
                com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding3 = new com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding(str, str2, latLng, arrayList, i17);
                this.f48779g = indoorBuilding3;
                com.tencent.mapsdk.internal.tr trVar2 = this.f48784l;
                if (trVar2 != null && (qsVar2 = trVar2.f52198m) != null && qsVar2.f51048b) {
                    qsVar2.a(indoorBuilding3);
                }
                this.f48785m.onIndoorLevelActivated(this.f48779g);
                return;
            }
            return;
        }
        if (this.f48778f) {
            this.f48778f = false;
            this.f48779g = null;
            com.tencent.mapsdk.internal.tr trVar3 = this.f48784l;
            if (trVar3 != null && (qsVar = trVar3.f52198m) != null) {
                qsVar.a((com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding) null);
            }
            com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener2 = this.f48785m;
            if (onIndoorStateChangeListener2 != null) {
                onIndoorStateChangeListener2.onIndoorBuildingDeactivated();
            }
            j();
        }
    }

    @Override // com.tencent.mapsdk.internal.v.a
    public final boolean a(float f17, float f18) {
        if (this.f48786n) {
            int i17 = this.f48777e.N()[0];
            if (f18 <= com.tencent.mapsdk.internal.v.b.a(i17)) {
                this.f48786n = false;
                this.f48777e.d(i17);
            }
            if (f17 > f18) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.v.a
    public final boolean a() {
        return this.f48786n;
    }

    private void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mapsdk.internal.ne neVar = this.f48777e;
        if (neVar == null) {
            return;
        }
        neVar.a(str, str2);
    }

    private int a(java.lang.String str) {
        com.tencent.mapsdk.internal.ne neVar;
        com.tencent.mapsdk.internal.tk tkVar;
        com.tencent.mapsdk.vector.VectorMap vectorMap = this.f48776d;
        if (vectorMap == null || (neVar = vectorMap.f52512o) == null || (tkVar = neVar.f50506f) == null) {
            return -1;
        }
        return ((java.lang.Integer) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass50>) new com.tencent.mapsdk.internal.tk.AnonymousClass50(str), (com.tencent.mapsdk.internal.tk.AnonymousClass50) (-1))).intValue();
    }
}
