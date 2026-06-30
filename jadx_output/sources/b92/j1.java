package b92;

/* loaded from: classes10.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b92.v1 f18443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f18444e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(b92.v1 v1Var, kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f18443d = v1Var;
        this.f18444e = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new b92.j1(this.f18443d, this.f18444e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b92.j1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.jvm.internal.h0 h0Var = this.f18444e;
        java.lang.String str = (java.lang.String) h0Var.f310123d;
        b92.v1 v1Var = this.f18443d;
        java.lang.String wi6 = b92.v1.wi(v1Var, str, "getIPUrl");
        if (!(wi6.length() == 0)) {
            return wi6;
        }
        java.lang.String str2 = (java.lang.String) v1Var.f18525g.get(h0Var.f310123d);
        if (str2 == null) {
            str2 = "";
        }
        return str2;
    }
}
