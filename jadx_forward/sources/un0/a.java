package un0;

/* loaded from: classes12.dex */
public final class a extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {
    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenCastForegroundListener", "#appForegroundListener onEnter");
        boolean z17 = un0.b.f510878a;
        un0.b.f510878a = true;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
        boolean z17 = un0.b.f510878a;
        un0.b.f510878a = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenCastForegroundListener", "#appForegroundListener onExit");
    }
}
