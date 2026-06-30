package f55;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f341301d = 0;

    public b(f55.c cVar, f55.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f341301d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f341301d;
        this.f341301d = i17 + 1;
        if (i17 == 0) {
            return e55.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
