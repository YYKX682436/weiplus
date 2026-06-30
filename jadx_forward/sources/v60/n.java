package v60;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f514940d = 0;

    public n(v60.o oVar, v60.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f514940d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f514940d;
        this.f514940d = i17 + 1;
        if (i17 == 0) {
            return v60.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
