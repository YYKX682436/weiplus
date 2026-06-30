package ru;

/* loaded from: classes12.dex */
public final class r extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ru.u f481155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi3.k0 f481156e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ru.u uVar, qi3.k0 k0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f481155d = uVar;
        this.f481156e = k0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ru.r(this.f481155d, this.f481156e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((ru.r) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        jz5.f0 f0Var;
        int i17;
        jz5.f0 f0Var2;
        ru.u uVar;
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        jz5.f0 f0Var3;
        java.lang.String str2;
        int i18;
        int i19;
        int i27;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ru.u uVar2 = this.f481155d;
        gu.k kVar = uVar2.f481187o;
        oi3.g gVar = kVar.f357152v;
        jz5.f0 f0Var4 = jz5.f0.f384359a;
        qi3.k0 k0Var = this.f481156e;
        if (gVar == null) {
            k0Var.f445272a = -520009;
            return f0Var4;
        }
        qi3.f0 f0Var5 = kVar.f493724m;
        if (f0Var5 != null && (i27 = f0Var5.f445233a) != 0) {
            uVar2.w(gVar, i27);
            return f0Var4;
        }
        qi3.i0 i0Var = kVar.f493725n;
        if (i0Var != null && (i19 = i0Var.f445258a) != 0) {
            uVar2.w(gVar, i19);
            return f0Var4;
        }
        qi3.d0 d0Var = kVar.f493726o;
        if (d0Var != null && (i18 = d0Var.f445216a) != 0) {
            uVar2.w(gVar, i18);
            return f0Var4;
        }
        if (d0Var == null) {
            k0Var.f445272a = -520006;
            return f0Var4;
        }
        pt0.e0 e0Var = pt0.f0.f439742b1;
        int i28 = gVar.f427150d;
        int i29 = i28 + 3;
        int i37 = i28 + 0;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(gVar.m75945x2fec8307(i29), gVar.m75942xfb822ef2(i37));
        if (k17 != null) {
            if (d0Var.f445218c == 0 && d0Var.f445219d == 0) {
                r45.ny3 ny3Var = d0Var.f445222g;
                boolean z17 = ny3Var instanceof r45.qy5;
                gu.k kVar2 = uVar2.f481187o;
                if (z17) {
                    java.lang.String str3 = k17.G;
                    if (str3 == null) {
                        str3 = "";
                    }
                    p15.e eVar = new p15.e();
                    eVar.m126728xdc93280d(str3);
                    r45.qy5 qy5Var = (r45.qy5) ny3Var;
                    if (qy5Var.m75945x2fec8307(10) != null) {
                        f0Var = f0Var4;
                        p15.e eVar2 = new p15.e();
                        java.lang.String m75945x2fec83072 = qy5Var.m75945x2fec8307(10);
                        if (m75945x2fec83072 == null) {
                            m75945x2fec83072 = "";
                        }
                        eVar2.m126728xdc93280d(m75945x2fec83072);
                        p15.s q17 = eVar.q();
                        if (q17 != null) {
                            p15.s q18 = eVar2.q();
                            if (q18 != null) {
                                i17 = i29;
                                str2 = q18.m157696xfb865c31();
                            } else {
                                i17 = i29;
                                str2 = null;
                            }
                            q17.R(str2);
                            f0Var3 = f0Var;
                        } else {
                            i17 = i29;
                            f0Var3 = null;
                        }
                        if (f0Var3 == null) {
                            p15.s sVar = new p15.s();
                            p15.s q19 = eVar2.q();
                            sVar.R(q19 != null ? q19.m157696xfb865c31() : null);
                            eVar.C(sVar);
                        }
                    } else {
                        f0Var = f0Var4;
                        i17 = i29;
                    }
                    i95.m c17 = i95.n0.c(ct.r2.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    if (te5.h.f500182a.c() && (m75945x2fec8307 = qy5Var.m75945x2fec8307(13)) != null) {
                        if (!(!r26.n0.N(m75945x2fec8307))) {
                            m75945x2fec8307 = null;
                        }
                        if (m75945x2fec8307 != null) {
                            r15.b bVar = new r15.b();
                            java.lang.String m75945x2fec83073 = qy5Var.m75945x2fec8307(13);
                            bVar.m126728xdc93280d(m75945x2fec83073 == null ? "" : m75945x2fec83073);
                            str = " SvrId: ";
                            uVar = uVar2;
                            bVar.p(((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).hj(bVar.l()));
                            kVar2.f357148r.r(bVar);
                            java.lang.String m126747x696739c = eVar.m126747x696739c();
                            k17.u3(m126747x696739c);
                            k17.r1(2);
                            k17.o1(qy5Var.m75942xfb822ef2(8));
                            k17.d1(kVar2.f357148r.m126747x696739c());
                            k0Var.f445273b.put("send_msg_svr_id", new java.lang.Long(qy5Var.m75942xfb822ef2(8)));
                            ot0.t y07 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).y0(k17.Q0(), k17.m124847x74d37ac6());
                            y07.f67766xd09be28e = qy5Var.m75942xfb822ef2(8);
                            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).L0(y07, new java.lang.String[0]);
                            boolean g17 = com.p314xaae8f345.mm.vfs.w6.g(((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).hj().o() + '/' + gVar.m75942xfb822ef2(i37), true);
                            ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).cj(k17, true);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.SendRecordTask", uVar.id() + " updateMsg MsgId:" + k17.m124847x74d37ac6() + str + k17.I0() + " msgSourceBefore:" + str3 + " msgSourceAfter:" + m126747x696739c + " deleteCacheRet:" + g17);
                        }
                    }
                    str = " SvrId: ";
                    uVar = uVar2;
                    java.lang.String m126747x696739c2 = eVar.m126747x696739c();
                    k17.u3(m126747x696739c2);
                    k17.r1(2);
                    k17.o1(qy5Var.m75942xfb822ef2(8));
                    k17.d1(kVar2.f357148r.m126747x696739c());
                    k0Var.f445273b.put("send_msg_svr_id", new java.lang.Long(qy5Var.m75942xfb822ef2(8)));
                    ot0.t y072 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).y0(k17.Q0(), k17.m124847x74d37ac6());
                    y072.f67766xd09be28e = qy5Var.m75942xfb822ef2(8);
                    ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).L0(y072, new java.lang.String[0]);
                    boolean g172 = com.p314xaae8f345.mm.vfs.w6.g(((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).hj().o() + '/' + gVar.m75942xfb822ef2(i37), true);
                    ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).cj(k17, true);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.SendRecordTask", uVar.id() + " updateMsg MsgId:" + k17.m124847x74d37ac6() + str + k17.I0() + " msgSourceBefore:" + str3 + " msgSourceAfter:" + m126747x696739c2 + " deleteCacheRet:" + g172);
                } else {
                    uVar = uVar2;
                    f0Var = f0Var4;
                    i17 = i29;
                    if (ny3Var instanceof r45.rr) {
                        k17.r1(2);
                        r45.rr rrVar = (r45.rr) ny3Var;
                        k17.o1(rrVar.f466663d);
                        k17.d1(kVar2.f357148r.m126747x696739c());
                        k0Var.f445273b.put("send_msg_svr_id", new java.lang.Long(rrVar.f466663d));
                        ot0.t y08 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).y0(k17.Q0(), k17.m124847x74d37ac6());
                        y08.f67766xd09be28e = rrVar.f466663d;
                        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).L0(y08, new java.lang.String[0]);
                        boolean g18 = com.p314xaae8f345.mm.vfs.w6.g(((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).hj().o() + '/' + gVar.m75942xfb822ef2(i37), true);
                        ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).cj(k17, true);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.SendRecordTask", uVar.id() + " sendBypCgi updateMsg MsgId:" + k17.m124847x74d37ac6() + " SvrId: " + k17.I0() + " deleteCacheRet:" + g18);
                    } else {
                        uVar2 = uVar;
                        uVar2.w(gVar, d0Var.f445216a);
                        k17.r1(5);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.SendRecordTask", uVar2.id() + " updateMsg Fail resp not exist MsgId:" + k17.m124847x74d37ac6() + " SvrId: " + k17.I0());
                    }
                }
                uVar2 = uVar;
            } else {
                f0Var = f0Var4;
                i17 = i29;
                com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(k17.m124847x74d37ac6(), k17.Q0());
                int i38 = d0Var.f445218c;
                int i39 = d0Var.f445219d;
                java.lang.String str4 = d0Var.f445220e;
                java.lang.String str5 = str4 == null ? "" : str4;
                ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).getClass();
                java.util.HashMap T6 = hm.f.f363681i.a().T6();
                java.lang.String m66995x9616526c = c16564xb55e1d5.m66995x9616526c();
                java.lang.Object obj2 = T6.get(m66995x9616526c);
                if (obj2 == null) {
                    obj2 = new pi3.a();
                    T6.put(m66995x9616526c, obj2);
                }
                pi3.a aVar2 = (pi3.a) obj2;
                aVar2.o(i38);
                aVar2.l(i39);
                aVar2.n(str5);
                k17.r1(5);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.SendRecordTask", uVar2.id() + " updateMsg error MsgId:" + k17.m124847x74d37ac6() + " resp:" + d0Var);
            }
            int lb6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2.class)).cj().lb(k17.m124847x74d37ac6(), k17, true);
            if (lb6 < 0) {
                k0Var.f445273b.put("update_msg_ret", new java.lang.Integer(lb6));
            }
            ((bt3.u1) ((mc0.i) i95.n0.c(mc0.i.class))).Ai(k17.m124847x74d37ac6());
            ((com.p314xaae8f345.mm.p793x2f25ba7b.a) ((v90.u) i95.n0.c(v90.u.class))).wi(k17);
            f0Var2 = f0Var;
        } else {
            f0Var = f0Var4;
            i17 = i29;
            f0Var2 = null;
        }
        if (f0Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.SendRecordTask", uVar2.id() + " updateMsg Fail msgInfo not exist msgId:" + gVar.m75942xfb822ef2(i37) + " msgTalker:" + gVar.m75945x2fec8307(i17));
            k0Var.f445272a = -520002;
        }
        return f0Var;
    }
}
