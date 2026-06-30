package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class f1 implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f79536a;

    public f1(kotlinx.coroutines.q qVar) {
        this.f79536a = qVar;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        r45.js5 js5Var = (r45.js5) obj;
        kotlinx.coroutines.r rVar = (kotlinx.coroutines.r) this.f79536a;
        if (rVar.n()) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (js5Var == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.JSAuthorizeConfirmResponse");
            }
            rVar.resumeWith(kotlin.Result.m521constructorimpl((r45.f24) js5Var));
        }
    }
}
