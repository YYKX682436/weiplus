package xy;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f539650d = 0;

    public b(xy.c cVar, xy.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f539650d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f539650d;
        this.f539650d = i17 + 1;
        if (i17 == 0) {
            return at3.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
