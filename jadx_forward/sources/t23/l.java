package t23;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f496733d = 0;

    public l(t23.m mVar, t23.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f496733d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f496733d;
        this.f496733d = i17 + 1;
        if (i17 == 0) {
            return t23.s0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
