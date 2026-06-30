package ey2;

/* loaded from: classes2.dex */
public final class s1 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ey2.z1 f339031a;

    public s1(ey2.z1 z1Var) {
        this.f339031a = z1Var;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
        ey2.z1 z1Var = this.f339031a;
        z1Var.getClass();
        z1Var.f339128h = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SYNC_RED_DOT_SESSION_REPORT_SWITCH_INT, 0) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotSessionVM", "enter foreground isEnable=" + z1Var.f339128h);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotSessionVM", "exit foreground isEnable=" + this.f339031a.f339128h);
    }
}
