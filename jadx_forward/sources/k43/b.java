package k43;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f385594d = 0;

    public b(k43.c cVar, k43.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f385594d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f385594d;
        this.f385594d = i17 + 1;
        if (i17 == 0) {
            return k43.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
