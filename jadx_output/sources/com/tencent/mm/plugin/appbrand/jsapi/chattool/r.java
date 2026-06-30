package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes7.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chattool.t f80447d;

    public r(com.tencent.mm.plugin.appbrand.jsapi.chattool.t tVar) {
        this.f80447d = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.jsapi.chattool.t tVar = this.f80447d;
        com.tencent.luggage.sdk.jsapi.component.service.y C0 = tVar.f80456d.C0();
        if (C0 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatToolService", "dispatch onChatToolStatusChange currentChatToolMode:" + tVar.f80460h + " sendToUserName:" + tVar.f80458f);
            com.tencent.mm.plugin.appbrand.jsapi.chattool.v.f80473i.a(C0, tVar.f80460h, -1, "");
        }
    }
}
