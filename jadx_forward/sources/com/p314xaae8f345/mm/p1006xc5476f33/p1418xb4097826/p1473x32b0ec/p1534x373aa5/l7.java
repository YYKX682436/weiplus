package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class l7 implements hh4.j {
    @Override // hh4.j
    public void k0(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c multiTaskInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskInfo, "multiTaskInfo");
        gm0.j1.a();
    }

    @Override // hh4.j
    public void m6(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c multiTaskInfo) {
        java.lang.String m75945x2fec8307;
        java.lang.String m76801x8010e5e4;
        r45.dm2 m76806xdef68064;
        r45.nw1 m76794xd0557130;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskInfo, "multiTaskInfo");
        if (gm0.j1.a()) {
            r45.b22 b22Var = new r45.b22();
            try {
                b22Var.mo11468x92b714fd(multiTaskInfo.f66790x225a93cf);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveMultiTaskHelper", "MegaVideoFloatBallInfo parse fail", th6);
            }
            b22Var.set(0, multiTaskInfo.f66791xc8a07680);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b22Var.m75941xfb821914(9), "getAllHistoryFinderObjectList(...)");
            if (!r4.isEmpty()) {
                arrayList.addAll(b22Var.m75941xfb821914(9));
            } else {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) b22Var.m75936x14adae67(7);
                if (c19792x256d2725 == null) {
                    c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveMultiTaskHelper", "data.finderObject null");
                    c19792x256d2725.m76896xfefec3e9(b22Var.m75945x2fec8307(2));
                    c19792x256d2725.m76877x684351d(b22Var.m75942xfb822ef2(3));
                }
                arrayList.add(c19792x256d2725);
            }
            int b17 = b22Var.m75941xfb821914(9).size() > 0 ? h3.a.b(b22Var.m75939xb282bd08(8), 0, b22Var.m75941xfb821914(9).size() - 1) : 0;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) b22Var.m75936x14adae67(7);
            int m75939xb282bd08 = (c19792x256d27252 == null || (m76794xd0557130 = c19792x256d27252.m76794xd0557130()) == null) ? 0 : m76794xd0557130.m75939xb282bd08(1);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) b22Var.m75936x14adae67(7);
            long m76784x5db1b11 = c19792x256d27253 != null ? c19792x256d27253.m76784x5db1b11() : b22Var.m75942xfb822ef2(3);
            long m75942xfb822ef2 = b22Var.m75942xfb822ef2(1);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27254 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) b22Var.m75936x14adae67(7);
            java.lang.String m75945x2fec83072 = (c19792x256d27254 == null || (m76806xdef68064 = c19792x256d27254.m76806xdef68064()) == null) ? null : m76806xdef68064.m75945x2fec8307(62);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27255 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) b22Var.m75936x14adae67(7);
            if (c19792x256d27255 == null || (m75945x2fec8307 = c19792x256d27255.m76836x6c03c64c()) == null) {
                m75945x2fec8307 = b22Var.m75945x2fec8307(4);
            }
            ml2.x1 x1Var = ml2.x1.f409740n;
            ml2.q1 q1Var = ml2.q1.f409345e;
            zy2.zb.Ng(zbVar, m76784x5db1b11, m75942xfb822ef2, m75945x2fec83072, m75945x2fec8307, b22Var.m75939xb282bd08(8), m75939xb282bd08, x1Var, "temp_15", null, 0, (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) b22Var.m75936x14adae67(7), 768, null);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_MULTI_TASK_INFO", b22Var.mo14344x5f01b1f6());
            r45.wk0 wk0Var = new r45.wk0();
            java.lang.String str = "";
            wk0Var.set(0, "");
            wk0Var.set(1, "");
            wk0Var.set(2, java.lang.Boolean.FALSE);
            wk0Var.set(3, 1010);
            wk0Var.set(4, -1);
            wk0Var.set(5, 1);
            r45.y74 y74Var = new r45.y74();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27256 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) b22Var.m75936x14adae67(7);
            if (c19792x256d27256 != null && (m76801x8010e5e4 = c19792x256d27256.m76801x8010e5e4()) != null) {
                str = m76801x8010e5e4;
            }
            y74Var.set(2, str);
            wk0Var.set(6, y74Var);
            ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            ((vd2.f1) e0Var).Ni(context2, intent, arrayList, b17, wk0Var, null);
        }
    }

    @Override // hh4.j
    public void p0(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c multiTaskInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskInfo, "multiTaskInfo");
        gm0.j1.a();
    }
}
