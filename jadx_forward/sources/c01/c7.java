package c01;

/* loaded from: classes.dex */
public class c7 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f118620d = 0;

    public c7(c01.d7 d7Var, c01.b7 b7Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f118620d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f118620d;
        this.f118620d = i17 + 1;
        if (i17 == 0) {
            return c01.nd.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
