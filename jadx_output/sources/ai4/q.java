package ai4;

/* loaded from: classes.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5189d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5189d = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ai4.q(this.f5189d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ai4.q qVar = (ai4.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        qVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.widget.Toast.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f5189d, 1).show();
        return jz5.f0.f302826a;
    }
}
