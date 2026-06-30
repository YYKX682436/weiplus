package pd5;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f435107d = 0;

    public f(pd5.g gVar, pd5.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f435107d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f435107d;
        this.f435107d = i17 + 1;
        if (i17 == 0) {
            return pd5.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
