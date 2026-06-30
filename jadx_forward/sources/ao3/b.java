package ao3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f94079d = 0;

    public b(ao3.c cVar, ao3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f94079d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f94079d;
        this.f94079d = i17 + 1;
        if (i17 == 0) {
            return ao3.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
