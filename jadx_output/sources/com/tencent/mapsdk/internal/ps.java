package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ps extends com.tencent.mapsdk.internal.au<com.tencent.mapsdk.internal.am> implements com.tencent.mapsdk.internal.am, com.tencent.mapsdk.internal.oz {

    /* renamed from: d, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.tr f50758d;

    /* renamed from: e, reason: collision with root package name */
    private android.view.View f50759e;

    /* renamed from: j, reason: collision with root package name */
    private com.tencent.map.lib.models.GeoPoint f50764j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f50765k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f50766l;

    /* renamed from: o, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.an f50769o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f50770p;

    /* renamed from: f, reason: collision with root package name */
    private int f50760f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f50761g = 0;

    /* renamed from: h, reason: collision with root package name */
    private float f50762h = 0.5f;

    /* renamed from: i, reason: collision with root package name */
    private float f50763i = 0.5f;

    /* renamed from: m, reason: collision with root package name */
    private boolean f50767m = false;

    /* renamed from: n, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.fu f50768n = new com.tencent.mapsdk.internal.fu();

    /* renamed from: q, reason: collision with root package name */
    private boolean f50771q = true;

    public ps(com.tencent.mapsdk.internal.tr trVar, com.tencent.mapsdk.internal.an anVar) {
        this.f50758d = trVar;
        this.f50769o = anVar;
        h();
        if (trVar != null && trVar.I() != null) {
            this.f50759e = com.tencent.mapsdk.internal.pn.a(trVar.I(), (com.tencent.mapsdk.internal.bd) trVar.d_, this, anVar != null ? anVar.g() : null, anVar);
            if (anVar != null) {
                a(anVar.getPosition());
            }
        }
        this.f50765k = true;
    }

    private void h() {
        M m17;
        com.tencent.mapsdk.internal.tr trVar = this.f50758d;
        if (trVar == null || (m17 = trVar.e_) == 0) {
            return;
        }
        ((com.tencent.mapsdk.vector.VectorMap) m17).a((com.tencent.mapsdk.internal.oz) this);
    }

    private void i() {
        M m17;
        com.tencent.mapsdk.internal.tr trVar = this.f50758d;
        if (trVar == null || (m17 = trVar.e_) == 0) {
            return;
        }
        ((com.tencent.mapsdk.vector.VectorMap) m17).f52512o.b(this);
    }

    private void l() {
        com.tencent.mapsdk.internal.tr trVar = this.f50758d;
        if (trVar == null || trVar.I() == null) {
            return;
        }
        com.tencent.mapsdk.internal.an anVar = this.f50769o;
        this.f50759e = com.tencent.mapsdk.internal.pn.a(this.f50758d.I(), (com.tencent.mapsdk.internal.bd) this.f50758d.d_, this, anVar != null ? anVar.g() : null, this.f50769o);
        com.tencent.mapsdk.internal.an anVar2 = this.f50769o;
        if (anVar2 != null) {
            a(anVar2.getPosition());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        com.tencent.mapsdk.internal.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.ps.1
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mapsdk.internal.ps.a(com.tencent.mapsdk.internal.ps.this);
            }
        });
    }

    private void n() {
        android.view.View view;
        com.tencent.mapsdk.vector.VectorMap vectorMap;
        com.tencent.mapsdk.internal.ey projection;
        android.view.ViewGroup q17;
        boolean z17;
        com.tencent.mapsdk.internal.tr trVar = this.f50758d;
        if (trVar == null || (view = this.f50759e) == null || (vectorMap = (com.tencent.mapsdk.vector.VectorMap) trVar.e_) == null || (projection = vectorMap.getProjection()) == null || (q17 = q()) == null) {
            return;
        }
        if (!this.f50770p) {
            view.setVisibility(8);
            return;
        }
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        this.f50760f = view.getMeasuredWidth();
        this.f50761g = view.getMeasuredHeight();
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        android.graphics.Rect screenBound = getScreenBound(projection);
        if (screenBound == null) {
            return;
        }
        if (view.getParent() == null) {
            int childCount = q17.getChildCount();
            int zIndex = this.f50769o.getZIndex();
            int i17 = childCount - 1;
            int i18 = -1;
            int i19 = -1;
            while (true) {
                if (i17 < 0) {
                    i17 = i19;
                    z17 = false;
                    break;
                }
                java.lang.Object tag = q17.getChildAt(i17).getTag();
                if (tag instanceof java.lang.Integer) {
                    if (zIndex >= ((java.lang.Integer) tag).intValue()) {
                        i18 = i17 + 1;
                        z17 = true;
                        break;
                    }
                    i19 = i17;
                }
                i17--;
            }
            if (z17) {
                i17 = i18;
            }
            view.setTag(java.lang.Integer.valueOf(zIndex));
            if (i17 < childCount) {
                q17.addView(view, i17);
            } else {
                q17.addView(view);
            }
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        q17.getLocalVisibleRect(rect);
        if (rect.isEmpty()) {
            view.setVisibility(8);
            return;
        }
        if (rect.intersect(screenBound)) {
            view.setVisibility(0);
        }
        view.setX(screenBound.left);
        view.setY(screenBound.top);
    }

    private com.tencent.mapsdk.internal.am p() {
        return this;
    }

    private android.view.ViewGroup q() {
        com.tencent.mapsdk.internal.tr trVar = this.f50758d;
        if (trVar == null) {
            return null;
        }
        return trVar.ac();
    }

    @Override // com.tencent.mapsdk.internal.am
    public final int a() {
        return 0;
    }

    @Override // com.tencent.mapsdk.internal.ew
    public final void d() {
        if (this.f50769o == null || this.f50758d.I() == null) {
            return;
        }
        int width = this.f50769o.getWidth(this.f50758d.I());
        float infoWindowAnchorU = this.f50769o.getOptions() != null ? this.f50769o.getOptions().getInfoWindowAnchorU() : 0.5f;
        int i17 = this.f50760f;
        if (i17 == 0) {
            i17 = 1;
        }
        this.f50762h = infoWindowAnchorU + ((width * (this.f50769o.getAnchorU() - 0.5f)) / i17);
    }

    @Override // com.tencent.mapsdk.internal.ew
    public final void e() {
        if (this.f50769o == null || this.f50758d.I() == null) {
            return;
        }
        int height = (int) (this.f50769o.getHeight(this.f50758d.I()) * this.f50769o.getAnchorV());
        int i17 = this.f50761g;
        float infoWindowAnchorV = this.f50769o.getOptions() != null ? this.f50769o.getOptions().getInfoWindowAnchorV() : 1.0f;
        if (i17 == 0) {
            i17 = 1;
        }
        float f17 = i17;
        this.f50763i = (height + (infoWindowAnchorV * f17)) / f17;
    }

    @Override // com.tencent.mapsdk.internal.ew
    public final void f() {
        com.tencent.mapsdk.internal.tr trVar = this.f50758d;
        if (trVar == null || !this.f50771q) {
            return;
        }
        com.tencent.mapsdk.internal.an anVar = this.f50769o;
        final com.tencent.tencentmap.mapsdk.maps.TencentMap.InfoWindowAdapter g17 = anVar != null ? anVar.g() : null;
        final android.content.Context I = trVar.I();
        final com.tencent.mapsdk.internal.bd bdVar = (com.tencent.mapsdk.internal.bd) trVar.d_;
        android.view.ViewGroup q17 = q();
        if (q17 != null) {
            q17.post(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.ps.2
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mapsdk.internal.ps psVar = com.tencent.mapsdk.internal.ps.this;
                    psVar.f50759e = com.tencent.mapsdk.internal.pn.a(I, bdVar, psVar, g17, psVar.f50769o);
                    com.tencent.mapsdk.internal.ps.this.m();
                }
            });
        }
    }

    @Override // com.tencent.mapsdk.internal.au
    public final /* bridge */ /* synthetic */ com.tencent.mapsdk.internal.am f_() {
        return this;
    }

    @Override // com.tencent.mapsdk.internal.ew
    public final android.view.View g() {
        return this.f50759e;
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.model.IOverlay
    public final java.lang.String getId() {
        return this.c_;
    }

    @Override // com.tencent.mapsdk.internal.ew
    public final void i_() {
        m();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Collisionable
    public final boolean isCollisionBy(com.tencent.tencentmap.mapsdk.maps.interfaces.Collision collision) {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public final boolean isRemoved() {
        return this.f50766l;
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Visible
    public final boolean isVisible() {
        return this.f50770p;
    }

    @Override // com.tencent.mapsdk.internal.oz
    public final void j() {
        m();
    }

    @Override // com.tencent.mapsdk.internal.oz
    public final void k() {
        m();
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public final boolean onTap(float f17, float f18) {
        com.tencent.mapsdk.internal.tr trVar;
        M m17;
        android.graphics.Rect screenBound;
        if (this.f50759e == null || !this.f50765k || (trVar = this.f50758d) == null || (m17 = trVar.e_) == 0 || ((com.tencent.mapsdk.vector.VectorMap) m17).getProjection() == null || (screenBound = getScreenBound(((com.tencent.mapsdk.vector.VectorMap) this.f50758d.e_).getProjection())) == null || screenBound.isEmpty()) {
            return false;
        }
        return screenBound.contains((int) f17, (int) f18);
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public final void releaseData() {
        i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public final void remove() {
        final android.view.View view = this.f50759e;
        if (view == 0) {
            return;
        }
        final android.view.ViewParent parent = view.getParent();
        if (parent == null) {
            parent = (android.view.ViewParent) view;
        }
        if (parent instanceof android.view.ViewGroup) {
            if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
                a((android.view.ViewGroup) parent, view);
            } else {
                ((android.view.ViewGroup) parent).post(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.ps.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mapsdk.internal.ps.this.a((android.view.ViewGroup) parent, view);
                    }
                });
            }
        }
        this.f50758d.d(getId());
        this.f50766l = true;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Collisionable
    public final void setCollisions(com.tencent.tencentmap.mapsdk.maps.interfaces.Collision... collisionArr) {
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Visible
    public final void setVisible(boolean z17) {
        this.f50770p = z17;
        m();
    }

    @Override // com.tencent.mapsdk.internal.ew
    public final void a(com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions) {
    }

    @Override // com.tencent.mapsdk.internal.ew
    public final void b(boolean z17) {
        this.f50767m = z17;
        if (z17) {
            i();
        } else {
            h();
        }
    }

    @Override // com.tencent.mapsdk.internal.ew
    public final void c(boolean z17) {
        if (this.f50759e == null) {
            return;
        }
        this.f50765k = z17;
        setVisible(z17);
    }

    @Override // com.tencent.mapsdk.internal.ew
    public final void a(boolean z17) {
        this.f50771q = z17;
        if (this.f50765k) {
            c(z17);
        }
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: b */
    public final android.graphics.Rect getBound(com.tencent.mapsdk.internal.ey eyVar) {
        if (getScreenBound(eyVar) != null && eyVar != null) {
            com.tencent.map.lib.models.GeoPoint a17 = eyVar.a(new com.tencent.mapsdk.internal.fu(r0.left, r0.top));
            com.tencent.map.lib.models.GeoPoint a18 = eyVar.a(new com.tencent.mapsdk.internal.fu(r0.right, r0.bottom));
            if (a17 != null && a18 != null) {
                return new android.graphics.Rect(a17.getLongitudeE6(), a17.getLatitudeE6(), a18.getLongitudeE6(), a18.getLatitudeE6());
            }
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.ew
    public final boolean c() {
        return this.f50765k;
    }

    @Override // com.tencent.mapsdk.internal.ew
    public final void a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        if (latLng == null) {
            return;
        }
        com.tencent.map.lib.models.GeoPoint geoPoint = this.f50764j;
        if (geoPoint == null) {
            this.f50764j = com.tencent.map.lib.models.GeoPoint.from(latLng);
        } else {
            geoPoint.setLatitudeE6((int) (latLng.latitude * 1000000.0d));
            this.f50764j.setLongitudeE6((int) (latLng.longitude * 1000000.0d));
        }
        m();
    }

    @Override // com.tencent.mapsdk.internal.ew
    public final void a(int i17, int i18) {
        b(true);
        this.f50768n.a(i17, i18);
        m();
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: a */
    public final android.graphics.Rect getScreenBound(com.tencent.mapsdk.internal.ey eyVar) {
        com.tencent.mapsdk.internal.fu a17;
        int i17;
        int i18;
        if (eyVar == null || this.f50759e == null) {
            return null;
        }
        if (this.f50767m) {
            a17 = this.f50768n;
        } else {
            a17 = eyVar.a(this.f50764j);
        }
        if (a17 == null) {
            return null;
        }
        com.tencent.mapsdk.internal.an anVar = this.f50769o;
        if (anVar == null || anVar.getOptions() == null) {
            i17 = 0;
            i18 = 0;
        } else {
            i17 = this.f50769o.getOptions().getInfoWindowOffsetX();
            i18 = this.f50769o.getOptions().getInfowindowOffsetY();
        }
        d();
        e();
        float f17 = this.f50762h;
        int i19 = this.f50760f;
        float f18 = f17 - ((i17 * 1.0f) / i19);
        float f19 = this.f50763i;
        int i27 = this.f50761g;
        float f27 = f19 - ((i18 * 1.0f) / i27);
        int i28 = (int) (a17.f49467a - (i19 * f18));
        int i29 = (int) (a17.f49468b - (i27 * f27));
        return new android.graphics.Rect(i28, i29, i19 + i28, i27 + i29);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(android.view.ViewGroup viewGroup, android.view.View view) {
        viewGroup.removeView(view);
        if (view instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) view).removeAllViews();
        }
        releaseData();
    }

    public static /* synthetic */ void a(com.tencent.mapsdk.internal.ps psVar) {
        android.view.View view;
        com.tencent.mapsdk.vector.VectorMap vectorMap;
        com.tencent.mapsdk.internal.ey projection;
        android.view.ViewGroup q17;
        boolean z17;
        com.tencent.mapsdk.internal.tr trVar = psVar.f50758d;
        if (trVar == null || (view = psVar.f50759e) == null || (vectorMap = (com.tencent.mapsdk.vector.VectorMap) trVar.e_) == null || (projection = vectorMap.getProjection()) == null || (q17 = psVar.q()) == null) {
            return;
        }
        if (!psVar.f50770p) {
            view.setVisibility(8);
            return;
        }
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        psVar.f50760f = view.getMeasuredWidth();
        psVar.f50761g = view.getMeasuredHeight();
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        android.graphics.Rect screenBound = psVar.getScreenBound(projection);
        if (screenBound != null) {
            if (view.getParent() == null) {
                int childCount = q17.getChildCount();
                int zIndex = psVar.f50769o.getZIndex();
                int i17 = childCount - 1;
                int i18 = -1;
                int i19 = -1;
                while (true) {
                    if (i17 < 0) {
                        i17 = i19;
                        z17 = false;
                        break;
                    }
                    java.lang.Object tag = q17.getChildAt(i17).getTag();
                    if (tag instanceof java.lang.Integer) {
                        if (zIndex >= ((java.lang.Integer) tag).intValue()) {
                            i18 = i17 + 1;
                            z17 = true;
                            break;
                        }
                        i19 = i17;
                    }
                    i17--;
                }
                if (z17) {
                    i17 = i18;
                }
                view.setTag(java.lang.Integer.valueOf(zIndex));
                if (i17 < childCount) {
                    q17.addView(view, i17);
                } else {
                    q17.addView(view);
                }
            }
            android.graphics.Rect rect = new android.graphics.Rect();
            q17.getLocalVisibleRect(rect);
            if (rect.isEmpty()) {
                view.setVisibility(8);
                return;
            }
            if (rect.intersect(screenBound)) {
                view.setVisibility(0);
            }
            view.setX(screenBound.left);
            view.setY(screenBound.top);
        }
    }
}
