package mz0;

/* loaded from: classes5.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414559d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(mz0.b2 b2Var) {
        super(0);
        this.f414559d = b2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        kz0.a aVar = kz0.a.f395180o;
        mz0.b2 b2Var = this.f414559d;
        java.lang.Integer num = (java.lang.Integer) ((java.util.Map) b2Var.H.mo141623x754a37bb()).get(aVar);
        int intValue = num != null ? num.intValue() : 0;
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.e0();
        gv3.d dVar = new gv3.d(b2Var.m80379x76847179(), (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2008xb118f8f1.C17067x215f5d9e) ((zy0.e) ((dz0.f) b2Var.G.mo141623x754a37bb())).f558854j.mo141623x754a37bb(), mz0.b2.O6(b2Var) + intValue);
        uu3.u uVar = dVar.f304104f;
        if (uVar != null) {
            uVar.m68124x155a744d(300L);
        }
        dVar.f304110m = new mz0.p0(intValue, e0Var, b2Var);
        return dVar;
    }
}
