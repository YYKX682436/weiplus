package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class m5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f10661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.WrappedComposition f10662e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(androidx.compose.ui.platform.WrappedComposition wrappedComposition, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f10662e = wrappedComposition;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new androidx.compose.ui.platform.m5(this.f10662e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((androidx.compose.ui.platform.m5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f10661d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.ui.platform.AndroidComposeView androidComposeView = this.f10662e.f10496d;
            this.f10661d = 1;
            java.lang.Object a17 = androidComposeView.f10471r.a(this);
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
