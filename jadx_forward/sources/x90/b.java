package x90;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f534143d = 0;

    public b(x90.c cVar, x90.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f534143d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f534143d;
        this.f534143d = i17 + 1;
        if (i17 == 0) {
            return x90.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
