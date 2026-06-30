package ah0;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f86337d = 0;

    public z(ah0.a0 a0Var, ah0.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f86337d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f86337d;
        this.f86337d = i17 + 1;
        if (i17 == 0) {
            return ah0.v1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
