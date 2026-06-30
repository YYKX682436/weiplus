package tp1;

/* loaded from: classes8.dex */
public final class k2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public k2() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5811xe7e12238 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5811xe7e12238) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j()) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f520416a;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (vp1.b.f520417b == null) {
            android.content.Context applicationContext = context.getApplicationContext();
            android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
            if (application != null) {
                vp1.a aVar = new vp1.a();
                vp1.b.f520417b = aVar;
                application.registerActivityLifecycleCallbacks(aVar);
            }
        }
        vp1.i iVar = vp1.i.f520422a;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = vp1.b.f520416a;
        if (copyOnWriteArrayList2.contains(iVar)) {
            return false;
        }
        copyOnWriteArrayList2.add(iVar);
        return false;
    }
}
