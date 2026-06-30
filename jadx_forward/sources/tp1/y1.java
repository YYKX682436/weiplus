package tp1;

/* loaded from: classes13.dex */
public final class y1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public y1() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5799x221755cf event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5799x221755cf) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.um umVar = event.f136108g;
        if (umVar == null) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f520416a;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment = umVar.f89639a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fragment, "fragment");
        long j17 = umVar.f89640b;
        java.util.Iterator it = vp1.b.f520416a.iterator();
        while (it.hasNext()) {
            ((up1.b) it.next()).z(fragment, null, j17);
        }
        return false;
    }
}
