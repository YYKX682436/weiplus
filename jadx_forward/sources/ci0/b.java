package ci0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f123181d = 0;

    public b(ci0.c cVar, ci0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f123181d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f123181d;
        this.f123181d = i17 + 1;
        if (i17 == 0) {
            return pc0.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
