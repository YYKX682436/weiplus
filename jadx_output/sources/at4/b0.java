package at4;

/* loaded from: classes6.dex */
public class b0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f13809d = 0;

    public b0(at4.c0 c0Var, at4.a0 a0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13809d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f13809d;
        this.f13809d = i17 + 1;
        if (i17 == 0) {
            return at4.i1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
