package h90;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f361217d = 0;

    public s(h90.t tVar, h90.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f361217d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f361217d;
        this.f361217d = i17 + 1;
        if (i17 == 0) {
            return g90.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
