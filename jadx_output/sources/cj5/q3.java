package cj5;

/* loaded from: classes.dex */
public final class q3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.u3 f42220d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(cj5.u3 u3Var) {
        super(1);
        this.f42220d = u3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        cj5.u3 u3Var = this.f42220d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            ((android.widget.TextView) u3Var.V6().j().findViewById(android.R.id.title)).setText(com.tencent.mm.R.string.ies);
            u3Var.V6().a().setTagSelectedBG(com.tencent.mm.R.drawable.f482150b51);
            u3Var.V6().a().setTagSelectedTextColorRes(com.tencent.mm.R.color.a0c);
            u3Var.V6().j().setOnLabelContainerListener(new cj5.o3(u3Var));
            u3Var.V6().a().setCallBack(new cj5.p3(u3Var));
        }
        wi5.w wVar = (wi5.w) state.a(wi5.w.class);
        if (wVar != null) {
            cj5.u3.U6(u3Var, wVar.f446354b, wVar.f446355c);
        }
        wi5.y yVar = (wi5.y) state.a(wi5.y.class);
        if (yVar != null) {
            cj5.u3.U6(u3Var, true, yVar.f446363c);
        }
        return jz5.f0.f302826a;
    }
}
