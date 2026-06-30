package ba0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f18673d = 0;

    public b(ba0.c cVar, ba0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f18673d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f18673d;
        this.f18673d = i17 + 1;
        if (i17 == 0) {
            return ba0.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
