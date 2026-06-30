package ki3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f389649d = 0;

    public b(ki3.c cVar, ki3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f389649d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f389649d;
        this.f389649d = i17 + 1;
        if (i17 == 0) {
            return ji3.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
