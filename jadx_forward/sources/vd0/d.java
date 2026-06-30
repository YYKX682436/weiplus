package vd0;

/* loaded from: classes12.dex */
public final class d extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vd0.e f516918a;

    public d(vd0.e eVar) {
        this.f516918a = eVar;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckDensityService", "onEnterForeground !!");
        vd0.e.wi(this.f516918a, true);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckDensityService", "onExitForeground !!");
        vd0.e.wi(this.f516918a, false);
    }
}
