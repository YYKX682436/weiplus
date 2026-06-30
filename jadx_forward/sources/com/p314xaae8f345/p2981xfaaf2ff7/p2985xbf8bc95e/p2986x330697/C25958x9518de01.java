package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.MapView */
/* loaded from: classes13.dex */
public class C25958x9518de01 extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0 {

    /* renamed from: mIsResumed */
    private boolean f49219x9993cf60;

    /* renamed from: mMap */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7 f49220x32b9af;

    /* renamed from: mMapDelegate */
    protected com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy f49221xb1e1dc54;

    /* renamed from: mMapOptions */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 f49222x98a7f1ef;

    public C25958x9518de01(android.content.Context context) {
        this(context, new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7());
    }

    /* renamed from: getMapSync */
    private <T extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7> void m99137x6fac61e1(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7, final com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<T> interfaceC4308xf9968465) {
        c25966x7e4576a7.m99238xf51b5e34(new com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7>() { // from class: com.tencent.tencentmap.mapsdk.maps.MapView.2

            /* renamed from: com.tencent.tencentmap.mapsdk.maps.MapView$2$1, reason: invalid class name */
            /* loaded from: classes13.dex */
            public class AnonymousClass1 implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapLoadedCallback {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7 f296881a;

                public AnonymousClass1(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7 interfaceC25961x718093f7) {
                    this.f296881a = interfaceC25961x718093f7;
                }

                @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapLoadedCallback
                /* renamed from: onMapLoaded */
                public final void mo99142x28538962() {
                    com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465 interfaceC4308xf9968465 = interfaceC4308xf9968465;
                    if (interfaceC4308xf9968465 != null) {
                        interfaceC4308xf9968465.mo35806xf5bc2045(this.f296881a);
                    }
                    this.f296881a.mo36562x31cbe4a3(this);
                }
            }

            private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7 interfaceC25961x718093f7) {
                interfaceC25961x718093f7.mo36541x2adaad66(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25958x9518de01.AnonymousClass2.AnonymousClass1(interfaceC25961x718093f7));
            }

            @Override // com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465
            /* renamed from: callback */
            public final /* synthetic */ void mo35806xf5bc2045(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7 interfaceC25961x718093f7) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7 interfaceC25961x718093f72 = interfaceC25961x718093f7;
                interfaceC25961x718093f72.mo36541x2adaad66(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25958x9518de01.AnonymousClass2.AnonymousClass1(interfaceC25961x718093f72));
            }
        });
        m99138x7420ee2c(c25966x7e4576a7);
    }

    /* renamed from: initMap */
    private void m99138x7420ee2c(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy mapViewProxy;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a72;
        if (this.f49220x32b9af == null || !((c25966x7e4576a72 = this.f49222x98a7f1ef) == c25966x7e4576a7 || c25966x7e4576a72.m99191xb2c87fbf(c25966x7e4576a7))) {
            if (c25966x7e4576a7 == null) {
                c25966x7e4576a7 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7();
            }
            if (c25966x7e4576a7.m99206xf81c97c5() == null) {
                c25966x7e4576a7.m99243x8e820b39(mo99089xc321a0f5());
            }
            if (c25966x7e4576a7.m99203x275cda03() == null) {
                c25966x7e4576a7.m99241x83b09a77(m99088x275cda03());
            }
            setClickable(true);
            if (this.f49220x32b9af != null && (mapViewProxy = this.f49221xb1e1dc54) != null) {
                mapViewProxy.mo36644xb01dfb57();
                this.f49221xb1e1dc54.mo36649xc39f8281();
                this.f49221xb1e1dc54.mo36643xac79a11b();
                this.f49221xb1e1dc54 = null;
                this.f49220x32b9af = null;
            }
            final com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7> m99201x3be5d25b = c25966x7e4576a7.m99201x3be5d25b();
            if (this.f49221xb1e1dc54 == null) {
                com.tencent.mapsdk.internal.hm.a aVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hm.a().f131313a.get(com.tencent.mapsdk.internal.hm.b.MAP_ENGINE);
                if (aVar != null) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.u.a();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(aVar.f131315b);
                    java.lang.String sb7 = sb6.toString();
                    java.lang.String str = aVar.f131316c;
                    java.lang.String str2 = aVar.f131314a;
                    java.lang.String str3 = aVar.f131318e;
                    java.lang.String str4 = aVar.f131317d;
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    sb8.append(aVar.f131319f);
                    new com.p314xaae8f345.p519xbf8bc95e.p539x6855e30.p540xb307e119.C4425x29357854(sb7, str, str2, str3, str4, sb8.toString());
                }
                if (!com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25964xb9d36a6b.m99181xc28a2e47(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25964xb9d36a6b.LibraryName.TENCENT_MAP_ENGINE)) {
                    com.p314xaae8f345.cso.C2941xefde02d2.e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tf.f133112a);
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.t tVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.t(getContext().getApplicationContext());
                if (m99201x3be5d25b != null) {
                    new java.lang.Thread(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.u.AnonymousClass4(tVar.f133097a, tVar.a(c25966x7e4576a7), new android.os.Handler(android.os.Looper.getMainLooper()), new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.t.AnonymousClass1(this, c25966x7e4576a7, new com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy>() { // from class: com.tencent.tencentmap.mapsdk.maps.MapView.1
                        private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy mapViewProxy2) {
                            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25958x9518de01.this.f49221xb1e1dc54 = mapViewProxy2;
                            if (mapViewProxy2 != null) {
                                mapViewProxy2.mo36646x57429eec();
                                m99201x3be5d25b.mo35806xf5bc2045(mapViewProxy2.mo36068xb5885626());
                            }
                        }

                        @Override // com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465
                        /* renamed from: callback */
                        public final /* synthetic */ void mo35806xf5bc2045(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy mapViewProxy2) {
                            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy mapViewProxy3 = mapViewProxy2;
                            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25958x9518de01.this.f49221xb1e1dc54 = mapViewProxy3;
                            if (mapViewProxy3 != null) {
                                mapViewProxy3.mo36646x57429eec();
                                m99201x3be5d25b.mo35806xf5bc2045(mapViewProxy3.mo36068xb5885626());
                            }
                        }
                    })), "tms-plugin").start();
                } else {
                    this.f49221xb1e1dc54 = tVar.a(this, c25966x7e4576a7);
                }
            }
            this.f49222x98a7f1ef = c25966x7e4576a7;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy mapViewProxy;
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (dispatchTouchEvent || (mapViewProxy = this.f49221xb1e1dc54) == null || !mapViewProxy.mo36641x5bf1ff0f()) {
            return dispatchTouchEvent;
        }
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(this.f49222x98a7f1ef.m99222x330755f8());
        }
        return this.f49221xb1e1dc54.mo37007x667eb1da(motionEvent);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0
    /* renamed from: getMap */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7 mo99086xb5885626() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7 interfaceC25961x718093f7 = this.f49220x32b9af;
        return interfaceC25961x718093f7 != null ? interfaceC25961x718093f7 : mo99087xb5885626(this.f49222x98a7f1ef);
    }

    /* renamed from: getMapPadding */
    public int[] m99139xc520670b() {
        return new int[]{getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom()};
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0
    /* renamed from: onDestroy */
    public void mo99090xac79a11b() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy mapViewProxy = this.f49221xb1e1dc54;
        if (mapViewProxy != null) {
            mapViewProxy.mo36643xac79a11b();
            this.f49221xb1e1dc54 = null;
        }
        this.f49222x98a7f1ef = null;
        this.f49220x32b9af = null;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0
    /* renamed from: onPause */
    public void mo99091xb01dfb57() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy mapViewProxy = this.f49221xb1e1dc54;
        if (mapViewProxy != null) {
            mapViewProxy.mo36644xb01dfb57();
            this.f49219x9993cf60 = false;
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0
    /* renamed from: onRestart */
    public void mo99092x91109f30() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy mapViewProxy = this.f49221xb1e1dc54;
        if (mapViewProxy != null) {
            mapViewProxy.mo36645x91109f30();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0
    /* renamed from: onResume */
    public void mo99093x57429eec() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy mapViewProxy = this.f49221xb1e1dc54;
        if (mapViewProxy != null && !this.f49219x9993cf60) {
            mapViewProxy.mo36646x57429eec();
            this.f49219x9993cf60 = true;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.u.a();
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy mapViewProxy = this.f49221xb1e1dc54;
        if (mapViewProxy != null) {
            mapViewProxy.mo36647x6521d014(i17, i18, i19, i27);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0
    /* renamed from: onStart */
    public void mo99094xb05099c3() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy mapViewProxy = this.f49221xb1e1dc54;
        if (mapViewProxy != null) {
            mapViewProxy.mo36648xb05099c3();
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy mapViewProxy2 = this.f49221xb1e1dc54;
        if (mapViewProxy2 == null || this.f49219x9993cf60) {
            return;
        }
        mapViewProxy2.mo36646x57429eec();
        this.f49219x9993cf60 = true;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0
    /* renamed from: onStop */
    public void mo99095xc39f8281() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy mapViewProxy = this.f49221xb1e1dc54;
        if (mapViewProxy != null) {
            mapViewProxy.mo36649xc39f8281();
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.u.a();
    }

    /* renamed from: onSurfaceChanged */
    public void mo99136xd8f18906(java.lang.Object obj, int i17, int i18) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy mapViewProxy;
        if (((obj instanceof android.view.Surface) || (obj instanceof android.graphics.SurfaceTexture) || (obj instanceof android.view.SurfaceHolder)) && (mapViewProxy = this.f49221xb1e1dc54) != null) {
            mapViewProxy.mo36650xd8f18906(obj, i17, i18);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: setMapPadding */
    public void m99140xf344b517(int i17, int i18, int i19, int i27) {
        setPadding(i17, i18, i19, i27);
    }

    /* renamed from: setOnTop */
    public void m99141x537b3bb4(boolean z17) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy mapViewProxy = this.f49221xb1e1dc54;
        if (mapViewProxy != null) {
            mapViewProxy.mo36652x537b3bb4(z17);
        }
    }

    public C25958x9518de01(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
        super(context);
        this.f49220x32b9af = mo99087xb5885626(c25966x7e4576a7);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0
    /* renamed from: getMap */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7 mo99087xb5885626(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
        if (!com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25964xb9d36a6b.m99176xc74ac1b2()) {
            return null;
        }
        m99138x7420ee2c(c25966x7e4576a7);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.AbstractC25948x1e7761f0.MapViewProxy mapViewProxy = this.f49221xb1e1dc54;
        if (mapViewProxy != null) {
            return mapViewProxy.mo36068xb5885626();
        }
        return null;
    }

    public C25958x9518de01(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7());
    }

    public C25958x9518de01(android.content.Context context, android.util.AttributeSet attributeSet, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
        this(context, attributeSet, 0, c25966x7e4576a7);
    }

    public C25958x9518de01(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7());
    }

    public C25958x9518de01(android.content.Context context, android.util.AttributeSet attributeSet, int i17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7 c25966x7e4576a7) {
        super(context, attributeSet, i17);
        this.f49220x32b9af = mo99087xb5885626(c25966x7e4576a7);
    }
}
