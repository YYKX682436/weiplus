package o52;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f424629d = 0;

    public b(o52.c cVar, o52.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f424629d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f424629d;
        this.f424629d = i17 + 1;
        if (i17 == 0) {
            return o52.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
