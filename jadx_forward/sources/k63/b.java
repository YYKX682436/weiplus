package k63;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f386062d = 0;

    public b(k63.c cVar, k63.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f386062d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f386062d;
        this.f386062d = i17 + 1;
        if (i17 == 0) {
            return k63.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
