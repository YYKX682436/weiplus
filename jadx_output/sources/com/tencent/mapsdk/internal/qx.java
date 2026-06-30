package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class qx extends com.tencent.mapsdk.internal.po<com.tencent.mapsdk.internal.ao> implements com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit {

    /* renamed from: b, reason: collision with root package name */
    protected com.tencent.mapsdk.internal.qy f51088b;

    /* renamed from: d, reason: collision with root package name */
    protected final com.tencent.mapsdk.internal.pi f51089d;

    /* renamed from: p, reason: collision with root package name */
    protected com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable.OnSelectedListener f51090p;

    /* renamed from: q, reason: collision with root package name */
    protected com.tencent.mapsdk.internal.fu f51091q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mapsdk.internal.ib f51092r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mapsdk.internal.qx f51093s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List<com.tencent.mapsdk.internal.qx> f51094t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation f51095u;

    /* renamed from: v, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.nd f51096v;

    /* renamed from: w, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.bd f51097w;

    /* renamed from: x, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ib f51098x;

    /* renamed from: y, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.ao f51099y;

    /* renamed from: z, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f51100z;

    public qx(com.tencent.mapsdk.internal.ao aoVar, com.tencent.mapsdk.internal.az azVar, com.tencent.mapsdk.internal.qy qyVar) {
        super(azVar);
        this.f51091q = new com.tencent.mapsdk.internal.fu();
        this.f51098x = null;
        this.f51094t = new java.util.concurrent.CopyOnWriteArrayList();
        this.f51095u = com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation.ALONE;
        this.f51100z = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f51099y = aoVar;
        this.f51096v = azVar.c();
        this.f51097w = azVar.getMapContext();
        this.f51088b = qyVar;
        this.f51089d = new com.tencent.mapsdk.internal.pi(this, qyVar);
        setVisible(true);
        a(qyVar);
    }

    private boolean A() {
        com.tencent.mapsdk.internal.pi piVar = this.f51089d;
        if (piVar != null) {
            return piVar.f50628y;
        }
        return false;
    }

    private float B() {
        com.tencent.mapsdk.internal.pi piVar = this.f51089d;
        if (piVar != null) {
            return piVar.f50621r;
        }
        return 0.0f;
    }

    private float C() {
        com.tencent.mapsdk.internal.pi piVar = this.f51089d;
        if (piVar != null) {
            return piVar.f50622s;
        }
        return 0.0f;
    }

    private float D() {
        com.tencent.mapsdk.internal.pi piVar = this.f51089d;
        if (piVar != null) {
            return piVar.f50623t;
        }
        return 0.0f;
    }

    private float E() {
        com.tencent.mapsdk.internal.pi piVar = this.f51089d;
        if (piVar != null) {
            return piVar.f50624u;
        }
        return 0.0f;
    }

    private boolean F() {
        com.tencent.mapsdk.internal.qy qyVar = this.f51088b;
        if (qyVar != null) {
            return qyVar.f51114n;
        }
        return false;
    }

    private static boolean G() {
        return false;
    }

    private boolean H() {
        com.tencent.mapsdk.internal.qy qyVar = this.f51088b;
        if (qyVar != null) {
            return qyVar.f51126z;
        }
        return true;
    }

    private java.util.List<com.tencent.mapsdk.internal.qx> I() {
        return this.f51094t;
    }

    private com.tencent.mapsdk.internal.qx J() {
        return this.f51093s;
    }

    private com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation K() {
        return this.f51095u;
    }

    private void a(com.tencent.mapsdk.internal.ib ibVar) {
        this.f51092r = ibVar;
    }

    private void b(com.tencent.mapsdk.internal.ib ibVar) {
        if (ibVar == null) {
            return;
        }
        this.f51098x = ibVar;
        ibVar.a();
    }

    private void i() {
        com.tencent.mapsdk.internal.pi piVar = this.f51089d;
        if (piVar != null) {
            piVar.a(true);
        }
    }

    private com.tencent.map.lib.models.GeoPoint j() {
        return this.f51088b.f51109i;
    }

    private int k() {
        return this.f51088b.f51115o;
    }

    private float l() {
        return this.f51088b.f51113m;
    }

    private float m() {
        com.tencent.mapsdk.internal.pi piVar = this.f51089d;
        if (piVar != null) {
            return piVar.f50626w;
        }
        return 1.0f;
    }

    private float n() {
        com.tencent.mapsdk.internal.pi piVar = this.f51089d;
        if (piVar != null) {
            return piVar.f50627x;
        }
        return 1.0f;
    }

    private com.tencent.mapsdk.internal.qy z() {
        return this.f51088b;
    }

    public final void c(boolean z17) {
        com.tencent.mapsdk.internal.qy qyVar = this.f51088b;
        if (qyVar != null) {
            qyVar.f51125y = z17;
        }
        com.tencent.mapsdk.internal.pi piVar = this.f51089d;
        if (piVar != null) {
            piVar.d(z17);
            this.f51089d.a(true);
        }
    }

    public final float d() {
        return this.f51088b.f51111k;
    }

    public final float e() {
        return this.f51088b.f51112l;
    }

    public final com.tencent.mapsdk.internal.pi f() {
        return this.f51089d;
    }

    @Override // com.tencent.mapsdk.internal.au
    public final com.tencent.mapsdk.internal.ao f_() {
        return this.f51099y;
    }

    public final void g() {
        com.tencent.mapsdk.internal.ib ibVar = this.f51092r;
        if (ibVar != null) {
            ibVar.f49870b = false;
        }
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public final int getZIndex() {
        return this.f51088b.f51119s;
    }

    public final boolean h() {
        com.tencent.mapsdk.internal.pi piVar = this.f51089d;
        if (piVar == null) {
            return false;
        }
        return piVar.C;
    }

    @Override // com.tencent.mapsdk.internal.po
    public final void h_() {
        super.h_();
        g();
        for (com.tencent.mapsdk.internal.qx qxVar : this.f51094t) {
            if (b(qxVar)) {
                qxVar.remove();
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public final boolean isSelected() {
        return this.f51089d.N == 1;
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Visible
    public final boolean isVisible() {
        return this.f51089d.f50601J;
    }

    @Override // com.tencent.mapsdk.internal.po
    public final void j_() {
        int intValue;
        if (this.f51096v == null) {
            return;
        }
        com.tencent.mapsdk.internal.ib ibVar = this.f51098x;
        if (ibVar != null) {
            if (ibVar.f49872d) {
                this.f51098x = null;
            } else {
                ibVar.b();
            }
        }
        com.tencent.mapsdk.internal.ib ibVar2 = this.f51092r;
        if (ibVar2 != null && !ibVar2.f49872d) {
            ibVar2.b();
        }
        com.tencent.mapsdk.internal.pi piVar = this.f51089d;
        if (piVar != null) {
            com.tencent.mapsdk.internal.nd ndVar = this.f51096v;
            int a17 = piVar.I.a();
            if (a17 <= 0 || !ndVar.f50494c.containsKey(java.lang.Integer.valueOf(a17))) {
                com.tencent.mapsdk.core.utils.log.LogUtil.b("Marker", "addMarker GIcon before [" + a17 + "]");
                if (piVar.e()) {
                    com.tencent.mapsdk.internal.tk tkVar = ndVar.f50493b;
                    intValue = ((java.lang.Integer) tkVar.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass63>) new com.tencent.mapsdk.internal.tk.AnonymousClass63(piVar.f()), (com.tencent.mapsdk.internal.tk.AnonymousClass63) 0)).intValue();
                } else {
                    com.tencent.mapsdk.internal.tk tkVar2 = ndVar.f50493b;
                    intValue = ((java.lang.Integer) tkVar2.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass149>) new com.tencent.mapsdk.internal.tk.AnonymousClass149(piVar), (com.tencent.mapsdk.internal.tk.AnonymousClass149) 0)).intValue();
                }
                piVar.I.f50679m = intValue;
                com.tencent.mapsdk.core.utils.log.LogUtil.b("Marker", "addMarker GIcon after [" + intValue + "]");
                if (intValue > 0) {
                    com.tencent.mapsdk.internal.hl.f49771b.a(piVar.f50609f, piVar.d());
                    piVar.b(false);
                    piVar.a(false);
                    ndVar.f50495d.put(java.lang.Integer.valueOf(intValue), piVar);
                    com.tencent.mapsdk.core.utils.log.LogUtil.b("Marker", "mCurFrameDisplayMap: " + ndVar.f50495d.keySet());
                }
            } else {
                if (piVar.f50620q.get() > 0) {
                    piVar.f50619p = true;
                    piVar.f50620q.set(0);
                }
                if (piVar.f50619p) {
                    if (piVar.e()) {
                        com.tencent.mapsdk.internal.tk tkVar3 = ndVar.f50493b;
                        tkVar3.a(new com.tencent.mapsdk.internal.tk.AnonymousClass64(a17, piVar.f()));
                    } else {
                        com.tencent.mapsdk.internal.tk tkVar4 = ndVar.f50493b;
                        if (0 != tkVar4.f51661e) {
                            tkVar4.a(new com.tencent.mapsdk.internal.tk.AnonymousClass150(piVar));
                        }
                    }
                    if (piVar.B.get() > 0) {
                        piVar.A = true;
                        piVar.B.set(0);
                    }
                    if (piVar.A) {
                        if (!piVar.H) {
                            ndVar.f50496e.add(piVar.f50610g);
                        }
                        com.tencent.mapsdk.internal.hl.f49771b.a(piVar.f50609f, piVar.d());
                        piVar.b(false);
                    }
                }
                piVar.a(false);
                ndVar.f50495d.put(java.lang.Integer.valueOf(a17), piVar);
            }
        }
        if (!this.f51100z.get() || a() <= 0) {
            return;
        }
        com.tencent.mapsdk.internal.qx qxVar = this.f51093s;
        if (qxVar == null) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b("Marker", "setMarkerMainSubRelation parent[-1] => child[" + getId() + " :" + a() + "] relation:" + this.f51095u);
            this.f51097w.i().a(-1, a(), this.f51095u == com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation.TOGETHER);
            this.f51100z.set(false);
            return;
        }
        java.lang.String id6 = qxVar.getId();
        int a18 = this.f51093s.a();
        if (a18 > 0) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b("Marker", "setMarkerMainSubRelation parent[" + id6 + ":" + a18 + "] => child[" + getId() + " :" + a() + "] relation:" + this.f51095u);
            this.f51097w.i().a(a18, a(), this.f51095u == com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation.TOGETHER);
            this.f51100z.set(false);
        }
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public final boolean onTap(float f17, float f18) {
        com.tencent.mapsdk.internal.bd bdVar;
        com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable.OnSelectedListener onSelectedListener;
        if (!isVisible() || this.f51088b.f51109i == null || (bdVar = this.f51097w) == null) {
            return false;
        }
        com.tencent.mapsdk.engine.jni.models.TappedElement a17 = bdVar.i().a(f17, f18);
        boolean z17 = a17 != null && a17.itemId == ((long) a());
        if (z17) {
            this.f51089d.b(1);
        } else {
            this.f51089d.b(0);
        }
        if (z17 && (onSelectedListener = this.f51090p) != null) {
            onSelectedListener.onSelected(this);
        }
        return z17;
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public final void setLevel(int i17) {
        com.tencent.mapsdk.internal.qy qyVar = this.f51088b;
        qyVar.f51120t = i17;
        this.f51088b = qyVar;
        com.tencent.mapsdk.internal.pi piVar = this.f51089d;
        if (piVar != null) {
            piVar.F = i17;
            piVar.a(true);
        }
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public final void setSelected(boolean z17) {
        if (z17) {
            this.f51089d.b(1);
        } else {
            this.f51089d.b(0);
        }
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public final void setSelectedListener(com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable.OnSelectedListener onSelectedListener) {
        this.f51090p = onSelectedListener;
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Visible
    public final void setVisible(boolean z17) {
        super.setVisible(z17);
        com.tencent.mapsdk.internal.pi piVar = this.f51089d;
        piVar.a(piVar.f50601J != z17);
        piVar.f50601J = z17;
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public final void setZIndex(int i17) {
        com.tencent.mapsdk.internal.qy qyVar = this.f51088b;
        qyVar.f51119s = i17;
        this.f51088b = qyVar;
        com.tencent.mapsdk.internal.pi piVar = this.f51089d;
        if (piVar != null) {
            piVar.G = i17;
            piVar.a(true);
        }
    }

    public final java.lang.String toString() {
        return "GLMarkerOverlayImpl{id='" + getId() + "'nativeId='" + a() + "'tag='" + getTag() + "'}";
    }

    public final void a(com.tencent.mapsdk.internal.qy qyVar) {
        if (qyVar == null) {
            return;
        }
        this.f51088b = qyVar;
        this.f51089d.a(qyVar);
        setTag(qyVar.A);
    }

    private void e(boolean z17) {
        this.f51088b.f51116p = z17;
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: b */
    public final android.graphics.Rect getBound(com.tencent.mapsdk.internal.ey eyVar) {
        com.tencent.mapsdk.internal.qy qyVar;
        if (this.f51089d == null || (qyVar = this.f51088b) == null || qyVar.f51109i == null) {
            return null;
        }
        if (A()) {
            com.tencent.map.lib.models.GeoPoint geoPoint = this.f51088b.f51109i;
            com.tencent.mapsdk.internal.fu fuVar = new com.tencent.mapsdk.internal.fu(0.0d, 0.0d);
            if (geoPoint != null) {
                fuVar.f49467a = geoPoint.getLongitudeE6();
                fuVar.f49468b = geoPoint.getLatitudeE6();
            }
            this.f51091q = fuVar;
        } else {
            this.f51091q = eyVar.a(this.f51088b.f51109i);
        }
        com.tencent.mapsdk.internal.fu fuVar2 = new com.tencent.mapsdk.internal.fu();
        com.tencent.mapsdk.internal.fu fuVar3 = new com.tencent.mapsdk.internal.fu();
        android.graphics.Bitmap d17 = this.f51089d.d();
        if (d17 == null) {
            return null;
        }
        int width = d17.getWidth();
        int height = d17.getHeight();
        com.tencent.mapsdk.internal.fu fuVar4 = this.f51091q;
        fuVar2.f49467a = fuVar4.f49467a;
        fuVar3.f49467a = fuVar4.f49467a + width;
        fuVar2.f49468b = fuVar4.f49468b;
        fuVar3.f49468b = fuVar4.f49468b + height;
        com.tencent.mapsdk.internal.qy qyVar2 = this.f51088b;
        int i17 = (int) (qyVar2.f51111k * width);
        int i18 = (int) (qyVar2.f51112l * height);
        double d18 = i17;
        fuVar2.f49467a -= d18;
        fuVar3.f49467a -= d18;
        double d19 = i18;
        fuVar2.f49468b -= d19;
        fuVar3.f49468b -= d19;
        int i19 = qyVar2.f51117q;
        int i27 = qyVar2.f51118r;
        double d27 = i19;
        fuVar2.f49467a += d27;
        fuVar3.f49467a += d27;
        double d28 = i27;
        fuVar2.f49468b += d28;
        fuVar3.f49468b += d28;
        com.tencent.map.lib.models.GeoPoint a17 = eyVar.a(fuVar2);
        com.tencent.map.lib.models.GeoPoint a18 = eyVar.a(fuVar3);
        return new android.graphics.Rect(a17.getLongitudeE6(), a17.getLatitudeE6(), a18.getLongitudeE6(), a18.getLatitudeE6());
    }

    public final void d(boolean z17) {
        com.tencent.mapsdk.internal.pi piVar = this.f51089d;
        if (piVar == null) {
            return;
        }
        piVar.C = z17;
        piVar.a(true);
    }

    private void c(com.tencent.mapsdk.internal.qx qxVar) {
        this.f51100z.set(this.f51093s != qxVar);
        this.f51093s = qxVar;
        if (qxVar != null) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b("Marker", "this[" + getId() + " :" + a() + "] set parent => parent:[" + qxVar.getId() + ":" + qxVar.a() + "] changed:" + this.f51100z.get());
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b("Marker", "this[" + getId() + " :" + a() + "] set parent => null changed:" + this.f51100z.get());
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: a */
    public final android.graphics.Rect getScreenBound(com.tencent.mapsdk.internal.ey eyVar) {
        com.tencent.mapsdk.internal.qy qyVar;
        int i17;
        int i18;
        if (this.f51089d == null || (qyVar = this.f51088b) == null || qyVar.f51109i == null) {
            return null;
        }
        if (A()) {
            com.tencent.map.lib.models.GeoPoint geoPoint = this.f51088b.f51109i;
            com.tencent.mapsdk.internal.fu fuVar = new com.tencent.mapsdk.internal.fu(0.0d, 0.0d);
            if (geoPoint != null) {
                fuVar.f49467a = geoPoint.getLongitudeE6();
                fuVar.f49468b = geoPoint.getLatitudeE6();
            }
            this.f51091q = fuVar;
        } else {
            this.f51091q = eyVar.a(this.f51088b.f51109i);
        }
        com.tencent.mapsdk.internal.fu fuVar2 = new com.tencent.mapsdk.internal.fu();
        com.tencent.mapsdk.internal.fu fuVar3 = new com.tencent.mapsdk.internal.fu();
        android.graphics.Bitmap d17 = this.f51089d.d();
        if (d17 != null) {
            i17 = d17.getWidth();
            i18 = d17.getHeight();
        } else {
            i17 = 0;
            i18 = 0;
        }
        com.tencent.mapsdk.internal.fu fuVar4 = this.f51091q;
        fuVar2.f49467a = fuVar4.f49467a;
        fuVar3.f49467a = fuVar4.f49467a + i17;
        fuVar2.f49468b = fuVar4.f49468b;
        fuVar3.f49468b = fuVar4.f49468b + i18;
        com.tencent.mapsdk.internal.qy qyVar2 = this.f51088b;
        int i19 = (int) (qyVar2.f51111k * i17);
        int i27 = (int) (qyVar2.f51112l * i18);
        double d18 = i19;
        fuVar2.f49467a -= d18;
        fuVar3.f49467a -= d18;
        double d19 = i27;
        fuVar2.f49468b -= d19;
        fuVar3.f49468b -= d19;
        int i28 = qyVar2.f51117q;
        int i29 = qyVar2.f51118r;
        double d27 = i28;
        fuVar2.f49467a += d27;
        fuVar3.f49467a += d27;
        double d28 = i29;
        fuVar2.f49468b += d28;
        fuVar3.f49468b += d28;
        return new android.graphics.Rect((int) fuVar2.f49467a, (int) fuVar2.f49468b, (int) fuVar3.f49467a, (int) fuVar3.f49468b);
    }

    public final void b(float f17, float f18) {
        com.tencent.mapsdk.internal.pi piVar = this.f51089d;
        if (piVar != null) {
            piVar.f50626w = f17;
            piVar.f50627x = f18;
            piVar.a(true);
            this.f51089d.a(true);
        }
    }

    private void a(java.lang.String str, android.graphics.Bitmap... bitmapArr) {
        a(str, false, bitmapArr);
    }

    private void a(int i17, int i18) {
        com.tencent.mapsdk.internal.qy qyVar = this.f51088b;
        qyVar.f51117q = i17;
        qyVar.f51118r = i18;
        com.tencent.mapsdk.internal.pi piVar = this.f51089d;
        if (piVar != null) {
            piVar.f50614k = i17;
            piVar.f50615l = i18;
            piVar.a(true);
            this.f51089d.a(true);
        }
    }

    public final void b(boolean z17) {
        com.tencent.mapsdk.internal.qy qyVar = this.f51088b;
        if (qyVar != null) {
            qyVar.f51124x = z17;
        }
        com.tencent.mapsdk.internal.pi piVar = this.f51089d;
        if (piVar != null) {
            piVar.c(z17);
            this.f51089d.a(true);
        }
    }

    public final void a(java.lang.String str, boolean z17, android.graphics.Bitmap... bitmapArr) {
        this.f51088b = this.f51088b.a(str, bitmapArr);
        com.tencent.mapsdk.internal.pi piVar = this.f51089d;
        if (piVar != null) {
            piVar.H = z17;
            piVar.a(str, bitmapArr);
            this.f51089d.a(true);
        }
    }

    public final boolean b(com.tencent.mapsdk.internal.qx qxVar) {
        com.tencent.mapsdk.core.utils.log.LogUtil.b("Marker", "this[" + getId() + " :" + a() + "] removeChild => child[" + qxVar.getId() + ":" + qxVar.a() + "]");
        boolean remove = this.f51094t.remove(qxVar);
        if (remove) {
            qxVar.c((com.tencent.mapsdk.internal.qx) null);
        }
        return remove;
    }

    public final void a(com.tencent.map.lib.models.GeoPoint geoPoint) {
        com.tencent.mapsdk.internal.qy qyVar = this.f51088b;
        qyVar.f51109i = geoPoint;
        this.f51088b = qyVar;
        com.tencent.mapsdk.internal.pi piVar = this.f51089d;
        if (piVar != null) {
            if (geoPoint != null) {
                double d17 = piVar.f50628y ? 1.0d : 1000000.0d;
                piVar.f50612i = geoPoint.getLongitudeE6() / d17;
                piVar.f50613j = geoPoint.getLatitudeE6() / d17;
                piVar.a(true);
            }
            this.f51089d.a(true);
        }
    }

    public final void a(int i17) {
        com.tencent.mapsdk.internal.qy qyVar = this.f51088b;
        qyVar.f51115o = i17;
        this.f51088b = qyVar;
        com.tencent.mapsdk.internal.pi piVar = this.f51089d;
        if (piVar != null) {
            piVar.a(i17);
            this.f51089d.a(true);
        }
    }

    public final void a(float f17) {
        com.tencent.mapsdk.internal.qy qyVar = this.f51088b;
        qyVar.f51113m = f17;
        this.f51088b = qyVar;
        com.tencent.mapsdk.internal.pi piVar = this.f51089d;
        if (piVar != null) {
            piVar.a(f17);
            this.f51089d.a(true);
        }
    }

    public final void a(float f17, float f18) {
        this.f51088b = this.f51088b.a(f17, f18);
        com.tencent.mapsdk.internal.pi piVar = this.f51089d;
        if (piVar != null) {
            piVar.a(f17, f18);
            this.f51089d.a(true);
        }
    }

    public final void a(boolean z17) {
        com.tencent.mapsdk.internal.pi piVar = this.f51089d;
        if (piVar != null) {
            piVar.f50628y = z17;
            piVar.a(true);
        }
    }

    public final void a(com.tencent.mapsdk.internal.qx qxVar) {
        com.tencent.mapsdk.core.utils.log.LogUtil.b("Marker", "this[" + getId() + " :" + a() + "] addChild => child[" + qxVar.getId() + ":" + qxVar.a() + "]");
        this.f51094t.add(qxVar);
        qxVar.c(this);
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation markerCollisionRelation) {
        this.f51095u = markerCollisionRelation;
    }
}
