package u26;

/* loaded from: classes14.dex */
public abstract class k extends u26.o implements u26.w {
    public final boolean A() {
        return !(this.f505715e.m() instanceof u26.w0) && z();
    }

    public void B(boolean z17) {
        u26.e0 l17 = l();
        if (l17 == null) {
            throw new java.lang.IllegalStateException("Cannot happen".toString());
        }
        java.lang.Object obj = null;
        while (true) {
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t n17 = l17.n();
            if (n17 instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.m) {
                C(obj, l17);
                return;
            } else if (n17.q()) {
                obj = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.j.a(obj, (u26.w0) n17);
            } else {
                ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f0) n17.l()).f392026a.o();
            }
        }
    }

    public void C(java.lang.Object obj, u26.e0 e0Var) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof java.util.ArrayList)) {
            ((u26.w0) obj).x(e0Var);
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                ((u26.w0) arrayList.get(size)).x(e0Var);
            }
        }
    }

    public java.lang.Object D() {
        while (true) {
            u26.w0 w17 = w();
            if (w17 == null) {
                return u26.l.f505702d;
            }
            if (w17.y(null) != null) {
                w17.u();
                return w17.w();
            }
            w17.z();
        }
    }

    public java.lang.Object E(p3325xe03a0797.p3326xc267989b.p3331x75e76af7.h hVar) {
        u26.g gVar = new u26.g(this.f505715e);
        p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f fVar = (p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f) hVar;
        fVar.getClass();
        java.lang.Object c17 = new p3325xe03a0797.p3326xc267989b.p3331x75e76af7.a(fVar, gVar).c(null);
        if (c17 != null) {
            return c17;
        }
        ((u26.w0) gVar.h()).u();
        return ((u26.w0) gVar.h()).w();
    }

    public final java.lang.Object F(int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r a17 = p3325xe03a0797.p3326xc267989b.t.a(pz5.f.b(interfaceC29045xdcb5ca57));
        yz5.l lVar = this.f505714d;
        u26.b bVar = lVar == null ? new u26.b(a17, i17) : new u26.c(a17, i17, lVar);
        while (true) {
            if (x(bVar)) {
                a17.m(new u26.f(this, bVar));
                break;
            }
            java.lang.Object D = D();
            if (D instanceof u26.e0) {
                bVar.w((u26.e0) D);
                break;
            }
            if (D != u26.l.f505702d) {
                a17.s(bVar.f505671h == 1 ? new u26.c0(D) : D, bVar.u(D));
            }
        }
        java.lang.Object j17 = a17.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    @Override // u26.t0
    public final void b(java.util.concurrent.CancellationException cancellationException) {
        if (m()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new java.util.concurrent.CancellationException(getClass().getSimpleName().concat(" was cancelled"));
        }
        B(s(cancellationException));
    }

    @Override // u26.t0
    public final p3325xe03a0797.p3326xc267989b.p3331x75e76af7.g g() {
        return new u26.i(this);
    }

    @Override // u26.t0
    public final java.lang.Object h() {
        java.lang.Object D = D();
        return D == u26.l.f505702d ? u26.c0.f505673b : D instanceof u26.e0 ? new u26.a0(((u26.e0) D).f505681g) : D;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // u26.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof u26.j
            if (r0 == 0) goto L13
            r0 = r5
            u26.j r0 = (u26.j) r0
            int r1 = r0.f505691f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f505691f = r1
            goto L18
        L13:
            u26.j r0 = new u26.j
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f505689d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f505691f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            goto L52
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            java.lang.Object r5 = r4.D()
            kotlinx.coroutines.internal.l0 r2 = u26.l.f505702d
            if (r5 == r2) goto L49
            boolean r0 = r5 instanceof u26.e0
            if (r0 == 0) goto L48
            u26.e0 r5 = (u26.e0) r5
            java.lang.Throwable r5 = r5.f505681g
            u26.a0 r0 = new u26.a0
            r0.<init>(r5)
            r5 = r0
        L48:
            return r5
        L49:
            r0.f505691f = r3
            java.lang.Object r5 = r4.F(r3, r0)
            if (r5 != r1) goto L52
            return r1
        L52:
            u26.c0 r5 = (u26.c0) r5
            java.lang.Object r5 = r5.f505674a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u26.k.i(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // u26.t0
    /* renamed from: isEmpty */
    public boolean mo167477x7aab3243() {
        return A();
    }

    @Override // u26.t0
    /* renamed from: iterator */
    public final u26.y mo167478x467c086e() {
        return new u26.a(this);
    }

    @Override // u26.t0
    public boolean m() {
        return k() != null && z();
    }

    @Override // u26.t0
    public final java.lang.Object r(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object D = D();
        return (D == u26.l.f505702d || (D instanceof u26.e0)) ? F(0, interfaceC29045xdcb5ca57) : D;
    }

    @Override // u26.o
    public u26.u0 v() {
        u26.u0 v17 = super.v();
        if (v17 != null) {
            boolean z17 = v17 instanceof u26.e0;
        }
        return v17;
    }

    public boolean x(u26.s0 s0Var) {
        int t17;
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t n17;
        boolean y17 = y();
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t tVar = this.f505715e;
        if (!y17) {
            u26.h hVar = new u26.h(s0Var, this);
            do {
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t n18 = tVar.n();
                if (!(!(n18 instanceof u26.w0))) {
                    return false;
                }
                t17 = n18.t(s0Var, tVar, hVar);
                if (t17 == 1) {
                    return true;
                }
            } while (t17 != 2);
            return false;
        }
        do {
            n17 = tVar.n();
            if (!(!(n17 instanceof u26.w0))) {
                return false;
            }
        } while (!n17.i(s0Var, tVar));
        return true;
    }

    public abstract boolean y();

    public abstract boolean z();
}
