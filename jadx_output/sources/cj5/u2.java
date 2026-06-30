package cj5;

/* loaded from: classes.dex */
public final class u2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.w2 f42249d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(cj5.w2 w2Var) {
        super(1);
        this.f42249d = w2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        cj5.w2 w2Var = this.f42249d;
        com.tencent.mm.view.recyclerview.WxRecyclerView k17 = w2Var.U6().k();
        kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
        com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
        if (a17 != null) {
            a17.z(new cj5.n2(state));
        }
        if (((wi5.t0) state.a(wi5.t0.class)) != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerView k18 = w2Var.U6().k();
            kotlin.jvm.internal.o.f(k18, "getSelectContactRv(...)");
            com.tencent.mm.plugin.mvvmlist.MvvmList a18 = xm3.u0.a(k18);
            if (a18 != null) {
                a18.z(new cj5.o2(state));
            }
        }
        if (((wi5.x0) state.a(wi5.x0.class)) != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerView k19 = w2Var.U6().k();
            kotlin.jvm.internal.o.f(k19, "getSelectContactRv(...)");
            com.tencent.mm.plugin.mvvmlist.MvvmList a19 = xm3.u0.a(k19);
            if (a19 != null) {
                a19.z(new cj5.p2(state));
            }
        }
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.a1)) {
            wi5.a1 a1Var = (wi5.a1) dVar;
            android.view.ViewGroup.LayoutParams layoutParams = w2Var.U6().k().getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = a1Var.f446279b;
            }
            w2Var.U6().k().setLayoutParams(layoutParams);
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof wi5.k0)) {
            com.tencent.mm.view.recyclerview.WxRecyclerView k27 = w2Var.U6().k();
            kotlin.jvm.internal.o.f(k27, "getSelectContactRv(...)");
            com.tencent.mm.plugin.mvvmlist.MvvmList a27 = xm3.u0.a(k27);
            if (a27 != null) {
                a27.z(new cj5.q2(state));
            }
        }
        j75.d dVar3 = state.f298066d;
        if (dVar3 != null && (dVar3 instanceof wi5.m0)) {
            com.tencent.mm.view.recyclerview.WxRecyclerView k28 = w2Var.U6().k();
            kotlin.jvm.internal.o.f(k28, "getSelectContactRv(...)");
            com.tencent.mm.plugin.mvvmlist.MvvmList a28 = xm3.u0.a(k28);
            if (a28 != null) {
                a28.z(new cj5.r2(state));
            }
        }
        j75.d dVar4 = state.f298066d;
        if (dVar4 != null && (dVar4 instanceof wi5.j0)) {
            com.tencent.mm.view.recyclerview.WxRecyclerView k29 = w2Var.U6().k();
            kotlin.jvm.internal.o.f(k29, "getSelectContactRv(...)");
            com.tencent.mm.plugin.mvvmlist.MvvmList a29 = xm3.u0.a(k29);
            if (a29 != null) {
                a29.z(new cj5.s2(state));
            }
        }
        j75.d dVar5 = state.f298066d;
        if (dVar5 != null && (dVar5 instanceof wi5.r)) {
            com.tencent.mm.view.recyclerview.WxRecyclerView k37 = w2Var.U6().k();
            kotlin.jvm.internal.o.f(k37, "getSelectContactRv(...)");
            com.tencent.mm.plugin.mvvmlist.MvvmList a37 = xm3.u0.a(k37);
            if (a37 != null) {
                a37.z(new cj5.t2(state));
            }
        }
        return jz5.f0.f302826a;
    }
}
