package px;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f440293d = 0;

    public u(px.v vVar, px.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f440293d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f440293d;
        this.f440293d = i17 + 1;
        if (i17 == 0) {
            return px.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
