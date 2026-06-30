package f31;

/* loaded from: classes9.dex */
public final class b implements o31.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f31.b f340802a = new f31.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.WeakHashMap f340803b = new java.util.WeakHashMap();

    @Override // o31.a
    public int a(o31.d rr6, o31.b bVar, o31.e scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        o31.c cVar = (o31.c) rr6;
        lVar.f152197a = cVar.f424200b;
        lVar.f152198b = cVar.f424201c;
        lVar.f152199c = cVar.f424203e;
        lVar.f152200d = cVar.f424202d;
        com.p314xaae8f345.mm.p944x882e457a.m1 b17 = com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.h0.b(lVar.a(), null, new f31.a(rr6, bVar, scene), null);
        if (b17 == null) {
            return 0;
        }
        java.util.WeakHashMap weakHashMap = f340803b;
        synchronized (weakHashMap) {
        }
        return 0;
    }

    public final void b(o31.e eVar) {
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var;
        if (eVar == null) {
            return;
        }
        java.util.WeakHashMap weakHashMap = f340803b;
        synchronized (weakHashMap) {
            m1Var = (com.p314xaae8f345.mm.p944x882e457a.m1) weakHashMap.remove(eVar);
        }
        if (m1Var != null) {
            com.p314xaae8f345.mm.p944x882e457a.z2.b(m1Var);
        }
    }
}
