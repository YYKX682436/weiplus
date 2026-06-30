package com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao;

/* loaded from: classes5.dex */
public final class c implements com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.p f80291b;

    public c(java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.p pVar) {
        this.f80290a = str;
        this.f80291b = pVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.a0
    public void a(com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.c0 result) {
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandYuanbaoService", "onGetAndUploadPageContent, appId: " + this.f80290a + ", result: " + result);
        com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.p pVar = this.f80291b;
        java.lang.Object obj = pVar.f80331e;
        java.lang.String str = this.f80290a;
        synchronized (obj) {
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f80291b.f80333g.remove(this.f80290a);
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.a0) it.next()).a(result);
            }
        }
    }
}
