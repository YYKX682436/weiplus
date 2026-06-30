package sc1;

/* loaded from: classes15.dex */
public class r1 implements sc1.l {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3891x93310793 f487259a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f487260b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f487261c = false;

    public r1(android.content.Context context) {
        this.f487259a = new com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.p424xc5c55d47.C3891x93310793(context);
    }

    @Override // sc1.l
    public sc1.k1 c() {
        return this.f487260b ? this.f487261c ? h("start", null) : h("resume", null) : new sc1.k1();
    }

    @Override // sc1.l
    public void d(com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveVideoFrame v2TXLiveVideoFrame) {
        this.f487259a.m32027x9fd3cbab(v2TXLiveVideoFrame);
    }

    @Override // sc1.l
    public void e(com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXSnapshotListener iTXSnapshotListener) {
        this.f487259a.m32032x8ba6f71a(iTXSnapshotListener);
    }

    @Override // sc1.l
    public sc1.k1 f(boolean z17) {
        boolean m32024xd057a1fe = this.f487259a.m32024xd057a1fe();
        this.f487260b = m32024xd057a1fe;
        if (!m32024xd057a1fe) {
            return new sc1.k1();
        }
        this.f487261c = z17;
        return z17 ? h("stop", null) : h("pause", null);
    }

    @Override // sc1.l
    public sc1.k1 g(android.os.Bundle bundle) {
        return new sc1.k1(this.f487259a.m32039xe25406fc(bundle));
    }

    @Override // sc1.l
    public sc1.k1 h(java.lang.String str, org.json.JSONObject jSONObject) {
        return new sc1.k1(this.f487259a.m32026xf1d569f7(str, jSONObject));
    }

    @Override // sc1.l
    public void j(com.p314xaae8f345.p2926x359365.C25487x5a912af7.OnBGMNotify onBGMNotify) {
        this.f487259a.m32029x2ea741c3(onBGMNotify);
    }

    @Override // sc1.l
    public sc1.k1 k() {
        return new sc1.k1(this.f487259a.m32038xdda4a17c());
    }

    @Override // sc1.l
    public void l(com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.f487259a.m32028xd526eba2(iTXAudioVolumeEvaluationListener);
    }

    @Override // sc1.l
    public void m(int i17) {
        this.f487259a.m32025xd1014ded(i17);
    }

    @Override // sc1.l
    public sc1.k1 n(com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, android.os.Bundle bundle) {
        return new sc1.k1(this.f487259a.m32023x656bc683(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, bundle));
    }

    @Override // sc1.l
    public void o(boolean z17) {
        this.f487259a.m32020xf0533f3f(z17);
    }

    @Override // sc1.l
    /* renamed from: setPushListener */
    public void mo164243x4e5bab70(com.p314xaae8f345.p2926x359365.InterfaceC25480xa8fcc7a7 interfaceC25480xa8fcc7a7) {
        this.f487259a.m32031x4e5bab70(interfaceC25480xa8fcc7a7);
    }
}
