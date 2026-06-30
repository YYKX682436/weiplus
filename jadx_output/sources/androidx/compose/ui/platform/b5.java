package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class b5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f10516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.b4 f10517e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f10518f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(n0.b4 b4Var, android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f10517e = b4Var;
        this.f10518f = view;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new androidx.compose.ui.platform.b5(this.f10517e, this.f10518f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((androidx.compose.ui.platform.b5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f10516d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        n0.b4 b4Var = this.f10517e;
        android.view.View view = this.f10518f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.f10516d = 1;
                java.lang.Object l17 = kotlinx.coroutines.flow.l.l(b4Var.f333458o, new n0.s3(null), this);
                if (l17 != aVar) {
                    l17 = f0Var;
                }
                if (l17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (androidx.compose.ui.platform.k5.b(view) == b4Var) {
                view.setTag(com.tencent.mm.R.id.f483038ux, null);
            }
            return f0Var;
        } finally {
            if (androidx.compose.ui.platform.k5.b(view) == b4Var) {
                view.setTag(com.tencent.mm.R.id.f483038ux, null);
            }
        }
    }
}
