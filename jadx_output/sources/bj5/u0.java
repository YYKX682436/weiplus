package bj5;

/* loaded from: classes.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.d1 f21238d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(bj5.d1 d1Var) {
        super(1);
        this.f21238d = d1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        bj5.d1 d1Var = this.f21238d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            d1Var.W6();
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = d1Var.P6();
            if (P6 != null) {
                P6.addIconOptionMenu(0, com.tencent.mm.R.raw.actionbar_icon_dark_more, new bj5.t0(d1Var));
            }
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof wi5.e)) {
            if (state.e()) {
                com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = d1Var.P6();
                if (P62 != null) {
                    P62.removeAllOptionMenu();
                    P62.setBackBtn(new bj5.z0(d1Var), com.tencent.mm.R.raw.actionbar_icon_dark_close);
                }
            } else {
                d1Var.W6();
            }
        }
        j75.d dVar3 = state.f298066d;
        if (dVar3 != null && (dVar3 instanceof wi5.b)) {
            if (state.e()) {
                com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P63 = d1Var.P6();
                if (P63 != null) {
                    P63.removeAllOptionMenu();
                    P63.setBackBtn(new bj5.z0(d1Var), com.tencent.mm.R.raw.actionbar_icon_dark_close);
                }
            } else {
                d1Var.W6();
            }
        }
        return jz5.f0.f302826a;
    }
}
