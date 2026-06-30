package yc0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f542282d = 0;

    public b(yc0.c cVar, yc0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f542282d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f542282d;
        this.f542282d = i17 + 1;
        if (i17 == 0) {
            return wp4.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
