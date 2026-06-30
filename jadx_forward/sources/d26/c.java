package d26;

/* loaded from: classes16.dex */
public final class c extends r06.r implements d26.b {
    public final i16.r L;
    public final k16.g M;
    public final k16.k N;
    public final k16.m P;
    public final d26.z Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o06.g containingDeclaration, o06.l lVar, p06.k annotations, boolean z17, o06.c kind, i16.r proto, k16.g nameResolver, k16.k typeTable, k16.m versionRequirementTable, d26.z zVar, o06.x1 x1Var) {
        super(containingDeclaration, lVar, annotations, z17, kind, x1Var == null ? o06.x1.f423537a : x1Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containingDeclaration, "containingDeclaration");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotations, "annotations");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameResolver, "nameResolver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeTable, "typeTable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(versionRequirementTable, "versionRequirementTable");
        this.L = proto;
        this.M = nameResolver;
        this.N = typeTable;
        this.P = versionRequirementTable;
        this.Q = zVar;
    }

    @Override // d26.a0
    public p16.h0 E() {
        return this.L;
    }

    @Override // r06.r, r06.j0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public d26.c u0(o06.m newOwner, o06.n0 n0Var, o06.c kind, n16.g gVar, p06.k annotations, o06.x1 source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newOwner, "newOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotations, "annotations");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        d26.c cVar = new d26.c((o06.g) newOwner, (o06.l) n0Var, annotations, this.K, kind, this.L, this.M, this.N, this.P, this.Q, source);
        cVar.C = this.C;
        return cVar;
    }

    @Override // d26.a0
    public k16.g X() {
        return this.M;
    }

    @Override // d26.a0
    public d26.z Y() {
        return this.Q;
    }

    @Override // r06.j0, o06.r0
    /* renamed from: isExternal */
    public boolean mo123388x64310b15() {
        return false;
    }

    @Override // r06.j0, o06.n0
    /* renamed from: isInline */
    public boolean mo123389xe19a9463() {
        return false;
    }

    @Override // r06.j0, o06.n0
    /* renamed from: isSuspend */
    public boolean mo123390x6f0de7b2() {
        return false;
    }

    @Override // r06.j0, o06.n0
    public boolean r() {
        return false;
    }

    @Override // d26.a0
    public k16.k t() {
        return this.N;
    }
}
