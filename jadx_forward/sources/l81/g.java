package l81;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f398595d = 0;

    public g(l81.h hVar, l81.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f398595d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f398595d;
        this.f398595d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
