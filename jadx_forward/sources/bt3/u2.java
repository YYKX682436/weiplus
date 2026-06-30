package bt3;

/* loaded from: classes9.dex */
public class u2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public u2() {
        super(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        byte[] bArr;
        java.util.List L;
        android.util.Pair pair;
        byte[] bArr2;
        java.lang.String J0;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044 c5888x4e3b0044 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044) abstractC20979x809547d1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordOperationListener", "on record operation listener, %d", java.lang.Integer.valueOf(c5888x4e3b0044.f136196g.f88116a));
        am.eq eqVar = c5888x4e3b0044.f136196g;
        int i17 = eqVar.f88116a;
        am.fq fqVar = c5888x4e3b0044.f136197h;
        switch (i17) {
            case 0:
                fqVar.f88225a = bt3.g2.A(eqVar.f88117b);
                return false;
            case 1:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordOperationListener", "get record paths, msg id %d", java.lang.Long.valueOf(eqVar.f88119d));
                fqVar.f88228d = bt3.g2.K(eqVar.f88118c, eqVar.f88120e, eqVar.f88119d);
                fqVar.f88226b = bt3.g2.t(eqVar.f88118c, eqVar.f88120e, eqVar.f88119d, 1);
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(bt3.g2.H(eqVar.f88118c, eqVar.f88120e, eqVar.f88119d, 1));
                java.lang.String str = a17.f294812f;
                if (str != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                    if (!str.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                if (m17.a()) {
                    m17.f294799a.F(m17.f294800b);
                }
                fqVar.f88227c = bt3.g2.H(eqVar.f88118c, eqVar.f88120e, eqVar.f88119d, 1);
                return false;
            case 2:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordOperationListener", "send record msg, to %s, thumbPath %s, thumbId %s", eqVar.f88121f, eqVar.f88126k, 0);
                int i18 = eqVar.f88136u;
                java.lang.String str2 = eqVar.f88121f;
                r45.bq0 bq0Var = eqVar.f88123h;
                java.lang.String str3 = eqVar.f88124i;
                java.lang.String str4 = eqVar.f88125j;
                java.lang.String str5 = eqVar.f88126k;
                java.lang.String str6 = eqVar.f88131p;
                kk.j jVar = bt3.g2.f105811a;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgLogic", "send record msg error, touser is null");
                } else if (bq0Var == null || bq0Var.f452497f.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgLogic", "send record msg error, favprotoitem error");
                } else {
                    ot0.q f17 = bt3.g2.f(str3, str4, bq0Var);
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                        bArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(str5);
                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                        bArr = null;
                    } else {
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
                        bArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.a(com.p314xaae8f345.mm.p943x351df9c2.g.a(str6));
                    }
                    if (bArr != null) {
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        m11.b1.Di().getClass();
                        f9Var.i1("THUMBNAIL_DIRPATH://th_" + m11.l0.W0());
                    }
                    f9Var.d1(bt3.x2.f(f17).m126747x696739c());
                    f9Var.r1(1);
                    f9Var.u1(str2);
                    f9Var.e1(c01.w9.o(str2));
                    f9Var.j1(1);
                    f9Var.m124850x7650bebc(49);
                    ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
                    if (r01.z.g(str2)) {
                        ((qv.c) ((rv.l2) i95.n0.c(rv.l2.class))).getClass();
                        f9Var.u3(s01.r.i());
                    }
                    c01.ia.N(f9Var, c01.ia.E(2), false);
                    long M9 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
                    if (bArr != null) {
                        if (bArr.length > 65536) {
                            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                            m11.b1.Di().O3(f9Var, bArr, false, android.graphics.Bitmap.CompressFormat.JPEG);
                        } else {
                            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                            m11.b1.Di().J0(f9Var, bArr);
                        }
                        fp.k.c();
                    }
                    fp.k.c();
                    if (M9 < 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordMsgLogic", fp.k.c() + "insert msg failed :" + M9);
                        fp.k.a();
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgLogic", fp.k.a() + " new msg inserted to db , local id = " + M9);
                        f9Var.m124849x5361953a(M9);
                        bt3.g2.j(str2, java.lang.Long.valueOf(M9));
                        ot0.t tVar = new ot0.t();
                        tVar.f67771x4b6e9352 = f9Var.j();
                        tVar.f67769x29dd02d3 = f17.f430187f;
                        tVar.f67770x2262335f = f17.f430199i;
                        tVar.f67764x4f4dc37 = f17.f430191g;
                        tVar.f67765x297eb4f7 = M9;
                        tVar.f67763x28d45f97 = f17.f430179d;
                        tVar.f67767x436b2035 = f9Var.Q0();
                        tVar.f67766xd09be28e = f9Var.I0();
                        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).D0(tVar);
                        java.util.Iterator it = bq0Var.f452497f.iterator();
                        while (it.hasNext()) {
                            r45.gp0 gp0Var = (r45.gp0) it.next();
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456967s) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456945h)) {
                            }
                            L = bt3.g2.L(M9, str2, bq0Var);
                            if (L.size() > 0 || !((d35.j) ((qx.h0) i95.n0.c(qx.h0.class))).bj()) {
                                bt3.g2.d(i18, M9, f17.m(), f17.k(), str2, bq0Var);
                            } else {
                                com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
                                wy.e eVar = (wy.e) i95.n0.c(wy.e.class);
                                bt3.f2 f2Var = new bt3.f2(i18, M9, f17, str2, bq0Var, f9Var);
                                ((vy.a) eVar).getClass();
                                d17.g(new g35.a(L, f2Var));
                            }
                        }
                        L = bt3.g2.L(M9, str2, bq0Var);
                        if (L.size() > 0) {
                        }
                        bt3.g2.d(i18, M9, f17.m(), f17.k(), str2, bq0Var);
                    }
                }
                return false;
            case 3:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordOperationListener", "clear resouces, msg id %d", java.lang.Long.valueOf(eqVar.f88119d));
                bt3.g2.m(eqVar.f88121f, eqVar.f88119d);
                return false;
            case 4:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordOperationListener", "forward record msg, to %s, msg id %d", eqVar.f88121f, java.lang.Long.valueOf(eqVar.f88127l.m124847x74d37ac6()));
                bt3.g2.M(eqVar.f88121f, eqVar.f88122g, eqVar.f88127l, eqVar.f88134s);
                return false;
            case 5:
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = eqVar.f88121f;
                java.lang.String str7 = eqVar.f88135t;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str7 == null) {
                    str7 = "";
                }
                objArr[1] = str7;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordOperationListener", "summerrecord forward multi record msg, to %s(%s)", objArr);
                android.content.Context context = eqVar.f88129n;
                java.lang.String str8 = eqVar.f88121f;
                java.lang.String str9 = eqVar.f88130o;
                java.util.List list = eqVar.f88128m;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = eqVar.f88132q;
                q45.c cVar = eqVar.f88133r;
                java.lang.String str10 = eqVar.f88135t;
                kk.j jVar2 = bt3.g2.f105811a;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str8)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgLogic", "send record msg error, touser is null");
                    pair = new android.util.Pair(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(-1L, ""), java.lang.Boolean.FALSE);
                } else if (list == null || list.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgLogic", "send record msg error, msginfo error");
                    pair = new android.util.Pair(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(-1L, ""), java.lang.Boolean.FALSE);
                } else {
                    if (c5303xc75d2f73 == null || cVar == null) {
                        c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
                        if (bt3.c0.i(context, c5303xc75d2f73, str9, list, true, true, -1)) {
                            cVar = bt3.g2.u(context, c5303xc75d2f73, str9);
                        } else {
                            pair = new android.util.Pair(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(-1L, ""), java.lang.Boolean.FALSE);
                        }
                    }
                    ot0.q f18 = bt3.g2.f(cVar.f441662d, cVar.f441663e, c5303xc75d2f73.f135623g.f87848a);
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f441664f)) {
                        bArr2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(cVar.f441664f);
                    } else if (cVar.f441665g == 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f441666h)) {
                        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
                        java.lang.String str11 = cVar.f441666h;
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
                        bArr2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.a(com.p314xaae8f345.mm.p943x351df9c2.g.a(str11));
                    } else {
                        bArr2 = null;
                    }
                    if (bArr2 != null) {
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.h(bArr2)) {
                            bArr2 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).bj(bArr2, 1);
                        }
                        if (bArr2.length > 65536) {
                            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                            J0 = m11.b1.Di().O3(f9Var2, bArr2, false, android.graphics.Bitmap.CompressFormat.JPEG);
                        } else {
                            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                            J0 = m11.b1.Di().J0(f9Var2, bArr2);
                        }
                        fp.k.c();
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J0)) {
                            f9Var2.i1(J0);
                        }
                    }
                    f9Var2.d1(bt3.x2.f(f18).m126747x696739c());
                    f9Var2.r1(1);
                    f9Var2.u1(str8);
                    f9Var2.e1(c01.w9.o(str8));
                    f9Var2.j1(1);
                    f9Var2.m124850x7650bebc(49);
                    ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
                    if (r01.z.g(str8)) {
                        ((qv.c) ((rv.l2) i95.n0.c(rv.l2.class))).getClass();
                        f9Var2.u3(s01.r.i());
                    }
                    long M92 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var2);
                    fp.k.c();
                    if (M92 < 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordMsgLogic", fp.k.c() + "insert msg failed :" + M92);
                        pair = new android.util.Pair(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5((long) (-fp.k.a()), ""), java.lang.Boolean.FALSE);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgLogic", fp.k.a() + " new msg inserted to db , local id = " + M92);
                        f9Var2.m124849x5361953a(M92);
                        bt3.g2.j(str8, java.lang.Long.valueOf(M92));
                        ot0.t tVar2 = new ot0.t();
                        tVar2.f67771x4b6e9352 = f9Var2.j();
                        tVar2.f67769x29dd02d3 = f18.f430187f;
                        tVar2.f67770x2262335f = f18.f430199i;
                        tVar2.f67764x4f4dc37 = f18.f430191g;
                        tVar2.f67765x297eb4f7 = M92;
                        tVar2.f67763x28d45f97 = f18.f430179d;
                        tVar2.f67767x436b2035 = f9Var2.Q0();
                        tVar2.f67766xd09be28e = f9Var2.I0();
                        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).D0(tVar2);
                        am.c4 c4Var = c5303xc75d2f73.f135623g;
                        java.util.Iterator it6 = c4Var.f87848a.f452497f.iterator();
                        boolean z18 = false;
                        while (it6.hasNext()) {
                            r45.gp0 gp0Var2 = (r45.gp0) it6.next();
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var2.T)) {
                                gp0Var2.e0(bt3.g2.p(gp0Var2.toString(), gp0Var2.I));
                            }
                            if (z18 || com.p314xaae8f345.mm.vfs.w6.j(gp0Var2.V) || com.p314xaae8f345.mm.vfs.w6.j(gp0Var2.X) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var2.f456967s) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var2.f456945h) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var2.f456944g2) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var2.f456938d2)) {
                                z18 = true;
                            }
                        }
                        if (z18) {
                            if (!c01.e2.O(str8) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str10)) {
                                str10 = str8;
                            }
                            java.util.List L2 = bt3.g2.L(M92, str10, c4Var.f87848a);
                            if (L2.size() <= 0 || !((d35.j) ((qx.h0) i95.n0.c(qx.h0.class))).bj()) {
                                bt3.g2.c(M92, f18.m(), f18.k(), str8, c4Var.f87848a);
                            } else {
                                com.p314xaae8f345.mm.p944x882e457a.r1 d18 = gm0.j1.d();
                                wy.e eVar2 = (wy.e) i95.n0.c(wy.e.class);
                                bt3.d2 d2Var = new bt3.d2(M92, f18, str8, c5303xc75d2f73, f9Var2);
                                ((vy.a) eVar2).getClass();
                                d18.g(new g35.a(L2, d2Var));
                            }
                        } else if (!c01.e2.O(str8)) {
                            ((bt3.x1) ((zs3.v) i95.n0.c(zs3.v.class))).getClass();
                            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Ni().b(str8, M92);
                        }
                        pair = new android.util.Pair(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(M92, str8), java.lang.Boolean.valueOf(true ^ z18));
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = (com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) pair.first;
                fqVar.f88231g = c16564xb55e1d5.f231013d;
                fqVar.f88233i = c16564xb55e1d5.a();
                fqVar.f88232h = ((java.lang.Boolean) pair.second).booleanValue();
                return false;
            case 6:
            case 10:
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f732 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
                bt3.c0.i(eqVar.f88129n, c5303xc75d2f732, eqVar.f88130o, eqVar.f88128m, true, true, eqVar.f88116a);
                q45.c u17 = bt3.g2.u(eqVar.f88129n, c5303xc75d2f732, eqVar.f88130o);
                fqVar.f88229e = c5303xc75d2f732;
                fqVar.f88230f = u17;
                return false;
            case 7:
            default:
                return false;
            case 8:
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eqVar.f88126k)) {
                    bt3.g2.O(eqVar.f88118c, eqVar.f88120e, eqVar.f88119d, true);
                } else {
                    bt3.g2.P(eqVar.f88118c, eqVar.f88120e, eqVar.f88119d, true);
                }
                return false;
            case 9:
                fqVar.f88228d = bt3.g2.k(eqVar.f88118c, eqVar.f88120e, eqVar.f88119d);
                return false;
        }
    }
}
