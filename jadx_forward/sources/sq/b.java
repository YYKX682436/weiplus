package sq;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f492860d = 0;

    public b(sq.c cVar, sq.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f492860d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f492860d;
        this.f492860d = i17 + 1;
        if (i17 == 0) {
            return t20.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
