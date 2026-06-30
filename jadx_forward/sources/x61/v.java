package x61;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f533757d = 0;

    public v(x61.w wVar, x61.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f533757d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f533757d;
        this.f533757d = i17 + 1;
        if (i17 == 0) {
            return x61.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
