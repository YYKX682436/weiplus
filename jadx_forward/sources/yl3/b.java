package yl3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f544624d = 0;

    public b(yl3.c cVar, yl3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f544624d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f544624d;
        this.f544624d = i17 + 1;
        if (i17 == 0) {
            return zl3.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
