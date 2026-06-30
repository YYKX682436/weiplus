package so3;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f492284d = 0;

    public g(so3.h hVar, so3.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f492284d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f492284d;
        this.f492284d = i17 + 1;
        if (i17 == 0) {
            return so3.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
