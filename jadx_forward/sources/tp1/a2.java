package tp1;

/* loaded from: classes13.dex */
public final class a2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a2() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5800xa2e7a513 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5800xa2e7a513) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.vm vmVar = event.f136109g;
        if (vmVar == null || (componentCallbacksC1101xa17d4670 = vmVar.f89735a) == null) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f520416a;
        long j17 = vmVar.f89736b;
        java.util.Iterator it = vp1.b.f520416a.iterator();
        while (it.hasNext()) {
            ((up1.b) it.next()).a(componentCallbacksC1101xa17d4670, null, j17);
        }
        return false;
    }
}
