package f70;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f341559d = 0;

    public b(f70.c cVar, f70.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f341559d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f341559d;
        this.f341559d = i17 + 1;
        if (i17 == 0) {
            return h70.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
