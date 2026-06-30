package u26;

/* loaded from: classes14.dex */
public class b extends u26.s0 {

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.q f505670g;

    /* renamed from: h, reason: collision with root package name */
    public final int f505671h;

    public b(p3325xe03a0797.p3326xc267989b.q qVar, int i17) {
        this.f505670g = qVar;
        this.f505671h = i17;
    }

    @Override // u26.u0
    public void g(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.r rVar = (p3325xe03a0797.p3326xc267989b.r) this.f505670g;
        rVar.h(rVar.f72727xdec89770);
    }

    @Override // u26.u0
    public p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 h(java.lang.Object obj, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.q qVar) {
        if (((p3325xe03a0797.p3326xc267989b.r) this.f505670g).w(this.f505671h == 1 ? new u26.c0(obj) : obj, qVar != null ? qVar.f392051c : null, u(obj)) == null) {
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
        return "ReceiveElement@" + p3325xe03a0797.p3326xc267989b.c1.a(this) + "[receiveMode=" + this.f505671h + ']';
    }

    @Override // u26.s0
    public void w(u26.e0 e0Var) {
        int i17 = this.f505671h;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f505670g;
        if (i17 == 1) {
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new u26.c0(new u26.a0(e0Var.f505681g))));
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(e0Var.A())));
        }
    }
}
