package k91;

/* loaded from: classes6.dex */
public class c2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f387088d = 0;

    public c2(k91.d2 d2Var, k91.b2 b2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f387088d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f387088d;
        this.f387088d = i17 + 1;
        if (i17 == 0) {
            return k91.w0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
