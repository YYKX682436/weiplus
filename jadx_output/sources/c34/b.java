package c34;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f38183d = 0;

    public b(c34.c cVar, c34.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f38183d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f38183d;
        this.f38183d = i17 + 1;
        if (i17 == 0) {
            return c34.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
