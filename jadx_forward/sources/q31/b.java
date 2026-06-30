package q31;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f441442d = 0;

    public b(q31.c cVar, q31.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f441442d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f441442d;
        this.f441442d = i17 + 1;
        if (i17 == 0) {
            return ko.b.INSTANCE;
        }
        if (i17 == 1) {
            return bf5.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
