package e40;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f329155d = 0;

    public n(e40.o oVar, e40.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f329155d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f329155d;
        this.f329155d = i17 + 1;
        if (i17 == 0) {
            return e35.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
