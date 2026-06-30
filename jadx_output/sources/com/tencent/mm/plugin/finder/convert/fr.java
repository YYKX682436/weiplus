package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class fr extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f103407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.kr f103408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f103409f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103410g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr(so2.u1 u1Var, com.tencent.mm.plugin.finder.convert.kr krVar, int i17, in5.s0 s0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f103407d = u1Var;
        this.f103408e = krVar;
        this.f103409f = i17;
        this.f103410g = s0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.convert.fr(this.f103407d, this.f103408e, this.f103409f, this.f103410g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.convert.fr frVar = (com.tencent.mm.plugin.finder.convert.fr) create((r45.av2) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        frVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        pm0.v.X(new com.tencent.mm.plugin.finder.convert.er(this.f103407d, this.f103408e, this.f103409f, this.f103410g));
        return jz5.f0.f302826a;
    }
}
