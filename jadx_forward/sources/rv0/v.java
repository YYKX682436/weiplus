package rv0;

/* loaded from: classes5.dex */
public final class v implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.j f481816e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f481817f;

    public v(rv0.n1 n1Var, rv0.j jVar, ex0.a0 a0Var) {
        this.f481815d = n1Var;
        this.f481816e = jVar;
        this.f481817f = a0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4132xa482ea73 k17;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78;
        cx0.f fVar = (cx0.f) obj;
        if (fVar == null) {
            return;
        }
        rv0.n1 n1Var = this.f481815d;
        int width = n1Var.r7().getWidth();
        rv0.j jVar = this.f481816e;
        ex0.a0 a0Var = this.f481817f;
        if (width > 0) {
            n1Var.p7().n7();
            n1Var.r7().a();
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817.l(n1Var.r7(), fVar.f306053c, false, 2, null);
            n1Var.x7();
            jVar.J(a0Var.y());
            jVar.F();
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e m17 = a0Var.f338625b.f129947a.m();
        if (m17 != null) {
            m17.N1();
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e m18 = a0Var.f338625b.f129947a.m();
        if (m18 != null && (c3971x241f78 = m18.f130065a) != null) {
            ((gx0.p9) ((jz5.n) n1Var.f481661p).mo141623x754a37bb()).k7(c3971x241f78);
        }
        ex0.a0 s76 = n1Var.s7();
        if (s76 == null || (c4167x88133861 = s76.f338625b) == null || (k17 = c4167x88133861.k()) == null) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.c cVar = k17.f129895a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cVar, "getAspectRatioType(...)");
        yw0.p pVar = (yw0.p) n1Var.o7().f2().b(yw0.q.f548118h);
        pVar.f548113c = yw0.o.f548110e;
        ((yw0.l) pVar.f548120a).a();
        yw0.n f27 = n1Var.o7().f2();
        rv0.u uVar = new rv0.u(n1Var, k17, jVar, cVar);
        f27.getClass();
        f27.f548104a.post(new yw0.m(uVar));
    }
}
