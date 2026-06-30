package p85;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434328d = 0;

    public b(p85.c cVar, p85.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434328d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434328d;
        this.f434328d = i17 + 1;
        if (i17 == 0) {
            return p85.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
