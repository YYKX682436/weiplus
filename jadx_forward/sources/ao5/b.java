package ao5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f94094d = 0;

    public b(ao5.c cVar, ao5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f94094d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f94094d;
        this.f94094d = i17 + 1;
        if (i17 == 0) {
            return ao5.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
