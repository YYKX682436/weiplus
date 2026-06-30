package bg2;

/* loaded from: classes2.dex */
public final class n5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f20333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.o5 f20334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f20335f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f20336g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(bg2.o5 o5Var, android.view.View view, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20334e = o5Var;
        this.f20335f = view;
        this.f20336g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.n5(this.f20334e, this.f20335f, this.f20336g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.n5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f20333d;
        bg2.o5 o5Var = this.f20334e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.pg6 pg6Var = o5Var.f20366i;
            boolean z17 = false;
            if (pg6Var != null && !pg6Var.getBoolean(1)) {
                z17 = true;
            }
            if (z17) {
                if (this.f20335f.getVisibility() != 0 || this.f20336g) {
                    this.f20333d = 1;
                    if (kotlinx.coroutines.k1.b(200L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    android.view.ViewGroup viewGroup = o5Var.f20364g;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(8);
                    }
                }
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Integer num = o5Var.f20368n;
        if (num != null) {
            int intValue = num.intValue();
            android.view.ViewGroup viewGroup2 = o5Var.f20364g;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(intValue);
            }
        }
        return jz5.f0.f302826a;
    }
}
