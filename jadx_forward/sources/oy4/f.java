package oy4;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f431600d = 0;

    public f(oy4.g gVar, oy4.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f431600d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f431600d;
        this.f431600d = i17 + 1;
        if (i17 == 0) {
            return oy4.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
