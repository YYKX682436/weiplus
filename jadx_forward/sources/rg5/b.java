package rg5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f476780d = 0;

    public b(rg5.c cVar, rg5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f476780d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f476780d;
        this.f476780d = i17 + 1;
        if (i17 == 0) {
            return rg5.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
