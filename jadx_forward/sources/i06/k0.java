package i06;

/* loaded from: classes16.dex */
public abstract class k0 implements f06.c, i06.z3 {

    /* renamed from: d, reason: collision with root package name */
    public final i06.c4 f368206d = i06.f4.a(new i06.a0(this));

    /* renamed from: e, reason: collision with root package name */
    public final i06.c4 f368207e = i06.f4.a(new i06.f0(this));

    /* renamed from: f, reason: collision with root package name */
    public final i06.c4 f368208f = i06.f4.a(new i06.h0(this));

    /* renamed from: g, reason: collision with root package name */
    public final i06.c4 f368209g = i06.f4.a(new i06.i0(this));

    /* renamed from: h, reason: collision with root package name */
    public final i06.c4 f368210h = i06.f4.a(new i06.z(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f368211i = jz5.h.a(jz5.i.f384363e, new i06.j0(this));

    @Override // f06.c
    /* renamed from: call */
    public java.lang.Object mo128633x2e7a5e(java.lang.Object... args) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        try {
            return i().mo140163x2e7a5e(args);
        } catch (java.lang.IllegalAccessException e17) {
            throw new g06.a(e17);
        }
    }

    @Override // f06.c
    /* renamed from: callBy */
    public java.lang.Object mo128634xae796355(java.util.Map args) {
        int i17;
        java.lang.Object h17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        int i18 = 0;
        if (n()) {
            java.util.List<f06.o> mo128635x99879e0 = mo128635x99879e0();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(mo128635x99879e0, 10));
            for (f06.o oVar : mo128635x99879e0) {
                if (args.containsKey(oVar)) {
                    h17 = args.get(oVar);
                    if (h17 == null) {
                        throw new java.lang.IllegalArgumentException("Annotation argument value cannot be null (" + oVar + ')');
                    }
                } else {
                    i06.u2 u2Var = (i06.u2) oVar;
                    if (u2Var.j()) {
                        h17 = null;
                    } else {
                        if (!u2Var.k()) {
                            throw new java.lang.IllegalArgumentException("No argument provided for a required parameter: " + u2Var);
                        }
                        h17 = h(u2Var.i());
                    }
                }
                arrayList.add(h17);
            }
            j06.k k17 = k();
            if (k17 != null) {
                try {
                    return k17.mo140163x2e7a5e(arrayList.toArray(new java.lang.Object[0]));
                } catch (java.lang.IllegalAccessException e17) {
                    throw new g06.a(e17);
                }
            }
            throw new i06.a4("This callable does not support a default call: " + l());
        }
        java.util.List<f06.o> mo128635x99879e02 = mo128635x99879e0();
        int i19 = 1;
        if (mo128635x99879e02.isEmpty()) {
            try {
                return i().mo140163x2e7a5e(mo128642x6f0de7b2() ? new p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57[]{null} : new p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57[0]);
            } catch (java.lang.IllegalAccessException e18) {
                throw new g06.a(e18);
            }
        }
        int size = mo128635x99879e02.size() + (mo128642x6f0de7b2() ? 1 : 0);
        java.lang.Object[] objArr = (java.lang.Object[]) ((java.lang.Object[]) this.f368210h.mo152xb9724478()).clone();
        if (mo128642x6f0de7b2()) {
            objArr[mo128635x99879e02.size()] = null;
        }
        boolean booleanValue = ((java.lang.Boolean) this.f368211i.mo141623x754a37bb()).booleanValue();
        int i27 = 0;
        for (f06.o oVar2 : mo128635x99879e02) {
            int m17 = booleanValue ? m(oVar2) : i19;
            if (args.containsKey(oVar2)) {
                objArr[((i06.u2) oVar2).f368292e] = args.get(oVar2);
                i17 = i19;
            } else {
                i06.u2 u2Var2 = (i06.u2) oVar2;
                if (u2Var2.j()) {
                    if (booleanValue) {
                        int i28 = i27 + m17;
                        int i29 = i27;
                        while (i29 < i28) {
                            int i37 = (i29 / 32) + size;
                            java.lang.Object obj = objArr[i37];
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
                            objArr[i37] = java.lang.Integer.valueOf(((java.lang.Integer) obj).intValue() | (1 << (i29 % 32)));
                            i29++;
                            i19 = 1;
                        }
                        i17 = i19;
                    } else {
                        int i38 = (i27 / 32) + size;
                        java.lang.Object obj2 = objArr[i38];
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.Int");
                        i17 = 1;
                        objArr[i38] = java.lang.Integer.valueOf(((java.lang.Integer) obj2).intValue() | (1 << (i27 % 32)));
                    }
                    i18 = i17;
                } else {
                    i17 = i19;
                    if (!u2Var2.k()) {
                        throw new java.lang.IllegalArgumentException("No argument provided for a required parameter: " + u2Var2);
                    }
                }
            }
            if (((i06.u2) oVar2).f368293f == f06.n.f339989f) {
                i27 += m17;
            }
            i19 = i17;
        }
        if (i18 == 0) {
            try {
                j06.k i39 = i();
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, size);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(...)");
                return i39.mo140163x2e7a5e(copyOf);
            } catch (java.lang.IllegalAccessException e19) {
                throw new g06.a(e19);
            }
        }
        j06.k k18 = k();
        if (k18 != null) {
            try {
                return k18.mo140163x2e7a5e(objArr);
            } catch (java.lang.IllegalAccessException e27) {
                throw new g06.a(e27);
            }
        }
        throw new i06.a4("This callable does not support a default call: " + l());
    }

    @Override // f06.b
    /* renamed from: getAnnotations */
    public java.util.List mo128629xa083c1ee() {
        java.lang.Object mo152xb9724478 = this.f368206d.mo152xb9724478();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo152xb9724478, "invoke(...)");
        return (java.util.List) mo152xb9724478;
    }

    @Override // f06.c
    /* renamed from: getParameters */
    public java.util.List mo128635x99879e0() {
        java.lang.Object mo152xb9724478 = this.f368207e.mo152xb9724478();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo152xb9724478, "invoke(...)");
        return (java.util.List) mo152xb9724478;
    }

    @Override // f06.c
    /* renamed from: getReturnType */
    public f06.w mo128636x3df4e080() {
        java.lang.Object mo152xb9724478 = this.f368208f.mo152xb9724478();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo152xb9724478, "invoke(...)");
        return (f06.w) mo152xb9724478;
    }

    @Override // f06.c
    /* renamed from: getTypeParameters */
    public java.util.List mo128637xb121b9ba() {
        java.lang.Object mo152xb9724478 = this.f368209g.mo152xb9724478();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo152xb9724478, "invoke(...)");
        return (java.util.List) mo152xb9724478;
    }

    @Override // f06.c
    /* renamed from: getVisibility */
    public f06.b0 mo128638x61f71b08() {
        o06.g0 mo9617x61f71b08 = l().mo9617x61f71b08();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo9617x61f71b08, "getVisibility(...)");
        n16.c cVar = i06.o4.f368248a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo9617x61f71b08, o06.f0.f423478e)) {
            return f06.b0.f339972d;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo9617x61f71b08, o06.f0.f423476c)) {
            return f06.b0.f339973e;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo9617x61f71b08, o06.f0.f423477d)) {
            return f06.b0.f339974f;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo9617x61f71b08, o06.f0.f423474a) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo9617x61f71b08, o06.f0.f423475b)) {
            return f06.b0.f339975g;
        }
        return null;
    }

    public final java.lang.Object h(f06.w wVar) {
        java.lang.Class b17 = xz5.a.b(h06.b.b(wVar));
        if (b17.isArray()) {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance(b17.getComponentType(), 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newInstance, "run(...)");
            return newInstance;
        }
        throw new i06.a4("Cannot instantiate the default empty array of type " + b17.getSimpleName() + ", because it is not an array type");
    }

    public abstract j06.k i();

    @Override // f06.c
    /* renamed from: isAbstract */
    public boolean mo128639x3801976c() {
        return l().f() == o06.t0.f423521h;
    }

    @Override // f06.c
    /* renamed from: isFinal */
    public boolean mo128640x7ab76e6c() {
        return l().f() == o06.t0.f423518e;
    }

    @Override // f06.c
    /* renamed from: isOpen */
    public boolean mo128641xb9a70294() {
        return l().f() == o06.t0.f423520g;
    }

    public abstract i06.u1 j();

    public abstract j06.k k();

    public abstract o06.d l();

    public final int m(f06.o oVar) {
        if (!((java.lang.Boolean) this.f368211i.mo141623x754a37bb()).booleanValue()) {
            throw new java.lang.IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before".toString());
        }
        i06.u2 u2Var = (i06.u2) oVar;
        if (!i06.o4.h(u2Var.i())) {
            return 1;
        }
        java.util.List e17 = j06.s0.e(f26.r2.a(((i06.w3) u2Var.i()).f368313d));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
        return ((java.util.ArrayList) e17).size();
    }

    public final boolean n() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo9624xfb82e301(), "<init>") && j().f().isAnnotation();
    }

    public abstract boolean o();
}
