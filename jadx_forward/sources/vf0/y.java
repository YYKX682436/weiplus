package vf0;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f517836d = 0;

    public y(vf0.z zVar, vf0.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f517836d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f517836d;
        this.f517836d = i17 + 1;
        if (i17 == 0) {
            return vf0.o1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
