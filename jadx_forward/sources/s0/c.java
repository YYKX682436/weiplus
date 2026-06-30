package s0;

/* loaded from: classes13.dex */
public class c implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f483378d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f483379e;

    /* renamed from: f, reason: collision with root package name */
    public int f483380f;

    public c(java.lang.Object obj, java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
        this.f483378d = obj;
        this.f483379e = map;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f483380f < this.f483379e.size();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj = this.f483378d;
        this.f483380f++;
        java.lang.Object obj2 = this.f483379e.get(obj);
        if (obj2 != null) {
            this.f483378d = ((s0.a) obj2).f483373b;
            return obj;
        }
        throw new java.util.ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
