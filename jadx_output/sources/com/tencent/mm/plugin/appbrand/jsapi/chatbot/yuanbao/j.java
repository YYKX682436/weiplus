package com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao;

/* loaded from: classes.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f80317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb1.p f80318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f80319f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f80320g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.p f80321h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yb1.p pVar, com.tencent.mm.plugin.appbrand.o6 o6Var, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.p pVar2, kotlin.coroutines.Continuation continuation2) {
        super(2, continuation2);
        this.f80318e = pVar;
        this.f80319f = o6Var;
        this.f80320g = continuation;
        this.f80321h = pVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.j(this.f80318e, this.f80319f, this.f80320g, this.f80321h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f80317d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        kotlin.coroutines.Continuation continuation = this.f80320g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f80317d = 1;
            obj = ((yb1.o) this.f80318e).c(this.f80319f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String str = (java.lang.String) obj;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandYuanbaoService", "getPageContentFileInClientProcess writeFile filePath:" + str);
                continuation.resumeWith(kotlin.Result.m521constructorimpl(str));
                return f0Var;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str2 = (java.lang.String) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandYuanbaoService", "getPageContentFileInClientProcess: pageContent:" + str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandYuanbaoService", "getPageContentFileInClientProcess: pageContent is null");
            continuation.resumeWith(kotlin.Result.m521constructorimpl(""));
            return f0Var;
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
        com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.i iVar = new com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.i(this.f80321h, str2, null);
        this.f80317d = 2;
        obj = kotlinx.coroutines.l.g(p0Var, iVar, this);
        if (obj == aVar) {
            return aVar;
        }
        java.lang.String str3 = (java.lang.String) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandYuanbaoService", "getPageContentFileInClientProcess writeFile filePath:" + str3);
        continuation.resumeWith(kotlin.Result.m521constructorimpl(str3));
        return f0Var;
    }
}
