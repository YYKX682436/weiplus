package fb2;

/* loaded from: classes2.dex */
public abstract class l {
    public static final java.lang.String a(r45.ww2 ww2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ww2Var, "<this>");
        return pm0.v.u(ww2Var.m75942xfb822ef2(14)) + '_' + ww2Var.m75942xfb822ef2(0) + '_' + ww2Var.m75939xb282bd08(7) + '_' + ww2Var.m75941xfb821914(4).size() + '_' + ww2Var.m75945x2fec8307(2) + '_' + ww2Var.m75945x2fec8307(1) + '_' + ww2Var.m75945x2fec8307(13);
    }

    public static final so2.j5 b(r45.ww2 ww2Var, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ww2Var, "<this>");
        cu2.t tVar = cu2.u.f303974a;
        java.util.LinkedList m75941xfb821914 = ww2Var.m75941xfb821914(4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : m75941xfb821914) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
            if (hc2.o0.C(c19792x256d2725)) {
                arrayList.add(obj);
            }
        }
        java.util.List j17 = tVar.j(arrayList, hc2.d0.d(i17), null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(j17, 10));
        java.util.Iterator it = ((java.util.ArrayList) j17).iterator();
        while (it.hasNext()) {
            arrayList2.add(cu2.u.f303974a.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next()));
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(arrayList2);
        if (ww2Var.m75939xb282bd08(7) != 1) {
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).qk(ww2Var.m75942xfb822ef2(14), null, hc2.d0.b(i17), ww2Var.m75945x2fec8307(15), (r20 & 16) != 0 ? 0L : 0L, (r20 & 32) != 0 ? null : null);
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys(ww2Var, ww2Var.m75939xb282bd08(7), linkedList);
        }
        so2.i1 i1Var = new so2.i1(ww2Var);
        for (so2.j1 j1Var : i1Var.f()) {
            i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18;
            long mo2128x1ed62e84 = j1Var.mo2128x1ed62e84();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = j1Var.f491972d;
            r45.dm2 m76806xdef68064 = c19792x256d27252.m76806xdef68064();
            o3Var.qk(mo2128x1ed62e84, m76806xdef68064 != null ? m76806xdef68064.m75945x2fec8307(62) : null, hc2.d0.b(i17), c19792x256d27252.m76829x97edf6c0(), (r20 & 16) != 0 ? 0L : 0L, (r20 & 32) != 0 ? null : null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HandleLayoutInfoInterceptor", "[updateLiveList] tabType:" + i17 + ", live list:" + i1Var);
        if (i1Var.f().size() > 0) {
            return i1Var;
        }
        return null;
    }

    public static final so2.j5 c(r45.yw2 yw2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yw2Var, "<this>");
        int m75939xb282bd08 = yw2Var.m75939xb282bd08(2);
        if (m75939xb282bd08 == 1 || m75939xb282bd08 == 2) {
            return new so2.c2(yw2Var);
        }
        if (m75939xb282bd08 == 6) {
            return new so2.h4(yw2Var);
        }
        if (m75939xb282bd08 == 14) {
            return new so2.l3(yw2Var);
        }
        switch (m75939xb282bd08) {
            case 8:
            case 9:
            case 10:
            case 11:
                return new so2.j4(yw2Var);
            default:
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.km(yw2Var);
        }
    }
}
