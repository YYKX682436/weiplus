package kj0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f389815d = 0;

    public b(kj0.c cVar, kj0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f389815d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f389815d;
        this.f389815d = i17 + 1;
        if (i17 == 0) {
            return kj0.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
