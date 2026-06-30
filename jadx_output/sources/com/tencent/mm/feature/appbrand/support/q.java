package com.tencent.mm.feature.appbrand.support;

/* loaded from: classes7.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f65101d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f65102e;

    /* renamed from: f, reason: collision with root package name */
    public int f65103f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ft.b f65104g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.event.StartActivityFromAppBrandEvent f65105h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f65106i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ft.b bVar, com.tencent.mm.plugin.appbrand.event.StartActivityFromAppBrandEvent startActivityFromAppBrandEvent, kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f65104g = bVar;
        this.f65105h = startActivityFromAppBrandEvent;
        this.f65106i = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.feature.appbrand.support.q(this.f65104g, this.f65105h, this.f65106i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.feature.appbrand.support.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f65103f;
        kotlin.jvm.internal.c0 c0Var = this.f65106i;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ft.b bVar = this.f65104g;
            boolean b17 = kotlin.jvm.internal.o.b(bVar.getF65038d(), com.tencent.mm.sdk.platformtools.x2.f193072b);
            com.tencent.mm.plugin.appbrand.event.StartActivityFromAppBrandEvent startActivityFromAppBrandEvent = this.f65105h;
            if (b17) {
                startActivityFromAppBrandEvent.e();
                if (startActivityFromAppBrandEvent.f78016h) {
                    c0Var.f310112d = true;
                }
            } else if (bVar.a()) {
                this.f65101d = bVar;
                this.f65102e = startActivityFromAppBrandEvent;
                this.f65103f = 1;
                oz5.n nVar = new oz5.n(pz5.f.b(this));
                java.lang.String f65038d = bVar.getF65038d();
                kotlin.jvm.internal.o.f(f65038d, "processName(...)");
                com.tencent.mm.ipcinvoker.f.a(f65038d, new com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper.SafeParcelableWrapper(startActivityFromAppBrandEvent), com.tencent.mm.feature.appbrand.support.o.f65096d, new com.tencent.mm.feature.appbrand.support.p(nVar));
                obj = nVar.a();
                if (obj == aVar) {
                    return aVar;
                }
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (((com.tencent.mm.ipcinvoker.type.IPCBoolean) obj).f68400d) {
            c0Var.f310112d = true;
        }
        return jz5.f0.f302826a;
    }
}
