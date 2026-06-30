package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public final class y0 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.a1 f164851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f164852e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f164853f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f164854g;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.a1 a1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, android.app.Activity activity) {
        this.f164851d = a1Var;
        this.f164852e = yVar;
        this.f164853f = i17;
        this.f164854g = activity;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.a1 a1Var = this.f164851d;
        if (i17 != a1Var.f164640g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke, requestCode: %d is not match", java.lang.Integer.valueOf(i17));
            return;
        }
        int i19 = this.f164853f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f164852e;
        if (i18 == -1) {
            android.app.Activity activity = this.f164854g;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6), null, activity, null, null);
            yVar.a(i19, a1Var.o("ok"));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke, resultCode is not RESULT_OK: " + i18);
            yVar.a(i19, a1Var.o("cancel"));
        }
    }
}
