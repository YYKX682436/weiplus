package j41;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f379188d = 0;

    public n(j41.o oVar, j41.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f379188d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f379188d;
        this.f379188d = i17 + 1;
        if (i17 == 0) {
            return l41.s2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
