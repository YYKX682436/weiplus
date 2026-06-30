package uy4;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f513542d = 0;

    public f(uy4.g gVar, uy4.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f513542d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f513542d;
        this.f513542d = i17 + 1;
        if (i17 == 0) {
            return ty4.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
