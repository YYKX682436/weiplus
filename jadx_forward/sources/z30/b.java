package z30;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f551393d = 0;

    public b(z30.c cVar, z30.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f551393d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f551393d;
        this.f551393d = i17 + 1;
        if (i17 == 0) {
            return y30.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
