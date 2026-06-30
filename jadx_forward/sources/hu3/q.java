package hu3;

/* loaded from: classes5.dex */
public final class q implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f366720d;

    public q(hu3.n0 n0Var) {
        this.f366720d = n0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        zt3.c cVar = (zt3.c) obj;
        boolean z17 = cVar.f557121b;
        hu3.n0 n0Var = this.f366720d;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "unSelectBeauty");
            p3325xe03a0797.p3326xc267989b.l.d(n0Var.f366696g, null, null, new hu3.p(n0Var, null), 3, null);
            return;
        }
        android.os.Bundle bundle = cVar.f557122c;
        java.lang.Integer valueOf = bundle != null ? java.lang.Integer.valueOf(bundle.getInt("PARAM_1_INT")) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "MENU_BEAUTY >> " + valueOf);
        if (valueOf != null) {
            p3325xe03a0797.p3326xc267989b.l.d(n0Var.f366696g, null, null, new hu3.o(valueOf.intValue(), n0Var, null), 3, null);
        }
    }
}
