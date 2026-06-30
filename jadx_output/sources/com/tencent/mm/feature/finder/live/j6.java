package com.tencent.mm.feature.finder.live;

/* loaded from: classes.dex */
public final class j6 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.t6 f66792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f66793e;

    public j6(com.tencent.mm.feature.finder.live.t6 t6Var, v65.n nVar) {
        this.f66792d = t6Var;
        this.f66793e = nVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.feature.finder.live.t6 t6Var = this.f66792d;
        com.tencent.mars.xlog.Log.i(t6Var.f66944d, "[checkRealName] requestCode:" + i17 + ", resultCode:" + i18);
        if (i17 == 40001) {
            v65.n nVar = this.f66793e;
            if (i18 == -1) {
                java.lang.String stringExtra = intent != null ? intent.getStringExtra("intent_auth_token") : null;
                com.tencent.mars.xlog.Log.i(t6Var.f66944d, "checkPwdToken:" + stringExtra);
                nVar.a(stringExtra);
            }
            nVar.a("");
        }
    }
}
