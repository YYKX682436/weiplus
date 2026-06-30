package i06;

/* loaded from: classes15.dex */
public final class q2 extends i06.u1 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Class f368261e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f368262f;

    public q2(java.lang.Class jClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jClass, "jClass");
        this.f368261e = jClass;
        this.f368262f = jz5.h.a(jz5.i.f384363e, new i06.o2(this));
    }

    /* renamed from: equals */
    public boolean m134393xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof i06.q2) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368261e, ((i06.q2) obj).f368261e)) {
                return true;
            }
        }
        return false;
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.f
    public java.lang.Class f() {
        return this.f368261e;
    }

    /* renamed from: hashCode */
    public int m134394x8cdac1b() {
        return this.f368261e.hashCode();
    }

    @Override // i06.u1
    public java.util.Collection k() {
        return kz5.p0.f395529d;
    }

    @Override // i06.u1
    public java.util.Collection l(n16.g name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        i06.n2 n2Var = (i06.n2) this.f368262f.mo141623x754a37bb();
        n2Var.getClass();
        f06.v vVar = i06.n2.f368233g[1];
        java.lang.Object mo152xb9724478 = n2Var.f368235d.mo152xb9724478();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo152xb9724478, "getValue(...)");
        return ((y16.s) mo152xb9724478).b(name, w06.d.f523480e);
    }

    @Override // i06.u1
    public o06.o1 m(int i17) {
        jz5.o oVar = (jz5.o) ((i06.n2) this.f368262f.mo141623x754a37bb()).f368237f.mo141623x754a37bb();
        if (oVar == null) {
            return null;
        }
        m16.h hVar = (m16.h) oVar.f384374d;
        i16.o0 o0Var = (i16.o0) oVar.f384375e;
        m16.g gVar = (m16.g) oVar.f384376f;
        p16.u packageLocalVariable = l16.r.f396638n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(packageLocalVariable, "packageLocalVariable");
        i16.u0 u0Var = (i16.u0) k16.i.b(o0Var, packageLocalVariable, i17);
        if (u0Var == null) {
            return null;
        }
        java.lang.Class cls = this.f368261e;
        i16.v1 v1Var = o0Var.f369199m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(v1Var, "getTypeTable(...)");
        return (o06.o1) i06.o4.f(cls, u0Var, hVar, new k16.k(v1Var), gVar, i06.p2.f368254d);
    }

    @Override // i06.u1
    public java.lang.Class o() {
        java.lang.Class cls = (java.lang.Class) ((i06.n2) this.f368262f.mo141623x754a37bb()).f368236e.mo141623x754a37bb();
        return cls == null ? this.f368261e : cls;
    }

    @Override // i06.u1
    public java.util.Collection p(n16.g name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        i06.n2 n2Var = (i06.n2) this.f368262f.mo141623x754a37bb();
        n2Var.getClass();
        f06.v vVar = i06.n2.f368233g[1];
        java.lang.Object mo152xb9724478 = n2Var.f368235d.mo152xb9724478();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo152xb9724478, "getValue(...)");
        return ((y16.s) mo152xb9724478).c(name, w06.d.f523480e);
    }

    /* renamed from: toString */
    public java.lang.String m134395x9616526c() {
        return "file class " + u06.i.a(this.f368261e).b();
    }
}
