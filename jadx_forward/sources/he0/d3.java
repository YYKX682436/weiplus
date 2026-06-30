package he0;

/* loaded from: classes6.dex */
public class d3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f362216d = 0;

    public d3(he0.e3 e3Var, he0.c3 c3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f362216d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f362216d;
        this.f362216d = i17 + 1;
        if (i17 == 0) {
            return he0.x5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
