package n04;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f415443d = 0;

    public b(n04.c cVar, n04.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f415443d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f415443d;
        this.f415443d = i17 + 1;
        if (i17 == 0) {
            return n04.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
