package c63;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f120997d = 0;

    public b(c63.c cVar, c63.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f120997d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f120997d;
        this.f120997d = i17 + 1;
        if (i17 == 0) {
            return c63.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
