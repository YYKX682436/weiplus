package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes7.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chattool.t f80409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f80410e;

    public m(com.tencent.mm.plugin.appbrand.jsapi.chattool.t tVar, int i17) {
        this.f80409d = tVar;
        this.f80410e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.jsapi.chattool.t tVar = this.f80409d;
        com.tencent.luggage.sdk.jsapi.component.service.y C0 = tVar.f80456d.C0();
        if (C0 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatToolService", "dispatch onChatToolStatusChange currentChatToolMode:" + tVar.f80460h + " sendToUserName:" + tVar.f80458f);
            com.tencent.mm.plugin.appbrand.jsapi.chattool.v.f80473i.a(C0, tVar.f80460h, java.lang.Integer.valueOf(this.f80410e), tVar.f80458f);
        }
    }
}
