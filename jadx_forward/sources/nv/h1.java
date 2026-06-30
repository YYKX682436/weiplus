package nv;

/* loaded from: classes6.dex */
public class h1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f421869d = 0;

    public h1(nv.i1 i1Var, nv.g1 g1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f421869d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f421869d;
        this.f421869d = i17 + 1;
        if (i17 == 0) {
            return nv.h3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
