package zy2;

/* loaded from: classes6.dex */
public class i3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f558950d = 0;

    public i3(zy2.j3 j3Var, zy2.h3 h3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f558950d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f558950d;
        this.f558950d = i17 + 1;
        if (i17 == 0) {
            return b92.t2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
