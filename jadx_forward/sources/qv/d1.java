package qv;

/* loaded from: classes6.dex */
public class d1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f448380d = 0;

    public d1(qv.e1 e1Var, qv.c1 c1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f448380d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f448380d;
        this.f448380d = i17 + 1;
        if (i17 == 0) {
            return qv.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
