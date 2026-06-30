package x0;

/* loaded from: classes14.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f532465a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f532466b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f532467c;

    /* renamed from: d, reason: collision with root package name */
    public final o0.i f532468d;

    /* renamed from: e, reason: collision with root package name */
    public x0.i f532469e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f532470f;

    /* renamed from: g, reason: collision with root package name */
    public x0.n0 f532471g;

    public r0(yz5.l onChangedExecutor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onChangedExecutor, "onChangedExecutor");
        this.f532465a = onChangedExecutor;
        this.f532466b = new x0.p0(this);
        this.f532467c = new x0.q0(this);
        this.f532468d = new o0.i(new x0.n0[16], 0);
    }

    public final void a() {
        synchronized (this.f532468d) {
            o0.i iVar = this.f532468d;
            int i17 = iVar.f423385f;
            if (i17 > 0) {
                java.lang.Object[] objArr = iVar.f423383d;
                int i18 = 0;
                do {
                    o0.e eVar = ((x0.n0) objArr[i18]).f532447b;
                    int length = eVar.f423375c.length;
                    for (int i19 = 0; i19 < length; i19++) {
                        o0.d dVar = eVar.f423375c[i19];
                        if (dVar != null) {
                            dVar.clear();
                        }
                        eVar.f423373a[i19] = i19;
                        eVar.f423374b[i19] = null;
                    }
                    eVar.f423376d = 0;
                    i18++;
                } while (i18 < i17);
            }
        }
    }

    public final void b(java.lang.Object scope, yz5.l onValueChangedForScope, yz5.a block) {
        int i17;
        x0.n0 n0Var;
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onValueChangedForScope, "onValueChangedForScope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        x0.n0 n0Var2 = this.f532471g;
        boolean z18 = this.f532470f;
        synchronized (this.f532468d) {
            try {
                o0.i iVar = this.f532468d;
                int i18 = iVar.f423385f;
                if (i18 > 0) {
                    java.lang.Object[] objArr = iVar.f423383d;
                    i17 = 0;
                    do {
                        if (((x0.n0) objArr[i17]).f532446a == onValueChangedForScope) {
                            break;
                        } else {
                            i17++;
                        }
                    } while (i17 < i18);
                }
                i17 = -1;
                if (i17 == -1) {
                    n0Var = new x0.n0(onValueChangedForScope);
                    iVar.b(n0Var);
                } else {
                    n0Var = (x0.n0) iVar.f423383d[i17];
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        java.lang.Object obj = n0Var.f532449d;
        n0Var.f532449d = scope;
        this.f532471g = n0Var;
        this.f532470f = false;
        synchronized (this.f532468d) {
            try {
                o0.e eVar = n0Var.f532447b;
                int i19 = eVar.f423376d;
                int i27 = 0;
                int i28 = 0;
                while (i27 < i19) {
                    int i29 = eVar.f423373a[i27];
                    o0.d dVar = eVar.f423375c[i29];
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
                    int i37 = dVar.f423371d;
                    int i38 = i19;
                    int i39 = 0;
                    int i47 = 0;
                    while (i47 < i37) {
                        int i48 = i37;
                        java.lang.Object[] objArr2 = dVar.f423372e;
                        boolean z19 = z18;
                        java.lang.Object obj2 = objArr2[i47];
                        if (obj2 == null) {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        }
                        if (!(obj2 == scope)) {
                            if (i39 != i47) {
                                objArr2[i39] = obj2;
                            }
                            i39++;
                        }
                        i47++;
                        i37 = i48;
                        z18 = z19;
                    }
                    boolean z27 = z18;
                    int i49 = dVar.f423371d;
                    for (int i57 = i39; i57 < i49; i57++) {
                        dVar.f423372e[i57] = null;
                    }
                    dVar.f423371d = i39;
                    if (i39 > 0) {
                        if (i28 != i27) {
                            int[] iArr = eVar.f423373a;
                            int i58 = iArr[i28];
                            iArr[i28] = i29;
                            iArr[i27] = i58;
                        }
                        i28++;
                    }
                    i27++;
                    i19 = i38;
                    z18 = z27;
                }
                z17 = z18;
                int i59 = eVar.f423376d;
                for (int i66 = i28; i66 < i59; i66++) {
                    eVar.f423374b[eVar.f423373a[i66]] = null;
                }
                eVar.f423376d = i28;
            } catch (java.lang.Throwable th7) {
                throw th7;
            }
        }
        x0.m.f532440e.a(this.f532467c, null, block);
        this.f532471g = n0Var2;
        n0Var.f532449d = obj;
        this.f532470f = z17;
    }

    public final void c() {
        yz5.p observer = this.f532466b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        n0.c5 c5Var = x0.z.f532495a;
        x0.z.f(x0.v.f532484d);
        synchronized (x0.z.f532496b) {
            ((java.util.ArrayList) x0.z.f532500f).add(observer);
        }
        this.f532469e = new x0.k(observer);
    }
}
