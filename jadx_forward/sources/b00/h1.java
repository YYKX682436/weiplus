package b00;

/* loaded from: classes6.dex */
public class h1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f98213d = 0;

    public h1(b00.i1 i1Var, b00.g1 g1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f98213d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f98213d;
        this.f98213d = i17 + 1;
        if (i17 == 0) {
            return b00.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
