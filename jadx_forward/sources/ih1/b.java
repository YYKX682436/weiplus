package ih1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f373019d = 0;

    public b(ih1.c cVar, ih1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f373019d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f373019d;
        this.f373019d = i17 + 1;
        if (i17 == 0) {
            return ih1.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
