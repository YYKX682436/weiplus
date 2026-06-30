package d73;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f308419d = 0;

    public f(d73.g gVar, d73.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f308419d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f308419d;
        this.f308419d = i17 + 1;
        if (i17 == 0) {
            return c73.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
