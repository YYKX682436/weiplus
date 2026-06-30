package as1;

/* loaded from: classes11.dex */
public final class a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a() {
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
            if (j1Var.f88525a == 9 && yw.h1.f547865a.n()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BypListenRedDotNotifyEventListener", "BypBizRedDotNotifyEventListener callback. notify from bypBiz dataSize = " + j1Var.f88526b.length);
                yw.q3.f547970a.d();
                try {
                    r01.l1 l1Var = (r01.l1) i95.n0.c(r01.l1.class);
                    byte[] data = j1Var.f88526b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(data, "data");
                    l1Var.getClass();
                    l1Var.Ni().f(data);
                    l1Var.Ri().f(data);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BypListenRedDotNotifyEventListener", e17, "BypBizRedDotNotifyEventListener callback. error!", new java.lang.Object[0]);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BypListenRedDotNotifyEventListener", m143898xd4a2fc34, "", new java.lang.Object[0]);
        return true;
    }
}
