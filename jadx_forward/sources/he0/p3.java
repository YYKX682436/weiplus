package he0;

/* loaded from: classes6.dex */
public class p3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f362317d = 0;

    public p3(he0.q3 q3Var, he0.o3 o3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f362317d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f362317d;
        this.f362317d = i17 + 1;
        if (i17 == 0) {
            return he0.d6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
