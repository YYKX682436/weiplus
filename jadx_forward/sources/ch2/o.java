package ch2;

/* loaded from: classes3.dex */
public final class o implements mh2.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ch2.q f122948a;

    public o(ch2.q qVar) {
        this.f122948a = qVar;
    }

    @Override // mh2.y
    public p3325xe03a0797.p3326xc267989b.y0 a() {
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f122948a.f122971n;
        if (y0Var != null) {
            return y0Var;
        }
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        return p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a));
    }

    @Override // mh2.y
    public void b(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ya2.b2 b17 = ya2.h.f542017a.b(((mm2.c1) this.f122948a.m56788xbba4bfc0(mm2.c1.class)).f410385o);
        if (b17 != null) {
            zl2.r4.f555483a.Y(b17.y0(), new ch2.n(callback));
        }
    }

    @Override // mh2.y
    public java.lang.String c() {
        ya2.g gVar = ya2.h.f542017a;
        mm2.c1 c1Var = (mm2.c1) this.f122948a.m56788xbba4bfc0(mm2.c1.class);
        ya2.b2 b17 = gVar.b(c1Var != null ? c1Var.f410385o : null);
        return b17 != null ? b17.y0() : "";
    }
}
