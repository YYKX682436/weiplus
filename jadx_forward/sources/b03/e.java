package b03;

/* loaded from: classes11.dex */
public final class e extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b03.l f98364b;

    public e(b03.l lVar) {
        this.f98364b = lVar;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void a() {
        e50.z0 z0Var;
        pi0.q qVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f98364b.f98375e, "deepBackgroundCallback onEnterDeepBackground");
        b03.l lVar = this.f98364b;
        lVar.f98381k = true;
        if (lVar.f98376f && (qVar = (z0Var = (e50.z0) ((f50.y) i95.n0.c(f50.y.class))).f331091e) != null) {
            qVar.f(z0Var.f331100q);
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        b03.d dVar = new b03.d(this.f98364b);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.w(dVar, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, null);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void b() {
        b03.l lVar = this.f98364b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f98375e, "deepBackgroundCallback onExitBackground");
        lVar.f98381k = false;
    }
}
