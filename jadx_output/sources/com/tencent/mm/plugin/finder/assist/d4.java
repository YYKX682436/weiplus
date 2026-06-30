package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class d4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f102080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f102082f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f102083g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(kotlin.jvm.internal.f0 f0Var, android.content.Context context, int i17, float f17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f102080d = f0Var;
        this.f102081e = context;
        this.f102082f = i17;
        this.f102083g = f17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.assist.d4(this.f102080d, this.f102081e, this.f102082f, this.f102083g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.assist.d4 d4Var = (com.tencent.mm.plugin.finder.assist.d4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        d4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f102080d.f310116d = com.tencent.mm.plugin.finder.assist.h4.f102221a.e(this.f102081e, this.f102082f, this.f102083g);
        return jz5.f0.f302826a;
    }
}
