package s30;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f483935d = 0;

    public l(s30.m mVar, s30.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f483935d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f483935d;
        this.f483935d = i17 + 1;
        if (i17 == 0) {
            return s30.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
