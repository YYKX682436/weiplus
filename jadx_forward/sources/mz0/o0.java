package mz0;

/* loaded from: classes5.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414545d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(mz0.b2 b2Var) {
        super(0);
        this.f414545d = b2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mz0.b2 b2Var = this.f414545d;
        android.app.Activity context = b2Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        android.app.Activity context2 = b2Var.m80379x76847179();
        mz0.k0 k0Var = new mz0.k0(b2Var);
        mz0.l0 l0Var = new mz0.l0(b2Var);
        mz0.m0 m0Var = new mz0.m0(b2Var);
        mz0.n0 n0Var = new mz0.n0(b2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a Z6 = b2Var.Z6();
        yz5.q k76 = b2Var.k7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        return new zy0.e(context2, k0Var, l0Var, m0Var, n0Var, Z6, k76);
    }
}
