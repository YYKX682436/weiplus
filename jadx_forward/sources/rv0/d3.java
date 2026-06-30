package rv0;

/* loaded from: classes5.dex */
public final class d3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.o7 f481503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.r f481504e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f481505f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481506g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(rv0.o7 o7Var, ex0.r rVar, ex0.a0 a0Var, rv0.n1 n1Var) {
        super(0);
        this.f481503d = o7Var;
        this.f481504e = rVar;
        this.f481505f = a0Var;
        this.f481506g = n1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rv0.o7 o7Var = this.f481503d;
        o7Var.J();
        ex0.r rVar = this.f481504e;
        ex0.c cVar = rVar instanceof ex0.c ? (ex0.c) rVar : null;
        if (cVar != null) {
            boolean D = cVar.D();
            float C = cVar.C();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(o7Var.getContext());
            i0Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.lkp);
            i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.lkq);
            i0Var.f293354b.E = new rv0.c3(this.f481505f, this.f481506g, this.f481503d, C, D);
            i0Var.e(com.p314xaae8f345.mm.R.C30867xcad56011.apj);
            i0Var.h();
        }
        return jz5.f0.f384359a;
    }
}
