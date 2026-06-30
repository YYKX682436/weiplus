package lo0;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f401518a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f401519b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f401520c;

    /* renamed from: d, reason: collision with root package name */
    public final lo0.d f401521d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f401522e;

    public f(java.lang.String collectionId, java.util.List badges) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collectionId, "collectionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(badges, "badges");
        this.f401518a = collectionId;
        this.f401520c = new java.util.ArrayList();
        this.f401521d = new lo0.d(this);
        this.f401522e = new java.util.ArrayList();
        if (!(collectionId.length() > 0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        this.f401519b = d75.b.d(badges, lo0.c.f401509d);
    }

    public final boolean a() {
        return !this.f401520c.isEmpty();
    }

    public final void b() {
        java.util.List list = this.f401520c;
        ((java.util.ArrayList) list).clear();
        java.util.Iterator it = ((java.util.LinkedHashMap) this.f401519b).entrySet().iterator();
        while (it.hasNext()) {
            lo0.b bVar = (lo0.b) ((java.util.Map.Entry) it.next()).getValue();
            boolean b17 = bVar.b();
            lo0.d dVar = this.f401521d;
            if (b17) {
                ((java.util.ArrayList) list).add(bVar);
                bVar.a(dVar);
            } else {
                bVar.c(dVar);
            }
        }
    }
}
