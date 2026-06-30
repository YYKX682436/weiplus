package ig2;

/* loaded from: classes3.dex */
public final class c extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ig2.d f372901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f372902e;

    public c(ig2.d dVar, yz5.l lVar) {
        this.f372901d = dVar;
        this.f372902e = lVar;
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onNetStatus */
    public void mo15382x3bee38d0(android.os.Bundle bundle) {
    }

    @Override // mn0.a, com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onPlayEvent */
    public void mo15376x8cd414a7(int i17, android.os.Bundle bundle) {
        super.mo15376x8cd414a7(i17, bundle);
        ig2.d dVar = this.f372901d;
        if (i17 == 2009) {
            dVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFluentShopWindowDirector", "switchInLiveRoom onPlayEvent PLAY_EVT_CHANGE_RESOLUTION");
        } else {
            if (i17 != 2033) {
                return;
            }
            dVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFluentShopWindowDirector", "switchInLiveRoom switch view success. #1");
            this.f372902e.mo146xb9724478(java.lang.Boolean.FALSE);
            yz5.a aVar = dVar.f372904e;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
    }
}
