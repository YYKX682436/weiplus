package zy;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f558826d = 0;

    public g(zy.h hVar, zy.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f558826d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f558826d;
        this.f558826d = i17 + 1;
        if (i17 == 0) {
            return yy.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
