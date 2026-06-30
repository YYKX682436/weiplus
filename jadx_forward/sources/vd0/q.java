package vd0;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f517022d = 0;

    public q(vd0.r rVar, vd0.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f517022d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f517022d;
        this.f517022d = i17 + 1;
        if (i17 == 0) {
            return vd0.w1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
