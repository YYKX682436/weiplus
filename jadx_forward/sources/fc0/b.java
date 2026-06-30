package fc0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f342464d = 0;

    public b(fc0.c cVar, fc0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f342464d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f342464d;
        this.f342464d = i17 + 1;
        if (i17 == 0) {
            return br3.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
