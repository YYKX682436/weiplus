package zo3;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f556394d = 0;

    public l(zo3.m mVar, zo3.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f556394d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f556394d;
        this.f556394d = i17 + 1;
        if (i17 == 0) {
            return zo3.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
