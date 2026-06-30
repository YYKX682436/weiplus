package vf0;

/* loaded from: classes6.dex */
public class e1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f517686d = 0;

    public e1(vf0.f1 f1Var, vf0.d1 d1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f517686d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f517686d;
        this.f517686d = i17 + 1;
        if (i17 == 0) {
            return vf0.z2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
