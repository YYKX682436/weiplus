package wp1;

/* loaded from: classes15.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f529912a = new java.util.LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f529913b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f529914c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f529915d;

    public final r45.f83 a(java.lang.String eventId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        wp1.a aVar = (wp1.a) ((java.util.LinkedHashMap) this.f529912a).get(java.lang.Integer.valueOf(this.f529913b));
        if (aVar == null) {
            return null;
        }
        int b17 = vp1.j.f520433a.b(eventId);
        java.util.Iterator it = aVar.f529911b.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            r45.f83 f83Var = (r45.f83) it.next();
            if (f83Var.f455624m == b17) {
                return f83Var;
            }
        }
        return null;
    }

    public final r45.f83 b() {
        wp1.a aVar = (wp1.a) ((java.util.LinkedHashMap) this.f529912a).get(java.lang.Integer.valueOf(this.f529913b));
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }
}
