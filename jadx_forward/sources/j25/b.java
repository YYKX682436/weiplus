package j25;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f378841d = 0;

    public b(j25.c cVar, j25.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f378841d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f378841d;
        this.f378841d = i17 + 1;
        if (i17 == 0) {
            return j25.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
