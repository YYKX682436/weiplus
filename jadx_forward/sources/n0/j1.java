package n0;

/* loaded from: classes14.dex */
public final class j1 implements n0.p1 {

    /* renamed from: d, reason: collision with root package name */
    public final n0.g1 f415079d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.e f415080e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f415081f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f415082g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f415083h;

    /* renamed from: i, reason: collision with root package name */
    public final n0.k4 f415084i;

    /* renamed from: m, reason: collision with root package name */
    public final o0.e f415085m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f415086n;

    /* renamed from: o, reason: collision with root package name */
    public final o0.e f415087o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f415088p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f415089q;

    /* renamed from: r, reason: collision with root package name */
    public final o0.e f415090r;

    /* renamed from: s, reason: collision with root package name */
    public o0.b f415091s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f415092t;

    /* renamed from: u, reason: collision with root package name */
    public n0.j1 f415093u;

    /* renamed from: v, reason: collision with root package name */
    public int f415094v;

    /* renamed from: w, reason: collision with root package name */
    public final n0.y0 f415095w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f415096x;

    public j1(n0.g1 parent, n0.e applier, oz5.l lVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(applier, "applier");
        this.f415079d = parent;
        this.f415080e = applier;
        this.f415081f = new java.util.concurrent.atomic.AtomicReference(null);
        this.f415082g = new java.lang.Object();
        java.util.HashSet hashSet = new java.util.HashSet();
        this.f415083h = hashSet;
        n0.k4 k4Var = new n0.k4();
        this.f415084i = k4Var;
        this.f415085m = new o0.e();
        this.f415086n = new java.util.HashSet();
        this.f415087o = new o0.e();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f415088p = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f415089q = arrayList2;
        this.f415090r = new o0.e();
        this.f415091s = new o0.b(0, 1, null);
        n0.y0 y0Var = new n0.y0(applier, parent, k4Var, hashSet, arrayList, arrayList2, this);
        parent.j(y0Var);
        this.f415095w = y0Var;
        boolean z17 = parent instanceof n0.b4;
        int i18 = n0.k.f415115a;
    }

    public static final void e(n0.j1 j1Var, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.Object obj) {
        n0.j2 j2Var;
        o0.e eVar = j1Var.f415085m;
        int b17 = eVar.b(obj);
        if (b17 < 0) {
            return;
        }
        o0.d d17 = eVar.d(b17);
        int i17 = 0;
        while (true) {
            if (!(i17 < d17.f423371d)) {
                return;
            }
            int i18 = i17 + 1;
            java.lang.Object obj2 = d17.f423372e[i17];
            if (obj2 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            }
            n0.l3 l3Var = (n0.l3) obj2;
            if (!j1Var.f415090r.c(obj, l3Var)) {
                n0.j1 j1Var2 = l3Var.f415138a;
                n0.j2 j2Var2 = n0.j2.IGNORED;
                if (j1Var2 == null || (j2Var = j1Var2.l(l3Var, obj)) == null) {
                    j2Var = j2Var2;
                }
                if (j2Var != j2Var2) {
                    if (!(l3Var.f415144g != null) || z17) {
                        java.util.HashSet hashSet = (java.util.HashSet) h0Var.f391656d;
                        if (hashSet == null) {
                            hashSet = new java.util.HashSet();
                            h0Var.f391656d = hashSet;
                        }
                        hashSet.add(l3Var);
                    } else {
                        j1Var.f415086n.add(l3Var);
                    }
                }
            }
            i17 = i18;
        }
    }

    @Override // n0.f1
    public boolean a() {
        return this.f415096x;
    }

    @Override // n0.f1
    public void b(yz5.p content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        if (!(!this.f415096x)) {
            throw new java.lang.IllegalStateException("The composition is disposed".toString());
        }
        this.f415079d.a(this, content);
    }

    @Override // n0.f1
    public boolean c() {
        boolean z17;
        synchronized (this.f415082g) {
            z17 = this.f415091s.f423368c > 0;
        }
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x000d, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.Set r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.j1.d(java.util.Set, boolean):void");
    }

    @Override // n0.f1
    /* renamed from: dispose */
    public void mo7062x63a5261f() {
        synchronized (this.f415082g) {
            if (!this.f415096x) {
                this.f415096x = true;
                int i17 = n0.k.f415115a;
                boolean z17 = this.f415084i.f415124e > 0;
                if (z17 || (true ^ this.f415083h.isEmpty())) {
                    n0.i1 i1Var = new n0.i1(this.f415083h);
                    if (z17) {
                        n0.o4 j17 = this.f415084i.j();
                        try {
                            n0.e1.e(j17, i1Var);
                            j17.e();
                            this.f415080e.mo148702x5a5b64d();
                            i1Var.b();
                        } catch (java.lang.Throwable th6) {
                            j17.e();
                            throw th6;
                        }
                    }
                    i1Var.a();
                }
                n0.y0 y0Var = this.f415095w;
                y0Var.f415295c.l(y0Var);
                y0Var.C.f415022a.clear();
                ((java.util.ArrayList) y0Var.f415311s).clear();
                y0Var.f415298f.clear();
                y0Var.f415314v.clear();
                y0Var.f415294b.mo148702x5a5b64d();
            }
        }
        this.f415079d.m(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.util.List r18) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.j1.f(java.util.List):void");
    }

    public void g() {
        synchronized (this.f415082g) {
            this.f415095w.f415314v.clear();
            if (!this.f415083h.isEmpty()) {
                java.util.HashSet abandoning = this.f415083h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abandoning, "abandoning");
                new java.util.ArrayList();
                new java.util.ArrayList();
                new java.util.ArrayList();
                if (!abandoning.isEmpty()) {
                    java.util.Iterator it = abandoning.iterator();
                    while (it.hasNext()) {
                        n0.e4 e4Var = (n0.e4) it.next();
                        it.remove();
                        e4Var.c();
                    }
                }
            }
        }
    }

    public void h(yz5.p content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        try {
            synchronized (this.f415082g) {
                i();
                n0.y0 y0Var = this.f415095w;
                o0.b invalidationsRequested = this.f415091s;
                this.f415091s = new o0.b(0, 1, null);
                y0Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invalidationsRequested, "invalidationsRequested");
                if (!y0Var.f415298f.isEmpty()) {
                    n0.e1.c("Expected applyChanges() to have been called".toString());
                    throw null;
                }
                y0Var.l(invalidationsRequested, content);
            }
        } catch (java.lang.Throwable th6) {
            if (!this.f415083h.isEmpty()) {
                java.util.HashSet abandoning = this.f415083h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abandoning, "abandoning");
                new java.util.ArrayList();
                new java.util.ArrayList();
                new java.util.ArrayList();
                if (true ^ abandoning.isEmpty()) {
                    java.util.Iterator it = abandoning.iterator();
                    while (it.hasNext()) {
                        n0.e4 e4Var = (n0.e4) it.next();
                        it.remove();
                        e4Var.c();
                    }
                }
            }
            throw th6;
        }
    }

    public final void i() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f415081f;
        java.lang.Object obj = n0.k1.f415117a;
        java.lang.Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(andSet, obj)) {
                throw new java.lang.IllegalStateException("pending composition has not been applied".toString());
            }
            if (andSet instanceof java.util.Set) {
                d((java.util.Set) andSet, true);
                return;
            }
            if (!(andSet instanceof java.lang.Object[])) {
                throw new java.lang.IllegalStateException(("corrupt pendingModifications drain: " + atomicReference).toString());
            }
            for (java.util.Set set : (java.util.Set[]) andSet) {
                d(set, true);
            }
        }
    }

    public final void j() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f415081f;
        java.lang.Object andSet = atomicReference.getAndSet(null);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(andSet, n0.k1.f415117a)) {
            return;
        }
        if (andSet instanceof java.util.Set) {
            d((java.util.Set) andSet, false);
            return;
        }
        if (!(andSet instanceof java.lang.Object[])) {
            if (andSet == null) {
                throw new java.lang.IllegalStateException("calling recordModificationsOf and applyChanges concurrently is not supported".toString());
            }
            throw new java.lang.IllegalStateException(("corrupt pendingModifications drain: " + atomicReference).toString());
        }
        for (java.util.Set set : (java.util.Set[]) andSet) {
            d(set, false);
        }
    }

    public void k(java.util.List references) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(references, "references");
        if (references.size() > 0) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(((jz5.l) references.get(0)).f384366d);
            throw null;
        }
        java.lang.Object obj = n0.e1.f415025a;
        try {
            this.f415095w.w(references);
        } catch (java.lang.Throwable th6) {
            java.util.HashSet abandoning = this.f415083h;
            if (!abandoning.isEmpty()) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abandoning, "abandoning");
                new java.util.ArrayList();
                new java.util.ArrayList();
                new java.util.ArrayList();
                if (!abandoning.isEmpty()) {
                    java.util.Iterator it = abandoning.iterator();
                    while (it.hasNext()) {
                        n0.e4 e4Var = (n0.e4) it.next();
                        it.remove();
                        e4Var.c();
                    }
                }
            }
            throw th6;
        }
    }

    public final n0.j2 l(n0.l3 scope, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        int i17 = scope.f415139b;
        if ((i17 & 2) != 0) {
            scope.f415139b = i17 | 4;
        }
        n0.d dVar = scope.f415140c;
        n0.j2 j2Var = n0.j2.IGNORED;
        if (dVar != null && this.f415084i.k(dVar) && dVar.a() && dVar.a()) {
            return !(scope.f415141d != null) ? j2Var : n(scope, dVar, obj);
        }
        return j2Var;
    }

    public void m() {
        n0.j1 j1Var;
        synchronized (this.f415082g) {
            for (java.lang.Object obj : this.f415084i.f415125f) {
                n0.l3 l3Var = obj instanceof n0.l3 ? (n0.l3) obj : null;
                if (l3Var != null && (j1Var = l3Var.f415138a) != null) {
                    j1Var.l(l3Var, null);
                }
            }
        }
    }

    public final n0.j2 n(n0.l3 key, n0.d dVar, java.lang.Object obj) {
        synchronized (this.f415082g) {
            n0.j1 j1Var = this.f415093u;
            if (j1Var == null || !this.f415084i.g(this.f415094v, dVar)) {
                j1Var = null;
            }
            if (j1Var == null) {
                n0.y0 y0Var = this.f415095w;
                if (y0Var.D && y0Var.Z(key, obj)) {
                    return n0.j2.IMMINENT;
                }
                if (obj == null) {
                    this.f415091s.b(key, null);
                } else {
                    o0.b bVar = this.f415091s;
                    bVar.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
                    if (bVar.a(key) >= 0) {
                        int a17 = bVar.a(key);
                        o0.d dVar2 = (o0.d) (a17 >= 0 ? bVar.f423367b[a17] : null);
                        if (dVar2 != null) {
                            dVar2.add(obj);
                        }
                    } else {
                        o0.d dVar3 = new o0.d();
                        dVar3.add(obj);
                        bVar.b(key, dVar3);
                    }
                }
            }
            if (j1Var != null) {
                return j1Var.n(key, dVar, obj);
            }
            this.f415079d.g(this);
            return this.f415095w.D ? n0.j2.DEFERRED : n0.j2.SCHEDULED;
        }
    }

    public final void o(java.lang.Object obj) {
        n0.j2 j2Var;
        o0.e eVar = this.f415085m;
        int b17 = eVar.b(obj);
        if (b17 < 0) {
            return;
        }
        o0.d d17 = eVar.d(b17);
        int i17 = 0;
        while (true) {
            if (!(i17 < d17.f423371d)) {
                return;
            }
            int i18 = i17 + 1;
            java.lang.Object obj2 = d17.f423372e[i17];
            if (obj2 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            }
            n0.l3 l3Var = (n0.l3) obj2;
            n0.j1 j1Var = l3Var.f415138a;
            if (j1Var == null || (j2Var = j1Var.l(l3Var, obj)) == null) {
                j2Var = n0.j2.IGNORED;
            }
            if (j2Var == n0.j2.IMMINENT) {
                this.f415090r.a(obj, l3Var);
            }
            i17 = i18;
        }
    }

    public boolean p() {
        boolean D;
        synchronized (this.f415082g) {
            i();
            try {
                n0.y0 y0Var = this.f415095w;
                o0.b bVar = this.f415091s;
                this.f415091s = new o0.b(0, 1, null);
                D = y0Var.D(bVar);
                if (!D) {
                    j();
                }
            } catch (java.lang.Throwable th6) {
                if (!this.f415083h.isEmpty()) {
                    java.util.HashSet abandoning = this.f415083h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abandoning, "abandoning");
                    new java.util.ArrayList();
                    new java.util.ArrayList();
                    new java.util.ArrayList();
                    if (true ^ abandoning.isEmpty()) {
                        java.util.Iterator it = abandoning.iterator();
                        while (it.hasNext()) {
                            n0.e4 e4Var = (n0.e4) it.next();
                            it.remove();
                            e4Var.c();
                        }
                    }
                }
                throw th6;
            }
        }
        return D;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.j1.q(java.lang.Object):void");
    }

    public void r(java.lang.Object value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        synchronized (this.f415082g) {
            o(value);
            o0.e eVar = this.f415087o;
            int b17 = eVar.b(value);
            if (b17 >= 0) {
                java.util.Iterator<E> it = eVar.d(b17).iterator();
                while (it.hasNext()) {
                    o((n0.y1) it.next());
                }
            }
        }
    }
}
