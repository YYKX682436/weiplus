package fb2;

/* loaded from: classes2.dex */
public final class f implements fb2.m {
    @Override // fb2.m
    public boolean a(db2.c3 resp, int i17, int i18) {
        r45.nw1 m76794xd0557130;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        if (resp.d().f309443f <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveIPUrlInterceptor", "onIntercept: error, startRequestTs=" + resp.d().f309443f);
            return false;
        }
        java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(1);
        if (m75941xfb821914 != null) {
            java.util.ArrayList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : m75941xfb821914) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
                if (hc2.o0.j(c19792x256d2725) == 9) {
                    arrayList.add(obj);
                }
            }
            for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 : arrayList) {
                r45.nw1 m76794xd05571302 = c19792x256d27252.m76794xd0557130();
                java.lang.String m75945x2fec8307 = m76794xd05571302 != null ? m76794xd05571302.m75945x2fec8307(3) : null;
                if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0) && (m76794xd0557130 = c19792x256d27252.m76794xd0557130()) != null) {
                    zy2.z7 z7Var = (zy2.z7) i95.n0.c(zy2.z7.class);
                    r45.nw1 m76794xd05571303 = c19792x256d27252.m76794xd0557130();
                    if (m76794xd05571303 == null || (str = m76794xd05571303.m75945x2fec8307(3)) == null) {
                        str = "";
                    }
                    m76794xd0557130.set(3, ((b92.v1) z7Var).Ai("FinderStream", str, resp.d().f309443f));
                }
            }
        }
        return false;
    }

    @Override // fb2.m
    public boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d loadedInfo, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadedInfo, "loadedInfo");
        return false;
    }

    @Override // fb2.m
    public boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d loadedInfo, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadedInfo, "loadedInfo");
        return false;
    }
}
