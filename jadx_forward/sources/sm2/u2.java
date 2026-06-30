package sm2;

/* loaded from: classes3.dex */
public final class u2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491266d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(sm2.o4 o4Var) {
        super(7);
        this.f491266d = o4Var;
    }

    @Override // yz5.u
    public java.lang.Object K(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        java.lang.Class cls;
        dk2.xf g17;
        km2.m m57663xfb7e5820;
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e c10828x8f239b6e;
        fm2.a aVar;
        int i17;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        long j17;
        kn0.i iVar;
        kn0.g gVar;
        r45.vz1 vz1Var;
        r45.vz1 vz1Var2;
        fy2.d dVar;
        kn0.i iVar2;
        kn0.g gVar2;
        r45.nw1 nw1Var;
        java.util.LinkedList m75941xfb8219143;
        java.lang.Object obj8;
        java.util.LinkedList m75941xfb8219144;
        java.util.LinkedList m75941xfb8219145;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        java.lang.String errMsg = (java.lang.String) obj4;
        kn0.g liveRoomInfo = (kn0.g) obj5;
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams trtcParams = (com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams) obj6;
        r45.hc1 resp = (r45.hc1) obj7;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveRoomInfo, "liveRoomInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trtcParams, "trtcParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        boolean z17 = ((mm2.t2) this.f491266d.c(mm2.t2.class)).f410961g;
        boolean h86 = ((mm2.c1) this.f491266d.c(mm2.c1.class)).h8();
        java.lang.String str = this.f491266d.f491143f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("joinLive success:");
        sb6.append(booleanValue);
        sb6.append(", errCode:");
        sb6.append(intValue);
        sb6.append(" isDestroyed:");
        fm2.a aVar2 = this.f491266d.f101128c;
        sb6.append(aVar2 != null ? java.lang.Boolean.valueOf(aVar2.m57698xbca8d80f()) : null);
        sb6.append(" cliBuff:");
        sb6.append(resp.m75945x2fec8307(17));
        sb6.append(", isVerifying:");
        sb6.append(z17);
        sb6.append(", isMinGameLive:");
        sb6.append(h86);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        fm2.a aVar3 = this.f491266d.f101128c;
        if ((aVar3 != null && aVar3.m57698xbca8d80f()) && !z17) {
            if (h86 && !booleanValue) {
                sm2.o4 o4Var = this.f491266d;
                o4Var.getClass();
                switch (intValue) {
                    case -200018:
                    case -200017:
                    case -200013:
                        dk2.ef.f314905a.I(intValue, (r45.qp1) resp.m75936x14adae67(25));
                        break;
                    default:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o4Var.f491143f, "handleJoinRespErrorForMinGameLive unhandled errCode:" + intValue + '.');
                        break;
                }
            }
        } else {
            sm2.o4 o4Var2 = this.f491266d;
            o4Var2.getClass();
            if (booleanValue) {
                int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                if (m40067xab9ed241 != 0 && m40067xab9ed241 != -1) {
                    pm0.v.X(new sm2.p(o4Var2));
                }
                ((ml2.j0) i95.n0.c(ml2.j0.class)).aj(((mm2.c1) o4Var2.c(mm2.c1.class)).f410385o, ((mm2.e1) o4Var2.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) o4Var2.c(mm2.e1.class)).f410516m);
                ((ku5.t0) ku5.t0.f394148d).h(new dk2.ig(((mm2.e1) o4Var2.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0)), "Finder.LiveExceptionMonitor");
                if (zl2.r4.f555483a.w1()) {
                    boolean z18 = resp.m75939xb282bd08(23) != 1;
                    boolean N6 = ((mm2.f6) o4Var2.c(mm2.f6.class)).N6();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o4Var2.f491143f, "handleJoinLiveWxshopResponse haveBindShop:" + N6 + ", shopping_not_available:" + resp.m75939xb282bd08(23) + ", canShowShopEntrance:" + z18);
                    if (z18) {
                        if (!N6) {
                            ((mm2.f6) o4Var2.c(mm2.f6.class)).U6(true);
                            i95.m c17 = i95.n0.c(c61.yb.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                            c61.yb.t2((c61.yb) c17, 14, null, 2, null);
                        }
                        if (o4Var2.f491170w == null) {
                            o4Var2.A(((mm2.f6) o4Var2.c(mm2.f6.class)).N6());
                        }
                    }
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                r45.on1 on1Var = (r45.on1) resp.m75936x14adae67(29);
                java.util.LinkedList m75941xfb8219146 = on1Var != null ? on1Var.m75941xfb821914(0) : null;
                boolean z19 = m75941xfb8219146 == null || m75941xfb8219146.isEmpty();
                java.lang.String str2 = o4Var2.f491143f;
                if (z19) {
                    cls = mm2.c1.class;
                    r45.be1 be1Var = (r45.be1) resp.m75936x14adae67(19);
                    java.util.LinkedList m75941xfb8219147 = be1Var != null ? be1Var.m75941xfb821914(0) : null;
                    if (m75941xfb8219147 == null || m75941xfb8219147.isEmpty()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "handleCheerIconsInfo skip, no custom cheer info.");
                    } else {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("handleCheerIconsInfo custom ad cheer info:");
                        r45.be1 be1Var2 = (r45.be1) resp.m75936x14adae67(19);
                        sb7.append((be1Var2 == null || (m75941xfb8219142 = be1Var2.m75941xfb821914(0)) == null) ? null : java.lang.Integer.valueOf(m75941xfb8219142.size()));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7.toString());
                        r45.be1 be1Var3 = (r45.be1) resp.m75936x14adae67(19);
                        if (be1Var3 != null && (m75941xfb821914 = be1Var3.m75941xfb821914(0)) != null) {
                            linkedList.addAll(m75941xfb821914);
                            ((mm2.c1) o4Var2.c(cls)).E3.f411005e = 1;
                            i17 = 1;
                        }
                    }
                    i17 = 0;
                } else {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("handleCheerIconsInfo custom cheer info:");
                    r45.on1 on1Var2 = (r45.on1) resp.m75936x14adae67(29);
                    sb8.append((on1Var2 == null || (m75941xfb8219145 = on1Var2.m75941xfb821914(0)) == null) ? null : java.lang.Integer.valueOf(m75941xfb8219145.size()));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb8.toString());
                    r45.on1 on1Var3 = (r45.on1) resp.m75936x14adae67(29);
                    if (on1Var3 == null || (m75941xfb8219144 = on1Var3.m75941xfb821914(0)) == null) {
                        cls = mm2.c1.class;
                        i17 = 0;
                    } else {
                        linkedList.addAll(m75941xfb8219144);
                        r45.on1 on1Var4 = (r45.on1) resp.m75936x14adae67(29);
                        if (on1Var4 != null) {
                            i17 = on1Var4.m75939xb282bd08(2);
                            cls = mm2.c1.class;
                        } else {
                            cls = mm2.c1.class;
                            i17 = 0;
                        }
                        ((mm2.c1) o4Var2.c(cls)).E3.f411005e = 0;
                    }
                    r45.on1 on1Var5 = (r45.on1) resp.m75936x14adae67(29);
                    if (on1Var5 != null) {
                        ((mm2.c1) o4Var2.c(cls)).F3 = new mm2.w0(on1Var5.m75945x2fec8307(4), on1Var5.m75939xb282bd08(5));
                    }
                }
                mm2.c1 c1Var = (mm2.c1) o4Var2.c(cls);
                r45.on1 on1Var6 = (r45.on1) resp.m75936x14adae67(29);
                c1Var.P9(linkedList, on1Var6 != null ? on1Var6.m75945x2fec8307(1) : null, i17);
                mm2.l0 l0Var = (mm2.l0) o4Var2.c(mm2.l0.class);
                r45.on1 on1Var7 = (r45.on1) resp.m75936x14adae67(29);
                mm2.i0 i0Var = new mm2.i0(linkedList, on1Var7 != null ? on1Var7.m75945x2fec8307(1) : null, i17);
                r45.on1 on1Var8 = (r45.on1) resp.m75936x14adae67(29);
                l0Var.O6(i0Var, on1Var8 != null ? on1Var8.m75941xfb821914(3) : null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar = o4Var2.f491168u;
                if (owVar != null) {
                    owVar.I1(((mm2.c1) o4Var2.c(cls)).E3.f411002b);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v6 v6Var = o4Var2.f491172y;
                if (v6Var != null) {
                    v6Var.u1(((mm2.c1) o4Var2.c(cls)).E3.f411003c);
                }
                r45.ic1 ic1Var = (r45.ic1) resp.m75936x14adae67(85);
                if (ic1Var != null && (m75941xfb8219143 = ic1Var.m75941xfb821914(14)) != null) {
                    mm2.e1 e1Var = (mm2.e1) o4Var2.c(mm2.e1.class);
                    ae2.in inVar = ae2.in.f85221a;
                    if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.f85428u7).mo141623x754a37bb()).r()).booleanValue()) {
                        java.util.Iterator it = m75941xfb8219143.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj8 = null;
                                break;
                            }
                            obj8 = it.next();
                            if (((r45.p12) obj8).m75939xb282bd08(0) == 2) {
                                break;
                            }
                        }
                        r45.p12 p12Var = (r45.p12) obj8;
                        if (p12Var != null) {
                            int m75939xb282bd08 = p12Var.m75939xb282bd08(3);
                            java.util.regex.Pattern pattern = pm0.v.f438335a;
                            p12Var.set(3, java.lang.Integer.valueOf(m75939xb282bd08 & (-9)));
                        }
                    }
                    e1Var.G = m75941xfb8219143;
                }
                ((mm2.c1) o4Var2.c(cls)).f410336f4.f390582a.clear();
                ((mm2.c1) o4Var2.c(cls)).f410336f4.f390582a.addAll(resp.m75941xfb821914(18));
                ((mm2.c1) o4Var2.c(cls)).f410336f4.f390583b = resp.m75945x2fec8307(17);
                ((mm2.c1) o4Var2.c(cls)).Q8(true);
                r45.ud2 ud2Var = (r45.ud2) resp.m75936x14adae67(81);
                int m75939xb282bd082 = ud2Var != null ? ud2Var.m75939xb282bd08(2) : 0;
                if (dk2.ef.f314917g && !((mm2.c1) o4Var2.c(cls)).Y4 && dk2.ef.f314909c == 0 && m75939xb282bd082 > 0) {
                    dk2.ef.f314909c = m75939xb282bd082;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o4Var2.f491143f, "handleJoinResp restore selectedVideoQualityLevel:" + m75939xb282bd082);
                }
                if (((mm2.e1) o4Var2.c(mm2.e1.class)).f410523t == null) {
                    ((mm2.e1) o4Var2.c(mm2.e1.class)).o7(new kn0.i(trtcParams, liveRoomInfo, new kn0.h("com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI")));
                } else {
                    kn0.i iVar3 = ((mm2.e1) o4Var2.c(mm2.e1.class)).f410523t;
                    if (iVar3 != null) {
                        iVar3.f391090a = trtcParams;
                    }
                    kn0.i iVar4 = ((mm2.e1) o4Var2.c(mm2.e1.class)).f410523t;
                    if (iVar4 != null) {
                        iVar4.f391091b = liveRoomInfo;
                    }
                    kn0.i iVar5 = ((mm2.e1) o4Var2.c(mm2.e1.class)).f410523t;
                    if (iVar5 != null) {
                        iVar5.f391092c = new kn0.h("com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI");
                    }
                }
                kn0.i iVar6 = ((mm2.e1) o4Var2.c(mm2.e1.class)).f410523t;
                if (iVar6 != null) {
                    iVar6.f391094e = java.lang.Long.valueOf(((mm2.e1) o4Var2.c(mm2.e1.class)).f410516m);
                }
                kn0.i iVar7 = ((mm2.e1) o4Var2.c(mm2.e1.class)).f410523t;
                if (iVar7 != null) {
                    in0.q qVar = o4Var2.f101130e;
                    if (qVar != null) {
                        hn0.h.f(qVar, iVar7, false, ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85327k5).mo141623x754a37bb()).r()).intValue() == 0, 2, null);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184112y.f184073b, null, false, false, 14, null);
                    zl2.r4.f555483a.d3(o4Var2.f101130e);
                    in0.q qVar2 = o4Var2.f101130e;
                    if (qVar2 != null) {
                        qVar2.E(new sm2.e0(o4Var2, resp));
                    }
                }
                fm2.a aVar4 = o4Var2.f101128c;
                if (aVar4 != null) {
                    zl2.r4.f555483a.E2(o4Var2.f101142a, aVar4);
                }
                gk2.e eVar = gk2.e.f354004n;
                if (eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r) == null) {
                    in0.q qVar3 = o4Var2.f101130e;
                    j17 = (qVar3 == null || (iVar = qVar3.C) == null || (gVar = iVar.f391091b) == null) ? -1L : gVar.f391068b;
                } else {
                    j17 = nw1Var.m75942xfb822ef2(0);
                }
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.y4 y4Var = ml2.j0.f409116i;
                ml2.k5 k5Var = y4Var.T;
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                java.lang.String q17 = b52.b.q(j17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(q17, "long2UnsignedString(...)");
                k5Var.getClass();
                k5Var.f409187a = q17;
                gk2.e eVar2 = gk2.e.f354004n;
                long j18 = ((mm2.e1) (eVar2 != null ? eVar2.a(mm2.e1.class) : o4Var2.c(mm2.e1.class))).f410516m;
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.k5 k5Var2 = y4Var.T;
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                java.lang.String q18 = b52.b.q(j18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(q18, "long2UnsignedString(...)");
                k5Var2.getClass();
                k5Var2.f409188b = q18;
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                y4Var.T.f409190d = java.lang.System.currentTimeMillis();
                m92.b I1 = g92.a.I1(g92.b.f351302e, false, 1, null);
                int m75939xb282bd083 = I1 != null ? I1.u0().m75939xb282bd08(20) : 0;
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                y4Var.T.f409192f = m75939xb282bd083;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                in0.q qVar4 = o4Var2.f101130e;
                jSONObject.put("liveid", (qVar4 == null || (iVar2 = qVar4.C) == null || (gVar2 = iVar2.f391091b) == null) ? -1L : gVar2.f391068b);
                n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
                long j19 = ((mm2.e1) o4Var2.c(mm2.e1.class)).f410516m;
                ((m30.m) rVar).getClass();
                jSONObject.put("feedid", b52.b.q(j19));
                i95.m c18 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c18;
                ml2.c1 c1Var2 = ml2.c1.f408858e;
                zy2.zb.j5(zbVar, 12L, jSONObject.toString(), null, 4, null);
                ((ml2.j0) i95.n0.c(ml2.j0.class)).nj(ml2.w1.f409708e);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8.f184135d = c01.id.a();
                ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
                java.lang.String valueOf = java.lang.String.valueOf(((mm2.e1) o4Var2.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
                long j27 = ((mm2.c1) o4Var2.c(cls)).Y4 ? 4L : 1L;
                ya2.b2 b17 = ya2.h.f542017a.b(((mm2.c1) o4Var2.c(cls)).f410385o);
                j0Var.Rj(valueOf, j27, b17 != null ? b17.w0() : null, true);
                pm0.v.V(200L, new sm2.f0(o4Var2));
                fm2.a aVar5 = o4Var2.f101128c;
                if (aVar5 != null) {
                    r45.nw1 nw1Var2 = (r45.nw1) resp.m75936x14adae67(3);
                    aVar5.m57731xf11e93b(nw1Var2 != null ? (r45.jy1) nw1Var2.m75936x14adae67(25) : null);
                }
                i95.m c19 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                zy2.zb.I8((zy2.zb) c19, ml2.u1.f409573e, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
                fm2.a aVar6 = o4Var2.f101128c;
                if (aVar6 != null && (dVar = (fy2.d) aVar6.m57635xbba4bfc0(fy2.d.class)) != null) {
                    dVar.Q6(new sm2.l(o4Var2));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var = o4Var2.N;
                if (c4Var != null) {
                    c4Var.G1();
                }
                mm2.c1 c1Var3 = (mm2.c1) o4Var2.c(cls);
                r45.gw0 gw0Var = (r45.gw0) resp.m75936x14adae67(24);
                c1Var3.f410415s5 = gw0Var != null ? gw0Var.m75945x2fec8307(1) : null;
                ((je2.g) o4Var2.c(je2.g.class)).O6();
                zl2.r4.f555483a.u(o4Var2.f101127b, o4Var2.f101142a, o4Var2.f101128c);
                mm2.o4 o4Var3 = (mm2.o4) o4Var2.c(mm2.o4.class);
                r45.wz1 wz1Var = (r45.wz1) resp.m75936x14adae67(4);
                o4Var3.f410867y1 = (wz1Var == null || (vz1Var2 = (r45.vz1) wz1Var.m75936x14adae67(15)) == null) ? 0 : vz1Var2.m75939xb282bd08(2);
                mm2.o4 o4Var4 = (mm2.o4) o4Var2.c(mm2.o4.class);
                r45.wz1 wz1Var2 = (r45.wz1) resp.m75936x14adae67(4);
                o4Var4.f410869z1 = (wz1Var2 == null || (vz1Var = (r45.vz1) wz1Var2.m75936x14adae67(15)) == null) ? 0 : vz1Var.m75939xb282bd08(3);
            } else {
                cls = mm2.c1.class;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
                if (k0Var != null && (m57663xfb7e5820 = k0Var.m57663xfb7e5820()) != null && (c10828x8f239b6e = m57663xfb7e5820.f390662d) != null) {
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).aj(c10828x8f239b6e.f150075m, c10828x8f239b6e.f150070e, c10828x8f239b6e.f150082s);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8 p8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a;
                java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184111x.f184073b;
                r45.l84 l84Var = new r45.l84();
                l84Var.set(1, java.lang.Integer.valueOf(intValue));
                l84Var.set(2, errMsg);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.c(p8Var, str3, hc2.b.a(l84Var), false, true, 4, null);
                if (intValue != -100038 && (g17 = o4Var2.g()) != null) {
                    dk2.xf.f(g17, 0, new sm2.g0(o4Var2), 1, null);
                }
                o4Var2.z(intValue2, intValue, errMsg, null, (r45.qp1) resp.m75936x14adae67(25));
            }
            sm2.o4 o4Var5 = this.f491266d;
            o4Var5.getClass();
            pm0.v.X(new sm2.s3(o4Var5));
            if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.A3).mo141623x754a37bb()).r()).booleanValue() && (aVar = this.f491266d.f101128c) != null) {
                aVar.postDelayed(sm2.s2.f491225d, 3000L);
            }
            if (!((mm2.e1) this.f491266d.c(mm2.e1.class)).g7()) {
                if (pm0.v.z((int) ((mm2.c1) this.f491266d.c(cls)).f410399q, 8192)) {
                    ((mm2.g1) this.f491266d.c(mm2.g1.class)).W6(1);
                } else {
                    ((mm2.g1) this.f491266d.c(mm2.g1.class)).W6(0);
                }
            }
            if (((mm2.e1) this.f491266d.c(mm2.e1.class)).Y6()) {
                pm0.v.X(new sm2.t2(this.f491266d));
            }
        }
        return jz5.f0.f384359a;
    }
}
