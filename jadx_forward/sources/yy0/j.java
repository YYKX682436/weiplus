package yy0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f549690d = 0;

    public j(yy0.k kVar, yy0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f549690d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f549690d;
        this.f549690d = i17 + 1;
        if (i17 == 0) {
            return yy0.p0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
