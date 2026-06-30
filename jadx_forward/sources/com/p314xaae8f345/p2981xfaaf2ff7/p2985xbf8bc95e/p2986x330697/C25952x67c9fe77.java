package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider */
/* loaded from: classes13.dex */
public final class C25952x67c9fe77 {

    /* renamed from: NAME */
    public static final java.lang.String f49185x24728b = "_CustomAutoLocationProvider";

    /* renamed from: sGlobalLocationProvider */
    private static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77 f49186x3fa1aadc;

    /* renamed from: thisLatestLocation */
    private android.location.Location f49187xc2e24a9a;

    /* renamed from: thisMyLocationSourceWeakReference */
    private java.lang.ref.WeakReference<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.MyLocationSource> f49188xa3b08919;

    /* renamed from: thisWeakRefLocationObservers */
    private final java.util.Map<java.lang.ref.WeakReference<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.a>, java.lang.Boolean> f49190x2d78242b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: thisRequestHandler */
    private android.os.Handler f49189x3870fbf9 = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider$MyLocationSource */
    /* loaded from: classes13.dex */
    public interface MyLocationSource {
        /* renamed from: getMyLocation */
        android.location.Location mo14571x7b085d77();
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider$a */
    /* loaded from: classes13.dex */
    public interface a {
        void a(android.location.Location location);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider$b */
    /* loaded from: classes13.dex */
    public static class b implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.a, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25954xb7e06450 {

        /* renamed from: a, reason: collision with root package name */
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25954xb7e06450.OnLocationChangedListener f296871a;

        /* renamed from: b, reason: collision with root package name */
        private final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77 f296872b;

        /* renamed from: c, reason: collision with root package name */
        private final android.os.Handler f296873c = new android.os.Handler(android.os.Looper.getMainLooper());

        public b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77 c25952x67c9fe77) {
            this.f296872b = c25952x67c9fe77;
        }

        @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.a
        public final void a(final android.location.Location location) {
            final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25954xb7e06450.OnLocationChangedListener onLocationChangedListener;
            if (location == null || (onLocationChangedListener = this.f296871a) == null) {
                return;
            }
            this.f296873c.post(new java.lang.Runnable() { // from class: com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    location.setProvider(location.getProvider() + com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.f49185x24728b);
                    onLocationChangedListener.mo36528xcf0f8560(location);
                }
            });
        }

        @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25954xb7e06450
        /* renamed from: activate */
        public final void mo99128x9d4bd4f3(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25954xb7e06450.OnLocationChangedListener onLocationChangedListener) {
            this.f296871a = onLocationChangedListener;
            this.f296872b.m99117x26ef2c6c(this);
        }

        @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25954xb7e06450
        /* renamed from: deactivate */
        public final void mo99129x88fbd074() {
            this.f296872b.m99119x8fa864f(this);
            this.f296871a = null;
        }
    }

    private C25952x67c9fe77() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addLocationObserver */
    public void m99117x26ef2c6c(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.a aVar) {
        if (aVar == null) {
            return;
        }
        this.f49190x2d78242b.put(new java.lang.ref.WeakReference<>(aVar), java.lang.Boolean.TRUE);
        android.location.Location location = this.f49187xc2e24a9a;
        if (location != null) {
            aVar.a(location);
        }
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77 m99118x9cf0d20b() {
        if (f49186x3fa1aadc == null) {
            f49186x3fa1aadc = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77();
        }
        return f49186x3fa1aadc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: removeLocationObserver */
    public void m99119x8fa864f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.a aVar) {
        if (aVar == null) {
            return;
        }
        java.util.Iterator<java.lang.ref.WeakReference<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.a>> it = this.f49190x2d78242b.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().get() == aVar) {
                it.remove();
            }
        }
    }

    /* renamed from: clearLocation */
    public final synchronized void m99120x454f1d22() {
        this.f49187xc2e24a9a = null;
    }

    /* renamed from: getLatestLocation */
    public final synchronized android.location.Location m99121x33b1e952() {
        return this.f49187xc2e24a9a;
    }

    /* renamed from: getLocationSource */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25954xb7e06450 m99122xe2316526() {
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.b(this);
    }

    /* renamed from: hasLocation */
    public final synchronized boolean m99123x1ca45c6f() {
        return this.f49187xc2e24a9a != null;
    }

    /* renamed from: hasLocationSource */
    public final boolean m99124x52b8616a() {
        java.lang.ref.WeakReference<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.MyLocationSource> weakReference = this.f49188xa3b08919;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* renamed from: requestLatestLocation */
    public final void m99125x8630b4cb() {
        if (this.f49188xa3b08919 != null) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131758z, "requestLatestLocation");
            final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.MyLocationSource myLocationSource = this.f49188xa3b08919.get();
            if (myLocationSource != null) {
                this.f49189x3870fbf9.post(new java.lang.Runnable() { // from class: com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.this.f49187xc2e24a9a = myLocationSource.mo14571x7b085d77();
                        java.util.Iterator it = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.this.f49190x2d78242b.keySet().iterator();
                        while (it.hasNext()) {
                            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.a aVar = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.a) ((java.lang.ref.WeakReference) it.next()).get();
                            if (aVar != null) {
                                aVar.a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.this.f49187xc2e24a9a);
                            }
                        }
                    }
                });
            }
        }
    }

    /* renamed from: setMyLocationSource */
    public final void m99127x8786117e(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.MyLocationSource myLocationSource) {
        m99126x8786117e(null, myLocationSource);
    }

    /* renamed from: setMyLocationSource */
    public final void m99126x8786117e(android.os.Handler handler, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.MyLocationSource myLocationSource) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131758z, "setMyLocationSource");
        if (handler != null) {
            this.f49189x3870fbf9 = handler;
        }
        this.f49188xa3b08919 = new java.lang.ref.WeakReference<>(myLocationSource);
    }
}
