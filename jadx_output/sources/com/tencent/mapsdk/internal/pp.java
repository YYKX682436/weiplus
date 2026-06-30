package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class pp extends com.tencent.mapsdk.internal.po<com.tencent.mapsdk.internal.an> implements com.tencent.mapsdk.internal.an {
    protected com.tencent.map.lib.models.GeoPoint A;
    protected float B;
    protected float C;
    protected float D;
    public boolean E;
    public final com.tencent.mapsdk.internal.tr F;
    public com.tencent.mapsdk.internal.ew G;
    private boolean H;
    private int I;

    /* renamed from: J, reason: collision with root package name */
    private int f50689J;
    private boolean K;
    private com.tencent.map.lib.models.GeoPoint L;
    private final com.tencent.mapsdk.internal.qx M;
    private com.tencent.tencentmap.mapsdk.maps.model.AnimationListener N;
    private com.tencent.tencentmap.mapsdk.maps.model.MarkerType O;
    private java.lang.String P;
    private com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle Q;
    private com.tencent.mapsdk.internal.im R;
    private com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerClickListener S;
    private com.tencent.tencentmap.mapsdk.maps.model.LatLng T;
    private com.tencent.tencentmap.mapsdk.maps.interfaces.Collision[] U;
    private int V;
    private final com.tencent.mapsdk.internal.im.b W;
    private com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation X;

    /* renamed from: b, reason: collision with root package name */
    protected android.graphics.Bitmap f50690b;

    /* renamed from: d, reason: collision with root package name */
    boolean f50691d;

    /* renamed from: p, reason: collision with root package name */
    protected final java.lang.Object f50692p;

    /* renamed from: q, reason: collision with root package name */
    float f50693q;

    /* renamed from: r, reason: collision with root package name */
    float f50694r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f50695s;

    /* renamed from: t, reason: collision with root package name */
    protected float f50696t;

    /* renamed from: u, reason: collision with root package name */
    protected float f50697u;

    /* renamed from: v, reason: collision with root package name */
    protected float f50698v;

    /* renamed from: w, reason: collision with root package name */
    protected final com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions f50699w;

    /* renamed from: x, reason: collision with root package name */
    protected java.lang.String f50700x;

    /* renamed from: y, reason: collision with root package name */
    protected com.tencent.map.lib.models.GeoPoint f50701y;

    /* renamed from: z, reason: collision with root package name */
    protected com.tencent.map.lib.models.GeoPoint f50702z;

    /* renamed from: com.tencent.mapsdk.internal.pp$5, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50709a;

        static {
            int[] iArr = new int[com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation.values().length];
            f50709a = iArr;
            try {
                iArr[com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation.ALONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f50709a[com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation.TOGETHER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public pp(com.tencent.mapsdk.internal.tr trVar, com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions) {
        super(trVar);
        android.graphics.Bitmap bitmap = null;
        this.f50690b = null;
        this.f50691d = false;
        this.f50692p = new java.lang.Object();
        this.f50693q = 0.5f;
        this.f50694r = 0.5f;
        this.f50695s = false;
        this.f50696t = 0.0f;
        this.f50697u = 0.0f;
        this.f50698v = -1.0f;
        this.f50700x = null;
        this.f50701y = null;
        this.f50702z = null;
        this.A = null;
        this.B = 1.0f;
        this.C = 1.0f;
        this.D = 1.0f;
        this.E = false;
        this.H = false;
        this.I = 0;
        this.f50689J = 0;
        this.K = false;
        this.L = null;
        this.O = com.tencent.tencentmap.mapsdk.maps.model.MarkerType.ICON_MARKER;
        this.W = new com.tencent.mapsdk.internal.im.b() { // from class: com.tencent.mapsdk.internal.pp.1
            @Override // com.tencent.mapsdk.internal.im.b
            public final void a(float f17, float f18, float f19, float f27) {
                com.tencent.mapsdk.internal.pp.this.setRotation(f17);
                com.tencent.mapsdk.internal.pp ppVar = com.tencent.mapsdk.internal.pp.this;
                ppVar.f50696t = f18;
                ppVar.f50697u = f19;
                ppVar.f50698v = f27;
                ppVar.f50695s = true;
                if (ppVar.M != null) {
                    com.tencent.mapsdk.internal.pp.this.M.a((int) com.tencent.mapsdk.internal.pp.this.getRotation());
                }
            }

            @Override // com.tencent.mapsdk.internal.im.b
            public final void b(float f17) {
            }

            @Override // com.tencent.mapsdk.internal.im.b
            public final void a(float f17) {
                com.tencent.mapsdk.internal.pp ppVar = com.tencent.mapsdk.internal.pp.this;
                ppVar.B = f17;
                if (ppVar.M != null) {
                    com.tencent.mapsdk.internal.pp.this.M.a(com.tencent.mapsdk.internal.pp.this.B);
                    com.tencent.mapsdk.internal.pp ppVar2 = com.tencent.mapsdk.internal.pp.this;
                    ppVar2.f50699w.alpha(ppVar2.B);
                }
                com.tencent.mapsdk.internal.pp ppVar3 = com.tencent.mapsdk.internal.pp.this;
                com.tencent.mapsdk.internal.ew ewVar = ppVar3.G;
                if (ewVar != null) {
                    ewVar.a(ppVar3.f50699w);
                }
            }

            @Override // com.tencent.mapsdk.internal.im.b
            public final void a(int i17, int i18) {
                if (com.tencent.mapsdk.internal.pp.this.F == null || com.tencent.mapsdk.internal.pp.this.f50701y == null) {
                    return;
                }
                com.tencent.map.lib.models.GeoPoint geoPoint = new com.tencent.map.lib.models.GeoPoint();
                if (com.tencent.mapsdk.internal.pp.this.K && com.tencent.mapsdk.internal.pp.this.L != null && com.tencent.mapsdk.internal.pp.this.F.e_ != 0) {
                    com.tencent.map.lib.models.GeoPoint a17 = ((com.tencent.mapsdk.vector.VectorMap) com.tencent.mapsdk.internal.pp.this.F.e_).getProjection().a(new com.tencent.mapsdk.internal.fu(com.tencent.mapsdk.internal.pp.this.I, com.tencent.mapsdk.internal.pp.this.f50689J));
                    int latitudeE6 = a17.getLatitudeE6() - com.tencent.mapsdk.internal.pp.this.L.getLatitudeE6();
                    int longitudeE6 = a17.getLongitudeE6() - com.tencent.mapsdk.internal.pp.this.L.getLongitudeE6();
                    geoPoint.setLatitudeE6(i17 + latitudeE6);
                    geoPoint.setLongitudeE6(i18 + longitudeE6);
                    com.tencent.mapsdk.internal.fu a18 = ((com.tencent.mapsdk.vector.VectorMap) com.tencent.mapsdk.internal.pp.this.F.e_).getProjection().a(geoPoint);
                    com.tencent.mapsdk.internal.pp.this.f50701y.setLatitudeE6((int) a18.f49468b);
                    com.tencent.mapsdk.internal.pp.this.f50701y.setLongitudeE6((int) a18.f49467a);
                } else {
                    com.tencent.mapsdk.internal.pp.this.f50701y.setLatitudeE6(i17 + 0);
                    com.tencent.mapsdk.internal.pp.this.f50701y.setLongitudeE6(i18 + 0);
                }
                com.tencent.mapsdk.internal.pp ppVar = com.tencent.mapsdk.internal.pp.this;
                com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions2 = ppVar.f50699w;
                if (markerOptions2 != null) {
                    markerOptions2.position(com.tencent.mapsdk.internal.kr.a(ppVar.f50701y));
                }
                if (com.tencent.mapsdk.internal.pp.this.M != null) {
                    com.tencent.mapsdk.internal.pp.this.M.a(com.tencent.mapsdk.internal.pp.this.f50701y);
                }
                com.tencent.mapsdk.internal.pp ppVar2 = com.tencent.mapsdk.internal.pp.this;
                com.tencent.mapsdk.internal.ew ewVar = ppVar2.G;
                if (ewVar != null) {
                    ewVar.a(com.tencent.mapsdk.internal.kr.a(ppVar2.f50701y));
                }
            }

            @Override // com.tencent.mapsdk.internal.im.b
            public final void a(float f17, float f18) {
                com.tencent.mapsdk.internal.pp.this.a(f17, f18);
            }
        };
        this.X = com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation.ALONE;
        this.F = trVar;
        this.f50699w = markerOptions;
        setClickable(true);
        this.f50681o = true;
        setTitle(markerOptions.getTitle());
        setDraggable(markerOptions.isDraggable());
        setPosition(markerOptions.getPosition());
        setSnippet(markerOptions.getSnippet());
        setAnchor(markerOptions.getAnchorU(), markerOptions.getAnchorV());
        setVisible(markerOptions.isVisible());
        setRotation(markerOptions.getRotation());
        setIcon(markerOptions.getIcon());
        setAlpha(markerOptions.getAlpha());
        setZIndex(markerOptions.getZIndex());
        setLevel(markerOptions.getLevel());
        a(markerOptions.getIndoorInfo());
        setTag(markerOptions.getTag());
        setCollisions(markerOptions.getCollisions());
        com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation collisionRelation = markerOptions.getCollisionRelation();
        this.X = collisionRelation;
        com.tencent.mapsdk.internal.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.f51095u = collisionRelation;
        }
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions options = getOptions();
        com.tencent.mapsdk.internal.qy qyVar = new com.tencent.mapsdk.internal.qy();
        qyVar.f51109i = com.tencent.map.lib.models.GeoPoint.from(options.getPosition());
        qyVar.f51113m = options.getAlpha();
        qyVar.a(options.getAnchorU(), options.getAnchorV());
        byte[] bArr = new byte[20];
        new java.security.SecureRandom().nextBytes(bArr);
        java.lang.String str = new java.lang.String(bArr);
        try {
            bitmap = options.getIcon().getBitmap(trVar.I());
            str = options.getIcon().getFormater().getBitmapId();
        } catch (java.lang.NullPointerException unused) {
        }
        com.tencent.mapsdk.internal.qy a17 = qyVar.a(str, bitmap);
        a17.f51115o = (int) options.getRotation();
        a17.f51114n = options.isFlat();
        a17.f51119s = (int) options.getZIndex();
        a17.f51121u = this.H;
        a17.f51125y = isCollisionBy(com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem.MARKER);
        a17.f51124x = isCollisionBy(com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem.POI);
        a17.f51126z = options.isClockwise();
        a17.f51122v = options.isFastLoad();
        a17.A = options.getTag();
        a17.f51120t = options.getLevel();
        if (options.getMarkerType() != null) {
            this.O = options.getMarkerType();
        }
        this.P = options.getText();
        com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle textStyle = options.getTextStyle() != null ? options.getTextStyle() : new com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle.Builder().build();
        this.Q = textStyle;
        com.tencent.tencentmap.mapsdk.maps.model.MarkerType markerType = this.O;
        if (markerType != null) {
            qyVar.B = markerType;
        }
        qyVar.C = this.P;
        qyVar.D = textStyle;
        com.tencent.mapsdk.internal.qx qxVar2 = new com.tencent.mapsdk.internal.qx(this, this.F, qyVar);
        this.M = qxVar2;
        qxVar2.f51095u = options.getCollisionRelation();
        setIconLooper(options.getIcon(), options.isIconLooperEnable(), options.getIconLooperDuration());
        x();
    }

    private void A() {
        java.util.Iterator<com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit> it = l().iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.po c17 = this.F.c(it.next().getId());
            if (c17 instanceof com.tencent.mapsdk.internal.pp) {
                c17.setVisible(false);
            } else if ((c17 instanceof com.tencent.mapsdk.internal.pn) && ((com.tencent.mapsdk.internal.pn) c17).c()) {
                c17.setVisible(false);
            }
        }
    }

    private void B() {
        java.util.Iterator<com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit> it = l().iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.po c17 = this.F.c(it.next().getId());
            if (c17 instanceof com.tencent.mapsdk.internal.pp) {
                c17.setVisible(true);
            } else if ((c17 instanceof com.tencent.mapsdk.internal.pn) && ((com.tencent.mapsdk.internal.pn) c17).c()) {
                c17.setVisible(true);
            }
        }
    }

    private void C() {
        synchronized (this.f50692p) {
            android.graphics.Bitmap bitmap = this.f50690b;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f50691d = true;
            }
        }
    }

    private java.lang.String D() {
        return "GLMarkerOverlay-" + y();
    }

    private android.graphics.Rect E() {
        com.tencent.mapsdk.internal.tr trVar;
        M m17;
        com.tencent.mapsdk.internal.qx qxVar = this.M;
        return (qxVar == null || (trVar = this.F) == null || (m17 = trVar.e_) == 0) ? new android.graphics.Rect() : qxVar.getBound(((com.tencent.mapsdk.vector.VectorMap) m17).getProjection());
    }

    private boolean F() {
        M m17;
        boolean z17 = false;
        if (this.F == null) {
            return false;
        }
        com.tencent.mapsdk.internal.im imVar = this.R;
        if (imVar != null) {
            imVar.b();
            boolean z18 = this.R.f49904b;
            this.K = z18;
            z17 = true;
            if (z18 && (m17 = this.F.e_) != 0) {
                ((com.tencent.mapsdk.vector.VectorMap) m17).f52512o.f50522v = true;
            }
        }
        return z17;
    }

    private boolean G() {
        return this.H;
    }

    private int H() {
        android.graphics.Bitmap bitmap = this.f50690b;
        if (bitmap == null || this.M == null) {
            return 0;
        }
        float width = bitmap.getWidth();
        return (int) ((this.M.d() * width) - (width * 0.5f));
    }

    private boolean I() {
        return this.K;
    }

    private com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable<com.tencent.mapsdk.internal.ey> J() {
        return this.M;
    }

    private com.tencent.mapsdk.internal.an K() {
        return this;
    }

    private boolean L() {
        if (this.F == null) {
            return false;
        }
        android.graphics.Rect j17 = j();
        return j17.left >= 0 && j17.top >= 0 && j17.right <= this.F.aj() && j17.bottom <= this.F.ak();
    }

    private void z() {
        com.tencent.mapsdk.internal.tr trVar = this.F;
        if (trVar == null || !this.E) {
            return;
        }
        a(trVar.t());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit addCollisionUnit(com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions) {
        if (this.f50699w.getCollisionRelation() == com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation.TOGETHER) {
            markerOptions.collisionBy(this.f50699w.getCollisions());
        }
        com.tencent.mapsdk.internal.an anVar = ((com.tencent.mapsdk.internal.av) ((com.tencent.mapsdk.vector.VectorMap) this.F.e_).addMarker(markerOptions)).f48864b;
        com.tencent.mapsdk.internal.qx qxVar = anVar instanceof com.tencent.mapsdk.internal.pp ? ((com.tencent.mapsdk.internal.pp) anVar).M : null;
        if (qxVar != null) {
            a(qxVar);
        }
        return qxVar;
    }

    @Override // com.tencent.mapsdk.internal.au
    public final /* bridge */ /* synthetic */ com.tencent.mapsdk.internal.ao f_() {
        return this;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Alphable
    public final float getAlpha() {
        return this.B;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Anchorable
    public final float getAnchorU() {
        return this.f50699w.getAnchorU();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Anchorable
    public final float getAnchorV() {
        return this.f50699w.getAnchorV();
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    public final /* synthetic */ android.graphics.Rect getBound(com.tencent.mapsdk.internal.ey eyVar) {
        return E();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Accessible
    public final java.lang.String getContentDescription() {
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (markerOptions == null) {
            return null;
        }
        return markerOptions.getContentDescription();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Scalable
    public final float getEqualScale() {
        return this.C;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final int getHeight(android.content.Context context) {
        android.graphics.Bitmap bitmap;
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor icon = this.f50699w.getIcon();
        if (icon == null || (bitmap = icon.getFormater().getBitmap(context)) == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.model.IOverlay
    public final java.lang.String getId() {
        com.tencent.mapsdk.internal.qx qxVar = this.M;
        return qxVar != null ? qxVar.getId() : super.getId();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final com.tencent.tencentmap.mapsdk.maps.model.MarkerType getMarkerType() {
        return this.O;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions getOptions() {
        return this.f50699w;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng getPosition() {
        return this.T;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Scalable
    public final float[] getScale() {
        return new float[]{this.C, this.D};
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final java.lang.String getSnippet() {
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (markerOptions != null) {
            return markerOptions.getSnippet();
        }
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final java.lang.String getText() {
        return this.P;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle getTextStyle() {
        return this.Q;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final java.lang.String getTitle() {
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (markerOptions != null) {
            return markerOptions.getTitle();
        }
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final int getWidth(android.content.Context context) {
        android.graphics.Bitmap bitmap;
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor icon = this.f50699w.getIcon();
        if (icon == null || (bitmap = icon.getFormater().getBitmap(context)) == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    @Override // com.tencent.mapsdk.internal.an
    public final com.tencent.mapsdk.internal.ew h() {
        return this.G;
    }

    @Override // com.tencent.mapsdk.internal.po
    public final void h_() {
        com.tencent.mapsdk.internal.tr trVar = this.F;
        if (trVar != null) {
            if (getId().equals(trVar.f52193h)) {
                trVar.b("");
            }
        }
        com.tencent.mapsdk.internal.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.h_();
        }
        com.tencent.mapsdk.internal.ew ewVar = this.G;
        if (ewVar != null) {
            ewVar.remove();
            removeCollisionUnit(this.G);
            this.G = null;
        }
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public final boolean handleOnTap() {
        return true;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void hideInfoWindow() {
        com.tencent.mapsdk.internal.tr trVar = this.F;
        if (trVar == null) {
            return;
        }
        trVar.b("");
        ((com.tencent.mapsdk.vector.VectorMap) trVar.e_).f52512o.f50522v = true;
        synchronized (trVar.f52192g) {
            com.tencent.mapsdk.internal.ew ewVar = this.G;
            if (ewVar == null) {
                return;
            }
            ewVar.c(false);
        }
    }

    @Override // com.tencent.mapsdk.internal.an
    public final boolean i() {
        if (this.f50699w.isInfoWindowEnable()) {
            return (android.text.TextUtils.isEmpty(this.f50699w.getTitle()) && android.text.TextUtils.isEmpty(this.f50699w.getSnippet()) && g() == null) ? false : true;
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Collisionable
    public final boolean isCollisionBy(final com.tencent.tencentmap.mapsdk.maps.interfaces.Collision collision) {
        com.tencent.tencentmap.mapsdk.maps.interfaces.Collision[] collisionArr = this.U;
        if (collisionArr != null) {
            return com.tencent.map.tools.Util.where(collisionArr, new com.tencent.map.tools.ReturnCallback<java.lang.Boolean, com.tencent.tencentmap.mapsdk.maps.interfaces.Collision>() { // from class: com.tencent.mapsdk.internal.pp.4
                private java.lang.Boolean a(com.tencent.tencentmap.mapsdk.maps.interfaces.Collision collision2) {
                    return java.lang.Boolean.valueOf(collision2 == collision);
                }

                @Override // com.tencent.map.tools.ReturnCallback
                public final /* synthetic */ java.lang.Boolean callback(com.tencent.tencentmap.mapsdk.maps.interfaces.Collision collision2) {
                    return java.lang.Boolean.valueOf(collision2 == collision);
                }
            });
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final boolean isFastLoad() {
        com.tencent.mapsdk.internal.qx qxVar = this.M;
        if (qxVar == null) {
            return false;
        }
        return qxVar.h();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final boolean isInfoWindowEnable() {
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (markerOptions != null) {
            return markerOptions.isInfoWindowEnable();
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final boolean isInfoWindowShown() {
        com.tencent.mapsdk.internal.ew ewVar;
        if (this.F == null || this.f50699w == null || (ewVar = this.G) == null) {
            return false;
        }
        return ewVar.c();
    }

    @Override // com.tencent.mapsdk.internal.an
    public final android.graphics.Rect j() {
        com.tencent.mapsdk.internal.tr trVar;
        M m17;
        com.tencent.mapsdk.internal.qx qxVar = this.M;
        return (qxVar == null || (trVar = this.F) == null || (m17 = trVar.e_) == 0) ? new android.graphics.Rect() : qxVar.getScreenBound(((com.tencent.mapsdk.vector.VectorMap) m17).getProjection());
    }

    @Override // com.tencent.mapsdk.internal.po
    public final void j_() {
        com.tencent.mapsdk.internal.qx qxVar;
        com.tencent.mapsdk.internal.im imVar;
        M m17;
        com.tencent.mapsdk.internal.tr trVar = this.F;
        if (trVar == null) {
            return;
        }
        if (trVar != null && this.E) {
            a(trVar.t());
        }
        if (this.F != null && (imVar = this.R) != null) {
            imVar.b();
            boolean z17 = this.R.f49904b;
            this.K = z17;
            if (z17 && (m17 = this.F.e_) != 0) {
                ((com.tencent.mapsdk.vector.VectorMap) m17).f52512o.f50522v = true;
            }
        }
        M m18 = this.F.e_;
        if (m18 == 0 || ((com.tencent.mapsdk.vector.VectorMap) m18).f52512o.f50511k == null || (qxVar = this.M) == null) {
            return;
        }
        qxVar.j_();
    }

    @Override // com.tencent.mapsdk.internal.an
    public final com.tencent.mapsdk.internal.qx k() {
        return this.M;
    }

    @Override // com.tencent.mapsdk.internal.an
    public final java.util.List<com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit> l() {
        return com.tencent.mapsdk.internal.hq.a((java.lang.Iterable) this.M.f51094t, (com.tencent.mapsdk.internal.hq.h) new com.tencent.mapsdk.internal.hq.h<com.tencent.mapsdk.internal.qx, com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit>() { // from class: com.tencent.mapsdk.internal.pp.2
            /* renamed from: a, reason: avoid collision after fix types in other method */
            private static com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit a2(com.tencent.mapsdk.internal.qx qxVar) {
                return qxVar;
            }

            @Override // com.tencent.mapsdk.internal.hq.h
            public final /* bridge */ /* synthetic */ com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit a(com.tencent.mapsdk.internal.qx qxVar) {
                return qxVar;
            }
        });
    }

    @Override // com.tencent.mapsdk.internal.an
    public final com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation m() {
        com.tencent.mapsdk.internal.qx qxVar = this.M;
        return qxVar != null ? qxVar.f51095u : this.X;
    }

    @Override // com.tencent.mapsdk.internal.an
    public final boolean n() {
        return this.M.f51093s != null;
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public final boolean onTap(float f17, float f18) {
        com.tencent.mapsdk.internal.qx qxVar;
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerClickListener onMarkerClickListener;
        if (this.F == null || !isClickable() || (qxVar = this.M) == null) {
            return false;
        }
        boolean onTap = qxVar.onTap(f17, f18);
        if (onTap && (onMarkerClickListener = this.S) != null) {
            onMarkerClickListener.onMarkerClick(this);
        }
        return onTap;
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.ev
    public final void p() {
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.ev
    public final boolean q() {
        return getTag() != null && com.tencent.mapsdk.internal.qa.f50854c.equals(getTag().toString());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void refreshInfoWindow() {
        com.tencent.mapsdk.internal.ew ewVar;
        if (isInfoWindowEnable() && (ewVar = this.G) != null && ewVar.c()) {
            this.G.f();
        }
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public final void releaseData() {
        com.tencent.mapsdk.internal.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.g();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void removeCollisionUnit(com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit markerCollisionRelationUnit) {
        if (markerCollisionRelationUnit == null) {
            return;
        }
        com.tencent.mapsdk.internal.po c17 = this.F.c(markerCollisionRelationUnit.getId());
        com.tencent.mapsdk.internal.qx qxVar = c17 instanceof com.tencent.mapsdk.internal.pp ? ((com.tencent.mapsdk.internal.pp) c17).M : c17 instanceof com.tencent.mapsdk.internal.pn ? ((com.tencent.mapsdk.internal.pn) c17).f50656d : null;
        if (qxVar == null || !this.M.b(qxVar)) {
            return;
        }
        c17.remove();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Alphable
    public final void setAlpha(float f17) {
        this.B = f17;
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (markerOptions != null) {
            markerOptions.alpha(f17);
        }
        com.tencent.mapsdk.internal.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.a(f17);
        }
        w();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Anchorable
    public final void setAnchor(float f17, float f18) {
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (markerOptions != null) {
            markerOptions.anchor(f17, f18);
        }
        this.f50693q = f17;
        this.f50694r = f18;
        com.tencent.mapsdk.internal.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.a(f17, f18);
        }
        com.tencent.mapsdk.internal.ew ewVar = this.G;
        if (ewVar != null) {
            ewVar.i_();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    public final void setAnimation(com.tencent.tencentmap.mapsdk.maps.model.Animation animation) {
        com.tencent.mapsdk.internal.hv a17;
        com.tencent.mapsdk.internal.tr trVar = this.F;
        if (trVar == null || (a17 = com.tencent.mapsdk.internal.iu.a(trVar.d_, animation)) == null) {
            return;
        }
        com.tencent.mapsdk.internal.im imVar = a17.f49861a;
        this.R = imVar;
        if (imVar != null) {
            imVar.a(this.W);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Collisionable
    public final void setCollisions(com.tencent.tencentmap.mapsdk.maps.interfaces.Collision... collisionArr) {
        this.U = collisionArr;
        com.tencent.mapsdk.internal.qx qxVar = this.M;
        if (qxVar == null) {
            return;
        }
        if (isCollisionBy(com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem.NONE) || collisionArr.length == 0) {
            qxVar.b(false);
            qxVar.c(false);
        } else {
            qxVar.b(isCollisionBy(com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem.POI));
            qxVar.c(isCollisionBy(com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem.MARKER));
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Accessible
    public final void setContentDescription(java.lang.String str) {
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (markerOptions != null) {
            markerOptions.contentDescription(str);
        }
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.tencentmap.mapsdk.maps.interfaces.Draggable
    public final void setDraggable(boolean z17) {
        super.setDraggable(z17);
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (markerOptions != null) {
            markerOptions.draggable(z17);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Scalable
    public final void setEqualScale(float f17) {
        a(f17, f17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setFastLoad(boolean z17) {
        com.tencent.mapsdk.internal.qx qxVar = this.M;
        if (qxVar == null) {
            return;
        }
        qxVar.d(z17);
        w();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setFixingPoint(int i17, int i18) {
        this.I = i17;
        this.f50689J = i18;
        if (this.M != null) {
            setFixingPointEnable(true);
            this.M.a(new com.tencent.map.lib.models.GeoPoint(this.f50689J, this.I));
        }
        com.tencent.mapsdk.internal.ew ewVar = this.G;
        if (ewVar != null) {
            ewVar.a(i17, i18);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setFixingPointEnable(boolean z17) {
        this.H = z17;
        com.tencent.mapsdk.internal.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.a(z17);
        }
        com.tencent.mapsdk.internal.ew ewVar = this.G;
        if (ewVar != null) {
            if (z17) {
                ewVar.a(this.I, this.f50689J);
            } else {
                ewVar.b(false);
            }
        }
        w();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setIcon(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor) {
        com.tencent.mapsdk.internal.tr trVar = this.F;
        if (trVar == null) {
            return;
        }
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor defaultMarker = com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.defaultMarker(trVar.d_);
        com.tencent.mapsdk.internal.tr trVar2 = this.F;
        if (trVar2 != null) {
            if (bitmapDescriptor == null && defaultMarker != null) {
                bitmapDescriptor = defaultMarker;
            }
            if (bitmapDescriptor != null) {
                if (this.M != null) {
                    com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator formater = bitmapDescriptor.getFormater();
                    a(trVar2.I(), formater, formater.getFormateType() == 10 && this.f50699w.isIconLooperEnable());
                }
                com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
                if (markerOptions != null) {
                    markerOptions.icon(bitmapDescriptor);
                }
                com.tencent.mapsdk.internal.ew ewVar = this.G;
                if (ewVar != null) {
                    ewVar.f();
                }
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setIconLooper(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor, boolean z17, int i17) {
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (markerOptions != null) {
            markerOptions.icon(bitmapDescriptor);
            this.f50699w.iconLooper(z17, i17);
        }
        final boolean isIconLooperEnable = this.f50699w.isIconLooperEnable();
        int activeSize = this.f50699w.getIcon().getFormater().activeSize();
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50203d, "iconLooper totalSize:".concat(java.lang.String.valueOf(activeSize)));
        if (activeSize > 1) {
            this.V = -1;
            com.tencent.mapsdk.internal.ib ibVar = new com.tencent.mapsdk.internal.ib();
            ibVar.a(this.f50699w.getIconLooperDuration());
            ibVar.a(new com.tencent.mapsdk.internal.ib.a() { // from class: com.tencent.mapsdk.internal.pp.3
                @Override // com.tencent.mapsdk.internal.ib.a
                public final void a(float f17) {
                    com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions2;
                    super.a(f17);
                    if (com.tencent.mapsdk.internal.pp.this.M == null || com.tencent.mapsdk.internal.pp.this.F == null || (markerOptions2 = com.tencent.mapsdk.internal.pp.this.f50699w) == null) {
                        return;
                    }
                    com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor icon = markerOptions2.getIcon();
                    int activeSize2 = icon.getFormater().activeSize();
                    com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50203d, "current Marker iconLooper getValue:".concat(java.lang.String.valueOf(f17)));
                    int round = java.lang.Math.round(activeSize2 * f17);
                    com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50203d, "current Marker iconLooper activeIndex:".concat(java.lang.String.valueOf(round)));
                    if (round != com.tencent.mapsdk.internal.pp.this.V) {
                        com.tencent.mapsdk.internal.pp ppVar = com.tencent.mapsdk.internal.pp.this;
                        ppVar.a(ppVar.F.I(), icon.getFormater(), isIconLooperEnable);
                        icon.getFormater().nextActiveIndex();
                        com.tencent.mapsdk.internal.pp.this.V = round;
                    }
                }
            });
            this.M.f51092r = ibVar;
            ibVar.a(isIconLooperEnable);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setInfoWindowAnchor(float f17, float f18) {
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (markerOptions != null) {
            markerOptions.infoWindowAnchor(f17, f18);
        }
        com.tencent.mapsdk.internal.ew ewVar = this.G;
        if (ewVar != null) {
            ewVar.f();
        }
        w();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setInfoWindowEnable(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (markerOptions != null) {
            markerOptions.infoWindowEnable(z17);
        }
        com.tencent.mapsdk.internal.ew ewVar = this.G;
        if (ewVar != null) {
            ewVar.a(z17);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setInfoWindowOffset(int i17, int i18) {
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (markerOptions != null) {
            markerOptions.infoWindowOffset(i17, i18);
        }
        com.tencent.mapsdk.internal.ew ewVar = this.G;
        if (ewVar != null) {
            ewVar.f();
        }
        w();
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public final void setLevel(int i17) {
        super.setLevel(i17);
        com.tencent.mapsdk.internal.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.setLevel(i17);
        }
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (markerOptions != null) {
            markerOptions.level(i17);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setOnTop() {
        com.tencent.mapsdk.internal.tr trVar = this.F;
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (trVar == null || markerOptions == null) {
            return;
        }
        synchronized (trVar.f52192g) {
            java.util.List<com.tencent.tencentmap.mapsdk.maps.model.Marker> b17 = trVar.f52273as.f50497J.b();
            if (b17.size() > 0) {
                com.tencent.tencentmap.mapsdk.maps.model.Marker marker = b17.get(b17.size() - 1);
                setLevel(marker.getLevel());
                setZIndex(marker.getZIndex() + 1);
                refreshInfoWindow();
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setPosition(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this.T = latLng;
        if (latLng != null) {
            a(com.tencent.map.lib.models.GeoPoint.from(latLng));
        }
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (markerOptions != null) {
            markerOptions.position(latLng);
        }
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.tencentmap.mapsdk.maps.interfaces.Rotatable
    public final void setRotation(float f17) {
        super.setRotation(f17);
        com.tencent.mapsdk.internal.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.a((int) getRotation());
        }
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (markerOptions != null) {
            markerOptions.rotation(f17);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Scalable
    public final void setScale(float f17, float f18) {
        a(f17, f18);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setSnippet(java.lang.String str) {
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (markerOptions != null) {
            markerOptions.snippet(str);
        }
        com.tencent.mapsdk.internal.ew ewVar = this.G;
        if (ewVar != null) {
            ewVar.f();
        }
    }

    @Override // com.tencent.mapsdk.internal.po
    public final void setTag(java.lang.Object obj) {
        super.setTag(obj);
        com.tencent.mapsdk.internal.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.setTag(obj);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setText(java.lang.String str) {
        com.tencent.mapsdk.internal.qx qxVar;
        com.tencent.mapsdk.internal.pi f17;
        this.P = str;
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (markerOptions != null) {
            markerOptions.text(str);
        }
        if (this.O != com.tencent.tencentmap.mapsdk.maps.model.MarkerType.TEXT_MARKER || (qxVar = this.M) == null || (f17 = qxVar.f()) == null) {
            return;
        }
        f17.a(str);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setTextStyle(com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle markerTextStyle) {
        com.tencent.mapsdk.internal.qx qxVar;
        com.tencent.mapsdk.internal.pi f17;
        this.Q = markerTextStyle;
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (markerOptions != null) {
            markerOptions.textStyle(markerTextStyle);
        }
        if (this.O != com.tencent.tencentmap.mapsdk.maps.model.MarkerType.TEXT_MARKER || (qxVar = this.M) == null || (f17 = qxVar.f()) == null) {
            return;
        }
        f17.a(markerTextStyle);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setTitle(java.lang.String str) {
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (markerOptions != null) {
            markerOptions.title(str);
        }
        if (this.G == null || !isInfoWindowEnable()) {
            return;
        }
        this.G.f();
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Visible
    public final void setVisible(boolean z17) {
        M m17;
        super.setVisible(z17);
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (markerOptions != null) {
            markerOptions.visible(z17);
        }
        com.tencent.mapsdk.internal.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.setVisible(z17);
        }
        com.tencent.mapsdk.internal.ew ewVar = this.G;
        if (ewVar != null) {
            ewVar.setVisible(z17 && ewVar.c());
        }
        com.tencent.mapsdk.internal.tr trVar = this.F;
        if (trVar == null || (m17 = trVar.e_) == 0) {
            return;
        }
        ((com.tencent.mapsdk.vector.VectorMap) m17).f52512o.f50522v = true;
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public final void setZIndex(float f17) {
        this.f50674h = f17;
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (markerOptions != null) {
            markerOptions.zIndex(f17);
        }
        com.tencent.mapsdk.internal.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.setZIndex((int) f17);
        }
        w();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void showInfoWindow() {
        com.tencent.mapsdk.internal.ew pnVar;
        com.tencent.mapsdk.internal.tr trVar = this.F;
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (trVar == null || markerOptions == null) {
            return;
        }
        com.tencent.mapsdk.internal.ne neVar = trVar.f52273as;
        synchronized (trVar.f52192g) {
            if (!trVar.f52182ac) {
                for (com.tencent.tencentmap.mapsdk.maps.model.Marker marker : trVar.f52273as.f50497J.b()) {
                    if (marker != null && marker.isInfoWindowShown()) {
                        marker.hideInfoWindow();
                    }
                }
            }
            if (isInfoWindowEnable()) {
                com.tencent.mapsdk.internal.ew ewVar = this.G;
                if (ewVar == null) {
                    if (markerOptions.isViewInfowindow()) {
                        com.tencent.mapsdk.internal.bh bhVar = neVar.f50497J;
                        pnVar = new com.tencent.mapsdk.internal.ps((com.tencent.mapsdk.internal.tr) bhVar.f48954i, this);
                        bhVar.f48948c.add(pnVar);
                        com.tencent.mapsdk.core.utils.log.LogUtil.b("Marker", "this[" + getId() + " :" + a() + "] addViewInfoWindow => child:" + pnVar.getId());
                    } else {
                        com.tencent.mapsdk.internal.bh bhVar2 = neVar.f50497J;
                        pnVar = new com.tencent.mapsdk.internal.pn((com.tencent.mapsdk.internal.tr) bhVar2.f48954i, this);
                        bhVar2.f48946a.put(pnVar.getId(), pnVar);
                        bhVar2.f48948c.add(pnVar);
                        com.tencent.mapsdk.core.utils.log.LogUtil.b("Marker", "this[" + getId() + " :" + a() + "] addInfoWindow => child:" + pnVar.getId());
                        a((com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit) pnVar);
                    }
                    a(pnVar);
                    this.G = pnVar;
                } else {
                    ewVar.f();
                    a(ewVar);
                }
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    public final boolean startAnimation() {
        M m17;
        com.tencent.mapsdk.internal.tr trVar = this.F;
        if (trVar == null || this.R == null) {
            return false;
        }
        com.tencent.map.lib.models.GeoPoint geoPoint = this.f50701y;
        if (this.H && (m17 = trVar.e_) != 0) {
            geoPoint = ((com.tencent.mapsdk.vector.VectorMap) m17).getProjection().a(new com.tencent.mapsdk.internal.fu(this.I, this.f50689J));
            this.L = new com.tencent.map.lib.models.GeoPoint(geoPoint);
        }
        return this.R.a(geoPoint, this.A);
    }

    public final java.lang.String toString() {
        return "GLMarkerOverlay{id='" + getId() + "'nativeId='" + a() + "'tag='" + getTag() + "'}";
    }

    private void b(int[] iArr, int[] iArr2) {
        if (a(iArr)) {
            return;
        }
        b(iArr2);
    }

    @Override // com.tencent.mapsdk.internal.an
    public final android.graphics.Point c() {
        return new android.graphics.Point(this.I, this.f50689J);
    }

    @Override // com.tencent.mapsdk.internal.an
    public final com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerClickListener d() {
        return this.S;
    }

    @Override // com.tencent.mapsdk.internal.an
    public final java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> e() {
        com.tencent.mapsdk.vector.VectorMap vectorMap;
        android.graphics.Rect bound;
        com.tencent.mapsdk.internal.tr trVar = this.F;
        if (trVar == null || (vectorMap = (com.tencent.mapsdk.vector.VectorMap) trVar.e_) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (E() != null) {
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(r2.top / 1000000.0d, r2.left / 1000000.0d);
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(r2.bottom / 1000000.0d, r2.left / 1000000.0d);
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng3 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(r2.top / 1000000.0d, r2.right / 1000000.0d);
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng4 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(r2.bottom / 1000000.0d, r2.right / 1000000.0d);
            arrayList.add(latLng);
            arrayList.add(latLng2);
            arrayList.add(latLng3);
            arrayList.add(latLng4);
        }
        com.tencent.mapsdk.internal.ew ewVar = this.G;
        if (ewVar != null && ewVar.c() && (bound = ewVar.getBound(vectorMap.getProjection())) != null) {
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng5 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(bound.top / 1000000.0d, bound.left / 1000000.0d);
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng6 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(bound.bottom / 1000000.0d, bound.left / 1000000.0d);
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng7 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(bound.top / 1000000.0d, bound.right / 1000000.0d);
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng8 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng(bound.bottom / 1000000.0d, bound.right / 1000000.0d);
            arrayList.add(latLng5);
            arrayList.add(latLng6);
            arrayList.add(latLng7);
            arrayList.add(latLng8);
        }
        return arrayList;
    }

    @Override // com.tencent.mapsdk.internal.an
    public final java.util.List<com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable<com.tencent.mapsdk.internal.ey>> f() {
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        arrayList.add(this.M);
        com.tencent.mapsdk.internal.ew ewVar = this.G;
        if (ewVar != null && ewVar.c()) {
            arrayList.add(this.G);
        }
        return arrayList;
    }

    @Override // com.tencent.mapsdk.internal.an
    public final com.tencent.tencentmap.mapsdk.maps.TencentMap.InfoWindowAdapter g() {
        com.tencent.mapsdk.internal.tr trVar = this.F;
        if (trVar != null) {
            return trVar.R();
        }
        return null;
    }

    private void b(int[] iArr) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerCollisionStatusListener S = this.F.S();
        if (S == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit markerCollisionRelationUnit : l()) {
            com.tencent.mapsdk.internal.po c17 = this.F.c(markerCollisionRelationUnit.getId());
            if (c17 != null) {
                int a17 = c17.a();
                if (iArr != null && iArr.length > 0) {
                    if (java.util.Arrays.binarySearch(iArr, a17) >= 0) {
                        com.tencent.mapsdk.core.utils.log.LogUtil.b("Marker", "dispatchCollisionOnRelationUnits shown Marker[" + getId() + ":" + a() + "] RelationUnit = [" + markerCollisionRelationUnit.getId() + " :" + a17 + "]");
                        arrayList2.add(markerCollisionRelationUnit);
                    } else {
                        arrayList.add(c17);
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        int i17 = com.tencent.mapsdk.internal.pp.AnonymousClass5.f50709a[m().ordinal()];
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            S.onCollisionShown(this, l());
        } else {
            S.onCollisionShown(this, arrayList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f17, float f18) {
        int anchorU;
        if (f17 >= 0.0f) {
            this.C = f17;
        }
        if (f18 >= 0.0f) {
            this.D = f18;
        }
        com.tencent.mapsdk.internal.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.b(this.C, this.D);
            int height = getHeight(this.F.I());
            float width = getWidth(this.F.I());
            float f19 = this.C * width;
            if (f19 >= width) {
                float f27 = f19 - width;
                anchorU = (int) ((0.5f * f27) - (getAnchorU() * f27));
            } else {
                float f28 = width - f19;
                anchorU = (int) ((getAnchorU() * f28) - (f28 * 0.5f));
            }
            float f29 = height;
            this.f50699w.infoWindowOffset(anchorU, (int) (getAnchorV() * (f29 - (this.D * f29))));
        }
        if (this.G != null) {
            refreshInfoWindow();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    public final void startAnimation(com.tencent.tencentmap.mapsdk.maps.model.Animation animation) {
        setAnimation(animation);
        startAnimation();
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.ev, com.tencent.mapsdk.internal.am
    public final int a() {
        com.tencent.mapsdk.internal.qx qxVar = this.M;
        if (qxVar != null) {
            return qxVar.a();
        }
        return super.a();
    }

    private void b(android.graphics.Bitmap bitmap, boolean z17) {
        synchronized (this.f50692p) {
            this.f50690b = bitmap;
            if (this.f50700x == null) {
                this.f50700x = bitmap.toString();
            }
            com.tencent.mapsdk.internal.qx qxVar = this.M;
            if (qxVar != null) {
                qxVar.a(this.f50700x, z17, this.f50690b);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.an
    public final void a(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor, com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor2) {
        com.tencent.mapsdk.internal.tr trVar = this.F;
        if (trVar == null) {
            return;
        }
        if (bitmapDescriptor == null && bitmapDescriptor2 != null) {
            bitmapDescriptor = bitmapDescriptor2;
        }
        if (bitmapDescriptor == null) {
            return;
        }
        if (this.M != null) {
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator formater = bitmapDescriptor.getFormater();
            a(trVar.I(), formater, formater.getFormateType() == 10 && this.f50699w.isIconLooperEnable());
        }
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (markerOptions != null) {
            markerOptions.icon(bitmapDescriptor);
        }
        com.tencent.mapsdk.internal.ew ewVar = this.G;
        if (ewVar != null) {
            ewVar.f();
        }
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au
    /* renamed from: b */
    public final android.graphics.Rect getBound(com.tencent.mapsdk.internal.ey eyVar) {
        return E();
    }

    private int b(boolean z17) {
        float e17;
        android.graphics.Bitmap bitmap = this.f50690b;
        if (bitmap == null || this.M == null) {
            return 0;
        }
        int height = bitmap.getHeight();
        if (!z17) {
            e17 = height * this.M.e();
        } else {
            e17 = height * (1.0f - this.M.e());
        }
        return (int) e17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator bitmapFormator, boolean z17) {
        if (bitmapFormator != null) {
            android.graphics.Bitmap bitmap = bitmapFormator.getBitmap(context);
            java.lang.String str = this.f50700x;
            if (str == null || !str.equals(bitmapFormator.getBitmapId())) {
                a(bitmapFormator.getBitmapId());
                a(bitmap, z17);
            }
        }
    }

    private boolean b(com.tencent.mapsdk.internal.ew ewVar) {
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions = this.f50699w;
        if (markerOptions == null || !markerOptions.isInfoWindowEnable()) {
            return false;
        }
        return ((ewVar == null || ewVar.g() == null) && com.tencent.mapsdk.internal.hr.a(markerOptions.getTitle()) && com.tencent.mapsdk.internal.hr.a(markerOptions.getSnippet())) ? false : true;
    }

    private void a(com.tencent.map.lib.models.GeoPoint geoPoint) {
        if (geoPoint == null) {
            return;
        }
        com.tencent.map.lib.models.GeoPoint geoPoint2 = this.f50701y;
        if (geoPoint2 == null) {
            this.f50701y = new com.tencent.map.lib.models.GeoPoint(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6());
        } else {
            geoPoint2.setLatitudeE6(geoPoint.getLatitudeE6());
            this.f50701y.setLongitudeE6(geoPoint.getLongitudeE6());
        }
        com.tencent.mapsdk.internal.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.a(this.f50701y);
        }
        com.tencent.mapsdk.internal.ew ewVar = this.G;
        if (ewVar != null) {
            ewVar.a(com.tencent.mapsdk.internal.kr.a(this.f50701y));
        }
    }

    @Override // com.tencent.mapsdk.internal.an
    public final boolean b() {
        return this.H;
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit markerCollisionRelationUnit) {
        com.tencent.mapsdk.internal.qx qxVar;
        if (markerCollisionRelationUnit == null) {
            return;
        }
        com.tencent.mapsdk.internal.po c17 = this.F.c(markerCollisionRelationUnit.getId());
        if (c17 instanceof com.tencent.mapsdk.internal.pp) {
            qxVar = ((com.tencent.mapsdk.internal.pp) c17).M;
        } else {
            qxVar = c17 instanceof com.tencent.mapsdk.internal.pn ? ((com.tencent.mapsdk.internal.pn) c17).f50656d : null;
        }
        if (qxVar != null) {
            qxVar.f51095u = m();
            this.M.a(qxVar);
        }
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation markerCollisionRelation) {
        this.X = markerCollisionRelation;
        com.tencent.mapsdk.internal.qx qxVar = this.M;
        if (qxVar != null) {
            qxVar.f51095u = markerCollisionRelation;
        }
    }

    @Override // com.tencent.mapsdk.internal.an
    public final void a(int[] iArr, int[] iArr2) {
        boolean z17;
        boolean z18 = true;
        if (iArr == null || iArr.length <= 0 || java.util.Arrays.binarySearch(iArr, a()) < 0) {
            z17 = false;
        } else {
            com.tencent.mapsdk.core.utils.log.LogUtil.b("Marker", "dispatchCollisionOnMarker hidden = [" + getTag() + " :" + a() + "]");
            com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerCollisionStatusListener S = this.F.S();
            int i17 = com.tencent.mapsdk.internal.pp.AnonymousClass5.f50709a[m().ordinal()];
            if (i17 == 1) {
                A();
                if (S != null) {
                    S.onCollisionHidden(this, new java.util.ArrayList());
                }
            } else if (i17 == 2 && S != null) {
                S.onCollisionHidden(this, l());
            }
            z17 = true;
        }
        if (z17 || iArr2 == null || iArr2.length <= 0 || java.util.Arrays.binarySearch(iArr2, a()) < 0) {
            z18 = z17;
        } else {
            com.tencent.mapsdk.core.utils.log.LogUtil.b("Marker", "dispatchCollisionOnMarker show = [" + getTag() + " :" + a() + "]");
            com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation m17 = m();
            com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerCollisionStatusListener S2 = this.F.S();
            int i18 = com.tencent.mapsdk.internal.pp.AnonymousClass5.f50709a[m17.ordinal()];
            if (i18 == 1) {
                B();
                if (S2 != null) {
                    S2.onCollisionShown(this, new java.util.ArrayList());
                }
            } else if (i18 == 2 && S2 != null) {
                S2.onCollisionShown(this, l());
            }
        }
        if (z18 || a(iArr)) {
            return;
        }
        b(iArr2);
    }

    private boolean a(int[] iArr) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerCollisionStatusListener S = this.F.S();
        boolean z17 = false;
        if (S == null) {
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit markerCollisionRelationUnit : l()) {
            com.tencent.mapsdk.internal.po c17 = this.F.c(markerCollisionRelationUnit.getId());
            if (c17 != null) {
                int a17 = c17.a();
                if (iArr != null && iArr.length > 0) {
                    if (java.util.Arrays.binarySearch(iArr, a17) >= 0) {
                        com.tencent.mapsdk.core.utils.log.LogUtil.b("Marker", "dispatchCollisionOnRelationUnits hidden Marker[" + getId() + ":" + a() + "] RelationUnit = [" + markerCollisionRelationUnit.getId() + " :" + a17 + "]");
                        arrayList2.add(markerCollisionRelationUnit);
                    } else {
                        arrayList.add(c17);
                    }
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            int i17 = com.tencent.mapsdk.internal.pp.AnonymousClass5.f50709a[m().ordinal()];
            z17 = true;
            if (i17 == 1) {
                S.onCollisionHidden(this, arrayList2);
            } else if (i17 == 2) {
                S.onCollisionHidden(this, l());
            }
        }
        return z17;
    }

    private void a(java.lang.String str) {
        synchronized (this.f50692p) {
            this.f50700x = str;
        }
    }

    @Override // com.tencent.mapsdk.internal.an
    public final void a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        com.tencent.mapsdk.internal.ew ewVar;
        com.tencent.mapsdk.internal.tr trVar = this.F;
        setPosition(latLng);
        if (!getId().equals(trVar != null ? trVar.f52193h : "") || (ewVar = this.G) == null) {
            return;
        }
        ewVar.a(latLng);
    }

    @Override // com.tencent.mapsdk.internal.an
    public final void a(android.graphics.Bitmap bitmap, boolean z17) {
        if (bitmap == null) {
            return;
        }
        b(bitmap, z17);
        C();
    }

    private void a(com.tencent.mapsdk.internal.im imVar) {
        this.R = imVar;
        if (imVar != null) {
            imVar.a(this.W);
        }
    }

    @Override // com.tencent.mapsdk.internal.an
    public final void a(com.tencent.tencentmap.mapsdk.maps.model.AnimationListener animationListener) {
        this.N = animationListener;
    }

    @Override // com.tencent.mapsdk.internal.an
    public final void a(boolean z17) {
        this.E = z17;
    }

    @Override // com.tencent.mapsdk.internal.an
    public final void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerClickListener onMarkerClickListener) {
        this.S = onMarkerClickListener;
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: a */
    public final android.graphics.Rect getScreenBound(com.tencent.mapsdk.internal.ey eyVar) {
        com.tencent.mapsdk.internal.qx qxVar = this.M;
        if (qxVar == null) {
            return null;
        }
        android.graphics.Rect screenBound = qxVar.getScreenBound(eyVar);
        com.tencent.mapsdk.internal.ew ewVar = this.G;
        android.graphics.Rect screenBound2 = ewVar != null ? ewVar.getScreenBound(eyVar) : null;
        if (screenBound == null) {
            return screenBound2;
        }
        if (screenBound2 == null) {
            return screenBound;
        }
        return new android.graphics.Rect(java.lang.Math.min(screenBound.left, screenBound2.left), java.lang.Math.min(screenBound.top, screenBound2.top), java.lang.Math.max(screenBound.right, screenBound2.right), java.lang.Math.max(screenBound.bottom, screenBound2.bottom));
    }

    private void a(com.tencent.mapsdk.internal.ew ewVar) {
        if (ewVar == null) {
            return;
        }
        if (this.H) {
            ewVar.a(this.I, this.f50689J);
        }
        if (b(ewVar)) {
            ewVar.c(true);
        }
    }
}
