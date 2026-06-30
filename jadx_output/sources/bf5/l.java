package bf5;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f19729d = 0;

    public l(bf5.m mVar, bf5.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19729d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f19729d;
        this.f19729d = i17 + 1;
        if (i17 == 0) {
            return bf5.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
