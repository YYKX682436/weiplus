package j70;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f379562d = 0;

    public b(j70.c cVar, j70.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f379562d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f379562d;
        this.f379562d = i17 + 1;
        if (i17 == 0) {
            return j70.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
