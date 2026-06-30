package em3;

/* loaded from: classes8.dex */
public final class u extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public u() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.dj djVar = event.f136013g;
        int i17 = djVar.f88004a;
        if (i17 == 87) {
            if (djVar.f88005b != 1) {
                return false;
            }
            am3.s sVar = (am3.s) i95.n0.c(am3.s.class);
            java.lang.String filePath = djVar.f88006c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filePath, "filePath");
            sVar.Ai(filePath);
            return false;
        }
        if (i17 != 92) {
            return false;
        }
        int i18 = djVar.f88005b;
        if (i18 == 1) {
            am3.s sVar2 = (am3.s) i95.n0.c(am3.s.class);
            java.lang.String filePath2 = djVar.f88006c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filePath2, "filePath");
            sVar2.Bi(filePath2);
            return false;
        }
        if (i18 != 2) {
            return false;
        }
        am3.s sVar3 = (am3.s) i95.n0.c(am3.s.class);
        java.lang.String filePath3 = djVar.f88006c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filePath3, "filePath");
        sVar3.wi(filePath3);
        return false;
    }
}
