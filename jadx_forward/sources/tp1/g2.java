package tp1;

/* loaded from: classes13.dex */
public final class g2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public g2() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5804xa8b7c663 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5804xa8b7c663) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.zm zmVar = event.f136113g;
        if (zmVar == null) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f520416a;
        android.app.Activity activity = zmVar.f90124a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activity, "activity");
        boolean z17 = zmVar.f90125b;
        long j17 = zmVar.f90126c;
        java.util.Iterator it = vp1.b.f520416a.iterator();
        while (it.hasNext()) {
            ((up1.b) it.next()).i(activity, z17, null, j17);
        }
        return false;
    }
}
