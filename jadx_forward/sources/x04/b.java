package x04;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f532713d = 0;

    public b(x04.c cVar, x04.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f532713d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f532713d;
        this.f532713d = i17 + 1;
        if (i17 == 0) {
            return x04.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
