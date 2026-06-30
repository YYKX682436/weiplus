package oh1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f426718d = 0;

    public b(oh1.c cVar, oh1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f426718d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f426718d;
        this.f426718d = i17 + 1;
        if (i17 == 0) {
            return oh1.w0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
