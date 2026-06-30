package ft1;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f348048d = 0;

    public u(ft1.v vVar, ft1.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f348048d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f348048d;
        this.f348048d = i17 + 1;
        if (i17 == 0) {
            return ft1.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
