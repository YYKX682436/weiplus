package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public abstract class bo<C extends com.tencent.mapsdk.internal.bn, M extends com.tencent.mapsdk.internal.bl> implements com.tencent.mapsdk.core.MapDelegate<C, M, com.tencent.mapsdk.internal.bu> {

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bu> f49015c;

    /* renamed from: d, reason: collision with root package name */
    protected final android.content.Context f49016d;
    public C d_;

    /* renamed from: e, reason: collision with root package name */
    protected final com.tencent.tencentmap.mapsdk.maps.TencentMapOptions f49017e;
    public M e_;

    /* renamed from: f, reason: collision with root package name */
    public final int f49018f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.ref.WeakReference<android.view.ViewGroup> f49019g;

    /* renamed from: h, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ko.c f49020h;

    /* renamed from: i, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.kz f49021i;

    public bo(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions, android.view.ViewGroup viewGroup) {
        int hashCode = hashCode();
        this.f49018f = hashCode;
        this.f49016d = context;
        this.f49019g = new java.lang.ref.WeakReference<>(viewGroup);
        this.f49017e = tencentMapOptions;
        if (this.f49020h == null) {
            this.f49020h = com.tencent.mapsdk.internal.ko.a();
        }
        com.tencent.mapsdk.internal.ko.b();
        com.tencent.mapsdk.internal.ko.a(this.f49020h);
        com.tencent.mapsdk.internal.kz kzVar = new com.tencent.mapsdk.internal.kz(context, tencentMapOptions, hashCode);
        this.f49021i = kzVar;
        com.tencent.mapsdk.core.utils.log.LogUtil.a(hashCode, kzVar);
        com.tencent.mapsdk.core.utils.log.LogUtil.a(new com.tencent.mapsdk.internal.kw(context, tencentMapOptions));
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, hashCode);
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.C, hashCode);
        if (tencentMapOptions != null) {
            com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50258aa, "options", tencentMapOptions, hashCode);
        }
    }

    private static void ad() {
    }

    private M af() {
        return this.e_;
    }

    private C ag() {
        return this.d_;
    }

    private int ah() {
        return this.f49018f;
    }

    private void c(float f17) {
        com.tencent.mapsdk.internal.bu buVar;
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bu> weakReference = this.f49015c;
        if (weakReference == null || (buVar = weakReference.get()) == null) {
            return;
        }
        buVar.a(f17);
    }

    public void Y() {
        C c17 = this.d_;
        if (c17 != null) {
            c17.w();
        }
    }

    public void Z() {
    }

    public final M a(C c17) {
        return createMap(c17);
    }

    public abstract C a(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions);

    public void aa() {
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.MapViewType ab() {
        return this.d_.f48998a.getMapViewType();
    }

    public final android.view.ViewGroup ac() {
        java.lang.ref.WeakReference<android.view.ViewGroup> weakReference = this.f49019g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.tencent.mapsdk.core.MapDelegate
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract M createMap(C c17);

    @Override // com.tencent.mapsdk.core.MapDelegate
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract com.tencent.mapsdk.internal.bu createMapView(C c17, android.view.ViewGroup viewGroup);

    @Override // com.tencent.mapsdk.core.MapDelegate, com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public /* bridge */ /* synthetic */ com.tencent.tencentmap.mapsdk.maps.TencentMap getMap() {
        return this.e_;
    }

    @Override // com.tencent.mapsdk.core.MapDelegate
    public /* bridge */ /* synthetic */ com.tencent.tencentmap.mapsdk.maps.TencentMapContext getMapContext() {
        return this.d_;
    }

    @Override // com.tencent.mapsdk.core.MapDelegate
    public java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bu> getMapRenderView() {
        return this.f49015c;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public boolean isOpaque() {
        com.tencent.mapsdk.internal.bu buVar;
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bu> weakReference = this.f49015c;
        if (weakReference == null || (buVar = weakReference.get()) == null) {
            return true;
        }
        return buVar.e();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public boolean isTouchable() {
        M m17 = this.e_;
        return m17 != null && m17.a();
    }

    public void m(boolean z17) {
        C c17 = this.d_;
        if (c17 != null) {
            c17.f49002e = z17;
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onCreated() {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.O, this.f49018f);
        this.d_ = a(this.f49016d, this.f49017e);
        Y();
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.O, this.f49018f);
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.P, this.f49018f);
        com.tencent.mapsdk.internal.bu createMapView = createMapView(this.d_, this.f49019g.get());
        android.view.View view = createMapView.getView();
        view.setEnabled(true);
        view.setClickable(true);
        this.f49015c = new java.lang.ref.WeakReference<>(createMapView);
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.P, this.f49018f);
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.N, this.f49018f);
        this.e_ = createMap(this.d_);
        Z();
        this.e_.b(com.tencent.mapsdk.internal.bn.C());
        aa();
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.N, this.f49018f);
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.C, this.f49018f);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onDestroy() {
        java.lang.ref.WeakReference<android.view.ViewGroup> weakReference = this.f49019g;
        if (weakReference != null) {
            android.view.ViewGroup viewGroup = weakReference.get();
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            this.f49019g.clear();
            this.f49019g = null;
        }
        M m17 = this.e_;
        if (m17 != null) {
            m17.n();
        }
        C c17 = this.d_;
        if (c17 != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            if (bundle.size() > 0) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                bundle.writeToParcel(obtain, 0);
                com.tencent.mapsdk.internal.ks.a(com.tencent.mapsdk.internal.ks.b(com.tencent.mapsdk.internal.ks.f50186d, "map-context.cache"), obtain.marshall());
                obtain.recycle();
            }
            c17.D();
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.detachMapContext(c17);
            com.tencent.mapsdk.internal.hn.r();
        }
        com.tencent.mapsdk.internal.ko.c();
        com.tencent.mapsdk.internal.ko.d();
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.f50257J, this.f49018f);
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.f50258aa, this.f49018f);
        com.tencent.mapsdk.internal.kz kzVar = this.f49021i;
        if (kzVar != null && !kzVar.f50234d) {
            kzVar.f50234d = true;
            kzVar.f50233c = null;
            kzVar.f50235e = null;
            android.os.Handler handler = com.tencent.mapsdk.internal.kz.f50226f;
            if (handler != null) {
                handler.sendEmptyMessage(-102);
            }
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b(this.f49018f);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onPause() {
        C c17 = this.d_;
        if (c17 != null) {
            c17.z();
        }
        M m17 = this.e_;
        if (m17 != null) {
            m17.k();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onRestart() {
        M m17 = this.e_;
        if (m17 != null) {
            m17.l();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onResume() {
        C c17 = this.d_;
        if (c17 != null) {
            c17.A();
        }
        M m17 = this.e_;
        if (m17 != null) {
            m17.j();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        com.tencent.mapsdk.internal.bu buVar;
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bu> weakReference = this.f49015c;
        if (weakReference == null || (buVar = weakReference.get()) == null) {
            return;
        }
        buVar.onSizeChanged(i17, i18, i19, i27);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onStart() {
        M m17 = this.e_;
        if (m17 != null) {
            m17.i();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onStop() {
        M m17 = this.e_;
        if (m17 != null) {
            m17.m();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onSurfaceChanged(java.lang.Object obj, int i17, int i18) {
        com.tencent.mapsdk.internal.bu buVar;
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bu> weakReference = this.f49015c;
        if (weakReference == null || (buVar = weakReference.get()) == null) {
            return;
        }
        buVar.a(obj, i17, i18);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onUpdateOptions(com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void setOnTop(boolean z17) {
        M m17 = this.e_;
        if (m17 != null) {
            m17.a(z17);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void setOpaque(boolean z17) {
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bu> weakReference = this.f49015c;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f49015c.get().setMapOpaque(z17);
    }

    public final com.tencent.mapsdk.internal.bu a(C c17, android.view.ViewGroup viewGroup) {
        return createMapView(c17, viewGroup);
    }
}
