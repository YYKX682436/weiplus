package he0;

/* loaded from: classes6.dex */
public class d1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f362213d = 0;

    public d1(he0.e1 e1Var, he0.c1 c1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f362213d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f362213d;
        this.f362213d = i17 + 1;
        if (i17 == 0) {
            return he0.u4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
