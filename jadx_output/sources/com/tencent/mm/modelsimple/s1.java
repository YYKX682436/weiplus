package com.tencent.mm.modelsimple;

/* loaded from: classes2.dex */
public final class s1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f71410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f71411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.lo5 f71412f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.r f71413g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(int i17, r45.lo5 lo5Var, yz5.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f71411e = i17;
        this.f71412f = lo5Var;
        this.f71413g = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.modelsimple.s1(this.f71411e, this.f71412f, this.f71413g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.modelsimple.s1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f71410d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.e26 e26Var = new r45.e26();
            int i18 = this.f71411e;
            if (i18 == 0) {
                i18 = 1;
            }
            e26Var.f372930d = i18;
            e26Var.f372931e = this.f71412f;
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 525;
            lVar.f70666c = "/cgi-bin/micromsg-bin/setmsgremind";
            lVar.f70664a = e26Var;
            lVar.f70665b = new r45.f26();
            com.tencent.mm.modelbase.o a17 = lVar.a();
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            iVar.p(a17);
            this.f71410d = 1;
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
        yz5.r rVar = this.f71413g;
        if (rVar != null) {
            rVar.C(new java.lang.Integer(fVar.f70615a), new java.lang.Integer(fVar.f70616b), fVar.f70617c, ((r45.f26) fVar.f70618d).f373954d);
        }
        return jz5.f0.f302826a;
    }
}
