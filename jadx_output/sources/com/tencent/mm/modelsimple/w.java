package com.tencent.mm.modelsimple;

/* loaded from: classes2.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f71440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.r f71441e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(yz5.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f71441e = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.modelsimple.w(this.f71441e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.modelsimple.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f71440d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.cn3 cn3Var = new r45.cn3();
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 866;
            lVar.f70666c = "/cgi-bin/micromsg-bin/getremind";
            lVar.f70664a = cn3Var;
            lVar.f70665b = new r45.dn3();
            com.tencent.mm.modelbase.o a17 = lVar.a();
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            iVar.p(a17);
            this.f71440d = 1;
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
        yz5.r rVar = this.f71441e;
        if (rVar != null) {
            rVar.C(new java.lang.Integer(fVar.f70615a), new java.lang.Integer(fVar.f70616b), fVar.f70617c, (fVar.f70615a == 0 && fVar.f70616b == 0) ? ((r45.dn3) fVar.f70618d).f372594d : null);
        }
        return jz5.f0.f302826a;
    }
}
