package ug0;

/* loaded from: classes8.dex */
public final class v extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public v() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5526xf28eaa6d event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5526xf28eaa6d) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.yc ycVar = event.f135852g;
        int i17 = ycVar.f89986a.f65875xb5fc3ab6;
        if (i17 < 500000 || i17 >= 599999) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchRedDotExpirationEventListener", "Received a FinderRedDotExpirationEvent, but not WebSearch-type.");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchRedDotExpirationEventListener", "Received a FinderRedDotExpirationEvent, and it's WebSearch-type.");
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).Zi(new tg0.l2(ycVar.f89986a));
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearchRedDotExpirationEventListener", m143898xd4a2fc34, "", new java.lang.Object[0]);
            }
        }
        return false;
    }
}
