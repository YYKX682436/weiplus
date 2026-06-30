package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public final class h1 implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f83151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f83152b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f83153c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.i1 f83154d;

    public h1(com.tencent.mm.plugin.appbrand.y yVar, android.app.Activity activity, int i17, com.tencent.mm.plugin.appbrand.jsapi.share.i1 i1Var) {
        this.f83151a = yVar;
        this.f83152b = activity;
        this.f83153c = i17;
        this.f83154d = i1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        com.tencent.mm.plugin.appbrand.jsapi.share.ShareToConversationResult shareToConversationResult = (com.tencent.mm.plugin.appbrand.jsapi.share.ShareToConversationResult) appBrandProxyUIProcessTask$ProcessResult;
        if (shareToConversationResult == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, result is null");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.share.t2 a17 = com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83248e.a(shareToConversationResult.f83096d);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, shareResult is null");
            a17 = com.tencent.mm.plugin.appbrand.jsapi.share.t2.f83251h;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, shareResult: " + a17);
        int ordinal = a17.ordinal();
        com.tencent.mm.plugin.appbrand.jsapi.share.i1 i1Var = this.f83154d;
        int i17 = this.f83153c;
        com.tencent.mm.plugin.appbrand.y yVar = this.f83151a;
        if (ordinal != 0) {
            if (ordinal == 1) {
                yVar.a(i17, i1Var.o("cancel"));
                return;
            } else {
                if (ordinal != 2) {
                    return;
                }
                yVar.a(i17, i1Var.o("fail"));
                return;
            }
        }
        j91.d dVar = (j91.d) yVar.getRuntime().K1(j91.d.class);
        if (dVar != null) {
            com.tencent.mm.plugin.appbrand.jsapi.chattool.t tVar = (com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar;
            if (tVar.f()) {
                tVar.l();
            }
        }
        android.app.Activity activity = this.f83152b;
        com.tencent.mm.ui.widget.snackbar.j.c(activity.getString(com.tencent.mm.R.string.f_p), null, activity, null, null);
        yVar.a(i17, i1Var.o("ok"));
    }
}
