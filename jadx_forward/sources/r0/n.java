package r0;

/* loaded from: classes14.dex */
public final class n extends kz5.o implements p0.c {

    /* renamed from: d, reason: collision with root package name */
    public final r0.d f449515d;

    public n(r0.d map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
        this.f449515d = map;
    }

    @Override // kz5.b, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry element = (java.util.Map.Entry) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(element, "element");
        java.lang.Object key = element.getKey();
        r0.d dVar = this.f449515d;
        java.lang.Object obj2 = dVar.get(key);
        return obj2 != null ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, element.getValue()) : element.getValue() == null && dVar.containsKey(element.getKey());
    }

    @Override // kz5.b
    public int d() {
        r0.d dVar = this.f449515d;
        dVar.getClass();
        return dVar.f449497e;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return new r0.o(this.f449515d.f449496d);
    }
}
