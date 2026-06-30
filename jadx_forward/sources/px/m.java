package px;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f440287d = 0;

    public m(px.n nVar, px.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f440287d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f440287d;
        this.f440287d = i17 + 1;
        if (i17 == 0) {
            return px.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
