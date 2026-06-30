package com.tencent.mm.ipcinvoker.wx_extension;

/* loaded from: classes7.dex */
public final class a implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.wx_extension.c f68414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f68415b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ im5.c f68416c;

    public a(com.tencent.mm.ipcinvoker.wx_extension.c cVar, kotlinx.coroutines.q qVar, im5.c cVar2) {
        this.f68414a = cVar;
        this.f68415b = qVar;
        this.f68416c = cVar2;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        java.lang.String msg = "runCgi onTerminate, errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str;
        com.tencent.mm.ipcinvoker.wx_extension.c cVar = this.f68414a;
        cVar.getClass();
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i(cVar.b() + "[Cgi][" + cVar.hashCode() + ']', msg);
        com.tencent.mm.modelbase.n nVar = oVar.f70711b;
        cVar.f68422c = nVar != null ? nVar.getProfile() : null;
        kotlinx.coroutines.q qVar = this.f68415b;
        if (i17 == 0 && i18 == 0) {
            if (((kotlinx.coroutines.r) qVar).n()) {
                com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
                kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type RESPONSE of com.tencent.mm.ipcinvoker.wx_extension.Cgi.send$lambda$2");
                qVar.resumeWith(kotlin.Result.m521constructorimpl((r45.js5) fVar));
            }
        } else if (((kotlinx.coroutines.r) qVar).n()) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.mm.ipcinvoker.wx_extension.d(i17, i18, str, cVar))));
        }
        this.f68416c.dead();
    }
}
