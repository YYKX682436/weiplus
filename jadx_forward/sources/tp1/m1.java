package tp1;

/* loaded from: classes13.dex */
public final class m1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public m1() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5785x30fc06b9 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5785x30fc06b9) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.im imVar = event.f136096g;
        if (imVar == null) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f520416a;
        android.app.Activity activity = imVar.f88493a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activity, "activity");
        long j17 = imVar.f88494b;
        java.util.Iterator it = vp1.b.f520416a.iterator();
        while (it.hasNext()) {
            ((up1.b) it.next()).B(activity, null, j17);
        }
        return false;
    }
}
