package d26;

/* loaded from: classes16.dex */
public final class o0 extends r06.j1 implements d26.b {
    public final i16.j0 K;
    public final k16.g L;
    public final k16.k M;
    public final k16.m N;
    public final d26.z P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(o06.m containingDeclaration, o06.v1 v1Var, p06.k annotations, n16.g name, o06.c kind, i16.j0 proto, k16.g nameResolver, k16.k typeTable, k16.m versionRequirementTable, d26.z zVar, o06.x1 x1Var) {
        super(containingDeclaration, v1Var, annotations, name, kind, x1Var == null ? o06.x1.f423537a : x1Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containingDeclaration, "containingDeclaration");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotations, "annotations");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameResolver, "nameResolver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeTable, "typeTable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(versionRequirementTable, "versionRequirementTable");
        this.K = proto;
        this.L = nameResolver;
        this.M = typeTable;
        this.N = versionRequirementTable;
        this.P = zVar;
    }

    @Override // d26.a0
    public p16.h0 E() {
        return this.K;
    }

    @Override // d26.a0
    public k16.g X() {
        return this.L;
    }

    @Override // d26.a0
    public d26.z Y() {
        return this.P;
    }

    @Override // d26.a0
    public k16.k t() {
        return this.M;
    }

    @Override // r06.j1, r06.j0
    public r06.j0 u0(o06.m newOwner, o06.n0 n0Var, o06.c kind, n16.g gVar, p06.k annotations, o06.x1 source) {
        n16.g gVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newOwner, "newOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotations, "annotations");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        o06.v1 v1Var = (o06.v1) n0Var;
        if (gVar == null) {
            n16.g mo132800xfb82e301 = mo132800xfb82e301();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132800xfb82e301, "getName(...)");
            gVar2 = mo132800xfb82e301;
        } else {
            gVar2 = gVar;
        }
        d26.o0 o0Var = new d26.o0(newOwner, v1Var, annotations, gVar2, kind, this.K, this.L, this.M, this.N, this.P, source);
        o0Var.C = this.C;
        return o0Var;
    }
}
