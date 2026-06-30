package c01;

/* loaded from: classes6.dex */
public class s5 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f118986d = 0;

    public s5(c01.t5 t5Var, c01.r5 r5Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118986d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f118986d;
        this.f118986d = i17 + 1;
        if (i17 == 0) {
            return m05.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
