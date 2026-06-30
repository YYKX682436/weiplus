package vg3;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f518254d = 0;

    public k(vg3.l lVar, vg3.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f518254d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f518254d;
        this.f518254d = i17 + 1;
        if (i17 == 0) {
            return hn.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
