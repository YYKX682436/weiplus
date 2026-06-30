package pv;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f440028d = 0;

    public n(pv.o oVar, pv.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f440028d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f440028d;
        this.f440028d = i17 + 1;
        if (i17 == 0) {
            return ov.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
