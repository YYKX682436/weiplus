package bx1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f36297d = 0;

    public b(bx1.c cVar, bx1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36297d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f36297d;
        this.f36297d = i17 + 1;
        if (i17 == 0) {
            return vh4.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
