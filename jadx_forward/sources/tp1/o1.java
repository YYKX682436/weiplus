package tp1;

/* loaded from: classes13.dex */
public final class o1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public o1() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5786xf8301d6c event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5786xf8301d6c) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.jm jmVar = event.f136097g;
        if (jmVar == null) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f520416a;
        android.app.Activity activity = jmVar.f88582a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activity, "activity");
        android.content.Intent intent = jmVar.f88583b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(intent, "intent");
        long j17 = jmVar.f88584c;
        java.util.Iterator it = vp1.b.f520416a.iterator();
        while (it.hasNext()) {
            ((up1.b) it.next()).p(activity, new android.content.Intent(intent), j17);
        }
        return false;
    }
}
