package sc1;

/* loaded from: classes7.dex */
public class f extends com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f487192d;

    /* renamed from: e, reason: collision with root package name */
    public sc1.k f487193e;

    /* renamed from: f, reason: collision with root package name */
    public sc1.c f487194f;

    /* renamed from: g, reason: collision with root package name */
    public sc1.e f487195g;

    /* renamed from: h, reason: collision with root package name */
    public int f487196h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f487197i;

    /* renamed from: m, reason: collision with root package name */
    public sc1.d f487198m;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, android.content.Context context) {
        super(context);
        this.f487192d = lVar;
        this.f487193e = new sc1.o1(context);
    }

    public void a() {
        sc1.k1 e17 = ((sc1.o1) this.f487193e).e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLivePlayerView", "onDestroy code:%d info:%s", java.lang.Integer.valueOf(e17.f487221a), e17.f487222b);
        sc1.d dVar = this.f487198m;
        if (dVar != null) {
            sc1.r rVar = (sc1.r) dVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v vVar = rVar.f487257b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = rVar.f487256a;
            tVar.O(vVar);
            tVar.I(rVar.f487258c);
        }
    }

    public final void b(boolean z17) {
        sc1.e eVar;
        if (!this.f487197i || (eVar = this.f487195g) == null) {
            return;
        }
        int i17 = this.f487196h;
        sc1.s sVar = (sc1.s) eVar;
        sVar.getClass();
        sc1.w wVar = new sc1.w(null);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("fullScreen", z17);
            jSONObject.put(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.f16225x785081d0, i17);
            jSONObject.put("livePlayerId", sVar.f487262a);
        } catch (org.json.JSONException unused) {
        }
        wVar.f163907f = jSONObject.toString();
        sVar.f487263b.i(wVar, null);
    }

    public boolean c(java.lang.String str, org.json.JSONObject jSONObject) {
        sc1.k1 n17 = ((sc1.o1) this.f487193e).n(str, jSONObject);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLivePlayerView", "onOperate code:%d info:%s", java.lang.Integer.valueOf(n17.f487221a), n17.f487222b);
        return n17.f487221a == 0;
    }

    /* renamed from: setAudioVolumeEventListener */
    public void m164235x4a155f40(com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        ((sc1.o1) this.f487193e).h(iTXAudioVolumeEvaluationListener);
    }

    /* renamed from: setExitListener */
    public void m164236x20be7174(sc1.d dVar) {
        this.f487198m = dVar;
    }

    /* renamed from: setFullScreenDelegate */
    public void m164237xda608282(sc1.c cVar) {
        this.f487194f = cVar;
    }

    /* renamed from: setNeedEvent */
    public void m164238x9a7d1962(boolean z17) {
        this.f487197i = z17;
    }

    /* renamed from: setOnFullScreenChangeListener */
    public void m164239x679d6c40(sc1.e eVar) {
        this.f487195g = eVar;
    }

    /* renamed from: setPlayEventListener */
    public void m164240x7eb26e58(com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 interfaceC25479x1853e9c1) {
        ((sc1.o1) this.f487193e).mo164242xbdb2cd8a(interfaceC25479x1853e9c1);
    }

    /* renamed from: setSnapshotListener */
    public void m164241x8ba6f71a(com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXSnapshotListener iTXSnapshotListener) {
        ((sc1.o1) this.f487193e).g(iTXSnapshotListener);
    }
}
