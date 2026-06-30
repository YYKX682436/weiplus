package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public abstract class po<D extends com.tencent.mapsdk.internal.ao> extends com.tencent.mapsdk.internal.au<D> implements com.tencent.mapsdk.internal.ev {
    protected com.tencent.tencentmap.mapsdk.maps.model.IndoorInfo b_;

    /* renamed from: d, reason: collision with root package name */
    private boolean f50670d;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.az f50680n;

    /* renamed from: o, reason: collision with root package name */
    volatile boolean f50681o;

    /* renamed from: p, reason: collision with root package name */
    private java.lang.Object f50682p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f50683q;

    /* renamed from: r, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable.OnSelectedListener f50684r;

    /* renamed from: s, reason: collision with root package name */
    private float f50685s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f50686t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f50687u;

    /* renamed from: b, reason: collision with root package name */
    private boolean f50669b = false;

    /* renamed from: e, reason: collision with root package name */
    protected float f50671e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    protected int f50672f = android.graphics.Color.argb(17, 0, 163, 255);

    /* renamed from: g, reason: collision with root package name */
    protected int f50673g = android.graphics.Color.argb(255, 0, 163, 255);

    /* renamed from: h, reason: collision with root package name */
    protected float f50674h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    protected boolean f50675i = true;

    /* renamed from: j, reason: collision with root package name */
    protected boolean f50676j = false;

    /* renamed from: k, reason: collision with root package name */
    protected java.util.concurrent.atomic.AtomicInteger f50677k = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: l, reason: collision with root package name */
    protected int f50678l = 2;

    /* renamed from: m, reason: collision with root package name */
    public int f50679m = -1;

    /* renamed from: v, reason: collision with root package name */
    private final long f50688v = java.lang.System.nanoTime();

    public po(com.tencent.mapsdk.internal.az azVar) {
        this.f50680n = azVar;
    }

    private com.tencent.mapsdk.internal.az d() {
        return this.f50680n;
    }

    private void e() {
        this.f50681o = true;
    }

    private com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable.OnSelectedListener f() {
        return this.f50684r;
    }

    private static void g() {
    }

    private static void h() {
    }

    public int a() {
        return this.f50679m;
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public android.graphics.Rect getBound(com.tencent.mapsdk.internal.ey eyVar) {
        return new android.graphics.Rect();
    }

    public int getFillColor() {
        return this.f50672f;
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    public java.util.List<com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable<com.tencent.mapsdk.internal.ey>> getGroupBounds() {
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add(this);
        return arrayList;
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.model.IOverlay
    public java.lang.String getId() {
        return this.c_;
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public int getLevel() {
        return this.f50678l;
    }

    public float getRotation() {
        return this.f50685s;
    }

    public int getStrokeColor() {
        return this.f50673g;
    }

    public float getStrokeWidth() {
        return this.f50671e;
    }

    public java.lang.Object getTag() {
        return this.f50682p;
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public int getZIndex() {
        return (int) this.f50674h;
    }

    public void h_() {
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public boolean handleOnTap() {
        return false;
    }

    public boolean isClickable() {
        return this.f50670d;
    }

    public boolean isDraggable() {
        return this.f50686t;
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public boolean isRemoved() {
        return this.f50687u;
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public boolean isSelected() {
        return this.f50683q;
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Visible
    public boolean isVisible() {
        return this.b_ != null ? this.f50675i && this.f50669b : this.f50675i;
    }

    public void j_() {
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.mapsdk.internal.ez
    public final long o() {
        return this.f50688v;
    }

    public void p() {
    }

    @Override // com.tencent.mapsdk.internal.ev
    public boolean q() {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.ev
    public final void r() {
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public void releaseData() {
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public final void remove() {
        this.f50684r = null;
        this.f50680n.d(getId());
        h_();
        this.f50687u = true;
    }

    @Override // com.tencent.mapsdk.internal.ex
    public final com.tencent.tencentmap.mapsdk.maps.model.IndoorInfo s() {
        return this.b_;
    }

    public void setClickable(boolean z17) {
        this.f50670d = z17;
    }

    public void setDraggable(boolean z17) {
        this.f50686t = z17;
    }

    public void setFillColor(int i17) {
        this.f50672f = i17;
        w();
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public void setLevel(int i17) {
        this.f50678l = i17;
        w();
    }

    public void setRotation(float f17) {
        this.f50685s = f17;
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public void setSelected(boolean z17) {
        this.f50683q = z17;
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public void setSelectedListener(com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable.OnSelectedListener onSelectedListener) {
        this.f50684r = onSelectedListener;
    }

    public void setStrokeColor(int i17) {
        this.f50673g = i17;
        w();
    }

    public void setStrokeWidth(float f17) {
        this.f50671e = f17;
        w();
    }

    public void setTag(java.lang.Object obj) {
        this.f50682p = obj;
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Visible
    public void setVisible(boolean z17) {
        this.f50675i = z17;
        w();
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public void setZIndex(int i17) {
        setZIndex(i17);
    }

    @Override // com.tencent.mapsdk.internal.ex
    public final boolean t() {
        return this.f50669b;
    }

    @Override // com.tencent.mapsdk.internal.ex
    public void u() {
        if (this.b_ != null) {
            this.f50669b = false;
            setVisible(false);
        }
        p();
    }

    public final boolean v() {
        if (this.f50677k.get() > 0) {
            this.f50676j = true;
            this.f50677k.set(0);
        }
        return this.f50676j;
    }

    public void w() {
        if (this.f50681o) {
            return;
        }
        this.f50677k.incrementAndGet();
        this.f50676j = true;
    }

    public final void x() {
        this.f50681o = false;
        w();
    }

    public final java.lang.String y() {
        return this.c_;
    }

    private void a(int i17) {
        this.f50679m = i17;
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public void setZIndex(float f17) {
        this.f50674h = f17;
        w();
    }

    @Override // com.tencent.mapsdk.internal.ex
    public final void a(com.tencent.tencentmap.mapsdk.maps.model.IndoorInfo indoorInfo) {
        this.b_ = indoorInfo;
    }

    @Override // com.tencent.mapsdk.internal.ex
    public void a(com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding) {
        com.tencent.tencentmap.mapsdk.maps.model.IndoorInfo indoorInfo = this.b_;
        if (indoorInfo != null) {
            boolean equals = indoorInfo.toString().equals(indoorBuilding.toString());
            this.f50669b = equals;
            setVisible(equals);
        }
        p();
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.mapsdk.internal.et
    public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
        com.tencent.mapsdk.internal.az azVar;
        boolean v17 = v();
        j_();
        if (v17 && (azVar = this.f50680n) != null) {
            azVar.H();
        }
        this.f50676j = false;
    }
}
