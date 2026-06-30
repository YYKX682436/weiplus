package hq0;

/* loaded from: classes7.dex */
public final class g0 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hq0.i0 f364524a;

    public g0(hq0.i0 i0Var) {
        this.f364524a = i0Var;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
        hq0.i0 i0Var = this.f364524a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.m133876xb5887064(), "onEnterForeground");
        i0Var.m1();
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
        hq0.i0 i0Var = this.f364524a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.m133876xb5887064(), "onExitForeground");
        kc3.f fVar = i0Var.f364537s;
        if (fVar != null) {
            ym5.a1.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o5((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s5) fVar));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("autoPauseExt");
            throw null;
        }
    }
}
