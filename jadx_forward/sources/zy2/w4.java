package zy2;

/* loaded from: classes6.dex */
public class w4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f559136d = 0;

    public w4(zy2.x4 x4Var, zy2.v4 v4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f559136d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f559136d;
        this.f559136d = i17 + 1;
        if (i17 == 0) {
            return ml2.m0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
