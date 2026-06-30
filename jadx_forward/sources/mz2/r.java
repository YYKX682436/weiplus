package mz2;

/* loaded from: classes6.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f414704d = 0;

    public r(mz2.s sVar, mz2.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f414704d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f414704d;
        this.f414704d = i17 + 1;
        if (i17 == 0) {
            return mz2.l2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
