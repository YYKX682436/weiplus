package ob0;

/* loaded from: classes6.dex */
public class g2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f425441d = 0;

    public g2(ob0.h2 h2Var, ob0.f2 f2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f425441d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f425441d;
        this.f425441d = i17 + 1;
        if (i17 == 0) {
            return cr0.b5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
