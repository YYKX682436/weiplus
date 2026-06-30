package k12;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f384711d = 0;

    public b(k12.c cVar, k12.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f384711d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f384711d;
        this.f384711d = i17 + 1;
        if (i17 == 0) {
            return h12.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
