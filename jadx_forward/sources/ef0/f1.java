package ef0;

/* loaded from: classes6.dex */
public class f1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f333740d = 0;

    public f1(ef0.g1 g1Var, ef0.e1 e1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f333740d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f333740d;
        this.f333740d = i17 + 1;
        if (i17 == 0) {
            return ef0.m4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
