package aq1;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f94609d = 0;

    public p(aq1.q qVar, aq1.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f94609d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f94609d;
        this.f94609d = i17 + 1;
        if (i17 == 0) {
            return aq1.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
