package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public class n0 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f164721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.q0 f164722e;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.q0 q0Var, android.app.Activity activity) {
        this.f164722e = q0Var;
        this.f164721d = activity;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.q0 q0Var = this.f164722e;
        if (i17 != q0Var.f164746i.f164758g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, requestCode: %d is not match", java.lang.Integer.valueOf(i17));
            return;
        }
        if (i18 != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, resultCode is not RESULT_OK: " + i18);
            q0Var.f164738a.a(q0Var.f164739b, q0Var.f164746i.o("cancel"));
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent == null ? null : intent.getStringArrayListExtra("SendMsgUsernames");
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, toUsers is empty");
            q0Var.f164738a.a(q0Var.f164739b, q0Var.f164746i.o("fail:selected user is empty"));
            return;
        }
        android.app.Activity activity = this.f164721d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6), null, activity, null, null);
        j91.d dVar = (j91.d) q0Var.f164738a.mo32091x9a3f0ba2().K1(j91.d.class);
        if (dVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t) dVar;
            if (tVar.f()) {
                tVar.l();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, toUser: " + java.util.Arrays.toString(stringArrayListExtra.toArray()));
        q0Var.f164738a.a(q0Var.f164739b, q0Var.f164746i.o("ok"));
    }
}
