package dh4;

/* loaded from: classes.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f314065d = 0;

    public g(dh4.h hVar, dh4.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f314065d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f314065d;
        this.f314065d = i17 + 1;
        if (i17 == 0) {
            return dh4.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
