package on;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f428282d = 0;

    public n(on.o oVar, on.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f428282d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f428282d;
        this.f428282d = i17 + 1;
        if (i17 == 0) {
            return on.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
