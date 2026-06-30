package xa2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f534306d = 0;

    public b(xa2.c cVar, xa2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f534306d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f534306d;
        this.f534306d = i17 + 1;
        if (i17 == 0) {
            return wa2.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
