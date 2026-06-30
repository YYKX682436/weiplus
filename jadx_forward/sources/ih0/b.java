package ih0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f373005d = 0;

    public b(ih0.c cVar, ih0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f373005d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f373005d;
        this.f373005d = i17 + 1;
        if (i17 == 0) {
            return ih0.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
