package jh3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f381349d = 0;

    public b(jh3.c cVar, jh3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f381349d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f381349d;
        this.f381349d = i17 + 1;
        if (i17 == 0) {
            return jh3.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
