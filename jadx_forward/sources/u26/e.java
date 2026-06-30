package u26;

/* loaded from: classes14.dex */
public final class e extends u26.s0 implements p3325xe03a0797.p3326xc267989b.s1 {

    /* renamed from: g, reason: collision with root package name */
    public final u26.k f505677g;

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3331x75e76af7.h f505678h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.p f505679i;

    /* renamed from: m, reason: collision with root package name */
    public final int f505680m;

    public e(u26.k kVar, p3325xe03a0797.p3326xc267989b.p3331x75e76af7.h hVar, yz5.p pVar, int i17) {
        this.f505677g = kVar;
        this.f505678h = hVar;
        this.f505679i = pVar;
        this.f505680m = i17;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t, p3325xe03a0797.p3326xc267989b.s1
    /* renamed from: dispose */
    public void mo144008x63a5261f() {
        if (q()) {
            this.f505677g.getClass();
        }
    }

    @Override // u26.u0
    public void g(java.lang.Object obj) {
        java.lang.Object c0Var = this.f505680m == 1 ? new u26.c0(obj) : obj;
        p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f fVar = (p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f) this.f505678h;
        fVar.getClass();
        yz5.l u17 = u(obj);
        try {
            p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 b17 = pz5.f.b(pz5.f.a(this.f505679i, c0Var, fVar));
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.i.a(b17, p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a), u17);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            fVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6)));
            throw th6;
        }
    }

    @Override // u26.u0
    public p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 h(java.lang.Object obj, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.q qVar) {
        return (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0) ((p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f) this.f505678h).E(qVar);
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t
    /* renamed from: toString */
    public java.lang.String mo144017x9616526c() {
        return "ReceiveSelect@" + p3325xe03a0797.p3326xc267989b.c1.a(this) + '[' + this.f505678h + ",receiveMode=" + this.f505680m + ']';
    }

    @Override // u26.s0
    public yz5.l u(java.lang.Object obj) {
        yz5.l lVar = this.f505677g.f505714d;
        if (lVar == null) {
            return null;
        }
        p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f fVar = (p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f) this.f505678h;
        fVar.getClass();
        return new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.c0(lVar, obj, fVar.mo48699x76847179());
    }

    @Override // u26.s0
    public void w(u26.e0 e0Var) {
        p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f fVar = (p3325xe03a0797.p3326xc267989b.p3331x75e76af7.f) this.f505678h;
        if (fVar.B()) {
            int i17 = this.f505680m;
            if (i17 == 0) {
                fVar.A(e0Var.A());
                return;
            }
            if (i17 != 1) {
                return;
            }
            yz5.p pVar = this.f505679i;
            u26.c0 c0Var = new u26.c0(new u26.a0(e0Var.f505681g));
            fVar.getClass();
            try {
                p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 b17 = pz5.f.b(pz5.f.a(pVar, c0Var, fVar));
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.i.a(b17, p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a), null);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                fVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6)));
                throw th6;
            }
        }
    }
}
