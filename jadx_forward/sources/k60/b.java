package k60;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f386011d = 0;

    public b(k60.c cVar, k60.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f386011d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f386011d;
        this.f386011d = i17 + 1;
        if (i17 == 0) {
            return j60.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
