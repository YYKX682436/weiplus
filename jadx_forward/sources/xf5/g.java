package xf5;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f535875d = 0;

    public g(xf5.h hVar, xf5.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f535875d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f535875d;
        this.f535875d = i17 + 1;
        if (i17 == 0) {
            return xf5.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
