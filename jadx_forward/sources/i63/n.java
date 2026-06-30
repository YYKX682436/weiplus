package i63;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f370549d = 0;

    public n(i63.o oVar, i63.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f370549d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f370549d;
        this.f370549d = i17 + 1;
        if (i17 == 0) {
            return i63.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
