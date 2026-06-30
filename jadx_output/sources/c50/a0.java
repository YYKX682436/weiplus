package c50;

/* loaded from: classes6.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f38590d = 0;

    public a0(c50.b0 b0Var, c50.z zVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38590d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f38590d;
        this.f38590d = i17 + 1;
        if (i17 == 0) {
            return c61.i9.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
