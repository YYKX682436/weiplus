package rd0;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f475765d = 0;

    public v(rd0.w wVar, rd0.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f475765d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f475765d;
        this.f475765d = i17 + 1;
        if (i17 == 0) {
            return qd0.t0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
