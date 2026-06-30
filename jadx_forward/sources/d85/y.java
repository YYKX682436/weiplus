package d85;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f308785d = 0;

    public y(d85.z zVar, d85.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f308785d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f308785d;
        this.f308785d = i17 + 1;
        if (i17 == 0) {
            return d85.f1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
