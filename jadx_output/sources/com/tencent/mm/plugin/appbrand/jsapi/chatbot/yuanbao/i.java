package com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao;

/* loaded from: classes.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.p f80315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80316e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.p pVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f80315d = pVar;
        this.f80316e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.i(this.f80315d, this.f80316e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String str = ((java.lang.String) ((jz5.n) this.f80315d.f80334h).getValue()) + "pc_" + java.lang.System.currentTimeMillis();
        byte[] bytes = this.f80316e.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        int S = com.tencent.mm.vfs.w6.S(str, bytes, 0, bytes.length);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandYuanbaoService", "writeFile isOK:" + S);
        return S == 0 ? str : "";
    }
}
