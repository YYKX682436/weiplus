package e81;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f331609d = 0;

    public b(e81.c cVar, e81.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f331609d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f331609d;
        this.f331609d = i17 + 1;
        if (i17 == 0) {
            return e81.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
