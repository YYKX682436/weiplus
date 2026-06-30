package d26;

/* loaded from: classes16.dex */
public final class n0 extends r06.f1 implements d26.b {
    public final i16.u0 H;
    public final k16.g I;

    /* renamed from: J, reason: collision with root package name */
    public final k16.k f307566J;
    public final k16.m K;
    public final d26.z L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o06.m containingDeclaration, o06.o1 o1Var, p06.k annotations, o06.t0 modality, o06.g0 visibility, boolean z17, n16.g name, o06.c kind, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29, i16.u0 proto, k16.g nameResolver, k16.k typeTable, k16.m versionRequirementTable, d26.z zVar) {
        super(containingDeclaration, o1Var, annotations, modality, visibility, z17, name, kind, o06.x1.f423537a, z18, z19, z29, false, z27, z28);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containingDeclaration, "containingDeclaration");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotations, "annotations");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modality, "modality");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibility, "visibility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameResolver, "nameResolver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeTable, "typeTable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(versionRequirementTable, "versionRequirementTable");
        this.H = proto;
        this.I = nameResolver;
        this.f307566J = typeTable;
        this.K = versionRequirementTable;
        this.L = zVar;
    }

    @Override // d26.a0
    public p16.h0 E() {
        return this.H;
    }

    @Override // d26.a0
    public k16.g X() {
        return this.I;
    }

    @Override // d26.a0
    public d26.z Y() {
        return this.L;
    }

    @Override // r06.f1, o06.r0
    /* renamed from: isExternal */
    public boolean mo123388x64310b15() {
        java.lang.Boolean c17 = k16.f.E.c(this.H.f369296g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "get(...)");
        return c17.booleanValue();
    }

    @Override // d26.a0
    public k16.k t() {
        return this.f307566J;
    }

    @Override // r06.f1
    public r06.f1 w0(o06.m newOwner, o06.t0 newModality, o06.g0 newVisibility, o06.o1 o1Var, o06.c kind, n16.g newName, o06.x1 source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newOwner, "newOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newModality, "newModality");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newVisibility, "newVisibility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newName, "newName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        return new d26.n0(newOwner, o1Var, mo9601xa083c1ee(), newModality, newVisibility, this.f450073i, newName, kind, this.f449947t, this.f449948u, mo123388x64310b15(), this.f449952y, this.f449949v, this.H, this.I, this.f307566J, this.K, this.L);
    }
}
