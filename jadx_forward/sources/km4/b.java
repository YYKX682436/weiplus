package km4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f390803d = 0;

    public b(km4.c cVar, km4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f390803d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f390803d;
        this.f390803d = i17 + 1;
        if (i17 == 0) {
            return km4.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
