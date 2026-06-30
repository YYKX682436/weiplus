package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.s1 f79702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79703e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskInfo f79704f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f79705g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.tencent.mm.plugin.appbrand.jsapi.auth.s1 s1Var, com.tencent.mm.plugin.appbrand.y yVar, com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskInfo mMAuthScopeRiskInfo, kotlinx.coroutines.q qVar) {
        super(0);
        this.f79702d = s1Var;
        this.f79703e = yVar;
        this.f79704f = mMAuthScopeRiskInfo;
        this.f79705g = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.jsapi.auth.f0 f0Var = com.tencent.mm.plugin.appbrand.jsapi.auth.m0.f79634a;
        com.tencent.mm.plugin.appbrand.jsapi.auth.s1 s1Var = this.f79702d;
        com.tencent.mm.plugin.appbrand.y yVar = this.f79703e;
        android.content.Context b17 = s1Var.b(yVar);
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskInfo mMAuthScopeRiskInfo = this.f79704f;
        f0Var.a(b17, mMAuthScopeRiskInfo.f79454f, mMAuthScopeRiskInfo.f79456h, mMAuthScopeRiskInfo.f79455g, com.tencent.mm.plugin.appbrand.jsapi.auth.l0.f79624a.a(s1Var.b(yVar), mMAuthScopeRiskInfo), new com.tencent.mm.plugin.appbrand.jsapi.auth.q1(this.f79705g));
        return jz5.f0.f302826a;
    }
}
