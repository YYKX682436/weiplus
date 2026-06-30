package u26;

/* loaded from: classes14.dex */
public final class a implements u26.y {

    /* renamed from: a, reason: collision with root package name */
    public final u26.k f505666a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f505667b = u26.l.f505702d;

    public a(u26.k kVar) {
        this.f505666a = kVar;
    }

    public java.lang.Object a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object obj = this.f505667b;
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var = u26.l.f505702d;
        boolean z17 = false;
        if (obj != l0Var) {
            if (obj instanceof u26.e0) {
                u26.e0 e0Var = (u26.e0) obj;
                if (e0Var.f505681g != null) {
                    java.lang.Throwable A = e0Var.A();
                    int i17 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.k0.f392040a;
                    throw A;
                }
            } else {
                z17 = true;
            }
            return java.lang.Boolean.valueOf(z17);
        }
        u26.k kVar = this.f505666a;
        java.lang.Object D = kVar.D();
        this.f505667b = D;
        if (D != l0Var) {
            if (D instanceof u26.e0) {
                u26.e0 e0Var2 = (u26.e0) D;
                if (e0Var2.f505681g != null) {
                    java.lang.Throwable A2 = e0Var2.A();
                    int i18 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.k0.f392040a;
                    throw A2;
                }
            } else {
                z17 = true;
            }
            return java.lang.Boolean.valueOf(z17);
        }
        p3325xe03a0797.p3326xc267989b.r a17 = p3325xe03a0797.p3326xc267989b.t.a(pz5.f.b(interfaceC29045xdcb5ca57));
        u26.d dVar = new u26.d(this, a17);
        while (true) {
            if (kVar.x(dVar)) {
                a17.m(new u26.f(kVar, dVar));
                break;
            }
            java.lang.Object D2 = kVar.D();
            this.f505667b = D2;
            if (D2 instanceof u26.e0) {
                u26.e0 e0Var3 = (u26.e0) D2;
                if (e0Var3.f505681g == null) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    a17.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
                } else {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    a17.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(e0Var3.A())));
                }
            } else if (D2 != l0Var) {
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                yz5.l lVar = kVar.f505714d;
                a17.s(bool, lVar != null ? new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.c0(lVar, D2, a17.f392110e) : null);
            }
        }
        java.lang.Object j17 = a17.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public java.lang.Object b() {
        java.lang.Object obj = this.f505667b;
        if (obj instanceof u26.e0) {
            java.lang.Throwable A = ((u26.e0) obj).A();
            int i17 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.k0.f392040a;
            throw A;
        }
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var = u26.l.f505702d;
        if (obj == l0Var) {
            throw new java.lang.IllegalStateException("'hasNext' should be called prior to 'next' invocation");
        }
        this.f505667b = l0Var;
        return obj;
    }
}
