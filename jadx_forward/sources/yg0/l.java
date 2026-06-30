package yg0;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f543741d = 0;

    public l(yg0.m mVar, yg0.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f543741d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f543741d;
        this.f543741d = i17 + 1;
        if (i17 == 0) {
            return yg0.t2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
