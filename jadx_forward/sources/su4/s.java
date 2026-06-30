package su4;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f494620d = 0;

    public s(su4.t tVar, su4.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f494620d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f494620d;
        this.f494620d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.i2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
