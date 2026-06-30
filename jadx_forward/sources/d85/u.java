package d85;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f308778d = 0;

    public u(d85.v vVar, d85.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f308778d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f308778d;
        this.f308778d = i17 + 1;
        if (i17 == 0) {
            return d85.h1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
