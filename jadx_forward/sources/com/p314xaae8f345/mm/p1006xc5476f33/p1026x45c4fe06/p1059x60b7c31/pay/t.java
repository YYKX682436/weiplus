package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes.dex */
public class t implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f164200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f164201e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f164202f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.v f164203g;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.v vVar, android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17) {
        this.f164203g = vVar;
        this.f164200d = activity;
        this.f164201e = c0Var;
        this.f164202f = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWCPayOverseaPrepayRequest", "mmOnActivityResult, resultCode = " + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.v vVar = this.f164203g;
        int i19 = this.f164202f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f164201e;
        if (i18 != -1) {
            c0Var.a(i19, vVar.o("cancel"));
            return;
        }
        if (intent != null && intent.hasExtra("url")) {
            android.content.Intent intent2 = new android.content.Intent();
            if (intent.hasExtra("view_port_code")) {
                intent2.putExtra("view_port_code", intent.getStringExtra("view_port_code"));
            }
            try {
                intent2.putExtra("rawUrl", intent.getStringExtra("url"));
                j45.l.j(this.f164200d, "webview", ".ui.tools.WebViewUI", intent2, null);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetWCPayOverseaPrepayRequest", "loadUrl ex: %s", e17.getMessage());
            }
        }
        c0Var.a(i19, vVar.o("ok"));
    }
}
