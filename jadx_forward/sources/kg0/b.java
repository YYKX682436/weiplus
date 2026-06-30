package kg0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f389204d = 0;

    public b(kg0.c cVar, kg0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f389204d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f389204d;
        this.f389204d = i17 + 1;
        if (i17 == 0) {
            return kg0.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
