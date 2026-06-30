package oo3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f428720d = 0;

    public f(oo3.g gVar, oo3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f428720d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f428720d;
        this.f428720d = i17 + 1;
        if (i17 == 0) {
            return mo3.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
