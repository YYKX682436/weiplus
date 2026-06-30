package r06;

/* loaded from: classes16.dex */
public final class o1 extends r06.j0 implements r06.l1 {
    public static final r06.m1 N;
    public final e26.c0 K;
    public final o06.d2 L;
    public o06.f M;

    static {
        p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(r06.o1.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"));
        N = new r06.m1(null);
    }

    public o1(e26.c0 c0Var, o06.d2 d2Var, o06.f fVar, r06.l1 l1Var, p06.k kVar, o06.c cVar, o06.x1 x1Var) {
        super(d2Var, l1Var, kVar, n16.i.f415710e, cVar, x1Var);
        this.K = c0Var;
        this.L = d2Var;
        d2Var.getClass();
        this.f450005y = false;
        ((e26.u) c0Var).e(new r06.n1(this, fVar));
        this.M = fVar;
    }

    @Override // o06.l
    public o06.g D() {
        o06.g D = ((r06.r) this.M).D();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D, "getConstructedClass(...)");
        return D;
    }

    @Override // r06.w
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public r06.l1 a() {
        o06.n0 a17 = super.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(a17, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (r06.l1) a17;
    }

    @Override // r06.j0, o06.a2
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public r06.l1 d(f26.v2 substitutor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(substitutor, "substitutor");
        o06.n0 d17 = super.d(substitutor);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(d17, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        r06.o1 o1Var = (r06.o1) d17;
        f26.o0 o0Var = o1Var.f449993m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o0Var);
        o06.f d18 = ((r06.r) ((r06.r) this.M).a()).d(f26.v2.d(o0Var));
        if (d18 == null) {
            return null;
        }
        o1Var.M = d18;
        return o1Var;
    }

    @Override // o06.d
    public o06.d H(o06.m newOwner, o06.t0 modality, o06.g0 visibility, o06.c kind, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newOwner, "newOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modality, "modality");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibility, "visibility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        r06.i0 i0Var = (r06.i0) O();
        i0Var.f(newOwner);
        i0Var.n(modality);
        i0Var.h(visibility);
        i0Var.k(kind);
        i0Var.e(z17);
        o06.n0 mo132797x59bc66e = i0Var.mo132797x59bc66e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo132797x59bc66e, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (r06.l1) mo132797x59bc66e;
    }

    @Override // r06.w, o06.m
    public o06.k e() {
        return this.L;
    }

    @Override // r06.j0, o06.b
    /* renamed from: getReturnType */
    public f26.o0 mo132801x3df4e080() {
        f26.o0 o0Var = this.f449993m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o0Var);
        return o0Var;
    }

    @Override // o06.l
    /* renamed from: isPrimary */
    public boolean mo150370xcaae5578() {
        return ((r06.r) this.M).K;
    }

    @Override // r06.j0
    public r06.j0 u0(o06.m newOwner, o06.n0 n0Var, o06.c kind, n16.g gVar, p06.k annotations, o06.x1 source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newOwner, "newOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotations, "annotations");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        return new r06.o1(this.K, this.L, this.M, this, annotations, o06.c.DECLARATION, source);
    }

    @Override // r06.w, o06.m
    public o06.m e() {
        return this.L;
    }
}
