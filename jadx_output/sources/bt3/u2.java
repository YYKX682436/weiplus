package bt3;

/* loaded from: classes9.dex */
public class u2 extends com.tencent.mm.sdk.event.n {
    public u2() {
        super(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        byte[] bArr;
        java.util.List L;
        android.util.Pair pair;
        byte[] bArr2;
        java.lang.String J0;
        com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent = (com.tencent.mm.autogen.events.RecordOperationEvent) iEvent;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordOperationListener", "on record operation listener, %d", java.lang.Integer.valueOf(recordOperationEvent.f54663g.f6583a));
        am.eq eqVar = recordOperationEvent.f54663g;
        int i17 = eqVar.f6583a;
        am.fq fqVar = recordOperationEvent.f54664h;
        switch (i17) {
            case 0:
                fqVar.f6692a = bt3.g2.A(eqVar.f6584b);
                return false;
            case 1:
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordOperationListener", "get record paths, msg id %d", java.lang.Long.valueOf(eqVar.f6586d));
                fqVar.f6695d = bt3.g2.K(eqVar.f6585c, eqVar.f6587e, eqVar.f6586d);
                fqVar.f6693b = bt3.g2.t(eqVar.f6585c, eqVar.f6587e, eqVar.f6586d, 1);
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(bt3.g2.H(eqVar.f6585c, eqVar.f6587e, eqVar.f6586d, 1));
                java.lang.String str = a17.f213279f;
                if (str != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                    if (!str.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (m17.a()) {
                    m17.f213266a.F(m17.f213267b);
                }
                fqVar.f6694c = bt3.g2.H(eqVar.f6585c, eqVar.f6587e, eqVar.f6586d, 1);
                return false;
            case 2:
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordOperationListener", "send record msg, to %s, thumbPath %s, thumbId %s", eqVar.f6588f, eqVar.f6593k, 0);
                int i18 = eqVar.f6603u;
                java.lang.String str2 = eqVar.f6588f;
                r45.bq0 bq0Var = eqVar.f6590h;
                java.lang.String str3 = eqVar.f6591i;
                java.lang.String str4 = eqVar.f6592j;
                java.lang.String str5 = eqVar.f6593k;
                java.lang.String str6 = eqVar.f6598p;
                kk.j jVar = bt3.g2.f24278a;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgLogic", "send record msg error, touser is null");
                } else if (bq0Var == null || bq0Var.f370964f.isEmpty()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgLogic", "send record msg error, favprotoitem error");
                } else {
                    ot0.q f17 = bt3.g2.f(str3, str4, bq0Var);
                    com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                        bArr = com.tencent.mm.sdk.platformtools.t8.x1(str5);
                    } else if (com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
                        bArr = null;
                    } else {
                        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
                        bArr = com.tencent.mm.sdk.platformtools.x.a(com.tencent.mm.modelavatar.g.a(str6));
                    }
                    if (bArr != null) {
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        m11.b1.Di().getClass();
                        f9Var.i1("THUMBNAIL_DIRPATH://th_" + m11.l0.W0());
                    }
                    f9Var.d1(bt3.x2.f(f17).toXml());
                    f9Var.r1(1);
                    f9Var.u1(str2);
                    f9Var.e1(c01.w9.o(str2));
                    f9Var.j1(1);
                    f9Var.setType(49);
                    ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
                    if (r01.z.g(str2)) {
                        ((qv.c) ((rv.l2) i95.n0.c(rv.l2.class))).getClass();
                        f9Var.u3(s01.r.i());
                    }
                    c01.ia.N(f9Var, c01.ia.E(2), false);
                    long M9 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
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
                        com.tencent.mars.xlog.Log.e("MicroMsg.RecordMsgLogic", fp.k.c() + "insert msg failed :" + M9);
                        fp.k.a();
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgLogic", fp.k.a() + " new msg inserted to db , local id = " + M9);
                        f9Var.setMsgId(M9);
                        bt3.g2.j(str2, java.lang.Long.valueOf(M9));
                        ot0.t tVar = new ot0.t();
                        tVar.field_xml = f9Var.j();
                        tVar.field_title = f17.f348654f;
                        tVar.field_type = f17.f348666i;
                        tVar.field_description = f17.f348658g;
                        tVar.field_msgId = M9;
                        tVar.field_appId = f17.f348646d;
                        tVar.field_msgTalker = f9Var.Q0();
                        tVar.field_msgSvrId = f9Var.I0();
                        ((com.tencent.mm.pluginsdk.model.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).D0(tVar);
                        java.util.Iterator it = bq0Var.f370964f.iterator();
                        while (it.hasNext()) {
                            r45.gp0 gp0Var = (r45.gp0) it.next();
                            if (com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375434s) && com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375412h)) {
                            }
                            L = bt3.g2.L(M9, str2, bq0Var);
                            if (L.size() > 0 || !((d35.j) ((qx.h0) i95.n0.c(qx.h0.class))).bj()) {
                                bt3.g2.d(i18, M9, f17.m(), f17.k(), str2, bq0Var);
                            } else {
                                com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
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
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordOperationListener", "clear resouces, msg id %d", java.lang.Long.valueOf(eqVar.f6586d));
                bt3.g2.m(eqVar.f6588f, eqVar.f6586d);
                return false;
            case 4:
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordOperationListener", "forward record msg, to %s, msg id %d", eqVar.f6588f, java.lang.Long.valueOf(eqVar.f6594l.getMsgId()));
                bt3.g2.M(eqVar.f6588f, eqVar.f6589g, eqVar.f6594l, eqVar.f6601s);
                return false;
            case 5:
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = eqVar.f6588f;
                java.lang.String str7 = eqVar.f6602t;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str7 == null) {
                    str7 = "";
                }
                objArr[1] = str7;
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordOperationListener", "summerrecord forward multi record msg, to %s(%s)", objArr);
                android.content.Context context = eqVar.f6596n;
                java.lang.String str8 = eqVar.f6588f;
                java.lang.String str9 = eqVar.f6597o;
                java.util.List list = eqVar.f6595m;
                com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = eqVar.f6599q;
                q45.c cVar = eqVar.f6600r;
                java.lang.String str10 = eqVar.f6602t;
                kk.j jVar2 = bt3.g2.f24278a;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str8)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgLogic", "send record msg error, touser is null");
                    pair = new android.util.Pair(new com.tencent.mm.plugin.msg.MsgIdTalker(-1L, ""), java.lang.Boolean.FALSE);
                } else if (list == null || list.isEmpty()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgLogic", "send record msg error, msginfo error");
                    pair = new android.util.Pair(new com.tencent.mm.plugin.msg.MsgIdTalker(-1L, ""), java.lang.Boolean.FALSE);
                } else {
                    if (doFavoriteEvent == null || cVar == null) {
                        doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
                        if (bt3.c0.i(context, doFavoriteEvent, str9, list, true, true, -1)) {
                            cVar = bt3.g2.u(context, doFavoriteEvent, str9);
                        } else {
                            pair = new android.util.Pair(new com.tencent.mm.plugin.msg.MsgIdTalker(-1L, ""), java.lang.Boolean.FALSE);
                        }
                    }
                    ot0.q f18 = bt3.g2.f(cVar.f360129d, cVar.f360130e, doFavoriteEvent.f54090g.f6315a);
                    com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.f360131f)) {
                        bArr2 = com.tencent.mm.sdk.platformtools.t8.x1(cVar.f360131f);
                    } else if (cVar.f360132g == 0 && !com.tencent.mm.sdk.platformtools.t8.K0(cVar.f360133h)) {
                        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
                        java.lang.String str11 = cVar.f360133h;
                        ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
                        bArr2 = com.tencent.mm.sdk.platformtools.x.a(com.tencent.mm.modelavatar.g.a(str11));
                    } else {
                        bArr2 = null;
                    }
                    if (bArr2 != null) {
                        if (com.tencent.mm.sdk.platformtools.y1.h(bArr2)) {
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
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(J0)) {
                            f9Var2.i1(J0);
                        }
                    }
                    f9Var2.d1(bt3.x2.f(f18).toXml());
                    f9Var2.r1(1);
                    f9Var2.u1(str8);
                    f9Var2.e1(c01.w9.o(str8));
                    f9Var2.j1(1);
                    f9Var2.setType(49);
                    ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
                    if (r01.z.g(str8)) {
                        ((qv.c) ((rv.l2) i95.n0.c(rv.l2.class))).getClass();
                        f9Var2.u3(s01.r.i());
                    }
                    long M92 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var2);
                    fp.k.c();
                    if (M92 < 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.RecordMsgLogic", fp.k.c() + "insert msg failed :" + M92);
                        pair = new android.util.Pair(new com.tencent.mm.plugin.msg.MsgIdTalker((long) (-fp.k.a()), ""), java.lang.Boolean.FALSE);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgLogic", fp.k.a() + " new msg inserted to db , local id = " + M92);
                        f9Var2.setMsgId(M92);
                        bt3.g2.j(str8, java.lang.Long.valueOf(M92));
                        ot0.t tVar2 = new ot0.t();
                        tVar2.field_xml = f9Var2.j();
                        tVar2.field_title = f18.f348654f;
                        tVar2.field_type = f18.f348666i;
                        tVar2.field_description = f18.f348658g;
                        tVar2.field_msgId = M92;
                        tVar2.field_appId = f18.f348646d;
                        tVar2.field_msgTalker = f9Var2.Q0();
                        tVar2.field_msgSvrId = f9Var2.I0();
                        ((com.tencent.mm.pluginsdk.model.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).D0(tVar2);
                        am.c4 c4Var = doFavoriteEvent.f54090g;
                        java.util.Iterator it6 = c4Var.f6315a.f370964f.iterator();
                        boolean z18 = false;
                        while (it6.hasNext()) {
                            r45.gp0 gp0Var2 = (r45.gp0) it6.next();
                            if (com.tencent.mm.sdk.platformtools.t8.K0(gp0Var2.T)) {
                                gp0Var2.e0(bt3.g2.p(gp0Var2.toString(), gp0Var2.I));
                            }
                            if (z18 || com.tencent.mm.vfs.w6.j(gp0Var2.V) || com.tencent.mm.vfs.w6.j(gp0Var2.X) || !com.tencent.mm.sdk.platformtools.t8.K0(gp0Var2.f375434s) || !com.tencent.mm.sdk.platformtools.t8.K0(gp0Var2.f375412h) || !com.tencent.mm.sdk.platformtools.t8.K0(gp0Var2.f375411g2) || !com.tencent.mm.sdk.platformtools.t8.K0(gp0Var2.f375405d2)) {
                                z18 = true;
                            }
                        }
                        if (z18) {
                            if (!c01.e2.O(str8) || com.tencent.mm.sdk.platformtools.t8.K0(str10)) {
                                str10 = str8;
                            }
                            java.util.List L2 = bt3.g2.L(M92, str10, c4Var.f6315a);
                            if (L2.size() <= 0 || !((d35.j) ((qx.h0) i95.n0.c(qx.h0.class))).bj()) {
                                bt3.g2.c(M92, f18.m(), f18.k(), str8, c4Var.f6315a);
                            } else {
                                com.tencent.mm.modelbase.r1 d18 = gm0.j1.d();
                                wy.e eVar2 = (wy.e) i95.n0.c(wy.e.class);
                                bt3.d2 d2Var = new bt3.d2(M92, f18, str8, doFavoriteEvent, f9Var2);
                                ((vy.a) eVar2).getClass();
                                d18.g(new g35.a(L2, d2Var));
                            }
                        } else if (!c01.e2.O(str8)) {
                            ((bt3.x1) ((zs3.v) i95.n0.c(zs3.v.class))).getClass();
                            com.tencent.mm.pluginsdk.model.app.u5.Ni().b(str8, M92);
                        }
                        pair = new android.util.Pair(new com.tencent.mm.plugin.msg.MsgIdTalker(M92, str8), java.lang.Boolean.valueOf(true ^ z18));
                    }
                }
                com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = (com.tencent.mm.plugin.msg.MsgIdTalker) pair.first;
                fqVar.f6698g = msgIdTalker.f149480d;
                fqVar.f6700i = msgIdTalker.a();
                fqVar.f6699h = ((java.lang.Boolean) pair.second).booleanValue();
                return false;
            case 6:
            case 10:
                com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent2 = new com.tencent.mm.autogen.events.DoFavoriteEvent();
                bt3.c0.i(eqVar.f6596n, doFavoriteEvent2, eqVar.f6597o, eqVar.f6595m, true, true, eqVar.f6583a);
                q45.c u17 = bt3.g2.u(eqVar.f6596n, doFavoriteEvent2, eqVar.f6597o);
                fqVar.f6696e = doFavoriteEvent2;
                fqVar.f6697f = u17;
                return false;
            case 7:
            default:
                return false;
            case 8:
                if (com.tencent.mm.sdk.platformtools.t8.K0(eqVar.f6593k)) {
                    bt3.g2.O(eqVar.f6585c, eqVar.f6587e, eqVar.f6586d, true);
                } else {
                    bt3.g2.P(eqVar.f6585c, eqVar.f6587e, eqVar.f6586d, true);
                }
                return false;
            case 9:
                fqVar.f6695d = bt3.g2.k(eqVar.f6585c, eqVar.f6587e, eqVar.f6586d);
                return false;
        }
    }
}
