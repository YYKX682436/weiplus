package qt0;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final qt0.b f448024a = new qt0.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f448025b = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f448026c = "MicroMsg.DBIndexRegistry";

    public final boolean a(java.lang.String str) {
        java.util.Set set = f448025b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) set).iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((qt0.e) next).f448032d, str)) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                qt0.e eVar = (qt0.e) it6.next();
                if (!((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) eVar.f448034f).mo141623x754a37bb()).getBoolean(eVar.f448035g, false)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void b(qt0.e task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        ((java.util.concurrent.CopyOnWriteArraySet) f448025b).add(task);
    }

    public final boolean c(yz5.a aVar) {
        int i17 = java.util.Calendar.getInstance().get(11);
        boolean z17 = 1 <= i17 && i17 <= 7;
        java.lang.String str = f448026c;
        if (z17) {
            ((ku5.t0) ku5.t0.f394148d).h(new qt0.a(aVar), str);
        }
        return z17;
    }
}
