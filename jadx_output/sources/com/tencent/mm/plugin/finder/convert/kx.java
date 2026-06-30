package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class kx extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f103871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.lx f103872e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx(com.tencent.mm.plugin.finder.convert.lx lxVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f103872e = lxVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.convert.kx(this.f103872e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((com.tencent.mm.plugin.finder.convert.kx) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f103871d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.i2 i2Var = cu2.z.f222457a;
            kotlinx.coroutines.flow.n2 n2Var = cu2.z.f222459c;
            com.tencent.mm.plugin.finder.convert.jx jxVar = new com.tencent.mm.plugin.finder.convert.jx(this.f103872e);
            this.f103871d = 1;
            if (((kotlinx.coroutines.flow.k2) n2Var).a(jxVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
