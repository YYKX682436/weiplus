package vb0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f515997d = 0;

    public f(vb0.g gVar, vb0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f515997d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f515997d;
        this.f515997d = i17 + 1;
        if (i17 == 0) {
            return pc0.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
