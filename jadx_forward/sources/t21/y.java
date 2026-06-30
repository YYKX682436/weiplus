package t21;

/* loaded from: classes.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f496596d = 0;

    public y(t21.z zVar, t21.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f496596d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f496596d;
        this.f496596d = i17 + 1;
        if (i17 == 0) {
            return t21.s2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
