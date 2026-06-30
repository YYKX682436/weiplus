package ov;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f430616d = 0;

    public i(ov.j jVar, ov.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f430616d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f430616d;
        this.f430616d = i17 + 1;
        if (i17 == 0) {
            return ov.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
