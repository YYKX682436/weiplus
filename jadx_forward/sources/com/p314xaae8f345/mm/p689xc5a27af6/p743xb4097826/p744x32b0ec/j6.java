package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes.dex */
public final class j6 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t6 f148325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f148326e;

    public j6(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t6 t6Var, v65.n nVar) {
        this.f148325d = t6Var;
        this.f148326e = nVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t6 t6Var = this.f148325d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t6Var.f148477d, "[checkRealName] requestCode:" + i17 + ", resultCode:" + i18);
        if (i17 == 40001) {
            v65.n nVar = this.f148326e;
            if (i18 == -1) {
                java.lang.String stringExtra = intent != null ? intent.getStringExtra("intent_auth_token") : null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t6Var.f148477d, "checkPwdToken:" + stringExtra);
                nVar.a(stringExtra);
            }
            nVar.a("");
        }
    }
}
