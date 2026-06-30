package cj5;

/* loaded from: classes.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f42242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f42243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cj5.a0 f42244f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wi5.o f42245g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(wi5.n0 n0Var, kotlin.jvm.internal.h0 h0Var, cj5.a0 a0Var, wi5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f42242d = n0Var;
        this.f42243e = h0Var;
        this.f42244f = a0Var;
        this.f42245g = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cj5.u(this.f42242d, this.f42243e, this.f42244f, this.f42245g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        cj5.u uVar = (cj5.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        uVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        wi5.n0 n0Var = this.f42242d;
        boolean e17 = n0Var.e();
        wi5.o oVar = this.f42245g;
        kotlin.jvm.internal.h0 h0Var = this.f42243e;
        if (e17) {
            android.view.View view = (android.view.View) h0Var.f310123d;
            if (view != null) {
                oVar.f446331b.invoke(view);
            }
            h0Var.f310123d = null;
        } else {
            cj5.a0 a0Var = this.f42244f;
            android.view.View inflate = com.tencent.mm.ui.id.b(a0Var.getActivity()).inflate(com.tencent.mm.R.layout.f488157ip, (android.view.ViewGroup) oVar.f446332c, false);
            inflate.setOnClickListener(new cj5.t(a0Var, n0Var));
            oVar.f446331b.invoke(inflate);
            h0Var.f310123d = inflate;
        }
        return jz5.f0.f302826a;
    }
}
