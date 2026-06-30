package ab0;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f2700d = 0;

    public g(ab0.h hVar, ab0.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2700d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f2700d;
        this.f2700d = i17 + 1;
        if (i17 == 0) {
            return za0.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
