package zh4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f554501d = 0;

    public b(zh4.c cVar, zh4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f554501d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f554501d;
        this.f554501d = i17 + 1;
        if (i17 == 0) {
            return zh4.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
