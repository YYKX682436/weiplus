package c61;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f38985d = 0;

    public g(c61.h hVar, c61.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38985d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f38985d;
        this.f38985d = i17 + 1;
        if (i17 == 0) {
            return c61.b2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
