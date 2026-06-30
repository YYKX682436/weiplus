package p62;

/* loaded from: classes6.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f433964d = 0;

    public o(p62.p pVar, p62.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f433964d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f433964d;
        this.f433964d = i17 + 1;
        if (i17 == 0) {
            return p62.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
