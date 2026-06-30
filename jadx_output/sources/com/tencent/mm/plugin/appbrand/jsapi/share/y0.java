package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public final class y0 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.a1 f83318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f83319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f83320f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f83321g;

    public y0(com.tencent.mm.plugin.appbrand.jsapi.share.a1 a1Var, com.tencent.mm.plugin.appbrand.y yVar, int i17, android.app.Activity activity) {
        this.f83318d = a1Var;
        this.f83319e = yVar;
        this.f83320f = i17;
        this.f83321g = activity;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.share.a1 a1Var = this.f83318d;
        if (i17 != a1Var.f83107g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke, requestCode: %d is not match", java.lang.Integer.valueOf(i17));
            return;
        }
        int i19 = this.f83320f;
        com.tencent.mm.plugin.appbrand.y yVar = this.f83319e;
        if (i18 == -1) {
            android.app.Activity activity = this.f83321g;
            com.tencent.mm.ui.widget.snackbar.j.c(activity.getString(com.tencent.mm.R.string.fw6), null, activity, null, null);
            yVar.a(i19, a1Var.o("ok"));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke, resultCode is not RESULT_OK: " + i18);
            yVar.a(i19, a1Var.o("cancel"));
        }
    }
}
