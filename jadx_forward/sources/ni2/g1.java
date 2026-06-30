package ni2;

/* loaded from: classes3.dex */
public final class g1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.l1 f418836d;

    public g1(ni2.l1 l1Var) {
        this.f418836d = l1Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        android.content.res.Resources resources;
        int i17;
        g4Var.clear();
        ni2.l1 l1Var = this.f418836d;
        if (((mm2.e1) l1Var.f418904c.P0(mm2.e1.class)).b7()) {
            resources = l1Var.f418902a.getResources();
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.nsx;
        } else {
            resources = l1Var.f418902a.getResources();
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.dxj;
        }
        g4Var.f(1, resources.getString(i17));
    }
}
