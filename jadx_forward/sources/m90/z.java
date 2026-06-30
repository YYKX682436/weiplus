package m90;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f406472d = 0;

    public z(m90.a0 a0Var, m90.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f406472d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f406472d;
        this.f406472d = i17 + 1;
        if (i17 == 0) {
            return m90.t1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
