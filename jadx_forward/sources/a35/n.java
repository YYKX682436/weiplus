package a35;

/* loaded from: classes.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f82611d = 0;

    public n(a35.o oVar, a35.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f82611d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f82611d;
        this.f82611d = i17 + 1;
        if (i17 == 0) {
            return a35.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
