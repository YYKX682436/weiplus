package vf0;

/* loaded from: classes12.dex */
public final class q2 extends jm0.g implements wf0.j1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(jm0.o service) {
        super(service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).Zi(this);
    }

    @Override // jm0.g
    public void S6() {
        ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).mj(this);
    }

    @Override // wf0.j1
    public void l1(qi3.e0 event) {
        vf0.h3 h3Var;
        t21.v2 d17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        zf0.v0 v0Var = (zf0.v0) event.f445225b;
        if (v0Var == null || (h3Var = v0Var.f554096i) == null || !vf0.m3.j(event)) {
            return;
        }
        pt0.e0 e0Var = pt0.f0.f439742b1;
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = event.f445230g;
        java.lang.String a17 = c16564xb55e1d5 != null ? c16564xb55e1d5.a() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d52 = event.f445230g;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(a17, c16564xb55e1d52 != null ? c16564xb55e1d52.f231013d : 0L);
        if (k17 == null || (d17 = vf0.m3.d(k17)) == null) {
            return;
        }
        tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
        bm5.f0 f0Var = bm5.f0.f104104s;
        java.lang.String rj6 = ((k90.b) u0Var).rj(null, f0Var, d17.d(), false);
        vf0.g3 h17 = vf0.m3.h(((t21.i2) ((wf0.m1) i95.n0.c(wf0.m1.class))).Ai(new wf0.l1(d17.d(), f0Var)));
        ci0.r rVar = (ci0.r) i95.n0.c(ci0.r.class);
        long j17 = d17.f496537c;
        java.lang.String str = h3Var.f517707a;
        int i17 = h17.f517703a;
        y15.c n17 = h3Var.f517712f.n();
        ((pc0.g) rVar).wi(rj6, j17, str, i17, n17.m75939xb282bd08(n17.f540455d + 22));
    }
}
