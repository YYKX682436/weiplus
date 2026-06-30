package a41;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f1182d = 0;

    public b(a41.c cVar, a41.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1182d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f1182d;
        this.f1182d = i17 + 1;
        if (i17 == 0) {
            return a41.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
