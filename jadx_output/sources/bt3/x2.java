package bt3;

/* loaded from: classes9.dex */
public abstract class x2 {
    public static final void a(s15.w recordInfoItem) {
        kotlin.jvm.internal.o.g(recordInfoItem, "recordInfoItem");
        java.util.Iterator it = recordInfoItem.j().iterator();
        while (it.hasNext()) {
            s15.l r17 = ((s15.h) it.next()).r();
            if (r17 != null) {
                ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ui(r17);
            }
        }
    }

    public static final void b(s15.w infoItem) {
        s15.w j17;
        kotlin.jvm.internal.o.g(infoItem, "infoItem");
        for (s15.h hVar : infoItem.j()) {
            if (hVar.getString(hVar.f303422d + 3).length() < 32) {
                java.lang.String obj = hVar.toString();
                int i17 = hVar.f303422d;
                java.lang.String p17 = bt3.g2.p(obj, hVar.getInteger(i17 + 2));
                kotlin.jvm.internal.o.f(p17, "genDataId(...)");
                hVar.set(i17 + 3, p17);
            }
            s15.i0 H = hVar.H();
            if (H != null && (j17 = H.j()) != null) {
                b(j17);
            }
        }
    }

    public static final r45.gp0 c(s15.h hVar) {
        kotlin.jvm.internal.o.g(hVar, "<this>");
        r45.gp0 gp0Var = new r45.gp0();
        int i17 = hVar.f303422d;
        gp0Var.e0(hVar.getString(i17 + 3));
        gp0Var.O0(hVar.getString(i17 + 0));
        gp0Var.h0(hVar.getInteger(i17 + 2));
        gp0Var.i0(hVar.n());
        gp0Var.g0(hVar.o());
        gp0Var.m0(hVar.getString(i17 + 1));
        gp0Var.G0(hVar.L());
        gp0Var.c0(hVar.getString(i17 + 5));
        gp0Var.d0(hVar.getString(i17 + 4));
        gp0Var.a0(hVar.getString(i17 + 9));
        gp0Var.b0(hVar.getString(i17 + 8));
        gp0Var.f375409f2 = hVar.Z();
        gp0Var.f375413h2 = hVar.b0();
        gp0Var.f375405d2 = hVar.c0();
        gp0Var.f375407e2 = hVar.Y();
        gp0Var.f375411g2 = hVar.a0();
        gp0Var.p0(hVar.getString(i17 + 10));
        gp0Var.q0(hVar.getLong(i17 + 11));
        gp0Var.N0(hVar.getString(i17 + 6));
        gp0Var.L0(hVar.getLong(i17 + 7));
        return gp0Var;
    }

    public static final s15.v d(r45.mv2 mv2Var) {
        kotlin.jvm.internal.o.g(mv2Var, "<this>");
        s15.v vVar = new s15.v();
        java.lang.String string = mv2Var.getString(0);
        if (string == null) {
            string = "";
        }
        vVar.r(string);
        vVar.u(mv2Var.getInteger(1));
        java.lang.String string2 = mv2Var.getString(2);
        if (string2 == null) {
            string2 = "";
        }
        vVar.p(string2);
        java.lang.String string3 = mv2Var.getString(3);
        if (string3 == null) {
            string3 = "";
        }
        vVar.o(string3);
        java.lang.String string4 = mv2Var.getString(5);
        if (string4 == null) {
            string4 = "";
        }
        vVar.q(string4);
        r45.hv2 hv2Var = (r45.hv2) mv2Var.getCustom(4);
        if (hv2Var != null) {
            s15.u uVar = new s15.u();
            java.lang.String string5 = hv2Var.getString(0);
            if (string5 == null) {
                string5 = "";
            }
            uVar.l(string5);
            uVar.k(hv2Var.getFloat(1));
            uVar.j(hv2Var.getFloat(2));
            vVar.t(uVar);
        }
        r45.ht0 ht0Var = (r45.ht0) mv2Var.getCustom(6);
        if (ht0Var != null) {
            s15.t tVar = new s15.t();
            java.lang.String string6 = ht0Var.getString(0);
            if (string6 == null) {
                string6 = "";
            }
            tVar.q(string6);
            java.lang.String string7 = ht0Var.getString(1);
            if (string7 == null) {
                string7 = "";
            }
            tVar.o(string7);
            java.lang.String string8 = ht0Var.getString(2);
            if (string8 == null) {
                string8 = "";
            }
            tVar.l(string8);
            tVar.n(ht0Var.getLong(4));
            java.lang.String string9 = ht0Var.getString(5);
            tVar.p(string9 != null ? string9 : "");
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
        com.tencent.mm.modelavatar.r0 n07;
        kotlin.jvm.internal.o.g(gp0Var, "<this>");
        s15.h hVar = new s15.h();
        int l18 = gp0Var.l();
        int i18 = hVar.f303422d;
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
        java.lang.String title = gp0Var.getTitle();
        if (title == null) {
            title = "";
        }
        hVar.set(i18 + 0, title);
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
        hVar.e1(gp0Var.getThumbWidth());
        hVar.d1(gp0Var.getThumbHeight());
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
                wVar.fromXml(E);
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
            java.lang.String appId = c17.getAppId();
            if (appId == null) {
                appId = "";
            }
            hVar.f0(appId);
            java.lang.String link = c17.getLink();
            if (link == null) {
                link = "";
            }
            hVar.F0(link);
            java.lang.String b18 = c17.b();
            if (b18 == null) {
                b18 = "";
            }
            hVar.g0(b18);
            s15.i iVar = new s15.i();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(c17.c()) && !com.tencent.mm.sdk.platformtools.t8.K0(c17.e())) {
                if (kotlin.jvm.internal.o.b(c17.c(), c17.e())) {
                    str = c17.c();
                    kotlin.jvm.internal.o.d(str);
                } else {
                    str = c17.e();
                    kotlin.jvm.internal.o.d(str);
                }
                java.lang.String Ai = ((m73.q) ((n73.e) i95.n0.c(n73.e.class))).Ai(str, 3);
                if (Ai == null) {
                    Ai = "";
                }
                if (com.tencent.mm.storage.z3.L4(str)) {
                    Ai = Ai.concat("@weclaw");
                }
                iVar.o(Ai);
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(c17.c())) {
                str = c17.c();
                kotlin.jvm.internal.o.f(str, "getFromUser(...)");
                java.lang.String Ai2 = ((m73.q) ((n73.e) i95.n0.c(n73.e.class))).Ai(str, 3);
                if (Ai2 == null) {
                    Ai2 = "";
                }
                if (com.tencent.mm.storage.z3.L4(str)) {
                    Ai2 = Ai2.concat("@weclaw");
                }
                iVar.o(Ai2);
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(c17.e())) {
                str = c17.e();
                kotlin.jvm.internal.o.f(str, "getRealChatName(...)");
                java.lang.String Ai3 = ((m73.q) ((n73.e) i95.n0.c(n73.e.class))).Ai(str, 3);
                if (Ai3 == null) {
                    Ai3 = "";
                }
                if (com.tencent.mm.storage.z3.L4(str)) {
                    Ai3 = Ai3.concat("@weclaw");
                }
                iVar.o(Ai3);
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(c17.d())) {
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
            if (!gp0Var.f375419l2 && (!r26.n0.N(str)) && (n07 = ((com.tencent.mm.modelavatar.s0) ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).Zi()).n0(str)) != null) {
                java.lang.String d27 = n07.d();
                if (d27 == null) {
                    d27 = "";
                }
                hVar.R0(d27);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(c17.c())) {
                if (((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Di(c17.c())) {
                    java.lang.String c19 = c17.c();
                    kotlin.jvm.internal.o.f(c19, "getFromUser(...)");
                    iVar.n(c19);
                    java.lang.String Vi = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Vi(c17.c());
                    java.lang.String fj6 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(Vi, ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Ui(c17.c()));
                    if (fj6 == null) {
                        fj6 = "";
                    }
                    if (kotlin.jvm.internal.o.b("3552365301", Vi)) {
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
            java.lang.String thumbUrl = y17.getThumbUrl();
            if (thumbUrl == null) {
                thumbUrl = "";
            }
            h0Var.x(thumbUrl);
            java.lang.String title2 = y17.getTitle();
            if (title2 == null) {
                title2 = "";
            }
            h0Var.y(title2);
            h0Var.u(y17.g());
            h0Var.p(y17.c());
            h0Var.s(y17.f());
            if (com.tencent.mm.sdk.platformtools.t8.K0(y17.e()) && !com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.b())) {
                y17.k(((com.tencent.mm.pluginsdk.model.l0) ((o72.t3) i95.n0.c(o72.t3.class))).wi(gp0Var.b()));
            }
            java.lang.String e19 = y17.e();
            if (e19 == null) {
                e19 = "";
            }
            h0Var.r(e19);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.b())) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1898, 14);
            }
            r45.hp0 j29 = gp0Var.j();
            if (j29 != null && (q17 = j29.q()) != null) {
                s15.f fVar = new s15.f();
                java.lang.String str2 = q17.f384168m;
                if (str2 == null) {
                    str2 = "";
                }
                fVar.x(str2);
                java.lang.String str3 = q17.f384169n;
                if (str3 == null) {
                    str3 = "";
                }
                fVar.w(str3);
                java.lang.String str4 = q17.f384170o;
                if (str4 == null) {
                    str4 = "";
                }
                fVar.u(str4);
                java.lang.String str5 = q17.f384173r;
                if (str5 == null) {
                    str5 = "";
                }
                fVar.n(str5);
                fVar.q(q17.f384162d);
                fVar.s(q17.f384176u);
                fVar.r(q17.f384163e);
                fVar.z(q17.f384164f);
                fVar.y(q17.f384165g);
                fVar.t(q17.f384166h);
                fVar.o(q17.f384167i);
                fVar.p(q17.f384171p);
                h0Var.w(fVar);
            }
            hVar.n1(h0Var);
        }
        r45.hp0 j37 = gp0Var.j();
        if (j37 != null && (g17 = j37.g()) != null) {
            s15.o oVar = new s15.o();
            java.lang.String string = g17.getString(0);
            oVar.Y(string == null ? "" : string);
            java.lang.String string2 = g17.getString(8);
            if (string2 == null) {
                string2 = "";
            }
            oVar.Z(string2);
            oVar.O(g17.getInteger(5));
            java.lang.String string3 = g17.getString(2);
            if (string3 == null) {
                string3 = "";
            }
            oVar.W(string3);
            java.lang.String string4 = g17.getString(1);
            if (string4 == null) {
                string4 = "";
            }
            oVar.b0(string4);
            java.lang.String string5 = g17.getString(3);
            if (string5 == null) {
                string5 = "";
            }
            oVar.B(string5);
            java.lang.String string6 = g17.getString(4);
            if (string6 == null) {
                string6 = "";
            }
            oVar.N(string6);
            oVar.S(g17.getInteger(6));
            oVar.R(g17.getLong(9));
            oVar.z(g17.getInteger(13));
            java.lang.String string7 = g17.getString(14);
            if (string7 == null) {
                string7 = "";
            }
            oVar.A(string7);
            java.util.LinkedList<r45.iv2> list = g17.getList(7);
            kotlin.jvm.internal.o.f(list, "getMediaList(...)");
            for (r45.iv2 iv2Var : list) {
                java.util.LinkedList t18 = oVar.t();
                s15.p pVar = new s15.p();
                pVar.o(iv2Var.getInteger(0));
                java.lang.String string8 = iv2Var.getString(1);
                if (string8 == null) {
                    string8 = "";
                }
                pVar.q(string8);
                java.lang.String string9 = iv2Var.getString(2);
                if (string9 == null) {
                    string9 = "";
                }
                pVar.p(string9);
                java.lang.String string10 = iv2Var.getString(6);
                if (string10 == null) {
                    string10 = "";
                }
                pVar.l(string10);
                java.lang.String string11 = iv2Var.getString(7);
                if (string11 == null) {
                    string11 = "";
                }
                pVar.k(string11);
                pVar.s(iv2Var.getFloat(3));
                pVar.n(iv2Var.getFloat(4));
                pVar.r(iv2Var.getInteger(5));
                t18.add(pVar);
            }
            s15.q qVar = new s15.q();
            java.lang.String string12 = g17.getString(10);
            if (string12 == null) {
                string12 = "";
            }
            qVar.k(string12);
            java.lang.String string13 = g17.getString(11);
            if (string13 == null) {
                string13 = "";
            }
            qVar.l(string13);
            oVar.U(qVar);
            java.lang.String string14 = g17.getString(12);
            if (string14 == null) {
                string14 = "";
            }
            oVar.H(string14);
            java.lang.String string15 = g17.getString(15);
            if (string15 == null) {
                string15 = "";
            }
            oVar.G(string15);
            java.lang.String string16 = g17.getString(16);
            if (string16 == null) {
                string16 = "";
            }
            oVar.F(string16);
            java.lang.String string17 = g17.getString(17);
            if (string17 == null) {
                string17 = "";
            }
            oVar.I(string17);
            oVar.C(g17.getInteger(18));
            java.lang.String string18 = g17.getString(19);
            if (string18 == null) {
                string18 = "";
            }
            oVar.E(string18);
            oVar.L(g17.getInteger(20));
            java.lang.String string19 = g17.getString(21);
            if (string19 == null) {
                string19 = "";
            }
            oVar.K(string19);
            java.lang.String string20 = g17.getString(22);
            if (string20 == null) {
                string20 = "";
            }
            oVar.P(string20);
            java.lang.String string21 = g17.getString(23);
            if (string21 == null) {
                string21 = "";
            }
            oVar.J(string21);
            r45.mv4 mv4Var = (r45.mv4) g17.getCustom(28);
            if (mv4Var != null) {
                s15.d dVar = new s15.d();
                dVar.k(mv4Var.getInteger(0));
                r45.ik2 ik2Var = (r45.ik2) mv4Var.getCustom(2);
                if (ik2Var != null) {
                    s15.b bVar = new s15.b();
                    bVar.fromJson(ik2Var.toJSON());
                    dVar.l(bVar);
                }
                oVar.V(dVar);
            }
            oVar.a0(g17.getInteger(29));
            r45.gv2 gv2Var = (r45.gv2) g17.getCustom(30);
            oVar.Q(java.lang.String.valueOf(gv2Var != null ? gv2Var.toJSON() : null));
            hVar.u0(oVar);
        }
        r45.hp0 j38 = gp0Var.j();
        if (j38 != null && (i17 = j38.i()) != null) {
            s15.r rVar = new s15.r();
            java.lang.String string22 = i17.getString(0);
            if (string22 == null) {
                string22 = "";
            }
            rVar.C(string22);
            java.lang.String string23 = i17.getString(1);
            if (string23 == null) {
                string23 = "";
            }
            rVar.G(string23);
            java.lang.String string24 = i17.getString(2);
            if (string24 == null) {
                string24 = "";
            }
            rVar.F(string24);
            java.lang.String string25 = i17.getString(3);
            if (string25 == null) {
                string25 = "";
            }
            rVar.R(string25);
            java.lang.String string26 = i17.getString(4);
            if (string26 == null) {
                string26 = "";
            }
            rVar.t(string26);
            java.lang.String string27 = i17.getString(12);
            if (string27 == null) {
                string27 = "";
            }
            rVar.E(string27);
            java.lang.String string28 = i17.getString(11);
            if (string28 == null) {
                string28 = "";
            }
            rVar.H(string28);
            rVar.B(i17.getInteger(14));
            x05.n nVar = new x05.n();
            java.lang.String string29 = i17.getString(5);
            if (string29 == null) {
                string29 = "";
            }
            nVar.j(string29);
            nVar.k(i17.getFloat(7));
            nVar.l(i17.getFloat(6));
            rVar.Q(nVar);
            rVar.O(i17.getInteger(13));
            rVar.W(i17.getInteger(15));
            rVar.N(i17.getInteger(15));
            java.lang.String string30 = i17.getString(16);
            if (string30 == null) {
                string30 = "";
            }
            rVar.u(string30);
            rVar.j(i17.getInteger(18));
            java.lang.String string31 = i17.getString(17);
            if (string31 == null) {
                string31 = "";
            }
            rVar.k(string31);
            rVar.l(i17.getInteger(19));
            java.lang.String string32 = i17.getString(20);
            if (string32 == null) {
                string32 = "";
            }
            rVar.o(string32);
            java.lang.String string33 = i17.getString(21);
            if (string33 == null) {
                string33 = "";
            }
            rVar.n(string33);
            rVar.q(i17.getInteger(22));
            java.lang.String string34 = i17.getString(25);
            if (string34 == null) {
                string34 = "";
            }
            rVar.L(string34);
            java.lang.String string35 = i17.getString(26);
            if (string35 == null) {
                string35 = "";
            }
            rVar.P(string35);
            java.lang.String string36 = i17.getString(27);
            if (string36 == null) {
                string36 = "";
            }
            rVar.p(string36);
            java.lang.String string37 = i17.getString(28);
            if (string37 == null) {
                string37 = "";
            }
            rVar.T(string37);
            java.lang.String string38 = i17.getString(29);
            if (string38 == null) {
                string38 = "";
            }
            rVar.z(string38);
            java.lang.String string39 = i17.getString(30);
            if (string39 == null) {
                string39 = "";
            }
            rVar.x(string39);
            java.lang.String string40 = i17.getString(31);
            if (string40 == null) {
                string40 = "";
            }
            rVar.y(string40);
            java.lang.String string41 = i17.getString(32);
            if (string41 == null) {
                string41 = "";
            }
            rVar.S(string41);
            java.lang.String string42 = i17.getString(33);
            if (string42 == null) {
                string42 = "";
            }
            rVar.A(string42);
            java.lang.String string43 = i17.getString(34);
            if (string43 == null) {
                string43 = "";
            }
            rVar.Y(string43);
            rVar.s(i17.getInteger(35));
            java.lang.String string44 = i17.getString(36);
            if (string44 == null) {
                string44 = "";
            }
            rVar.r(string44);
            rVar.U(i17.getInteger(39));
            java.lang.String string45 = i17.getString(40);
            if (string45 == null) {
                string45 = "";
            }
            rVar.Z(string45);
            rVar.K(i17.getInteger(38));
            java.lang.String string46 = i17.getString(41);
            if (string46 == null) {
                string46 = "";
            }
            rVar.J(string46);
            java.lang.String string47 = i17.getString(42);
            if (string47 == null) {
                string47 = "";
            }
            rVar.w(string47);
            rVar.V(i17.getInteger(44));
            r45.xz3 xz3Var = (r45.xz3) i17.getCustom(43);
            if (xz3Var != null) {
                x05.o oVar2 = new x05.o();
                oVar2.l(xz3Var.getString(0));
                oVar2.n(xz3Var.getString(1));
                rVar.I(oVar2);
            }
            hVar.v0(rVar);
        }
        r45.hp0 j39 = gp0Var.j();
        if (j39 != null && (j17 = j39.j()) != null) {
            s15.a aVar = new s15.a();
            java.lang.String string48 = j17.getString(0);
            if (string48 == null) {
                string48 = "";
            }
            aVar.n(string48);
            java.lang.String string49 = j17.getString(1);
            if (string49 == null) {
                string49 = "";
            }
            aVar.o(string49);
            java.lang.String string50 = j17.getString(2);
            if (string50 == null) {
                string50 = "";
            }
            aVar.l(string50);
            java.lang.String string51 = j17.getString(3);
            if (string51 == null) {
                string51 = "";
            }
            aVar.p(string51);
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
            java.lang.String nickname = l17.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            kVar.g0(nickname);
            boolean[] zArr = l17.R;
            java.lang.String str6 = zArr[4] ? l17.f27745g : "";
            if (str6 == null) {
                str6 = "";
            }
            kVar.Z(str6);
            java.lang.String str7 = zArr[5] ? l17.f27746h : "";
            if (str7 == null) {
                str7 = "";
            }
            kVar.T(str7);
            java.lang.String str8 = zArr[6] ? l17.f27747i : "";
            if (str8 == null) {
                str8 = "";
            }
            kVar.h0(str8);
            java.lang.String str9 = zArr[7] ? l17.f27748m : "";
            if (str9 == null) {
                str9 = "";
            }
            kVar.U(str9);
            java.lang.String f19 = l17.f();
            if (f19 == null) {
                f19 = "";
            }
            kVar.o0(f19);
            java.lang.String str10 = zArr[9] ? l17.f27750o : "";
            if (str10 == null) {
                str10 = "";
            }
            kVar.d0(str10);
            java.lang.String str11 = zArr[10] ? l17.f27751p : "";
            if (str11 == null) {
                str11 = "";
            }
            kVar.e0(str11);
            java.lang.String str12 = zArr[11] ? l17.f27752q : "";
            if (str12 == null) {
                str12 = "";
            }
            kVar.f0(str12);
            java.lang.String finderUsername = l17.getFinderUsername();
            if (finderUsername == null) {
                finderUsername = "";
            }
            kVar.b0(finderUsername);
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
            java.lang.String string52 = k17.getString(0);
            if (string52 == null) {
                string52 = "";
            }
            sVar.t(string52);
            java.lang.String string53 = k17.getString(1);
            if (string53 == null) {
                string53 = "";
            }
            sVar.s(string53);
            java.lang.String string54 = k17.getString(2);
            if (string54 == null) {
                string54 = "";
            }
            sVar.q(string54);
            java.lang.String string55 = k17.getString(3);
            if (string55 == null) {
                string55 = "";
            }
            sVar.p(string55);
            sVar.o(k17.getInteger(4));
            java.lang.String string56 = k17.getString(7);
            if (string56 == null) {
                string56 = "";
            }
            sVar.r(string56);
            hVar.z0(sVar);
        }
        r45.hp0 j58 = gp0Var.j();
        if (j58 != null && (f17 = j58.f()) != null) {
            s15.n nVar2 = new s15.n();
            java.lang.String string57 = f17.getString(0);
            if (string57 == null) {
                string57 = "";
            }
            nVar2.k(string57);
            java.lang.String string58 = f17.getString(1);
            if (string58 == null) {
                string58 = "";
            }
            nVar2.s(string58);
            java.lang.String string59 = f17.getString(2);
            if (string59 == null) {
                string59 = "";
            }
            nVar2.r(string59);
            java.util.LinkedList list2 = f17.getList(3);
            kotlin.jvm.internal.o.f(list2, "getThumbUrls(...)");
            int i28 = 0;
            for (java.lang.Object obj : list2) {
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
            com.tencent.mm.protobuf.g byteString = f17.getByteString(5);
            if (byteString != null) {
                byte[] encode = android.util.Base64.encode(byteString.g(), 0);
                kotlin.jvm.internal.o.f(encode, "encode(...)");
                nVar2.l(new java.lang.String(encode, r26.c.f368865a));
            }
            hVar.t0(nVar2);
        }
        r45.hp0 j59 = gp0Var.j();
        if (j59 != null && (r17 = j59.r()) != null) {
            s15.g gVar = new s15.g();
            java.lang.String str14 = r17.f384168m;
            if (str14 == null) {
                str14 = "";
            }
            gVar.w(str14);
            java.lang.String str15 = r17.f384175t;
            if (str15 == null) {
                str15 = "";
            }
            gVar.x(str15);
            java.lang.String str16 = r17.f384174s;
            if (str16 == null) {
                str16 = "";
            }
            gVar.r(str16);
            java.lang.String str17 = r17.f384169n;
            if (str17 == null) {
                str17 = "";
            }
            gVar.p(str17);
            java.lang.String str18 = r17.f384170o;
            if (str18 == null) {
                str18 = "";
            }
            gVar.o(str18);
            java.lang.String str19 = r17.f384173r;
            if (str19 == null) {
                str19 = "";
            }
            gVar.t(str19);
            gVar.u(r17.f384164f);
            gVar.s(r17.f384165g);
            gVar.q(r17.f384167i);
            hVar.h0(gVar);
        }
        r45.hp0 j66 = gp0Var.j();
        if (j66 != null && (u17 = j66.u()) != null) {
            s15.c0 c0Var = new s15.c0();
            c0Var.o(u17.getType());
            java.lang.String title3 = u17.getTitle();
            if (title3 == null) {
                title3 = "";
            }
            c0Var.n(title3);
            java.lang.String b29 = u17.b();
            if (b29 == null) {
                b29 = "";
            }
            c0Var.j(b29);
            java.lang.String thumbUrl2 = u17.getThumbUrl();
            if (thumbUrl2 == null) {
                thumbUrl2 = "";
            }
            c0Var.l(thumbUrl2);
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
            java.lang.String title4 = x17.getTitle();
            if (title4 == null) {
                title4 = "";
            }
            e0Var.l(title4);
            java.lang.String b37 = x17.b();
            if (b37 == null) {
                b37 = "";
            }
            e0Var.j(b37);
            java.lang.String thumbUrl3 = x17.getThumbUrl();
            if (thumbUrl3 == null) {
                thumbUrl3 = "";
            }
            e0Var.k(thumbUrl3);
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
            java.lang.String str20 = b17.f372634d;
            if (str20 == null) {
                str20 = "";
            }
            eVar.z(str20);
            java.lang.String str21 = b17.f372635e;
            if (str21 == null) {
                str21 = "";
            }
            eVar.o(str21);
            eVar.t(b17.f372636f);
            java.lang.String str22 = b17.f372637g;
            if (str22 == null) {
                str22 = "";
            }
            eVar.q(str22);
            eVar.y(b17.f372638h);
            java.lang.String str23 = b17.f372639i;
            if (str23 == null) {
                str23 = "";
            }
            eVar.s(str23);
            java.lang.String str24 = b17.f372640m;
            if (str24 == null) {
                str24 = "";
            }
            eVar.w(str24);
            eVar.A(b17.f372641n);
            eVar.p(b17.f372642o);
            eVar.u(b17.f372646s);
            java.lang.String str25 = b17.f372644q;
            if (str25 == null) {
                str25 = "";
            }
            eVar.r(str25);
            eVar.x(b17.f372645r);
            hVar.e0(eVar);
        }
        r45.hp0 j69 = gp0Var.j();
        if (j69 != null && (s17 = j69.s()) != null) {
            s15.z zVar = new s15.z();
            java.lang.String string60 = s17.getString(0);
            if (string60 == null) {
                string60 = "";
            }
            zVar.F(string60);
            java.lang.String string61 = s17.getString(1);
            if (string61 == null) {
                string61 = "";
            }
            zVar.E(string61);
            java.lang.String string62 = s17.getString(2);
            if (string62 == null) {
                string62 = "";
            }
            zVar.x(string62);
            java.lang.String string63 = s17.getString(3);
            if (string63 == null) {
                string63 = "";
            }
            zVar.B(string63);
            java.lang.String string64 = s17.getString(4);
            if (string64 == null) {
                string64 = "";
            }
            zVar.H(string64);
            java.lang.String string65 = s17.getString(5);
            if (string65 == null) {
                string65 = "";
            }
            zVar.w(string65);
            java.lang.String string66 = s17.getString(7);
            if (string66 == null) {
                string66 = "";
            }
            zVar.C(string66);
            zVar.A(s17.getLong(8));
            java.lang.String string67 = s17.getString(9);
            if (string67 == null) {
                string67 = "";
            }
            zVar.z(string67);
            zVar.u(s17.getInteger(10));
            java.lang.String string68 = s17.getString(6);
            if (string68 == null) {
                string68 = "";
            }
            zVar.y(string68);
            java.lang.String string69 = s17.getString(12);
            if (string69 == null) {
                string69 = "";
            }
            zVar.G(string69);
            java.lang.String string70 = s17.getString(11);
            if (string70 == null) {
                string70 = "";
            }
            zVar.t(string70);
            java.lang.String string71 = s17.getString(17);
            if (string71 == null) {
                string71 = "";
            }
            zVar.s(string71);
            hVar.J0(zVar);
            s15.g0 g0Var = new s15.g0();
            g0Var.o(s17.getInteger(18));
            java.lang.String string72 = s17.getString(19);
            if (string72 == null) {
                string72 = "";
            }
            g0Var.n(string72);
            java.lang.String string73 = s17.getString(20);
            if (string73 == null) {
                string73 = "";
            }
            g0Var.l(string73);
            hVar.g1(g0Var);
        }
        r45.hp0 j76 = gp0Var.j();
        if (j76 != null && (w17 = j76.w()) != null) {
            s15.f0 f0Var = new s15.f0();
            f0Var.n(w17.f378838d);
            java.lang.String str26 = w17.f378839e;
            if (str26 == null) {
                str26 = "";
            }
            f0Var.l(str26);
            java.lang.String str27 = w17.f378840f;
            if (str27 == null) {
                str27 = "";
            }
            f0Var.k(str27);
            hVar.f1(f0Var);
        }
        r45.hp0 j77 = gp0Var.j();
        if (j77 != null && (o17 = j77.o()) != null) {
            s15.x xVar = new s15.x();
            java.lang.String str28 = o17.f382415o;
            if (str28 == null) {
                str28 = "";
            }
            xVar.t(str28);
            java.lang.String str29 = o17.f382416p;
            if (str29 == null) {
                str29 = "";
            }
            xVar.u(str29);
            java.lang.String str30 = o17.f382417q;
            if (str30 == null) {
                str30 = "";
            }
            xVar.o(str30);
            xVar.w(o17.f382418r);
            hVar.G0(xVar);
        }
        r45.hp0 j78 = gp0Var.j();
        if (j78 != null && (e17 = j78.e()) != null) {
            s15.m mVar = new s15.m();
            mVar.y(e17.getInteger(4));
            mVar.x(e17.getInteger(5));
            mVar.A(e17.getInteger(6));
            mVar.B(e17.getInteger(7));
            java.lang.String string74 = e17.getString(1);
            if (string74 == null) {
                string74 = "";
            }
            mVar.E(string74);
            java.lang.String a17 = bt3.w2.a(e17.getLong(0));
            kotlin.jvm.internal.o.f(a17, "toUnsignedString(...)");
            mVar.w(a17);
            java.lang.String string75 = e17.getString(3);
            if (string75 == null) {
                string75 = "";
            }
            mVar.C(string75);
            java.lang.String string76 = e17.getString(2);
            if (string76 == null) {
                string76 = "";
            }
            mVar.u(string76);
            java.lang.String string77 = e17.getString(8);
            if (string77 == null) {
                string77 = "";
            }
            mVar.s(string77);
            java.lang.String string78 = e17.getString(9);
            if (string78 == null) {
                string78 = "";
            }
            mVar.z(string78);
            java.lang.String string79 = e17.getString(10);
            if (string79 == null) {
                string79 = "";
            }
            mVar.t(string79);
            java.lang.String string80 = e17.getString(11);
            if (string80 == null) {
                string80 = "";
            }
            mVar.r(string80);
            mVar.q(e17.getInteger(12));
            hVar.r0(mVar);
        }
        r45.hp0 j79 = gp0Var.j();
        if (j79 != null && (t17 = j79.t()) != null) {
            s15.b0 b0Var = new s15.b0();
            java.lang.String str31 = t17.f389359d;
            if (str31 == null) {
                str31 = "";
            }
            b0Var.o(str31);
            java.lang.String str32 = t17.f389360e;
            if (str32 == null) {
                str32 = "";
            }
            b0Var.n(str32);
            java.lang.String str33 = t17.f389361f;
            b0Var.j(str33 != null ? str33 : "");
            b0Var.l(t17.f389362g);
            b0Var.k(t17.f389363h);
            hVar.K0(b0Var);
        }
        return hVar;
    }

    public static final l15.c f(ot0.q qVar) {
        kotlin.jvm.internal.o.g(qVar, "<this>");
        l15.c cVar = new l15.c();
        v05.b bVar = new v05.b();
        java.lang.String str = qVar.f348646d;
        if (str == null) {
            str = "";
        }
        int i17 = bVar.f368365d;
        bVar.set(i17 + 0, str);
        bVar.set(i17 + 1, java.lang.Integer.valueOf(qVar.f348650e));
        java.lang.String str2 = qVar.f348654f;
        if (str2 == null) {
            str2 = "";
        }
        bVar.set(i17 + 2, str2);
        java.lang.String str3 = qVar.f348658g;
        if (str3 == null) {
            str3 = "";
        }
        bVar.set(i17 + 3, str3);
        java.lang.String str4 = qVar.f348683m0;
        if (str4 == null) {
            str4 = "";
        }
        bVar.set(i17 + 4, str4);
        java.lang.String str5 = qVar.f348662h;
        if (str5 == null) {
            str5 = "";
        }
        bVar.set(i17 + 5, str5);
        bVar.set(i17 + 6, java.lang.Integer.valueOf(qVar.f348666i));
        bVar.set(i17 + 7, java.lang.Integer.valueOf(qVar.f348634J));
        java.lang.String str6 = qVar.f348686n;
        if (str6 == null) {
            str6 = "";
        }
        bVar.set(i17 + 8, str6);
        java.lang.String str7 = qVar.f348674k;
        if (str7 == null) {
            str7 = "";
        }
        bVar.set(i17 + 9, str7);
        java.lang.String str8 = qVar.f348663h0;
        bVar.set(bVar.f432315e + 44, str8 != null ? str8 : "");
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
            if (!com.tencent.mm.storage.z3.R4(str) || z17) {
                str3 = str2;
            } else {
                java.util.List g17 = new r26.t("\n").g(str2, 2);
                str4 = ((java.lang.String) g17.get(0)) + '\n';
                str3 = (java.lang.String) g17.get(1);
            }
            i95.m c17 = i95.n0.c(ct.r2.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            return str4 + (te5.h.f418649a.c() ? i(i17, str3) : h(i17, str3));
        } catch (java.lang.Exception e17) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(i17);
            int length = str2.length();
            if (length > 500) {
                length = 500;
            }
            objArr[1] = str2.subSequence(0, length);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Xml.RecordSerializeUtil", e17, "trimMsgContentRecordXml source:%s originXml:%s", objArr);
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
        bVar.fromXml(str);
        s15.w wVar = new s15.w();
        int i18 = bVar.f432315e + 44;
        wVar.fromXml(bVar.getString(i18));
        b(wVar);
        a(wVar);
        bVar.set(i18, wVar.toXml());
        java.lang.String xml = bVar.toXml();
        com.tencent.mars.xlog.Log.i("MicroMsg.Xml.RecordSerializeUtil", "trim record xml source:" + i17 + " before:" + length + " after:" + xml.length() + " trimPer: %.02f cost:" + (c01.id.c() - c17), java.lang.Float.valueOf(((length - r3) * 100.0f) / length));
        return xml;
    }

    public static final java.lang.String i(int i17, java.lang.String str) {
        long c17 = c01.id.c();
        java.lang.String str2 = "";
        if (str == null || r26.n0.N(str)) {
            return "";
        }
        int length = str.length();
        l15.c cVar = new l15.c();
        cVar.fromXml(str);
        v05.b k17 = cVar.k();
        if (k17 != null) {
            int i18 = k17.f432315e + 44;
            java.lang.String string = k17.getString(i18);
            s15.w wVar = new s15.w();
            wVar.fromXml(string);
            b(wVar);
            a(wVar);
            k17.set(i18, wVar.toXml());
            java.lang.String xml = cVar.toXml();
            if (xml != null) {
                str2 = xml;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Xml.RecordSerializeUtil", "trim record xml new source:" + i17 + " before:" + length + " after:" + str2.length() + " trimPer: %.02f cost:" + (c01.id.c() - c17), java.lang.Float.valueOf(((length - r9) * 100.0f) / length));
        return str2;
    }
}
