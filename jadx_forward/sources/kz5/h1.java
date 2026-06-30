package kz5;

/* loaded from: classes12.dex */
public final class h1 implements kz5.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f395507d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f395508e;

    public h1(java.util.Map map, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lVar, "default");
        this.f395507d = map;
        this.f395508e = lVar;
    }

    @Override // java.util.Map
    public void clear() {
        this.f395507d.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.f395507d.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        return this.f395507d.containsValue(obj);
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        return this.f395507d.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object obj) {
        return this.f395507d.equals(obj);
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        return this.f395507d.get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f395507d.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f395507d.isEmpty();
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        return this.f395507d.keySet();
    }

    @Override // java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        return this.f395507d.put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(java.util.Map from) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        this.f395507d.putAll(from);
    }

    @Override // java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        return this.f395507d.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f395507d.size();
    }

    /* renamed from: toString */
    public java.lang.String m144670x9616526c() {
        return this.f395507d.toString();
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        return this.f395507d.values();
    }
}
