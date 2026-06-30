package px;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f440296d = 0;

    public y(px.z zVar, px.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f440296d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f440296d;
        this.f440296d = i17 + 1;
        if (i17 == 0) {
            return px.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
