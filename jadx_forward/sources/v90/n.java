package v90;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f515677d = 0;

    public n(v90.o oVar, v90.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f515677d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f515677d;
        this.f515677d = i17 + 1;
        if (i17 == 0) {
            return u90.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
