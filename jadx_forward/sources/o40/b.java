package o40;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f424346d = 0;

    public b(o40.c cVar, o40.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f424346d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f424346d;
        this.f424346d = i17 + 1;
        if (i17 == 0) {
            return wy2.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
