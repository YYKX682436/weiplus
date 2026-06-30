package fk5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f345186d = 0;

    public b(fk5.c cVar, fk5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f345186d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f345186d;
        this.f345186d = i17 + 1;
        if (i17 == 0) {
            return fk5.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
