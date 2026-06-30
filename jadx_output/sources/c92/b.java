package c92;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f39733d = 0;

    public b(c92.c cVar, c92.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f39733d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f39733d;
        this.f39733d = i17 + 1;
        if (i17 == 0) {
            return c92.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
