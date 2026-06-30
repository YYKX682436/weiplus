package k12;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f384720d = 0;

    public n(k12.o oVar, k12.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f384720d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f384720d;
        this.f384720d = i17 + 1;
        if (i17 == 0) {
            return h12.a0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
