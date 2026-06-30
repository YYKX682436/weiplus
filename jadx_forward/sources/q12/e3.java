package q12;

/* loaded from: classes6.dex */
public class e3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f441100d = 0;

    public e3(q12.f3 f3Var, q12.d3 d3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f441100d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f441100d;
        this.f441100d = i17 + 1;
        if (i17 == 0) {
            return q12.a4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
