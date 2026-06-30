package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public final class v0 implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f83285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f83286b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f83287c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.a1 f83288d;

    public v0(android.app.Activity activity, com.tencent.mm.plugin.appbrand.y yVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.share.a1 a1Var) {
        this.f83285a = activity;
        this.f83286b = yVar;
        this.f83287c = i17;
        this.f83288d = a1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        com.tencent.mm.plugin.appbrand.jsapi.share.ShareToConversationResult shareToConversationResult = (com.tencent.mm.plugin.appbrand.jsapi.share.ShareToConversationResult) appBrandProxyUIProcessTask$ProcessResult;
        if (shareToConversationResult == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke, result is null");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.share.t2 a17 = com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83248e.a(shareToConversationResult.f83096d);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke, shareResult is null");
            a17 = com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83251h;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "invoke, shareResult: " + a17);
        int ordinal = a17.ordinal();
        com.tencent.mm.plugin.appbrand.jsapi.share.a1 a1Var = this.f83288d;
        int i17 = this.f83287c;
        com.tencent.mm.plugin.appbrand.y yVar = this.f83286b;
        if (ordinal == 0) {
            android.app.Activity activity = this.f83285a;
            com.tencent.mm.ui.widget.snackbar.j.c(activity.getString(com.tencent.mm.R.string.fw6), null, activity, null, null);
            yVar.a(i17, a1Var.o("ok"));
        } else if (ordinal == 1) {
            yVar.a(i17, a1Var.o("cancel"));
        } else {
            if (ordinal != 2) {
                return;
            }
            yVar.a(i17, a1Var.o("fail"));
        }
    }
}
