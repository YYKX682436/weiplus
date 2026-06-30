package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class qv extends com.tencent.mapsdk.internal.po {
    private boolean A;
    private com.tencent.mapsdk.internal.ao B;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mapsdk.internal.fy f51071b;

    /* renamed from: d, reason: collision with root package name */
    public int[] f51072d;

    /* renamed from: p, reason: collision with root package name */
    public int[] f51073p;

    /* renamed from: q, reason: collision with root package name */
    public int f51074q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.map.lib.models.GeoPoint f51075r;

    /* renamed from: s, reason: collision with root package name */
    public int f51076s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mapsdk.internal.qv.a f51077t;

    /* renamed from: u, reason: collision with root package name */
    private com.tencent.mapsdk.internal.bd f51078u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f51079v;

    /* renamed from: w, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable.OnSelectedListener f51080w;

    /* renamed from: x, reason: collision with root package name */
    private float f51081x;

    /* renamed from: y, reason: collision with root package name */
    private int f51082y;

    /* renamed from: z, reason: collision with root package name */
    private com.tencent.mapsdk.internal.nd f51083z;

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f51084a;

        /* renamed from: b, reason: collision with root package name */
        public int f51085b;
    }

    public qv(com.tencent.mapsdk.internal.ao aoVar, com.tencent.mapsdk.internal.az azVar, com.tencent.mapsdk.internal.fy fyVar) {
        super(azVar);
        this.f51079v = true;
        this.f51076s = -1;
        this.f51081x = -1.0f;
        this.f51082y = -1;
        this.B = aoVar;
        this.f51083z = azVar.c();
        a(fyVar);
    }

    private int A() {
        return this.f51074q;
    }

    private boolean B() {
        return this.f51071b.f49523w;
    }

    private boolean C() {
        return this.f51071b.f49526z;
    }

    private boolean D() {
        return this.f51071b.B;
    }

    private int E() {
        return this.f51071b.C;
    }

    private boolean F() {
        return this.f51071b.O;
    }

    private float G() {
        return this.f51071b.f49524x;
    }

    private float H() {
        com.tencent.mapsdk.internal.fy fyVar = this.f51071b;
        if (fyVar == null) {
            return 1.0f;
        }
        return fyVar.A;
    }

    private com.tencent.mapsdk.internal.qv.a I() {
        return this.f51077t;
    }

    private java.lang.String J() {
        com.tencent.mapsdk.internal.fy fyVar = this.f51071b;
        int[] iArr = fyVar.f49518r;
        if (iArr != null && iArr.length > 0) {
            int i17 = iArr[0];
            if (i17 == 33) {
                return com.tencent.mapsdk.internal.fy.f49509j;
            }
            if (i17 == 20) {
                return com.tencent.mapsdk.internal.fy.f49510k;
            }
        }
        return com.tencent.mapsdk.internal.hr.a(fyVar.f49525y) ? com.tencent.mapsdk.internal.fy.f49508i : this.f51071b.f49525y;
    }

    private int K() {
        return this.f51076s;
    }

    private boolean L() {
        return this.f51071b.D;
    }

    private boolean M() {
        return this.f51071b.E;
    }

    private android.graphics.Rect N() {
        int i17;
        android.graphics.Rect rect;
        java.util.ArrayList<com.tencent.map.lib.models.GeoPoint> arrayList = this.f51071b.f49512l;
        if (arrayList != null && !arrayList.isEmpty() && (i17 = this.f51074q) >= 0 && i17 < arrayList.size()) {
            java.util.List<com.tencent.map.lib.models.GeoPoint> subList = arrayList.subList(this.f51074q, arrayList.size());
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
                this.f51071b.F = rect;
            }
        }
        return this.f51071b.F;
    }

    private java.lang.String O() {
        return this.f51071b.H;
    }

    private float P() {
        return this.f51071b.I;
    }

    private int[] Q() {
        com.tencent.mapsdk.internal.fy fyVar = this.f51071b;
        return new int[]{fyVar.f49511J, fyVar.K};
    }

    private java.util.List<java.lang.Integer> R() {
        return this.f51071b.L;
    }

    private void c(float f17) {
        com.tencent.mapsdk.internal.fy fyVar = this.f51071b;
        if (fyVar == null || f17 < 0.0f || f17 > 1.0f) {
            return;
        }
        fyVar.A = f17;
    }

    private java.util.ArrayList<com.tencent.map.lib.models.GeoPoint> e() {
        return this.f51071b.f49513m;
    }

    private int[] f() {
        return this.f51072d;
    }

    private int[] g() {
        return this.f51073p;
    }

    private boolean h() {
        return this.f51071b.f49522v;
    }

    private int[] i() {
        return this.f51071b.f49519s;
    }

    private int[] j() {
        return this.f51071b.f49520t;
    }

    private float k() {
        return this.f51071b.f49521u;
    }

    private int[] l() {
        return this.f51071b.f49514n;
    }

    private int[] m() {
        return this.f51071b.f49515o;
    }

    private java.lang.String[] n() {
        return this.f51071b.f49516p;
    }

    private com.tencent.map.lib.models.GeoPoint z() {
        return this.f51075r;
    }

    @Override // com.tencent.mapsdk.internal.au
    /* renamed from: a */
    public final android.graphics.Rect getScreenBound(com.tencent.mapsdk.internal.ey eyVar) {
        android.graphics.Rect bound = getBound(eyVar);
        if (bound == null) {
            return null;
        }
        com.tencent.map.lib.models.GeoPoint geoPoint = new com.tencent.map.lib.models.GeoPoint(bound.top, bound.left);
        com.tencent.map.lib.models.GeoPoint geoPoint2 = new com.tencent.map.lib.models.GeoPoint(bound.bottom, bound.right);
        com.tencent.mapsdk.internal.fu a17 = eyVar.a(geoPoint);
        com.tencent.mapsdk.internal.fu a18 = eyVar.a(geoPoint2);
        return new android.graphics.Rect((int) a17.f49467a, (int) a17.f49468b, (int) a18.f49467a, (int) a18.f49468b);
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au
    /* renamed from: b */
    public final android.graphics.Rect getBound(com.tencent.mapsdk.internal.ey eyVar) {
        java.util.ArrayList<com.tencent.map.lib.models.GeoPoint> arrayList;
        com.tencent.mapsdk.internal.fy fyVar = this.f51071b;
        if (fyVar == null || (arrayList = fyVar.f49513m) == null || arrayList.isEmpty()) {
            return null;
        }
        java.util.Iterator<com.tencent.map.lib.models.GeoPoint> it = this.f51071b.f49513m.iterator();
        int i17 = Integer.MAX_VALUE;
        int i18 = Integer.MIN_VALUE;
        int i19 = Integer.MIN_VALUE;
        int i27 = Integer.MAX_VALUE;
        while (it.hasNext()) {
            com.tencent.map.lib.models.GeoPoint next = it.next();
            int latitudeE6 = next.getLatitudeE6();
            int longitudeE6 = next.getLongitudeE6();
            if (latitudeE6 > i18) {
                i18 = latitudeE6;
            }
            if (latitudeE6 < i27) {
                i27 = latitudeE6;
            }
            if (longitudeE6 > i19) {
                i19 = longitudeE6;
            }
            if (longitudeE6 < i17) {
                i17 = longitudeE6;
            }
        }
        return new android.graphics.Rect(i17, i18, i19, i27);
    }

    public final void d() {
        com.tencent.mapsdk.internal.qv.a aVar = this.f51077t;
        if (aVar != null) {
            aVar.f51084a = -1;
            w();
        }
    }

    @Override // com.tencent.mapsdk.internal.au
    public final com.tencent.mapsdk.internal.ao f_() {
        return this.B;
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public final int getLevel() {
        return this.f51071b.M;
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public final int getZIndex() {
        return this.f51071b.G;
    }

    @Override // com.tencent.mapsdk.internal.po
    public final void h_() {
        this.A = true;
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public final boolean isSelected() {
        return this.f51079v;
    }

    @Override // com.tencent.mapsdk.internal.po
    public final void j_() {
        com.tencent.mapsdk.internal.nd ndVar = this.f51083z;
        if (ndVar == null) {
            return;
        }
        com.tencent.mapsdk.internal.bd bdVar = ndVar.f50492a;
        this.f51078u = bdVar;
        com.tencent.mapsdk.internal.tr trVar = (com.tencent.mapsdk.internal.tr) bdVar.d();
        if (trVar == null) {
            return;
        }
        if (this.A && this.f51076s != -1) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50206g, "deleteLine..." + this.f51076s);
            com.tencent.mapsdk.vector.VectorMap vectorMap = (com.tencent.mapsdk.vector.VectorMap) trVar.e_;
            vectorMap.f52512o.f50510j.b(this);
            vectorMap.f52512o.f50522v = true;
            com.tencent.mapsdk.internal.tk i17 = this.f51078u.i();
            i17.a(new com.tencent.mapsdk.internal.tk.AnonymousClass131(this.f51076s, this.f51071b.B));
            this.f51076s = -1;
            return;
        }
        float f17 = ndVar.f50492a.c().A.f52409b.f52443l;
        float f18 = this.f51081x;
        if (f18 == -1.0f || f18 != f17) {
            this.f51081x = f17;
        }
        if (this.f51076s == -1) {
            com.tencent.mapsdk.internal.tk i18 = this.f51078u.i();
            this.f51076s = ((java.lang.Integer) i18.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass126>) new com.tencent.mapsdk.internal.tk.AnonymousClass126(this), (com.tencent.mapsdk.internal.tk.AnonymousClass126) (-1))).intValue();
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50206g, "createLine..." + this.f51076s);
        }
        if (v()) {
            com.tencent.mapsdk.internal.tk i19 = this.f51078u.i();
            i19.a(new com.tencent.mapsdk.internal.tk.AnonymousClass127(this));
        }
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public final boolean onTap(float f17, float f18) {
        com.tencent.mapsdk.engine.jni.models.TappedElement a17;
        com.tencent.mapsdk.internal.bd bdVar = this.f51078u;
        return (bdVar == null || (a17 = bdVar.i().a(f17, f18)) == null || a17.itemId != ((long) this.f51076s)) ? false : true;
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public final void setSelected(boolean z17) {
        this.f51079v = z17;
        com.tencent.mapsdk.internal.bd bdVar = this.f51078u;
        if (bdVar == null || bdVar.i() == null) {
            return;
        }
        com.tencent.mapsdk.internal.tk i17 = this.f51078u.i();
        i17.a(new com.tencent.mapsdk.internal.tk.AnonymousClass129(this));
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public final void setZIndex(int i17) {
        this.f51071b.G = i17;
        com.tencent.mapsdk.internal.bd bdVar = this.f51078u;
        if (bdVar == null || bdVar.i() == null) {
            return;
        }
        this.f51078u.i().a(this.f51082y, i17);
    }

    @java.lang.Deprecated
    private void c(java.lang.String str) {
        this.f51071b.f49525y = str;
    }

    private void b(float f17) {
        this.f51071b.f49521u = f17;
    }

    public final void a(int i17, com.tencent.map.lib.models.GeoPoint geoPoint) {
        this.f51074q = i17;
        this.f51075r = geoPoint;
        w();
    }

    private void b(java.lang.String str) {
        this.f51071b.f49525y = str;
    }

    private void b(boolean z17) {
        this.f51071b.E = z17;
    }

    private void a(boolean z17) {
        this.f51071b.f49523w = z17;
    }

    private static android.graphics.Rect b(java.util.List<com.tencent.map.lib.models.GeoPoint> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        com.tencent.map.lib.models.GeoPoint geoPoint = list.get(0);
        int longitudeE6 = geoPoint.getLongitudeE6();
        int longitudeE62 = geoPoint.getLongitudeE6();
        int latitudeE6 = geoPoint.getLatitudeE6();
        int latitudeE62 = geoPoint.getLatitudeE6();
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.tencent.map.lib.models.GeoPoint geoPoint2 = list.get(i17);
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
        return new android.graphics.Rect(longitudeE6, latitudeE6, longitudeE62, latitudeE62);
    }

    private void a(float f17) {
        this.f51071b.f49524x = f17;
    }

    private void a(int[] iArr) {
        this.f51071b.f49520t = iArr;
    }

    private void a(int i17, int i18) {
        com.tencent.mapsdk.internal.qv.a aVar = new com.tencent.mapsdk.internal.qv.a();
        this.f51077t = aVar;
        aVar.f51084a = i17;
        aVar.f51085b = i18;
        w();
    }

    @java.lang.Deprecated
    private void a(java.lang.String str) {
        this.f51071b.f49525y = str;
    }

    private void a(int i17) {
        this.f51076s = i17;
    }

    public final void a(com.tencent.mapsdk.internal.fy fyVar) {
        if (fyVar != null && fyVar.a()) {
            if (fyVar.equals(this.f51071b)) {
                return;
            }
            w();
            this.f51071b = fyVar;
            this.f51072d = fyVar.f49517q;
            this.f51073p = fyVar.f49518r;
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c("LineOptions不能为空！");
    }

    private void a(java.util.List<java.lang.Integer> list) {
        this.f51071b.b(list);
    }
}
