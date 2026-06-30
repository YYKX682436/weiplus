package af0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f4446d = 0;

    public b(af0.c cVar, af0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4446d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f4446d;
        this.f4446d = i17 + 1;
        if (i17 == 0) {
            return af0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
