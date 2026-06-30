package mt;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f412697d = 0;

    public b(mt.c cVar, mt.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f412697d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f412697d;
        this.f412697d = i17 + 1;
        if (i17 == 0) {
            return mt.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
