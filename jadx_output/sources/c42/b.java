package c42;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f38377d = 0;

    public b(c42.c cVar, c42.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38377d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f38377d;
        this.f38377d = i17 + 1;
        if (i17 == 0) {
            return c42.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
