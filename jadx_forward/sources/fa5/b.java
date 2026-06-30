package fa5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f342327d = 0;

    public b(fa5.c cVar, fa5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f342327d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f342327d;
        this.f342327d = i17 + 1;
        if (i17 == 0) {
            return fa5.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
