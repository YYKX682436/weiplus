package zy2;

/* loaded from: classes6.dex */
public class g4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f558923d = 0;

    public g4(zy2.h4 h4Var, zy2.f4 f4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f558923d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f558923d;
        this.f558923d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.nj0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
