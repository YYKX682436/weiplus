package h90;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f361208d = 0;

    public g(h90.h hVar, h90.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f361208d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f361208d;
        this.f361208d = i17 + 1;
        if (i17 == 0) {
            return g90.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
