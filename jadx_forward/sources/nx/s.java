package nx;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f422587d = 0;

    public s(nx.t tVar, nx.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f422587d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f422587d;
        this.f422587d = i17 + 1;
        if (i17 == 0) {
            return nx.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
