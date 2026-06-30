package vj4;

/* loaded from: classes11.dex */
public final class a implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a.GetCustomIconRecommendDataCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vj4.d f519213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f519214b;

    public a(vj4.d dVar, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f519213a = dVar;
        this.f519214b = qVar;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27527xb02aa11a.GetCustomIconRecommendDataCallback
    /* renamed from: complete */
    public final void mo117293xdc453139(bw5.ll0 ll0Var, bw5.yn0 yn0Var) {
        java.lang.String str = this.f519213a.f519222d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestRecommendIconData complete: ");
        sb6.append(ll0Var != null ? java.lang.Integer.valueOf(ll0Var.f111382f) : null);
        sb6.append(", ");
        sb6.append(ll0Var != null ? java.lang.Integer.valueOf(ll0Var.f111381e) : null);
        sb6.append(", ");
        sb6.append(yn0Var.m13425xfb85ada3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        boolean z17 = false;
        if (ll0Var != null && ll0Var.f111382f == 0) {
            z17 = true;
        }
        p3325xe03a0797.p3326xc267989b.q qVar = this.f519214b;
        if (z17 && ll0Var.f111381e == 0) {
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(yn0Var));
        } else {
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        }
    }
}
