package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class g6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f280613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h6 f280614e;

    public g6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h6 h6Var, java.util.Map map) {
        this.f280614e = h6Var;
        this.f280613d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = this.f280613d;
        java.util.Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            long longValue = ((java.lang.Long) it.next()).longValue();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(((r45.k55) map.get(java.lang.Long.valueOf(longValue))).f459918d, longValue);
            if (Li.m124847x74d37ac6() == longValue) {
                mp3.j jVar = (mp3.j) i95.n0.c(mp3.j.class);
                java.lang.String j17 = Li.j();
                ((lp3.l) jVar).getClass();
                r45.k55 e17 = bm5.d1.e(j17);
                r45.k55 n07 = this.f280614e.n0((r45.k55) map.get(java.lang.Long.valueOf(longValue)), e17);
                java.util.LinkedList linkedList = n07.f459919e;
                try {
                    if (linkedList.size() > 0) {
                        ((r45.l55) linkedList.getLast()).f460692n = 1;
                    }
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingPatMsgUpdateComponent", e18, "", new java.lang.Object[0]);
                }
                Li.d1(((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).mj(n07));
                Li.m124850x7650bebc(922746929);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(longValue, Li, true);
            }
        }
        map.clear();
    }
}
