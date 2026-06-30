package uy4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f513539d = 0;

    public b(uy4.c cVar, uy4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f513539d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f513539d;
        this.f513539d = i17 + 1;
        if (i17 == 0) {
            return az4.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
