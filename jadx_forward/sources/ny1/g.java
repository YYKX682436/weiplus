package ny1;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f422938d = 0;

    public g(ny1.h hVar, ny1.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f422938d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f422938d;
        this.f422938d = i17 + 1;
        if (i17 == 0) {
            return ny1.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
