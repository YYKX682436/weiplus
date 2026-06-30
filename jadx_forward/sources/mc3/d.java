package mc3;

/* loaded from: classes7.dex */
public final class d extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mc3.f f407156a;

    public d(mc3.f fVar) {
        this.f407156a = fVar;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
        mc3.f fVar = this.f407156a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.f407173v, "onEnterForeground");
        rp0.e eVar = (rp0.e) fVar.C0();
        eVar.f479879f = true;
        java.lang.Runnable runnable = eVar.f479884k;
        if (runnable != null) {
            runnable.run();
        }
        eVar.e(false);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
        mc3.f fVar = this.f407156a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.f407173v, "onExitForeground");
        rp0.e eVar = (rp0.e) fVar.C0();
        eVar.f479879f = false;
        eVar.d();
    }
}
