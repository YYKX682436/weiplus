package k70;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f386152d = 0;

    public b(k70.c cVar, k70.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f386152d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f386152d;
        this.f386152d = i17 + 1;
        if (i17 == 0) {
            return j70.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
