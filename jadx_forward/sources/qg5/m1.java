package qg5;

/* loaded from: classes6.dex */
public class m1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f444603d = 0;

    public m1(qg5.n1 n1Var, qg5.l1 l1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f444603d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f444603d;
        this.f444603d = i17 + 1;
        if (i17 == 0) {
            return qg5.m2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
