package jr2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f382894d = 0;

    public b(jr2.c cVar, jr2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f382894d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f382894d;
        this.f382894d = i17 + 1;
        if (i17 == 0) {
            return jr2.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
