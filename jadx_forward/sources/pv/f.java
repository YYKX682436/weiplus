package pv;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f440022d = 0;

    public f(pv.g gVar, pv.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f440022d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f440022d;
        this.f440022d = i17 + 1;
        if (i17 == 0) {
            return ov.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
