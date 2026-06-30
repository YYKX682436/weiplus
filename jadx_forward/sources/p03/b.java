package p03;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f431957d = 0;

    public b(p03.c cVar, p03.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f431957d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f431957d;
        this.f431957d = i17 + 1;
        if (i17 == 0) {
            return p03.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
