package he0;

/* loaded from: classes6.dex */
public class h3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f362249d = 0;

    public h3(he0.i3 i3Var, he0.g3 g3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f362249d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f362249d;
        this.f362249d = i17 + 1;
        if (i17 == 0) {
            return he0.z5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
