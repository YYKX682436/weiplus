package p000;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LChangeTranslateLanguageEventListenerProxy;", "Landroidx/lifecycle/x;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ChangeTranslateLanguageEventListenerProxy */
/* loaded from: classes5.dex */
public final class C0000xf9d93516 implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public static final p000.C0000xf9d93516 f81566d = new p000.C0000xf9d93516();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.ArrayList f81567e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public static final android.util.ArraySet f81568f = new android.util.ArraySet();

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f81569g;

    static {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            f81569g = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364>(p000.o.f423203d) { // from class: ChangeTranslateLanguageEventListenerProxy.1
                {
                    this.f39173x3fe91575 = -348375692;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364 c5234x14788364) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364 event = c5234x14788364;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("changeTranslateLanguageEvent callProcessName:");
                    android.util.ArraySet arraySet = p000.C0000xf9d93516.f81568f;
                    sb6.append(arraySet);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.ListenerProxy", sb6.toString());
                    java.util.Iterator it = arraySet.iterator();
                    while (it.hasNext()) {
                        java.lang.String str = (java.lang.String) it.next();
                        android.os.Bundle bundle = new android.os.Bundle();
                        am.z1 z1Var = event.f135568g;
                        bundle.putString("newLanguageCode", z1Var.f90036b);
                        bundle.putString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, z1Var.f90035a);
                        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, bundle, p000.b.f97715d.getClass(), p000.c.f118380d);
                    }
                    return false;
                }
            };
        }
    }

    private C0000xf9d93516() {
    }

    public final synchronized void a(p000.u listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.ListenerProxy", "addOnTranslateLanguageChangeListener listener" + listener);
        java.util.ArrayList arrayList = f81567e;
        arrayList.add(listener);
        if (arrayList.size() == 1) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("processName", bm5.f1.a());
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, bundle, p000.d.f306593d.getClass(), p000.e.f327015d);
        }
    }

    public final synchronized void b(p000.u listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.ListenerProxy", "removeOnTranslateLanguageChangeListener listener" + listener);
        java.util.ArrayList arrayList = f81567e;
        arrayList.remove(listener);
        if (arrayList.size() <= 0) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("processName", bm5.f1.a());
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, bundle, p000.f.f339501d.getClass(), p000.g.f348866d);
        }
    }
}
