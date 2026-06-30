package aq;

/* loaded from: classes4.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.QueryImageData f12931d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.tencent.mm.api.QueryImageData queryImageData, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f12931d = queryImageData;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aq.p0(this.f12931d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        aq.p0 p0Var = (aq.p0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        p0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.storage.s8 s8Var = com.tencent.mm.storage.s8.f195314a;
        com.tencent.mm.api.QueryImageData image = this.f12931d;
        kotlin.jvm.internal.o.f(image, "$image");
        s8Var.k(image, aq.o.f12921b);
        return jz5.f0.f302826a;
    }
}
