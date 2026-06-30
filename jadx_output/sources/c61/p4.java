package c61;

/* loaded from: classes.dex */
public final class p4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f39221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f39222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f39223f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(kotlin.jvm.internal.h0 h0Var, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f39222e = h0Var;
        this.f39223f = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c61.p4(this.f39222e, this.f39223f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((c61.p4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f39221d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f39221d = 1;
            if (kotlinx.coroutines.k1.b(100L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlin.jvm.internal.h0 h0Var = this.f39222e;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) h0Var.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        android.content.Context context = this.f39223f;
        h0Var.f310123d = com.tencent.mm.ui.widget.dialog.u3.f(context, context.getResources().getString(com.tencent.mm.R.string.ggc), false, 0, null);
        return jz5.f0.f302826a;
    }
}
