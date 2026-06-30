package b00;

/* loaded from: classes6.dex */
public class b2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f98178d = 0;

    public b2(b00.c2 c2Var, b00.a2 a2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f98178d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f98178d;
        this.f98178d = i17 + 1;
        if (i17 == 0) {
            return b00.y2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
