package zh1;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f554487d = 0;

    public y(zh1.z zVar, zh1.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f554487d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f554487d;
        this.f554487d = i17 + 1;
        if (i17 == 0) {
            return zh1.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
