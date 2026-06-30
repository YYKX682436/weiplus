package zy2;

/* loaded from: classes6.dex */
public class q3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f559072d = 0;

    public q3(zy2.r3 r3Var, zy2.p3 p3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f559072d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f559072d;
        this.f559072d = i17 + 1;
        if (i17 == 0) {
            return au2.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
