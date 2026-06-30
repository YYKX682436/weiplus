package hu3;

/* loaded from: classes5.dex */
public final class m implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f366687d;

    public m(hu3.n0 n0Var) {
        this.f366687d = n0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        zt3.c cVar = (zt3.c) obj;
        boolean z17 = cVar.f557121b;
        hu3.n0 n0Var = this.f366687d;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "select none filter");
            p3325xe03a0797.p3326xc267989b.l.d(n0Var.f366696g, null, null, new hu3.l(n0Var, null), 3, null);
            return;
        }
        android.os.Bundle bundle = cVar.f557122c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.C16996x6c653a3a c16996x6c653a3a = bundle != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.C16996x6c653a3a) bundle.getParcelable("PARAM_1_PARCELABLE") : null;
        if (c16996x6c653a3a == null) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.l.d(n0Var.f366696g, null, null, new hu3.k(c16996x6c653a3a, n0Var, null), 3, null);
    }
}
