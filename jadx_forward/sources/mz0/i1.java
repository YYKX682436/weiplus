package mz0;

/* loaded from: classes5.dex */
public final class i1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414502d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(mz0.b2 b2Var) {
        super(0);
        this.f414502d = b2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mz0.b2 b2Var = this.f414502d;
        b2Var.f7().dismiss();
        db5.t7.g(b2Var.m80379x76847179(), b2Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.gvm));
        b2Var.B7(4);
        b2Var.m80379x76847179().setResult(0);
        b2Var.m80379x76847179().finish();
        return jz5.f0.f384359a;
    }
}
