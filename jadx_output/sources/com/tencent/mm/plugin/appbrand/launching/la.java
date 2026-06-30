package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class la extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.ma f84764d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(com.tencent.mm.plugin.appbrand.launching.ma maVar) {
        super(0);
        this.f84764d = maVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.launching.ma maVar = this.f84764d;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime rt6 = maVar.f84786b;
        ph1.p pVar = maVar.f84789e;
        kotlin.jvm.internal.o.g(rt6, "rt");
        java.lang.String requestedModuleName = maVar.f84787c;
        kotlin.jvm.internal.o.g(requestedModuleName, "requestedModuleName");
        return new com.tencent.mm.plugin.appbrand.launching.ja(rt6, requestedModuleName, pVar, null);
    }
}
