package ws5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f530742d = 0;

    public b(ws5.c cVar, ws5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f530742d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f530742d;
        this.f530742d = i17 + 1;
        if (i17 == 0) {
            return wo2.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
