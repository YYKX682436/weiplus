package mz2;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f414674d = 0;

    public j(mz2.k kVar, mz2.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f414674d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f414674d;
        this.f414674d = i17 + 1;
        if (i17 == 0) {
            return mz2.t0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
