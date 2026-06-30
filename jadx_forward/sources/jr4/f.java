package jr4;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f382936d = 0;

    public f(jr4.g gVar, jr4.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f382936d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f382936d;
        this.f382936d = i17 + 1;
        if (i17 == 0) {
            return jr4.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
