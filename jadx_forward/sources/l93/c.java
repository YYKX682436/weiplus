package l93;

/* loaded from: classes4.dex */
public final class c extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public c() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5219x1606f522 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5219x1606f522) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.j1 j1Var = event.f135552g;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            if (j1Var.f88525a == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BypRedDotNotifyEventListener", "notify from bypFinder");
                r45.pq pqVar = new r45.pq();
                pqVar.mo11468x92b714fd(j1Var.f88526b);
                if (pqVar.f464830d == 1) {
                    r45.nq nqVar = new r45.nq();
                    nqVar.mo11468x92b714fd(pqVar.f464831e.g());
                    ((c61.l7) i95.n0.c(c61.l7.class)).P.e((int) nqVar.f463121d, 11);
                }
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BypRedDotNotifyEventListener", m143898xd4a2fc34, "", new java.lang.Object[0]);
        }
        return true;
    }
}
