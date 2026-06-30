package it2;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f376038d = 0;

    public d(it2.e eVar, it2.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f376038d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f376038d;
        this.f376038d = i17 + 1;
        if (i17 == 0) {
            return it2.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
