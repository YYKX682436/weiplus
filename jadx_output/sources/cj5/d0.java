package cj5;

/* loaded from: classes.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f42090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.o f42091e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(kotlin.jvm.internal.h0 h0Var, wi5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f42090d = h0Var;
        this.f42091e = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cj5.d0(this.f42090d, this.f42091e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        cj5.d0 d0Var = (cj5.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        d0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.jvm.internal.h0 h0Var = this.f42090d;
        android.view.View view = (android.view.View) h0Var.f310123d;
        if (view != null) {
            this.f42091e.f446331b.invoke(view);
        }
        h0Var.f310123d = null;
        return jz5.f0.f302826a;
    }
}
