package ve4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f517645d = 0;

    public b(ve4.c cVar, ve4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f517645d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f517645d;
        this.f517645d = i17 + 1;
        if (i17 == 0) {
            return ue4.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
