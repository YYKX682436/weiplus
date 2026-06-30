package nf3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f418366d = 0;

    public b(nf3.c cVar, nf3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f418366d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f418366d;
        this.f418366d = i17 + 1;
        if (i17 == 0) {
            return lf3.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
