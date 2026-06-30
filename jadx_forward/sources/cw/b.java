package cw;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f304132d = 0;

    public b(cw.c cVar, cw.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f304132d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f304132d;
        this.f304132d = i17 + 1;
        if (i17 == 0) {
            return fw.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
