package kq4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f392813d = 0;

    public b(kq4.c cVar, kq4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f392813d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f392813d;
        this.f392813d = i17 + 1;
        if (i17 == 0) {
            return kq4.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
