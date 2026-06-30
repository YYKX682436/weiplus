package y53;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f541003d = 0;

    public b(y53.c cVar, y53.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f541003d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f541003d;
        this.f541003d = i17 + 1;
        if (i17 == 0) {
            return y53.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
