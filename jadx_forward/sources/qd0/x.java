package qd0;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f443127d = 0;

    public x(qd0.y yVar, qd0.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f443127d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f443127d;
        this.f443127d = i17 + 1;
        if (i17 == 0) {
            return qd0.t0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
