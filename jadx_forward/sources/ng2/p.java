package ng2;

/* loaded from: classes10.dex */
public final class p extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng2.s f418513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 f418514e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f418515f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f418516g;

    public p(ng2.s sVar, com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614, yz5.l lVar, yz5.a aVar) {
        this.f418513d = sVar;
        this.f418514e = c10850xc00cf614;
        this.f418515f = lVar;
        this.f418516g = aVar;
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onNetStatus */
    public void mo15382x3bee38d0(android.os.Bundle bundle) {
    }

    @Override // mn0.a, com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onPlayEvent */
    public void mo15376x8cd414a7(int i17, android.os.Bundle bundle) {
        super.mo15376x8cd414a7(i17, bundle);
        if (i17 == 2009) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AbsTXLivePlayListener", "switchInLiveRoom onPlayEvent PLAY_EVT_CHANGE_RESOLUTION");
            return;
        }
        if (i17 != 2033) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AbsTXLivePlayListener", "switchInLiveRoom switch view success. #1");
        ng2.s sVar = this.f418513d;
        sVar.getClass();
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614 = this.f418514e;
        c10850xc00cf614.post(new ng2.o(sVar, c10850xc00cf614, this.f418515f, this.f418516g));
    }
}
