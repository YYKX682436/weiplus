package bg2;

/* loaded from: classes10.dex */
public final class j implements xi2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg2.k f101712a;

    public j(bg2.k kVar) {
        this.f101712a = kVar;
    }

    @Override // xi2.f
    /* renamed from: onAnimationEnd */
    public void mo10404xbb3aa236() {
        bg2.k kVar = this.f101712a;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = kVar.f498674d.f498680g;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new bg2.h(kVar, null), 3, null);
        }
    }

    @Override // xi2.f
    /* renamed from: onAnimationStart */
    public void mo10405xd7e2f2fd() {
        bg2.k kVar = this.f101712a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f101754e, "onAnimationStart status:" + kVar.f101762p);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = kVar.f498674d.f498680g;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new bg2.i(kVar, null), 3, null);
        }
    }
}
