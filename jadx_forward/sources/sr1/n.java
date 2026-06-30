package sr1;

/* loaded from: classes.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f493011d = 0;

    public n(sr1.o oVar, sr1.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f493011d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f493011d;
        this.f493011d = i17 + 1;
        if (i17 == 0) {
            return sr1.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
