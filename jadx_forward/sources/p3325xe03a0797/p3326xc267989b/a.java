package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public abstract class a extends p3325xe03a0797.p3326xc267989b.c3 implements p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57, p3325xe03a0797.p3326xc267989b.y0 {

    /* renamed from: e, reason: collision with root package name */
    public final oz5.l f391661e;

    public a(oz5.l lVar, boolean z17, boolean z18) {
        super(z18);
        if (z17) {
            S((p3325xe03a0797.p3326xc267989b.r2) lVar.get(p3325xe03a0797.p3326xc267989b.q2.f392104d));
        }
        this.f391661e = lVar.mo7096x348d9a(this);
    }

    @Override // p3325xe03a0797.p3326xc267989b.c3
    public java.lang.String E() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // p3325xe03a0797.p3326xc267989b.c3
    public final void R(java.lang.Throwable th6) {
        p3325xe03a0797.p3326xc267989b.u0.a(this.f391661e, th6);
    }

    @Override // p3325xe03a0797.p3326xc267989b.c3
    public java.lang.String W() {
        return super.W();
    }

    @Override // p3325xe03a0797.p3326xc267989b.c3
    public final void Z(java.lang.Object obj) {
        if (!(obj instanceof p3325xe03a0797.p3326xc267989b.e0)) {
            i0(obj);
        } else {
            p3325xe03a0797.p3326xc267989b.e0 e0Var = (p3325xe03a0797.p3326xc267989b.e0) obj;
            h0(e0Var.f391705a, e0Var.a());
        }
    }

    @Override // p3325xe03a0797.p3326xc267989b.c3, p3325xe03a0797.p3326xc267989b.r2
    public boolean a() {
        return super.a();
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: getContext */
    public final oz5.l mo48699x76847179() {
        return this.f391661e;
    }

    @Override // p3325xe03a0797.p3326xc267989b.y0
    /* renamed from: getCoroutineContext */
    public oz5.l getF93115e() {
        return this.f391661e;
    }

    public void h0(java.lang.Throwable th6, boolean z17) {
    }

    public void i0(java.lang.Object obj) {
    }

    public final void j0(p3325xe03a0797.p3326xc267989b.a1 a1Var, java.lang.Object obj, yz5.p pVar) {
        int ordinal = a1Var.ordinal();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (ordinal == 0) {
            try {
                p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 b17 = pz5.f.b(pz5.f.a(pVar, obj, this));
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.i.a(b17, p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var), null);
                return;
            } finally {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th)));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pVar, "<this>");
                p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 b18 = pz5.f.b(pz5.f.a(pVar, obj, this));
                p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                b18.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var));
                return;
            }
            if (ordinal != 3) {
                throw new jz5.j();
            }
            try {
                oz5.l lVar = this.f391661e;
                java.lang.Object c17 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.r0.c(lVar, null);
                try {
                    p3321xbce91901.jvm.p3324x21ffc6bd.m0.e(pVar, 2);
                    java.lang.Object mo149xb9724478 = pVar.mo149xb9724478(obj, this);
                    if (mo149xb9724478 != pz5.a.f440719d) {
                        mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(mo149xb9724478));
                    }
                } finally {
                    p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.r0.a(lVar, c17);
                }
            } catch (java.lang.Throwable th6) {
            }
        }
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: resumeWith */
    public final void mo48700xdecd0e93(java.lang.Object obj) {
        java.lang.Object V = V(p3325xe03a0797.p3326xc267989b.i0.b(obj, null));
        if (V == p3325xe03a0797.p3326xc267989b.d3.f391695b) {
            return;
        }
        v(V);
    }
}
