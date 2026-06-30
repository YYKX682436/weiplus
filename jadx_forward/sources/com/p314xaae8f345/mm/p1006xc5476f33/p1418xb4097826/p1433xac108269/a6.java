package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes.dex */
public final class a6 implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.br2 f183539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f183540e;

    public a6(r45.br2 br2Var, v65.n nVar) {
        this.f183539d = br2Var;
        this.f183540e = nVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>(0);
        }
        v65.n nVar = this.f183540e;
        r45.br2 br2Var = this.f183539d;
        if (i18 != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", "share finderObject " + br2Var.m75945x2fec8307(7) + " cancel");
            nVar.a(java.lang.Boolean.FALSE);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", "share finderObject " + br2Var.m75945x2fec8307(7) + " to " + stringArrayListExtra);
        nVar.a(java.lang.Boolean.TRUE);
    }
}
