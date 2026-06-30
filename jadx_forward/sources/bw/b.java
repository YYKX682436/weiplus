package bw;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f106297d = 0;

    public b(bw.c cVar, bw.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f106297d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f106297d;
        this.f106297d = i17 + 1;
        if (i17 == 0) {
            return zv.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
