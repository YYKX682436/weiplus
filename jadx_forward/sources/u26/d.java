package u26;

/* loaded from: classes14.dex */
public class d extends u26.s0 {

    /* renamed from: g, reason: collision with root package name */
    public final u26.a f505675g;

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.q f505676h;

    public d(u26.a aVar, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f505675g = aVar;
        this.f505676h = qVar;
    }

    @Override // u26.u0
    public void g(java.lang.Object obj) {
        this.f505675g.f505667b = obj;
        ((p3325xe03a0797.p3326xc267989b.r) this.f505676h).e(p3325xe03a0797.p3326xc267989b.s.f392113a);
    }

    @Override // u26.u0
    public p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 h(java.lang.Object obj, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.q qVar) {
        if (((p3325xe03a0797.p3326xc267989b.r) this.f505676h).w(java.lang.Boolean.TRUE, qVar != null ? qVar.f392051c : null, u(obj)) == null) {
            return null;
        }
        if (qVar != null) {
            qVar.d();
        }
        return p3325xe03a0797.p3326xc267989b.s.f392113a;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t
    /* renamed from: toString */
    public java.lang.String mo144017x9616526c() {
        return "ReceiveHasNext@" + p3325xe03a0797.p3326xc267989b.c1.a(this);
    }

    @Override // u26.s0
    public yz5.l u(java.lang.Object obj) {
        yz5.l lVar = this.f505675g.f505666a.f505714d;
        if (lVar != null) {
            return new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.c0(lVar, obj, ((p3325xe03a0797.p3326xc267989b.r) this.f505676h).f392110e);
        }
        return null;
    }

    @Override // u26.s0
    public void w(u26.e0 e0Var) {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 w17;
        java.lang.Throwable th6 = e0Var.f505681g;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f505676h;
        if (th6 == null) {
            w17 = ((p3325xe03a0797.p3326xc267989b.r) qVar).w(java.lang.Boolean.FALSE, null, null);
        } else {
            java.lang.Throwable A = e0Var.A();
            p3325xe03a0797.p3326xc267989b.r rVar = (p3325xe03a0797.p3326xc267989b.r) qVar;
            rVar.getClass();
            w17 = rVar.w(new p3325xe03a0797.p3326xc267989b.e0(A, false, 2, null), null, null);
        }
        if (w17 != null) {
            this.f505675g.f505667b = e0Var;
            ((p3325xe03a0797.p3326xc267989b.r) qVar).e(w17);
        }
    }
}
