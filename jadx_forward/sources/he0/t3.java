package he0;

/* loaded from: classes6.dex */
public class t3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f362344d = 0;

    public t3(he0.u3 u3Var, he0.s3 s3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f362344d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f362344d;
        this.f362344d = i17 + 1;
        if (i17 == 0) {
            return he0.f6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
