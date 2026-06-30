package et1;

/* loaded from: classes12.dex */
public final class f extends et1.g implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final et1.a f338102d;

    public f(et1.a sendMsgInterceptorsImpl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sendMsgInterceptorsImpl, "sendMsgInterceptorsImpl");
        this.f338102d = sendMsgInterceptorsImpl;
        gm0.j1.n().f354821b.a(3862, this);
    }

    @Override // et1.g, et1.l
    public w11.m1 c(w11.r1 r1Var) {
        w11.m1 m1Var = new w11.m1();
        if (r1Var instanceof m11.m1) {
            m11.m1 m1Var2 = (m11.m1) r1Var;
            int i17 = m1Var2.f523667i;
            if (i17 != 1 && i17 == 4) {
                et1.a aVar = this.f338102d;
                if (!aVar.o(r1Var)) {
                    return super.c(r1Var);
                }
                java.lang.String field_toUser = m1Var2.f404286r.f69563x1209e7cb;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_toUser, "field_toUser");
                m1Var2.f523660b = aVar.t(field_toUser);
                m1Var2.f523661c = aVar.s(field_toUser);
                wf0.n1 n1Var = (wf0.n1) i95.n0.c(wf0.n1.class);
                java.lang.String str = m1Var2.f523674p;
                int i18 = m1Var2.f404285q;
                dn.h hVar = m1Var2.f404286r;
                m11.a0 a0Var = m1Var2.f404287s;
                ((vf0.q1) n1Var).getClass();
                m1Var.f523621a = new dt1.g(aVar.r(), field_toUser, m1Var2.f523661c, m1Var2.f523660b, new t21.q1(str, i18, hVar, a0Var));
            }
            return super.c(r1Var);
        }
        return m1Var;
    }

    @Override // et1.g, et1.l
    public w11.m1 f(w11.r1 r1Var) {
        w11.m1 m1Var = new w11.m1();
        if (r1Var instanceof m11.d) {
            m11.d dVar = (m11.d) r1Var;
            java.lang.String str = dVar.f523660b;
            et1.a aVar = this.f338102d;
            java.lang.String t17 = aVar.t(str);
            dVar.f523661c = aVar.s(str);
            m1Var.f523621a = new dt1.c(aVar.r(), str, dVar.f523661c, t17, dVar);
        }
        return m1Var;
    }

    @Override // et1.g, et1.l
    public w11.m1 l(w11.r1 r1Var) {
        return new w11.m1();
    }

    @Override // et1.g, et1.l
    public w11.m1 m(w11.r1 r1Var) {
        w11.m1 m1Var = new w11.m1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1Var);
        java.lang.String str = r1Var.f523660b;
        et1.a aVar = this.f338102d;
        java.lang.String t17 = aVar.t(str);
        r1Var.f523661c = aVar.s(str);
        dt1.f fVar = new dt1.f(aVar.r(), str, r1Var.f523661c, t17, r1Var.f523662d, r1Var.f523665g);
        m1Var.f523622b = fVar.f324686p.m124847x74d37ac6();
        m1Var.f523621a = fVar;
        return m1Var;
    }

    @Override // et1.g, et1.l
    public void n() {
        gm0.j1.n().f354821b.q(3862, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof dt1.a) {
            r45.fr frVar = ((dt1.a) m1Var).f324661g.f465750e;
            int i19 = frVar.f456088d;
            this.f338102d.u(frVar.f456090f, i17, i18, str, m1Var);
        }
    }
}
