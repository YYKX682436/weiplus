package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.w0 f85154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.tencent.mm.plugin.appbrand.launching.w0 w0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f85154d = w0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.launching.t0(this.f85154d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.appbrand.launching.t0 t0Var = (com.tencent.mm.plugin.appbrand.launching.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        t0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.appbrand.launching.r0 r0Var = com.tencent.mm.plugin.appbrand.launching.r0.f85091a;
        com.tencent.mm.plugin.appbrand.launching.w0 w0Var = this.f85154d;
        r0Var.a(w0Var.f85307d);
        new com.tencent.mm.plugin.appbrand.launching.x0(w0Var.f85307d, w0Var.f85308e, w0Var.f85309f, w0Var.f85310g, w0Var.f85311h).run();
        return jz5.f0.f302826a;
    }
}
