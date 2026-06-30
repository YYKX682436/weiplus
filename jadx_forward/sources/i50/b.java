package i50;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f369984d = 0;

    public b(i50.c cVar, i50.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f369984d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f369984d;
        this.f369984d = i17 + 1;
        if (i17 == 0) {
            return h50.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
