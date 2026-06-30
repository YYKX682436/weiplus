package yy0;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f549963d = 0;

    public z(yy0.a0 a0Var, yy0.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f549963d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f549963d;
        this.f549963d = i17 + 1;
        if (i17 == 0) {
            return yy0.h8.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
