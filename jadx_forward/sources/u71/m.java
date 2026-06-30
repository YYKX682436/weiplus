package u71;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f506639d = 0;

    public m(u71.n nVar, u71.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f506639d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f506639d;
        this.f506639d = i17 + 1;
        if (i17 == 0) {
            return u71.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
