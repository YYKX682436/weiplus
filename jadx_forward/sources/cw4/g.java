package cw4;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f305752d = 0;

    public g(cw4.h hVar, cw4.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f305752d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f305752d;
        this.f305752d = i17 + 1;
        if (i17 == 0) {
            return cw4.u0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
