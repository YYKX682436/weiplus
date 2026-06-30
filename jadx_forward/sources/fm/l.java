package fm;

/* loaded from: classes6.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f345535d = 0;

    public l(fm.m mVar, fm.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f345535d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f345535d;
        this.f345535d = i17 + 1;
        if (i17 == 0) {
            return fm.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
