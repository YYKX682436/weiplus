package mg2;

/* loaded from: classes10.dex */
public final class c extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mg2.e f407749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f407750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f407751f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f407752g;

    public c(mg2.e eVar, boolean z17, yz5.l lVar, yz5.a aVar) {
        this.f407749d = eVar;
        this.f407750e = z17;
        this.f407751f = lVar;
        this.f407752g = aVar;
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onNetStatus */
    public void mo15382x3bee38d0(android.os.Bundle bundle) {
    }

    @Override // mn0.a, com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onPlayEvent */
    public void mo15376x8cd414a7(int i17, android.os.Bundle bundle) {
        super.mo15376x8cd414a7(i17, bundle);
        yz5.a aVar = this.f407752g;
        yz5.l lVar = this.f407751f;
        mg2.e eVar = this.f407749d;
        if (i17 == -2304) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f400090e, "switchInLiveRoom playEventErrors: " + i17);
            mg2.e.B(eVar, i17);
            eVar.D("playEventErrors", lVar, aVar);
            return;
        }
        if (i17 == 2009) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f400090e, "switchInLiveRoom onPlayEvent PLAY_EVT_CHANGE_RESOLUTION");
            mg2.e.A(eVar, bundle);
            eVar.D("onPlayEvent PLAY_EVT_CHANGE_RESOLUTION", lVar, aVar);
            return;
        }
        if (i17 != 2033) {
            if (i17 != 2103) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f400090e, "switchInLiveRoom playEventErrors: " + i17);
            mn0.b0 b0Var = eVar.f407760z;
            if (b0Var != null) {
                qg2.e.f444332a.c("switchInLiveRoom", b0Var, eVar.b().f372911m, eVar.C(eVar.b().f372936b, eVar.b().f372937c));
                return;
            }
            return;
        }
        boolean z17 = bundle != null ? bundle.getBoolean("fromCustomRender") : false;
        java.lang.String str = eVar.f400090e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchInLiveRoom onPlayEvent EVT_PLAY_VIEW_CHANGED_FIRST_I_FRAME  isCustomRender: ");
        boolean z18 = this.f407750e;
        sb6.append(z18);
        sb6.append(" fromCustomRender: ");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (!z18 || z17) {
            eVar.f407756v = true;
            eVar.D("onPlayEvent", lVar, aVar);
        }
    }
}
