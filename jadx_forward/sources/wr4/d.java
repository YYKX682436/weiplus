package wr4;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f530468d = 0;

    public d(wr4.e eVar, wr4.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f530468d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f530468d;
        this.f530468d = i17 + 1;
        if (i17 == 0) {
            return wr4.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
