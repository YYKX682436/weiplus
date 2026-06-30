package xt1;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f538101d = 0;

    public t(xt1.u uVar, xt1.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f538101d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f538101d;
        this.f538101d = i17 + 1;
        if (i17 == 0) {
            return xt1.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
