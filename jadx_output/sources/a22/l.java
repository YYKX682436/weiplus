package a22;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f838d = 0;

    public l(a22.m mVar, a22.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f838d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f838d;
        this.f838d = i17 + 1;
        if (i17 == 0) {
            return a22.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
