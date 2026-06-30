package vf0;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f517809d = 0;

    public u(vf0.v vVar, vf0.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f517809d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f517809d;
        this.f517809d = i17 + 1;
        if (i17 == 0) {
            return vf0.m1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
