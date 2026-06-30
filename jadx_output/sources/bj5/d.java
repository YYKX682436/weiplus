package bj5;

/* loaded from: classes.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f21173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f21174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bj5.n f21175f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wi5.o f21176g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(wi5.n0 n0Var, kotlin.jvm.internal.h0 h0Var, bj5.n nVar, wi5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f21173d = n0Var;
        this.f21174e = h0Var;
        this.f21175f = nVar;
        this.f21176g = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bj5.d(this.f21173d, this.f21174e, this.f21175f, this.f21176g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bj5.d dVar = (bj5.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        wi5.n0 n0Var = this.f21173d;
        boolean e17 = n0Var.e();
        wi5.o oVar = this.f21176g;
        kotlin.jvm.internal.h0 h0Var = this.f21174e;
        if (e17) {
            android.view.View view = (android.view.View) h0Var.f310123d;
            if (view != null) {
                oVar.f446331b.invoke(view);
            }
            h0Var.f310123d = null;
        } else {
            bj5.n nVar = this.f21175f;
            android.view.View inflate = com.tencent.mm.ui.id.b(nVar.getActivity()).inflate(com.tencent.mm.R.layout.f488157ip, (android.view.ViewGroup) oVar.f446332c, false);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.v2a);
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            inflate.setOnClickListener(new bj5.c(nVar, n0Var));
            oVar.f446331b.invoke(inflate);
            h0Var.f310123d = inflate;
        }
        return jz5.f0.f302826a;
    }
}
