package a03;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f81926d = 0;

    public b(a03.c cVar, a03.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f81926d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f81926d;
        this.f81926d = i17 + 1;
        if (i17 == 0) {
            return a03.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
