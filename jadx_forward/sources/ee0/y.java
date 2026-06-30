package ee0;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f333090d = 0;

    public y(ee0.z zVar, ee0.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f333090d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f333090d;
        this.f333090d = i17 + 1;
        if (i17 == 0) {
            return ee0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
