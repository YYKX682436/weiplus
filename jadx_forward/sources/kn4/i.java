package kn4;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f391241d = 0;

    public i(kn4.j jVar, kn4.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f391241d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f391241d;
        this.f391241d = i17 + 1;
        if (i17 == 0) {
            return kn4.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
