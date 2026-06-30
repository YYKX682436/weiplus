package g31;

/* loaded from: classes9.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final k31.a f349662a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f349664c;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f349663b = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f349665d = new java.util.LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f349666e = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f349667f = new g31.x(this);

    public y(k31.a aVar) {
        this.f349662a = aVar;
    }

    public static final void a(g31.y yVar) {
        if (yVar.f349664c) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (g31.r rVar : ((java.util.LinkedHashMap) yVar.f349663b).values()) {
            if (rVar.f349643c == g31.s.f349645d) {
                arrayList.add(rVar);
                if (arrayList.size() >= 10) {
                    break;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        yVar.f349664c = true;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((g31.r) it.next()).f349641a);
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            g31.r rVar2 = (g31.r) it6.next();
            rVar2.getClass();
            rVar2.f349643c = g31.s.f349646e;
            rVar2.f349642b = java.lang.System.currentTimeMillis();
        }
        new l31.n(yVar.f349662a, arrayList2, new g31.w(yVar, arrayList2)).run();
    }
}
