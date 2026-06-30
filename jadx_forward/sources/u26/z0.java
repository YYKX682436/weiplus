package u26;

/* loaded from: classes14.dex */
public class z0 extends u26.w0 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f505735g;

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.q f505736h;

    public z0(java.lang.Object obj, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f505735g = obj;
        this.f505736h = qVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t
    /* renamed from: toString */
    public java.lang.String mo144017x9616526c() {
        return getClass().getSimpleName() + '@' + p3325xe03a0797.p3326xc267989b.c1.a(this) + '(' + this.f505735g + ')';
    }

    @Override // u26.w0
    public void u() {
        p3325xe03a0797.p3326xc267989b.r rVar = (p3325xe03a0797.p3326xc267989b.r) this.f505736h;
        rVar.h(rVar.f72727xdec89770);
    }

    @Override // u26.w0
    public java.lang.Object w() {
        return this.f505735g;
    }

    @Override // u26.w0
    public void x(u26.e0 e0Var) {
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        java.lang.Throwable th6 = e0Var.f505681g;
        if (th6 == null) {
            th6 = new u26.g0("Channel was closed");
        }
        ((p3325xe03a0797.p3326xc267989b.r) this.f505736h).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6)));
    }

    @Override // u26.w0
    public p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 y(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.q qVar) {
        if (((p3325xe03a0797.p3326xc267989b.r) this.f505736h).w(jz5.f0.f384359a, qVar != null ? qVar.f392051c : null, null) == null) {
            return null;
        }
        if (qVar != null) {
            qVar.d();
        }
        return p3325xe03a0797.p3326xc267989b.s.f392113a;
    }
}
