package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes.dex */
public final class w8 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v65.n f211513d;

    public w8(v65.n nVar) {
        this.f211513d = nVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelperUI", "[checkRealName] requestCode:" + i17 + ", resultCode:" + i18);
        if (i17 == 40001) {
            v65.n nVar = this.f211513d;
            if (i18 == -1) {
                java.lang.String stringExtra = intent != null ? intent.getStringExtra("intent_auth_token") : null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelperUI", "checkPwdToken:" + stringExtra);
                nVar.a(stringExtra);
            }
            nVar.a("");
        }
    }
}
