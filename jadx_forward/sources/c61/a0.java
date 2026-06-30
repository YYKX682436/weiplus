package c61;

/* loaded from: classes6.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f120403d = 0;

    public a0(c61.b0 b0Var, c61.z zVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f120403d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f120403d;
        this.f120403d = i17 + 1;
        if (i17 == 0) {
            return c61.j8.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
