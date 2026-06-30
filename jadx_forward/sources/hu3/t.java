package hu3;

/* loaded from: classes5.dex */
public final class t implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f366731d;

    public t(hu3.n0 n0Var) {
        this.f366731d = n0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        int i17 = ((zt3.b) obj).f557118a;
        hu3.n0 n0Var = this.f366731d;
        if (i17 == 1) {
            n0Var.f366694e.S6(5, new hu3.m(n0Var));
            hu3.q qVar = new hu3.q(n0Var);
            zt3.a aVar = n0Var.f366694e;
            aVar.S6(6, qVar);
            aVar.S6(7, new hu3.r(n0Var));
            return;
        }
        if (i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "EVENT_CAMERA_FIRST_FRAME >> " + n0Var.D);
            if (n0Var.D) {
                n0Var.D = false;
                hu3.n0.b(n0Var).setVisibility(0);
                n0Var.n();
                p3325xe03a0797.p3326xc267989b.y0 y0Var = n0Var.f366696g;
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new hu3.s(n0Var, null), 2, null);
            }
        }
    }
}
