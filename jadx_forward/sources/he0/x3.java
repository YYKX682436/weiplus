package he0;

/* loaded from: classes6.dex */
public class x3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f362371d = 0;

    public x3(he0.y3 y3Var, he0.w3 w3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f362371d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f362371d;
        this.f362371d = i17 + 1;
        if (i17 == 0) {
            return he0.h6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
