package cj5;

/* loaded from: classes.dex */
public final class a5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.c5 f42069d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(cj5.c5 c5Var) {
        super(1);
        this.f42069d = c5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        androidx.lifecycle.g0 g0Var;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        cj5.c5 c5Var = this.f42069d;
        com.tencent.mm.view.recyclerview.WxRecyclerView k17 = c5Var.T6().k();
        kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
        com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
        if (a17 != null && (g0Var = a17.f152071u) != null) {
            g0Var.observe(c5Var.getActivity(), new cj5.z4(c5Var));
        }
        return jz5.f0.f302826a;
    }
}
