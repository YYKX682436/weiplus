package cj5;

/* loaded from: classes.dex */
public final class q3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.u3 f123753d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(cj5.u3 u3Var) {
        super(1);
        this.f123753d = u3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        cj5.u3 u3Var = this.f123753d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            ((android.widget.TextView) u3Var.V6().j().findViewById(android.R.id.title)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.ies);
            u3Var.V6().a().m79140x4a0e4618(com.p314xaae8f345.mm.R.C30861xcebc809e.f563683b51);
            u3Var.V6().a().m79141x9bf884bd(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
            u3Var.V6().j().m80407x96033f02(new cj5.o3(u3Var));
            u3Var.V6().a().m79124x6c4032e7(new cj5.p3(u3Var));
        }
        wi5.w wVar = (wi5.w) state.a(wi5.w.class);
        if (wVar != null) {
            cj5.u3.U6(u3Var, wVar.f527887b, wVar.f527888c);
        }
        wi5.y yVar = (wi5.y) state.a(wi5.y.class);
        if (yVar != null) {
            cj5.u3.U6(u3Var, true, yVar.f527896c);
        }
        return jz5.f0.f384359a;
    }
}
