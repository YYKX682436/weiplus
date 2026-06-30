package b92;

/* loaded from: classes10.dex */
public final class q1 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b92.v1 f100038a;

    public q1(b92.v1 v1Var) {
        this.f100038a = v1Var;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveDNSParseService", "onEnterForeground: ");
        pm0.v.X(new b92.o1(this.f100038a));
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveDNSParseService", "onExitForeground: ");
        pm0.v.X(new b92.p1(this.f100038a));
    }
}
