package uy;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f513420d = 0;

    public f(uy.g gVar, uy.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f513420d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f513420d;
        this.f513420d = i17 + 1;
        if (i17 == 0) {
            return uy.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
