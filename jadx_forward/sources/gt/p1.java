package gt;

/* loaded from: classes6.dex */
public class p1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f356820d = 0;

    public p1(gt.q1 q1Var, gt.o1 o1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f356820d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f356820d;
        this.f356820d = i17 + 1;
        if (i17 == 0) {
            return gt.z4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
