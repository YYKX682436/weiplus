package f25;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f340622d = 0;

    public b(f25.c cVar, f25.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f340622d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f340622d;
        this.f340622d = i17 + 1;
        if (i17 == 0) {
            return h25.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
