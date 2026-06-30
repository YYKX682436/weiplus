package o25;

/* loaded from: classes6.dex */
public class h1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f424064d = 0;

    public h1(o25.i1 i1Var, o25.g1 g1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f424064d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f424064d;
        this.f424064d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
