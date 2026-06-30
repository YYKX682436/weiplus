package cn3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f125198d = 0;

    public b(cn3.c cVar, cn3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f125198d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f125198d;
        this.f125198d = i17 + 1;
        if (i17 == 0) {
            return cn3.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
