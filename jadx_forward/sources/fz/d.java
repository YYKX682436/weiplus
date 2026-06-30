package fz;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f348802d = 0;

    public d(fz.e eVar, fz.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f348802d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f348802d;
        this.f348802d = i17 + 1;
        if (i17 == 0) {
            return fz.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
