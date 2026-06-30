package ta4;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f498278d = 0;

    public g(ta4.h hVar, ta4.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f498278d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f498278d;
        this.f498278d = i17 + 1;
        if (i17 == 0) {
            return ta4.m1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
