package com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao;

/* loaded from: classes.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f80322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f80324f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String str, com.tencent.mm.ipcinvoker.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f80323e = str;
        this.f80324f = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.k(this.f80323e, this.f80324f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f80322d;
        java.lang.String str = this.f80323e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.b0 b0Var = (com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.b0) i95.n0.c(com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.b0.class);
            this.f80322d = 1;
            com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.p pVar = (com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.p) b0Var;
            pVar.getClass();
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(str);
            if (b17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandYuanbaoService", "getPageContentFileInClientProcess: runtime is null");
                nVar.resumeWith(kotlin.Result.m521constructorimpl(""));
            } else {
                yb1.p pVar2 = (yb1.p) b17.K1(yb1.p.class);
                if (pVar2 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandYuanbaoService", "getPageContentFileInClientProcess: getPageContentService is null");
                    nVar.resumeWith(kotlin.Result.m521constructorimpl(""));
                } else {
                    kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.j(pVar2, b17, nVar, pVar, null), 3, null);
                }
            }
            obj = nVar.a();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str2 = (java.lang.String) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandYuanbaoService", "getPageContentFileInMMProcess appIdClient:" + str + " filePath:" + str2);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("KEY_CODE", 0);
        bundle.putString("KEY_PAGE_CONTENT_PATH", str2);
        this.f80324f.a(bundle);
        return jz5.f0.f302826a;
    }
}
