package h55;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f360630d = 0;

    public b(h55.c cVar, h55.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f360630d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f360630d;
        this.f360630d = i17 + 1;
        if (i17 == 0) {
            return h55.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
