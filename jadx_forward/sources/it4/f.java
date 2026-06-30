package it4;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f376123d = 0;

    public f(it4.g gVar, it4.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f376123d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f376123d;
        this.f376123d = i17 + 1;
        if (i17 == 0) {
            return it4.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
