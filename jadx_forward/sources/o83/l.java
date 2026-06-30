package o83;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f425194d = 0;

    public l(o83.m mVar, o83.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f425194d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f425194d;
        this.f425194d = i17 + 1;
        if (i17 == 0) {
            return o83.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
