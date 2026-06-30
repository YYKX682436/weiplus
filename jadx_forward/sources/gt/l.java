package gt;

/* loaded from: classes.dex */
public class l implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f356789d = 0;

    public l(gt.m mVar, gt.k kVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f356789d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f356789d;
        this.f356789d = i17 + 1;
        if (i17 == 0) {
            return gt.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
