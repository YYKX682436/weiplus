package gq0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f356009d = 0;

    public b(gq0.c cVar, gq0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f356009d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f356009d;
        this.f356009d = i17 + 1;
        if (i17 == 0) {
            return fq0.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
