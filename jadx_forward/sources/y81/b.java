package y81;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f541500d = 0;

    public b(y81.c cVar, y81.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f541500d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f541500d;
        this.f541500d = i17 + 1;
        if (i17 == 0) {
            return y81.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
