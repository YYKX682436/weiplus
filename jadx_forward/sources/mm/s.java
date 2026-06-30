package mm;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f410072d = 0;

    public s(mm.t tVar, mm.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f410072d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f410072d;
        this.f410072d = i17 + 1;
        if (i17 == 0) {
            return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
