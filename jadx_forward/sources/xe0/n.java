package xe0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f535290d = 0;

    public n(xe0.o oVar, xe0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f535290d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f535290d;
        this.f535290d = i17 + 1;
        if (i17 == 0) {
            return we0.d1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
