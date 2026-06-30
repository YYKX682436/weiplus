package jm;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f381759d = 0;

    public b(jm.c cVar, jm.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f381759d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f381759d;
        this.f381759d = i17 + 1;
        if (i17 == 0) {
            return jm.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
