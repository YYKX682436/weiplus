package ib3;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f371733d = 0;

    public n(ib3.o oVar, ib3.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f371733d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f371733d;
        this.f371733d = i17 + 1;
        if (i17 == 0) {
            return ib3.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
