package wf;

/* loaded from: classes15.dex */
public class s extends sc1.p1 implements wf.a {
    @Override // wf.a
    public void a() {
        com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 interfaceC25479x1853e9c1 = this.f487245b;
        if (interfaceC25479x1853e9c1 != null) {
            interfaceC25479x1853e9c1.mo15376x8cd414a7(com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14493x3375bbf4, new android.os.Bundle());
        }
    }

    @Override // wf.a
    public void b() {
        com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 interfaceC25479x1853e9c1 = this.f487245b;
        if (interfaceC25479x1853e9c1 != null) {
            interfaceC25479x1853e9c1.mo15376x8cd414a7(6000, new android.os.Bundle());
        }
    }

    @Override // sc1.p1, sc1.k
    public sc1.k1 c() {
        return n(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, null);
    }

    @Override // wf.a
    public sc1.k1 d() {
        return this.f487244a.m31958xc00617a4() ? n("stop", null) : new sc1.k1();
    }

    @Override // sc1.p1, sc1.k
    public sc1.k1 f(android.os.Bundle bundle) {
        p(bundle);
        return super.f(bundle);
    }

    @Override // wf.a
    /* renamed from: isMuted */
    public boolean mo173670x7b1f9e61() {
        return this.f487244a.m31957x7b1f9e61();
    }

    @Override // wf.a
    /* renamed from: isPlaying */
    public boolean mo173671xc00617a4() {
        return this.f487244a.m31958xc00617a4();
    }

    @Override // wf.a
    public sc1.k1 j(android.os.Bundle bundle) {
        p(bundle);
        return new sc1.k1(this.f487244a.m31955x64e5041d(bundle));
    }

    @Override // sc1.p1, sc1.k
    public sc1.k1 k(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, android.os.Bundle bundle) {
        p(bundle);
        return super.k(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, bundle);
    }

    public final void p(android.os.Bundle bundle) {
        if (bundle == null || bundle.containsKey(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15486x7e8b3a17)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLivePlayerJSAdapterV2SameLayerSupport", "canStartPlayWorkaround, put true");
        bundle.putBoolean(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15486x7e8b3a17, true);
    }

    @Override // wf.a
    /* renamed from: setSurface */
    public sc1.k1 mo173672x42c875eb(android.view.Surface surface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLivePlayerJSAdapterV2SameLayerSupport", "setSurface: " + surface + ", stack: " + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        return new sc1.k1(this.f487244a.m31963x42c875eb(surface));
    }

    @Override // wf.a
    /* renamed from: setSurfaceSize */
    public sc1.k1 mo173673x1c9cdc8c(int i17, int i18) {
        return new sc1.k1(this.f487244a.m31964x1c9cdc8c(i17, i18));
    }
}
