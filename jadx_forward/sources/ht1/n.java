package ht1;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f366331d = 0;

    public n(ht1.o oVar, ht1.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f366331d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f366331d;
        this.f366331d = i17 + 1;
        if (i17 == 0) {
            return ht1.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
