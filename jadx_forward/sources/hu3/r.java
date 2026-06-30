package hu3;

/* loaded from: classes5.dex */
public final class r implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f366723d;

    public r(hu3.n0 n0Var) {
        this.f366723d = n0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("menu ratio update ");
        hu3.n0 n0Var = this.f366723d;
        sb6.append(n0Var.D);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", sb6.toString());
        if (n0Var.D) {
            return;
        }
        if (n0Var.f366697h == 1 && n0Var.f366698i == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "menu ratio update >> is use maas");
        n0Var.D = true;
    }
}
