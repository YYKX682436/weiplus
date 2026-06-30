package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class v5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f85256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f85258f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.z6 f85259g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f85260h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.y50 f85261i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f85262m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(java.lang.String str, yz5.q qVar, com.tencent.mm.plugin.appbrand.launching.z6 z6Var, int i17, r45.y50 y50Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f85257e = str;
        this.f85258f = qVar;
        this.f85259g = z6Var;
        this.f85260h = i17;
        this.f85261i = y50Var;
        this.f85262m = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.launching.v5(this.f85257e, this.f85258f, this.f85259g, this.f85260h, this.f85261i, this.f85262m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.launching.v5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f85256d;
        com.tencent.mm.plugin.appbrand.launching.z6 z6Var = this.f85259g;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                r45.jf jfVar = new r45.jf();
                int i18 = this.f85260h;
                r45.y50 y50Var = this.f85261i;
                jfVar.f377775d.addAll(com.tencent.mm.plugin.appbrand.launching.x5.f85410a.b(z6Var));
                jfVar.f377776e = i18;
                jfVar.f377777f = y50Var;
                com.tencent.mm.plugin.appbrand.appcache.t tVar = new com.tencent.mm.plugin.appbrand.appcache.t(jfVar, this.f85257e);
                this.f85256d = 1;
                obj = rm0.h.a(tVar, 0L, null, this, 3, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            yz5.l lVar = this.f85262m;
            r45.me3[] a17 = com.tencent.mm.plugin.appbrand.launching.r4.a((r45.kf) obj, z6Var);
            kotlin.jvm.internal.o.d(a17);
            lVar.invoke(a17);
        } catch (rm0.j e17) {
            this.f85258f.invoke(new java.lang.Integer(e17.f397424e), new java.lang.Integer(e17.f397425f), e17.f397426g);
        }
        return jz5.f0.f302826a;
    }
}
