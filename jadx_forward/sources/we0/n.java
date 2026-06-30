package we0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f526674d = 0;

    public n(we0.o oVar, we0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f526674d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f526674d;
        this.f526674d = i17 + 1;
        if (i17 == 0) {
            return we0.d1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
