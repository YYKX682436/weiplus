package tp1;

/* loaded from: classes13.dex */
public final class w1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public w1() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5798x1ea1fa0f event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5798x1ea1fa0f) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.tm tmVar = event.f136107g;
        if (tmVar == null) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f520416a;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment = tmVar.f89552a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fragment, "fragment");
        java.lang.String str = tmVar.f89553b;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = tmVar.f89554c;
        java.lang.String str4 = str3 == null ? "" : str3;
        boolean z17 = tmVar.f89555d;
        long j17 = tmVar.f89556e;
        java.util.Iterator it = vp1.b.f520416a.iterator();
        while (it.hasNext()) {
            ((up1.b) it.next()).k(fragment, str2, str4, z17, null, j17);
        }
        return false;
    }
}
