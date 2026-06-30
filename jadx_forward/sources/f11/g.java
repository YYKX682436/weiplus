package f11;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f340089d = 0;

    public g(f11.h hVar, f11.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f340089d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f340089d;
        this.f340089d = i17 + 1;
        if (i17 == 0) {
            return f11.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
