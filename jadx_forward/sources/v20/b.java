package v20;

/* loaded from: classes.dex */
public final class b implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.br2 f514282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f514283e;

    public b(r45.br2 br2Var, v65.n nVar) {
        this.f514282d = br2Var;
        this.f514283e = nVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>(0);
        }
        v65.n nVar = this.f514283e;
        r45.br2 br2Var = this.f514282d;
        if (i18 != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", "share finderObject " + br2Var.m75945x2fec8307(7) + " cancel");
            nVar.a(new jz5.l(java.lang.Boolean.FALSE, ""));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", "share finderObject " + br2Var.m75945x2fec8307(7) + " to " + stringArrayListExtra);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.lang.String str = (java.lang.String) kz5.n0.Z(stringArrayListExtra);
        nVar.a(new jz5.l(bool, str != null ? str : ""));
    }
}
