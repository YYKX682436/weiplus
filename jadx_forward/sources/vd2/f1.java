package vd2;

@j95.b
/* loaded from: classes3.dex */
public final class f1 extends i95.w implements ss5.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f517258d = "Finder.FinderEnterLiveFeatureService";

    public jz5.l Ai(java.util.ArrayList data, so2.j5 clickFeed) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickFeed, "clickFeed");
        return zl2.l.f555398a.d(data, clickFeed, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Bi(android.content.Context context, android.content.Intent intent, java.lang.String anchorUserName, im5.b bVar, java.lang.Object finderLiveBundle, ss5.d0 d0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUserName, "anchorUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderLiveBundle, "finderLiveBundle");
        if ((anchorUserName.length() == 0) == true || !(finderLiveBundle instanceof dk2.x4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f517258d, "enterLiveC2 anchorUserName is empty");
            return;
        }
        dk2.x4 x4Var = (dk2.x4) finderLiveBundle;
        r45.ta4 ta4Var = x4Var.B;
        if (ta4Var == null) {
            ta4Var = new r45.ta4();
        }
        x4Var.B = ta4Var;
        java.util.LinkedList m75941xfb821914 = ta4Var.m75941xfb821914(20);
        if (m75941xfb821914 != null) {
            r45.qa4 qa4Var = new r45.qa4();
            qa4Var.set(0, "EnterLive");
            qa4Var.set(1, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
            m75941xfb821914.add(qa4Var);
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = intent;
        pq5.g l17 = new ek2.y0(anchorUserName, null, 2, 0 == true ? 1 : 0).l();
        l17.f(bVar);
        if (bVar != null) {
            l17.f(bVar);
        }
        l17.K(new vd2.b1(d0Var, context, this, intent2, finderLiveBundle));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Di(android.content.Context context, android.content.Intent intent, java.lang.String anchorUserName, im5.b bVar, r45.wk0 enterLiveParams, ss5.d0 d0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUserName, "anchorUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterLiveParams, "enterLiveParams");
        if (anchorUserName.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f517258d, "enterLiveC1 anchorUserName is empty");
            return;
        }
        zl2.l lVar = zl2.l.f555398a;
        lVar.f(enterLiveParams);
        lVar.g(enterLiveParams, "enterLiveC1");
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        pq5.g l17 = new ek2.y0(anchorUserName, null, 2, 0 == true ? 1 : 0).l();
        if (bVar != null) {
            l17.f(bVar);
        }
        l17.K(new vd2.z0(d0Var, context, this, intent2, enterLiveParams, intent));
    }

    public void Ni(android.content.Context context, android.content.Intent intent, java.util.List feedList, int i17, r45.wk0 enterLiveParams, ss5.d0 d0Var) {
        r45.nw1 m76794xd0557130;
        java.lang.String m75945x2fec8307;
        int i18 = i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedList, "feedList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterLiveParams, "enterLiveParams");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(feedList);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) kz5.n0.a0(arrayList, i18);
        boolean isEmpty = arrayList.isEmpty();
        java.lang.String str = this.f517258d;
        if (isEmpty || arrayList.size() < i18 || c19792x256d2725 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "feeds size:" + arrayList.size() + ", curPos:" + i18);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enterLiveA feeds size:");
        sb6.append(arrayList.size());
        sb6.append(", curPos:");
        sb6.append(i18);
        sb6.append(", feedId:");
        sb6.append(pm0.v.u(c19792x256d2725.m76784x5db1b11()));
        sb6.append(", liveId:");
        r45.nw1 m76794xd05571302 = c19792x256d2725.m76794xd0557130();
        int i19 = 0;
        sb6.append(pm0.v.u(m76794xd05571302 != null ? m76794xd05571302.m75942xfb822ef2(0) : 0L));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            arrayList.clear();
            arrayList.add(c19792x256d2725);
            if (sl2.h.f490784a.c(context, c19792x256d2725)) {
                return;
            } else {
                i18 = 0;
            }
        }
        zl2.l lVar = zl2.l.f555398a;
        lVar.f(enterLiveParams);
        lVar.g(enterLiveParams, "enterLiveA");
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        java.lang.String m76836x6c03c64c = c19792x256d2725.m76836x6c03c64c();
        int i27 = 8;
        if (!(m76836x6c03c64c == null || m76836x6c03c64c.length() == 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19792x256d2725.m76836x6c03c64c(), xy2.c.e(context))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "enterLiveA anchor");
            r45.nw1 m76794xd05571303 = c19792x256d2725.m76794xd0557130();
            if (m76794xd05571303 != null) {
                intent2.putExtra("KEY_PARAMS_SOURCE_TYPE", m76794xd05571303.m75939xb282bd08(12));
            }
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
            r45.nw1 m76794xd05571304 = c19792x256d2725.m76794xd0557130();
            java.lang.Long valueOf = java.lang.Long.valueOf(m76794xd05571304 != null ? m76794xd05571304.m75942xfb822ef2(0) : 0L);
            java.lang.String m76803x6c285d75 = c19792x256d2725.m76803x6c285d75();
            java.lang.String str2 = m76803x6c285d75 == null ? "" : m76803x6c285d75;
            java.lang.String m75945x2fec83072 = enterLiveParams.m75945x2fec8307(0);
            java.lang.String str3 = m75945x2fec83072 == null ? "" : m75945x2fec83072;
            java.lang.String m76829x97edf6c0 = c19792x256d2725.m76829x97edf6c0();
            r45.y74 y74Var = (r45.y74) enterLiveParams.m75936x14adae67(6);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).oj(intent2, context, m76784x5db1b11, valueOf, str2, "", str3, m76829x97edf6c0, (y74Var == null || (m75945x2fec8307 = y74Var.m75945x2fec8307(8)) == null) ? "" : m75945x2fec8307);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q5 q5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q5();
        q5Var.f206801a = java.lang.System.currentTimeMillis();
        q5Var.f206806f = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r5.f206869b = q5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206791d = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206789b = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206790c = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206792e = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206794g = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p1 p1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p1();
        p1Var.f206763a = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206791d = p1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206789b = 1L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206790c = 1L;
        p1Var.f206764b = 0L;
        p1Var.f206765c = 0L;
        p1Var.f206766d = 0L;
        p1Var.f206767e = 0L;
        p1Var.f206768f = 0L;
        s40.w0 w0Var2 = (s40.w0) i95.n0.c(s40.w0.class);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) kz5.n0.a0(arrayList, i18);
        if (c19792x256d27252 != null && (m76794xd0557130 = c19792x256d27252.m76794xd0557130()) != null) {
            r8 = m76794xd0557130.m75942xfb822ef2(0);
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var2).Bk(r8);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (java.lang.Object obj : arrayList) {
            int i28 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            int i29 = i27;
            com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e c17 = zl2.l.c(lVar, (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj, 0, false, 6, null);
            if (i19 == i18) {
                if (c17.f150079p0 == null) {
                    c17.f150079p0 = new r45.v74();
                }
                r45.v74 v74Var = c17.f150079p0;
                if (v74Var != null) {
                    v74Var.set(2, (r45.u74) enterLiveParams.m75936x14adae67(i29));
                }
            }
            arrayList2.add(c17);
            i19 = i28;
            i27 = i29;
        }
        Ui(i18, arrayList2, enterLiveParams, intent2, c19792x256d2725, d0Var, context);
    }

    public void Ri(android.content.Context context, android.content.Intent intent, r45.m84 feedInfo, boolean z17, r45.wk0 enterLiveParams, ss5.d0 d0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedInfo, "feedInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterLiveParams, "enterLiveParams");
        if (feedInfo.m75942xfb822ef2(0) == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f517258d, "enterLiveB params invalid, feedInfo.objectId:" + feedInfo.m75942xfb822ef2(0) + ", feedInfo.liveId:" + feedInfo.m75942xfb822ef2(1));
            return;
        }
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveDataTransferUtil", "LiveFeedInfo.logInfo enterLiveB, objectId: " + pm0.v.u(feedInfo.m75942xfb822ef2(0)) + ", liveId: " + pm0.v.u(feedInfo.m75942xfb822ef2(1)) + ", nonceId: " + feedInfo.m75945x2fec8307(2) + ", anchorUsername: " + feedInfo.m75945x2fec8307(3) + ", desc: " + feedInfo.m75945x2fec8307(5) + ", sessionBuffer: " + feedInfo.m75945x2fec8307(4) + ", ");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveFeedInfo.logInfo enterLiveB, backupLiveInfo : ");
        r45.nw1 nw1Var = (r45.nw1) feedInfo.m75936x14adae67(6);
        sb6.append(nw1Var != null ? nw1Var.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveDataTransferUtil", sb6.toString());
        zl2.l lVar = zl2.l.f555398a;
        lVar.f(enterLiveParams);
        lVar.g(enterLiveParams, "enterLiveB");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, p3325xe03a0797.p3326xc267989b.a1.UNDISPATCHED, new vd2.x0(intent, feedInfo, mo168058x74219ae7, context, this, d0Var, enterLiveParams, null), 1, null);
    }

    public final void Ui(int i17, java.util.List list, r45.wk0 wk0Var, android.content.Intent intent, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, ss5.d0 d0Var, android.content.Context context) {
        r45.nw1 m76794xd0557130;
        zl2.l lVar = zl2.l.f555398a;
        dk2.x4 a17 = lVar.a(wk0Var);
        a17.f315848i = i17;
        long j17 = 0;
        a17.A = c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L;
        a17.f315851l.addAll(list);
        if (c19792x256d2725 != null && (m76794xd0557130 = c19792x256d2725.m76794xd0557130()) != null) {
            j17 = m76794xd0557130.m75942xfb822ef2(0);
        }
        lVar.e(a17, i17, j17, intent);
        i95.m c17 = i95.n0.c(c61.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.zb zbVar = (c61.zb) c17;
        java.lang.String m75945x2fec8307 = wk0Var.m75945x2fec8307(0);
        java.lang.String str = m75945x2fec8307 == null ? "" : m75945x2fec8307;
        java.lang.String m75945x2fec83072 = wk0Var.m75945x2fec8307(1);
        int N8 = c61.zb.N8(zbVar, context, a17, str, m75945x2fec83072 == null ? "" : m75945x2fec83072, intent, wk0Var.m75933x41a8a7f2(2), null, 64, null);
        if (N8 == 0) {
            if (d0Var != null) {
                d0Var.a();
            }
        } else if (d0Var != null) {
            d0Var.mo125864x428b6afc(N8);
        }
    }

    public boolean wi(android.content.Context context, boolean z17) {
        boolean z18 = !((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        if (!z18 && z17 && context != null) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
        }
        return z18;
    }
}
