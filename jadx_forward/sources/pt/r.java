package pt;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f439712d = 0;

    public r(pt.s sVar, pt.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f439712d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f439712d;
        this.f439712d = i17 + 1;
        if (i17 == 0) {
            return ot.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
