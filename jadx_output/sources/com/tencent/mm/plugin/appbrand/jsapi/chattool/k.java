package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes7.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chattool.t f80403d;

    public k(com.tencent.mm.plugin.appbrand.jsapi.chattool.t tVar) {
        this.f80403d = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.luggage.sdk.jsapi.component.service.y C0 = this.f80403d.f80456d.C0();
        if (C0 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatToolService", "dispatch onChatToolStatusChange default");
            com.tencent.mm.plugin.appbrand.jsapi.chattool.v.f80473i.a(C0, "", -1, "");
        }
    }
}
