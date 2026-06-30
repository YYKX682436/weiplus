package v61;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f515001d = 0;

    public p(v61.q qVar, v61.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f515001d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f515001d;
        this.f515001d = i17 + 1;
        if (i17 == 0) {
            return v61.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
