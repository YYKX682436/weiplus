package o72;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f425055d = 0;

    public y(o72.z zVar, o72.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f425055d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f425055d;
        this.f425055d = i17 + 1;
        if (i17 == 0) {
            return x82.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
