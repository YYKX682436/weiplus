package q12;

/* loaded from: classes6.dex */
public class i1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f441125d = 0;

    public i1(q12.j1 j1Var, q12.h1 h1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f441125d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f441125d;
        this.f441125d = i17 + 1;
        if (i17 == 0) {
            return q12.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
