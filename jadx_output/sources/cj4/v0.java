package cj4;

/* loaded from: classes3.dex */
public final class v0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f42041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f42042e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(kotlin.jvm.internal.h0 h0Var, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f42041d = h0Var;
        this.f42042e = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cj4.v0(this.f42041d, this.f42042e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        cj4.v0 v0Var = (cj4.v0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        v0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f42041d.f310123d = db5.e1.Q(this.f42042e, "处理中...", "", false, false, cj4.u0.f42039d);
        return jz5.f0.f302826a;
    }
}
