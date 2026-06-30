package ln3;

/* loaded from: classes4.dex */
public final class a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.Object m143895xf1229813;
        j75.f Ai;
        j75.f Ai2;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5219x1606f522 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5219x1606f522) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.j1 j1Var = event.f135552g;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            if (j1Var.f88525a == 7) {
                r45.pq pqVar = new r45.pq();
                pqVar.mo11468x92b714fd(j1Var.f88526b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.BypRedDotNotifyEventListener", "notify from bypNewLife, cmdId: " + pqVar.f464830d + " cmd_id_set: " + pqVar.f464832f + ", bufLen: " + pqVar.f464831e.f273689a.length);
                if ((pqVar.f464830d & 2) > 0 || (pqVar.f464832f & 2) > 0) {
                    r45.oq oqVar = new r45.oq();
                    oqVar.mo11468x92b714fd(pqVar.f464831e.g());
                    int i17 = ra0.y.f475014g1;
                    ra0.y Di = ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Di();
                    if (Di != null && (Ai = ((en3.l0) Di).Ai()) != null) {
                        Ai.B3(new sa0.k(oqVar.f463970d, 1001, 4, 3));
                    }
                }
                if ((pqVar.f464832f & 8) > 0) {
                    int i18 = ra0.y.f475014g1;
                    ra0.y Di2 = ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Di();
                    if (Di2 != null && (Ai2 = ((en3.l0) Di2).Ai()) != null) {
                        Ai2.B3(new sa0.n());
                    }
                }
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 == null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NewLife.BypRedDotNotifyEventListener", m143898xd4a2fc34, "", new java.lang.Object[0]);
        return true;
    }
}
