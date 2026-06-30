package b83;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f99848d = 0;

    public b(b83.c cVar, b83.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f99848d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f99848d;
        this.f99848d = i17 + 1;
        if (i17 == 0) {
            return b83.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
