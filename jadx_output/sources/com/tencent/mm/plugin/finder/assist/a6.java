package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes.dex */
public final class a6 implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.br2 f102006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f102007e;

    public a6(r45.br2 br2Var, v65.n nVar) {
        this.f102006d = br2Var;
        this.f102007e = nVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>(0);
        }
        v65.n nVar = this.f102007e;
        r45.br2 br2Var = this.f102006d;
        if (i18 != -1) {
            com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", "share finderObject " + br2Var.getString(7) + " cancel");
            nVar.a(java.lang.Boolean.FALSE);
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", "share finderObject " + br2Var.getString(7) + " to " + stringArrayListExtra);
        nVar.a(java.lang.Boolean.TRUE);
    }
}
