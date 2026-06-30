package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f103428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f103429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f103430f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f103431g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f103432h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f103433i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f103434m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, kotlin.jvm.internal.g0 g0Var, kotlin.jvm.internal.f0 f0Var3, kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f103429e = str;
        this.f103430f = f0Var;
        this.f103431g = f0Var2;
        this.f103432h = g0Var;
        this.f103433i = f0Var3;
        this.f103434m = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.convert.g(this.f103429e, this.f103430f, this.f103431g, this.f103432h, this.f103433i, this.f103434m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.convert.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f103428d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            i95.m c17 = i95.n0.c(bg0.v.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            this.f103428d = 1;
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            r45.q41 q41Var = new r45.q41();
            q41Var.set(2, this.f103429e);
            q41Var.set(3, pm0.b0.h(null));
            lVar.f70664a = q41Var;
            lVar.f70665b = new r45.r41();
            lVar.f70667d = 11196;
            lVar.f70666c = "/cgi-bin/micromsg-bin/findergetaigctaskresult";
            lVar.f70668e = 0;
            lVar.f70669f = 0;
            iVar.p(lVar.a());
            obj = rm0.h.b(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        this.f103430f.f310116d = ((r45.r41) fVar.f70618d).getInteger(7);
        this.f103431g.f310116d = ((r45.r41) fVar.f70618d).getInteger(6);
        this.f103432h.f310121d = ((r45.r41) fVar.f70618d).getInteger(1) * 1000;
        this.f103433i.f310116d = ((r45.r41) fVar.f70618d).getInteger(2);
        this.f103434m.f310112d = ((r45.r41) fVar.f70618d).getBoolean(3);
        return jz5.f0.f302826a;
    }
}
