package sc1;

/* loaded from: classes15.dex */
public class p1 implements sc1.k {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p423xc53e9ae1.C3889x5ffa7739 f487244a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 f487245b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f487246c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f487247d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f487248e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f487249f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f487250g = false;

    public p1(android.content.Context context) {
        this.f487244a = new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p423xc53e9ae1.C3889x5ffa7739(context);
    }

    @Override // sc1.k
    public sc1.k1 c() {
        return this.f487246c ? n(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, null) : new sc1.k1();
    }

    @Override // sc1.k
    public sc1.k1 e() {
        return new sc1.k1(this.f487244a.m31966x18d712f6());
    }

    @Override // sc1.k
    public sc1.k1 f(android.os.Bundle bundle) {
        com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m31967xe1cd4496 = this.f487244a.m31967xe1cd4496(bundle);
        int i17 = m31967xe1cd4496.f15538x139cb015;
        if (-1 != i17 && -3 != i17) {
            o(bundle, true);
        }
        return new sc1.k1(m31967xe1cd4496);
    }

    @Override // sc1.k
    public void g(com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXSnapshotListener iTXSnapshotListener) {
        this.f487244a.m31962x8ba6f71a(iTXSnapshotListener);
    }

    @Override // sc1.k
    public void h(com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.f487244a.m31960xd526eba2(iTXAudioVolumeEvaluationListener);
    }

    @Override // sc1.k
    public boolean i() {
        return this.f487250g;
    }

    @Override // sc1.k
    public sc1.k1 k(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, android.os.Bundle bundle) {
        com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m31956x64e5041d = this.f487244a.m31956x64e5041d(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, bundle);
        if (-1 != m31956x64e5041d.f15538x139cb015) {
            o(bundle, true);
        }
        return new sc1.k1(m31956x64e5041d);
    }

    @Override // sc1.k
    public void l(boolean z17, com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXSnapshotListener iTXSnapshotListener) {
        this.f487244a.m31965x5880d5eb(z17, iTXSnapshotListener);
    }

    @Override // sc1.k
    public sc1.k1 m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 w0Var) {
        com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 interfaceC25479x1853e9c1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLivePlayerJSAdapterV2", "enterBackground, pauseType: %s", w0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w1 U2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.n.f163477e.U2(this.f487248e, this.f487249f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TXLivePlayerJSAdapterV2", "enterBackground, autoPauseStrategy: %s", U2);
        if (!U2.a(lVar, w0Var)) {
            this.f487246c = false;
            return new sc1.k1();
        }
        boolean m31958xc00617a4 = this.f487244a.m31958xc00617a4();
        this.f487246c = m31958xc00617a4;
        if (!m31958xc00617a4) {
            return new sc1.k1();
        }
        if (this.f487247d && (interfaceC25479x1853e9c1 = this.f487245b) != null) {
            interfaceC25479x1853e9c1.mo15376x8cd414a7(6000, new android.os.Bundle());
        }
        return n("stop", null);
    }

    @Override // sc1.k
    public sc1.k1 n(java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3888x92ad5602 m31959xf14ea791 = this.f487244a.m31959xf14ea791(str, jSONObject);
        if (m31959xf14ea791.f15538x139cb015 == 0) {
            if ("pause".equalsIgnoreCase(str)) {
                this.f487250g = true;
            } else if ("resume".equalsIgnoreCase(str)) {
                this.f487250g = false;
            }
        }
        return new sc1.k1(m31959xf14ea791);
    }

    public final void o(android.os.Bundle bundle, boolean z17) {
        this.f487247d = bundle.getBoolean("needEvent", this.f487247d);
        this.f487248e = bundle.getBoolean("autoPauseIfNavigate", this.f487248e);
        this.f487249f = bundle.getBoolean("autoPauseIfOpenNative", this.f487249f);
    }

    @Override // sc1.k
    /* renamed from: setPlayListener */
    public void mo164242xbdb2cd8a(com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 interfaceC25479x1853e9c1) {
        this.f487245b = interfaceC25479x1853e9c1;
        this.f487244a.m31961xbdb2cd8a(interfaceC25479x1853e9c1);
    }
}
