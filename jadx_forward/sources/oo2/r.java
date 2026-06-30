package oo2;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f428710d = 0;

    public r(oo2.s sVar, oo2.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f428710d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f428710d;
        this.f428710d = i17 + 1;
        if (i17 == 0) {
            return oo2.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
