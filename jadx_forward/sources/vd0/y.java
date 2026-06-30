package vd0;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f517068d = 0;

    public y(vd0.z zVar, vd0.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f517068d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f517068d;
        this.f517068d = i17 + 1;
        if (i17 == 0) {
            return vd0.f2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
