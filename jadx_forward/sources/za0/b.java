package za0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f552398d = 0;

    public b(za0.c cVar, za0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f552398d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f552398d;
        this.f552398d = i17 + 1;
        if (i17 == 0) {
            return za0.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
