package sj4;

/* loaded from: classes.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f490419d = 0;

    public r(sj4.s sVar, sj4.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f490419d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f490419d;
        this.f490419d = i17 + 1;
        if (i17 == 0) {
            return sj4.s0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
