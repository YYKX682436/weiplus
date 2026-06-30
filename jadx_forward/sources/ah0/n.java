package ah0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f86298d = 0;

    public n(ah0.o oVar, ah0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f86298d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f86298d;
        this.f86298d = i17 + 1;
        if (i17 == 0) {
            return ah0.h1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
