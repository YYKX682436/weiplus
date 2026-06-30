package p05;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f432266d = 0;

    public y(p05.z zVar, p05.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f432266d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f432266d;
        this.f432266d = i17 + 1;
        if (i17 == 0) {
            return p05.v3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
