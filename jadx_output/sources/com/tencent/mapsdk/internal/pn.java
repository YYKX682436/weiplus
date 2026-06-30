package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class pn extends com.tencent.mapsdk.internal.po<com.tencent.mapsdk.internal.am> implements com.tencent.mapsdk.internal.am {

    /* renamed from: y, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicInteger f50655y = new java.util.concurrent.atomic.AtomicInteger(0);
    private android.view.View A;
    private com.tencent.tencentmap.mapsdk.maps.interfaces.Collision[] B;
    private boolean C;

    /* renamed from: d, reason: collision with root package name */
    com.tencent.mapsdk.internal.qx f50656d;

    /* renamed from: p, reason: collision with root package name */
    private com.tencent.mapsdk.internal.an f50657p;

    /* renamed from: q, reason: collision with root package name */
    private android.graphics.Bitmap f50658q;

    /* renamed from: r, reason: collision with root package name */
    private int f50659r;

    /* renamed from: s, reason: collision with root package name */
    private int f50660s;

    /* renamed from: t, reason: collision with root package name */
    private com.tencent.map.lib.models.GeoPoint f50661t;

    /* renamed from: u, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.tr f50662u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f50663v;

    /* renamed from: w, reason: collision with root package name */
    private float f50664w;

    /* renamed from: x, reason: collision with root package name */
    private float f50665x;

    /* renamed from: z, reason: collision with root package name */
    private boolean f50666z;

    public pn(com.tencent.mapsdk.internal.tr trVar, com.tencent.mapsdk.internal.an anVar) {
        super(trVar);
        this.f50658q = null;
        this.f50659r = 0;
        this.f50660s = 0;
        this.f50661t = null;
        this.f50663v = false;
        this.f50664w = 0.5f;
        this.f50665x = 0.5f;
        this.f50666z = false;
        this.C = true;
        this.f50662u = trVar;
        this.f50657p = anVar;
        if (trVar == null || anVar == null || anVar.getOptions() == null) {
            return;
        }
        i();
        if (((com.tencent.mapsdk.vector.VectorMap) trVar.e_).f52512o.f50511k != null) {
            this.f50656d = new com.tencent.mapsdk.internal.qx(this, trVar, b(anVar.getOptions()));
            com.tencent.mapsdk.core.utils.log.LogUtil.b("create InfoWindowView:" + this.A);
            this.f50656d.f51095u = anVar.m();
            a(com.tencent.mapsdk.internal.hl.a(this.A), anVar.getOptions().isIconLooperEnable());
        }
    }

    public static android.view.View a(android.content.Context context, com.tencent.mapsdk.internal.bd bdVar, com.tencent.mapsdk.internal.ew ewVar, com.tencent.tencentmap.mapsdk.maps.TencentMap.InfoWindowAdapter infoWindowAdapter, com.tencent.tencentmap.mapsdk.maps.model.Marker marker) {
        if (context == null || ewVar == null || marker == null || bdVar == null) {
            return null;
        }
        java.lang.String title = marker.getTitle();
        java.lang.String snippet = marker.getSnippet();
        if (infoWindowAdapter == null) {
            if (com.tencent.mapsdk.internal.hr.a(title) && com.tencent.mapsdk.internal.hr.a(snippet)) {
                return null;
            }
            return a(context, bdVar, ewVar, title, snippet);
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ewVar.g();
        if (linearLayout == null) {
            linearLayout = a(context);
        }
        com.tencent.mapsdk.internal.av avVar = (com.tencent.mapsdk.internal.av) bdVar.e().f48963c.a(marker.getId(), com.tencent.mapsdk.internal.av.class);
        if (avVar == null) {
            return null;
        }
        android.view.View infoWindow = infoWindowAdapter.getInfoWindow(avVar);
        if (infoWindow != null) {
            if (infoWindow.getParent() == linearLayout) {
                return linearLayout;
            }
            if (infoWindow.getParent() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) infoWindow.getParent()).removeAllViews();
            }
            linearLayout.setBackgroundDrawable(null);
            a(linearLayout);
            linearLayout.addView(infoWindow);
            return linearLayout;
        }
        android.view.View infoContents = infoWindowAdapter.getInfoContents(avVar);
        if (infoContents != null) {
            if (infoContents.getParent() == linearLayout) {
                return linearLayout;
            }
            if (infoContents.getParent() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) infoContents.getParent()).removeAllViews();
            }
            a(linearLayout);
            a(linearLayout, "marker_infowindow.9.png");
            linearLayout.addView(infoContents);
            return linearLayout;
        }
        if (com.tencent.mapsdk.internal.hr.a(title) && com.tencent.mapsdk.internal.hr.a(snippet)) {
            return null;
        }
        a(linearLayout, "marker_infowindow.9.png");
        linearLayout.removeAllViews();
        a(bdVar, linearLayout, com.tencent.mapsdk.internal.ew.f49423b, title);
        a(bdVar, linearLayout, com.tencent.mapsdk.internal.ew.f49424c, snippet);
        return linearLayout;
    }

    private com.tencent.mapsdk.internal.qy b(com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions) {
        int infoWindowOffsetX = markerOptions.getInfoWindowOffsetX();
        int infowindowOffsetY = markerOptions.getInfowindowOffsetY();
        d();
        e();
        float f17 = this.f50664w - ((infoWindowOffsetX * 1.0f) / this.f50659r);
        float f18 = this.f50665x - ((infowindowOffsetY * 1.0f) / this.f50660s);
        com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem[] infoWindowCollisions = markerOptions.getInfoWindowCollisions();
        if (infoWindowCollisions == null || markerOptions.getCollisionRelation() == com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation.TOGETHER) {
            infoWindowCollisions = markerOptions.getCollisions();
        }
        setCollisions(infoWindowCollisions);
        com.tencent.mapsdk.internal.qy qyVar = new com.tencent.mapsdk.internal.qy();
        qyVar.f51109i = com.tencent.map.lib.models.GeoPoint.from(markerOptions.getPosition());
        qyVar.f51113m = markerOptions.getAlpha();
        com.tencent.mapsdk.internal.qy a17 = qyVar.a(f17, f18);
        a17.f51114n = false;
        a17.f51124x = isCollisionBy(com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem.POI);
        a17.f51125y = isCollisionBy(com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem.MARKER);
        a17.f51119s = (int) markerOptions.getZIndex();
        a17.f51120t = markerOptions.getLevel();
        a17.f51121u = this.f50663v;
        a17.A = "InfoWindow Of " + markerOptions.getTag();
        a17.f51122v = true;
        return a17;
    }

    private void h() {
        com.tencent.mapsdk.internal.an anVar = this.f50657p;
        if (this.f50662u == null || anVar == null || anVar.getOptions() == null) {
            return;
        }
        i();
        com.tencent.mapsdk.internal.tr trVar = this.f50662u;
        if (((com.tencent.mapsdk.vector.VectorMap) trVar.e_).f52512o.f50511k == null) {
            return;
        }
        this.f50656d = new com.tencent.mapsdk.internal.qx(this, trVar, b(anVar.getOptions()));
        com.tencent.mapsdk.core.utils.log.LogUtil.b("create InfoWindowView:" + this.A);
        this.f50656d.f51095u = anVar.m();
        a(com.tencent.mapsdk.internal.hl.a(this.A), anVar.getOptions().isIconLooperEnable());
    }

    private void i() {
        com.tencent.mapsdk.internal.tr trVar = this.f50662u;
        if (trVar == null || trVar.I() == null) {
            return;
        }
        com.tencent.mapsdk.internal.an anVar = this.f50657p;
        android.view.View a17 = a(trVar.I(), (com.tencent.mapsdk.internal.bd) trVar.d_, this, anVar != null ? anVar.g() : null, anVar);
        this.A = a17;
        if (a17 == null || a17.isInLayout()) {
            return;
        }
        if (this.A.isLayoutRequested() || this.A.getWidth() == 0 || this.A.getHeight() == 0) {
            this.A.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            this.f50659r = this.A.getMeasuredWidth();
            int measuredHeight = this.A.getMeasuredHeight();
            this.f50660s = measuredHeight;
            this.A.layout(0, 0, this.f50659r, measuredHeight);
            this.A.setLayoutParams(new android.widget.FrameLayout.LayoutParams(this.f50659r, this.f50660s));
        }
    }

    private com.tencent.mapsdk.internal.am j() {
        return this;
    }

    private com.tencent.mapsdk.internal.qx k() {
        return this.f50656d;
    }

    @Override // com.tencent.mapsdk.internal.ew
    public final void c(boolean z17) {
        this.f50666z = z17;
        setVisible(z17);
    }

    @Override // com.tencent.mapsdk.internal.ew
    public final void d() {
        com.tencent.mapsdk.internal.an anVar = this.f50657p;
        com.tencent.mapsdk.internal.tr trVar = this.f50662u;
        if (anVar == null || trVar == null || trVar.I() == null) {
            return;
        }
        int width = anVar.getWidth(trVar.I());
        float infoWindowAnchorU = anVar.getOptions() != null ? anVar.getOptions().getInfoWindowAnchorU() : 0.5f;
        int i17 = this.f50659r;
        if (i17 == 0) {
            i17 = 1;
        }
        this.f50664w = infoWindowAnchorU + ((width * (anVar.getAnchorU() - 0.5f)) / i17);
    }

    @Override // com.tencent.mapsdk.internal.ew
    public final void e() {
        com.tencent.mapsdk.internal.an anVar = this.f50657p;
        com.tencent.mapsdk.internal.tr trVar = this.f50662u;
        if (anVar == null || trVar == null || trVar.I() == null) {
            return;
        }
        int height = (int) (anVar.getHeight(trVar.I()) * anVar.getAnchorV());
        int i17 = this.f50660s;
        float infoWindowAnchorV = anVar.getOptions() != null ? anVar.getOptions().getInfoWindowAnchorV() : 1.0f;
        if (i17 == 0) {
            i17 = 1;
        }
        float f17 = i17;
        this.f50665x = ((height + 5) + (infoWindowAnchorV * f17)) / f17;
    }

    @Override // com.tencent.mapsdk.internal.ew
    public final void f() {
        com.tencent.mapsdk.internal.an anVar = this.f50657p;
        if (anVar == null || !this.C) {
            return;
        }
        a(anVar.getOptions());
    }

    @Override // com.tencent.mapsdk.internal.au
    public final /* bridge */ /* synthetic */ com.tencent.mapsdk.internal.ao f_() {
        return this;
    }

    @Override // com.tencent.mapsdk.internal.ew
    public final android.view.View g() {
        return this.A;
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.model.IOverlay
    public final java.lang.String getId() {
        com.tencent.mapsdk.internal.qx qxVar = this.f50656d;
        return qxVar != null ? qxVar.getId() : super.getId();
    }

    @Override // com.tencent.mapsdk.internal.po
    public final void h_() {
        releaseData();
    }

    @Override // com.tencent.mapsdk.internal.ew
    public final void i_() {
        int i17;
        int i18;
        com.tencent.mapsdk.internal.an anVar = this.f50657p;
        if (anVar == null || anVar.getOptions() == null) {
            i17 = 0;
            i18 = 0;
        } else {
            i17 = anVar.getOptions().getInfoWindowOffsetX();
            i18 = anVar.getOptions().getInfowindowOffsetY();
        }
        d();
        e();
        float f17 = this.f50664w - ((i17 * 1.0f) / this.f50659r);
        float f18 = this.f50665x - ((i18 * 1.0f) / this.f50660s);
        com.tencent.mapsdk.internal.qx qxVar = this.f50656d;
        if (qxVar != null) {
            qxVar.a(f17, f18);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Collisionable
    public final boolean isCollisionBy(final com.tencent.tencentmap.mapsdk.maps.interfaces.Collision collision) {
        com.tencent.tencentmap.mapsdk.maps.interfaces.Collision[] collisionArr = this.B;
        if (collisionArr != null) {
            return com.tencent.map.tools.Util.where(collisionArr, new com.tencent.map.tools.ReturnCallback<java.lang.Boolean, com.tencent.tencentmap.mapsdk.maps.interfaces.Collision>() { // from class: com.tencent.mapsdk.internal.pn.1
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

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Visible
    public final boolean isVisible() {
        return c() && super.isVisible();
    }

    @Override // com.tencent.mapsdk.internal.po
    public final void j_() {
        com.tencent.mapsdk.internal.qx qxVar = this.f50656d;
        if (qxVar != null) {
            qxVar.j_();
        }
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public final boolean onTap(float f17, float f18) {
        com.tencent.mapsdk.internal.qx qxVar = this.f50656d;
        if (qxVar == null) {
            return false;
        }
        return qxVar.onTap(f17, f18);
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.ev
    public final void p() {
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public final void releaseData() {
        this.f50658q = null;
        this.f50657p = null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Collisionable
    public final void setCollisions(com.tencent.tencentmap.mapsdk.maps.interfaces.Collision... collisionArr) {
        this.B = collisionArr;
        com.tencent.mapsdk.internal.qx qxVar = this.f50656d;
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

    @Override // com.tencent.mapsdk.internal.po
    public final void setTag(java.lang.Object obj) {
        super.setTag(obj);
        com.tencent.mapsdk.internal.qx qxVar = this.f50656d;
        if (qxVar != null) {
            qxVar.setTag(obj);
        }
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Visible
    public final void setVisible(boolean z17) {
        M m17;
        super.setVisible(z17);
        com.tencent.mapsdk.internal.qx qxVar = this.f50656d;
        if (qxVar != null) {
            qxVar.setVisible(z17);
        }
        com.tencent.mapsdk.internal.tr trVar = this.f50662u;
        if (trVar == null || (m17 = trVar.e_) == 0) {
            return;
        }
        ((com.tencent.mapsdk.vector.VectorMap) m17).f52512o.f50522v = true;
    }

    public final java.lang.String toString() {
        return "GLInfoWindowOverlay{id='" + getId() + "'nativeId='" + a() + "'tag='" + getTag() + "'}";
    }

    @Override // com.tencent.mapsdk.internal.ew
    public final boolean c() {
        return this.f50666z && this.f50658q != null;
    }

    private static void a(android.widget.LinearLayout linearLayout) {
        linearLayout.removeAllViews();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
        linearLayout.setPadding(0, 0, 0, 0);
        marginLayoutParams.setMargins(0, 0, 0, 0);
        linearLayout.setLayoutParams(marginLayoutParams);
    }

    private static android.view.View a(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapContext tencentMapContext, com.tencent.mapsdk.internal.ew ewVar, java.lang.String str, java.lang.String str2) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ewVar.g();
        if (linearLayout == null) {
            linearLayout = a(context);
        } else {
            linearLayout.removeAllViews();
        }
        a(linearLayout, "marker_infowindow.9.png");
        a(tencentMapContext, linearLayout, com.tencent.mapsdk.internal.ew.f49423b, str);
        a(tencentMapContext, linearLayout, com.tencent.mapsdk.internal.ew.f49424c, str2);
        return linearLayout;
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: b */
    public final android.graphics.Rect getBound(com.tencent.mapsdk.internal.ey eyVar) {
        com.tencent.mapsdk.internal.qx qxVar = this.f50656d;
        if (qxVar != null) {
            return qxVar.getBound(eyVar);
        }
        return new android.graphics.Rect(0, 0, 0, 0);
    }

    @Override // com.tencent.mapsdk.internal.ew
    public final void b(boolean z17) {
        this.f50663v = z17;
        com.tencent.mapsdk.internal.qx qxVar = this.f50656d;
        if (qxVar != null) {
            qxVar.a(z17);
        }
    }

    private static android.widget.LinearLayout a(android.content.Context context) {
        if (context == null) {
            return null;
        }
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setTag(com.tencent.mapsdk.internal.ew.f49422a);
        linearLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        return linearLayout;
    }

    private static void a(android.view.ViewGroup viewGroup, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            viewGroup.setBackgroundDrawable(null);
        }
        android.graphics.Bitmap b17 = com.tencent.mapsdk.internal.hl.b(viewGroup.getContext(), str);
        if (b17 != null) {
            viewGroup.setBackgroundDrawable(new android.graphics.drawable.NinePatchDrawable(viewGroup.getContext().getResources(), b17, b17.getNinePatchChunk(), new android.graphics.Rect(10, 10, 10, 30), null));
        }
    }

    private static void a(com.tencent.tencentmap.mapsdk.maps.TencentMapContext tencentMapContext, android.widget.LinearLayout linearLayout, java.lang.String str, java.lang.String str2) {
        if (linearLayout == null || linearLayout.getContext() == null) {
            return;
        }
        android.content.Context context = linearLayout.getContext();
        android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewWithTag(str);
        if (android.text.TextUtils.isEmpty(str2)) {
            if (textView != null) {
                linearLayout.removeView(textView);
                return;
            }
            return;
        }
        if (textView == null) {
            textView = new com.tencent.mapsdk.internal.nb(context, tencentMapContext);
            textView.setTag(str);
            textView.setGravity(3);
            textView.setTextColor(-16777216);
            linearLayout.addView(textView, new android.widget.LinearLayout.LayoutParams(-2, -2));
        }
        textView.setText(str2);
    }

    @Override // com.tencent.mapsdk.internal.ew
    public final void a(com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions) {
        if (markerOptions == null || this.f50656d == null) {
            return;
        }
        setVisible(markerOptions.isVisible());
        setLevel(markerOptions.getLevel());
        i();
        com.tencent.mapsdk.internal.qy b17 = b(markerOptions);
        if (b17 == null) {
            return;
        }
        this.f50656d.a(b17);
        a(com.tencent.mapsdk.internal.hl.a(this.A), markerOptions.isIconLooperEnable());
    }

    @Override // com.tencent.mapsdk.internal.ew
    public final void a(boolean z17) {
        this.C = z17;
        if (c()) {
            setVisible(z17);
        }
    }

    @Override // com.tencent.mapsdk.internal.ew
    public final void a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        if (latLng == null) {
            return;
        }
        com.tencent.map.lib.models.GeoPoint geoPoint = this.f50661t;
        if (geoPoint == null) {
            this.f50661t = com.tencent.map.lib.models.GeoPoint.from(latLng);
        } else {
            geoPoint.setLatitudeE6((int) (latLng.latitude * 1000000.0d));
            this.f50661t.setLongitudeE6((int) (latLng.longitude * 1000000.0d));
        }
        com.tencent.mapsdk.internal.qx qxVar = this.f50656d;
        if (qxVar != null) {
            qxVar.a(this.f50661t);
        }
    }

    @Override // com.tencent.mapsdk.internal.au, com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: a */
    public final android.graphics.Rect getScreenBound(com.tencent.mapsdk.internal.ey eyVar) {
        com.tencent.mapsdk.internal.qx qxVar = this.f50656d;
        if (qxVar == null) {
            return null;
        }
        return qxVar.getScreenBound(eyVar);
    }

    @Override // com.tencent.mapsdk.internal.ew
    public final void a(int i17, int i18) {
        if (this.f50656d != null) {
            b(true);
            this.f50656d.a(new com.tencent.map.lib.models.GeoPoint(i18, i17));
        }
    }

    private void a(android.graphics.Bitmap bitmap, boolean z17) {
        this.f50658q = bitmap;
        if (bitmap == null) {
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b("setBitmapAssist:".concat(java.lang.String.valueOf(bitmap)));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(bitmap.hashCode() + f50655y.getAndIncrement());
        java.lang.String sb7 = sb6.toString();
        com.tencent.mapsdk.internal.qx qxVar = this.f50656d;
        if (qxVar != null) {
            qxVar.a(sb7, z17, bitmap);
        }
    }

    @Override // com.tencent.mapsdk.internal.po, com.tencent.mapsdk.internal.ev, com.tencent.mapsdk.internal.am
    public final int a() {
        com.tencent.mapsdk.internal.qx qxVar = this.f50656d;
        if (qxVar != null) {
            return qxVar.a();
        }
        return super.a();
    }
}
