package tp1;

/* loaded from: classes13.dex */
public final class e2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public e2() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5802xc87826c6 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5802xc87826c6) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.xm xmVar = event.f136111g;
        if (xmVar == null) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f520416a;
        java.lang.String activity = xmVar.f89918b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activity, "activity");
        int i17 = xmVar.f89920d;
        long j17 = xmVar.f89919c;
        int i18 = xmVar.f89917a;
        java.util.Iterator it = vp1.b.f520416a.iterator();
        while (it.hasNext()) {
            ((up1.b) it.next()).G(activity, i17, j17, i18);
        }
        return false;
    }
}
