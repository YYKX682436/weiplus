package rv0;

/* loaded from: classes5.dex */
public abstract class a4 {
    public static final void a(ex0.a0 a0Var, rv0.n1 n1Var) {
        boolean y17 = a0Var.y();
        rv0.j jVar = (rv0.j) n1Var.f150773i;
        if (jVar != null) {
            jVar.J(y17);
        }
    }

    public static final void b(rv0.n1 n1Var, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a) {
        ug.m mVar;
        ex0.a0 s76 = n1Var.s7();
        if (s76 != null && s76.e(c4128x879fba0a)) {
            java.util.Iterator it = ((java.util.ArrayList) s76.f338630g.f338710e).iterator();
            while (it.hasNext()) {
                ex0.r rVar = (ex0.r) it.next();
                if ((rVar instanceof ex0.f) && (mVar = rVar.f338702c) != ug.m.Transition) {
                    if (mVar == ug.m.ImageClip) {
                        ((ex0.f) rVar).y(c4128x879fba0a);
                    } else if (rVar.j().m33971xf922bec1(c4128x879fba0a)) {
                        ((ex0.f) rVar).y(c4128x879fba0a);
                    } else {
                        ex0.f fVar = (ex0.f) rVar;
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7 c4183xefcb50b7 = fVar.f338663f;
                        c4183xefcb50b7.getClass();
                        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
                        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4183xefcb50b7.D();
                        if (D != null) {
                            c4128x879fba0a2 = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7.X(c4183xefcb50b7, D);
                        }
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c4128x879fba0a2, "getTailExpandableDuration(...)");
                        if (rVar.j().add(c4128x879fba0a2).m33971xf922bec1(c4128x879fba0a)) {
                            fVar.y(c4128x879fba0a);
                        } else {
                            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a add = rVar.j().add(c4128x879fba0a2);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(add, "add(...)");
                            fVar.y(add);
                            fVar.z(c4128x879fba0a);
                        }
                    }
                }
            }
            gx0.kh q76 = n1Var.q7();
            java.lang.String string = n1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574038lm0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            q76.r7(string, null);
            p3325xe03a0797.p3326xc267989b.l.d(n1Var.m158345xefc66565(), null, null, new rv0.w3(n1Var, s76, null), 3, null);
        }
    }

    public static final void c(rv0.n1 n1Var) {
        int i17;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(n1Var, "<this>");
        ex0.a0 s76 = n1Var.s7();
        if (s76 == null) {
            return;
        }
        wv0.q qVar = new wv0.q(n1Var.m80379x76847179());
        java.util.List list = s76.f338630g.f338710e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            ug.m mVar = ((ex0.r) next).f338702c;
            if (((mVar == ug.m.ImageClip || mVar == ug.m.MovieClip || mVar == ug.m.VideoClip) ? 1 : 0) != 0) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            dx0.g gVar = s76.H;
            if (!hasNext) {
                qVar.N(arrayList2);
                java.util.Iterator it7 = arrayList2.iterator();
                while (it7.hasNext()) {
                    p3325xe03a0797.p3326xc267989b.l.d(n1Var.m158345xefc66565(), null, null, new wv0.a(gVar, (vv0.n) it7.next(), null), 3, null);
                }
                ex0.r n17 = s76.n();
                if (n17 != null && (c3971x241f78 = n17.f338701b) != null) {
                    qVar.M(c3971x241f78);
                }
                qVar.m47074x209a1f1f(java.lang.Boolean.TRUE);
                qVar.H();
                qVar.m174526xe19ba6a5(new wv0.b(n1Var));
                qVar.m174527x5da0fb81(new wv0.c(s76, n1Var));
                qVar.m174530x15f71fe6(new wv0.d(s76, qVar));
                qVar.m174528x3069b5f1(new wv0.f(n1Var, s76));
                qVar.m174529x47bc3db5(new wv0.g(s76, n1Var));
                qVar.I(new wv0.h(qVar, n1Var), new wv0.i(qVar, n1Var));
                qVar.m47073x32851f53(new wv0.j(qVar, n1Var));
                s76.A.mo7806x9d92d11c(n1Var.W6(), new wv0.k(qVar, s76));
                n1Var.g7(qVar);
                return;
            }
            java.lang.Object next2 = it6.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f782 = ((ex0.r) next2).f338701b;
            arrayList2.add(new vv0.n(c3971x241f782, gVar.d(c3971x241f782), i18, false, false, 24, null));
            i17 = i18;
        }
    }
}
