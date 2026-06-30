package qd0;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f443077d = 0;

    public l(qd0.m mVar, qd0.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f443077d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f443077d;
        this.f443077d = i17 + 1;
        if (i17 == 0) {
            return qd0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
