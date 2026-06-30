package b85;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f99877d = 0;

    public b(b85.c cVar, b85.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f99877d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f99877d;
        this.f99877d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.EnumC4938x817a9eae.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
