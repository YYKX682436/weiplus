package q12;

/* loaded from: classes6.dex */
public class a3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f441076d = 0;

    public a3(q12.b3 b3Var, q12.z2 z2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f441076d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f441076d;
        this.f441076d = i17 + 1;
        if (i17 == 0) {
            return q12.x3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
