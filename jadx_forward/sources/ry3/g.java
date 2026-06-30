package ry3;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f483052d = 0;

    public g(ry3.h hVar, ry3.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f483052d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f483052d;
        this.f483052d = i17 + 1;
        if (i17 == 0) {
            return jd0.p2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
