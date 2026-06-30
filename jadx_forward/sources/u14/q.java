package u14;

/* loaded from: classes10.dex */
public final class q extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public q() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6230x485f3fc9 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6230x485f3fc9) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.String str = event.f136477g.f89866a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "Voip_Init")) {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).getClass();
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "Voip_End")) {
            return false;
        }
        ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).getClass();
        return false;
    }
}
