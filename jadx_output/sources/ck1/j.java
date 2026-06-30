package ck1;

/* loaded from: classes4.dex */
public final class j implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f42335d;

    public j(kotlin.coroutines.Continuation continuation) {
        this.f42335d = continuation;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiRevokeUserInfoAuthorize", "callback, errType: " + i17 + ", errCode: " + i18 + ", errMsg: " + str);
        kotlin.coroutines.Continuation continuation = this.f42335d;
        if (i17 != 0 || i18 != 0) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.io.IOException("Server Framework Error(errType: " + i17 + ", errCode: " + i18 + ", errMsg: " + str + ')'))));
            return 0;
        }
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        r45.tc7 tc7Var = fVar instanceof r45.tc7 ? (r45.tc7) fVar : null;
        if (tc7Var == null) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.io.IOException("Client Framework Error(resp is null)"))));
            return 0;
        }
        r45.jw6 jw6Var = tc7Var.f386318d;
        int i19 = jw6Var.f378177d;
        java.lang.String str2 = jw6Var.f378178e;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiRevokeUserInfoAuthorize", "callback, logicErrCode: " + i19 + ", logicErrMsg: " + str2);
        if (i19 == 0) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
            return 0;
        }
        kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.io.IOException("Server Logic Error(logicErrCode: " + i19 + ", logicErrMsg: " + str2 + ')'))));
        return 0;
    }
}
