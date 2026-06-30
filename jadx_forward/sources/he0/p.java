package he0;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f362311d = 0;

    public p(he0.q qVar, he0.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f362311d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f362311d;
        this.f362311d = i17 + 1;
        if (i17 == 0) {
            return he0.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
