package ab1;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f2738d = 0;

    public s(ab1.t tVar, ab1.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2738d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f2738d;
        this.f2738d = i17 + 1;
        if (i17 == 0) {
            return ab1.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
