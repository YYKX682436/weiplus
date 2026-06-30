package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8;

/* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager */
/* loaded from: classes13.dex */
public class C26111x2ace1473<T extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26110x1f5a1c0d> implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapCameraChangeListener, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnInfoWindowClickListener, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.InfoWindowAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.C26106x6689edf3 f296960a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.C26106x6689edf3.Collection f296961b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.C26106x6689edf3.Collection f296962c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f<T> f296963d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.locks.ReadWriteLock f296964e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.InterfaceC26117xa1cd4bd<T> f296965f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 f296966g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e f296967h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473<T>.a f296968i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.locks.ReadWriteLock f296969j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f296970k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.OnClusterItemClickListener<T> f296971l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.OnClusterInfoWindowClickListener<T> f296972m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.ClusterInfoWindowAdapter<T> f296973n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.OnClusterItemInfoWindowClickListener<T> f296974o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.OnClusterClickListener<T> f296975p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.ClusterItemInfoWindowAdapter<T> f296976q;

    /* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager$ClusterInfoWindowAdapter */
    /* loaded from: classes13.dex */
    public interface ClusterInfoWindowAdapter<T extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26110x1f5a1c0d> {
        /* renamed from: getInfoContents */
        android.view.View m100143x40d285e(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T> interfaceC26109x9733a9da);

        /* renamed from: getInfoWindow */
        android.view.View m100144xc3c42a34(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T> interfaceC26109x9733a9da);

        /* renamed from: getInfoWindowPressState */
        android.view.View m100145x88413762(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T> interfaceC26109x9733a9da);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager$ClusterItemInfoWindowAdapter */
    /* loaded from: classes13.dex */
    public interface ClusterItemInfoWindowAdapter<T extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26110x1f5a1c0d> {
        /* renamed from: getInfoContents */
        android.view.View m100146x40d285e(T t17);

        /* renamed from: getInfoWindow */
        android.view.View m100147xc3c42a34(T t17);

        /* renamed from: getInfoWindowPressState */
        android.view.View m100148x88413762(T t17);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager$OnClusterClickListener */
    /* loaded from: classes13.dex */
    public interface OnClusterClickListener<T extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26110x1f5a1c0d> {
        /* renamed from: onClusterClick */
        boolean mo100149x37087b2d(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T> interfaceC26109x9733a9da);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager$OnClusterInfoWindowClickListener */
    /* loaded from: classes13.dex */
    public interface OnClusterInfoWindowClickListener<T extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26110x1f5a1c0d> {
        /* renamed from: onClusterInfoWindowClick */
        void m100150x232ec54f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T> interfaceC26109x9733a9da);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager$OnClusterItemClickListener */
    /* loaded from: classes13.dex */
    public interface OnClusterItemClickListener<T extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26110x1f5a1c0d> {
        /* renamed from: onClusterItemClick */
        boolean mo100151x2ee7a95a(T t17);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager$OnClusterItemInfoWindowClickListener */
    /* loaded from: classes13.dex */
    public interface OnClusterItemInfoWindowClickListener<T extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26110x1f5a1c0d> {
        /* renamed from: onClusterItemInfoWindowClick */
        void m100152x549fdf3c(T t17);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager$b */
    /* loaded from: classes13.dex */
    public class b implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T> {

        /* renamed from: a, reason: collision with root package name */
        public T f296978a;

        /* renamed from: b, reason: collision with root package name */
        public java.util.Set<T> f296979b;

        public b(T t17) {
            this.f296978a = t17;
            this.f296979b = java.util.Collections.singleton(t17);
        }

        @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da
        /* renamed from: getItems */
        public java.util.Collection<T> mo100118x749b8e0a() {
            return this.f296979b;
        }

        @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da
        /* renamed from: getPosition */
        public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 mo100119xa86cd69f() {
            return this.f296978a.mo100121xa86cd69f();
        }

        @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da
        /* renamed from: getSize */
        public int mo100120xfb854877() {
            return 1;
        }
    }

    public C26111x2ace1473(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 interfaceC25945x718093f7) {
        this(context, interfaceC25945x718093f7, new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.C26106x6689edf3(interfaceC25945x718093f7));
    }

    /* renamed from: addItem */
    public void m100122xbb852f54(T t17) {
        this.f296964e.writeLock().lock();
        try {
            this.f296963d.mo100153xbb852f54(t17);
        } finally {
            this.f296964e.writeLock().unlock();
        }
    }

    /* renamed from: addItems */
    public void m100123xb520bb9f(java.util.Collection<T> collection) {
        this.f296964e.writeLock().lock();
        try {
            this.f296963d.mo100154xb520bb9f(collection);
        } finally {
            this.f296964e.writeLock().unlock();
        }
    }

    /* renamed from: cancel */
    public void m100124xae7a2e7a() {
        m100125xd31c2973();
        if (this.f296968i.cancel(true)) {
            return;
        }
        this.f296965f.mo100168xae7a2e7a();
    }

    /* renamed from: clearItems */
    public void m100125xd31c2973() {
        this.f296964e.writeLock().lock();
        try {
            this.f296963d.mo100155xd31c2973();
        } finally {
            this.f296964e.writeLock().unlock();
        }
    }

    /* renamed from: cluster */
    public void m100126x33fb11fa() {
        this.f296969j.writeLock().lock();
        try {
            this.f296968i.cancel(true);
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473<T>.a aVar = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.a();
            this.f296968i = aVar;
            aVar.executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, java.lang.Float.valueOf(this.f296966g.mo98961xd2ef9864().m37104xfb888c49()));
        } finally {
            this.f296969j.writeLock().unlock();
        }
    }

    /* renamed from: getAlgorithm */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f<T> m100127xcde25b9() {
        return this.f296963d;
    }

    /* renamed from: getClusterMarkerCollection */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.C26106x6689edf3.Collection m100128x4c1c285c() {
        return this.f296962c;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.InfoWindowAdapter
    /* renamed from: getInfoWindow */
    public android.view.View mo99027xc3c42a34(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
        return m100130xf44a7a5d().mo99027xc3c42a34(interfaceC4409x88f1805a);
    }

    /* renamed from: getMarkerCollection */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.C26106x6689edf3.Collection m100129x6a9405ee() {
        return this.f296961b;
    }

    /* renamed from: getMarkerManager */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.C26106x6689edf3 m100130xf44a7a5d() {
        return this.f296960a;
    }

    /* renamed from: getRenderer */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.InterfaceC26117xa1cd4bd<T> m100131x5e5b7e39() {
        return this.f296965f;
    }

    /* renamed from: isClusterEnabled */
    public boolean m100132x7b794bb1() {
        return this.f296970k;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapCameraChangeListener
    /* renamed from: onCameraChange */
    public void mo14565x21a09eb4(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e c4394xa89e978e) {
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapCameraChangeListener
    /* renamed from: onCameraChangeFinish */
    public void mo14566x31824067(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e c4394xa89e978e) {
        if (this.f296970k) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.InterfaceC26117xa1cd4bd<T> interfaceC26117xa1cd4bd = this.f296965f;
            if (interfaceC26117xa1cd4bd instanceof com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapCameraChangeListener) {
                ((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapCameraChangeListener) interfaceC26117xa1cd4bd).mo14566x31824067(c4394xa89e978e);
            }
            com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e mo98961xd2ef9864 = this.f296966g.mo98961xd2ef9864();
            com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e c4394xa89e978e2 = this.f296967h;
            if (c4394xa89e978e2 == null || c4394xa89e978e2.m37104xfb888c49() != mo98961xd2ef9864.m37104xfb888c49()) {
                this.f296967h = this.f296966g.mo98961xd2ef9864();
                m100126x33fb11fa();
            }
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnInfoWindowClickListener
    /* renamed from: onInfoWindowClick */
    public void mo66012xc56a6a0b(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
        m100130xf44a7a5d().mo66012xc56a6a0b(interfaceC4409x88f1805a);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.InfoWindowAdapter
    /* renamed from: onInfoWindowDettached */
    public void mo99028xf6653887(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a, android.view.View view) {
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener
    /* renamed from: onMarkerClick */
    public boolean mo14570x289a5e0f(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
        return m100130xf44a7a5d().mo14570x289a5e0f(interfaceC4409x88f1805a);
    }

    /* renamed from: removeItem */
    public void m100133x417605b7(T t17) {
        this.f296964e.writeLock().lock();
        try {
            this.f296963d.mo100158x417605b7(t17);
        } finally {
            this.f296964e.writeLock().unlock();
        }
    }

    /* renamed from: setAlgorithm */
    public void m100134x6931e62d(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f<T> interfaceC26112x84e2d44f) {
        this.f296964e.writeLock().lock();
        try {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.InterfaceC26112x84e2d44f<T> interfaceC26112x84e2d44f2 = this.f296963d;
            if (interfaceC26112x84e2d44f2 != null) {
                interfaceC26112x84e2d44f.mo100154xb520bb9f(interfaceC26112x84e2d44f2.mo100157x749b8e0a());
            }
            this.f296963d = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26115x55bfd68(interfaceC26112x84e2d44f);
            this.f296964e.writeLock().unlock();
            m100126x33fb11fa();
        } catch (java.lang.Throwable th6) {
            this.f296964e.writeLock().unlock();
            throw th6;
        }
    }

    /* renamed from: setClusterEnabled */
    public void m100135x8b5bf8e9(boolean z17) {
        if (this.f296970k ^ z17) {
            this.f296970k = z17;
            m100126x33fb11fa();
        }
    }

    /* renamed from: setClusterInfoWindowAdapter */
    public void m100136x60c3e2d9(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.ClusterInfoWindowAdapter<T> clusterInfoWindowAdapter) {
        this.f296973n = clusterInfoWindowAdapter;
        this.f296965f.mo100172x3d10faef(clusterInfoWindowAdapter);
    }

    /* renamed from: setClusterItemInfoWindowAdapter */
    public void m100137x89f9bc06(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.ClusterItemInfoWindowAdapter<T> clusterItemInfoWindowAdapter) {
        this.f296976q = clusterItemInfoWindowAdapter;
        this.f296965f.mo100173xcb30d91c(clusterItemInfoWindowAdapter);
    }

    /* renamed from: setOnClusterClickListener */
    public void m100138x908e3a03(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.OnClusterClickListener<T> onClusterClickListener) {
        this.f296975p = onClusterClickListener;
        this.f296965f.mo100174x908e3a03(onClusterClickListener);
    }

    /* renamed from: setOnClusterInfoWindowClickListener */
    public void m100139x246ee7a5(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener) {
        this.f296972m = onClusterInfoWindowClickListener;
        this.f296965f.mo100175x246ee7a5(onClusterInfoWindowClickListener);
    }

    /* renamed from: setOnClusterItemClickListener */
    public void m100140x48419a30(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.OnClusterItemClickListener<T> onClusterItemClickListener) {
        this.f296971l = onClusterItemClickListener;
        this.f296965f.mo100176x48419a30(onClusterItemClickListener);
    }

    /* renamed from: setOnClusterItemInfoWindowClickListener */
    public void m100141x79db392(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener) {
        this.f296974o = onClusterItemInfoWindowClickListener;
        this.f296965f.mo100177x79db392(onClusterItemInfoWindowClickListener);
    }

    /* renamed from: setRenderer */
    public void m100142x5913df45(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.InterfaceC26117xa1cd4bd<T> interfaceC26117xa1cd4bd) {
        this.f296965f.mo100174x908e3a03(null);
        this.f296965f.mo100176x48419a30(null);
        this.f296962c.a();
        this.f296961b.a();
        this.f296965f.mo100171x573fcf43();
        this.f296965f = interfaceC26117xa1cd4bd;
        interfaceC26117xa1cd4bd.mo100169x64f3242();
        this.f296965f.mo100174x908e3a03(this.f296975p);
        this.f296965f.mo100175x246ee7a5(this.f296972m);
        this.f296965f.mo100176x48419a30(this.f296971l);
        this.f296965f.mo100177x79db392(this.f296974o);
        m100126x33fb11fa();
    }

    public C26111x2ace1473(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 interfaceC25945x718093f7, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.C26106x6689edf3 c26106x6689edf3) {
        this.f296964e = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.f296969j = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.f296970k = true;
        this.f296966g = interfaceC25945x718093f7;
        this.f296960a = c26106x6689edf3;
        this.f296962c = c26106x6689edf3.a();
        this.f296961b = c26106x6689edf3.a();
        this.f296965f = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c(context, interfaceC25945x718093f7, this);
        this.f296963d = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26115x55bfd68(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p2999x2dba53.C26114xe1bbf3c7(context));
        this.f296968i = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.a();
        this.f296965f.mo100169x64f3242();
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager$a */
    /* loaded from: classes13.dex */
    public class a extends android.os.AsyncTask<java.lang.Float, java.lang.Void, java.util.Set<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T>>> {
        public a() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.util.Set<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T>> doInBackground(java.lang.Float... fArr) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.this.f296964e.readLock().lock();
            try {
                if (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.this.f296970k && fArr != null) {
                    return com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.this.f296963d.mo100156xc7416b2f(fArr[0].floatValue());
                }
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.Iterator<T> it = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.this.f296963d.mo100157x749b8e0a().iterator();
                while (it.hasNext()) {
                    hashSet.add(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.b(it.next()));
                }
                return hashSet;
            } finally {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.this.f296964e.readLock().unlock();
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(java.util.Set<? extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da<T>> set) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473.this.f296965f.mo100170x4380eadc(set);
        }
    }
}
