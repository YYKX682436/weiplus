package pe2;

/* loaded from: classes3.dex */
public final class c implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe2.h f435148d;

    public c(pe2.h hVar) {
        this.f435148d = hVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        mm2.j0 j0Var = (mm2.j0) obj;
        pe2.h hVar = this.f435148d;
        jz5.f0 f0Var = null;
        if (j0Var != null) {
            if (j0Var.f410685b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCheerAnimationPlugin", "showCheerAnimation isLandscape: " + hVar.x0() + " data : " + j0Var);
                p3325xe03a0797.p3326xc267989b.r2 r2Var = hVar.f435164q;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = hVar.f435163p;
                c22789xd23e9a9b.n();
                c22789xd23e9a9b.m82582x3ae760af(0.0d);
                hVar.f435164q = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(hVar, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new pe2.g(hVar, j0Var, null), 2, null);
            } else {
                hVar.t1(true);
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            hVar.t1(true);
        }
    }
}
