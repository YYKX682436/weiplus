package l26;

/* loaded from: classes16.dex */
public final class t implements l26.i {

    /* renamed from: a, reason: collision with root package name */
    public static final l26.t f396807a = new l26.t();

    @Override // l26.i
    public java.lang.String a(o06.n0 n0Var) {
        return l26.h.a(this, n0Var);
    }

    @Override // l26.i
    public boolean b(o06.n0 functionDescriptor) {
        f26.z0 c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(functionDescriptor, "functionDescriptor");
        o06.p pVar = (o06.l2) functionDescriptor.W().get(1);
        l06.t tVar = l06.v.f396443d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pVar);
        o06.v0 j17 = v16.f.j(pVar);
        tVar.getClass();
        o06.g a17 = o06.l0.a(j17, l06.w.R);
        if (a17 == null) {
            c17 = null;
        } else {
            f26.r1.f340747e.getClass();
            f26.r1 r1Var = f26.r1.f340748f;
            java.util.List mo9613x99879e0 = a17.g().mo9613x99879e0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo9613x99879e0, "getParameters(...)");
            java.lang.Object z07 = kz5.n0.z0(mo9613x99879e0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z07, "single(...)");
            c17 = f26.r0.c(r1Var, a17, kz5.b0.c(new f26.g1((o06.e2) z07)));
        }
        if (c17 == null) {
            return false;
        }
        f26.o0 mo132802xfb85f7b0 = ((r06.t1) pVar).mo132802xfb85f7b0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132802xfb85f7b0, "getType(...)");
        f26.o0 h17 = f26.z2.h(mo132802xfb85f7b0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "makeNotNullable(...)");
        return j26.c.i(c17, h17);
    }

    @Override // l26.i
    /* renamed from: getDescription */
    public java.lang.String mo144943x730bcac6() {
        return "second parameter must be of type KProperty<*> or its supertype";
    }
}
