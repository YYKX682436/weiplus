package cf0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f40848d = 0;

    public n(cf0.o oVar, cf0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f40848d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f40848d;
        this.f40848d = i17 + 1;
        if (i17 == 0) {
            return cf0.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
