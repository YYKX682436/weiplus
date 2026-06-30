package bt3;

/* loaded from: classes9.dex */
public abstract class x2 {
    public static final void a(s15.w recordInfoItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordInfoItem, "recordInfoItem");
        java.util.Iterator it = recordInfoItem.j().iterator();
        while (it.hasNext()) {
            s15.l r17 = ((s15.h) it.next()).r();
            if (r17 != null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ui(r17);
            }
        }
    }

    public static final void b(s15.w infoItem) {
        s15.w j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoItem, "infoItem");
        for (s15.h hVar : infoItem.j()) {
            if (hVar.m75945x2fec8307(hVar.f384955d + 3).length() < 32) {
                java.lang.String obj = hVar.toString();
                int i17 = hVar.f384955d;
                java.lang.String p17 = bt3.g2.p(obj, hVar.m75939xb282bd08(i17 + 2));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "genDataId(...)");
                hVar.set(i17 + 3, p17);
            }
            s15.i0 H = hVar.H();
            if (H != null && (j17 = H.j()) != null) {
                b(j17);
            }
        }
    }

    public static final r45.gp0 c(s15.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hVar, "<this>");
        r45.gp0 gp0Var = new r45.gp0();
        int i17 = hVar.f384955d;
        gp0Var.e0(hVar.m75945x2fec8307(i17 + 3));
        gp0Var.O0(hVar.m75945x2fec8307(i17 + 0));
        gp0Var.h0(hVar.m75939xb282bd08(i17 + 2));
        gp0Var.i0(hVar.n());
        gp0Var.g0(hVar.o());
        gp0Var.m0(hVar.m75945x2fec8307(i17 + 1));
        gp0Var.G0(hVar.L());
        gp0Var.c0(hVar.m75945x2fec8307(i17 + 5));
        gp0Var.d0(hVar.m75945x2fec8307(i17 + 4));
        gp0Var.a0(hVar.m75945x2fec8307(i17 + 9));
        gp0Var.b0(hVar.m75945x2fec8307(i17 + 8));
        gp0Var.f456942f2 = hVar.Z();
        gp0Var.f456946h2 = hVar.b0();
        gp0Var.f456938d2 = hVar.c0();
        gp0Var.f456940e2 = hVar.Y();
        gp0Var.f456944g2 = hVar.a0();
        gp0Var.p0(hVar.m75945x2fec8307(i17 + 10));
        gp0Var.q0(hVar.m75942xfb822ef2(i17 + 11));
        gp0Var.N0(hVar.m75945x2fec8307(i17 + 6));
        gp0Var.L0(hVar.m75942xfb822ef2(i17 + 7));
        return gp0Var;
    }

    public static final s15.v d(r45.mv2 mv2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mv2Var, "<this>");
        s15.v vVar = new s15.v();
        java.lang.String m75945x2fec8307 = mv2Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        vVar.r(m75945x2fec8307);
        vVar.u(mv2Var.m75939xb282bd08(1));
        java.lang.String m75945x2fec83072 = mv2Var.m75945x2fec8307(2);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        vVar.p(m75945x2fec83072);
        java.lang.String m75945x2fec83073 = mv2Var.m75945x2fec8307(3);
        if (m75945x2fec83073 == null) {
            m75945x2fec83073 = "";
        }
        vVar.o(m75945x2fec83073);
        java.lang.String m75945x2fec83074 = mv2Var.m75945x2fec8307(5);
        if (m75945x2fec83074 == null) {
            m75945x2fec83074 = "";
        }
        vVar.q(m75945x2fec83074);
        r45.hv2 hv2Var = (r45.hv2) mv2Var.m75936x14adae67(4);
        if (hv2Var != null) {
            s15.u uVar = new s15.u();
            java.lang.String m75945x2fec83075 = hv2Var.m75945x2fec8307(0);
            if (m75945x2fec83075 == null) {
                m75945x2fec83075 = "";
            }
            uVar.l(m75945x2fec83075);
            uVar.k(hv2Var.m75938x746dc8a6(1));
            uVar.j(hv2Var.m75938x746dc8a6(2));
            vVar.t(uVar);
        }
        r45.ht0 ht0Var = (r45.ht0) mv2Var.m75936x14adae67(6);
        if (ht0Var != null) {
            s15.t tVar = new s15.t();
            java.lang.String m75945x2fec83076 = ht0Var.m75945x2fec8307(0);
            if (m75945x2fec83076 == null) {
                m75945x2fec83076 = "";
            }
            tVar.q(m75945x2fec83076);
            java.lang.String m75945x2fec83077 = ht0Var.m75945x2fec8307(1);
            if (m75945x2fec83077 == null) {
                m75945x2fec83077 = "";
            }
            tVar.o(m75945x2fec83077);
            java.lang.String m75945x2fec83078 = ht0Var.m75945x2fec8307(2);
            if (m75945x2fec83078 == null) {
                m75945x2fec83078 = "";
            }
            tVar.l(m75945x2fec83078);
            tVar.n(ht0Var.m75942xfb822ef2(4));
            java.lang.String m75945x2fec83079 = ht0Var.m75945x2fec8307(5);
            tVar.p(m75945x2fec83079 != null ? m75945x2fec83079 : "");
            vVar.s(tVar);
        }
        return vVar;
    }

    public static final s15.h e(r45.gp0 gp0Var) {
        r45.wp0 t17;
        r45.ev2 e17;
        r45.op0 o17;
        r45.km6 w17;
        r45.xs4 s17;
        r45.dp0 b17;
        r45.mq0 x17;
        r45.aq0 u17;
        r45.qp0 r17;
        r45.dv2 f17;
        r45.jv2 k17;
        r45.mv2 n17;
        r45.mv2 d17;
        bw5.g9 l17;
        r45.hd2 j17;
        r45.g92 i17;
        r45.kv2 g17;
        r45.tq0 y17;
        r45.qp0 q17;
        r45.pp0 p17;
        r45.ip0 c17;
        java.lang.String str;
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gp0Var, "<this>");
        s15.h hVar = new s15.h();
        int l18 = gp0Var.l();
        int i18 = hVar.f384955d;
        hVar.set(i18 + 2, java.lang.Integer.valueOf(l18));
        hVar.n0(gp0Var.O());
        java.lang.String i19 = gp0Var.i();
        if (i19 == null) {
            i19 = "";
        }
        hVar.set(i18 + 3, i19);
        java.lang.String z17 = gp0Var.z();
        if (z17 == null) {
            z17 = "";
        }
        hVar.E0(z17);
        hVar.k0(gp0Var.o());
        java.lang.String k18 = gp0Var.k();
        if (k18 == null) {
            k18 = "";
        }
        hVar.l0(k18);
        java.lang.String n18 = gp0Var.n();
        if (n18 == null) {
            n18 = "";
        }
        hVar.j0(n18);
        java.lang.String m161633x7531c8a2 = gp0Var.m161633x7531c8a2();
        if (m161633x7531c8a2 == null) {
            m161633x7531c8a2 = "";
        }
        hVar.set(i18 + 0, m161633x7531c8a2);
        java.lang.String s18 = gp0Var.s();
        if (s18 == null) {
            s18 = "";
        }
        hVar.set(i18 + 1, s18);
        java.lang.String g18 = gp0Var.g();
        if (g18 == null) {
            g18 = "";
        }
        hVar.set(i18 + 4, g18);
        hVar.e1(gp0Var.m161632x877bf986());
        hVar.d1(gp0Var.m161631x4e343d67());
        java.lang.String d18 = gp0Var.d();
        if (d18 == null) {
            d18 = "";
        }
        hVar.set(i18 + 8, d18);
        java.lang.String f18 = gp0Var.f();
        if (f18 == null) {
            f18 = "";
        }
        hVar.set(i18 + 5, f18);
        java.lang.String c18 = gp0Var.c();
        if (c18 == null) {
            c18 = "";
        }
        hVar.set(i18 + 9, c18);
        hVar.i0(gp0Var.e());
        hVar.o0(gp0Var.t());
        java.lang.String N = gp0Var.N();
        if (N == null) {
            N = "";
        }
        hVar.b1(N);
        java.lang.String K = gp0Var.K();
        if (K == null) {
            K = "";
        }
        hVar.Y0(K);
        java.lang.String L = gp0Var.L();
        if (L == null) {
            L = "";
        }
        hVar.Z0(L);
        java.lang.String u18 = gp0Var.u();
        if (u18 == null) {
            u18 = "";
        }
        hVar.set(i18 + 12, u18);
        java.lang.String w18 = gp0Var.w();
        if (w18 == null) {
            w18 = "";
        }
        hVar.set(i18 + 10, w18);
        java.lang.String y18 = gp0Var.y();
        if (y18 == null) {
            y18 = "";
        }
        hVar.D0(y18);
        hVar.set(i18 + 11, java.lang.Long.valueOf(gp0Var.x()));
        java.lang.String R = gp0Var.R();
        if (R == null) {
            R = "";
        }
        hVar.set(i18 + 6, R);
        java.lang.String Q = gp0Var.Q();
        if (Q == null) {
            Q = "";
        }
        hVar.c1(Q);
        hVar.set(i18 + 7, java.lang.Long.valueOf(gp0Var.P()));
        java.lang.String T = gp0Var.T();
        if (T == null) {
            T = "";
        }
        hVar.i1(T);
        java.lang.String S = gp0Var.S();
        if (S == null) {
            S = "";
        }
        hVar.h1(S);
        java.lang.String U = gp0Var.U();
        if (U == null) {
            U = "";
        }
        hVar.j1(U);
        java.lang.String V = gp0Var.V();
        if (V == null) {
            V = "";
        }
        hVar.k1(V);
        java.lang.String W = gp0Var.W();
        if (W == null) {
            W = "";
        }
        hVar.l1(W);
        java.lang.String Y = gp0Var.Y();
        if (Y == null) {
            Y = "";
        }
        hVar.a1(Y);
        java.lang.String r18 = gp0Var.r();
        if (r18 == null) {
            r18 = "";
        }
        hVar.U0(r18);
        java.lang.String p18 = gp0Var.p();
        if (p18 == null) {
            p18 = "";
        }
        hVar.S0(p18);
        java.lang.String H = gp0Var.H();
        if (H == null) {
            H = "";
        }
        hVar.Q0(H);
        java.lang.String I = gp0Var.I();
        if (I == null) {
            I = "";
        }
        hVar.R0(I);
        java.lang.String q18 = gp0Var.q();
        if (q18 == null) {
            q18 = "";
        }
        hVar.T0(q18);
        hVar.W0(bt3.h2.a(gp0Var));
        java.lang.String J2 = gp0Var.J();
        if (J2 == null) {
            J2 = "";
        }
        hVar.X0(J2);
        java.lang.String F = gp0Var.F();
        if (F == null) {
            F = "";
        }
        hVar.O0(F);
        java.lang.String G = gp0Var.G();
        if (G == null) {
            G = "";
        }
        hVar.P0(G);
        java.lang.String E = gp0Var.E();
        if (E != null) {
            if (!(E.length() > 0)) {
                E = null;
            }
            if (E != null) {
                s15.w wVar = new s15.w();
                wVar.m126728xdc93280d(E);
                s15.i0 i0Var = new s15.i0();
                i0Var.k(wVar);
                hVar.M0(i0Var);
            }
        }
        java.lang.String B = gp0Var.B();
        if (B == null) {
            B = "";
        }
        hVar.I0(B);
        hVar.C0(gp0Var.A());
        r45.hp0 j18 = gp0Var.j();
        if (j18 != null && (c17 = j18.c()) != null) {
            java.lang.String m161655x74292566 = c17.m161655x74292566();
            if (m161655x74292566 == null) {
                m161655x74292566 = "";
            }
            hVar.f0(m161655x74292566);
            java.lang.String m161656xfb821870 = c17.m161656xfb821870();
            if (m161656xfb821870 == null) {
                m161656xfb821870 = "";
            }
            hVar.F0(m161656xfb821870);
            java.lang.String b18 = c17.b();
            if (b18 == null) {
                b18 = "";
            }
            hVar.g0(b18);
            s15.i iVar = new s15.i();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.c()) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.e())) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17.c(), c17.e())) {
                    str = c17.c();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                } else {
                    str = c17.e();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                }
                java.lang.String Ai = ((m73.q) ((n73.e) i95.n0.c(n73.e.class))).Ai(str, 3);
                if (Ai == null) {
                    Ai = "";
                }
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(str)) {
                    Ai = Ai.concat("@weclaw");
                }
                iVar.o(Ai);
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.c())) {
                str = c17.c();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getFromUser(...)");
                java.lang.String Ai2 = ((m73.q) ((n73.e) i95.n0.c(n73.e.class))).Ai(str, 3);
                if (Ai2 == null) {
                    Ai2 = "";
                }
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(str)) {
                    Ai2 = Ai2.concat("@weclaw");
                }
                iVar.o(Ai2);
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.e())) {
                str = c17.e();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getRealChatName(...)");
                java.lang.String Ai3 = ((m73.q) ((n73.e) i95.n0.c(n73.e.class))).Ai(str, 3);
                if (Ai3 == null) {
                    Ai3 = "";
                }
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(str)) {
                    Ai3 = Ai3.concat("@weclaw");
                }
                iVar.o(Ai3);
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.d())) {
                str = "";
            } else {
                str = ((m73.q) ((n73.e) i95.n0.c(n73.e.class))).Di(c17.d(), 3);
                if (str == null) {
                    str = "";
                }
                java.lang.String d19 = c17.d();
                if (d19 == null) {
                    d19 = "";
                }
                iVar.o(d19);
            }
            if (!gp0Var.f456952l2 && (!r26.n0.N(str)) && (n07 = ((com.p314xaae8f345.mm.p943x351df9c2.s0) ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).Zi()).n0(str)) != null) {
                java.lang.String d27 = n07.d();
                if (d27 == null) {
                    d27 = "";
                }
                hVar.R0(d27);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.c())) {
                if (((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Di(c17.c())) {
                    java.lang.String c19 = c17.c();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getFromUser(...)");
                    iVar.n(c19);
                    java.lang.String Vi = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Vi(c17.c());
                    java.lang.String fj6 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(Vi, ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Ui(c17.c()));
                    if (fj6 == null) {
                        fj6 = "";
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("3552365301", Vi)) {
                        fj6 = "@".concat(fj6);
                    }
                    hVar.Q0(fj6);
                }
            }
            hVar.m0(iVar);
        }
        r45.hp0 j19 = gp0Var.j();
        if (j19 != null && (p17 = j19.p()) != null) {
            s15.y yVar = new s15.y();
            java.lang.String e18 = p17.e();
            if (e18 == null) {
                e18 = "";
            }
            yVar.s(e18);
            yVar.t(p17.f());
            yVar.u(p17.g());
            yVar.C(p17.p());
            java.lang.String o18 = p17.o();
            if (o18 == null) {
                o18 = "";
            }
            yVar.y(o18);
            java.lang.String n19 = p17.n();
            if (n19 == null) {
                n19 = "";
            }
            yVar.B(n19);
            java.lang.String j27 = p17.j();
            if (j27 == null) {
                j27 = "";
            }
            yVar.x(j27);
            java.lang.String i27 = p17.i();
            if (i27 == null) {
                i27 = "";
            }
            yVar.w(i27);
            java.lang.String k19 = p17.k();
            if (k19 == null) {
                k19 = "";
            }
            yVar.z(k19);
            yVar.A(p17.l());
            yVar.r(p17.d());
            java.lang.String b19 = p17.b();
            if (b19 == null) {
                b19 = "";
            }
            yVar.p(b19);
            java.lang.String c27 = p17.c();
            if (c27 == null) {
                c27 = "";
            }
            yVar.q(c27);
            hVar.H0(yVar);
        }
        r45.hp0 j28 = gp0Var.j();
        if (j28 != null && (y17 = j28.y()) != null) {
            s15.h0 h0Var = new s15.h0();
            java.lang.String b27 = y17.b();
            if (b27 == null) {
                b27 = "";
            }
            h0Var.t(b27);
            java.lang.String d28 = y17.d();
            if (d28 == null) {
                d28 = "";
            }
            h0Var.q(d28);
            java.lang.String m161748xd93f812f = y17.m161748xd93f812f();
            if (m161748xd93f812f == null) {
                m161748xd93f812f = "";
            }
            h0Var.x(m161748xd93f812f);
            java.lang.String m161749x7531c8a2 = y17.m161749x7531c8a2();
            if (m161749x7531c8a2 == null) {
                m161749x7531c8a2 = "";
            }
            h0Var.y(m161749x7531c8a2);
            h0Var.u(y17.g());
            h0Var.p(y17.c());
            h0Var.s(y17.f());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y17.e()) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.b())) {
                y17.k(((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.l0) ((o72.t3) i95.n0.c(o72.t3.class))).wi(gp0Var.b()));
            }
            java.lang.String e19 = y17.e();
            if (e19 == null) {
                e19 = "";
            }
            h0Var.r(e19);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.b())) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1898, 14);
            }
            r45.hp0 j29 = gp0Var.j();
            if (j29 != null && (q17 = j29.q()) != null) {
                s15.f fVar = new s15.f();
                java.lang.String str2 = q17.f465701m;
                if (str2 == null) {
                    str2 = "";
                }
                fVar.x(str2);
                java.lang.String str3 = q17.f465702n;
                if (str3 == null) {
                    str3 = "";
                }
                fVar.w(str3);
                java.lang.String str4 = q17.f465703o;
                if (str4 == null) {
                    str4 = "";
                }
                fVar.u(str4);
                java.lang.String str5 = q17.f465706r;
                if (str5 == null) {
                    str5 = "";
                }
                fVar.n(str5);
                fVar.q(q17.f465695d);
                fVar.s(q17.f465709u);
                fVar.r(q17.f465696e);
                fVar.z(q17.f465697f);
                fVar.y(q17.f465698g);
                fVar.t(q17.f465699h);
                fVar.o(q17.f465700i);
                fVar.p(q17.f465704p);
                h0Var.w(fVar);
            }
            hVar.n1(h0Var);
        }
        r45.hp0 j37 = gp0Var.j();
        if (j37 != null && (g17 = j37.g()) != null) {
            s15.o oVar = new s15.o();
            java.lang.String m75945x2fec8307 = g17.m75945x2fec8307(0);
            oVar.Y(m75945x2fec8307 == null ? "" : m75945x2fec8307);
            java.lang.String m75945x2fec83072 = g17.m75945x2fec8307(8);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            oVar.Z(m75945x2fec83072);
            oVar.O(g17.m75939xb282bd08(5));
            java.lang.String m75945x2fec83073 = g17.m75945x2fec8307(2);
            if (m75945x2fec83073 == null) {
                m75945x2fec83073 = "";
            }
            oVar.W(m75945x2fec83073);
            java.lang.String m75945x2fec83074 = g17.m75945x2fec8307(1);
            if (m75945x2fec83074 == null) {
                m75945x2fec83074 = "";
            }
            oVar.b0(m75945x2fec83074);
            java.lang.String m75945x2fec83075 = g17.m75945x2fec8307(3);
            if (m75945x2fec83075 == null) {
                m75945x2fec83075 = "";
            }
            oVar.B(m75945x2fec83075);
            java.lang.String m75945x2fec83076 = g17.m75945x2fec8307(4);
            if (m75945x2fec83076 == null) {
                m75945x2fec83076 = "";
            }
            oVar.N(m75945x2fec83076);
            oVar.S(g17.m75939xb282bd08(6));
            oVar.R(g17.m75942xfb822ef2(9));
            oVar.z(g17.m75939xb282bd08(13));
            java.lang.String m75945x2fec83077 = g17.m75945x2fec8307(14);
            if (m75945x2fec83077 == null) {
                m75945x2fec83077 = "";
            }
            oVar.A(m75945x2fec83077);
            java.util.LinkedList<r45.iv2> m75941xfb821914 = g17.m75941xfb821914(7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getMediaList(...)");
            for (r45.iv2 iv2Var : m75941xfb821914) {
                java.util.LinkedList t18 = oVar.t();
                s15.p pVar = new s15.p();
                pVar.o(iv2Var.m75939xb282bd08(0));
                java.lang.String m75945x2fec83078 = iv2Var.m75945x2fec8307(1);
                if (m75945x2fec83078 == null) {
                    m75945x2fec83078 = "";
                }
                pVar.q(m75945x2fec83078);
                java.lang.String m75945x2fec83079 = iv2Var.m75945x2fec8307(2);
                if (m75945x2fec83079 == null) {
                    m75945x2fec83079 = "";
                }
                pVar.p(m75945x2fec83079);
                java.lang.String m75945x2fec830710 = iv2Var.m75945x2fec8307(6);
                if (m75945x2fec830710 == null) {
                    m75945x2fec830710 = "";
                }
                pVar.l(m75945x2fec830710);
                java.lang.String m75945x2fec830711 = iv2Var.m75945x2fec8307(7);
                if (m75945x2fec830711 == null) {
                    m75945x2fec830711 = "";
                }
                pVar.k(m75945x2fec830711);
                pVar.s(iv2Var.m75938x746dc8a6(3));
                pVar.n(iv2Var.m75938x746dc8a6(4));
                pVar.r(iv2Var.m75939xb282bd08(5));
                t18.add(pVar);
            }
            s15.q qVar = new s15.q();
            java.lang.String m75945x2fec830712 = g17.m75945x2fec8307(10);
            if (m75945x2fec830712 == null) {
                m75945x2fec830712 = "";
            }
            qVar.k(m75945x2fec830712);
            java.lang.String m75945x2fec830713 = g17.m75945x2fec8307(11);
            if (m75945x2fec830713 == null) {
                m75945x2fec830713 = "";
            }
            qVar.l(m75945x2fec830713);
            oVar.U(qVar);
            java.lang.String m75945x2fec830714 = g17.m75945x2fec8307(12);
            if (m75945x2fec830714 == null) {
                m75945x2fec830714 = "";
            }
            oVar.H(m75945x2fec830714);
            java.lang.String m75945x2fec830715 = g17.m75945x2fec8307(15);
            if (m75945x2fec830715 == null) {
                m75945x2fec830715 = "";
            }
            oVar.G(m75945x2fec830715);
            java.lang.String m75945x2fec830716 = g17.m75945x2fec8307(16);
            if (m75945x2fec830716 == null) {
                m75945x2fec830716 = "";
            }
            oVar.F(m75945x2fec830716);
            java.lang.String m75945x2fec830717 = g17.m75945x2fec8307(17);
            if (m75945x2fec830717 == null) {
                m75945x2fec830717 = "";
            }
            oVar.I(m75945x2fec830717);
            oVar.C(g17.m75939xb282bd08(18));
            java.lang.String m75945x2fec830718 = g17.m75945x2fec8307(19);
            if (m75945x2fec830718 == null) {
                m75945x2fec830718 = "";
            }
            oVar.E(m75945x2fec830718);
            oVar.L(g17.m75939xb282bd08(20));
            java.lang.String m75945x2fec830719 = g17.m75945x2fec8307(21);
            if (m75945x2fec830719 == null) {
                m75945x2fec830719 = "";
            }
            oVar.K(m75945x2fec830719);
            java.lang.String m75945x2fec830720 = g17.m75945x2fec8307(22);
            if (m75945x2fec830720 == null) {
                m75945x2fec830720 = "";
            }
            oVar.P(m75945x2fec830720);
            java.lang.String m75945x2fec830721 = g17.m75945x2fec8307(23);
            if (m75945x2fec830721 == null) {
                m75945x2fec830721 = "";
            }
            oVar.J(m75945x2fec830721);
            r45.mv4 mv4Var = (r45.mv4) g17.m75936x14adae67(28);
            if (mv4Var != null) {
                s15.d dVar = new s15.d();
                dVar.k(mv4Var.m75939xb282bd08(0));
                r45.ik2 ik2Var = (r45.ik2) mv4Var.m75936x14adae67(2);
                if (ik2Var != null) {
                    s15.b bVar = new s15.b();
                    bVar.m75931xb5cb93b2(ik2Var.mo12245xcc313de3());
                    dVar.l(bVar);
                }
                oVar.V(dVar);
            }
            oVar.a0(g17.m75939xb282bd08(29));
            r45.gv2 gv2Var = (r45.gv2) g17.m75936x14adae67(30);
            oVar.Q(java.lang.String.valueOf(gv2Var != null ? gv2Var.mo12245xcc313de3() : null));
            hVar.u0(oVar);
        }
        r45.hp0 j38 = gp0Var.j();
        if (j38 != null && (i17 = j38.i()) != null) {
            s15.r rVar = new s15.r();
            java.lang.String m75945x2fec830722 = i17.m75945x2fec8307(0);
            if (m75945x2fec830722 == null) {
                m75945x2fec830722 = "";
            }
            rVar.C(m75945x2fec830722);
            java.lang.String m75945x2fec830723 = i17.m75945x2fec8307(1);
            if (m75945x2fec830723 == null) {
                m75945x2fec830723 = "";
            }
            rVar.G(m75945x2fec830723);
            java.lang.String m75945x2fec830724 = i17.m75945x2fec8307(2);
            if (m75945x2fec830724 == null) {
                m75945x2fec830724 = "";
            }
            rVar.F(m75945x2fec830724);
            java.lang.String m75945x2fec830725 = i17.m75945x2fec8307(3);
            if (m75945x2fec830725 == null) {
                m75945x2fec830725 = "";
            }
            rVar.R(m75945x2fec830725);
            java.lang.String m75945x2fec830726 = i17.m75945x2fec8307(4);
            if (m75945x2fec830726 == null) {
                m75945x2fec830726 = "";
            }
            rVar.t(m75945x2fec830726);
            java.lang.String m75945x2fec830727 = i17.m75945x2fec8307(12);
            if (m75945x2fec830727 == null) {
                m75945x2fec830727 = "";
            }
            rVar.E(m75945x2fec830727);
            java.lang.String m75945x2fec830728 = i17.m75945x2fec8307(11);
            if (m75945x2fec830728 == null) {
                m75945x2fec830728 = "";
            }
            rVar.H(m75945x2fec830728);
            rVar.B(i17.m75939xb282bd08(14));
            x05.n nVar = new x05.n();
            java.lang.String m75945x2fec830729 = i17.m75945x2fec8307(5);
            if (m75945x2fec830729 == null) {
                m75945x2fec830729 = "";
            }
            nVar.j(m75945x2fec830729);
            nVar.k(i17.m75938x746dc8a6(7));
            nVar.l(i17.m75938x746dc8a6(6));
            rVar.Q(nVar);
            rVar.O(i17.m75939xb282bd08(13));
            rVar.W(i17.m75939xb282bd08(15));
            rVar.N(i17.m75939xb282bd08(15));
            java.lang.String m75945x2fec830730 = i17.m75945x2fec8307(16);
            if (m75945x2fec830730 == null) {
                m75945x2fec830730 = "";
            }
            rVar.u(m75945x2fec830730);
            rVar.j(i17.m75939xb282bd08(18));
            java.lang.String m75945x2fec830731 = i17.m75945x2fec8307(17);
            if (m75945x2fec830731 == null) {
                m75945x2fec830731 = "";
            }
            rVar.k(m75945x2fec830731);
            rVar.l(i17.m75939xb282bd08(19));
            java.lang.String m75945x2fec830732 = i17.m75945x2fec8307(20);
            if (m75945x2fec830732 == null) {
                m75945x2fec830732 = "";
            }
            rVar.o(m75945x2fec830732);
            java.lang.String m75945x2fec830733 = i17.m75945x2fec8307(21);
            if (m75945x2fec830733 == null) {
                m75945x2fec830733 = "";
            }
            rVar.n(m75945x2fec830733);
            rVar.q(i17.m75939xb282bd08(22));
            java.lang.String m75945x2fec830734 = i17.m75945x2fec8307(25);
            if (m75945x2fec830734 == null) {
                m75945x2fec830734 = "";
            }
            rVar.L(m75945x2fec830734);
            java.lang.String m75945x2fec830735 = i17.m75945x2fec8307(26);
            if (m75945x2fec830735 == null) {
                m75945x2fec830735 = "";
            }
            rVar.P(m75945x2fec830735);
            java.lang.String m75945x2fec830736 = i17.m75945x2fec8307(27);
            if (m75945x2fec830736 == null) {
                m75945x2fec830736 = "";
            }
            rVar.p(m75945x2fec830736);
            java.lang.String m75945x2fec830737 = i17.m75945x2fec8307(28);
            if (m75945x2fec830737 == null) {
                m75945x2fec830737 = "";
            }
            rVar.T(m75945x2fec830737);
            java.lang.String m75945x2fec830738 = i17.m75945x2fec8307(29);
            if (m75945x2fec830738 == null) {
                m75945x2fec830738 = "";
            }
            rVar.z(m75945x2fec830738);
            java.lang.String m75945x2fec830739 = i17.m75945x2fec8307(30);
            if (m75945x2fec830739 == null) {
                m75945x2fec830739 = "";
            }
            rVar.x(m75945x2fec830739);
            java.lang.String m75945x2fec830740 = i17.m75945x2fec8307(31);
            if (m75945x2fec830740 == null) {
                m75945x2fec830740 = "";
            }
            rVar.y(m75945x2fec830740);
            java.lang.String m75945x2fec830741 = i17.m75945x2fec8307(32);
            if (m75945x2fec830741 == null) {
                m75945x2fec830741 = "";
            }
            rVar.S(m75945x2fec830741);
            java.lang.String m75945x2fec830742 = i17.m75945x2fec8307(33);
            if (m75945x2fec830742 == null) {
                m75945x2fec830742 = "";
            }
            rVar.A(m75945x2fec830742);
            java.lang.String m75945x2fec830743 = i17.m75945x2fec8307(34);
            if (m75945x2fec830743 == null) {
                m75945x2fec830743 = "";
            }
            rVar.Y(m75945x2fec830743);
            rVar.s(i17.m75939xb282bd08(35));
            java.lang.String m75945x2fec830744 = i17.m75945x2fec8307(36);
            if (m75945x2fec830744 == null) {
                m75945x2fec830744 = "";
            }
            rVar.r(m75945x2fec830744);
            rVar.U(i17.m75939xb282bd08(39));
            java.lang.String m75945x2fec830745 = i17.m75945x2fec8307(40);
            if (m75945x2fec830745 == null) {
                m75945x2fec830745 = "";
            }
            rVar.Z(m75945x2fec830745);
            rVar.K(i17.m75939xb282bd08(38));
            java.lang.String m75945x2fec830746 = i17.m75945x2fec8307(41);
            if (m75945x2fec830746 == null) {
                m75945x2fec830746 = "";
            }
            rVar.J(m75945x2fec830746);
            java.lang.String m75945x2fec830747 = i17.m75945x2fec8307(42);
            if (m75945x2fec830747 == null) {
                m75945x2fec830747 = "";
            }
            rVar.w(m75945x2fec830747);
            rVar.V(i17.m75939xb282bd08(44));
            r45.xz3 xz3Var = (r45.xz3) i17.m75936x14adae67(43);
            if (xz3Var != null) {
                x05.o oVar2 = new x05.o();
                oVar2.l(xz3Var.m75945x2fec8307(0));
                oVar2.n(xz3Var.m75945x2fec8307(1));
                rVar.I(oVar2);
            }
            hVar.v0(rVar);
        }
        r45.hp0 j39 = gp0Var.j();
        if (j39 != null && (j17 = j39.j()) != null) {
            s15.a aVar = new s15.a();
            java.lang.String m75945x2fec830748 = j17.m75945x2fec8307(0);
            if (m75945x2fec830748 == null) {
                m75945x2fec830748 = "";
            }
            aVar.n(m75945x2fec830748);
            java.lang.String m75945x2fec830749 = j17.m75945x2fec8307(1);
            if (m75945x2fec830749 == null) {
                m75945x2fec830749 = "";
            }
            aVar.o(m75945x2fec830749);
            java.lang.String m75945x2fec830750 = j17.m75945x2fec8307(2);
            if (m75945x2fec830750 == null) {
                m75945x2fec830750 = "";
            }
            aVar.l(m75945x2fec830750);
            java.lang.String m75945x2fec830751 = j17.m75945x2fec8307(3);
            if (m75945x2fec830751 == null) {
                m75945x2fec830751 = "";
            }
            aVar.p(m75945x2fec830751);
            hVar.w0(aVar);
        }
        r45.hp0 j47 = gp0Var.j();
        if (j47 != null && (l17 = j47.l()) != null) {
            s15.k kVar = new s15.k();
            java.lang.String b28 = l17.b();
            if (b28 == null) {
                b28 = "";
            }
            kVar.V(b28);
            java.lang.String m11974x8010e5e4 = l17.m11974x8010e5e4();
            if (m11974x8010e5e4 == null) {
                m11974x8010e5e4 = "";
            }
            kVar.g0(m11974x8010e5e4);
            boolean[] zArr = l17.R;
            java.lang.String str6 = zArr[4] ? l17.f109278g : "";
            if (str6 == null) {
                str6 = "";
            }
            kVar.Z(str6);
            java.lang.String str7 = zArr[5] ? l17.f109279h : "";
            if (str7 == null) {
                str7 = "";
            }
            kVar.T(str7);
            java.lang.String str8 = zArr[6] ? l17.f109280i : "";
            if (str8 == null) {
                str8 = "";
            }
            kVar.h0(str8);
            java.lang.String str9 = zArr[7] ? l17.f109281m : "";
            if (str9 == null) {
                str9 = "";
            }
            kVar.U(str9);
            java.lang.String f19 = l17.f();
            if (f19 == null) {
                f19 = "";
            }
            kVar.o0(f19);
            java.lang.String str10 = zArr[9] ? l17.f109283o : "";
            if (str10 == null) {
                str10 = "";
            }
            kVar.d0(str10);
            java.lang.String str11 = zArr[10] ? l17.f109284p : "";
            if (str11 == null) {
                str11 = "";
            }
            kVar.e0(str11);
            java.lang.String str12 = zArr[11] ? l17.f109285q : "";
            if (str12 == null) {
                str12 = "";
            }
            kVar.f0(str12);
            java.lang.String m11973x93d5ac12 = l17.m11973x93d5ac12();
            if (m11973x93d5ac12 == null) {
                m11973x93d5ac12 = "";
            }
            kVar.b0(m11973x93d5ac12);
            hVar.A0(kVar);
        }
        r45.hp0 j48 = gp0Var.j();
        if (j48 != null && (d17 = j48.d()) != null) {
            hVar.q0(d(d17));
        }
        r45.hp0 j49 = gp0Var.j();
        if (j49 != null && (n17 = j49.n()) != null) {
            hVar.B0(d(n17));
        }
        r45.hp0 j57 = gp0Var.j();
        if (j57 != null && (k17 = j57.k()) != null) {
            s15.s sVar = new s15.s();
            java.lang.String m75945x2fec830752 = k17.m75945x2fec8307(0);
            if (m75945x2fec830752 == null) {
                m75945x2fec830752 = "";
            }
            sVar.t(m75945x2fec830752);
            java.lang.String m75945x2fec830753 = k17.m75945x2fec8307(1);
            if (m75945x2fec830753 == null) {
                m75945x2fec830753 = "";
            }
            sVar.s(m75945x2fec830753);
            java.lang.String m75945x2fec830754 = k17.m75945x2fec8307(2);
            if (m75945x2fec830754 == null) {
                m75945x2fec830754 = "";
            }
            sVar.q(m75945x2fec830754);
            java.lang.String m75945x2fec830755 = k17.m75945x2fec8307(3);
            if (m75945x2fec830755 == null) {
                m75945x2fec830755 = "";
            }
            sVar.p(m75945x2fec830755);
            sVar.o(k17.m75939xb282bd08(4));
            java.lang.String m75945x2fec830756 = k17.m75945x2fec8307(7);
            if (m75945x2fec830756 == null) {
                m75945x2fec830756 = "";
            }
            sVar.r(m75945x2fec830756);
            hVar.z0(sVar);
        }
        r45.hp0 j58 = gp0Var.j();
        if (j58 != null && (f17 = j58.f()) != null) {
            s15.n nVar2 = new s15.n();
            java.lang.String m75945x2fec830757 = f17.m75945x2fec8307(0);
            if (m75945x2fec830757 == null) {
                m75945x2fec830757 = "";
            }
            nVar2.k(m75945x2fec830757);
            java.lang.String m75945x2fec830758 = f17.m75945x2fec8307(1);
            if (m75945x2fec830758 == null) {
                m75945x2fec830758 = "";
            }
            nVar2.s(m75945x2fec830758);
            java.lang.String m75945x2fec830759 = f17.m75945x2fec8307(2);
            if (m75945x2fec830759 == null) {
                m75945x2fec830759 = "";
            }
            nVar2.r(m75945x2fec830759);
            java.util.LinkedList m75941xfb8219142 = f17.m75941xfb821914(3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getThumbUrls(...)");
            int i28 = 0;
            for (java.lang.Object obj : m75941xfb8219142) {
                int i29 = i28 + 1;
                if (i28 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.String str13 = (java.lang.String) obj;
                if (i28 == 0) {
                    if (str13 == null) {
                        str13 = "";
                    }
                    nVar2.n(str13);
                } else if (i28 == 1) {
                    if (str13 == null) {
                        str13 = "";
                    }
                    nVar2.o(str13);
                } else if (i28 == 2) {
                    if (str13 == null) {
                        str13 = "";
                    }
                    nVar2.p(str13);
                } else if (i28 == 3) {
                    if (str13 == null) {
                        str13 = "";
                    }
                    nVar2.q(str13);
                }
                i28 = i29;
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = f17.m75934xbce7f2f(5);
            if (m75934xbce7f2f != null) {
                byte[] encode = android.util.Base64.encode(m75934xbce7f2f.g(), 0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encode, "encode(...)");
                nVar2.l(new java.lang.String(encode, r26.c.f450398a));
            }
            hVar.t0(nVar2);
        }
        r45.hp0 j59 = gp0Var.j();
        if (j59 != null && (r17 = j59.r()) != null) {
            s15.g gVar = new s15.g();
            java.lang.String str14 = r17.f465701m;
            if (str14 == null) {
                str14 = "";
            }
            gVar.w(str14);
            java.lang.String str15 = r17.f465708t;
            if (str15 == null) {
                str15 = "";
            }
            gVar.x(str15);
            java.lang.String str16 = r17.f465707s;
            if (str16 == null) {
                str16 = "";
            }
            gVar.r(str16);
            java.lang.String str17 = r17.f465702n;
            if (str17 == null) {
                str17 = "";
            }
            gVar.p(str17);
            java.lang.String str18 = r17.f465703o;
            if (str18 == null) {
                str18 = "";
            }
            gVar.o(str18);
            java.lang.String str19 = r17.f465706r;
            if (str19 == null) {
                str19 = "";
            }
            gVar.t(str19);
            gVar.u(r17.f465697f);
            gVar.s(r17.f465698g);
            gVar.q(r17.f465700i);
            hVar.h0(gVar);
        }
        r45.hp0 j66 = gp0Var.j();
        if (j66 != null && (u17 = j66.u()) != null) {
            s15.c0 c0Var = new s15.c0();
            c0Var.o(u17.m161569xfb85f7b0());
            java.lang.String m161568x7531c8a2 = u17.m161568x7531c8a2();
            if (m161568x7531c8a2 == null) {
                m161568x7531c8a2 = "";
            }
            c0Var.n(m161568x7531c8a2);
            java.lang.String b29 = u17.b();
            if (b29 == null) {
                b29 = "";
            }
            c0Var.j(b29);
            java.lang.String m161567xd93f812f = u17.m161567xd93f812f();
            if (m161567xd93f812f == null) {
                m161567xd93f812f = "";
            }
            c0Var.l(m161567xd93f812f);
            java.lang.String c28 = u17.c();
            if (c28 == null) {
                c28 = "";
            }
            c0Var.k(c28);
            hVar.L0(c0Var);
        }
        r45.hp0 j67 = gp0Var.j();
        if (j67 != null && (x17 = j67.x()) != null) {
            s15.e0 e0Var = new s15.e0();
            java.lang.String m161688x7531c8a2 = x17.m161688x7531c8a2();
            if (m161688x7531c8a2 == null) {
                m161688x7531c8a2 = "";
            }
            e0Var.l(m161688x7531c8a2);
            java.lang.String b37 = x17.b();
            if (b37 == null) {
                b37 = "";
            }
            e0Var.j(b37);
            java.lang.String m161687xd93f812f = x17.m161687xd93f812f();
            if (m161687xd93f812f == null) {
                m161687xd93f812f = "";
            }
            e0Var.k(m161687xd93f812f);
            java.lang.String c29 = x17.c();
            if (c29 == null) {
                c29 = "";
            }
            e0Var.n(c29);
            hVar.m1(e0Var);
        }
        r45.hp0 j68 = gp0Var.j();
        if (j68 != null && (b17 = j68.b()) != null) {
            s15.e eVar = new s15.e();
            java.lang.String str20 = b17.f454167d;
            if (str20 == null) {
                str20 = "";
            }
            eVar.z(str20);
            java.lang.String str21 = b17.f454168e;
            if (str21 == null) {
                str21 = "";
            }
            eVar.o(str21);
            eVar.t(b17.f454169f);
            java.lang.String str22 = b17.f454170g;
            if (str22 == null) {
                str22 = "";
            }
            eVar.q(str22);
            eVar.y(b17.f454171h);
            java.lang.String str23 = b17.f454172i;
            if (str23 == null) {
                str23 = "";
            }
            eVar.s(str23);
            java.lang.String str24 = b17.f454173m;
            if (str24 == null) {
                str24 = "";
            }
            eVar.w(str24);
            eVar.A(b17.f454174n);
            eVar.p(b17.f454175o);
            eVar.u(b17.f454179s);
            java.lang.String str25 = b17.f454177q;
            if (str25 == null) {
                str25 = "";
            }
            eVar.r(str25);
            eVar.x(b17.f454178r);
            hVar.e0(eVar);
        }
        r45.hp0 j69 = gp0Var.j();
        if (j69 != null && (s17 = j69.s()) != null) {
            s15.z zVar = new s15.z();
            java.lang.String m75945x2fec830760 = s17.m75945x2fec8307(0);
            if (m75945x2fec830760 == null) {
                m75945x2fec830760 = "";
            }
            zVar.F(m75945x2fec830760);
            java.lang.String m75945x2fec830761 = s17.m75945x2fec8307(1);
            if (m75945x2fec830761 == null) {
                m75945x2fec830761 = "";
            }
            zVar.E(m75945x2fec830761);
            java.lang.String m75945x2fec830762 = s17.m75945x2fec8307(2);
            if (m75945x2fec830762 == null) {
                m75945x2fec830762 = "";
            }
            zVar.x(m75945x2fec830762);
            java.lang.String m75945x2fec830763 = s17.m75945x2fec8307(3);
            if (m75945x2fec830763 == null) {
                m75945x2fec830763 = "";
            }
            zVar.B(m75945x2fec830763);
            java.lang.String m75945x2fec830764 = s17.m75945x2fec8307(4);
            if (m75945x2fec830764 == null) {
                m75945x2fec830764 = "";
            }
            zVar.H(m75945x2fec830764);
            java.lang.String m75945x2fec830765 = s17.m75945x2fec8307(5);
            if (m75945x2fec830765 == null) {
                m75945x2fec830765 = "";
            }
            zVar.w(m75945x2fec830765);
            java.lang.String m75945x2fec830766 = s17.m75945x2fec8307(7);
            if (m75945x2fec830766 == null) {
                m75945x2fec830766 = "";
            }
            zVar.C(m75945x2fec830766);
            zVar.A(s17.m75942xfb822ef2(8));
            java.lang.String m75945x2fec830767 = s17.m75945x2fec8307(9);
            if (m75945x2fec830767 == null) {
                m75945x2fec830767 = "";
            }
            zVar.z(m75945x2fec830767);
            zVar.u(s17.m75939xb282bd08(10));
            java.lang.String m75945x2fec830768 = s17.m75945x2fec8307(6);
            if (m75945x2fec830768 == null) {
                m75945x2fec830768 = "";
            }
            zVar.y(m75945x2fec830768);
            java.lang.String m75945x2fec830769 = s17.m75945x2fec8307(12);
            if (m75945x2fec830769 == null) {
                m75945x2fec830769 = "";
            }
            zVar.G(m75945x2fec830769);
            java.lang.String m75945x2fec830770 = s17.m75945x2fec8307(11);
            if (m75945x2fec830770 == null) {
                m75945x2fec830770 = "";
            }
            zVar.t(m75945x2fec830770);
            java.lang.String m75945x2fec830771 = s17.m75945x2fec8307(17);
            if (m75945x2fec830771 == null) {
                m75945x2fec830771 = "";
            }
            zVar.s(m75945x2fec830771);
            hVar.J0(zVar);
            s15.g0 g0Var = new s15.g0();
            g0Var.o(s17.m75939xb282bd08(18));
            java.lang.String m75945x2fec830772 = s17.m75945x2fec8307(19);
            if (m75945x2fec830772 == null) {
                m75945x2fec830772 = "";
            }
            g0Var.n(m75945x2fec830772);
            java.lang.String m75945x2fec830773 = s17.m75945x2fec8307(20);
            if (m75945x2fec830773 == null) {
                m75945x2fec830773 = "";
            }
            g0Var.l(m75945x2fec830773);
            hVar.g1(g0Var);
        }
        r45.hp0 j76 = gp0Var.j();
        if (j76 != null && (w17 = j76.w()) != null) {
            s15.f0 f0Var = new s15.f0();
            f0Var.n(w17.f460371d);
            java.lang.String str26 = w17.f460372e;
            if (str26 == null) {
                str26 = "";
            }
            f0Var.l(str26);
            java.lang.String str27 = w17.f460373f;
            if (str27 == null) {
                str27 = "";
            }
            f0Var.k(str27);
            hVar.f1(f0Var);
        }
        r45.hp0 j77 = gp0Var.j();
        if (j77 != null && (o17 = j77.o()) != null) {
            s15.x xVar = new s15.x();
            java.lang.String str28 = o17.f463948o;
            if (str28 == null) {
                str28 = "";
            }
            xVar.t(str28);
            java.lang.String str29 = o17.f463949p;
            if (str29 == null) {
                str29 = "";
            }
            xVar.u(str29);
            java.lang.String str30 = o17.f463950q;
            if (str30 == null) {
                str30 = "";
            }
            xVar.o(str30);
            xVar.w(o17.f463951r);
            hVar.G0(xVar);
        }
        r45.hp0 j78 = gp0Var.j();
        if (j78 != null && (e17 = j78.e()) != null) {
            s15.m mVar = new s15.m();
            mVar.y(e17.m75939xb282bd08(4));
            mVar.x(e17.m75939xb282bd08(5));
            mVar.A(e17.m75939xb282bd08(6));
            mVar.B(e17.m75939xb282bd08(7));
            java.lang.String m75945x2fec830774 = e17.m75945x2fec8307(1);
            if (m75945x2fec830774 == null) {
                m75945x2fec830774 = "";
            }
            mVar.E(m75945x2fec830774);
            java.lang.String a17 = bt3.w2.a(e17.m75942xfb822ef2(0));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "toUnsignedString(...)");
            mVar.w(a17);
            java.lang.String m75945x2fec830775 = e17.m75945x2fec8307(3);
            if (m75945x2fec830775 == null) {
                m75945x2fec830775 = "";
            }
            mVar.C(m75945x2fec830775);
            java.lang.String m75945x2fec830776 = e17.m75945x2fec8307(2);
            if (m75945x2fec830776 == null) {
                m75945x2fec830776 = "";
            }
            mVar.u(m75945x2fec830776);
            java.lang.String m75945x2fec830777 = e17.m75945x2fec8307(8);
            if (m75945x2fec830777 == null) {
                m75945x2fec830777 = "";
            }
            mVar.s(m75945x2fec830777);
            java.lang.String m75945x2fec830778 = e17.m75945x2fec8307(9);
            if (m75945x2fec830778 == null) {
                m75945x2fec830778 = "";
            }
            mVar.z(m75945x2fec830778);
            java.lang.String m75945x2fec830779 = e17.m75945x2fec8307(10);
            if (m75945x2fec830779 == null) {
                m75945x2fec830779 = "";
            }
            mVar.t(m75945x2fec830779);
            java.lang.String m75945x2fec830780 = e17.m75945x2fec8307(11);
            if (m75945x2fec830780 == null) {
                m75945x2fec830780 = "";
            }
            mVar.r(m75945x2fec830780);
            mVar.q(e17.m75939xb282bd08(12));
            hVar.r0(mVar);
        }
        r45.hp0 j79 = gp0Var.j();
        if (j79 != null && (t17 = j79.t()) != null) {
            s15.b0 b0Var = new s15.b0();
            java.lang.String str31 = t17.f470892d;
            if (str31 == null) {
                str31 = "";
            }
            b0Var.o(str31);
            java.lang.String str32 = t17.f470893e;
            if (str32 == null) {
                str32 = "";
            }
            b0Var.n(str32);
            java.lang.String str33 = t17.f470894f;
            b0Var.j(str33 != null ? str33 : "");
            b0Var.l(t17.f470895g);
            b0Var.k(t17.f470896h);
            hVar.K0(b0Var);
        }
        return hVar;
    }

    public static final l15.c f(ot0.q qVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qVar, "<this>");
        l15.c cVar = new l15.c();
        v05.b bVar = new v05.b();
        java.lang.String str = qVar.f430179d;
        if (str == null) {
            str = "";
        }
        int i17 = bVar.f449898d;
        bVar.set(i17 + 0, str);
        bVar.set(i17 + 1, java.lang.Integer.valueOf(qVar.f430183e));
        java.lang.String str2 = qVar.f430187f;
        if (str2 == null) {
            str2 = "";
        }
        bVar.set(i17 + 2, str2);
        java.lang.String str3 = qVar.f430191g;
        if (str3 == null) {
            str3 = "";
        }
        bVar.set(i17 + 3, str3);
        java.lang.String str4 = qVar.f430216m0;
        if (str4 == null) {
            str4 = "";
        }
        bVar.set(i17 + 4, str4);
        java.lang.String str5 = qVar.f430195h;
        if (str5 == null) {
            str5 = "";
        }
        bVar.set(i17 + 5, str5);
        bVar.set(i17 + 6, java.lang.Integer.valueOf(qVar.f430199i));
        bVar.set(i17 + 7, java.lang.Integer.valueOf(qVar.f430167J));
        java.lang.String str6 = qVar.f430219n;
        if (str6 == null) {
            str6 = "";
        }
        bVar.set(i17 + 8, str6);
        java.lang.String str7 = qVar.f430207k;
        if (str7 == null) {
            str7 = "";
        }
        bVar.set(i17 + 9, str7);
        java.lang.String str8 = qVar.f430196h0;
        bVar.set(bVar.f513848e + 44, str8 != null ? str8 : "");
        cVar.q(bVar);
        return cVar;
    }

    public static final java.lang.String g(int i17, java.lang.String str, boolean z17, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4 = "";
        if ((str2 == null || r26.n0.N(str2)) || str == null) {
            return "";
        }
        try {
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) || z17) {
                str3 = str2;
            } else {
                java.util.List g17 = new r26.t("\n").g(str2, 2);
                str4 = ((java.lang.String) g17.get(0)) + '\n';
                str3 = (java.lang.String) g17.get(1);
            }
            i95.m c17 = i95.n0.c(ct.r2.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            return str4 + (te5.h.f500182a.c() ? i(i17, str3) : h(i17, str3));
        } catch (java.lang.Exception e17) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(i17);
            int length = str2.length();
            if (length > 500) {
                length = 500;
            }
            objArr[1] = str2.subSequence(0, length);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Xml.RecordSerializeUtil", e17, "trimMsgContentRecordXml source:%s originXml:%s", objArr);
            return str2;
        }
    }

    public static final java.lang.String h(int i17, java.lang.String str) {
        long c17 = c01.id.c();
        if (str == null || r26.n0.N(str)) {
            return "";
        }
        int length = str.length();
        v05.b bVar = new v05.b();
        bVar.m126728xdc93280d(str);
        s15.w wVar = new s15.w();
        int i18 = bVar.f513848e + 44;
        wVar.m126728xdc93280d(bVar.m75945x2fec8307(i18));
        b(wVar);
        a(wVar);
        bVar.set(i18, wVar.m126747x696739c());
        java.lang.String m126747x696739c = bVar.m126747x696739c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Xml.RecordSerializeUtil", "trim record xml source:" + i17 + " before:" + length + " after:" + m126747x696739c.length() + " trimPer: %.02f cost:" + (c01.id.c() - c17), java.lang.Float.valueOf(((length - r3) * 100.0f) / length));
        return m126747x696739c;
    }

    public static final java.lang.String i(int i17, java.lang.String str) {
        long c17 = c01.id.c();
        java.lang.String str2 = "";
        if (str == null || r26.n0.N(str)) {
            return "";
        }
        int length = str.length();
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(str);
        v05.b k17 = cVar.k();
        if (k17 != null) {
            int i18 = k17.f513848e + 44;
            java.lang.String m75945x2fec8307 = k17.m75945x2fec8307(i18);
            s15.w wVar = new s15.w();
            wVar.m126728xdc93280d(m75945x2fec8307);
            b(wVar);
            a(wVar);
            k17.set(i18, wVar.m126747x696739c());
            java.lang.String m126747x696739c = cVar.m126747x696739c();
            if (m126747x696739c != null) {
                str2 = m126747x696739c;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Xml.RecordSerializeUtil", "trim record xml new source:" + i17 + " before:" + length + " after:" + str2.length() + " trimPer: %.02f cost:" + (c01.id.c() - c17), java.lang.Float.valueOf(((length - r9) * 100.0f) / length));
        return str2;
    }
}
