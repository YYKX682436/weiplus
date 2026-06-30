package dy4;

/* loaded from: classes15.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f326141d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(dy4.f1 f1Var) {
        super(0);
        this.f326141d = f1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ye1.e eVar;
        dy4.f1 f1Var = this.f326141d;
        f25.m0 m0Var = f1Var.Z;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.h.f340629c, new dy4.o0(f1Var));
        f1Var.Z = m96;
        if (!f1Var.f326174y0 && (eVar = f1Var.f326160n) != null) {
            eVar.mo1863x764d819b(!(m96 != null && ((g25.e) m96).f349513c));
        }
        return jz5.f0.f384359a;
    }
}
