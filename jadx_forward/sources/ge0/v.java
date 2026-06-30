package ge0;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f352453d = 0;

    public v(ge0.w wVar, ge0.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f352453d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f352453d;
        this.f352453d = i17 + 1;
        if (i17 == 0) {
            return ge0.n0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
