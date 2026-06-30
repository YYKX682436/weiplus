package b16;

/* loaded from: classes16.dex */
public final class r extends r06.s implements z06.c {
    public final b16.m1 A;
    public final p06.k B;
    public final e26.x C;

    /* renamed from: n, reason: collision with root package name */
    public final a16.l f98764n;

    /* renamed from: o, reason: collision with root package name */
    public final e16.g f98765o;

    /* renamed from: p, reason: collision with root package name */
    public final o06.g f98766p;

    /* renamed from: q, reason: collision with root package name */
    public final a16.l f98767q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f98768r;

    /* renamed from: s, reason: collision with root package name */
    public final o06.h f98769s;

    /* renamed from: t, reason: collision with root package name */
    public final o06.t0 f98770t;

    /* renamed from: u, reason: collision with root package name */
    public final o06.y2 f98771u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f98772v;

    /* renamed from: w, reason: collision with root package name */
    public final b16.m f98773w;

    /* renamed from: x, reason: collision with root package name */
    public final b16.e0 f98774x;

    /* renamed from: y, reason: collision with root package name */
    public final o06.u1 f98775y;

    /* renamed from: z, reason: collision with root package name */
    public final y16.m f98776z;

    static {
        kz5.p1.f("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");
    }

    public /* synthetic */ r(a16.l lVar, o06.m mVar, e16.g gVar, o06.g gVar2, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(lVar, mVar, gVar, (i17 & 8) != 0 ? null : gVar2);
    }

    @Override // r06.s0
    public y16.s P(g26.l kotlinTypeRefiner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        o06.u1 u1Var = this.f98775y;
        u1Var.getClass();
        v16.f.j(u1Var.f423528a);
        return (b16.e0) ((y16.s) e26.b0.a(u1Var.f423531d, u1Var, o06.u1.f423527f[0]));
    }

    @Override // o06.g
    public java.util.Collection S() {
        return (java.util.List) ((e26.o) this.f98774x.f98687q).mo152xb9724478();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Collection, kz5.p0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // o06.g
    public java.util.Collection T() {
        java.lang.Class[] clsArr;
        o06.t0 t0Var = o06.t0.f423519f;
        ?? r17 = kz5.p0.f395529d;
        if (this.f98770t != t0Var) {
            return r17;
        }
        c16.a a17 = c16.b.a(f26.x2.f340769e, false, false, null, 7, null);
        java.lang.Class clazz = ((u06.x) this.f98765o).f505066a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        u06.c cVar = u06.d.f505027a;
        if (cVar == null) {
            try {
                cVar = new u06.c(java.lang.Class.class.getMethod("isSealed", new java.lang.Class[0]), java.lang.Class.class.getMethod("getPermittedSubclasses", new java.lang.Class[0]), java.lang.Class.class.getMethod("isRecord", new java.lang.Class[0]), java.lang.Class.class.getMethod("getRecordComponents", new java.lang.Class[0]));
            } catch (java.lang.NoSuchMethodException unused) {
                cVar = new u06.c(null, null, null, null);
            }
            u06.d.f505027a = cVar;
        }
        java.lang.reflect.Method method = cVar.f505023b;
        if (method == null) {
            clsArr = null;
        } else {
            java.lang.Object invoke = method.invoke(clazz, new java.lang.Object[0]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(invoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
            clsArr = (java.lang.Class[]) invoke;
        }
        if (clsArr != null) {
            r17 = new java.util.ArrayList(clsArr.length);
            for (java.lang.Class cls : clsArr) {
                r17.add(new u06.z(cls));
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = r17.iterator();
        while (it.hasNext()) {
            o06.j i17 = this.f98767q.f82186e.e((e16.j) it.next(), a17).w0().i();
            o06.g gVar = i17 instanceof o06.g ? (o06.g) i17 : null;
            if (gVar != null) {
                arrayList.add(gVar);
            }
        }
        return kz5.n0.F0(arrayList, new b16.o());
    }

    @Override // o06.g
    public o06.j2 d0() {
        return null;
    }

    @Override // o06.r0
    public boolean e0() {
        return false;
    }

    @Override // o06.g, o06.r0
    public o06.t0 f() {
        return this.f98770t;
    }

    @Override // o06.j
    public f26.c2 g() {
        return this.f98773w;
    }

    @Override // o06.g
    public boolean g0() {
        return false;
    }

    @Override // p06.a
    /* renamed from: getAnnotations */
    public p06.k mo9601xa083c1ee() {
        return this.B;
    }

    @Override // o06.g, o06.q, o06.r0
    /* renamed from: getVisibility */
    public o06.g0 mo9617x61f71b08() {
        o06.g0 g0Var = o06.f0.f423474a;
        o06.y2 y2Var = this.f98771u;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(y2Var, g0Var)) {
            java.lang.Class<?> declaringClass = ((u06.x) this.f98765o).f505066a.getDeclaringClass();
            if ((declaringClass != null ? new u06.x(declaringClass) : null) == null) {
                o06.g0 g0Var2 = x06.d0.f532758a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g0Var2);
                return g0Var2;
            }
        }
        return x06.h1.a(y2Var);
    }

    @Override // o06.g
    public boolean h0() {
        return false;
    }

    @Override // o06.g
    /* renamed from: isInline */
    public boolean mo9618xe19a9463() {
        return false;
    }

    @Override // o06.g
    public o06.h j() {
        return this.f98769s;
    }

    @Override // o06.g
    public boolean k0() {
        return false;
    }

    @Override // o06.r0
    public boolean l0() {
        return false;
    }

    @Override // o06.g, o06.k
    public java.util.List m() {
        return (java.util.List) ((e26.o) this.C).mo152xb9724478();
    }

    @Override // o06.g
    public y16.s m0() {
        return this.A;
    }

    @Override // o06.k
    public boolean p() {
        return this.f98772v;
    }

    @Override // o06.g
    public o06.f s() {
        return null;
    }

    @Override // o06.g
    public boolean t0() {
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m9619x9616526c() {
        return "Lazy Java class " + v16.f.h(this);
    }

    @Override // r06.e, o06.g
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public b16.e0 A() {
        y16.s A = super.A();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(A, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (b16.e0) A;
    }

    @Override // r06.e, o06.g
    public y16.s z() {
        return this.f98776z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(a16.l r13, o06.m r14, e16.g r15, o06.g r16) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b16.r.<init>(a16.l, o06.m, e16.g, o06.g):void");
    }
}
