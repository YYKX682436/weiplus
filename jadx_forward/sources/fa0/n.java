package fa0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f342194d = 0;

    public n(fa0.o oVar, fa0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f342194d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f342194d;
        this.f342194d = i17 + 1;
        if (i17 == 0) {
            return fa0.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
