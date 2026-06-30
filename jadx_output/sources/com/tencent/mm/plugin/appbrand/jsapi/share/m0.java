package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class m0 implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f83180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.q0 f83181b;

    public m0(com.tencent.mm.plugin.appbrand.jsapi.share.q0 q0Var, android.app.Activity activity) {
        this.f83181b = q0Var;
        this.f83180a = activity;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        com.tencent.mm.plugin.appbrand.jsapi.share.ShareToConversationResult shareToConversationResult = (com.tencent.mm.plugin.appbrand.jsapi.share.ShareToConversationResult) appBrandProxyUIProcessTask$ProcessResult;
        if (shareToConversationResult == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, result is null");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.share.t2 a17 = com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83248e.a(shareToConversationResult.f83096d);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, shareResult is null");
            a17 = com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83251h;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareImageMessage", "invoke, shareResult: " + a17);
        int ordinal = a17.ordinal();
        com.tencent.mm.plugin.appbrand.jsapi.share.q0 q0Var = this.f83181b;
        if (ordinal == 0) {
            android.app.Activity activity = this.f83180a;
            com.tencent.mm.ui.widget.snackbar.j.c(activity.getString(com.tencent.mm.R.string.fw6), null, activity, null, null);
            q0Var.f83205a.a(q0Var.f83206b, q0Var.f83213i.o("ok"));
            return;
        }
        if (ordinal == 1) {
            q0Var.f83205a.a(q0Var.f83206b, q0Var.f83213i.o("cancel"));
        } else {
            if (ordinal != 2) {
                return;
            }
            q0Var.f83205a.a(q0Var.f83206b, q0Var.f83213i.o("fail"));
        }
    }
}
