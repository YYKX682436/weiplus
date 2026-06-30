package hw2;

/* loaded from: classes5.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw2.b0 f367034d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(hw2.b0 b0Var) {
        super(0);
        this.f367034d = b0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        hw2.b0 b0Var = this.f367034d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(b0Var.f367038f);
        i0Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.csy);
        i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.f572141zu);
        i0Var.e(com.p314xaae8f345.mm.R.C30867xcad56011.f572036wx);
        hw2.x xVar = new hw2.x(b0Var);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
        aVar.F = xVar;
        aVar.E = new hw2.y(b0Var);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 a17 = i0Var.a();
        a17.setOnDismissListener(new hw2.z(b0Var));
        return a17;
    }
}
