package l93;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f398825d = 0;

    public n(l93.o oVar, l93.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f398825d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f398825d;
        this.f398825d = i17 + 1;
        if (i17 == 0) {
            return l93.m0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
