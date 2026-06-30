package mg2;

/* loaded from: classes10.dex */
public final class b extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mg2.e f407745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ka4 f407746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f407747f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f407748g;

    public b(mg2.e eVar, r45.ka4 ka4Var, long j17, long j18) {
        this.f407745d = eVar;
        this.f407746e = ka4Var;
        this.f407747f = j17;
        this.f407748g = j18;
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onNetStatus */
    public void mo15382x3bee38d0(android.os.Bundle bundle) {
    }

    @Override // mn0.a, com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onPlayEvent */
    public void mo15376x8cd414a7(int i17, android.os.Bundle bundle) {
        super.mo15376x8cd414a7(i17, bundle);
        mg2.e eVar = this.f407745d;
        if (i17 == -2304) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f400090e, "preloadStartLivePlayer playEventErrors: " + i17);
            mg2.e.B(eVar, i17);
            return;
        }
        if (i17 == 2003) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f400090e, "preloadStartLivePlayer onPlayEvent EVT_PLAY_VIEW_CHANGED_FIRST_I_FRAME");
            return;
        }
        if (i17 == 2009) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f400090e, "preloadStartLivePlayer onPlayEvent PLAY_EVT_CHANGE_RESOLUTION");
            mg2.e.A(eVar, bundle);
            return;
        }
        if (i17 != 2103) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f400090e, "preloadStartLivePlayer playEventErrors: " + i17);
        mn0.b0 b0Var = eVar.f407760z;
        if (b0Var != null) {
            qg2.e.f444332a.c("preloadStartLivePlayer", b0Var, this.f407746e, eVar.C(this.f407747f, this.f407748g));
        }
    }
}
