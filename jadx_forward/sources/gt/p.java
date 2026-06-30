package gt;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f356817d = 0;

    public p(gt.q qVar, gt.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f356817d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f356817d;
        this.f356817d = i17 + 1;
        if (i17 == 0) {
            return gt.m3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
