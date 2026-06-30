package com.tencent.mm.plugin.appbrand.jsapi.emoji;

/* loaded from: classes13.dex */
public final class f implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.emoji.g f80843d;

    public f(com.tencent.mm.plugin.appbrand.jsapi.emoji.g gVar) {
        this.f80843d = gVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenDesignerProfile.FetchDesignerProxyTask", "handleRequest, loading dialog canceled by user");
        com.tencent.mm.plugin.appbrand.jsapi.emoji.FetchDesignerProxyResult fetchDesignerProxyResult = new com.tencent.mm.plugin.appbrand.jsapi.emoji.FetchDesignerProxyResult();
        fetchDesignerProxyResult.f80813d = false;
        this.f80843d.finishProcess(fetchDesignerProxyResult);
    }
}
