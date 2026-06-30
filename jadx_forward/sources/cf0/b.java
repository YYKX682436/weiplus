package cf0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f122366d = 0;

    public b(cf0.c cVar, cf0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f122366d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f122366d;
        this.f122366d = i17 + 1;
        if (i17 == 0) {
            return cf0.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
