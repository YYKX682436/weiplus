package tp1;

/* loaded from: classes13.dex */
public final class i2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public i2() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5810xe7551fe8 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5810xe7551fe8) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.en enVar = event.f136118g;
        if (enVar == null) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f520416a;
        android.app.Activity activity = enVar.f88097a;
        android.content.Intent intent = enVar.f88098b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(intent, "intent");
        long j17 = enVar.f88099c;
        java.util.Iterator it = vp1.b.f520416a.iterator();
        while (it.hasNext()) {
            ((up1.b) it.next()).u(activity, new android.content.Intent(intent), j17);
        }
        return false;
    }
}
