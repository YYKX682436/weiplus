package um2;

/* loaded from: classes3.dex */
public final class l0 implements hn0.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510394a;

    public l0(um2.x5 x5Var) {
        this.f510394a = x5Var;
    }

    @Override // hn0.i
    /* renamed from: callback */
    public void mo57125xf5bc2045(int i17, android.os.Bundle bundle) {
        co0.s y17;
        mn0.b0 b0Var;
        mm2.e1 e1Var;
        r45.nw1 nw1Var;
        java.lang.Class cls;
        long j17;
        mm2.e1 e1Var2;
        r45.nw1 nw1Var2;
        mm2.c1 c1Var;
        mm2.e1 e1Var3;
        r45.nw1 nw1Var3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p1 p1Var;
        co0.s E;
        mn0.b0 b0Var2;
        mm2.e1 e1Var4;
        r45.nw1 nw1Var4;
        um2.x5 x5Var = this.f510394a;
        boolean z17 = x5Var.f510603r1;
        java.lang.String str = x5Var.f510565f;
        if (z17 && i17 != 2033) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "firstFrameCallback: isPrepareLive callback, eventCode=" + i17);
            if (i17 != 2003 || (E = x5Var.E()) == null || (b0Var2 = E.R1.f363942a) == null) {
                return;
            }
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            java.lang.String str2 = a52.a.f83117l;
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            fm2.c cVar = x5Var.f101139c;
            java.lang.String valueOf = java.lang.String.valueOf(r0Var.Ri((cVar == null || (e1Var4 = (mm2.e1) cVar.m57635xbba4bfc0(mm2.e1.class)) == null || (nw1Var4 = e1Var4.f410521r) == null) ? 0L : nw1Var4.m75942xfb822ef2(0)));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            ((mn0.y) b0Var2).h(str2, valueOf + "_isPrepare", x5Var.f510609t1 > 0 ? android.os.SystemClock.elapsedRealtime() - x5Var.f510609t1 : 0L);
            x5Var.f510609t1 = 0L;
            return;
        }
        if (i17 == 2001) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p1 p1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206791d;
            if (p1Var2 == null) {
                return;
            }
            p1Var2.f206766d = android.os.SystemClock.elapsedRealtime();
            return;
        }
        if (i17 == 2008) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p1 p1Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206791d;
            if (p1Var3 == null) {
                return;
            }
            p1Var3.f206767e = android.os.SystemClock.elapsedRealtime();
            return;
        }
        if (i17 == 2033) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "firstFrameCallback: PLAY_EVT_RENDER_FIRST_FRAME_ON_VIEW, isPrepareLive=" + x5Var.f510603r1);
            if (x5Var.f510603r1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var = x5Var.f510571h;
                if (ob0Var != null && (y17 = ob0Var.y1()) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", "cdnPausePlay");
                    y17.R1.i(true);
                }
                x5Var.f510606s1 = true;
            }
            x5Var.f510603r1 = false;
            x5Var.f510609t1 = 0L;
            return;
        }
        if (i17 != 2003) {
            if (i17 == 2004 && (p1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206791d) != null) {
                p1Var.f206768f = android.os.SystemClock.elapsedRealtime();
                return;
            }
            return;
        }
        ml2.r0 r0Var2 = (ml2.r0) i95.n0.c(ml2.r0.class);
        long m75942xfb822ef2 = ((mm2.e1) x5Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        r0Var2.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#markFirstFrameAvailable " + m75942xfb822ef2);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6513xf93b0bed Ni = r0Var2.Ni(m75942xfb822ef2);
        Ni.f138619e = m75942xfb822ef2;
        if (Ni.f138623i == 0) {
            Ni.f138623i = c01.id.c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r5.f206868a.a();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) x5Var.f101142a.a(mm2.c1.class)).f410379n;
        jz5.f0 f0Var = null;
        java.lang.String m76801x8010e5e4 = c19792x256d2725 != null ? c19792x256d2725.m76801x8010e5e4() : null;
        kn0.i iVar = ((mm2.e1) x5Var.c(mm2.e1.class)).f410523t;
        kn0.g gVar = iVar != null ? iVar.f391091b : null;
        if (gVar != null) {
            gVar.f391082p = m76801x8010e5e4 == null ? "" : m76801x8010e5e4;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1 q1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206788a;
        kn0.i iVar2 = ((mm2.e1) x5Var.c(mm2.e1.class)).f410523t;
        q1Var.d(iVar2 != null ? iVar2.f391091b : null, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "TXLivePlayer:receive first frame");
        ml2.t5 t5Var = ml2.t5.f409553a;
        long m75942xfb822ef22 = ((mm2.e1) x5Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        if (m76801x8010e5e4 == null) {
            m76801x8010e5e4 = "";
        }
        t5Var.b(m75942xfb822ef22, m76801x8010e5e4, 1);
        fm2.c cVar2 = x5Var.f101139c;
        if (cVar2 != null) {
            qo0.c.a(cVar2, qo0.b.f446912l4, null, 2, null);
        }
        um2.m mVar = um2.m.f510406a;
        co0.s E2 = x5Var.E();
        if (E2 != null && (b0Var = E2.R1.f363942a) != null) {
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            java.lang.String str3 = a52.a.f83117l;
            ml2.r0 r0Var3 = (ml2.r0) i95.n0.c(ml2.r0.class);
            fm2.c cVar3 = x5Var.f101139c;
            java.lang.String valueOf2 = java.lang.String.valueOf(r0Var3.Ri((cVar3 == null || (e1Var3 = (mm2.e1) cVar3.m57635xbba4bfc0(mm2.e1.class)) == null || (nw1Var3 = e1Var3.f410521r) == null) ? 0L : nw1Var3.m75942xfb822ef2(0)));
            ml2.q1 q1Var2 = ml2.q1.f409345e;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "temp_2")) {
                fm2.c cVar4 = x5Var.f101139c;
                if (cVar4 == null || (c1Var = (mm2.c1) cVar4.m57635xbba4bfc0(mm2.c1.class)) == null) {
                    cls = je2.z.class;
                    j17 = 0;
                } else {
                    j17 = c1Var.f410448x6;
                    cls = je2.z.class;
                    c1Var.f410448x6 = 0L;
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                r45.qa4 qa4Var = new r45.qa4();
                qa4Var.set(0, "ScrollLive");
                qa4Var.set(1, java.lang.Long.valueOf(j17));
                linkedList.add(qa4Var);
                long elapsedRealtime = j17 > 0 ? android.os.SystemClock.elapsedRealtime() - j17 : 0L;
                mn0.y yVar = (mn0.y) b0Var;
                mn0.k0 l17 = yVar.l();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "firstFrameReport scroll to live:" + elapsedRealtime + ',' + l17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                java.lang.Class cls2 = cls;
                yVar.r(str3, valueOf2, ((je2.z) x5Var.c(cls2)).f380823g, ((je2.z) x5Var.c(cls2)).f380824h);
                yVar.h(str3, valueOf2, elapsedRealtime);
                zl2.q4 q4Var = zl2.q4.f555466a;
                fm2.c cVar5 = x5Var.f101139c;
                q4Var.L(str3, (cVar5 == null || (e1Var2 = (mm2.e1) cVar5.m57635xbba4bfc0(mm2.e1.class)) == null || (nw1Var2 = e1Var2.f410521r) == null) ? 0L : nw1Var2.m75942xfb822ef2(0), valueOf2, elapsedRealtime, linkedList, l17, (r21 & 64) != 0 ? "" : null);
            } else {
                java.util.LinkedList i86 = ((mm2.c1) x5Var.c(mm2.c1.class)).i8();
                mn0.y yVar2 = (mn0.y) b0Var;
                mn0.k0 l18 = yVar2.l();
                zl2.q4 q4Var2 = zl2.q4.f555466a;
                long e17 = q4Var2.e(i86, l18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                yVar2.r(str3, valueOf2, ((je2.z) x5Var.c(je2.z.class)).f380823g, ((je2.z) x5Var.c(je2.z.class)).f380824h);
                yVar2.h(str3, valueOf2, e17);
                fm2.c cVar6 = x5Var.f101139c;
                q4Var2.L(str3, (cVar6 == null || (e1Var = (mm2.e1) cVar6.m57635xbba4bfc0(mm2.e1.class)) == null || (nw1Var = e1Var.f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0), valueOf2, e17, i86, l18, (r21 & 64) != 0 ? "" : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "firstFrameReport businessFirstFrame:" + e17 + ',' + l18);
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "firstFrameReport but player is null!");
        }
    }
}
