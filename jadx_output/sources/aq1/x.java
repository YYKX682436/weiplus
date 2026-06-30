package aq1;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f13098d = 0;

    public x(aq1.y yVar, aq1.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13098d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f13098d;
        this.f13098d = i17 + 1;
        if (i17 == 0) {
            return aq1.o1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
