package ot;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f429877d = 0;

    public z(ot.a0 a0Var, ot.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f429877d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f429877d;
        this.f429877d = i17 + 1;
        if (i17 == 0) {
            return ot.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
