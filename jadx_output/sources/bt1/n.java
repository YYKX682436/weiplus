package bt1;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f24174d = 0;

    public n(bt1.o oVar, bt1.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24174d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f24174d;
        this.f24174d = i17 + 1;
        if (i17 == 0) {
            return bt1.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
