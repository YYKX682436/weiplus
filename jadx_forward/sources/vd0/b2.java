package vd0;

/* loaded from: classes5.dex */
public final class b2 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vd0.d2 f516903a;

    public b2(vd0.d2 d2Var) {
        this.f516903a = d2Var;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MuteModeService", "onEnterForeground");
        if (j65.e.b() && j65.e.g()) {
            vd0.d2 d2Var = this.f516903a;
            d2Var.wi();
            d2Var.Ni();
            d2Var.Ri(0);
            if (j65.e.h()) {
                j65.e.m(false);
                d75.b.g(vd0.a2.f516899d);
            }
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MuteModeService", "onExitForeground");
        vd0.d2 d2Var = this.f516903a;
        d2Var.Ui();
        if (j65.e.b() && j65.e.g() && j65.e.h()) {
            d2Var.Bi(false);
        }
        if (j65.e.b() && j65.e.g()) {
            d2Var.Di();
        }
    }
}
