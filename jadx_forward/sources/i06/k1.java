package i06;

/* loaded from: classes15.dex */
public final class k1 extends i06.u1 implements f06.d, i06.l1, i06.z3 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f368212g = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Class f368213e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f368214f;

    public k1(java.lang.Class jClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jClass, "jClass");
        this.f368213e = jClass;
        this.f368214f = jz5.h.a(jz5.i.f384363e, new i06.i1(this));
    }

    @Override // f06.d
    public java.util.List a() {
        i06.f1 f1Var = (i06.f1) this.f368214f.mo141623x754a37bb();
        f1Var.getClass();
        f06.v vVar = i06.f1.f368165o[7];
        java.lang.Object mo152xb9724478 = f1Var.f368169f.mo152xb9724478();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo152xb9724478, "getValue(...)");
        return (java.util.List) mo152xb9724478;
    }

    @Override // f06.d
    public java.lang.String d() {
        i06.f1 f1Var = (i06.f1) this.f368214f.mo141623x754a37bb();
        f1Var.getClass();
        f06.v vVar = i06.f1.f368165o[3];
        return (java.lang.String) f1Var.f368168e.mo152xb9724478();
    }

    @Override // f06.d
    public java.util.Collection e() {
        i06.f1 f1Var = (i06.f1) this.f368214f.mo141623x754a37bb();
        f1Var.getClass();
        f06.v vVar = i06.f1.f368165o[16];
        java.lang.Object mo152xb9724478 = f1Var.f368177n.mo152xb9724478();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo152xb9724478, "getValue(...)");
        return (java.util.Collection) mo152xb9724478;
    }

    /* renamed from: equals */
    public boolean m134366xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof i06.k1) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xz5.a.c(this), xz5.a.c((f06.d) obj));
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.f
    public java.lang.Class f() {
        return this.f368213e;
    }

    @Override // f06.d
    public java.lang.String g() {
        i06.f1 f1Var = (i06.f1) this.f368214f.mo141623x754a37bb();
        f1Var.getClass();
        f06.v vVar = i06.f1.f368165o[2];
        return (java.lang.String) f1Var.f368167d.mo152xb9724478();
    }

    /* renamed from: hashCode */
    public int m134367x8cdac1b() {
        return xz5.a.c(this).hashCode();
    }

    @Override // f06.d
    /* renamed from: isAbstract */
    public boolean mo128644x3801976c() {
        return h().f() == o06.t0.f423521h;
    }

    @Override // i06.u1
    public java.util.Collection k() {
        o06.g h17 = h();
        if (h17.j() == o06.h.f423494e || h17.j() == o06.h.f423498i) {
            return kz5.p0.f395529d;
        }
        java.util.Collection S = h17.S();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(S, "getConstructors(...)");
        return S;
    }

    @Override // i06.u1
    public java.util.Collection l(n16.g name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        y16.s x17 = x();
        w06.d dVar = w06.d.f523480e;
        return kz5.n0.t0(x17.b(name, dVar), y().b(name, dVar));
    }

    @Override // i06.u1
    public o06.o1 m(int i17) {
        java.lang.Class<?> declaringClass;
        java.lang.Class cls = this.f368213e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls.getSimpleName(), "DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            f06.d a17 = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(declaringClass);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(a17, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((i06.k1) a17).m(i17);
        }
        o06.g h17 = h();
        d26.x xVar = h17 instanceof d26.x ? (d26.x) h17 : null;
        if (xVar == null) {
            return null;
        }
        p16.u classLocalVariable = l16.r.f396634j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(classLocalVariable, "classLocalVariable");
        i16.u0 u0Var = (i16.u0) k16.i.b(xVar.f307586h, classLocalVariable, i17);
        if (u0Var == null) {
            return null;
        }
        java.lang.Class cls2 = this.f368213e;
        b26.t tVar = xVar.f307593r;
        return (o06.o1) i06.o4.f(cls2, u0Var, tVar.f99049b, tVar.f99051d, xVar.f307587i, i06.j1.f368199d);
    }

    @Override // i06.u1
    public java.util.Collection p(n16.g name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        y16.s x17 = x();
        w06.d dVar = w06.d.f523480e;
        return kz5.n0.t0(x17.c(name, dVar), y().c(name, dVar));
    }

    /* renamed from: toString */
    public java.lang.String m134368x9616526c() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("class ");
        n16.b v17 = v();
        n16.c h17 = v17.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getPackageFqName(...)");
        if (h17.d()) {
            str = "";
        } else {
            str = h17.b() + '.';
        }
        java.lang.String b17 = v17.i().b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "asString(...)");
        sb6.append(str + r26.i0.u(b17, '.', '$', false, 4, null));
        return sb6.toString();
    }

    public final o06.g u(n16.b bVar, t06.k kVar) {
        o06.v0 v0Var = kVar.f496075a.f99017b;
        n16.c h17 = bVar.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getPackageFqName(...)");
        r06.y yVar = new r06.y(v0Var, h17);
        n16.g j17 = bVar.j();
        o06.t0 t0Var = o06.t0.f423518e;
        o06.h hVar = o06.h.f423493d;
        b26.q qVar = kVar.f496075a;
        r06.t tVar = new r06.t(yVar, j17, t0Var, hVar, kz5.b0.c(qVar.f99017b.h().k("Any").k()), o06.x1.f423537a, false, qVar.f99016a);
        tVar.u0(new i06.h1(tVar, qVar.f99016a), kz5.r0.f395535d, null);
        return tVar;
    }

    public final n16.b v() {
        l06.r i17;
        i06.k4 k4Var = i06.k4.f368219a;
        java.lang.Class klass = this.f368213e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(klass, "klass");
        if (klass.isArray()) {
            java.lang.Class<?> componentType = klass.getComponentType();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(componentType, "getComponentType(...)");
            i17 = componentType.isPrimitive() ? w16.e.b(componentType.getSimpleName()).i() : null;
            return i17 != null ? new n16.b(l06.x.f396489k, i17.f396439e) : n16.b.l(l06.w.f396460h.h());
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(klass, java.lang.Void.TYPE)) {
            return i06.k4.f368220b;
        }
        i17 = klass.isPrimitive() ? w16.e.b(klass.getSimpleName()).i() : null;
        if (i17 != null) {
            return new n16.b(l06.x.f396489k, i17.f396438d);
        }
        n16.b a17 = u06.i.a(klass);
        if (a17.f415691c) {
            return a17;
        }
        n06.d dVar = n06.d.f415486a;
        n16.c b17 = a17.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "asSingleFqName(...)");
        n16.b f17 = dVar.f(b17);
        return f17 != null ? f17 : a17;
    }

    @Override // i06.l1
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public o06.g h() {
        return ((i06.f1) this.f368214f.mo141623x754a37bb()).a();
    }

    public final y16.s x() {
        return h().k().V();
    }

    public final y16.s y() {
        y16.s m07 = h().m0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m07, "getStaticScope(...)");
        return m07;
    }
}
