package sk;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f490459d = 0;

    public b(sk.c cVar, sk.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f490459d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f490459d;
        this.f490459d = i17 + 1;
        if (i17 == 0) {
            return qv.h2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
