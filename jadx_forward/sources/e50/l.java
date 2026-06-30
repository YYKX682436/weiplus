package e50;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f331049d = 0;

    public l(e50.m mVar, e50.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f331049d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f331049d;
        this.f331049d = i17 + 1;
        if (i17 == 0) {
            return e50.e1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
