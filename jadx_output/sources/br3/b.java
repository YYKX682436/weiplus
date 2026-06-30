package br3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f23655d = 0;

    public b(br3.c cVar, br3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23655d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f23655d;
        this.f23655d = i17 + 1;
        if (i17 == 0) {
            return br3.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
